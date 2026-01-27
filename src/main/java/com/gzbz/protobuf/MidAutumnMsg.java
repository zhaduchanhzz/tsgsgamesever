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

public final class MidAutumnMsg {
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MidAutumnMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fMidAutumn.proto\u0012\u001bmidAutumn.com.gzbz.protobuf\u001a\fcommon.proto\".\n\nTaskFinish\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bfinishCount\u0018\u0002 \u0002(\u0005\"\u0010\n\u000eC2S_Main_15101\"\u0098\u0002\n\u000eS2C_Main_15102\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nenterCount\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rgotSiteReward\u0018\u0003 \u0003(\u0005\u0012\f\n\u0004tier\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005enjoy\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nfinishShow\u0018\u0006 \u0003(\u0005\u0012\u0013\n\u000bgotRewardId\u0018\u0007 \u0003(\u0005\u0012\u0014\n\ftierRewardId\u0018\b \u0003(\u0005\u0012\u001a\n\u0004task\u0018\t \u0003(\u000b2\f.common.Task\u0012\u0014\n\ffirstBanquet\u0018\n \u0002(\b\u0012\u000f\n\u0007gotWalk\u0018\u000b \u0002(\b\u0012\u0016\n\u000esignReceiveIds\u0018\f \u0003(\u0005\u0012\u0017\n\u000factivityOpenDay\u0018\r \u0002(\u0005\"5\n\u0015C2S_ExitBanquet_15105\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\"_\n\u0015S2C_ExitBanquet_15106\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nenterCount\u0018\u0003 \u0002(\u0005\u0012\u0014\n\ffirstBanquet\u0018\u0004 \u0002(\b\"\"\n\u0014C2S_PlayFinish_15107\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_PlayFinish_15108\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"2\n\u0014S2C_TaskNotify_15110\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"&\n\u0014C2S_TaskReward_15111\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_TaskReward_15112\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_WalkReward_15113\"'\n\u0014S2C_WalkReward_15114\u0012\u000f\n\u0007gotWalk\u0018\u0001 \u0002(\b\"$\n\u0013C2S_PrayEnjoy_15115\u0012\r\n\u0005enjoy\u0018\u0001 \u0002(\u0005\"$\n\u0013S2C_PrayEnjoy_15116\u0012\r\n\u0005enjoy\u0018\u0001 \u0002(\u0005\"\u001f\n\u000eC2S_Pray_15117\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"g\n\u000eS2C_Pray_15118\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004tier\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005enjoy\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bgotRewardId\u0018\u0004 \u0003(\u0005\u0012\u0014\n\ftierRewardId\u0018\u0005 \u0003(\u0005\"\u0017\n\u0015C2S_SignReceive_15119\"+\n\u0015S2C_SignReceive_15120\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_15121\"D\n\u0017S2C_ShopAddUpInfo_15122\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\".\n C2S_ReceiveShopAddUpReward_15123\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_15124\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_15125\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_15126\"×\u0001\n\u0016S2C_LuckDrawInfo_15127\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_15128\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_15129\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_15130\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_15131\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_15132\"S\n\u0014S2C_DrawRecord_15133\u0012;\n\bmyRecord\u0018\u0001 \u0003(\u000b2).midAutumn.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_15134\"a\n\u001aS2C_ServerDrawRecord_15135\u0012C\n\fserverRecord\u0018\u0001 \u0003(\u000b2-.midAutumn.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005B#\n\u0011com.gzbz.protobufB\fMidAutumnMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor, new String[]{"Day", "FinishCount"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor, new String[]{"Day", "EnterCount", "GotSiteReward", "Tier", "Enjoy", "FinishShow", "GotRewardId", "TierRewardId", "Task", "FirstBanquet", "GotWalk", "SignReceiveIds", "ActivityOpenDay"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor, new String[]{"Score", "Guest"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor, new String[]{"Score", "Guest", "EnterCount", "FirstBanquet"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor, new String[]{"Task"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor, new String[]{"TaskId"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor, new String[]{"TaskId"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor, new String[]{"GotWalk"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor, new String[]{"Enjoy"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor, new String[]{"Enjoy"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor, new String[]{"Count"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor, new String[]{"Count", "Tier", "Enjoy", "GotRewardId", "TierRewardId"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor, new String[]{"ReceiveIds"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor, new String[]{"DailyRecharge", "GotRewards"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor, new String[]{"TargetId"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor, new String[]{"Result", "TargetId"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor, new String[]{"Type"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor, new String[]{"MyRecord"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor, new String[]{"ServerRecord"});
      internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
      CommonMsg.getDescriptor();
   }

   public static final class TaskFinish extends GeneratedMessageV3 implements TaskFinishOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      public static final int FINISHCOUNT_FIELD_NUMBER = 2;
      private int finishCount_;
      private byte memoizedIsInitialized;
      private static final TaskFinish DEFAULT_INSTANCE = new TaskFinish();
      /** @deprecated */
      @Deprecated
      public static final Parser<TaskFinish> PARSER = new AbstractParser<TaskFinish>() {
         public TaskFinish parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TaskFinish(input, extensionRegistry);
         }
      };

      private TaskFinish(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TaskFinish() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TaskFinish();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TaskFinish(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.finishCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskFinish.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public boolean hasFinishCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFinishCount() {
         return this.finishCount_;
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
         } else if (!this.hasFinishCount()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.finishCount_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.finishCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TaskFinish)) {
            return super.equals(obj);
         } else {
            TaskFinish other = (TaskFinish)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (this.hasFinishCount() != other.hasFinishCount()) {
               return false;
            } else if (this.hasFinishCount() && this.getFinishCount() != other.getFinishCount()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasFinishCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFinishCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TaskFinish parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data);
      }

      public static TaskFinish parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskFinish parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data);
      }

      public static TaskFinish parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskFinish parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data);
      }

      public static TaskFinish parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskFinish)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskFinish parseFrom(InputStream input) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskFinish parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskFinish parseDelimitedFrom(InputStream input) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TaskFinish parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskFinish parseFrom(CodedInputStream input) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskFinish parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskFinish)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TaskFinish prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TaskFinish getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TaskFinish> parser() {
         return PARSER;
      }

      public Parser<TaskFinish> getParserForType() {
         return PARSER;
      }

      public TaskFinish getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TaskFinishOrBuilder {
         private int bitField0_;
         private int day_;
         private int finishCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskFinish.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.TaskFinish.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            this.finishCount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_TaskFinish_descriptor;
         }

         public TaskFinish getDefaultInstanceForType() {
            return MidAutumnMsg.TaskFinish.getDefaultInstance();
         }

         public TaskFinish build() {
            TaskFinish result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TaskFinish buildPartial() {
            TaskFinish result = new TaskFinish(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.finishCount_ = this.finishCount_;
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
            if (other instanceof TaskFinish) {
               return this.mergeFrom((TaskFinish)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TaskFinish other) {
            if (other == MidAutumnMsg.TaskFinish.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (other.hasFinishCount()) {
                  this.setFinishCount(other.getFinishCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDay()) {
               return false;
            } else {
               return this.hasFinishCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TaskFinish parsedMessage = null;

            try {
               parsedMessage = (TaskFinish)MidAutumnMsg.TaskFinish.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TaskFinish)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Main_15101 extends GeneratedMessageV3 implements C2S_Main_15101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_15101 DEFAULT_INSTANCE = new C2S_Main_15101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_15101> PARSER = new AbstractParser<C2S_Main_15101>() {
         public C2S_Main_15101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_15101(input, extensionRegistry);
         }
      };

      private C2S_Main_15101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_15101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_15101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_15101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_15101)) {
            return super.equals(obj);
         } else {
            C2S_Main_15101 other = (C2S_Main_15101)obj;
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

      public static C2S_Main_15101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data);
      }

      public static C2S_Main_15101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data);
      }

      public static C2S_Main_15101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data);
      }

      public static C2S_Main_15101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15101 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_15101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_15101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_15101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_15101> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_15101> getParserForType() {
         return PARSER;
      }

      public C2S_Main_15101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_15101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_Main_15101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15101_descriptor;
         }

         public C2S_Main_15101 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_Main_15101.getDefaultInstance();
         }

         public C2S_Main_15101 build() {
            C2S_Main_15101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_15101 buildPartial() {
            C2S_Main_15101 result = new C2S_Main_15101(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Main_15101) {
               return this.mergeFrom((C2S_Main_15101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_15101 other) {
            if (other == MidAutumnMsg.C2S_Main_15101.getDefaultInstance()) {
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
            C2S_Main_15101 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_15101)MidAutumnMsg.C2S_Main_15101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_15101)e.getUnfinishedMessage();
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

   public static final class S2C_Main_15102 extends GeneratedMessageV3 implements S2C_Main_15102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      public static final int ENTERCOUNT_FIELD_NUMBER = 2;
      private int enterCount_;
      public static final int GOTSITEREWARD_FIELD_NUMBER = 3;
      private Internal.IntList gotSiteReward_;
      public static final int TIER_FIELD_NUMBER = 4;
      private int tier_;
      public static final int ENJOY_FIELD_NUMBER = 5;
      private int enjoy_;
      public static final int FINISHSHOW_FIELD_NUMBER = 6;
      private Internal.IntList finishShow_;
      public static final int GOTREWARDID_FIELD_NUMBER = 7;
      private Internal.IntList gotRewardId_;
      public static final int TIERREWARDID_FIELD_NUMBER = 8;
      private Internal.IntList tierRewardId_;
      public static final int TASK_FIELD_NUMBER = 9;
      private List<CommonMsg.Task> task_;
      public static final int FIRSTBANQUET_FIELD_NUMBER = 10;
      private boolean firstBanquet_;
      public static final int GOTWALK_FIELD_NUMBER = 11;
      private boolean gotWalk_;
      public static final int SIGNRECEIVEIDS_FIELD_NUMBER = 12;
      private Internal.IntList signReceiveIds_;
      public static final int ACTIVITYOPENDAY_FIELD_NUMBER = 13;
      private int activityOpenDay_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_15102 DEFAULT_INSTANCE = new S2C_Main_15102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_15102> PARSER = new AbstractParser<S2C_Main_15102>() {
         public S2C_Main_15102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_15102(input, extensionRegistry);
         }
      };

      private S2C_Main_15102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_15102() {
         this.memoizedIsInitialized = -1;
         this.gotSiteReward_ = emptyIntList();
         this.finishShow_ = emptyIntList();
         this.gotRewardId_ = emptyIntList();
         this.tierRewardId_ = emptyIntList();
         this.task_ = Collections.emptyList();
         this.signReceiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_15102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_15102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.day_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.enterCount_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotSiteReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotSiteReward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotSiteReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.tier_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.enjoy_ = input.readInt32();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.finishShow_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.finishShow_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.finishShow_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.finishShow_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.gotRewardId_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.gotRewardId_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewardId_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRewardId_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 64:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.tierRewardId_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }

                        this.tierRewardId_.addInt(input.readInt32());
                        continue;
                     case 66:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 128) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tierRewardId_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tierRewardId_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        continue;
                     case 80:
                        this.bitField0_ |= 16;
                        this.firstBanquet_ = input.readBool();
                        continue;
                     case 88:
                        this.bitField0_ |= 32;
                        this.gotWalk_ = input.readBool();
                        continue;
                     case 96:
                        if ((mutable_bitField0_ & 2048) == 0) {
                           this.signReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }

                        this.signReceiveIds_.addInt(input.readInt32());
                        continue;
                     case 98:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2048) == 0 && input.getBytesUntilLimit() > 0) {
                           this.signReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 2048;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.signReceiveIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 104:
                        this.bitField0_ |= 64;
                        this.activityOpenDay_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotSiteReward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.gotSiteReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.finishShow_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.gotRewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.tierRewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               if ((mutable_bitField0_ & 2048) != 0) {
                  this.signReceiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15102.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public boolean hasEnterCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEnterCount() {
         return this.enterCount_;
      }

      public List<Integer> getGotSiteRewardList() {
         return this.gotSiteReward_;
      }

      public int getGotSiteRewardCount() {
         return this.gotSiteReward_.size();
      }

      public int getGotSiteReward(int index) {
         return this.gotSiteReward_.getInt(index);
      }

      public boolean hasTier() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTier() {
         return this.tier_;
      }

      public boolean hasEnjoy() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getEnjoy() {
         return this.enjoy_;
      }

      public List<Integer> getFinishShowList() {
         return this.finishShow_;
      }

      public int getFinishShowCount() {
         return this.finishShow_.size();
      }

      public int getFinishShow(int index) {
         return this.finishShow_.getInt(index);
      }

      public List<Integer> getGotRewardIdList() {
         return this.gotRewardId_;
      }

      public int getGotRewardIdCount() {
         return this.gotRewardId_.size();
      }

      public int getGotRewardId(int index) {
         return this.gotRewardId_.getInt(index);
      }

      public List<Integer> getTierRewardIdList() {
         return this.tierRewardId_;
      }

      public int getTierRewardIdCount() {
         return this.tierRewardId_.size();
      }

      public int getTierRewardId(int index) {
         return this.tierRewardId_.getInt(index);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public boolean hasFirstBanquet() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getFirstBanquet() {
         return this.firstBanquet_;
      }

      public boolean hasGotWalk() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getGotWalk() {
         return this.gotWalk_;
      }

      public List<Integer> getSignReceiveIdsList() {
         return this.signReceiveIds_;
      }

      public int getSignReceiveIdsCount() {
         return this.signReceiveIds_.size();
      }

      public int getSignReceiveIds(int index) {
         return this.signReceiveIds_.getInt(index);
      }

      public boolean hasActivityOpenDay() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getActivityOpenDay() {
         return this.activityOpenDay_;
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
         } else if (!this.hasEnterCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTier()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFirstBanquet()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotWalk()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityOpenDay()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.enterCount_);
         }

         for(int i = 0; i < this.gotSiteReward_.size(); ++i) {
            output.writeInt32(3, this.gotSiteReward_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.tier_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.enjoy_);
         }

         for(int i = 0; i < this.finishShow_.size(); ++i) {
            output.writeInt32(6, this.finishShow_.getInt(i));
         }

         for(int i = 0; i < this.gotRewardId_.size(); ++i) {
            output.writeInt32(7, this.gotRewardId_.getInt(i));
         }

         for(int i = 0; i < this.tierRewardId_.size(); ++i) {
            output.writeInt32(8, this.tierRewardId_.getInt(i));
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.task_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(10, this.firstBanquet_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(11, this.gotWalk_);
         }

         for(int i = 0; i < this.signReceiveIds_.size(); ++i) {
            output.writeInt32(12, this.signReceiveIds_.getInt(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(13, this.activityOpenDay_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.enterCount_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotSiteReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotSiteReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotSiteRewardList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.tier_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.enjoy_);
            }

            dataSize = 0;

            for(int i = 0; i < this.finishShow_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.finishShow_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFinishShowList().size();
            dataSize = 0;

            for(int i = 0; i < this.gotRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.tierRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tierRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTierRewardIdList().size();

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.task_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(10, this.firstBanquet_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(11, this.gotWalk_);
            }

            dataSize = 0;

            for(int i = 0; i < this.signReceiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.signReceiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSignReceiveIdsList().size();
            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.activityOpenDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_15102)) {
            return super.equals(obj);
         } else {
            S2C_Main_15102 other = (S2C_Main_15102)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (this.hasEnterCount() != other.hasEnterCount()) {
               return false;
            } else if (this.hasEnterCount() && this.getEnterCount() != other.getEnterCount()) {
               return false;
            } else if (!this.getGotSiteRewardList().equals(other.getGotSiteRewardList())) {
               return false;
            } else if (this.hasTier() != other.hasTier()) {
               return false;
            } else if (this.hasTier() && this.getTier() != other.getTier()) {
               return false;
            } else if (this.hasEnjoy() != other.hasEnjoy()) {
               return false;
            } else if (this.hasEnjoy() && this.getEnjoy() != other.getEnjoy()) {
               return false;
            } else if (!this.getFinishShowList().equals(other.getFinishShowList())) {
               return false;
            } else if (!this.getGotRewardIdList().equals(other.getGotRewardIdList())) {
               return false;
            } else if (!this.getTierRewardIdList().equals(other.getTierRewardIdList())) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else if (this.hasFirstBanquet() != other.hasFirstBanquet()) {
               return false;
            } else if (this.hasFirstBanquet() && this.getFirstBanquet() != other.getFirstBanquet()) {
               return false;
            } else if (this.hasGotWalk() != other.hasGotWalk()) {
               return false;
            } else if (this.hasGotWalk() && this.getGotWalk() != other.getGotWalk()) {
               return false;
            } else if (!this.getSignReceiveIdsList().equals(other.getSignReceiveIdsList())) {
               return false;
            } else if (this.hasActivityOpenDay() != other.hasActivityOpenDay()) {
               return false;
            } else if (this.hasActivityOpenDay() && this.getActivityOpenDay() != other.getActivityOpenDay()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasEnterCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEnterCount();
            }

            if (this.getGotSiteRewardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotSiteRewardList().hashCode();
            }

            if (this.hasTier()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTier();
            }

            if (this.hasEnjoy()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEnjoy();
            }

            if (this.getFinishShowCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFinishShowList().hashCode();
            }

            if (this.getGotRewardIdCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getGotRewardIdList().hashCode();
            }

            if (this.getTierRewardIdCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTierRewardIdList().hashCode();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            if (this.hasFirstBanquet()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashBoolean(this.getFirstBanquet());
            }

            if (this.hasGotWalk()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashBoolean(this.getGotWalk());
            }

            if (this.getSignReceiveIdsCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getSignReceiveIdsList().hashCode();
            }

            if (this.hasActivityOpenDay()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getActivityOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_15102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data);
      }

      public static S2C_Main_15102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data);
      }

      public static S2C_Main_15102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data);
      }

      public static S2C_Main_15102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15102 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_15102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_15102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_15102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_15102> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_15102> getParserForType() {
         return PARSER;
      }

      public S2C_Main_15102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_15102OrBuilder {
         private int bitField0_;
         private int day_;
         private int enterCount_;
         private Internal.IntList gotSiteReward_;
         private int tier_;
         private int enjoy_;
         private Internal.IntList finishShow_;
         private Internal.IntList gotRewardId_;
         private Internal.IntList tierRewardId_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;
         private boolean firstBanquet_;
         private boolean gotWalk_;
         private Internal.IntList signReceiveIds_;
         private int activityOpenDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15102.class, Builder.class);
         }

         private Builder() {
            this.gotSiteReward_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.finishShow_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.gotRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.tierRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.task_ = Collections.emptyList();
            this.signReceiveIds_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotSiteReward_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.finishShow_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.gotRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.tierRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.task_ = Collections.emptyList();
            this.signReceiveIds_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_Main_15102.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            this.enterCount_ = 0;
            this.bitField0_ &= -3;
            this.gotSiteReward_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -5;
            this.tier_ = 0;
            this.bitField0_ &= -9;
            this.enjoy_ = 0;
            this.bitField0_ &= -17;
            this.finishShow_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -33;
            this.gotRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -65;
            this.tierRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -129;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.taskBuilder_.clear();
            }

            this.firstBanquet_ = false;
            this.bitField0_ &= -513;
            this.gotWalk_ = false;
            this.bitField0_ &= -1025;
            this.signReceiveIds_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -2049;
            this.activityOpenDay_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15102_descriptor;
         }

         public S2C_Main_15102 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_Main_15102.getDefaultInstance();
         }

         public S2C_Main_15102 build() {
            S2C_Main_15102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_15102 buildPartial() {
            S2C_Main_15102 result = new S2C_Main_15102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.enterCount_ = this.enterCount_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotSiteReward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotSiteReward_ = this.gotSiteReward_;
            if ((from_bitField0_ & 8) != 0) {
               result.tier_ = this.tier_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.enjoy_ = this.enjoy_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.finishShow_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.finishShow_ = this.finishShow_;
            if ((this.bitField0_ & 64) != 0) {
               this.gotRewardId_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.gotRewardId_ = this.gotRewardId_;
            if ((this.bitField0_ & 128) != 0) {
               this.tierRewardId_.makeImmutable();
               this.bitField0_ &= -129;
            }

            result.tierRewardId_ = this.tierRewardId_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -257;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
            }

            if ((from_bitField0_ & 512) != 0) {
               result.firstBanquet_ = this.firstBanquet_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.gotWalk_ = this.gotWalk_;
               to_bitField0_ |= 32;
            }

            if ((this.bitField0_ & 2048) != 0) {
               this.signReceiveIds_.makeImmutable();
               this.bitField0_ &= -2049;
            }

            result.signReceiveIds_ = this.signReceiveIds_;
            if ((from_bitField0_ & 4096) != 0) {
               result.activityOpenDay_ = this.activityOpenDay_;
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
            if (other instanceof S2C_Main_15102) {
               return this.mergeFrom((S2C_Main_15102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_15102 other) {
            if (other == MidAutumnMsg.S2C_Main_15102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (other.hasEnterCount()) {
                  this.setEnterCount(other.getEnterCount());
               }

               if (!other.gotSiteReward_.isEmpty()) {
                  if (this.gotSiteReward_.isEmpty()) {
                     this.gotSiteReward_ = other.gotSiteReward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotSiteRewardIsMutable();
                     this.gotSiteReward_.addAll(other.gotSiteReward_);
                  }

                  this.onChanged();
               }

               if (other.hasTier()) {
                  this.setTier(other.getTier());
               }

               if (other.hasEnjoy()) {
                  this.setEnjoy(other.getEnjoy());
               }

               if (!other.finishShow_.isEmpty()) {
                  if (this.finishShow_.isEmpty()) {
                     this.finishShow_ = other.finishShow_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureFinishShowIsMutable();
                     this.finishShow_.addAll(other.finishShow_);
                  }

                  this.onChanged();
               }

               if (!other.gotRewardId_.isEmpty()) {
                  if (this.gotRewardId_.isEmpty()) {
                     this.gotRewardId_ = other.gotRewardId_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureGotRewardIdIsMutable();
                     this.gotRewardId_.addAll(other.gotRewardId_);
                  }

                  this.onChanged();
               }

               if (!other.tierRewardId_.isEmpty()) {
                  if (this.tierRewardId_.isEmpty()) {
                     this.tierRewardId_ = other.tierRewardId_;
                     this.bitField0_ &= -129;
                  } else {
                     this.ensureTierRewardIdIsMutable();
                     this.tierRewardId_.addAll(other.tierRewardId_);
                  }

                  this.onChanged();
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -257;
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
                     this.bitField0_ &= -257;
                     this.taskBuilder_ = MidAutumnMsg.S2C_Main_15102.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               if (other.hasFirstBanquet()) {
                  this.setFirstBanquet(other.getFirstBanquet());
               }

               if (other.hasGotWalk()) {
                  this.setGotWalk(other.getGotWalk());
               }

               if (!other.signReceiveIds_.isEmpty()) {
                  if (this.signReceiveIds_.isEmpty()) {
                     this.signReceiveIds_ = other.signReceiveIds_;
                     this.bitField0_ &= -2049;
                  } else {
                     this.ensureSignReceiveIdsIsMutable();
                     this.signReceiveIds_.addAll(other.signReceiveIds_);
                  }

                  this.onChanged();
               }

               if (other.hasActivityOpenDay()) {
                  this.setActivityOpenDay(other.getActivityOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDay()) {
               return false;
            } else if (!this.hasEnterCount()) {
               return false;
            } else if (!this.hasTier()) {
               return false;
            } else if (!this.hasEnjoy()) {
               return false;
            } else if (!this.hasFirstBanquet()) {
               return false;
            } else if (!this.hasGotWalk()) {
               return false;
            } else if (!this.hasActivityOpenDay()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskCount(); ++i) {
                  if (!this.getTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_15102 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_15102)MidAutumnMsg.S2C_Main_15102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_15102)e.getUnfinishedMessage();
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

         public boolean hasEnterCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEnterCount() {
            return this.enterCount_;
         }

         public Builder setEnterCount(int value) {
            this.bitField0_ |= 2;
            this.enterCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnterCount() {
            this.bitField0_ &= -3;
            this.enterCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotSiteRewardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotSiteReward_ = MidAutumnMsg.S2C_Main_15102.mutableCopy(this.gotSiteReward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotSiteRewardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotSiteReward_) : this.gotSiteReward_);
         }

         public int getGotSiteRewardCount() {
            return this.gotSiteReward_.size();
         }

         public int getGotSiteReward(int index) {
            return this.gotSiteReward_.getInt(index);
         }

         public Builder setGotSiteReward(int index, int value) {
            this.ensureGotSiteRewardIsMutable();
            this.gotSiteReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotSiteReward(int value) {
            this.ensureGotSiteRewardIsMutable();
            this.gotSiteReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotSiteReward(Iterable<? extends Integer> values) {
            this.ensureGotSiteRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotSiteReward_);
            this.onChanged();
            return this;
         }

         public Builder clearGotSiteReward() {
            this.gotSiteReward_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasTier() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTier() {
            return this.tier_;
         }

         public Builder setTier(int value) {
            this.bitField0_ |= 8;
            this.tier_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTier() {
            this.bitField0_ &= -9;
            this.tier_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnjoy() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getEnjoy() {
            return this.enjoy_;
         }

         public Builder setEnjoy(int value) {
            this.bitField0_ |= 16;
            this.enjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoy() {
            this.bitField0_ &= -17;
            this.enjoy_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureFinishShowIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.finishShow_ = MidAutumnMsg.S2C_Main_15102.mutableCopy(this.finishShow_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getFinishShowList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.finishShow_) : this.finishShow_);
         }

         public int getFinishShowCount() {
            return this.finishShow_.size();
         }

         public int getFinishShow(int index) {
            return this.finishShow_.getInt(index);
         }

         public Builder setFinishShow(int index, int value) {
            this.ensureFinishShowIsMutable();
            this.finishShow_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFinishShow(int value) {
            this.ensureFinishShowIsMutable();
            this.finishShow_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFinishShow(Iterable<? extends Integer> values) {
            this.ensureFinishShowIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.finishShow_);
            this.onChanged();
            return this;
         }

         public Builder clearFinishShow() {
            this.finishShow_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardIdIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.gotRewardId_ = MidAutumnMsg.S2C_Main_15102.mutableCopy(this.gotRewardId_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getGotRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.gotRewardId_) : this.gotRewardId_);
         }

         public int getGotRewardIdCount() {
            return this.gotRewardId_.size();
         }

         public int getGotRewardId(int index) {
            return this.gotRewardId_.getInt(index);
         }

         public Builder setGotRewardId(int index, int value) {
            this.ensureGotRewardIdIsMutable();
            this.gotRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewardId(int value) {
            this.ensureGotRewardIdIsMutable();
            this.gotRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewardId(Iterable<? extends Integer> values) {
            this.ensureGotRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewardId() {
            this.gotRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         private void ensureTierRewardIdIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.tierRewardId_ = MidAutumnMsg.S2C_Main_15102.mutableCopy(this.tierRewardId_);
               this.bitField0_ |= 128;
            }

         }

         public List<Integer> getTierRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 128) != 0 ? Collections.unmodifiableList(this.tierRewardId_) : this.tierRewardId_);
         }

         public int getTierRewardIdCount() {
            return this.tierRewardId_.size();
         }

         public int getTierRewardId(int index) {
            return this.tierRewardId_.getInt(index);
         }

         public Builder setTierRewardId(int index, int value) {
            this.ensureTierRewardIdIsMutable();
            this.tierRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTierRewardId(int value) {
            this.ensureTierRewardIdIsMutable();
            this.tierRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTierRewardId(Iterable<? extends Integer> values) {
            this.ensureTierRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tierRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearTierRewardId() {
            this.tierRewardId_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -129;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 256;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
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

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
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

         public Builder addTask(int index, CommonMsg.Task value) {
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

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
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
               this.bitField0_ &= -257;
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

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public boolean hasFirstBanquet() {
            return (this.bitField0_ & 512) != 0;
         }

         public boolean getFirstBanquet() {
            return this.firstBanquet_;
         }

         public Builder setFirstBanquet(boolean value) {
            this.bitField0_ |= 512;
            this.firstBanquet_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstBanquet() {
            this.bitField0_ &= -513;
            this.firstBanquet_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasGotWalk() {
            return (this.bitField0_ & 1024) != 0;
         }

         public boolean getGotWalk() {
            return this.gotWalk_;
         }

         public Builder setGotWalk(boolean value) {
            this.bitField0_ |= 1024;
            this.gotWalk_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotWalk() {
            this.bitField0_ &= -1025;
            this.gotWalk_ = false;
            this.onChanged();
            return this;
         }

         private void ensureSignReceiveIdsIsMutable() {
            if ((this.bitField0_ & 2048) == 0) {
               this.signReceiveIds_ = MidAutumnMsg.S2C_Main_15102.mutableCopy(this.signReceiveIds_);
               this.bitField0_ |= 2048;
            }

         }

         public List<Integer> getSignReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 2048) != 0 ? Collections.unmodifiableList(this.signReceiveIds_) : this.signReceiveIds_);
         }

         public int getSignReceiveIdsCount() {
            return this.signReceiveIds_.size();
         }

         public int getSignReceiveIds(int index) {
            return this.signReceiveIds_.getInt(index);
         }

         public Builder setSignReceiveIds(int index, int value) {
            this.ensureSignReceiveIdsIsMutable();
            this.signReceiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSignReceiveIds(int value) {
            this.ensureSignReceiveIdsIsMutable();
            this.signReceiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSignReceiveIds(Iterable<? extends Integer> values) {
            this.ensureSignReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.signReceiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearSignReceiveIds() {
            this.signReceiveIds_ = MidAutumnMsg.S2C_Main_15102.emptyIntList();
            this.bitField0_ &= -2049;
            this.onChanged();
            return this;
         }

         public boolean hasActivityOpenDay() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getActivityOpenDay() {
            return this.activityOpenDay_;
         }

         public Builder setActivityOpenDay(int value) {
            this.bitField0_ |= 4096;
            this.activityOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityOpenDay() {
            this.bitField0_ &= -4097;
            this.activityOpenDay_ = 0;
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

   public static final class C2S_ExitBanquet_15105 extends GeneratedMessageV3 implements C2S_ExitBanquet_15105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCORE_FIELD_NUMBER = 1;
      private int score_;
      public static final int GUEST_FIELD_NUMBER = 2;
      private Internal.IntList guest_;
      private byte memoizedIsInitialized;
      private static final C2S_ExitBanquet_15105 DEFAULT_INSTANCE = new C2S_ExitBanquet_15105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExitBanquet_15105> PARSER = new AbstractParser<C2S_ExitBanquet_15105>() {
         public C2S_ExitBanquet_15105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExitBanquet_15105(input, extensionRegistry);
         }
      };

      private C2S_ExitBanquet_15105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExitBanquet_15105() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExitBanquet_15105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExitBanquet_15105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitBanquet_15105.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ExitBanquet_15105)) {
            return super.equals(obj);
         } else {
            C2S_ExitBanquet_15105 other = (C2S_ExitBanquet_15105)obj;
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

      public static C2S_ExitBanquet_15105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_15105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_15105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_15105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_15105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_15105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_15105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_15105 parseFrom(InputStream input) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_15105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitBanquet_15105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_15105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitBanquet_15105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_15105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_15105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExitBanquet_15105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExitBanquet_15105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExitBanquet_15105> parser() {
         return PARSER;
      }

      public Parser<C2S_ExitBanquet_15105> getParserForType() {
         return PARSER;
      }

      public C2S_ExitBanquet_15105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExitBanquet_15105OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitBanquet_15105.class, Builder.class);
         }

         private Builder() {
            this.guest_ = MidAutumnMsg.C2S_ExitBanquet_15105.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = MidAutumnMsg.C2S_ExitBanquet_15105.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_ExitBanquet_15105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = MidAutumnMsg.C2S_ExitBanquet_15105.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ExitBanquet_15105_descriptor;
         }

         public C2S_ExitBanquet_15105 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_ExitBanquet_15105.getDefaultInstance();
         }

         public C2S_ExitBanquet_15105 build() {
            C2S_ExitBanquet_15105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExitBanquet_15105 buildPartial() {
            C2S_ExitBanquet_15105 result = new C2S_ExitBanquet_15105(this);
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
            if (other instanceof C2S_ExitBanquet_15105) {
               return this.mergeFrom((C2S_ExitBanquet_15105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExitBanquet_15105 other) {
            if (other == MidAutumnMsg.C2S_ExitBanquet_15105.getDefaultInstance()) {
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
            C2S_ExitBanquet_15105 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExitBanquet_15105)MidAutumnMsg.C2S_ExitBanquet_15105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExitBanquet_15105)e.getUnfinishedMessage();
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
               this.guest_ = MidAutumnMsg.C2S_ExitBanquet_15105.mutableCopy(this.guest_);
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
            this.guest_ = MidAutumnMsg.C2S_ExitBanquet_15105.emptyIntList();
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

   public static final class S2C_ExitBanquet_15106 extends GeneratedMessageV3 implements S2C_ExitBanquet_15106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCORE_FIELD_NUMBER = 1;
      private int score_;
      public static final int GUEST_FIELD_NUMBER = 2;
      private Internal.IntList guest_;
      public static final int ENTERCOUNT_FIELD_NUMBER = 3;
      private int enterCount_;
      public static final int FIRSTBANQUET_FIELD_NUMBER = 4;
      private boolean firstBanquet_;
      private byte memoizedIsInitialized;
      private static final S2C_ExitBanquet_15106 DEFAULT_INSTANCE = new S2C_ExitBanquet_15106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExitBanquet_15106> PARSER = new AbstractParser<S2C_ExitBanquet_15106>() {
         public S2C_ExitBanquet_15106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExitBanquet_15106(input, extensionRegistry);
         }
      };

      private S2C_ExitBanquet_15106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExitBanquet_15106() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExitBanquet_15106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExitBanquet_15106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.enterCount_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.firstBanquet_ = input.readBool();
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitBanquet_15106.class, Builder.class);
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

      public boolean hasEnterCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEnterCount() {
         return this.enterCount_;
      }

      public boolean hasFirstBanquet() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getFirstBanquet() {
         return this.firstBanquet_;
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
         } else if (!this.hasEnterCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFirstBanquet()) {
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
            output.writeInt32(3, this.enterCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.firstBanquet_);
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
               size += CodedOutputStream.computeInt32Size(3, this.enterCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.firstBanquet_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExitBanquet_15106)) {
            return super.equals(obj);
         } else {
            S2C_ExitBanquet_15106 other = (S2C_ExitBanquet_15106)obj;
            if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getGuestList().equals(other.getGuestList())) {
               return false;
            } else if (this.hasEnterCount() != other.hasEnterCount()) {
               return false;
            } else if (this.hasEnterCount() && this.getEnterCount() != other.getEnterCount()) {
               return false;
            } else if (this.hasFirstBanquet() != other.hasFirstBanquet()) {
               return false;
            } else if (this.hasFirstBanquet() && this.getFirstBanquet() != other.getFirstBanquet()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasEnterCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEnterCount();
            }

            if (this.hasFirstBanquet()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getFirstBanquet());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExitBanquet_15106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_15106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_15106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_15106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_15106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_15106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_15106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_15106 parseFrom(InputStream input) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_15106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitBanquet_15106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_15106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitBanquet_15106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_15106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_15106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExitBanquet_15106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExitBanquet_15106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExitBanquet_15106> parser() {
         return PARSER;
      }

      public Parser<S2C_ExitBanquet_15106> getParserForType() {
         return PARSER;
      }

      public S2C_ExitBanquet_15106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExitBanquet_15106OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;
         private int enterCount_;
         private boolean firstBanquet_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitBanquet_15106.class, Builder.class);
         }

         private Builder() {
            this.guest_ = MidAutumnMsg.S2C_ExitBanquet_15106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = MidAutumnMsg.S2C_ExitBanquet_15106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_ExitBanquet_15106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = MidAutumnMsg.S2C_ExitBanquet_15106.emptyIntList();
            this.bitField0_ &= -3;
            this.enterCount_ = 0;
            this.bitField0_ &= -5;
            this.firstBanquet_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ExitBanquet_15106_descriptor;
         }

         public S2C_ExitBanquet_15106 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_ExitBanquet_15106.getDefaultInstance();
         }

         public S2C_ExitBanquet_15106 build() {
            S2C_ExitBanquet_15106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExitBanquet_15106 buildPartial() {
            S2C_ExitBanquet_15106 result = new S2C_ExitBanquet_15106(this);
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
               result.enterCount_ = this.enterCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.firstBanquet_ = this.firstBanquet_;
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
            if (other instanceof S2C_ExitBanquet_15106) {
               return this.mergeFrom((S2C_ExitBanquet_15106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExitBanquet_15106 other) {
            if (other == MidAutumnMsg.S2C_ExitBanquet_15106.getDefaultInstance()) {
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

               if (other.hasEnterCount()) {
                  this.setEnterCount(other.getEnterCount());
               }

               if (other.hasFirstBanquet()) {
                  this.setFirstBanquet(other.getFirstBanquet());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasScore()) {
               return false;
            } else if (!this.hasEnterCount()) {
               return false;
            } else {
               return this.hasFirstBanquet();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExitBanquet_15106 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExitBanquet_15106)MidAutumnMsg.S2C_ExitBanquet_15106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExitBanquet_15106)e.getUnfinishedMessage();
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
               this.guest_ = MidAutumnMsg.S2C_ExitBanquet_15106.mutableCopy(this.guest_);
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
            this.guest_ = MidAutumnMsg.S2C_ExitBanquet_15106.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasEnterCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEnterCount() {
            return this.enterCount_;
         }

         public Builder setEnterCount(int value) {
            this.bitField0_ |= 4;
            this.enterCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnterCount() {
            this.bitField0_ &= -5;
            this.enterCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstBanquet() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getFirstBanquet() {
            return this.firstBanquet_;
         }

         public Builder setFirstBanquet(boolean value) {
            this.bitField0_ |= 8;
            this.firstBanquet_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstBanquet() {
            this.bitField0_ &= -9;
            this.firstBanquet_ = false;
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

   public static final class C2S_PlayFinish_15107 extends GeneratedMessageV3 implements C2S_PlayFinish_15107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PlayFinish_15107 DEFAULT_INSTANCE = new C2S_PlayFinish_15107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayFinish_15107> PARSER = new AbstractParser<C2S_PlayFinish_15107>() {
         public C2S_PlayFinish_15107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayFinish_15107(input, extensionRegistry);
         }
      };

      private C2S_PlayFinish_15107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayFinish_15107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayFinish_15107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayFinish_15107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayFinish_15107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PlayFinish_15107)) {
            return super.equals(obj);
         } else {
            C2S_PlayFinish_15107 other = (C2S_PlayFinish_15107)obj;
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

      public static C2S_PlayFinish_15107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_15107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_15107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_15107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_15107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_15107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_15107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_15107 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_15107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayFinish_15107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_15107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayFinish_15107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_15107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_15107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayFinish_15107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayFinish_15107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayFinish_15107> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayFinish_15107> getParserForType() {
         return PARSER;
      }

      public C2S_PlayFinish_15107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayFinish_15107OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayFinish_15107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_PlayFinish_15107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PlayFinish_15107_descriptor;
         }

         public C2S_PlayFinish_15107 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_PlayFinish_15107.getDefaultInstance();
         }

         public C2S_PlayFinish_15107 build() {
            C2S_PlayFinish_15107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayFinish_15107 buildPartial() {
            C2S_PlayFinish_15107 result = new C2S_PlayFinish_15107(this);
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
            if (other instanceof C2S_PlayFinish_15107) {
               return this.mergeFrom((C2S_PlayFinish_15107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayFinish_15107 other) {
            if (other == MidAutumnMsg.C2S_PlayFinish_15107.getDefaultInstance()) {
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
            C2S_PlayFinish_15107 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayFinish_15107)MidAutumnMsg.C2S_PlayFinish_15107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayFinish_15107)e.getUnfinishedMessage();
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

   public static final class S2C_PlayFinish_15108 extends GeneratedMessageV3 implements S2C_PlayFinish_15108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayFinish_15108 DEFAULT_INSTANCE = new S2C_PlayFinish_15108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayFinish_15108> PARSER = new AbstractParser<S2C_PlayFinish_15108>() {
         public S2C_PlayFinish_15108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayFinish_15108(input, extensionRegistry);
         }
      };

      private S2C_PlayFinish_15108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayFinish_15108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayFinish_15108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayFinish_15108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayFinish_15108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PlayFinish_15108)) {
            return super.equals(obj);
         } else {
            S2C_PlayFinish_15108 other = (S2C_PlayFinish_15108)obj;
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

      public static S2C_PlayFinish_15108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_15108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_15108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_15108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_15108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_15108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_15108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_15108 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_15108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayFinish_15108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_15108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayFinish_15108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_15108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_15108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayFinish_15108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayFinish_15108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayFinish_15108> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayFinish_15108> getParserForType() {
         return PARSER;
      }

      public S2C_PlayFinish_15108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayFinish_15108OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayFinish_15108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_PlayFinish_15108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PlayFinish_15108_descriptor;
         }

         public S2C_PlayFinish_15108 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_PlayFinish_15108.getDefaultInstance();
         }

         public S2C_PlayFinish_15108 build() {
            S2C_PlayFinish_15108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayFinish_15108 buildPartial() {
            S2C_PlayFinish_15108 result = new S2C_PlayFinish_15108(this);
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
            if (other instanceof S2C_PlayFinish_15108) {
               return this.mergeFrom((S2C_PlayFinish_15108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayFinish_15108 other) {
            if (other == MidAutumnMsg.S2C_PlayFinish_15108.getDefaultInstance()) {
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
            S2C_PlayFinish_15108 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayFinish_15108)MidAutumnMsg.S2C_PlayFinish_15108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayFinish_15108)e.getUnfinishedMessage();
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

   public static final class S2C_TaskNotify_15110 extends GeneratedMessageV3 implements S2C_TaskNotify_15110OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_15110 DEFAULT_INSTANCE = new S2C_TaskNotify_15110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_15110> PARSER = new AbstractParser<S2C_TaskNotify_15110>() {
         public S2C_TaskNotify_15110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_15110(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_15110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_15110() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_15110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_15110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_15110.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
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
         } else if (!(obj instanceof S2C_TaskNotify_15110)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_15110 other = (S2C_TaskNotify_15110)obj;
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

      public static S2C_TaskNotify_15110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_15110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_15110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_15110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_15110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_15110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_15110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_15110 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_15110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_15110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_15110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_15110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_15110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_15110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_15110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_15110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_15110> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_15110> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_15110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_15110OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_15110.class, Builder.class);
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
            if (MidAutumnMsg.S2C_TaskNotify_15110.alwaysUseFieldBuilders) {
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskNotify_15110_descriptor;
         }

         public S2C_TaskNotify_15110 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_TaskNotify_15110.getDefaultInstance();
         }

         public S2C_TaskNotify_15110 build() {
            S2C_TaskNotify_15110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_15110 buildPartial() {
            S2C_TaskNotify_15110 result = new S2C_TaskNotify_15110(this);
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
            if (other instanceof S2C_TaskNotify_15110) {
               return this.mergeFrom((S2C_TaskNotify_15110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_15110 other) {
            if (other == MidAutumnMsg.S2C_TaskNotify_15110.getDefaultInstance()) {
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
                     this.taskBuilder_ = MidAutumnMsg.S2C_TaskNotify_15110.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_TaskNotify_15110 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_15110)MidAutumnMsg.S2C_TaskNotify_15110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_15110)e.getUnfinishedMessage();
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

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
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

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
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

         public Builder addTask(int index, CommonMsg.Task value) {
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

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
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

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
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

   public static final class C2S_TaskReward_15111 extends GeneratedMessageV3 implements C2S_TaskReward_15111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskReward_15111 DEFAULT_INSTANCE = new C2S_TaskReward_15111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskReward_15111> PARSER = new AbstractParser<C2S_TaskReward_15111>() {
         public C2S_TaskReward_15111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskReward_15111(input, extensionRegistry);
         }
      };

      private C2S_TaskReward_15111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskReward_15111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskReward_15111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskReward_15111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_15111.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskReward_15111)) {
            return super.equals(obj);
         } else {
            C2S_TaskReward_15111 other = (C2S_TaskReward_15111)obj;
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

      public static C2S_TaskReward_15111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_15111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_15111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_15111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_15111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_15111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_15111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_15111 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_15111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_15111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_15111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_15111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_15111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_15111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskReward_15111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskReward_15111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskReward_15111> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskReward_15111> getParserForType() {
         return PARSER;
      }

      public C2S_TaskReward_15111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskReward_15111OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_15111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_TaskReward_15111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_TaskReward_15111_descriptor;
         }

         public C2S_TaskReward_15111 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_TaskReward_15111.getDefaultInstance();
         }

         public C2S_TaskReward_15111 build() {
            C2S_TaskReward_15111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskReward_15111 buildPartial() {
            C2S_TaskReward_15111 result = new C2S_TaskReward_15111(this);
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
            if (other instanceof C2S_TaskReward_15111) {
               return this.mergeFrom((C2S_TaskReward_15111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskReward_15111 other) {
            if (other == MidAutumnMsg.C2S_TaskReward_15111.getDefaultInstance()) {
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
            C2S_TaskReward_15111 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskReward_15111)MidAutumnMsg.C2S_TaskReward_15111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskReward_15111)e.getUnfinishedMessage();
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

   public static final class S2C_TaskReward_15112 extends GeneratedMessageV3 implements S2C_TaskReward_15112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskReward_15112 DEFAULT_INSTANCE = new S2C_TaskReward_15112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskReward_15112> PARSER = new AbstractParser<S2C_TaskReward_15112>() {
         public S2C_TaskReward_15112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskReward_15112(input, extensionRegistry);
         }
      };

      private S2C_TaskReward_15112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskReward_15112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskReward_15112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskReward_15112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_15112.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskReward_15112)) {
            return super.equals(obj);
         } else {
            S2C_TaskReward_15112 other = (S2C_TaskReward_15112)obj;
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

      public static S2C_TaskReward_15112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_15112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_15112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_15112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_15112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_15112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_15112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_15112 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_15112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_15112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_15112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_15112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_15112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_15112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskReward_15112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskReward_15112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskReward_15112> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskReward_15112> getParserForType() {
         return PARSER;
      }

      public S2C_TaskReward_15112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskReward_15112OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_15112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_TaskReward_15112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_TaskReward_15112_descriptor;
         }

         public S2C_TaskReward_15112 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_TaskReward_15112.getDefaultInstance();
         }

         public S2C_TaskReward_15112 build() {
            S2C_TaskReward_15112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskReward_15112 buildPartial() {
            S2C_TaskReward_15112 result = new S2C_TaskReward_15112(this);
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
            if (other instanceof S2C_TaskReward_15112) {
               return this.mergeFrom((S2C_TaskReward_15112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskReward_15112 other) {
            if (other == MidAutumnMsg.S2C_TaskReward_15112.getDefaultInstance()) {
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
            S2C_TaskReward_15112 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskReward_15112)MidAutumnMsg.S2C_TaskReward_15112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskReward_15112)e.getUnfinishedMessage();
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

   public static final class C2S_WalkReward_15113 extends GeneratedMessageV3 implements C2S_WalkReward_15113OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WalkReward_15113 DEFAULT_INSTANCE = new C2S_WalkReward_15113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WalkReward_15113> PARSER = new AbstractParser<C2S_WalkReward_15113>() {
         public C2S_WalkReward_15113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WalkReward_15113(input, extensionRegistry);
         }
      };

      private C2S_WalkReward_15113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WalkReward_15113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WalkReward_15113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WalkReward_15113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WalkReward_15113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WalkReward_15113)) {
            return super.equals(obj);
         } else {
            C2S_WalkReward_15113 other = (C2S_WalkReward_15113)obj;
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

      public static C2S_WalkReward_15113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_15113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_15113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_15113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_15113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_15113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_15113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_15113 parseFrom(InputStream input) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_15113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WalkReward_15113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_15113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WalkReward_15113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_15113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_15113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WalkReward_15113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WalkReward_15113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WalkReward_15113> parser() {
         return PARSER;
      }

      public Parser<C2S_WalkReward_15113> getParserForType() {
         return PARSER;
      }

      public C2S_WalkReward_15113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WalkReward_15113OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WalkReward_15113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_WalkReward_15113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_WalkReward_15113_descriptor;
         }

         public C2S_WalkReward_15113 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_WalkReward_15113.getDefaultInstance();
         }

         public C2S_WalkReward_15113 build() {
            C2S_WalkReward_15113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WalkReward_15113 buildPartial() {
            C2S_WalkReward_15113 result = new C2S_WalkReward_15113(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WalkReward_15113) {
               return this.mergeFrom((C2S_WalkReward_15113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WalkReward_15113 other) {
            if (other == MidAutumnMsg.C2S_WalkReward_15113.getDefaultInstance()) {
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
            C2S_WalkReward_15113 parsedMessage = null;

            try {
               parsedMessage = (C2S_WalkReward_15113)MidAutumnMsg.C2S_WalkReward_15113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WalkReward_15113)e.getUnfinishedMessage();
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

   public static final class S2C_WalkReward_15114 extends GeneratedMessageV3 implements S2C_WalkReward_15114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTWALK_FIELD_NUMBER = 1;
      private boolean gotWalk_;
      private byte memoizedIsInitialized;
      private static final S2C_WalkReward_15114 DEFAULT_INSTANCE = new S2C_WalkReward_15114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WalkReward_15114> PARSER = new AbstractParser<S2C_WalkReward_15114>() {
         public S2C_WalkReward_15114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WalkReward_15114(input, extensionRegistry);
         }
      };

      private S2C_WalkReward_15114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WalkReward_15114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WalkReward_15114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WalkReward_15114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.gotWalk_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WalkReward_15114.class, Builder.class);
      }

      public boolean hasGotWalk() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getGotWalk() {
         return this.gotWalk_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotWalk()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.gotWalk_);
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
               size += CodedOutputStream.computeBoolSize(1, this.gotWalk_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WalkReward_15114)) {
            return super.equals(obj);
         } else {
            S2C_WalkReward_15114 other = (S2C_WalkReward_15114)obj;
            if (this.hasGotWalk() != other.hasGotWalk()) {
               return false;
            } else if (this.hasGotWalk() && this.getGotWalk() != other.getGotWalk()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGotWalk()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getGotWalk());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WalkReward_15114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_15114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_15114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_15114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_15114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_15114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_15114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_15114 parseFrom(InputStream input) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_15114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WalkReward_15114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_15114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WalkReward_15114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_15114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_15114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WalkReward_15114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WalkReward_15114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WalkReward_15114> parser() {
         return PARSER;
      }

      public Parser<S2C_WalkReward_15114> getParserForType() {
         return PARSER;
      }

      public S2C_WalkReward_15114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WalkReward_15114OrBuilder {
         private int bitField0_;
         private boolean gotWalk_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WalkReward_15114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_WalkReward_15114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotWalk_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_WalkReward_15114_descriptor;
         }

         public S2C_WalkReward_15114 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_WalkReward_15114.getDefaultInstance();
         }

         public S2C_WalkReward_15114 build() {
            S2C_WalkReward_15114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WalkReward_15114 buildPartial() {
            S2C_WalkReward_15114 result = new S2C_WalkReward_15114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotWalk_ = this.gotWalk_;
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
            if (other instanceof S2C_WalkReward_15114) {
               return this.mergeFrom((S2C_WalkReward_15114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WalkReward_15114 other) {
            if (other == MidAutumnMsg.S2C_WalkReward_15114.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotWalk()) {
                  this.setGotWalk(other.getGotWalk());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotWalk();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WalkReward_15114 parsedMessage = null;

            try {
               parsedMessage = (S2C_WalkReward_15114)MidAutumnMsg.S2C_WalkReward_15114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WalkReward_15114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotWalk() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getGotWalk() {
            return this.gotWalk_;
         }

         public Builder setGotWalk(boolean value) {
            this.bitField0_ |= 1;
            this.gotWalk_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotWalk() {
            this.bitField0_ &= -2;
            this.gotWalk_ = false;
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

   public static final class C2S_PrayEnjoy_15115 extends GeneratedMessageV3 implements C2S_PrayEnjoy_15115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOY_FIELD_NUMBER = 1;
      private int enjoy_;
      private byte memoizedIsInitialized;
      private static final C2S_PrayEnjoy_15115 DEFAULT_INSTANCE = new C2S_PrayEnjoy_15115();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayEnjoy_15115> PARSER = new AbstractParser<C2S_PrayEnjoy_15115>() {
         public C2S_PrayEnjoy_15115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayEnjoy_15115(input, extensionRegistry);
         }
      };

      private C2S_PrayEnjoy_15115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayEnjoy_15115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayEnjoy_15115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayEnjoy_15115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.enjoy_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayEnjoy_15115.class, Builder.class);
      }

      public boolean hasEnjoy() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnjoy() {
         return this.enjoy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enjoy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enjoy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PrayEnjoy_15115)) {
            return super.equals(obj);
         } else {
            C2S_PrayEnjoy_15115 other = (C2S_PrayEnjoy_15115)obj;
            if (this.hasEnjoy() != other.hasEnjoy()) {
               return false;
            } else if (this.hasEnjoy() && this.getEnjoy() != other.getEnjoy()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEnjoy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnjoy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PrayEnjoy_15115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_15115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayEnjoy_15115 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_15115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_15115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_15115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayEnjoy_15115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayEnjoy_15115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayEnjoy_15115> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayEnjoy_15115> getParserForType() {
         return PARSER;
      }

      public C2S_PrayEnjoy_15115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayEnjoy_15115OrBuilder {
         private int bitField0_;
         private int enjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayEnjoy_15115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_PrayEnjoy_15115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_PrayEnjoy_15115_descriptor;
         }

         public C2S_PrayEnjoy_15115 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_PrayEnjoy_15115.getDefaultInstance();
         }

         public C2S_PrayEnjoy_15115 build() {
            C2S_PrayEnjoy_15115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayEnjoy_15115 buildPartial() {
            C2S_PrayEnjoy_15115 result = new C2S_PrayEnjoy_15115(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enjoy_ = this.enjoy_;
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
            if (other instanceof C2S_PrayEnjoy_15115) {
               return this.mergeFrom((C2S_PrayEnjoy_15115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayEnjoy_15115 other) {
            if (other == MidAutumnMsg.C2S_PrayEnjoy_15115.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnjoy()) {
                  this.setEnjoy(other.getEnjoy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEnjoy();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PrayEnjoy_15115 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayEnjoy_15115)MidAutumnMsg.C2S_PrayEnjoy_15115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayEnjoy_15115)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnjoy() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnjoy() {
            return this.enjoy_;
         }

         public Builder setEnjoy(int value) {
            this.bitField0_ |= 1;
            this.enjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoy() {
            this.bitField0_ &= -2;
            this.enjoy_ = 0;
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

   public static final class S2C_PrayEnjoy_15116 extends GeneratedMessageV3 implements S2C_PrayEnjoy_15116OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOY_FIELD_NUMBER = 1;
      private int enjoy_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayEnjoy_15116 DEFAULT_INSTANCE = new S2C_PrayEnjoy_15116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayEnjoy_15116> PARSER = new AbstractParser<S2C_PrayEnjoy_15116>() {
         public S2C_PrayEnjoy_15116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayEnjoy_15116(input, extensionRegistry);
         }
      };

      private S2C_PrayEnjoy_15116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayEnjoy_15116() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayEnjoy_15116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayEnjoy_15116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.enjoy_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayEnjoy_15116.class, Builder.class);
      }

      public boolean hasEnjoy() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnjoy() {
         return this.enjoy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enjoy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enjoy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayEnjoy_15116)) {
            return super.equals(obj);
         } else {
            S2C_PrayEnjoy_15116 other = (S2C_PrayEnjoy_15116)obj;
            if (this.hasEnjoy() != other.hasEnjoy()) {
               return false;
            } else if (this.hasEnjoy() && this.getEnjoy() != other.getEnjoy()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEnjoy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnjoy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayEnjoy_15116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_15116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayEnjoy_15116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_15116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_15116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_15116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayEnjoy_15116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayEnjoy_15116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayEnjoy_15116> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayEnjoy_15116> getParserForType() {
         return PARSER;
      }

      public S2C_PrayEnjoy_15116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayEnjoy_15116OrBuilder {
         private int bitField0_;
         private int enjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayEnjoy_15116.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_PrayEnjoy_15116.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_PrayEnjoy_15116_descriptor;
         }

         public S2C_PrayEnjoy_15116 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_PrayEnjoy_15116.getDefaultInstance();
         }

         public S2C_PrayEnjoy_15116 build() {
            S2C_PrayEnjoy_15116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayEnjoy_15116 buildPartial() {
            S2C_PrayEnjoy_15116 result = new S2C_PrayEnjoy_15116(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enjoy_ = this.enjoy_;
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
            if (other instanceof S2C_PrayEnjoy_15116) {
               return this.mergeFrom((S2C_PrayEnjoy_15116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayEnjoy_15116 other) {
            if (other == MidAutumnMsg.S2C_PrayEnjoy_15116.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnjoy()) {
                  this.setEnjoy(other.getEnjoy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEnjoy();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayEnjoy_15116 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayEnjoy_15116)MidAutumnMsg.S2C_PrayEnjoy_15116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayEnjoy_15116)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnjoy() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnjoy() {
            return this.enjoy_;
         }

         public Builder setEnjoy(int value) {
            this.bitField0_ |= 1;
            this.enjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoy() {
            this.bitField0_ &= -2;
            this.enjoy_ = 0;
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

   public static final class C2S_Pray_15117 extends GeneratedMessageV3 implements C2S_Pray_15117OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_15117 DEFAULT_INSTANCE = new C2S_Pray_15117();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_15117> PARSER = new AbstractParser<C2S_Pray_15117>() {
         public C2S_Pray_15117 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_15117(input, extensionRegistry);
         }
      };

      private C2S_Pray_15117(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_15117() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_15117();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_15117(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_15117.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Pray_15117)) {
            return super.equals(obj);
         } else {
            C2S_Pray_15117 other = (C2S_Pray_15117)obj;
            if (this.hasCount() != other.hasCount()) {
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
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Pray_15117 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data);
      }

      public static C2S_Pray_15117 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_15117 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data);
      }

      public static C2S_Pray_15117 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_15117 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data);
      }

      public static C2S_Pray_15117 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_15117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_15117 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_15117 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_15117 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_15117 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_15117 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_15117 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_15117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_15117 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_15117 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_15117> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_15117> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_15117 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_15117OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_15117.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_Pray_15117.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Pray_15117_descriptor;
         }

         public C2S_Pray_15117 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_Pray_15117.getDefaultInstance();
         }

         public C2S_Pray_15117 build() {
            C2S_Pray_15117 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_15117 buildPartial() {
            C2S_Pray_15117 result = new C2S_Pray_15117(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof C2S_Pray_15117) {
               return this.mergeFrom((C2S_Pray_15117)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_15117 other) {
            if (other == MidAutumnMsg.C2S_Pray_15117.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Pray_15117 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_15117)MidAutumnMsg.C2S_Pray_15117.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_15117)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
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

   public static final class S2C_Pray_15118 extends GeneratedMessageV3 implements S2C_Pray_15118OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      public static final int TIER_FIELD_NUMBER = 2;
      private int tier_;
      public static final int ENJOY_FIELD_NUMBER = 3;
      private int enjoy_;
      public static final int GOTREWARDID_FIELD_NUMBER = 4;
      private Internal.IntList gotRewardId_;
      public static final int TIERREWARDID_FIELD_NUMBER = 5;
      private Internal.IntList tierRewardId_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_15118 DEFAULT_INSTANCE = new S2C_Pray_15118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_15118> PARSER = new AbstractParser<S2C_Pray_15118>() {
         public S2C_Pray_15118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_15118(input, extensionRegistry);
         }
      };

      private S2C_Pray_15118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_15118() {
         this.memoizedIsInitialized = -1;
         this.gotRewardId_ = emptyIntList();
         this.tierRewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_15118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_15118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.count_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.tier_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.enjoy_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.gotRewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.gotRewardId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.tierRewardId_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.tierRewardId_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tierRewardId_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tierRewardId_.addInt(input.readInt32());
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
                     this.gotRewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.gotRewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.tierRewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_15118.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasTier() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTier() {
         return this.tier_;
      }

      public boolean hasEnjoy() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEnjoy() {
         return this.enjoy_;
      }

      public List<Integer> getGotRewardIdList() {
         return this.gotRewardId_;
      }

      public int getGotRewardIdCount() {
         return this.gotRewardId_.size();
      }

      public int getGotRewardId(int index) {
         return this.gotRewardId_.getInt(index);
      }

      public List<Integer> getTierRewardIdList() {
         return this.tierRewardId_;
      }

      public int getTierRewardIdCount() {
         return this.tierRewardId_.size();
      }

      public int getTierRewardId(int index) {
         return this.tierRewardId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTier()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.count_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.tier_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.enjoy_);
         }

         for(int i = 0; i < this.gotRewardId_.size(); ++i) {
            output.writeInt32(4, this.gotRewardId_.getInt(i));
         }

         for(int i = 0; i < this.tierRewardId_.size(); ++i) {
            output.writeInt32(5, this.tierRewardId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.tier_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.enjoy_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.tierRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tierRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTierRewardIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_15118)) {
            return super.equals(obj);
         } else {
            S2C_Pray_15118 other = (S2C_Pray_15118)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasTier() != other.hasTier()) {
               return false;
            } else if (this.hasTier() && this.getTier() != other.getTier()) {
               return false;
            } else if (this.hasEnjoy() != other.hasEnjoy()) {
               return false;
            } else if (this.hasEnjoy() && this.getEnjoy() != other.getEnjoy()) {
               return false;
            } else if (!this.getGotRewardIdList().equals(other.getGotRewardIdList())) {
               return false;
            } else if (!this.getTierRewardIdList().equals(other.getTierRewardIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasTier()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTier();
            }

            if (this.hasEnjoy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEnjoy();
            }

            if (this.getGotRewardIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotRewardIdList().hashCode();
            }

            if (this.getTierRewardIdCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTierRewardIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_15118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data);
      }

      public static S2C_Pray_15118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_15118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data);
      }

      public static S2C_Pray_15118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_15118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data);
      }

      public static S2C_Pray_15118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_15118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_15118 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_15118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_15118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_15118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_15118 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_15118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_15118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_15118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_15118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_15118> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_15118> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_15118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_15118OrBuilder {
         private int bitField0_;
         private int count_;
         private int tier_;
         private int enjoy_;
         private Internal.IntList gotRewardId_;
         private Internal.IntList tierRewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_15118.class, Builder.class);
         }

         private Builder() {
            this.gotRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.tierRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.tierRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_Pray_15118.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            this.tier_ = 0;
            this.bitField0_ &= -3;
            this.enjoy_ = 0;
            this.bitField0_ &= -5;
            this.gotRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.bitField0_ &= -9;
            this.tierRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Pray_15118_descriptor;
         }

         public S2C_Pray_15118 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_Pray_15118.getDefaultInstance();
         }

         public S2C_Pray_15118 build() {
            S2C_Pray_15118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_15118 buildPartial() {
            S2C_Pray_15118 result = new S2C_Pray_15118(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.tier_ = this.tier_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.enjoy_ = this.enjoy_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.gotRewardId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.gotRewardId_ = this.gotRewardId_;
            if ((this.bitField0_ & 16) != 0) {
               this.tierRewardId_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.tierRewardId_ = this.tierRewardId_;
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
            if (other instanceof S2C_Pray_15118) {
               return this.mergeFrom((S2C_Pray_15118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_15118 other) {
            if (other == MidAutumnMsg.S2C_Pray_15118.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasTier()) {
                  this.setTier(other.getTier());
               }

               if (other.hasEnjoy()) {
                  this.setEnjoy(other.getEnjoy());
               }

               if (!other.gotRewardId_.isEmpty()) {
                  if (this.gotRewardId_.isEmpty()) {
                     this.gotRewardId_ = other.gotRewardId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureGotRewardIdIsMutable();
                     this.gotRewardId_.addAll(other.gotRewardId_);
                  }

                  this.onChanged();
               }

               if (!other.tierRewardId_.isEmpty()) {
                  if (this.tierRewardId_.isEmpty()) {
                     this.tierRewardId_ = other.tierRewardId_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureTierRewardIdIsMutable();
                     this.tierRewardId_.addAll(other.tierRewardId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCount()) {
               return false;
            } else if (!this.hasTier()) {
               return false;
            } else {
               return this.hasEnjoy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_15118 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_15118)MidAutumnMsg.S2C_Pray_15118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_15118)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTier() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTier() {
            return this.tier_;
         }

         public Builder setTier(int value) {
            this.bitField0_ |= 2;
            this.tier_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTier() {
            this.bitField0_ &= -3;
            this.tier_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnjoy() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEnjoy() {
            return this.enjoy_;
         }

         public Builder setEnjoy(int value) {
            this.bitField0_ |= 4;
            this.enjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoy() {
            this.bitField0_ &= -5;
            this.enjoy_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotRewardId_ = MidAutumnMsg.S2C_Pray_15118.mutableCopy(this.gotRewardId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getGotRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.gotRewardId_) : this.gotRewardId_);
         }

         public int getGotRewardIdCount() {
            return this.gotRewardId_.size();
         }

         public int getGotRewardId(int index) {
            return this.gotRewardId_.getInt(index);
         }

         public Builder setGotRewardId(int index, int value) {
            this.ensureGotRewardIdIsMutable();
            this.gotRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewardId(int value) {
            this.ensureGotRewardIdIsMutable();
            this.gotRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewardId(Iterable<? extends Integer> values) {
            this.ensureGotRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewardId() {
            this.gotRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureTierRewardIdIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.tierRewardId_ = MidAutumnMsg.S2C_Pray_15118.mutableCopy(this.tierRewardId_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getTierRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.tierRewardId_) : this.tierRewardId_);
         }

         public int getTierRewardIdCount() {
            return this.tierRewardId_.size();
         }

         public int getTierRewardId(int index) {
            return this.tierRewardId_.getInt(index);
         }

         public Builder setTierRewardId(int index, int value) {
            this.ensureTierRewardIdIsMutable();
            this.tierRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTierRewardId(int value) {
            this.ensureTierRewardIdIsMutable();
            this.tierRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTierRewardId(Iterable<? extends Integer> values) {
            this.ensureTierRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tierRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearTierRewardId() {
            this.tierRewardId_ = MidAutumnMsg.S2C_Pray_15118.emptyIntList();
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

   public static final class C2S_SignReceive_15119 extends GeneratedMessageV3 implements C2S_SignReceive_15119OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignReceive_15119 DEFAULT_INSTANCE = new C2S_SignReceive_15119();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignReceive_15119> PARSER = new AbstractParser<C2S_SignReceive_15119>() {
         public C2S_SignReceive_15119 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignReceive_15119(input, extensionRegistry);
         }
      };

      private C2S_SignReceive_15119(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignReceive_15119() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignReceive_15119();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignReceive_15119(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_15119.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignReceive_15119)) {
            return super.equals(obj);
         } else {
            C2S_SignReceive_15119 other = (C2S_SignReceive_15119)obj;
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

      public static C2S_SignReceive_15119 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_15119 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_15119 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_15119 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_15119 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_15119 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_15119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_15119 parseFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_15119 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_15119 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_15119 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_15119 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_15119 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_15119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignReceive_15119 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignReceive_15119 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignReceive_15119> parser() {
         return PARSER;
      }

      public Parser<C2S_SignReceive_15119> getParserForType() {
         return PARSER;
      }

      public C2S_SignReceive_15119 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignReceive_15119OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_15119.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_SignReceive_15119.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_SignReceive_15119_descriptor;
         }

         public C2S_SignReceive_15119 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_SignReceive_15119.getDefaultInstance();
         }

         public C2S_SignReceive_15119 build() {
            C2S_SignReceive_15119 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignReceive_15119 buildPartial() {
            C2S_SignReceive_15119 result = new C2S_SignReceive_15119(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SignReceive_15119) {
               return this.mergeFrom((C2S_SignReceive_15119)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignReceive_15119 other) {
            if (other == MidAutumnMsg.C2S_SignReceive_15119.getDefaultInstance()) {
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
            C2S_SignReceive_15119 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignReceive_15119)MidAutumnMsg.C2S_SignReceive_15119.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignReceive_15119)e.getUnfinishedMessage();
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

   public static final class S2C_SignReceive_15120 extends GeneratedMessageV3 implements S2C_SignReceive_15120OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_SignReceive_15120 DEFAULT_INSTANCE = new S2C_SignReceive_15120();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignReceive_15120> PARSER = new AbstractParser<S2C_SignReceive_15120>() {
         public S2C_SignReceive_15120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignReceive_15120(input, extensionRegistry);
         }
      };

      private S2C_SignReceive_15120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignReceive_15120() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignReceive_15120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignReceive_15120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveIds_.addInt(input.readInt32());
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
                  this.receiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_15120.class, Builder.class);
      }

      public List<Integer> getReceiveIdsList() {
         return this.receiveIds_;
      }

      public int getReceiveIdsCount() {
         return this.receiveIds_.size();
      }

      public int getReceiveIds(int index) {
         return this.receiveIds_.getInt(index);
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
         for(int i = 0; i < this.receiveIds_.size(); ++i) {
            output.writeInt32(1, this.receiveIds_.getInt(i));
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

            for(int i = 0; i < this.receiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SignReceive_15120)) {
            return super.equals(obj);
         } else {
            S2C_SignReceive_15120 other = (S2C_SignReceive_15120)obj;
            if (!this.getReceiveIdsList().equals(other.getReceiveIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getReceiveIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SignReceive_15120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_15120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_15120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_15120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_15120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_15120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_15120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_15120 parseFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_15120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_15120 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_15120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_15120 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_15120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_15120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignReceive_15120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignReceive_15120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignReceive_15120> parser() {
         return PARSER;
      }

      public Parser<S2C_SignReceive_15120> getParserForType() {
         return PARSER;
      }

      public S2C_SignReceive_15120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignReceive_15120OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_15120.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = MidAutumnMsg.S2C_SignReceive_15120.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = MidAutumnMsg.S2C_SignReceive_15120.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_SignReceive_15120.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = MidAutumnMsg.S2C_SignReceive_15120.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_SignReceive_15120_descriptor;
         }

         public S2C_SignReceive_15120 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_SignReceive_15120.getDefaultInstance();
         }

         public S2C_SignReceive_15120 build() {
            S2C_SignReceive_15120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignReceive_15120 buildPartial() {
            S2C_SignReceive_15120 result = new S2C_SignReceive_15120(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveIds_ = this.receiveIds_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_SignReceive_15120) {
               return this.mergeFrom((S2C_SignReceive_15120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignReceive_15120 other) {
            if (other == MidAutumnMsg.S2C_SignReceive_15120.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveIds_.isEmpty()) {
                  if (this.receiveIds_.isEmpty()) {
                     this.receiveIds_ = other.receiveIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveIdsIsMutable();
                     this.receiveIds_.addAll(other.receiveIds_);
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
            S2C_SignReceive_15120 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignReceive_15120)MidAutumnMsg.S2C_SignReceive_15120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignReceive_15120)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveIds_ = MidAutumnMsg.S2C_SignReceive_15120.mutableCopy(this.receiveIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveIds_) : this.receiveIds_);
         }

         public int getReceiveIdsCount() {
            return this.receiveIds_.size();
         }

         public int getReceiveIds(int index) {
            return this.receiveIds_.getInt(index);
         }

         public Builder setReceiveIds(int index, int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveIds(int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveIds(Iterable<? extends Integer> values) {
            this.ensureReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveIds() {
            this.receiveIds_ = MidAutumnMsg.S2C_SignReceive_15120.emptyIntList();
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

   public static final class C2S_ShopAddUpInfo_15121 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_15121OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_15121 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_15121();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_15121> PARSER = new AbstractParser<C2S_ShopAddUpInfo_15121>() {
         public C2S_ShopAddUpInfo_15121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_15121(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_15121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_15121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_15121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_15121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_15121.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_15121)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_15121 other = (C2S_ShopAddUpInfo_15121)obj;
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

      public static C2S_ShopAddUpInfo_15121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_15121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_15121 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_15121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_15121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_15121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_15121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_15121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_15121> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_15121> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_15121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_15121OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_15121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_ShopAddUpInfo_15121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ShopAddUpInfo_15121_descriptor;
         }

         public C2S_ShopAddUpInfo_15121 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_ShopAddUpInfo_15121.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_15121 build() {
            C2S_ShopAddUpInfo_15121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_15121 buildPartial() {
            C2S_ShopAddUpInfo_15121 result = new C2S_ShopAddUpInfo_15121(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShopAddUpInfo_15121) {
               return this.mergeFrom((C2S_ShopAddUpInfo_15121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_15121 other) {
            if (other == MidAutumnMsg.C2S_ShopAddUpInfo_15121.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_15121 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_15121)MidAutumnMsg.C2S_ShopAddUpInfo_15121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_15121)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_15122 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_15122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_15122 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_15122();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_15122> PARSER = new AbstractParser<S2C_ShopAddUpInfo_15122>() {
         public S2C_ShopAddUpInfo_15122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_15122(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_15122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_15122() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_15122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_15122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.dailyRecharge_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRewards_.addInt(input.readInt32());
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
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_15122.class, Builder.class);
      }

      public boolean hasDailyRecharge() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDailyRecharge() {
         return this.dailyRecharge_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDailyRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dailyRecharge_);
         }

         for(int i = 0; i < this.gotRewards_.size(); ++i) {
            output.writeInt32(2, this.gotRewards_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.dailyRecharge_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopAddUpInfo_15122)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_15122 other = (S2C_ShopAddUpInfo_15122)obj;
            if (this.hasDailyRecharge() != other.hasDailyRecharge()) {
               return false;
            } else if (this.hasDailyRecharge() && this.getDailyRecharge() != other.getDailyRecharge()) {
               return false;
            } else if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasDailyRecharge()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDailyRecharge();
            }

            if (this.getGotRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_15122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_15122 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_15122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_15122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_15122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_15122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_15122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_15122> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_15122> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_15122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_15122OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_15122.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = MidAutumnMsg.S2C_ShopAddUpInfo_15122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = MidAutumnMsg.S2C_ShopAddUpInfo_15122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_ShopAddUpInfo_15122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = MidAutumnMsg.S2C_ShopAddUpInfo_15122.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ShopAddUpInfo_15122_descriptor;
         }

         public S2C_ShopAddUpInfo_15122 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_ShopAddUpInfo_15122.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_15122 build() {
            S2C_ShopAddUpInfo_15122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_15122 buildPartial() {
            S2C_ShopAddUpInfo_15122 result = new S2C_ShopAddUpInfo_15122(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dailyRecharge_ = this.dailyRecharge_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotRewards_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotRewards_ = this.gotRewards_;
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
            if (other instanceof S2C_ShopAddUpInfo_15122) {
               return this.mergeFrom((S2C_ShopAddUpInfo_15122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_15122 other) {
            if (other == MidAutumnMsg.S2C_ShopAddUpInfo_15122.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDailyRecharge()) {
                  this.setDailyRecharge(other.getDailyRecharge());
               }

               if (!other.gotRewards_.isEmpty()) {
                  if (this.gotRewards_.isEmpty()) {
                     this.gotRewards_ = other.gotRewards_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRewardsIsMutable();
                     this.gotRewards_.addAll(other.gotRewards_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDailyRecharge();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopAddUpInfo_15122 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_15122)MidAutumnMsg.S2C_ShopAddUpInfo_15122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_15122)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDailyRecharge() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDailyRecharge() {
            return this.dailyRecharge_;
         }

         public Builder setDailyRecharge(int value) {
            this.bitField0_ |= 1;
            this.dailyRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyRecharge() {
            this.bitField0_ &= -2;
            this.dailyRecharge_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotRewards_ = MidAutumnMsg.S2C_ShopAddUpInfo_15122.mutableCopy(this.gotRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotRewards_) : this.gotRewards_);
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
            this.gotRewards_ = MidAutumnMsg.S2C_ShopAddUpInfo_15122.emptyIntList();
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

   public static final class C2S_ReceiveShopAddUpReward_15123 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_15123OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_15123 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_15123();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_15123> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_15123>() {
         public C2S_ReceiveShopAddUpReward_15123 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_15123(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_15123(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_15123() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_15123();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_15123(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_15123.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_15123)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_15123 other = (C2S_ReceiveShopAddUpReward_15123)obj;
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

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_15123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_15123 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_15123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_15123 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_15123 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_15123> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_15123> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_15123 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_15123OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_15123.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_ReceiveShopAddUpReward_15123.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_15123_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_15123 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_ReceiveShopAddUpReward_15123.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_15123 build() {
            C2S_ReceiveShopAddUpReward_15123 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_15123 buildPartial() {
            C2S_ReceiveShopAddUpReward_15123 result = new C2S_ReceiveShopAddUpReward_15123(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_15123) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_15123)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_15123 other) {
            if (other == MidAutumnMsg.C2S_ReceiveShopAddUpReward_15123.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_15123 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_15123)MidAutumnMsg.C2S_ReceiveShopAddUpReward_15123.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_15123)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_15124 extends GeneratedMessageV3 implements C2S_FancyReward_15124OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_15124 DEFAULT_INSTANCE = new C2S_FancyReward_15124();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_15124> PARSER = new AbstractParser<C2S_FancyReward_15124>() {
         public C2S_FancyReward_15124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_15124(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_15124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_15124() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_15124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_15124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_15124.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_15124)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_15124 other = (C2S_FancyReward_15124)obj;
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

      public static C2S_FancyReward_15124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_15124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_15124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_15124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_15124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_15124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_15124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_15124 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_15124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_15124 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_15124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_15124 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_15124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_15124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_15124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_15124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_15124> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_15124> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_15124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_15124OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_15124.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_FancyReward_15124.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_FancyReward_15124_descriptor;
         }

         public C2S_FancyReward_15124 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_FancyReward_15124.getDefaultInstance();
         }

         public C2S_FancyReward_15124 build() {
            C2S_FancyReward_15124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_15124 buildPartial() {
            C2S_FancyReward_15124 result = new C2S_FancyReward_15124(this);
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
            if (other instanceof C2S_FancyReward_15124) {
               return this.mergeFrom((C2S_FancyReward_15124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_15124 other) {
            if (other == MidAutumnMsg.C2S_FancyReward_15124.getDefaultInstance()) {
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
            C2S_FancyReward_15124 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_15124)MidAutumnMsg.C2S_FancyReward_15124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_15124)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_15125 extends GeneratedMessageV3 implements S2C_FancyReward_15125OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_15125 DEFAULT_INSTANCE = new S2C_FancyReward_15125();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_15125> PARSER = new AbstractParser<S2C_FancyReward_15125>() {
         public S2C_FancyReward_15125 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_15125(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_15125(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_15125() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_15125();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_15125(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_15125.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_15125)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_15125 other = (S2C_FancyReward_15125)obj;
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

      public static S2C_FancyReward_15125 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_15125 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_15125 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_15125 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_15125 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_15125 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_15125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_15125 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_15125 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_15125 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_15125 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_15125 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_15125 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_15125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_15125 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_15125 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_15125> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_15125> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_15125 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_15125OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_15125.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_FancyReward_15125.alwaysUseFieldBuilders) {
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_FancyReward_15125_descriptor;
         }

         public S2C_FancyReward_15125 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_FancyReward_15125.getDefaultInstance();
         }

         public S2C_FancyReward_15125 build() {
            S2C_FancyReward_15125 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_15125 buildPartial() {
            S2C_FancyReward_15125 result = new S2C_FancyReward_15125(this);
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
            if (other instanceof S2C_FancyReward_15125) {
               return this.mergeFrom((S2C_FancyReward_15125)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_15125 other) {
            if (other == MidAutumnMsg.S2C_FancyReward_15125.getDefaultInstance()) {
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
            S2C_FancyReward_15125 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_15125)MidAutumnMsg.S2C_FancyReward_15125.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_15125)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_15126 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_15126OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_15126 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_15126();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_15126> PARSER = new AbstractParser<C2S_LuckDrawInfo_15126>() {
         public C2S_LuckDrawInfo_15126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_15126(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_15126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_15126() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_15126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_15126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_15126.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_15126)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_15126 other = (C2S_LuckDrawInfo_15126)obj;
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

      public static C2S_LuckDrawInfo_15126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_15126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_15126 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_15126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_15126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_15126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_15126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_15126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_15126> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_15126> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_15126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_15126OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_15126.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_LuckDrawInfo_15126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_LuckDrawInfo_15126_descriptor;
         }

         public C2S_LuckDrawInfo_15126 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_LuckDrawInfo_15126.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_15126 build() {
            C2S_LuckDrawInfo_15126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_15126 buildPartial() {
            C2S_LuckDrawInfo_15126 result = new C2S_LuckDrawInfo_15126(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_15126) {
               return this.mergeFrom((C2S_LuckDrawInfo_15126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_15126 other) {
            if (other == MidAutumnMsg.C2S_LuckDrawInfo_15126.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_15126 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_15126)MidAutumnMsg.C2S_LuckDrawInfo_15126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_15126)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_15127 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_15127OrBuilder {
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
      public static final int LOTTERYSTAGE_FIELD_NUMBER = 6;
      private int lotteryStage_;
      public static final int FANCYID_FIELD_NUMBER = 7;
      private int fancyId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckDrawInfo_15127 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_15127();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_15127> PARSER = new AbstractParser<S2C_LuckDrawInfo_15127>() {
         public S2C_LuckDrawInfo_15127 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_15127(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_15127(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_15127() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_15127();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_15127(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.lotteryStage_ = input.readInt32();
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_15127.class, Builder.class);
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

      public boolean hasLotteryStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLotteryStage() {
         return this.lotteryStage_;
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
         } else if (!this.hasLotteryStage()) {
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
            output.writeInt32(6, this.lotteryStage_);
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
               size += CodedOutputStream.computeInt32Size(6, this.lotteryStage_);
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
         } else if (!(obj instanceof S2C_LuckDrawInfo_15127)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_15127 other = (S2C_LuckDrawInfo_15127)obj;
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
            } else if (this.hasLotteryStage() != other.hasLotteryStage()) {
               return false;
            } else if (this.hasLotteryStage() && this.getLotteryStage() != other.getLotteryStage()) {
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

            if (this.hasLotteryStage()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLotteryStage();
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

      public static S2C_LuckDrawInfo_15127 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_15127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_15127 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_15127 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_15127 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_15127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_15127 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_15127 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_15127> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_15127> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_15127 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_15127OrBuilder {
         private int bitField0_;
         private int drawTimes_;
         private Internal.IntList hadRewardId_;
         private long stagEndTime_;
         private int recruitNum_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int lotteryStage_;
         private int fancyId_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_15127.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_LuckDrawInfo_15127.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.emptyIntList();
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

            this.lotteryStage_ = 0;
            this.bitField0_ &= -33;
            this.fancyId_ = 0;
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_LuckDrawInfo_15127_descriptor;
         }

         public S2C_LuckDrawInfo_15127 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_LuckDrawInfo_15127.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_15127 build() {
            S2C_LuckDrawInfo_15127 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_15127 buildPartial() {
            S2C_LuckDrawInfo_15127 result = new S2C_LuckDrawInfo_15127(this);
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
               result.lotteryStage_ = this.lotteryStage_;
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
            if (other instanceof S2C_LuckDrawInfo_15127) {
               return this.mergeFrom((S2C_LuckDrawInfo_15127)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_15127 other) {
            if (other == MidAutumnMsg.S2C_LuckDrawInfo_15127.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasLotteryStage()) {
                  this.setLotteryStage(other.getLotteryStage());
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
            } else if (!this.hasLotteryStage()) {
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
            S2C_LuckDrawInfo_15127 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_15127)MidAutumnMsg.S2C_LuckDrawInfo_15127.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_15127)e.getUnfinishedMessage();
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
               this.hadRewardId_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = MidAutumnMsg.S2C_LuckDrawInfo_15127.emptyIntList();
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

         public boolean hasLotteryStage() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLotteryStage() {
            return this.lotteryStage_;
         }

         public Builder setLotteryStage(int value) {
            this.bitField0_ |= 32;
            this.lotteryStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryStage() {
            this.bitField0_ &= -33;
            this.lotteryStage_ = 0;
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

   public static final class C2S_Draw_15128 extends GeneratedMessageV3 implements C2S_Draw_15128OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_15128 DEFAULT_INSTANCE = new C2S_Draw_15128();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_15128> PARSER = new AbstractParser<C2S_Draw_15128>() {
         public C2S_Draw_15128 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_15128(input, extensionRegistry);
         }
      };

      private C2S_Draw_15128(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_15128() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_15128();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_15128(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_15128.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_15128)) {
            return super.equals(obj);
         } else {
            C2S_Draw_15128 other = (C2S_Draw_15128)obj;
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

      public static C2S_Draw_15128 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data);
      }

      public static C2S_Draw_15128 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_15128 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data);
      }

      public static C2S_Draw_15128 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_15128 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data);
      }

      public static C2S_Draw_15128 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_15128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_15128 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_15128 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_15128 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_15128 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_15128 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_15128 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_15128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_15128 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_15128 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_15128> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_15128> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_15128 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_15128OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_15128.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_Draw_15128.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Draw_15128_descriptor;
         }

         public C2S_Draw_15128 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_Draw_15128.getDefaultInstance();
         }

         public C2S_Draw_15128 build() {
            C2S_Draw_15128 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_15128 buildPartial() {
            C2S_Draw_15128 result = new C2S_Draw_15128(this);
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
            if (other instanceof C2S_Draw_15128) {
               return this.mergeFrom((C2S_Draw_15128)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_15128 other) {
            if (other == MidAutumnMsg.C2S_Draw_15128.getDefaultInstance()) {
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
            C2S_Draw_15128 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_15128)MidAutumnMsg.C2S_Draw_15128.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_15128)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_15129 extends GeneratedMessageV3 implements S2C_Draw_15129OrBuilder {
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
      private static final S2C_Draw_15129 DEFAULT_INSTANCE = new S2C_Draw_15129();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_15129> PARSER = new AbstractParser<S2C_Draw_15129>() {
         public S2C_Draw_15129 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_15129(input, extensionRegistry);
         }
      };

      private S2C_Draw_15129(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_15129() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_15129();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_15129(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_15129.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_15129)) {
            return super.equals(obj);
         } else {
            S2C_Draw_15129 other = (S2C_Draw_15129)obj;
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

      public static S2C_Draw_15129 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data);
      }

      public static S2C_Draw_15129 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_15129 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data);
      }

      public static S2C_Draw_15129 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_15129 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data);
      }

      public static S2C_Draw_15129 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_15129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_15129 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_15129 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_15129 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_15129 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_15129 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_15129 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_15129)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_15129 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_15129 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_15129> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_15129> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_15129 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_15129OrBuilder {
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_15129.class, Builder.class);
         }

         private Builder() {
            this.id_ = MidAutumnMsg.S2C_Draw_15129.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = MidAutumnMsg.S2C_Draw_15129.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_Draw_15129.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = MidAutumnMsg.S2C_Draw_15129.emptyIntList();
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Draw_15129_descriptor;
         }

         public S2C_Draw_15129 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_Draw_15129.getDefaultInstance();
         }

         public S2C_Draw_15129 build() {
            S2C_Draw_15129 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_15129 buildPartial() {
            S2C_Draw_15129 result = new S2C_Draw_15129(this);
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
            if (other instanceof S2C_Draw_15129) {
               return this.mergeFrom((S2C_Draw_15129)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_15129 other) {
            if (other == MidAutumnMsg.S2C_Draw_15129.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = MidAutumnMsg.S2C_Draw_15129.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_15129 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_15129)MidAutumnMsg.S2C_Draw_15129.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_15129)e.getUnfinishedMessage();
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
               this.id_ = MidAutumnMsg.S2C_Draw_15129.mutableCopy(this.id_);
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
            this.id_ = MidAutumnMsg.S2C_Draw_15129.emptyIntList();
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

   public static final class C2S_OpenReward_15130 extends GeneratedMessageV3 implements C2S_OpenReward_15130OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_15130 DEFAULT_INSTANCE = new C2S_OpenReward_15130();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_15130> PARSER = new AbstractParser<C2S_OpenReward_15130>() {
         public C2S_OpenReward_15130 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_15130(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_15130(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_15130() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_15130();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_15130(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_15130.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_15130)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_15130 other = (C2S_OpenReward_15130)obj;
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

      public static C2S_OpenReward_15130 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_15130 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_15130 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_15130 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_15130 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_15130 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_15130)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_15130 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_15130 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_15130 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_15130 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_15130 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_15130 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_15130)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_15130 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_15130 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_15130> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_15130> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_15130 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_15130OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_15130.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_OpenReward_15130.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_OpenReward_15130_descriptor;
         }

         public C2S_OpenReward_15130 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_OpenReward_15130.getDefaultInstance();
         }

         public C2S_OpenReward_15130 build() {
            C2S_OpenReward_15130 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_15130 buildPartial() {
            C2S_OpenReward_15130 result = new C2S_OpenReward_15130(this);
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
            if (other instanceof C2S_OpenReward_15130) {
               return this.mergeFrom((C2S_OpenReward_15130)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_15130 other) {
            if (other == MidAutumnMsg.C2S_OpenReward_15130.getDefaultInstance()) {
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
            C2S_OpenReward_15130 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_15130)MidAutumnMsg.C2S_OpenReward_15130.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_15130)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_15131 extends GeneratedMessageV3 implements S2C_OpenReward_15131OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_15131 DEFAULT_INSTANCE = new S2C_OpenReward_15131();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_15131> PARSER = new AbstractParser<S2C_OpenReward_15131>() {
         public S2C_OpenReward_15131 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_15131(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_15131(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_15131() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_15131();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_15131(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_15131.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_15131)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_15131 other = (S2C_OpenReward_15131)obj;
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

      public static S2C_OpenReward_15131 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_15131 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_15131 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_15131 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_15131 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_15131 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_15131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_15131 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_15131 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_15131 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_15131 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_15131 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_15131 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_15131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_15131 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_15131 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_15131> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_15131> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_15131 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_15131OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_15131.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_OpenReward_15131.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_OpenReward_15131_descriptor;
         }

         public S2C_OpenReward_15131 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_OpenReward_15131.getDefaultInstance();
         }

         public S2C_OpenReward_15131 build() {
            S2C_OpenReward_15131 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_15131 buildPartial() {
            S2C_OpenReward_15131 result = new S2C_OpenReward_15131(this);
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
            if (other instanceof S2C_OpenReward_15131) {
               return this.mergeFrom((S2C_OpenReward_15131)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_15131 other) {
            if (other == MidAutumnMsg.S2C_OpenReward_15131.getDefaultInstance()) {
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
            S2C_OpenReward_15131 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_15131)MidAutumnMsg.S2C_OpenReward_15131.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_15131)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_15132 extends GeneratedMessageV3 implements C2S_DrawRecord_15132OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_15132 DEFAULT_INSTANCE = new C2S_DrawRecord_15132();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_15132> PARSER = new AbstractParser<C2S_DrawRecord_15132>() {
         public C2S_DrawRecord_15132 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_15132(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_15132(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_15132() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_15132();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_15132(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_15132.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_15132)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_15132 other = (C2S_DrawRecord_15132)obj;
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

      public static C2S_DrawRecord_15132 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_15132 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_15132 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_15132 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_15132 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_15132 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_15132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_15132 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_15132 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_15132 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_15132 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_15132 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_15132 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_15132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_15132 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_15132 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_15132> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_15132> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_15132 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_15132OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_15132.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_DrawRecord_15132.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_DrawRecord_15132_descriptor;
         }

         public C2S_DrawRecord_15132 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_DrawRecord_15132.getDefaultInstance();
         }

         public C2S_DrawRecord_15132 build() {
            C2S_DrawRecord_15132 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_15132 buildPartial() {
            C2S_DrawRecord_15132 result = new C2S_DrawRecord_15132(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_15132) {
               return this.mergeFrom((C2S_DrawRecord_15132)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_15132 other) {
            if (other == MidAutumnMsg.C2S_DrawRecord_15132.getDefaultInstance()) {
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
            C2S_DrawRecord_15132 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_15132)MidAutumnMsg.C2S_DrawRecord_15132.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_15132)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_15133 extends GeneratedMessageV3 implements S2C_DrawRecord_15133OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_15133 DEFAULT_INSTANCE = new S2C_DrawRecord_15133();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_15133> PARSER = new AbstractParser<S2C_DrawRecord_15133>() {
         public S2C_DrawRecord_15133 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_15133(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_15133(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_15133() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_15133();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_15133(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.myRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.myRecord_.add(input.readMessage(MidAutumnMsg.MyDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_15133.class, Builder.class);
      }

      public List<MyDrawRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public MyDrawRecord getMyRecord(int index) {
         return (MyDrawRecord)this.myRecord_.get(index);
      }

      public MyDrawRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (MyDrawRecordOrBuilder)this.myRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.myRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.myRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.myRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.myRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DrawRecord_15133)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_15133 other = (S2C_DrawRecord_15133)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DrawRecord_15133 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_15133 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_15133 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_15133 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_15133 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_15133 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_15133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_15133 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_15133 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_15133 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_15133 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_15133 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_15133 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_15133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_15133 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_15133 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_15133> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_15133> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_15133 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_15133OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_15133.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.S2C_DrawRecord_15133.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_DrawRecord_15133_descriptor;
         }

         public S2C_DrawRecord_15133 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_DrawRecord_15133.getDefaultInstance();
         }

         public S2C_DrawRecord_15133 build() {
            S2C_DrawRecord_15133 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_15133 buildPartial() {
            S2C_DrawRecord_15133 result = new S2C_DrawRecord_15133(this);
            int from_bitField0_ = this.bitField0_;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
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
            if (other instanceof S2C_DrawRecord_15133) {
               return this.mergeFrom((S2C_DrawRecord_15133)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_15133 other) {
            if (other == MidAutumnMsg.S2C_DrawRecord_15133.getDefaultInstance()) {
               return this;
            } else {
               if (this.myRecordBuilder_ == null) {
                  if (!other.myRecord_.isEmpty()) {
                     if (this.myRecord_.isEmpty()) {
                        this.myRecord_ = other.myRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMyRecordIsMutable();
                        this.myRecord_.addAll(other.myRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecord_.isEmpty()) {
                  if (this.myRecordBuilder_.isEmpty()) {
                     this.myRecordBuilder_.dispose();
                     this.myRecordBuilder_ = null;
                     this.myRecord_ = other.myRecord_;
                     this.bitField0_ &= -2;
                     this.myRecordBuilder_ = MidAutumnMsg.S2C_DrawRecord_15133.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DrawRecord_15133 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_15133)MidAutumnMsg.S2C_DrawRecord_15133.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_15133)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMyRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.myRecord_ = new ArrayList(this.myRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<MyDrawRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public MyDrawRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (MyDrawRecord)this.myRecord_.get(index) : (MyDrawRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecord(int index, MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecord(int index, MyDrawRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecord(MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, MyDrawRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends MyDrawRecord> values) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecord_);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecord() {
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecord(int index) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.remove(index);
               this.onChanged();
            } else {
               this.myRecordBuilder_.remove(index);
            }

            return this;
         }

         public MyDrawRecord.Builder getMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public MyDrawRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (MyDrawRecordOrBuilder)this.myRecord_.get(index) : (MyDrawRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public MyDrawRecord.Builder addMyRecordBuilder() {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(MidAutumnMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, MidAutumnMsg.MyDrawRecord.getDefaultInstance());
         }

         public List<MyDrawRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ServerDrawRecord_15134 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_15134OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_15134 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_15134();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_15134> PARSER = new AbstractParser<C2S_ServerDrawRecord_15134>() {
         public C2S_ServerDrawRecord_15134 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_15134(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_15134(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_15134() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_15134();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_15134(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_15134.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_15134)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_15134 other = (C2S_ServerDrawRecord_15134)obj;
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

      public static C2S_ServerDrawRecord_15134 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_15134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_15134 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_15134 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_15134 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_15134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_15134 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_15134 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_15134> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_15134> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_15134 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_15134OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_15134.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MidAutumnMsg.C2S_ServerDrawRecord_15134.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_ServerDrawRecord_15134_descriptor;
         }

         public C2S_ServerDrawRecord_15134 getDefaultInstanceForType() {
            return MidAutumnMsg.C2S_ServerDrawRecord_15134.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_15134 build() {
            C2S_ServerDrawRecord_15134 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_15134 buildPartial() {
            C2S_ServerDrawRecord_15134 result = new C2S_ServerDrawRecord_15134(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_15134) {
               return this.mergeFrom((C2S_ServerDrawRecord_15134)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_15134 other) {
            if (other == MidAutumnMsg.C2S_ServerDrawRecord_15134.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_15134 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_15134)MidAutumnMsg.C2S_ServerDrawRecord_15134.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_15134)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_15135 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_15135OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_15135 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_15135();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_15135> PARSER = new AbstractParser<S2C_ServerDrawRecord_15135>() {
         public S2C_ServerDrawRecord_15135 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_15135(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_15135(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_15135() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_15135();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_15135(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.serverRecord_.add(input.readMessage(MidAutumnMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_15135.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_15135)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_15135 other = (S2C_ServerDrawRecord_15135)obj;
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

      public static S2C_ServerDrawRecord_15135 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_15135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_15135 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_15135 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_15135 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_15135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_15135 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_15135 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_15135> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_15135> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_15135 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_15135OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_15135.class, Builder.class);
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
            if (MidAutumnMsg.S2C_ServerDrawRecord_15135.alwaysUseFieldBuilders) {
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_ServerDrawRecord_15135_descriptor;
         }

         public S2C_ServerDrawRecord_15135 getDefaultInstanceForType() {
            return MidAutumnMsg.S2C_ServerDrawRecord_15135.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_15135 build() {
            S2C_ServerDrawRecord_15135 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_15135 buildPartial() {
            S2C_ServerDrawRecord_15135 result = new S2C_ServerDrawRecord_15135(this);
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
            if (other instanceof S2C_ServerDrawRecord_15135) {
               return this.mergeFrom((S2C_ServerDrawRecord_15135)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_15135 other) {
            if (other == MidAutumnMsg.S2C_ServerDrawRecord_15135.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = MidAutumnMsg.S2C_ServerDrawRecord_15135.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_15135 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_15135)MidAutumnMsg.S2C_ServerDrawRecord_15135.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_15135)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(MidAutumnMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, MidAutumnMsg.ServerDrawRecord.getDefaultInstance());
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

   public static final class MyDrawRecord extends GeneratedMessageV3 implements MyDrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int ITEMINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> itemInfo_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final MyDrawRecord DEFAULT_INSTANCE = new MyDrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<MyDrawRecord> PARSER = new AbstractParser<MyDrawRecord>() {
         public MyDrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MyDrawRecord(input, extensionRegistry);
         }
      };

      private MyDrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MyDrawRecord() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MyDrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MyDrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
         } else if (!(obj instanceof MyDrawRecord)) {
            return super.equals(obj);
         } else {
            MyDrawRecord other = (MyDrawRecord)obj;
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

      public static MyDrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data);
      }

      public static MyDrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MyDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(InputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MyDrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MyDrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MyDrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MyDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MyDrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MyDrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MyDrawRecord> parser() {
         return PARSER;
      }

      public Parser<MyDrawRecord> getParserForType() {
         return PARSER;
      }

      public MyDrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MyDrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (MidAutumnMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return MidAutumnMsg.MyDrawRecord.getDefaultInstance();
         }

         public MyDrawRecord build() {
            MyDrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MyDrawRecord buildPartial() {
            MyDrawRecord result = new MyDrawRecord(this);
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
            if (other instanceof MyDrawRecord) {
               return this.mergeFrom((MyDrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MyDrawRecord other) {
            if (other == MidAutumnMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = MidAutumnMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
            MyDrawRecord parsedMessage = null;

            try {
               parsedMessage = (MyDrawRecord)MidAutumnMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MyDrawRecord)e.getUnfinishedMessage();
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
            this.playerName_ = MidAutumnMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
      public static final int STAGE_FIELD_NUMBER = 5;
      private int stage_;
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
                     case 40:
                        this.bitField0_ |= 16;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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

      public boolean hasStage() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStage() {
         return this.stage_;
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

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.stage_);
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

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.stage_);
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
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasStage()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStage();
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
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (MidAutumnMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            this.stage_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MidAutumnMsg.internal_static_midAutumn_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return MidAutumnMsg.ServerDrawRecord.getDefaultInstance();
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

            if ((from_bitField0_ & 16) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof ServerDrawRecord) {
               return this.mergeFrom((ServerDrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ServerDrawRecord other) {
            if (other == MidAutumnMsg.ServerDrawRecord.getDefaultInstance()) {
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

               if (other.hasStage()) {
                  this.setStage(other.getStage());
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
               parsedMessage = (ServerDrawRecord)MidAutumnMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = MidAutumnMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

         public boolean hasStage() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 16;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -17;
            this.stage_ = 0;
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

   public interface C2S_DrawRecord_15132OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_15128OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_ExitBanquet_15105OrBuilder extends MessageOrBuilder {
      boolean hasScore();

      int getScore();

      List<Integer> getGuestList();

      int getGuestCount();

      int getGuest(int index);
   }

   public interface C2S_FancyReward_15124OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_LuckDrawInfo_15126OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Main_15101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_15130OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_PlayFinish_15107OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_PrayEnjoy_15115OrBuilder extends MessageOrBuilder {
      boolean hasEnjoy();

      int getEnjoy();
   }

   public interface C2S_Pray_15117OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface C2S_ReceiveShopAddUpReward_15123OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_15134OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_15121OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignReceive_15119OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TaskReward_15111OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_WalkReward_15113OrBuilder extends MessageOrBuilder {
   }

   public interface MyDrawRecordOrBuilder extends MessageOrBuilder {
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

   public interface S2C_DrawRecord_15133OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_15129OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ExitBanquet_15106OrBuilder extends MessageOrBuilder {
      boolean hasScore();

      int getScore();

      List<Integer> getGuestList();

      int getGuestCount();

      int getGuest(int index);

      boolean hasEnterCount();

      int getEnterCount();

      boolean hasFirstBanquet();

      boolean getFirstBanquet();
   }

   public interface S2C_FancyReward_15125OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_LuckDrawInfo_15127OrBuilder extends MessageOrBuilder {
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

      boolean hasLotteryStage();

      int getLotteryStage();

      boolean hasFancyId();

      int getFancyId();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_Main_15102OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();

      boolean hasEnterCount();

      int getEnterCount();

      List<Integer> getGotSiteRewardList();

      int getGotSiteRewardCount();

      int getGotSiteReward(int index);

      boolean hasTier();

      int getTier();

      boolean hasEnjoy();

      int getEnjoy();

      List<Integer> getFinishShowList();

      int getFinishShowCount();

      int getFinishShow(int index);

      List<Integer> getGotRewardIdList();

      int getGotRewardIdCount();

      int getGotRewardId(int index);

      List<Integer> getTierRewardIdList();

      int getTierRewardIdCount();

      int getTierRewardId(int index);

      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);

      boolean hasFirstBanquet();

      boolean getFirstBanquet();

      boolean hasGotWalk();

      boolean getGotWalk();

      List<Integer> getSignReceiveIdsList();

      int getSignReceiveIdsCount();

      int getSignReceiveIds(int index);

      boolean hasActivityOpenDay();

      int getActivityOpenDay();
   }

   public interface S2C_OpenReward_15131OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PlayFinish_15108OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PrayEnjoy_15116OrBuilder extends MessageOrBuilder {
      boolean hasEnjoy();

      int getEnjoy();
   }

   public interface S2C_Pray_15118OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();

      boolean hasTier();

      int getTier();

      boolean hasEnjoy();

      int getEnjoy();

      List<Integer> getGotRewardIdList();

      int getGotRewardIdCount();

      int getGotRewardId(int index);

      List<Integer> getTierRewardIdList();

      int getTierRewardIdCount();

      int getTierRewardId(int index);
   }

   public interface S2C_ServerDrawRecord_15135OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_15122OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);
   }

   public interface S2C_SignReceive_15120OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_TaskNotify_15110OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TaskReward_15112OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_WalkReward_15114OrBuilder extends MessageOrBuilder {
      boolean hasGotWalk();

      boolean getGotWalk();
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

      boolean hasStage();

      int getStage();
   }

   public interface TaskFinishOrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();

      boolean hasFinishCount();

      int getFinishCount();
   }
}
