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

public final class YuanDanMsg {
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private YuanDanMsg() {
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
      String[] descriptorData = new String[]{"\n\rYuanDan.proto\u0012\u0019yuanDan.com.gzbz.protobuf\u001a\fcommon.proto\".\n\nTaskFinish\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bfinishCount\u0018\u0002 \u0002(\u0005\"\u0010\n\u000eC2S_Main_22601\"\u0098\u0002\n\u000eS2C_Main_22602\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nenterCount\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rgotSiteReward\u0018\u0003 \u0003(\u0005\u0012\f\n\u0004tier\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005enjoy\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nfinishShow\u0018\u0006 \u0003(\u0005\u0012\u0013\n\u000bgotRewardId\u0018\u0007 \u0003(\u0005\u0012\u0014\n\ftierRewardId\u0018\b \u0003(\u0005\u0012\u001a\n\u0004task\u0018\t \u0003(\u000b2\f.common.Task\u0012\u0014\n\ffirstBanquet\u0018\n \u0002(\b\u0012\u000f\n\u0007gotWalk\u0018\u000b \u0002(\b\u0012\u0016\n\u000esignReceiveIds\u0018\f \u0003(\u0005\u0012\u0017\n\u000factivityOpenDay\u0018\r \u0002(\u0005\"5\n\u0015C2S_ExitBanquet_22605\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\"_\n\u0015S2C_ExitBanquet_22606\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nenterCount\u0018\u0003 \u0002(\u0005\u0012\u0014\n\ffirstBanquet\u0018\u0004 \u0002(\b\"\"\n\u0014C2S_PlayFinish_22607\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_PlayFinish_22608\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"2\n\u0014S2C_TaskNotify_22610\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"&\n\u0014C2S_TaskReward_22611\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_TaskReward_22612\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_WalkReward_22613\"'\n\u0014S2C_WalkReward_22614\u0012\u000f\n\u0007gotWalk\u0018\u0001 \u0002(\b\"$\n\u0013C2S_PrayEnjoy_22615\u0012\r\n\u0005enjoy\u0018\u0001 \u0002(\u0005\"$\n\u0013S2C_PrayEnjoy_22616\u0012\r\n\u0005enjoy\u0018\u0001 \u0002(\u0005\"\u001f\n\u000eC2S_Pray_22617\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"g\n\u000eS2C_Pray_22618\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004tier\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005enjoy\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bgotRewardId\u0018\u0004 \u0003(\u0005\u0012\u0014\n\ftierRewardId\u0018\u0005 \u0003(\u0005\"\u0017\n\u0015C2S_SignReceive_22619\"+\n\u0015S2C_SignReceive_22620\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"\u0019\n\u0017C2S_ShopAddUpInfo_22621\"j\n\u0017S2C_ShopAddUpInfo_22622\u0012\u0015\n\rdailyRecharge\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007openDay\u0018\u0004 \u0002(\u0005\".\n C2S_ReceiveShopAddUpReward_22623\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_22624\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_22625\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_22626\"è\u0001\n\u0016S2C_LuckDrawInfo_22627\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\u0012\u000f\n\u0007openDay\u0018\t \u0002(\u0005\"\u001e\n\u000eC2S_Draw_22628\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_22629\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_22630\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_22631\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_22632\"Q\n\u0014S2C_DrawRecord_22633\u00129\n\bmyRecord\u0018\u0001 \u0003(\u000b2'.yuanDan.com.gzbz.protobuf.MyDrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_22634\"_\n\u001aS2C_ServerDrawRecord_22635\u0012A\n\fserverRecord\u0018\u0001 \u0003(\u000b2+.yuanDan.com.gzbz.protobuf.ServerDrawRecord\"Z\n\fMyDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"r\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0005 \u0001(\u0005B!\n\u0011com.gzbz.protobufB\nYuanDanMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor, new String[]{"Day", "FinishCount"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor, new String[]{"Day", "EnterCount", "GotSiteReward", "Tier", "Enjoy", "FinishShow", "GotRewardId", "TierRewardId", "Task", "FirstBanquet", "GotWalk", "SignReceiveIds", "ActivityOpenDay"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor, new String[]{"Score", "Guest"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor, new String[]{"Score", "Guest", "EnterCount", "FirstBanquet"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor, new String[]{"Id"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor, new String[]{"Id"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor, new String[]{"Task"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor, new String[]{"TaskId"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor, new String[]{"TaskId"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor, new String[]{"GotWalk"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor, new String[]{"Enjoy"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor, new String[]{"Enjoy"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor, new String[]{"Count"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor, new String[]{"Count", "Tier", "Enjoy", "GotRewardId", "TierRewardId"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor, new String[]{"ReceiveIds"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor, new String[]{"DailyRecharge", "GotRewards", "ActivityDay", "OpenDay"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor, new String[]{"Id"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor, new String[]{"TargetId"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor, new String[]{"Result", "TargetId"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes", "OpenDay"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor, new String[]{"Type"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor, new String[]{"Id"});
      internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor, new String[]{"Id"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor, new String[]{"MyRecord"});
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor, new String[0]);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor, new String[]{"ServerRecord"});
      internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId", "Stage"});
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskFinish.class, Builder.class);
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskFinish.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.TaskFinish.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_TaskFinish_descriptor;
         }

         public TaskFinish getDefaultInstanceForType() {
            return YuanDanMsg.TaskFinish.getDefaultInstance();
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
            if (other == YuanDanMsg.TaskFinish.getDefaultInstance()) {
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
               parsedMessage = (TaskFinish)YuanDanMsg.TaskFinish.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_Main_22601 extends GeneratedMessageV3 implements C2S_Main_22601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_22601 DEFAULT_INSTANCE = new C2S_Main_22601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_22601> PARSER = new AbstractParser<C2S_Main_22601>() {
         public C2S_Main_22601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_22601(input, extensionRegistry);
         }
      };

      private C2S_Main_22601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_22601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_22601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_22601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_22601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_22601)) {
            return super.equals(obj);
         } else {
            C2S_Main_22601 other = (C2S_Main_22601)obj;
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

      public static C2S_Main_22601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data);
      }

      public static C2S_Main_22601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data);
      }

      public static C2S_Main_22601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data);
      }

      public static C2S_Main_22601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22601 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_22601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_22601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_22601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_22601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_22601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_22601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_22601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_22601> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_22601> getParserForType() {
         return PARSER;
      }

      public C2S_Main_22601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_22601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_22601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_Main_22601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Main_22601_descriptor;
         }

         public C2S_Main_22601 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_Main_22601.getDefaultInstance();
         }

         public C2S_Main_22601 build() {
            C2S_Main_22601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_22601 buildPartial() {
            C2S_Main_22601 result = new C2S_Main_22601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Main_22601) {
               return this.mergeFrom((C2S_Main_22601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_22601 other) {
            if (other == YuanDanMsg.C2S_Main_22601.getDefaultInstance()) {
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
            C2S_Main_22601 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_22601)YuanDanMsg.C2S_Main_22601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_22601)e.getUnfinishedMessage();
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

   public static final class S2C_Main_22602 extends GeneratedMessageV3 implements S2C_Main_22602OrBuilder {
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
      private static final S2C_Main_22602 DEFAULT_INSTANCE = new S2C_Main_22602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_22602> PARSER = new AbstractParser<S2C_Main_22602>() {
         public S2C_Main_22602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_22602(input, extensionRegistry);
         }
      };

      private S2C_Main_22602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_22602() {
         this.memoizedIsInitialized = -1;
         this.gotSiteReward_ = emptyIntList();
         this.finishShow_ = emptyIntList();
         this.gotRewardId_ = emptyIntList();
         this.tierRewardId_ = emptyIntList();
         this.task_ = Collections.emptyList();
         this.signReceiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_22602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_22602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_22602.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Main_22602)) {
            return super.equals(obj);
         } else {
            S2C_Main_22602 other = (S2C_Main_22602)obj;
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

      public static S2C_Main_22602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data);
      }

      public static S2C_Main_22602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data);
      }

      public static S2C_Main_22602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data);
      }

      public static S2C_Main_22602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22602 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_22602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_22602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_22602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_22602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_22602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_22602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_22602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_22602> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_22602> getParserForType() {
         return PARSER;
      }

      public S2C_Main_22602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_22602OrBuilder {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_22602.class, Builder.class);
         }

         private Builder() {
            this.gotSiteReward_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.finishShow_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.gotRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.tierRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.task_ = Collections.emptyList();
            this.signReceiveIds_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotSiteReward_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.finishShow_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.gotRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.tierRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.task_ = Collections.emptyList();
            this.signReceiveIds_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_Main_22602.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            this.enterCount_ = 0;
            this.bitField0_ &= -3;
            this.gotSiteReward_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -5;
            this.tier_ = 0;
            this.bitField0_ &= -9;
            this.enjoy_ = 0;
            this.bitField0_ &= -17;
            this.finishShow_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -33;
            this.gotRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -65;
            this.tierRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
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
            this.signReceiveIds_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -2049;
            this.activityOpenDay_ = 0;
            this.bitField0_ &= -4097;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Main_22602_descriptor;
         }

         public S2C_Main_22602 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_Main_22602.getDefaultInstance();
         }

         public S2C_Main_22602 build() {
            S2C_Main_22602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_22602 buildPartial() {
            S2C_Main_22602 result = new S2C_Main_22602(this);
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
            if (other instanceof S2C_Main_22602) {
               return this.mergeFrom((S2C_Main_22602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_22602 other) {
            if (other == YuanDanMsg.S2C_Main_22602.getDefaultInstance()) {
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
                     this.taskBuilder_ = YuanDanMsg.S2C_Main_22602.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_Main_22602 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_22602)YuanDanMsg.S2C_Main_22602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_22602)e.getUnfinishedMessage();
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
               this.gotSiteReward_ = YuanDanMsg.S2C_Main_22602.mutableCopy(this.gotSiteReward_);
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
            this.gotSiteReward_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
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
               this.finishShow_ = YuanDanMsg.S2C_Main_22602.mutableCopy(this.finishShow_);
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
            this.finishShow_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardIdIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.gotRewardId_ = YuanDanMsg.S2C_Main_22602.mutableCopy(this.gotRewardId_);
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
            this.gotRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         private void ensureTierRewardIdIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.tierRewardId_ = YuanDanMsg.S2C_Main_22602.mutableCopy(this.tierRewardId_);
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
            this.tierRewardId_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
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
               this.signReceiveIds_ = YuanDanMsg.S2C_Main_22602.mutableCopy(this.signReceiveIds_);
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
            this.signReceiveIds_ = YuanDanMsg.S2C_Main_22602.emptyIntList();
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

   public static final class C2S_ExitBanquet_22605 extends GeneratedMessageV3 implements C2S_ExitBanquet_22605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCORE_FIELD_NUMBER = 1;
      private int score_;
      public static final int GUEST_FIELD_NUMBER = 2;
      private Internal.IntList guest_;
      private byte memoizedIsInitialized;
      private static final C2S_ExitBanquet_22605 DEFAULT_INSTANCE = new C2S_ExitBanquet_22605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExitBanquet_22605> PARSER = new AbstractParser<C2S_ExitBanquet_22605>() {
         public C2S_ExitBanquet_22605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExitBanquet_22605(input, extensionRegistry);
         }
      };

      private C2S_ExitBanquet_22605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExitBanquet_22605() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExitBanquet_22605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExitBanquet_22605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitBanquet_22605.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ExitBanquet_22605)) {
            return super.equals(obj);
         } else {
            C2S_ExitBanquet_22605 other = (C2S_ExitBanquet_22605)obj;
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

      public static C2S_ExitBanquet_22605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_22605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_22605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_22605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_22605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data);
      }

      public static C2S_ExitBanquet_22605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExitBanquet_22605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExitBanquet_22605 parseFrom(InputStream input) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_22605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitBanquet_22605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_22605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExitBanquet_22605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExitBanquet_22605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExitBanquet_22605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExitBanquet_22605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExitBanquet_22605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExitBanquet_22605> parser() {
         return PARSER;
      }

      public Parser<C2S_ExitBanquet_22605> getParserForType() {
         return PARSER;
      }

      public C2S_ExitBanquet_22605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExitBanquet_22605OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExitBanquet_22605.class, Builder.class);
         }

         private Builder() {
            this.guest_ = YuanDanMsg.C2S_ExitBanquet_22605.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = YuanDanMsg.C2S_ExitBanquet_22605.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_ExitBanquet_22605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = YuanDanMsg.C2S_ExitBanquet_22605.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ExitBanquet_22605_descriptor;
         }

         public C2S_ExitBanquet_22605 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_ExitBanquet_22605.getDefaultInstance();
         }

         public C2S_ExitBanquet_22605 build() {
            C2S_ExitBanquet_22605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExitBanquet_22605 buildPartial() {
            C2S_ExitBanquet_22605 result = new C2S_ExitBanquet_22605(this);
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
            if (other instanceof C2S_ExitBanquet_22605) {
               return this.mergeFrom((C2S_ExitBanquet_22605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExitBanquet_22605 other) {
            if (other == YuanDanMsg.C2S_ExitBanquet_22605.getDefaultInstance()) {
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
            C2S_ExitBanquet_22605 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExitBanquet_22605)YuanDanMsg.C2S_ExitBanquet_22605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExitBanquet_22605)e.getUnfinishedMessage();
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
               this.guest_ = YuanDanMsg.C2S_ExitBanquet_22605.mutableCopy(this.guest_);
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
            this.guest_ = YuanDanMsg.C2S_ExitBanquet_22605.emptyIntList();
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

   public static final class S2C_ExitBanquet_22606 extends GeneratedMessageV3 implements S2C_ExitBanquet_22606OrBuilder {
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
      private static final S2C_ExitBanquet_22606 DEFAULT_INSTANCE = new S2C_ExitBanquet_22606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExitBanquet_22606> PARSER = new AbstractParser<S2C_ExitBanquet_22606>() {
         public S2C_ExitBanquet_22606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExitBanquet_22606(input, extensionRegistry);
         }
      };

      private S2C_ExitBanquet_22606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExitBanquet_22606() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExitBanquet_22606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExitBanquet_22606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitBanquet_22606.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ExitBanquet_22606)) {
            return super.equals(obj);
         } else {
            S2C_ExitBanquet_22606 other = (S2C_ExitBanquet_22606)obj;
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

      public static S2C_ExitBanquet_22606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_22606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_22606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_22606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_22606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data);
      }

      public static S2C_ExitBanquet_22606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExitBanquet_22606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExitBanquet_22606 parseFrom(InputStream input) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_22606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitBanquet_22606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_22606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExitBanquet_22606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExitBanquet_22606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExitBanquet_22606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExitBanquet_22606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExitBanquet_22606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExitBanquet_22606> parser() {
         return PARSER;
      }

      public Parser<S2C_ExitBanquet_22606> getParserForType() {
         return PARSER;
      }

      public S2C_ExitBanquet_22606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExitBanquet_22606OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;
         private int enterCount_;
         private boolean firstBanquet_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExitBanquet_22606.class, Builder.class);
         }

         private Builder() {
            this.guest_ = YuanDanMsg.S2C_ExitBanquet_22606.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = YuanDanMsg.S2C_ExitBanquet_22606.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_ExitBanquet_22606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = YuanDanMsg.S2C_ExitBanquet_22606.emptyIntList();
            this.bitField0_ &= -3;
            this.enterCount_ = 0;
            this.bitField0_ &= -5;
            this.firstBanquet_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ExitBanquet_22606_descriptor;
         }

         public S2C_ExitBanquet_22606 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_ExitBanquet_22606.getDefaultInstance();
         }

         public S2C_ExitBanquet_22606 build() {
            S2C_ExitBanquet_22606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExitBanquet_22606 buildPartial() {
            S2C_ExitBanquet_22606 result = new S2C_ExitBanquet_22606(this);
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
            if (other instanceof S2C_ExitBanquet_22606) {
               return this.mergeFrom((S2C_ExitBanquet_22606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExitBanquet_22606 other) {
            if (other == YuanDanMsg.S2C_ExitBanquet_22606.getDefaultInstance()) {
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
            S2C_ExitBanquet_22606 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExitBanquet_22606)YuanDanMsg.S2C_ExitBanquet_22606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExitBanquet_22606)e.getUnfinishedMessage();
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
               this.guest_ = YuanDanMsg.S2C_ExitBanquet_22606.mutableCopy(this.guest_);
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
            this.guest_ = YuanDanMsg.S2C_ExitBanquet_22606.emptyIntList();
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

   public static final class C2S_PlayFinish_22607 extends GeneratedMessageV3 implements C2S_PlayFinish_22607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PlayFinish_22607 DEFAULT_INSTANCE = new C2S_PlayFinish_22607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayFinish_22607> PARSER = new AbstractParser<C2S_PlayFinish_22607>() {
         public C2S_PlayFinish_22607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayFinish_22607(input, extensionRegistry);
         }
      };

      private C2S_PlayFinish_22607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayFinish_22607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayFinish_22607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayFinish_22607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayFinish_22607.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PlayFinish_22607)) {
            return super.equals(obj);
         } else {
            C2S_PlayFinish_22607 other = (C2S_PlayFinish_22607)obj;
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

      public static C2S_PlayFinish_22607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_22607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_22607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_22607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_22607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data);
      }

      public static C2S_PlayFinish_22607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayFinish_22607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayFinish_22607 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_22607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayFinish_22607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_22607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayFinish_22607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayFinish_22607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayFinish_22607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayFinish_22607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayFinish_22607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayFinish_22607> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayFinish_22607> getParserForType() {
         return PARSER;
      }

      public C2S_PlayFinish_22607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayFinish_22607OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayFinish_22607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_PlayFinish_22607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PlayFinish_22607_descriptor;
         }

         public C2S_PlayFinish_22607 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_PlayFinish_22607.getDefaultInstance();
         }

         public C2S_PlayFinish_22607 build() {
            C2S_PlayFinish_22607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayFinish_22607 buildPartial() {
            C2S_PlayFinish_22607 result = new C2S_PlayFinish_22607(this);
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
            if (other instanceof C2S_PlayFinish_22607) {
               return this.mergeFrom((C2S_PlayFinish_22607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayFinish_22607 other) {
            if (other == YuanDanMsg.C2S_PlayFinish_22607.getDefaultInstance()) {
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
            C2S_PlayFinish_22607 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayFinish_22607)YuanDanMsg.C2S_PlayFinish_22607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayFinish_22607)e.getUnfinishedMessage();
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

   public static final class S2C_PlayFinish_22608 extends GeneratedMessageV3 implements S2C_PlayFinish_22608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayFinish_22608 DEFAULT_INSTANCE = new S2C_PlayFinish_22608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayFinish_22608> PARSER = new AbstractParser<S2C_PlayFinish_22608>() {
         public S2C_PlayFinish_22608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayFinish_22608(input, extensionRegistry);
         }
      };

      private S2C_PlayFinish_22608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayFinish_22608() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayFinish_22608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayFinish_22608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayFinish_22608.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PlayFinish_22608)) {
            return super.equals(obj);
         } else {
            S2C_PlayFinish_22608 other = (S2C_PlayFinish_22608)obj;
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

      public static S2C_PlayFinish_22608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_22608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_22608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_22608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_22608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data);
      }

      public static S2C_PlayFinish_22608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayFinish_22608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayFinish_22608 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_22608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayFinish_22608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_22608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayFinish_22608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayFinish_22608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayFinish_22608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayFinish_22608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayFinish_22608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayFinish_22608> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayFinish_22608> getParserForType() {
         return PARSER;
      }

      public S2C_PlayFinish_22608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayFinish_22608OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayFinish_22608.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_PlayFinish_22608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PlayFinish_22608_descriptor;
         }

         public S2C_PlayFinish_22608 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_PlayFinish_22608.getDefaultInstance();
         }

         public S2C_PlayFinish_22608 build() {
            S2C_PlayFinish_22608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayFinish_22608 buildPartial() {
            S2C_PlayFinish_22608 result = new S2C_PlayFinish_22608(this);
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
            if (other instanceof S2C_PlayFinish_22608) {
               return this.mergeFrom((S2C_PlayFinish_22608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayFinish_22608 other) {
            if (other == YuanDanMsg.S2C_PlayFinish_22608.getDefaultInstance()) {
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
            S2C_PlayFinish_22608 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayFinish_22608)YuanDanMsg.S2C_PlayFinish_22608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayFinish_22608)e.getUnfinishedMessage();
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

   public static final class S2C_TaskNotify_22610 extends GeneratedMessageV3 implements S2C_TaskNotify_22610OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_22610 DEFAULT_INSTANCE = new S2C_TaskNotify_22610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_22610> PARSER = new AbstractParser<S2C_TaskNotify_22610>() {
         public S2C_TaskNotify_22610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_22610(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_22610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_22610() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_22610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_22610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_22610.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskNotify_22610)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_22610 other = (S2C_TaskNotify_22610)obj;
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

      public static S2C_TaskNotify_22610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_22610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_22610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_22610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_22610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_22610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_22610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_22610 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_22610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_22610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_22610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_22610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_22610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_22610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_22610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_22610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_22610> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_22610> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_22610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_22610OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_22610.class, Builder.class);
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
            if (YuanDanMsg.S2C_TaskNotify_22610.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskNotify_22610_descriptor;
         }

         public S2C_TaskNotify_22610 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_TaskNotify_22610.getDefaultInstance();
         }

         public S2C_TaskNotify_22610 build() {
            S2C_TaskNotify_22610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_22610 buildPartial() {
            S2C_TaskNotify_22610 result = new S2C_TaskNotify_22610(this);
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
            if (other instanceof S2C_TaskNotify_22610) {
               return this.mergeFrom((S2C_TaskNotify_22610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_22610 other) {
            if (other == YuanDanMsg.S2C_TaskNotify_22610.getDefaultInstance()) {
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
                     this.taskBuilder_ = YuanDanMsg.S2C_TaskNotify_22610.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_TaskNotify_22610 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_22610)YuanDanMsg.S2C_TaskNotify_22610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_22610)e.getUnfinishedMessage();
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

   public static final class C2S_TaskReward_22611 extends GeneratedMessageV3 implements C2S_TaskReward_22611OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskReward_22611 DEFAULT_INSTANCE = new C2S_TaskReward_22611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskReward_22611> PARSER = new AbstractParser<C2S_TaskReward_22611>() {
         public C2S_TaskReward_22611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskReward_22611(input, extensionRegistry);
         }
      };

      private C2S_TaskReward_22611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskReward_22611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskReward_22611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskReward_22611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_22611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskReward_22611)) {
            return super.equals(obj);
         } else {
            C2S_TaskReward_22611 other = (C2S_TaskReward_22611)obj;
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

      public static C2S_TaskReward_22611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_22611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_22611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_22611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_22611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data);
      }

      public static C2S_TaskReward_22611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskReward_22611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskReward_22611 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_22611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_22611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_22611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskReward_22611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskReward_22611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskReward_22611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskReward_22611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskReward_22611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskReward_22611> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskReward_22611> getParserForType() {
         return PARSER;
      }

      public C2S_TaskReward_22611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskReward_22611OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskReward_22611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_TaskReward_22611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_TaskReward_22611_descriptor;
         }

         public C2S_TaskReward_22611 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_TaskReward_22611.getDefaultInstance();
         }

         public C2S_TaskReward_22611 build() {
            C2S_TaskReward_22611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskReward_22611 buildPartial() {
            C2S_TaskReward_22611 result = new C2S_TaskReward_22611(this);
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
            if (other instanceof C2S_TaskReward_22611) {
               return this.mergeFrom((C2S_TaskReward_22611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskReward_22611 other) {
            if (other == YuanDanMsg.C2S_TaskReward_22611.getDefaultInstance()) {
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
            C2S_TaskReward_22611 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskReward_22611)YuanDanMsg.C2S_TaskReward_22611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskReward_22611)e.getUnfinishedMessage();
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

   public static final class S2C_TaskReward_22612 extends GeneratedMessageV3 implements S2C_TaskReward_22612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskReward_22612 DEFAULT_INSTANCE = new S2C_TaskReward_22612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskReward_22612> PARSER = new AbstractParser<S2C_TaskReward_22612>() {
         public S2C_TaskReward_22612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskReward_22612(input, extensionRegistry);
         }
      };

      private S2C_TaskReward_22612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskReward_22612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskReward_22612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskReward_22612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_22612.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskReward_22612)) {
            return super.equals(obj);
         } else {
            S2C_TaskReward_22612 other = (S2C_TaskReward_22612)obj;
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

      public static S2C_TaskReward_22612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_22612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_22612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_22612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_22612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data);
      }

      public static S2C_TaskReward_22612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskReward_22612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskReward_22612 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_22612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_22612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_22612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskReward_22612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskReward_22612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskReward_22612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskReward_22612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskReward_22612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskReward_22612> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskReward_22612> getParserForType() {
         return PARSER;
      }

      public S2C_TaskReward_22612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskReward_22612OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskReward_22612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_TaskReward_22612.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_TaskReward_22612_descriptor;
         }

         public S2C_TaskReward_22612 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_TaskReward_22612.getDefaultInstance();
         }

         public S2C_TaskReward_22612 build() {
            S2C_TaskReward_22612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskReward_22612 buildPartial() {
            S2C_TaskReward_22612 result = new S2C_TaskReward_22612(this);
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
            if (other instanceof S2C_TaskReward_22612) {
               return this.mergeFrom((S2C_TaskReward_22612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskReward_22612 other) {
            if (other == YuanDanMsg.S2C_TaskReward_22612.getDefaultInstance()) {
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
            S2C_TaskReward_22612 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskReward_22612)YuanDanMsg.S2C_TaskReward_22612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskReward_22612)e.getUnfinishedMessage();
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

   public static final class C2S_WalkReward_22613 extends GeneratedMessageV3 implements C2S_WalkReward_22613OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WalkReward_22613 DEFAULT_INSTANCE = new C2S_WalkReward_22613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WalkReward_22613> PARSER = new AbstractParser<C2S_WalkReward_22613>() {
         public C2S_WalkReward_22613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WalkReward_22613(input, extensionRegistry);
         }
      };

      private C2S_WalkReward_22613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WalkReward_22613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WalkReward_22613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WalkReward_22613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WalkReward_22613.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WalkReward_22613)) {
            return super.equals(obj);
         } else {
            C2S_WalkReward_22613 other = (C2S_WalkReward_22613)obj;
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

      public static C2S_WalkReward_22613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_22613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_22613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_22613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_22613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data);
      }

      public static C2S_WalkReward_22613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WalkReward_22613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WalkReward_22613 parseFrom(InputStream input) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_22613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WalkReward_22613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_22613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WalkReward_22613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WalkReward_22613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WalkReward_22613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WalkReward_22613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WalkReward_22613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WalkReward_22613> parser() {
         return PARSER;
      }

      public Parser<C2S_WalkReward_22613> getParserForType() {
         return PARSER;
      }

      public C2S_WalkReward_22613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WalkReward_22613OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WalkReward_22613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_WalkReward_22613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_WalkReward_22613_descriptor;
         }

         public C2S_WalkReward_22613 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_WalkReward_22613.getDefaultInstance();
         }

         public C2S_WalkReward_22613 build() {
            C2S_WalkReward_22613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WalkReward_22613 buildPartial() {
            C2S_WalkReward_22613 result = new C2S_WalkReward_22613(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WalkReward_22613) {
               return this.mergeFrom((C2S_WalkReward_22613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WalkReward_22613 other) {
            if (other == YuanDanMsg.C2S_WalkReward_22613.getDefaultInstance()) {
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
            C2S_WalkReward_22613 parsedMessage = null;

            try {
               parsedMessage = (C2S_WalkReward_22613)YuanDanMsg.C2S_WalkReward_22613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WalkReward_22613)e.getUnfinishedMessage();
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

   public static final class S2C_WalkReward_22614 extends GeneratedMessageV3 implements S2C_WalkReward_22614OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTWALK_FIELD_NUMBER = 1;
      private boolean gotWalk_;
      private byte memoizedIsInitialized;
      private static final S2C_WalkReward_22614 DEFAULT_INSTANCE = new S2C_WalkReward_22614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WalkReward_22614> PARSER = new AbstractParser<S2C_WalkReward_22614>() {
         public S2C_WalkReward_22614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WalkReward_22614(input, extensionRegistry);
         }
      };

      private S2C_WalkReward_22614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WalkReward_22614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WalkReward_22614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WalkReward_22614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WalkReward_22614.class, Builder.class);
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
         } else if (!(obj instanceof S2C_WalkReward_22614)) {
            return super.equals(obj);
         } else {
            S2C_WalkReward_22614 other = (S2C_WalkReward_22614)obj;
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

      public static S2C_WalkReward_22614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_22614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_22614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_22614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_22614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data);
      }

      public static S2C_WalkReward_22614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WalkReward_22614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WalkReward_22614 parseFrom(InputStream input) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_22614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WalkReward_22614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_22614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WalkReward_22614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WalkReward_22614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WalkReward_22614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WalkReward_22614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WalkReward_22614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WalkReward_22614> parser() {
         return PARSER;
      }

      public Parser<S2C_WalkReward_22614> getParserForType() {
         return PARSER;
      }

      public S2C_WalkReward_22614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WalkReward_22614OrBuilder {
         private int bitField0_;
         private boolean gotWalk_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WalkReward_22614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_WalkReward_22614.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotWalk_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_WalkReward_22614_descriptor;
         }

         public S2C_WalkReward_22614 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_WalkReward_22614.getDefaultInstance();
         }

         public S2C_WalkReward_22614 build() {
            S2C_WalkReward_22614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WalkReward_22614 buildPartial() {
            S2C_WalkReward_22614 result = new S2C_WalkReward_22614(this);
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
            if (other instanceof S2C_WalkReward_22614) {
               return this.mergeFrom((S2C_WalkReward_22614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WalkReward_22614 other) {
            if (other == YuanDanMsg.S2C_WalkReward_22614.getDefaultInstance()) {
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
            S2C_WalkReward_22614 parsedMessage = null;

            try {
               parsedMessage = (S2C_WalkReward_22614)YuanDanMsg.S2C_WalkReward_22614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WalkReward_22614)e.getUnfinishedMessage();
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

   public static final class C2S_PrayEnjoy_22615 extends GeneratedMessageV3 implements C2S_PrayEnjoy_22615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOY_FIELD_NUMBER = 1;
      private int enjoy_;
      private byte memoizedIsInitialized;
      private static final C2S_PrayEnjoy_22615 DEFAULT_INSTANCE = new C2S_PrayEnjoy_22615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PrayEnjoy_22615> PARSER = new AbstractParser<C2S_PrayEnjoy_22615>() {
         public C2S_PrayEnjoy_22615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PrayEnjoy_22615(input, extensionRegistry);
         }
      };

      private C2S_PrayEnjoy_22615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PrayEnjoy_22615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PrayEnjoy_22615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PrayEnjoy_22615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayEnjoy_22615.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PrayEnjoy_22615)) {
            return super.equals(obj);
         } else {
            C2S_PrayEnjoy_22615 other = (C2S_PrayEnjoy_22615)obj;
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

      public static C2S_PrayEnjoy_22615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PrayEnjoy_22615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(InputStream input) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayEnjoy_22615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_22615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PrayEnjoy_22615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PrayEnjoy_22615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PrayEnjoy_22615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PrayEnjoy_22615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PrayEnjoy_22615> parser() {
         return PARSER;
      }

      public Parser<C2S_PrayEnjoy_22615> getParserForType() {
         return PARSER;
      }

      public C2S_PrayEnjoy_22615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PrayEnjoy_22615OrBuilder {
         private int bitField0_;
         private int enjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PrayEnjoy_22615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_PrayEnjoy_22615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_PrayEnjoy_22615_descriptor;
         }

         public C2S_PrayEnjoy_22615 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_PrayEnjoy_22615.getDefaultInstance();
         }

         public C2S_PrayEnjoy_22615 build() {
            C2S_PrayEnjoy_22615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PrayEnjoy_22615 buildPartial() {
            C2S_PrayEnjoy_22615 result = new C2S_PrayEnjoy_22615(this);
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
            if (other instanceof C2S_PrayEnjoy_22615) {
               return this.mergeFrom((C2S_PrayEnjoy_22615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PrayEnjoy_22615 other) {
            if (other == YuanDanMsg.C2S_PrayEnjoy_22615.getDefaultInstance()) {
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
            C2S_PrayEnjoy_22615 parsedMessage = null;

            try {
               parsedMessage = (C2S_PrayEnjoy_22615)YuanDanMsg.C2S_PrayEnjoy_22615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PrayEnjoy_22615)e.getUnfinishedMessage();
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

   public static final class S2C_PrayEnjoy_22616 extends GeneratedMessageV3 implements S2C_PrayEnjoy_22616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOY_FIELD_NUMBER = 1;
      private int enjoy_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayEnjoy_22616 DEFAULT_INSTANCE = new S2C_PrayEnjoy_22616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayEnjoy_22616> PARSER = new AbstractParser<S2C_PrayEnjoy_22616>() {
         public S2C_PrayEnjoy_22616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayEnjoy_22616(input, extensionRegistry);
         }
      };

      private S2C_PrayEnjoy_22616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayEnjoy_22616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayEnjoy_22616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayEnjoy_22616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayEnjoy_22616.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayEnjoy_22616)) {
            return super.equals(obj);
         } else {
            S2C_PrayEnjoy_22616 other = (S2C_PrayEnjoy_22616)obj;
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

      public static S2C_PrayEnjoy_22616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayEnjoy_22616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayEnjoy_22616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_22616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayEnjoy_22616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayEnjoy_22616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayEnjoy_22616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayEnjoy_22616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayEnjoy_22616> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayEnjoy_22616> getParserForType() {
         return PARSER;
      }

      public S2C_PrayEnjoy_22616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayEnjoy_22616OrBuilder {
         private int bitField0_;
         private int enjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayEnjoy_22616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_PrayEnjoy_22616.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoy_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_PrayEnjoy_22616_descriptor;
         }

         public S2C_PrayEnjoy_22616 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_PrayEnjoy_22616.getDefaultInstance();
         }

         public S2C_PrayEnjoy_22616 build() {
            S2C_PrayEnjoy_22616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayEnjoy_22616 buildPartial() {
            S2C_PrayEnjoy_22616 result = new S2C_PrayEnjoy_22616(this);
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
            if (other instanceof S2C_PrayEnjoy_22616) {
               return this.mergeFrom((S2C_PrayEnjoy_22616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayEnjoy_22616 other) {
            if (other == YuanDanMsg.S2C_PrayEnjoy_22616.getDefaultInstance()) {
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
            S2C_PrayEnjoy_22616 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayEnjoy_22616)YuanDanMsg.S2C_PrayEnjoy_22616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayEnjoy_22616)e.getUnfinishedMessage();
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

   public static final class C2S_Pray_22617 extends GeneratedMessageV3 implements C2S_Pray_22617OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_22617 DEFAULT_INSTANCE = new C2S_Pray_22617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_22617> PARSER = new AbstractParser<C2S_Pray_22617>() {
         public C2S_Pray_22617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_22617(input, extensionRegistry);
         }
      };

      private C2S_Pray_22617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_22617() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_22617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_22617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_22617.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Pray_22617)) {
            return super.equals(obj);
         } else {
            C2S_Pray_22617 other = (C2S_Pray_22617)obj;
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

      public static C2S_Pray_22617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data);
      }

      public static C2S_Pray_22617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_22617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data);
      }

      public static C2S_Pray_22617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_22617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data);
      }

      public static C2S_Pray_22617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_22617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_22617 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_22617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_22617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_22617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_22617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_22617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_22617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_22617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_22617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_22617> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_22617> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_22617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_22617OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_22617.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_Pray_22617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Pray_22617_descriptor;
         }

         public C2S_Pray_22617 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_Pray_22617.getDefaultInstance();
         }

         public C2S_Pray_22617 build() {
            C2S_Pray_22617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_22617 buildPartial() {
            C2S_Pray_22617 result = new C2S_Pray_22617(this);
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
            if (other instanceof C2S_Pray_22617) {
               return this.mergeFrom((C2S_Pray_22617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_22617 other) {
            if (other == YuanDanMsg.C2S_Pray_22617.getDefaultInstance()) {
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
            C2S_Pray_22617 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_22617)YuanDanMsg.C2S_Pray_22617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_22617)e.getUnfinishedMessage();
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

   public static final class S2C_Pray_22618 extends GeneratedMessageV3 implements S2C_Pray_22618OrBuilder {
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
      private static final S2C_Pray_22618 DEFAULT_INSTANCE = new S2C_Pray_22618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_22618> PARSER = new AbstractParser<S2C_Pray_22618>() {
         public S2C_Pray_22618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_22618(input, extensionRegistry);
         }
      };

      private S2C_Pray_22618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_22618() {
         this.memoizedIsInitialized = -1;
         this.gotRewardId_ = emptyIntList();
         this.tierRewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_22618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_22618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_22618.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Pray_22618)) {
            return super.equals(obj);
         } else {
            S2C_Pray_22618 other = (S2C_Pray_22618)obj;
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

      public static S2C_Pray_22618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data);
      }

      public static S2C_Pray_22618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_22618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data);
      }

      public static S2C_Pray_22618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_22618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data);
      }

      public static S2C_Pray_22618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_22618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_22618 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_22618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_22618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_22618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_22618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_22618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_22618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_22618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_22618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_22618> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_22618> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_22618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_22618OrBuilder {
         private int bitField0_;
         private int count_;
         private int tier_;
         private int enjoy_;
         private Internal.IntList gotRewardId_;
         private Internal.IntList tierRewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_22618.class, Builder.class);
         }

         private Builder() {
            this.gotRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.tierRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.tierRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_Pray_22618.alwaysUseFieldBuilders) {
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
            this.gotRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.bitField0_ &= -9;
            this.tierRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Pray_22618_descriptor;
         }

         public S2C_Pray_22618 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_Pray_22618.getDefaultInstance();
         }

         public S2C_Pray_22618 build() {
            S2C_Pray_22618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_22618 buildPartial() {
            S2C_Pray_22618 result = new S2C_Pray_22618(this);
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
            if (other instanceof S2C_Pray_22618) {
               return this.mergeFrom((S2C_Pray_22618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_22618 other) {
            if (other == YuanDanMsg.S2C_Pray_22618.getDefaultInstance()) {
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
            S2C_Pray_22618 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_22618)YuanDanMsg.S2C_Pray_22618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_22618)e.getUnfinishedMessage();
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
               this.gotRewardId_ = YuanDanMsg.S2C_Pray_22618.mutableCopy(this.gotRewardId_);
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
            this.gotRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureTierRewardIdIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.tierRewardId_ = YuanDanMsg.S2C_Pray_22618.mutableCopy(this.tierRewardId_);
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
            this.tierRewardId_ = YuanDanMsg.S2C_Pray_22618.emptyIntList();
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

   public static final class C2S_SignReceive_22619 extends GeneratedMessageV3 implements C2S_SignReceive_22619OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignReceive_22619 DEFAULT_INSTANCE = new C2S_SignReceive_22619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignReceive_22619> PARSER = new AbstractParser<C2S_SignReceive_22619>() {
         public C2S_SignReceive_22619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignReceive_22619(input, extensionRegistry);
         }
      };

      private C2S_SignReceive_22619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignReceive_22619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignReceive_22619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignReceive_22619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_22619.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignReceive_22619)) {
            return super.equals(obj);
         } else {
            C2S_SignReceive_22619 other = (C2S_SignReceive_22619)obj;
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

      public static C2S_SignReceive_22619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_22619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_22619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_22619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_22619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_22619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_22619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_22619 parseFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_22619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_22619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_22619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_22619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_22619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_22619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignReceive_22619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignReceive_22619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignReceive_22619> parser() {
         return PARSER;
      }

      public Parser<C2S_SignReceive_22619> getParserForType() {
         return PARSER;
      }

      public C2S_SignReceive_22619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignReceive_22619OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_22619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_SignReceive_22619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_SignReceive_22619_descriptor;
         }

         public C2S_SignReceive_22619 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_SignReceive_22619.getDefaultInstance();
         }

         public C2S_SignReceive_22619 build() {
            C2S_SignReceive_22619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignReceive_22619 buildPartial() {
            C2S_SignReceive_22619 result = new C2S_SignReceive_22619(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SignReceive_22619) {
               return this.mergeFrom((C2S_SignReceive_22619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignReceive_22619 other) {
            if (other == YuanDanMsg.C2S_SignReceive_22619.getDefaultInstance()) {
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
            C2S_SignReceive_22619 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignReceive_22619)YuanDanMsg.C2S_SignReceive_22619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignReceive_22619)e.getUnfinishedMessage();
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

   public static final class S2C_SignReceive_22620 extends GeneratedMessageV3 implements S2C_SignReceive_22620OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_SignReceive_22620 DEFAULT_INSTANCE = new S2C_SignReceive_22620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignReceive_22620> PARSER = new AbstractParser<S2C_SignReceive_22620>() {
         public S2C_SignReceive_22620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignReceive_22620(input, extensionRegistry);
         }
      };

      private S2C_SignReceive_22620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignReceive_22620() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignReceive_22620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignReceive_22620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_22620.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SignReceive_22620)) {
            return super.equals(obj);
         } else {
            S2C_SignReceive_22620 other = (S2C_SignReceive_22620)obj;
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

      public static S2C_SignReceive_22620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_22620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_22620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_22620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_22620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_22620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_22620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_22620 parseFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_22620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_22620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_22620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_22620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_22620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_22620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignReceive_22620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignReceive_22620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignReceive_22620> parser() {
         return PARSER;
      }

      public Parser<S2C_SignReceive_22620> getParserForType() {
         return PARSER;
      }

      public S2C_SignReceive_22620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignReceive_22620OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_22620.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = YuanDanMsg.S2C_SignReceive_22620.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = YuanDanMsg.S2C_SignReceive_22620.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_SignReceive_22620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = YuanDanMsg.S2C_SignReceive_22620.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_SignReceive_22620_descriptor;
         }

         public S2C_SignReceive_22620 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_SignReceive_22620.getDefaultInstance();
         }

         public S2C_SignReceive_22620 build() {
            S2C_SignReceive_22620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignReceive_22620 buildPartial() {
            S2C_SignReceive_22620 result = new S2C_SignReceive_22620(this);
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
            if (other instanceof S2C_SignReceive_22620) {
               return this.mergeFrom((S2C_SignReceive_22620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignReceive_22620 other) {
            if (other == YuanDanMsg.S2C_SignReceive_22620.getDefaultInstance()) {
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
            S2C_SignReceive_22620 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignReceive_22620)YuanDanMsg.S2C_SignReceive_22620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignReceive_22620)e.getUnfinishedMessage();
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
               this.receiveIds_ = YuanDanMsg.S2C_SignReceive_22620.mutableCopy(this.receiveIds_);
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
            this.receiveIds_ = YuanDanMsg.S2C_SignReceive_22620.emptyIntList();
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

   public static final class C2S_ShopAddUpInfo_22621 extends GeneratedMessageV3 implements C2S_ShopAddUpInfo_22621OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopAddUpInfo_22621 DEFAULT_INSTANCE = new C2S_ShopAddUpInfo_22621();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopAddUpInfo_22621> PARSER = new AbstractParser<C2S_ShopAddUpInfo_22621>() {
         public C2S_ShopAddUpInfo_22621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopAddUpInfo_22621(input, extensionRegistry);
         }
      };

      private C2S_ShopAddUpInfo_22621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopAddUpInfo_22621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopAddUpInfo_22621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopAddUpInfo_22621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_22621.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopAddUpInfo_22621)) {
            return super.equals(obj);
         } else {
            C2S_ShopAddUpInfo_22621 other = (C2S_ShopAddUpInfo_22621)obj;
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

      public static C2S_ShopAddUpInfo_22621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopAddUpInfo_22621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_22621 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_22621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopAddUpInfo_22621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopAddUpInfo_22621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopAddUpInfo_22621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopAddUpInfo_22621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopAddUpInfo_22621> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopAddUpInfo_22621> getParserForType() {
         return PARSER;
      }

      public C2S_ShopAddUpInfo_22621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopAddUpInfo_22621OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopAddUpInfo_22621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_ShopAddUpInfo_22621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ShopAddUpInfo_22621_descriptor;
         }

         public C2S_ShopAddUpInfo_22621 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_ShopAddUpInfo_22621.getDefaultInstance();
         }

         public C2S_ShopAddUpInfo_22621 build() {
            C2S_ShopAddUpInfo_22621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopAddUpInfo_22621 buildPartial() {
            C2S_ShopAddUpInfo_22621 result = new C2S_ShopAddUpInfo_22621(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShopAddUpInfo_22621) {
               return this.mergeFrom((C2S_ShopAddUpInfo_22621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopAddUpInfo_22621 other) {
            if (other == YuanDanMsg.C2S_ShopAddUpInfo_22621.getDefaultInstance()) {
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
            C2S_ShopAddUpInfo_22621 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopAddUpInfo_22621)YuanDanMsg.C2S_ShopAddUpInfo_22621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopAddUpInfo_22621)e.getUnfinishedMessage();
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

   public static final class S2C_ShopAddUpInfo_22622 extends GeneratedMessageV3 implements S2C_ShopAddUpInfo_22622OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAILYRECHARGE_FIELD_NUMBER = 1;
      private int dailyRecharge_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 3;
      private int activityDay_;
      public static final int OPENDAY_FIELD_NUMBER = 4;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopAddUpInfo_22622 DEFAULT_INSTANCE = new S2C_ShopAddUpInfo_22622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopAddUpInfo_22622> PARSER = new AbstractParser<S2C_ShopAddUpInfo_22622>() {
         public S2C_ShopAddUpInfo_22622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopAddUpInfo_22622(input, extensionRegistry);
         }
      };

      private S2C_ShopAddUpInfo_22622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopAddUpInfo_22622() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopAddUpInfo_22622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopAddUpInfo_22622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.dailyRecharge_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.activityDay_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.openDay_ = input.readInt32();
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_22622.class, Builder.class);
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

      public boolean hasActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
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
         } else if (!this.hasActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenDay()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.activityDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.openDay_);
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
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.activityDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.openDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopAddUpInfo_22622)) {
            return super.equals(obj);
         } else {
            S2C_ShopAddUpInfo_22622 other = (S2C_ShopAddUpInfo_22622)obj;
            if (this.hasDailyRecharge() != other.hasDailyRecharge()) {
               return false;
            } else if (this.hasDailyRecharge() && this.getDailyRecharge() != other.getDailyRecharge()) {
               return false;
            } else if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasActivityDay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.hasOpenDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopAddUpInfo_22622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_22622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_22622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopAddUpInfo_22622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopAddUpInfo_22622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopAddUpInfo_22622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopAddUpInfo_22622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopAddUpInfo_22622> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopAddUpInfo_22622> getParserForType() {
         return PARSER;
      }

      public S2C_ShopAddUpInfo_22622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopAddUpInfo_22622OrBuilder {
         private int bitField0_;
         private int dailyRecharge_;
         private Internal.IntList gotRewards_;
         private int activityDay_;
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopAddUpInfo_22622.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = YuanDanMsg.S2C_ShopAddUpInfo_22622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = YuanDanMsg.S2C_ShopAddUpInfo_22622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_ShopAddUpInfo_22622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dailyRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = YuanDanMsg.S2C_ShopAddUpInfo_22622.emptyIntList();
            this.bitField0_ &= -3;
            this.activityDay_ = 0;
            this.bitField0_ &= -5;
            this.openDay_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ShopAddUpInfo_22622_descriptor;
         }

         public S2C_ShopAddUpInfo_22622 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_ShopAddUpInfo_22622.getDefaultInstance();
         }

         public S2C_ShopAddUpInfo_22622 build() {
            S2C_ShopAddUpInfo_22622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopAddUpInfo_22622 buildPartial() {
            S2C_ShopAddUpInfo_22622 result = new S2C_ShopAddUpInfo_22622(this);
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
            if ((from_bitField0_ & 4) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof S2C_ShopAddUpInfo_22622) {
               return this.mergeFrom((S2C_ShopAddUpInfo_22622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopAddUpInfo_22622 other) {
            if (other == YuanDanMsg.S2C_ShopAddUpInfo_22622.getDefaultInstance()) {
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

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDailyRecharge()) {
               return false;
            } else if (!this.hasActivityDay()) {
               return false;
            } else {
               return this.hasOpenDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopAddUpInfo_22622 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopAddUpInfo_22622)YuanDanMsg.S2C_ShopAddUpInfo_22622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopAddUpInfo_22622)e.getUnfinishedMessage();
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
               this.gotRewards_ = YuanDanMsg.S2C_ShopAddUpInfo_22622.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = YuanDanMsg.S2C_ShopAddUpInfo_22622.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 4;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -5;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 8;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -9;
            this.openDay_ = 0;
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

   public static final class C2S_ReceiveShopAddUpReward_22623 extends GeneratedMessageV3 implements C2S_ReceiveShopAddUpReward_22623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveShopAddUpReward_22623 DEFAULT_INSTANCE = new C2S_ReceiveShopAddUpReward_22623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveShopAddUpReward_22623> PARSER = new AbstractParser<C2S_ReceiveShopAddUpReward_22623>() {
         public C2S_ReceiveShopAddUpReward_22623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveShopAddUpReward_22623(input, extensionRegistry);
         }
      };

      private C2S_ReceiveShopAddUpReward_22623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveShopAddUpReward_22623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveShopAddUpReward_22623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveShopAddUpReward_22623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_22623.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveShopAddUpReward_22623)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveShopAddUpReward_22623 other = (C2S_ReceiveShopAddUpReward_22623)obj;
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

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveShopAddUpReward_22623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveShopAddUpReward_22623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveShopAddUpReward_22623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveShopAddUpReward_22623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveShopAddUpReward_22623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveShopAddUpReward_22623> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveShopAddUpReward_22623> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveShopAddUpReward_22623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveShopAddUpReward_22623OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveShopAddUpReward_22623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_ReceiveShopAddUpReward_22623.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ReceiveShopAddUpReward_22623_descriptor;
         }

         public C2S_ReceiveShopAddUpReward_22623 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_ReceiveShopAddUpReward_22623.getDefaultInstance();
         }

         public C2S_ReceiveShopAddUpReward_22623 build() {
            C2S_ReceiveShopAddUpReward_22623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveShopAddUpReward_22623 buildPartial() {
            C2S_ReceiveShopAddUpReward_22623 result = new C2S_ReceiveShopAddUpReward_22623(this);
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
            if (other instanceof C2S_ReceiveShopAddUpReward_22623) {
               return this.mergeFrom((C2S_ReceiveShopAddUpReward_22623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveShopAddUpReward_22623 other) {
            if (other == YuanDanMsg.C2S_ReceiveShopAddUpReward_22623.getDefaultInstance()) {
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
            C2S_ReceiveShopAddUpReward_22623 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveShopAddUpReward_22623)YuanDanMsg.C2S_ReceiveShopAddUpReward_22623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveShopAddUpReward_22623)e.getUnfinishedMessage();
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

   public static final class C2S_FancyReward_22624 extends GeneratedMessageV3 implements C2S_FancyReward_22624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_22624 DEFAULT_INSTANCE = new C2S_FancyReward_22624();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_22624> PARSER = new AbstractParser<C2S_FancyReward_22624>() {
         public C2S_FancyReward_22624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_22624(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_22624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_22624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_22624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_22624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_22624.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_22624)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_22624 other = (C2S_FancyReward_22624)obj;
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

      public static C2S_FancyReward_22624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_22624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_22624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_22624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_22624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_22624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_22624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_22624 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_22624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_22624 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_22624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_22624 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_22624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_22624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_22624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_22624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_22624> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_22624> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_22624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_22624OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_22624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_FancyReward_22624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_FancyReward_22624_descriptor;
         }

         public C2S_FancyReward_22624 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_FancyReward_22624.getDefaultInstance();
         }

         public C2S_FancyReward_22624 build() {
            C2S_FancyReward_22624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_22624 buildPartial() {
            C2S_FancyReward_22624 result = new C2S_FancyReward_22624(this);
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
            if (other instanceof C2S_FancyReward_22624) {
               return this.mergeFrom((C2S_FancyReward_22624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_22624 other) {
            if (other == YuanDanMsg.C2S_FancyReward_22624.getDefaultInstance()) {
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
            C2S_FancyReward_22624 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_22624)YuanDanMsg.C2S_FancyReward_22624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_22624)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_22625 extends GeneratedMessageV3 implements S2C_FancyReward_22625OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_22625 DEFAULT_INSTANCE = new S2C_FancyReward_22625();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_22625> PARSER = new AbstractParser<S2C_FancyReward_22625>() {
         public S2C_FancyReward_22625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_22625(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_22625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_22625() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_22625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_22625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_22625.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_22625)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_22625 other = (S2C_FancyReward_22625)obj;
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

      public static S2C_FancyReward_22625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_22625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_22625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_22625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_22625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_22625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_22625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_22625 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_22625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_22625 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_22625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_22625 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_22625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_22625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_22625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_22625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_22625> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_22625> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_22625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_22625OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_22625.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_FancyReward_22625.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_FancyReward_22625_descriptor;
         }

         public S2C_FancyReward_22625 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_FancyReward_22625.getDefaultInstance();
         }

         public S2C_FancyReward_22625 build() {
            S2C_FancyReward_22625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_22625 buildPartial() {
            S2C_FancyReward_22625 result = new S2C_FancyReward_22625(this);
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
            if (other instanceof S2C_FancyReward_22625) {
               return this.mergeFrom((S2C_FancyReward_22625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_22625 other) {
            if (other == YuanDanMsg.S2C_FancyReward_22625.getDefaultInstance()) {
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
            S2C_FancyReward_22625 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_22625)YuanDanMsg.S2C_FancyReward_22625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_22625)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_22626 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_22626OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_22626 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_22626();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_22626> PARSER = new AbstractParser<C2S_LuckDrawInfo_22626>() {
         public C2S_LuckDrawInfo_22626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_22626(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_22626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_22626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_22626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_22626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_22626.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_22626)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_22626 other = (C2S_LuckDrawInfo_22626)obj;
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

      public static C2S_LuckDrawInfo_22626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_22626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_22626 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_22626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_22626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_22626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_22626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_22626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_22626> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_22626> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_22626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_22626OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_22626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_LuckDrawInfo_22626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_LuckDrawInfo_22626_descriptor;
         }

         public C2S_LuckDrawInfo_22626 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_LuckDrawInfo_22626.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_22626 build() {
            C2S_LuckDrawInfo_22626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_22626 buildPartial() {
            C2S_LuckDrawInfo_22626 result = new C2S_LuckDrawInfo_22626(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_22626) {
               return this.mergeFrom((C2S_LuckDrawInfo_22626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_22626 other) {
            if (other == YuanDanMsg.C2S_LuckDrawInfo_22626.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_22626 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_22626)YuanDanMsg.C2S_LuckDrawInfo_22626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_22626)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_22627 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_22627OrBuilder {
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
      public static final int OPENDAY_FIELD_NUMBER = 9;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckDrawInfo_22627 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_22627();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_22627> PARSER = new AbstractParser<S2C_LuckDrawInfo_22627>() {
         public S2C_LuckDrawInfo_22627 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_22627(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_22627(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_22627() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_22627();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_22627(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                     case 72:
                        this.bitField0_ |= 64;
                        this.openDay_ = input.readInt32();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_22627.class, Builder.class);
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

      public boolean hasOpenDay() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
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
         } else if (!this.hasOpenDay()) {
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

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.openDay_);
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

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.openDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckDrawInfo_22627)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_22627 other = (S2C_LuckDrawInfo_22627)obj;
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
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasOpenDay()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_22627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_22627 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_22627 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_22627 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_22627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_22627 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_22627 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_22627> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_22627> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_22627 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_22627OrBuilder {
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
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_22627.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = YuanDanMsg.S2C_LuckDrawInfo_22627.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = YuanDanMsg.S2C_LuckDrawInfo_22627.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_LuckDrawInfo_22627.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = YuanDanMsg.S2C_LuckDrawInfo_22627.emptyIntList();
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
            this.openDay_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_LuckDrawInfo_22627_descriptor;
         }

         public S2C_LuckDrawInfo_22627 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_LuckDrawInfo_22627.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_22627 build() {
            S2C_LuckDrawInfo_22627 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_22627 buildPartial() {
            S2C_LuckDrawInfo_22627 result = new S2C_LuckDrawInfo_22627(this);
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

            if ((from_bitField0_ & 256) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof S2C_LuckDrawInfo_22627) {
               return this.mergeFrom((S2C_LuckDrawInfo_22627)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_22627 other) {
            if (other == YuanDanMsg.S2C_LuckDrawInfo_22627.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = YuanDanMsg.S2C_LuckDrawInfo_22627.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
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
            } else if (!this.hasOpenDay()) {
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
            S2C_LuckDrawInfo_22627 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_22627)YuanDanMsg.S2C_LuckDrawInfo_22627.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_22627)e.getUnfinishedMessage();
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
               this.hadRewardId_ = YuanDanMsg.S2C_LuckDrawInfo_22627.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = YuanDanMsg.S2C_LuckDrawInfo_22627.emptyIntList();
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

         public boolean hasOpenDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 256;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -257;
            this.openDay_ = 0;
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

   public static final class C2S_Draw_22628 extends GeneratedMessageV3 implements C2S_Draw_22628OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_22628 DEFAULT_INSTANCE = new C2S_Draw_22628();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_22628> PARSER = new AbstractParser<C2S_Draw_22628>() {
         public C2S_Draw_22628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_22628(input, extensionRegistry);
         }
      };

      private C2S_Draw_22628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_22628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_22628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_22628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_22628.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_22628)) {
            return super.equals(obj);
         } else {
            C2S_Draw_22628 other = (C2S_Draw_22628)obj;
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

      public static C2S_Draw_22628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data);
      }

      public static C2S_Draw_22628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_22628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data);
      }

      public static C2S_Draw_22628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_22628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data);
      }

      public static C2S_Draw_22628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_22628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_22628 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_22628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_22628 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_22628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_22628 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_22628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_22628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_22628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_22628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_22628> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_22628> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_22628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_22628OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_22628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_Draw_22628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_Draw_22628_descriptor;
         }

         public C2S_Draw_22628 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_Draw_22628.getDefaultInstance();
         }

         public C2S_Draw_22628 build() {
            C2S_Draw_22628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_22628 buildPartial() {
            C2S_Draw_22628 result = new C2S_Draw_22628(this);
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
            if (other instanceof C2S_Draw_22628) {
               return this.mergeFrom((C2S_Draw_22628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_22628 other) {
            if (other == YuanDanMsg.C2S_Draw_22628.getDefaultInstance()) {
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
            C2S_Draw_22628 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_22628)YuanDanMsg.C2S_Draw_22628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_22628)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_22629 extends GeneratedMessageV3 implements S2C_Draw_22629OrBuilder {
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
      private static final S2C_Draw_22629 DEFAULT_INSTANCE = new S2C_Draw_22629();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_22629> PARSER = new AbstractParser<S2C_Draw_22629>() {
         public S2C_Draw_22629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_22629(input, extensionRegistry);
         }
      };

      private S2C_Draw_22629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_22629() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_22629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_22629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_22629.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_22629)) {
            return super.equals(obj);
         } else {
            S2C_Draw_22629 other = (S2C_Draw_22629)obj;
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

      public static S2C_Draw_22629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data);
      }

      public static S2C_Draw_22629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_22629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data);
      }

      public static S2C_Draw_22629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_22629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data);
      }

      public static S2C_Draw_22629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_22629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_22629 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_22629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_22629 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_22629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_22629 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_22629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_22629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_22629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_22629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_22629> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_22629> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_22629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_22629OrBuilder {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_22629.class, Builder.class);
         }

         private Builder() {
            this.id_ = YuanDanMsg.S2C_Draw_22629.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = YuanDanMsg.S2C_Draw_22629.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_Draw_22629.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = YuanDanMsg.S2C_Draw_22629.emptyIntList();
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_Draw_22629_descriptor;
         }

         public S2C_Draw_22629 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_Draw_22629.getDefaultInstance();
         }

         public S2C_Draw_22629 build() {
            S2C_Draw_22629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_22629 buildPartial() {
            S2C_Draw_22629 result = new S2C_Draw_22629(this);
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
            if (other instanceof S2C_Draw_22629) {
               return this.mergeFrom((S2C_Draw_22629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_22629 other) {
            if (other == YuanDanMsg.S2C_Draw_22629.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = YuanDanMsg.S2C_Draw_22629.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_22629 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_22629)YuanDanMsg.S2C_Draw_22629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_22629)e.getUnfinishedMessage();
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
               this.id_ = YuanDanMsg.S2C_Draw_22629.mutableCopy(this.id_);
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
            this.id_ = YuanDanMsg.S2C_Draw_22629.emptyIntList();
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

   public static final class C2S_OpenReward_22630 extends GeneratedMessageV3 implements C2S_OpenReward_22630OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_22630 DEFAULT_INSTANCE = new C2S_OpenReward_22630();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_22630> PARSER = new AbstractParser<C2S_OpenReward_22630>() {
         public C2S_OpenReward_22630 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_22630(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_22630(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_22630() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_22630();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_22630(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_22630.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_22630)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_22630 other = (C2S_OpenReward_22630)obj;
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

      public static C2S_OpenReward_22630 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_22630 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_22630 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_22630 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_22630 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_22630 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_22630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_22630 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_22630 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_22630 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_22630 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_22630 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_22630 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_22630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_22630 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_22630 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_22630> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_22630> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_22630 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_22630OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_22630.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_OpenReward_22630.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_OpenReward_22630_descriptor;
         }

         public C2S_OpenReward_22630 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_OpenReward_22630.getDefaultInstance();
         }

         public C2S_OpenReward_22630 build() {
            C2S_OpenReward_22630 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_22630 buildPartial() {
            C2S_OpenReward_22630 result = new C2S_OpenReward_22630(this);
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
            if (other instanceof C2S_OpenReward_22630) {
               return this.mergeFrom((C2S_OpenReward_22630)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_22630 other) {
            if (other == YuanDanMsg.C2S_OpenReward_22630.getDefaultInstance()) {
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
            C2S_OpenReward_22630 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_22630)YuanDanMsg.C2S_OpenReward_22630.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_22630)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_22631 extends GeneratedMessageV3 implements S2C_OpenReward_22631OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_22631 DEFAULT_INSTANCE = new S2C_OpenReward_22631();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_22631> PARSER = new AbstractParser<S2C_OpenReward_22631>() {
         public S2C_OpenReward_22631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_22631(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_22631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_22631() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_22631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_22631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_22631.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_22631)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_22631 other = (S2C_OpenReward_22631)obj;
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

      public static S2C_OpenReward_22631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_22631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_22631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_22631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_22631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_22631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_22631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_22631 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_22631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_22631 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_22631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_22631 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_22631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_22631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_22631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_22631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_22631> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_22631> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_22631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_22631OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_22631.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.S2C_OpenReward_22631.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_OpenReward_22631_descriptor;
         }

         public S2C_OpenReward_22631 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_OpenReward_22631.getDefaultInstance();
         }

         public S2C_OpenReward_22631 build() {
            S2C_OpenReward_22631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_22631 buildPartial() {
            S2C_OpenReward_22631 result = new S2C_OpenReward_22631(this);
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
            if (other instanceof S2C_OpenReward_22631) {
               return this.mergeFrom((S2C_OpenReward_22631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_22631 other) {
            if (other == YuanDanMsg.S2C_OpenReward_22631.getDefaultInstance()) {
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
            S2C_OpenReward_22631 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_22631)YuanDanMsg.S2C_OpenReward_22631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_22631)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_22632 extends GeneratedMessageV3 implements C2S_DrawRecord_22632OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_22632 DEFAULT_INSTANCE = new C2S_DrawRecord_22632();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_22632> PARSER = new AbstractParser<C2S_DrawRecord_22632>() {
         public C2S_DrawRecord_22632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_22632(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_22632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_22632() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_22632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_22632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_22632.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_22632)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_22632 other = (C2S_DrawRecord_22632)obj;
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

      public static C2S_DrawRecord_22632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_22632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_22632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_22632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_22632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_22632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_22632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_22632 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_22632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_22632 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_22632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_22632 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_22632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_22632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_22632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_22632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_22632> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_22632> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_22632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_22632OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_22632.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_DrawRecord_22632.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_DrawRecord_22632_descriptor;
         }

         public C2S_DrawRecord_22632 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_DrawRecord_22632.getDefaultInstance();
         }

         public C2S_DrawRecord_22632 build() {
            C2S_DrawRecord_22632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_22632 buildPartial() {
            C2S_DrawRecord_22632 result = new C2S_DrawRecord_22632(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_22632) {
               return this.mergeFrom((C2S_DrawRecord_22632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_22632 other) {
            if (other == YuanDanMsg.C2S_DrawRecord_22632.getDefaultInstance()) {
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
            C2S_DrawRecord_22632 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_22632)YuanDanMsg.C2S_DrawRecord_22632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_22632)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_22633 extends GeneratedMessageV3 implements S2C_DrawRecord_22633OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<MyDrawRecord> myRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_22633 DEFAULT_INSTANCE = new S2C_DrawRecord_22633();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_22633> PARSER = new AbstractParser<S2C_DrawRecord_22633>() {
         public S2C_DrawRecord_22633 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_22633(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_22633(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_22633() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_22633();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_22633(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.myRecord_.add(input.readMessage(YuanDanMsg.MyDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_22633.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_22633)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_22633 other = (S2C_DrawRecord_22633)obj;
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

      public static S2C_DrawRecord_22633 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_22633 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_22633 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_22633 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_22633 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_22633 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_22633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_22633 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_22633 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_22633 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_22633 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_22633 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_22633 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_22633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_22633 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_22633 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_22633> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_22633> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_22633 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_22633OrBuilder {
         private int bitField0_;
         private List<MyDrawRecord> myRecord_;
         private RepeatedFieldBuilderV3<MyDrawRecord, MyDrawRecord.Builder, MyDrawRecordOrBuilder> myRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_22633.class, Builder.class);
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
            if (YuanDanMsg.S2C_DrawRecord_22633.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_DrawRecord_22633_descriptor;
         }

         public S2C_DrawRecord_22633 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_DrawRecord_22633.getDefaultInstance();
         }

         public S2C_DrawRecord_22633 build() {
            S2C_DrawRecord_22633 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_22633 buildPartial() {
            S2C_DrawRecord_22633 result = new S2C_DrawRecord_22633(this);
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
            if (other instanceof S2C_DrawRecord_22633) {
               return this.mergeFrom((S2C_DrawRecord_22633)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_22633 other) {
            if (other == YuanDanMsg.S2C_DrawRecord_22633.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = YuanDanMsg.S2C_DrawRecord_22633.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
            S2C_DrawRecord_22633 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_22633)YuanDanMsg.S2C_DrawRecord_22633.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_22633)e.getUnfinishedMessage();
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
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(YuanDanMsg.MyDrawRecord.getDefaultInstance());
         }

         public MyDrawRecord.Builder addMyRecordBuilder(int index) {
            return (MyDrawRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, YuanDanMsg.MyDrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_22634 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_22634OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_22634 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_22634();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_22634> PARSER = new AbstractParser<C2S_ServerDrawRecord_22634>() {
         public C2S_ServerDrawRecord_22634 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_22634(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_22634(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_22634() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_22634();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_22634(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_22634.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_22634)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_22634 other = (C2S_ServerDrawRecord_22634)obj;
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

      public static C2S_ServerDrawRecord_22634 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_22634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_22634 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_22634 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_22634 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_22634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_22634 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_22634 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_22634> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_22634> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_22634 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_22634OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_22634.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanMsg.C2S_ServerDrawRecord_22634.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_C2S_ServerDrawRecord_22634_descriptor;
         }

         public C2S_ServerDrawRecord_22634 getDefaultInstanceForType() {
            return YuanDanMsg.C2S_ServerDrawRecord_22634.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_22634 build() {
            C2S_ServerDrawRecord_22634 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_22634 buildPartial() {
            C2S_ServerDrawRecord_22634 result = new C2S_ServerDrawRecord_22634(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_22634) {
               return this.mergeFrom((C2S_ServerDrawRecord_22634)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_22634 other) {
            if (other == YuanDanMsg.C2S_ServerDrawRecord_22634.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_22634 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_22634)YuanDanMsg.C2S_ServerDrawRecord_22634.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_22634)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_22635 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_22635OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_22635 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_22635();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_22635> PARSER = new AbstractParser<S2C_ServerDrawRecord_22635>() {
         public S2C_ServerDrawRecord_22635 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_22635(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_22635(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_22635() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_22635();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_22635(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.serverRecord_.add(input.readMessage(YuanDanMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_22635.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_22635)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_22635 other = (S2C_ServerDrawRecord_22635)obj;
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

      public static S2C_ServerDrawRecord_22635 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_22635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_22635 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_22635 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_22635 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_22635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_22635 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_22635 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_22635> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_22635> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_22635 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_22635OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_22635.class, Builder.class);
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
            if (YuanDanMsg.S2C_ServerDrawRecord_22635.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_S2C_ServerDrawRecord_22635_descriptor;
         }

         public S2C_ServerDrawRecord_22635 getDefaultInstanceForType() {
            return YuanDanMsg.S2C_ServerDrawRecord_22635.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_22635 build() {
            S2C_ServerDrawRecord_22635 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_22635 buildPartial() {
            S2C_ServerDrawRecord_22635 result = new S2C_ServerDrawRecord_22635(this);
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
            if (other instanceof S2C_ServerDrawRecord_22635) {
               return this.mergeFrom((S2C_ServerDrawRecord_22635)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_22635 other) {
            if (other == YuanDanMsg.S2C_ServerDrawRecord_22635.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = YuanDanMsg.S2C_ServerDrawRecord_22635.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_22635 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_22635)YuanDanMsg.S2C_ServerDrawRecord_22635.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_22635)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(YuanDanMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, YuanDanMsg.ServerDrawRecord.getDefaultInstance());
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(MyDrawRecord.class, Builder.class);
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
            if (YuanDanMsg.MyDrawRecord.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_MyDrawRecord_descriptor;
         }

         public MyDrawRecord getDefaultInstanceForType() {
            return YuanDanMsg.MyDrawRecord.getDefaultInstance();
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
            if (other == YuanDanMsg.MyDrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = YuanDanMsg.MyDrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (MyDrawRecord)YuanDanMsg.MyDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = YuanDanMsg.MyDrawRecord.getDefaultInstance().getPlayerName();
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
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (YuanDanMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return YuanDanMsg.internal_static_yuanDan_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return YuanDanMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == YuanDanMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)YuanDanMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = YuanDanMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public interface C2S_DrawRecord_22632OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_22628OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_ExitBanquet_22605OrBuilder extends MessageOrBuilder {
      boolean hasScore();

      int getScore();

      List<Integer> getGuestList();

      int getGuestCount();

      int getGuest(int index);
   }

   public interface C2S_FancyReward_22624OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_LuckDrawInfo_22626OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Main_22601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_22630OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_PlayFinish_22607OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_PrayEnjoy_22615OrBuilder extends MessageOrBuilder {
      boolean hasEnjoy();

      int getEnjoy();
   }

   public interface C2S_Pray_22617OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface C2S_ReceiveShopAddUpReward_22623OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ServerDrawRecord_22634OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopAddUpInfo_22621OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignReceive_22619OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TaskReward_22611OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_WalkReward_22613OrBuilder extends MessageOrBuilder {
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

   public interface S2C_DrawRecord_22633OrBuilder extends MessageOrBuilder {
      List<MyDrawRecord> getMyRecordList();

      MyDrawRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends MyDrawRecordOrBuilder> getMyRecordOrBuilderList();

      MyDrawRecordOrBuilder getMyRecordOrBuilder(int index);
   }

   public interface S2C_Draw_22629OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ExitBanquet_22606OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FancyReward_22625OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_LuckDrawInfo_22627OrBuilder extends MessageOrBuilder {
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

      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface S2C_Main_22602OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OpenReward_22631OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PlayFinish_22608OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PrayEnjoy_22616OrBuilder extends MessageOrBuilder {
      boolean hasEnjoy();

      int getEnjoy();
   }

   public interface S2C_Pray_22618OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ServerDrawRecord_22635OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_ShopAddUpInfo_22622OrBuilder extends MessageOrBuilder {
      boolean hasDailyRecharge();

      int getDailyRecharge();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface S2C_SignReceive_22620OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_TaskNotify_22610OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_TaskReward_22612OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_WalkReward_22614OrBuilder extends MessageOrBuilder {
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
