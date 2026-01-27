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

public final class FlowerFireActivityMsg {
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FlowerFireActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0018FlowerFireActivity.proto\u0012$flowerFireActivity.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\u001a\nRank.proto\"\u0018\n\u0016C2S_ActivityInfo_17101\"e\n\u0016S2C_ActivityInfo_17102\u0012\u0018\n\u0010activityStartDay\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010severActivityDay\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000factivityStartLv\u0018\u0003 \u0002(\u0005\"X\n\nDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"c\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\")\n\u0015C2S_FancyReward_17168\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_17169\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_17103\"×\u0001\n\u0016S2C_LuckDrawInfo_17104\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\flotteryStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_17105\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_17106\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_17107\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_17108\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_17109\"Z\n\u0014S2C_DrawRecord_17110\u0012B\n\bmyRecrod\u0018\u0001 \u0003(\u000b20.flowerFireActivity.com.gzbz.protobuf.DrawRecord\"\u001c\n\u001aC2S_ServerDrawRecord_17170\"j\n\u001aS2C_ServerDrawRecord_17171\u0012L\n\fserverRecord\u0018\u0001 \u0003(\u000b26.flowerFireActivity.com.gzbz.protobuf.ServerDrawRecord\"\u001d\n\u000eC2S_Pray_17121\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\".\n\u000eS2C_Pray_17122\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0002 \u0002(\u0005\"N\n\u0018S2C_PrayTaskNotify_17124\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"%\n\u0012S2C_PrayInfo_17126\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\"L\n\u0016S2C_PrayTaskList_17128\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u001f\n\u001dC2S_LampRiddleTotalInfo_17153\"J\n\u001dS2C_LampRiddleTotalInfo_17154\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\"5\n!C2S_ReceiveLampRiddleReward_17155\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_WineTotalInfo_17156\"Ë\u0001\n\u0017S2C_WineTotalInfo_17157\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012^\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b2=.flowerFireActivity.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\"/\n\u001bC2S_ReceiveWineReward_17158\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_ItemShopInfo_17160\"b\n\u0016S2C_ItemShopInfo_17161\u0012H\n\fitemShopInfo\u0018\u0001 \u0003(\u000b22.flowerFireActivity.com.gzbz.protobuf.ItemShopInfo\",\n\fItemShopInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0002 \u0002(\u0005\"/\n\u0011C2S_BuyItem_17162\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006amount\u0018\u0002 \u0002(\u0005\"\u0016\n\u0014C2S_BattleInfo_17165\"?\n\u0014S2C_BattleInfo_17166\u0012\u0011\n\tbattleNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fbattleBuyNum\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_BuyBattleTimes_17167B,\n\u0011com.gzbz.protobufB\u0015FlowerFireActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor(), RankMsg.getDescriptor()});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor, new String[]{"ActivityStartDay", "SeverActivityDay", "ActivityStartLv"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor, new String[]{"TargetId"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor, new String[]{"Result", "TargetId"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotteryStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor, new String[]{"Type"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor, new String[]{"Id"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor, new String[]{"Id"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor, new String[]{"MyRecrod"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor, new String[]{"ServerRecord"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor, new String[]{"Idx"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor, new String[]{"PrayNum", "Idx"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor, new String[]{"Task"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor, new String[]{"PrayNum"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor, new String[]{"Task"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor, new String[]{"GotRewards", "StageRecharge"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor, new String[]{"RewardId"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor, new String[]{"RewardId"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor, new String[]{"ItemShopInfo"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor, new String[]{"Id", "BuyTimes"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor, new String[]{"Id", "Amount"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor, new String[0]);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor, new String[]{"BattleNum", "BattleBuyNum"});
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor, new String[0]);
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
      RankMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_17101 extends GeneratedMessageV3 implements C2S_ActivityInfo_17101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_17101 DEFAULT_INSTANCE = new C2S_ActivityInfo_17101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_17101> PARSER = new AbstractParser<C2S_ActivityInfo_17101>() {
         public C2S_ActivityInfo_17101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_17101(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_17101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_17101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_17101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_17101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_17101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_17101)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_17101 other = (C2S_ActivityInfo_17101)obj;
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

      public static C2S_ActivityInfo_17101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_17101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_17101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_17101 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_17101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_17101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_17101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_17101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_17101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_17101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_17101> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_17101> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_17101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_17101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_17101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_ActivityInfo_17101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ActivityInfo_17101_descriptor;
         }

         public C2S_ActivityInfo_17101 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_ActivityInfo_17101.getDefaultInstance();
         }

         public C2S_ActivityInfo_17101 build() {
            C2S_ActivityInfo_17101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_17101 buildPartial() {
            C2S_ActivityInfo_17101 result = new C2S_ActivityInfo_17101(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_17101) {
               return this.mergeFrom((C2S_ActivityInfo_17101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_17101 other) {
            if (other == FlowerFireActivityMsg.C2S_ActivityInfo_17101.getDefaultInstance()) {
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
            C2S_ActivityInfo_17101 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_17101)FlowerFireActivityMsg.C2S_ActivityInfo_17101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_17101)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_17102 extends GeneratedMessageV3 implements S2C_ActivityInfo_17102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYSTARTDAY_FIELD_NUMBER = 1;
      private int activityStartDay_;
      public static final int SEVERACTIVITYDAY_FIELD_NUMBER = 2;
      private int severActivityDay_;
      public static final int ACTIVITYSTARTLV_FIELD_NUMBER = 3;
      private int activityStartLv_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_17102 DEFAULT_INSTANCE = new S2C_ActivityInfo_17102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_17102> PARSER = new AbstractParser<S2C_ActivityInfo_17102>() {
         public S2C_ActivityInfo_17102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_17102(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_17102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_17102() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_17102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_17102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.activityStartDay_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.severActivityDay_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.activityStartLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_17102.class, Builder.class);
      }

      public boolean hasActivityStartDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityStartDay() {
         return this.activityStartDay_;
      }

      public boolean hasSeverActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSeverActivityDay() {
         return this.severActivityDay_;
      }

      public boolean hasActivityStartLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getActivityStartLv() {
         return this.activityStartLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityStartDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeverActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityStartLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityStartDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.severActivityDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.activityStartLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityStartDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.severActivityDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.activityStartLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_17102)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_17102 other = (S2C_ActivityInfo_17102)obj;
            if (this.hasActivityStartDay() != other.hasActivityStartDay()) {
               return false;
            } else if (this.hasActivityStartDay() && this.getActivityStartDay() != other.getActivityStartDay()) {
               return false;
            } else if (this.hasSeverActivityDay() != other.hasSeverActivityDay()) {
               return false;
            } else if (this.hasSeverActivityDay() && this.getSeverActivityDay() != other.getSeverActivityDay()) {
               return false;
            } else if (this.hasActivityStartLv() != other.hasActivityStartLv()) {
               return false;
            } else if (this.hasActivityStartLv() && this.getActivityStartLv() != other.getActivityStartLv()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasActivityStartDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityStartDay();
            }

            if (this.hasSeverActivityDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeverActivityDay();
            }

            if (this.hasActivityStartLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getActivityStartLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_17102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_17102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_17102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_17102 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_17102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_17102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_17102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_17102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_17102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_17102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_17102> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_17102> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_17102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_17102OrBuilder {
         private int bitField0_;
         private int activityStartDay_;
         private int severActivityDay_;
         private int activityStartLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_17102.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_ActivityInfo_17102.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityStartDay_ = 0;
            this.bitField0_ &= -2;
            this.severActivityDay_ = 0;
            this.bitField0_ &= -3;
            this.activityStartLv_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ActivityInfo_17102_descriptor;
         }

         public S2C_ActivityInfo_17102 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_ActivityInfo_17102.getDefaultInstance();
         }

         public S2C_ActivityInfo_17102 build() {
            S2C_ActivityInfo_17102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_17102 buildPartial() {
            S2C_ActivityInfo_17102 result = new S2C_ActivityInfo_17102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityStartDay_ = this.activityStartDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.severActivityDay_ = this.severActivityDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.activityStartLv_ = this.activityStartLv_;
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
            if (other instanceof S2C_ActivityInfo_17102) {
               return this.mergeFrom((S2C_ActivityInfo_17102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_17102 other) {
            if (other == FlowerFireActivityMsg.S2C_ActivityInfo_17102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityStartDay()) {
                  this.setActivityStartDay(other.getActivityStartDay());
               }

               if (other.hasSeverActivityDay()) {
                  this.setSeverActivityDay(other.getSeverActivityDay());
               }

               if (other.hasActivityStartLv()) {
                  this.setActivityStartLv(other.getActivityStartLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityStartDay()) {
               return false;
            } else if (!this.hasSeverActivityDay()) {
               return false;
            } else {
               return this.hasActivityStartLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_17102 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_17102)FlowerFireActivityMsg.S2C_ActivityInfo_17102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_17102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityStartDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityStartDay() {
            return this.activityStartDay_;
         }

         public Builder setActivityStartDay(int value) {
            this.bitField0_ |= 1;
            this.activityStartDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityStartDay() {
            this.bitField0_ &= -2;
            this.activityStartDay_ = 0;
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

         public boolean hasActivityStartLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getActivityStartLv() {
            return this.activityStartLv_;
         }

         public Builder setActivityStartLv(int value) {
            this.bitField0_ |= 4;
            this.activityStartLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityStartLv() {
            this.bitField0_ &= -5;
            this.activityStartLv_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
            if (FlowerFireActivityMsg.DrawRecord.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         public DrawRecord getDefaultInstanceForType() {
            return FlowerFireActivityMsg.DrawRecord.getDefaultInstance();
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
            if (other == FlowerFireActivityMsg.DrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = FlowerFireActivityMsg.DrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (DrawRecord)FlowerFireActivityMsg.DrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = FlowerFireActivityMsg.DrawRecord.getDefaultInstance().getPlayerName();
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (FlowerFireActivityMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return FlowerFireActivityMsg.ServerDrawRecord.getDefaultInstance();
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
            if (other == FlowerFireActivityMsg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)FlowerFireActivityMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = FlowerFireActivityMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_FancyReward_17168 extends GeneratedMessageV3 implements C2S_FancyReward_17168OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_17168 DEFAULT_INSTANCE = new C2S_FancyReward_17168();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_17168> PARSER = new AbstractParser<C2S_FancyReward_17168>() {
         public C2S_FancyReward_17168 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_17168(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_17168(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_17168() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_17168();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_17168(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17168.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FancyReward_17168)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_17168 other = (C2S_FancyReward_17168)obj;
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

      public static C2S_FancyReward_17168 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17168 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17168 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17168 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17168 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17168 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17168)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17168 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17168 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17168 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17168 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17168 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17168 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17168)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_17168 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_17168 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_17168> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_17168> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_17168 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_17168OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17168.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_FancyReward_17168.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_FancyReward_17168_descriptor;
         }

         public C2S_FancyReward_17168 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_FancyReward_17168.getDefaultInstance();
         }

         public C2S_FancyReward_17168 build() {
            C2S_FancyReward_17168 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_17168 buildPartial() {
            C2S_FancyReward_17168 result = new C2S_FancyReward_17168(this);
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
            if (other instanceof C2S_FancyReward_17168) {
               return this.mergeFrom((C2S_FancyReward_17168)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_17168 other) {
            if (other == FlowerFireActivityMsg.C2S_FancyReward_17168.getDefaultInstance()) {
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
            C2S_FancyReward_17168 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_17168)FlowerFireActivityMsg.C2S_FancyReward_17168.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_17168)e.getUnfinishedMessage();
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

   public static final class S2C_FancyReward_17169 extends GeneratedMessageV3 implements S2C_FancyReward_17169OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_17169 DEFAULT_INSTANCE = new S2C_FancyReward_17169();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_17169> PARSER = new AbstractParser<S2C_FancyReward_17169>() {
         public S2C_FancyReward_17169 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_17169(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_17169(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_17169() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_17169();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_17169(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17169.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FancyReward_17169)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_17169 other = (S2C_FancyReward_17169)obj;
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

      public static S2C_FancyReward_17169 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17169 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17169 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17169 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17169 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17169 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17169)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17169 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17169 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17169 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17169 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17169 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17169 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17169)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_17169 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_17169 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_17169> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_17169> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_17169 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_17169OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17169.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_FancyReward_17169.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_FancyReward_17169_descriptor;
         }

         public S2C_FancyReward_17169 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_FancyReward_17169.getDefaultInstance();
         }

         public S2C_FancyReward_17169 build() {
            S2C_FancyReward_17169 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_17169 buildPartial() {
            S2C_FancyReward_17169 result = new S2C_FancyReward_17169(this);
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
            if (other instanceof S2C_FancyReward_17169) {
               return this.mergeFrom((S2C_FancyReward_17169)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_17169 other) {
            if (other == FlowerFireActivityMsg.S2C_FancyReward_17169.getDefaultInstance()) {
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
            S2C_FancyReward_17169 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_17169)FlowerFireActivityMsg.S2C_FancyReward_17169.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_17169)e.getUnfinishedMessage();
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

   public static final class C2S_LuckDrawInfo_17103 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_17103OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_17103 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_17103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_17103> PARSER = new AbstractParser<C2S_LuckDrawInfo_17103>() {
         public C2S_LuckDrawInfo_17103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_17103(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_17103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_17103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_17103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_17103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_17103.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_17103)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_17103 other = (C2S_LuckDrawInfo_17103)obj;
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

      public static C2S_LuckDrawInfo_17103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_17103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_17103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_17103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_17103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_17103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_17103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_17103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_17103> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_17103> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_17103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_17103OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_17103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_LuckDrawInfo_17103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_17103_descriptor;
         }

         public C2S_LuckDrawInfo_17103 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_LuckDrawInfo_17103.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_17103 build() {
            C2S_LuckDrawInfo_17103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_17103 buildPartial() {
            C2S_LuckDrawInfo_17103 result = new C2S_LuckDrawInfo_17103(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_17103) {
               return this.mergeFrom((C2S_LuckDrawInfo_17103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_17103 other) {
            if (other == FlowerFireActivityMsg.C2S_LuckDrawInfo_17103.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_17103 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_17103)FlowerFireActivityMsg.C2S_LuckDrawInfo_17103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_17103)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_17104 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_17104OrBuilder {
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
      private static final S2C_LuckDrawInfo_17104 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_17104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_17104> PARSER = new AbstractParser<S2C_LuckDrawInfo_17104>() {
         public S2C_LuckDrawInfo_17104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_17104(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_17104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_17104() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_17104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_17104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_17104.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LuckDrawInfo_17104)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_17104 other = (S2C_LuckDrawInfo_17104)obj;
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

      public static S2C_LuckDrawInfo_17104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_17104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_17104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_17104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_17104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_17104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_17104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_17104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_17104> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_17104> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_17104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_17104OrBuilder {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_17104.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.emptyIntList();
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_17104_descriptor;
         }

         public S2C_LuckDrawInfo_17104 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_17104 build() {
            S2C_LuckDrawInfo_17104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_17104 buildPartial() {
            S2C_LuckDrawInfo_17104 result = new S2C_LuckDrawInfo_17104(this);
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
            if (other instanceof S2C_LuckDrawInfo_17104) {
               return this.mergeFrom((S2C_LuckDrawInfo_17104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_17104 other) {
            if (other == FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.getDefaultInstance()) {
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
                     this.seniorRewardsBuilder_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
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
            S2C_LuckDrawInfo_17104 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_17104)FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_17104)e.getUnfinishedMessage();
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
               this.hadRewardId_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.mutableCopy(this.hadRewardId_);
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
            this.hadRewardId_ = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.emptyIntList();
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

   public static final class C2S_Draw_17105 extends GeneratedMessageV3 implements C2S_Draw_17105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_17105 DEFAULT_INSTANCE = new C2S_Draw_17105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_17105> PARSER = new AbstractParser<C2S_Draw_17105>() {
         public C2S_Draw_17105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_17105(input, extensionRegistry);
         }
      };

      private C2S_Draw_17105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_17105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_17105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_17105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_17105.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_17105)) {
            return super.equals(obj);
         } else {
            C2S_Draw_17105 other = (C2S_Draw_17105)obj;
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

      public static C2S_Draw_17105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data);
      }

      public static C2S_Draw_17105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_17105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data);
      }

      public static C2S_Draw_17105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_17105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data);
      }

      public static C2S_Draw_17105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_17105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_17105 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_17105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_17105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_17105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_17105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_17105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_17105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_17105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_17105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_17105> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_17105> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_17105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_17105OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_17105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_Draw_17105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Draw_17105_descriptor;
         }

         public C2S_Draw_17105 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_Draw_17105.getDefaultInstance();
         }

         public C2S_Draw_17105 build() {
            C2S_Draw_17105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_17105 buildPartial() {
            C2S_Draw_17105 result = new C2S_Draw_17105(this);
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
            if (other instanceof C2S_Draw_17105) {
               return this.mergeFrom((C2S_Draw_17105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_17105 other) {
            if (other == FlowerFireActivityMsg.C2S_Draw_17105.getDefaultInstance()) {
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
            C2S_Draw_17105 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_17105)FlowerFireActivityMsg.C2S_Draw_17105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_17105)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_17106 extends GeneratedMessageV3 implements S2C_Draw_17106OrBuilder {
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
      private static final S2C_Draw_17106 DEFAULT_INSTANCE = new S2C_Draw_17106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_17106> PARSER = new AbstractParser<S2C_Draw_17106>() {
         public S2C_Draw_17106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_17106(input, extensionRegistry);
         }
      };

      private S2C_Draw_17106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_17106() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_17106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_17106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_17106.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Draw_17106)) {
            return super.equals(obj);
         } else {
            S2C_Draw_17106 other = (S2C_Draw_17106)obj;
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

      public static S2C_Draw_17106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data);
      }

      public static S2C_Draw_17106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_17106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data);
      }

      public static S2C_Draw_17106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_17106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data);
      }

      public static S2C_Draw_17106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_17106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_17106 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_17106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_17106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_17106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_17106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_17106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_17106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_17106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_17106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_17106> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_17106> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_17106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_17106OrBuilder {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_17106.class, Builder.class);
         }

         private Builder() {
            this.id_ = FlowerFireActivityMsg.S2C_Draw_17106.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = FlowerFireActivityMsg.S2C_Draw_17106.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_Draw_17106.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = FlowerFireActivityMsg.S2C_Draw_17106.emptyIntList();
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Draw_17106_descriptor;
         }

         public S2C_Draw_17106 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_Draw_17106.getDefaultInstance();
         }

         public S2C_Draw_17106 build() {
            S2C_Draw_17106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_17106 buildPartial() {
            S2C_Draw_17106 result = new S2C_Draw_17106(this);
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
            if (other instanceof S2C_Draw_17106) {
               return this.mergeFrom((S2C_Draw_17106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_17106 other) {
            if (other == FlowerFireActivityMsg.S2C_Draw_17106.getDefaultInstance()) {
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
                     this.seniorNumBuilder_ = FlowerFireActivityMsg.S2C_Draw_17106.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
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
            S2C_Draw_17106 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_17106)FlowerFireActivityMsg.S2C_Draw_17106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_17106)e.getUnfinishedMessage();
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
               this.id_ = FlowerFireActivityMsg.S2C_Draw_17106.mutableCopy(this.id_);
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
            this.id_ = FlowerFireActivityMsg.S2C_Draw_17106.emptyIntList();
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

   public static final class C2S_OpenReward_17107 extends GeneratedMessageV3 implements C2S_OpenReward_17107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_17107 DEFAULT_INSTANCE = new C2S_OpenReward_17107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_17107> PARSER = new AbstractParser<C2S_OpenReward_17107>() {
         public C2S_OpenReward_17107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_17107(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_17107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_17107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_17107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_17107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_17107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_17107)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_17107 other = (C2S_OpenReward_17107)obj;
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

      public static C2S_OpenReward_17107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_17107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_17107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_17107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_17107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_17107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_17107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_17107 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_17107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_17107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_17107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_17107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_17107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_17107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_17107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_17107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_17107> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_17107> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_17107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_17107OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_17107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_OpenReward_17107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_OpenReward_17107_descriptor;
         }

         public C2S_OpenReward_17107 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_OpenReward_17107.getDefaultInstance();
         }

         public C2S_OpenReward_17107 build() {
            C2S_OpenReward_17107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_17107 buildPartial() {
            C2S_OpenReward_17107 result = new C2S_OpenReward_17107(this);
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
            if (other instanceof C2S_OpenReward_17107) {
               return this.mergeFrom((C2S_OpenReward_17107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_17107 other) {
            if (other == FlowerFireActivityMsg.C2S_OpenReward_17107.getDefaultInstance()) {
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
            C2S_OpenReward_17107 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_17107)FlowerFireActivityMsg.C2S_OpenReward_17107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_17107)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_17108 extends GeneratedMessageV3 implements S2C_OpenReward_17108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_17108 DEFAULT_INSTANCE = new S2C_OpenReward_17108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_17108> PARSER = new AbstractParser<S2C_OpenReward_17108>() {
         public S2C_OpenReward_17108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_17108(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_17108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_17108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_17108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_17108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_17108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_17108)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_17108 other = (S2C_OpenReward_17108)obj;
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

      public static S2C_OpenReward_17108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_17108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_17108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_17108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_17108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_17108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_17108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_17108 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_17108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_17108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_17108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_17108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_17108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_17108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_17108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_17108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_17108> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_17108> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_17108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_17108OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_17108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_OpenReward_17108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_OpenReward_17108_descriptor;
         }

         public S2C_OpenReward_17108 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_OpenReward_17108.getDefaultInstance();
         }

         public S2C_OpenReward_17108 build() {
            S2C_OpenReward_17108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_17108 buildPartial() {
            S2C_OpenReward_17108 result = new S2C_OpenReward_17108(this);
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
            if (other instanceof S2C_OpenReward_17108) {
               return this.mergeFrom((S2C_OpenReward_17108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_17108 other) {
            if (other == FlowerFireActivityMsg.S2C_OpenReward_17108.getDefaultInstance()) {
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
            S2C_OpenReward_17108 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_17108)FlowerFireActivityMsg.S2C_OpenReward_17108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_17108)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_17109 extends GeneratedMessageV3 implements C2S_DrawRecord_17109OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_17109 DEFAULT_INSTANCE = new C2S_DrawRecord_17109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_17109> PARSER = new AbstractParser<C2S_DrawRecord_17109>() {
         public C2S_DrawRecord_17109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_17109(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_17109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_17109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_17109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_17109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17109.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_17109)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_17109 other = (C2S_DrawRecord_17109)obj;
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

      public static C2S_DrawRecord_17109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17109 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_17109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_17109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_17109> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_17109> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_17109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_17109OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_DrawRecord_17109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_DrawRecord_17109_descriptor;
         }

         public C2S_DrawRecord_17109 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_DrawRecord_17109.getDefaultInstance();
         }

         public C2S_DrawRecord_17109 build() {
            C2S_DrawRecord_17109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_17109 buildPartial() {
            C2S_DrawRecord_17109 result = new C2S_DrawRecord_17109(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_17109) {
               return this.mergeFrom((C2S_DrawRecord_17109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_17109 other) {
            if (other == FlowerFireActivityMsg.C2S_DrawRecord_17109.getDefaultInstance()) {
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
            C2S_DrawRecord_17109 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_17109)FlowerFireActivityMsg.C2S_DrawRecord_17109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_17109)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_17110 extends GeneratedMessageV3 implements S2C_DrawRecord_17110OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECROD_FIELD_NUMBER = 1;
      private List<DrawRecord> myRecrod_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_17110 DEFAULT_INSTANCE = new S2C_DrawRecord_17110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_17110> PARSER = new AbstractParser<S2C_DrawRecord_17110>() {
         public S2C_DrawRecord_17110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_17110(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_17110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_17110() {
         this.memoizedIsInitialized = -1;
         this.myRecrod_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_17110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_17110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.myRecrod_.add(input.readMessage(FlowerFireActivityMsg.DrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17110.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_17110)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_17110 other = (S2C_DrawRecord_17110)obj;
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

      public static S2C_DrawRecord_17110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17110 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_17110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_17110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_17110> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_17110> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_17110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_17110OrBuilder {
         private int bitField0_;
         private List<DrawRecord> myRecrod_;
         private RepeatedFieldBuilderV3<DrawRecord, DrawRecord.Builder, DrawRecordOrBuilder> myRecrodBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17110.class, Builder.class);
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
            if (FlowerFireActivityMsg.S2C_DrawRecord_17110.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_DrawRecord_17110_descriptor;
         }

         public S2C_DrawRecord_17110 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_DrawRecord_17110.getDefaultInstance();
         }

         public S2C_DrawRecord_17110 build() {
            S2C_DrawRecord_17110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_17110 buildPartial() {
            S2C_DrawRecord_17110 result = new S2C_DrawRecord_17110(this);
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
            if (other instanceof S2C_DrawRecord_17110) {
               return this.mergeFrom((S2C_DrawRecord_17110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_17110 other) {
            if (other == FlowerFireActivityMsg.S2C_DrawRecord_17110.getDefaultInstance()) {
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
                     this.myRecrodBuilder_ = FlowerFireActivityMsg.S2C_DrawRecord_17110.alwaysUseFieldBuilders ? this.getMyRecrodFieldBuilder() : null;
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
            S2C_DrawRecord_17110 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_17110)FlowerFireActivityMsg.S2C_DrawRecord_17110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_17110)e.getUnfinishedMessage();
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
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(FlowerFireActivityMsg.DrawRecord.getDefaultInstance());
         }

         public DrawRecord.Builder addMyRecrodBuilder(int index) {
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(index, FlowerFireActivityMsg.DrawRecord.getDefaultInstance());
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

   public static final class C2S_ServerDrawRecord_17170 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_17170OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_17170 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_17170();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_17170> PARSER = new AbstractParser<C2S_ServerDrawRecord_17170>() {
         public C2S_ServerDrawRecord_17170 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_17170(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_17170(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_17170() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_17170();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_17170(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17170.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_17170)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_17170 other = (C2S_ServerDrawRecord_17170)obj;
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

      public static C2S_ServerDrawRecord_17170 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17170)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17170 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17170 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17170 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17170)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_17170 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_17170 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_17170> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_17170> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_17170 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_17170OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17170.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_ServerDrawRecord_17170.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_17170_descriptor;
         }

         public C2S_ServerDrawRecord_17170 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_ServerDrawRecord_17170.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_17170 build() {
            C2S_ServerDrawRecord_17170 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_17170 buildPartial() {
            C2S_ServerDrawRecord_17170 result = new C2S_ServerDrawRecord_17170(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_17170) {
               return this.mergeFrom((C2S_ServerDrawRecord_17170)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_17170 other) {
            if (other == FlowerFireActivityMsg.C2S_ServerDrawRecord_17170.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_17170 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_17170)FlowerFireActivityMsg.C2S_ServerDrawRecord_17170.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_17170)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_17171 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_17171OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_17171 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_17171();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_17171> PARSER = new AbstractParser<S2C_ServerDrawRecord_17171>() {
         public S2C_ServerDrawRecord_17171 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_17171(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_17171(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_17171() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_17171();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_17171(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.serverRecord_.add(input.readMessage(FlowerFireActivityMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17171.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_17171)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_17171 other = (S2C_ServerDrawRecord_17171)obj;
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

      public static S2C_ServerDrawRecord_17171 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17171)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17171 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17171 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17171 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17171)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_17171 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_17171 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_17171> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_17171> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_17171 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_17171OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17171.class, Builder.class);
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
            if (FlowerFireActivityMsg.S2C_ServerDrawRecord_17171.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_17171_descriptor;
         }

         public S2C_ServerDrawRecord_17171 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_ServerDrawRecord_17171.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_17171 build() {
            S2C_ServerDrawRecord_17171 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_17171 buildPartial() {
            S2C_ServerDrawRecord_17171 result = new S2C_ServerDrawRecord_17171(this);
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
            if (other instanceof S2C_ServerDrawRecord_17171) {
               return this.mergeFrom((S2C_ServerDrawRecord_17171)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_17171 other) {
            if (other == FlowerFireActivityMsg.S2C_ServerDrawRecord_17171.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = FlowerFireActivityMsg.S2C_ServerDrawRecord_17171.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_17171 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_17171)FlowerFireActivityMsg.S2C_ServerDrawRecord_17171.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_17171)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(FlowerFireActivityMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, FlowerFireActivityMsg.ServerDrawRecord.getDefaultInstance());
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

   public static final class C2S_Pray_17121 extends GeneratedMessageV3 implements C2S_Pray_17121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_17121 DEFAULT_INSTANCE = new C2S_Pray_17121();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_17121> PARSER = new AbstractParser<C2S_Pray_17121>() {
         public C2S_Pray_17121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_17121(input, extensionRegistry);
         }
      };

      private C2S_Pray_17121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_17121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_17121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_17121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_17121.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Pray_17121)) {
            return super.equals(obj);
         } else {
            C2S_Pray_17121 other = (C2S_Pray_17121)obj;
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

      public static C2S_Pray_17121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data);
      }

      public static C2S_Pray_17121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_17121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data);
      }

      public static C2S_Pray_17121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_17121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data);
      }

      public static C2S_Pray_17121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_17121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_17121 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_17121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_17121 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_17121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_17121 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_17121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_17121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_17121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_17121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_17121> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_17121> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_17121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_17121OrBuilder {
         private int bitField0_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_17121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_Pray_17121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_Pray_17121_descriptor;
         }

         public C2S_Pray_17121 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_Pray_17121.getDefaultInstance();
         }

         public C2S_Pray_17121 build() {
            C2S_Pray_17121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_17121 buildPartial() {
            C2S_Pray_17121 result = new C2S_Pray_17121(this);
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
            if (other instanceof C2S_Pray_17121) {
               return this.mergeFrom((C2S_Pray_17121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_17121 other) {
            if (other == FlowerFireActivityMsg.C2S_Pray_17121.getDefaultInstance()) {
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
            C2S_Pray_17121 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_17121)FlowerFireActivityMsg.C2S_Pray_17121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_17121)e.getUnfinishedMessage();
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

   public static final class S2C_Pray_17122 extends GeneratedMessageV3 implements S2C_Pray_17122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      public static final int IDX_FIELD_NUMBER = 2;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_17122 DEFAULT_INSTANCE = new S2C_Pray_17122();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_17122> PARSER = new AbstractParser<S2C_Pray_17122>() {
         public S2C_Pray_17122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_17122(input, extensionRegistry);
         }
      };

      private S2C_Pray_17122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_17122() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_17122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_17122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_17122.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Pray_17122)) {
            return super.equals(obj);
         } else {
            S2C_Pray_17122 other = (S2C_Pray_17122)obj;
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

      public static S2C_Pray_17122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data);
      }

      public static S2C_Pray_17122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_17122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data);
      }

      public static S2C_Pray_17122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_17122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data);
      }

      public static S2C_Pray_17122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_17122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_17122 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_17122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_17122 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_17122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_17122 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_17122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_17122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_17122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_17122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_17122> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_17122> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_17122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_17122OrBuilder {
         private int bitField0_;
         private int prayNum_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_17122.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_Pray_17122.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_Pray_17122_descriptor;
         }

         public S2C_Pray_17122 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_Pray_17122.getDefaultInstance();
         }

         public S2C_Pray_17122 build() {
            S2C_Pray_17122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_17122 buildPartial() {
            S2C_Pray_17122 result = new S2C_Pray_17122(this);
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
            if (other instanceof S2C_Pray_17122) {
               return this.mergeFrom((S2C_Pray_17122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_17122 other) {
            if (other == FlowerFireActivityMsg.S2C_Pray_17122.getDefaultInstance()) {
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
            S2C_Pray_17122 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_17122)FlowerFireActivityMsg.S2C_Pray_17122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_17122)e.getUnfinishedMessage();
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

   public static final class S2C_PrayTaskNotify_17124 extends GeneratedMessageV3 implements S2C_PrayTaskNotify_17124OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskNotify_17124 DEFAULT_INSTANCE = new S2C_PrayTaskNotify_17124();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskNotify_17124> PARSER = new AbstractParser<S2C_PrayTaskNotify_17124>() {
         public S2C_PrayTaskNotify_17124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskNotify_17124(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskNotify_17124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskNotify_17124() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskNotify_17124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskNotify_17124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_17124.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayTaskNotify_17124)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskNotify_17124 other = (S2C_PrayTaskNotify_17124)obj;
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

      public static S2C_PrayTaskNotify_17124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_17124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_17124 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_17124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_17124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_17124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskNotify_17124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskNotify_17124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskNotify_17124> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskNotify_17124> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskNotify_17124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskNotify_17124OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_17124.class, Builder.class);
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
            if (FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_17124_descriptor;
         }

         public S2C_PrayTaskNotify_17124 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.getDefaultInstance();
         }

         public S2C_PrayTaskNotify_17124 build() {
            S2C_PrayTaskNotify_17124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskNotify_17124 buildPartial() {
            S2C_PrayTaskNotify_17124 result = new S2C_PrayTaskNotify_17124(this);
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
            if (other instanceof S2C_PrayTaskNotify_17124) {
               return this.mergeFrom((S2C_PrayTaskNotify_17124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskNotify_17124 other) {
            if (other == FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.getDefaultInstance()) {
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
                     this.taskBuilder_ = FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskNotify_17124 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskNotify_17124)FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskNotify_17124)e.getUnfinishedMessage();
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

   public static final class S2C_PrayInfo_17126 extends GeneratedMessageV3 implements S2C_PrayInfo_17126OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayInfo_17126 DEFAULT_INSTANCE = new S2C_PrayInfo_17126();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayInfo_17126> PARSER = new AbstractParser<S2C_PrayInfo_17126>() {
         public S2C_PrayInfo_17126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayInfo_17126(input, extensionRegistry);
         }
      };

      private S2C_PrayInfo_17126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayInfo_17126() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayInfo_17126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayInfo_17126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_17126.class, Builder.class);
      }

      public boolean hasPrayNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayNum() {
         return this.prayNum_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayInfo_17126)) {
            return super.equals(obj);
         } else {
            S2C_PrayInfo_17126 other = (S2C_PrayInfo_17126)obj;
            if (this.hasPrayNum() != other.hasPrayNum()) {
               return false;
            } else if (this.hasPrayNum() && this.getPrayNum() != other.getPrayNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayInfo_17126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_17126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_17126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_17126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_17126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_17126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_17126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_17126 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_17126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_17126 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_17126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_17126 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_17126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_17126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayInfo_17126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayInfo_17126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayInfo_17126> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayInfo_17126> getParserForType() {
         return PARSER;
      }

      public S2C_PrayInfo_17126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayInfo_17126OrBuilder {
         private int bitField0_;
         private int prayNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_17126.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_PrayInfo_17126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayInfo_17126_descriptor;
         }

         public S2C_PrayInfo_17126 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_PrayInfo_17126.getDefaultInstance();
         }

         public S2C_PrayInfo_17126 build() {
            S2C_PrayInfo_17126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayInfo_17126 buildPartial() {
            S2C_PrayInfo_17126 result = new S2C_PrayInfo_17126(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayNum_ = this.prayNum_;
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
            if (other instanceof S2C_PrayInfo_17126) {
               return this.mergeFrom((S2C_PrayInfo_17126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayInfo_17126 other) {
            if (other == FlowerFireActivityMsg.S2C_PrayInfo_17126.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayNum()) {
                  this.setPrayNum(other.getPrayNum());
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
            S2C_PrayInfo_17126 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayInfo_17126)FlowerFireActivityMsg.S2C_PrayInfo_17126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayInfo_17126)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PrayTaskList_17128 extends GeneratedMessageV3 implements S2C_PrayTaskList_17128OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskList_17128 DEFAULT_INSTANCE = new S2C_PrayTaskList_17128();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskList_17128> PARSER = new AbstractParser<S2C_PrayTaskList_17128>() {
         public S2C_PrayTaskList_17128 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskList_17128(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskList_17128(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskList_17128() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskList_17128();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskList_17128(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_17128.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayTaskList_17128)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskList_17128 other = (S2C_PrayTaskList_17128)obj;
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

      public static S2C_PrayTaskList_17128 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_17128 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_17128 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_17128 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_17128 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_17128 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_17128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_17128 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_17128 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_17128 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_17128 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_17128 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_17128 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_17128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskList_17128 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskList_17128 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskList_17128> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskList_17128> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskList_17128 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskList_17128OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_17128.class, Builder.class);
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
            if (FlowerFireActivityMsg.S2C_PrayTaskList_17128.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_PrayTaskList_17128_descriptor;
         }

         public S2C_PrayTaskList_17128 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_PrayTaskList_17128.getDefaultInstance();
         }

         public S2C_PrayTaskList_17128 build() {
            S2C_PrayTaskList_17128 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskList_17128 buildPartial() {
            S2C_PrayTaskList_17128 result = new S2C_PrayTaskList_17128(this);
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
            if (other instanceof S2C_PrayTaskList_17128) {
               return this.mergeFrom((S2C_PrayTaskList_17128)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskList_17128 other) {
            if (other == FlowerFireActivityMsg.S2C_PrayTaskList_17128.getDefaultInstance()) {
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
                     this.taskBuilder_ = FlowerFireActivityMsg.S2C_PrayTaskList_17128.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskList_17128 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskList_17128)FlowerFireActivityMsg.S2C_PrayTaskList_17128.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskList_17128)e.getUnfinishedMessage();
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

   public static final class C2S_LampRiddleTotalInfo_17153 extends GeneratedMessageV3 implements C2S_LampRiddleTotalInfo_17153OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LampRiddleTotalInfo_17153 DEFAULT_INSTANCE = new C2S_LampRiddleTotalInfo_17153();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LampRiddleTotalInfo_17153> PARSER = new AbstractParser<C2S_LampRiddleTotalInfo_17153>() {
         public C2S_LampRiddleTotalInfo_17153 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LampRiddleTotalInfo_17153(input, extensionRegistry);
         }
      };

      private C2S_LampRiddleTotalInfo_17153(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LampRiddleTotalInfo_17153() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LampRiddleTotalInfo_17153();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LampRiddleTotalInfo_17153(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LampRiddleTotalInfo_17153.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LampRiddleTotalInfo_17153)) {
            return super.equals(obj);
         } else {
            C2S_LampRiddleTotalInfo_17153 other = (C2S_LampRiddleTotalInfo_17153)obj;
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

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_17153)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(InputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_17153 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_17153)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LampRiddleTotalInfo_17153 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LampRiddleTotalInfo_17153 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LampRiddleTotalInfo_17153> parser() {
         return PARSER;
      }

      public Parser<C2S_LampRiddleTotalInfo_17153> getParserForType() {
         return PARSER;
      }

      public C2S_LampRiddleTotalInfo_17153 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LampRiddleTotalInfo_17153OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LampRiddleTotalInfo_17153.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_LampRiddleTotalInfo_17153.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_17153_descriptor;
         }

         public C2S_LampRiddleTotalInfo_17153 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_LampRiddleTotalInfo_17153.getDefaultInstance();
         }

         public C2S_LampRiddleTotalInfo_17153 build() {
            C2S_LampRiddleTotalInfo_17153 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LampRiddleTotalInfo_17153 buildPartial() {
            C2S_LampRiddleTotalInfo_17153 result = new C2S_LampRiddleTotalInfo_17153(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LampRiddleTotalInfo_17153) {
               return this.mergeFrom((C2S_LampRiddleTotalInfo_17153)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LampRiddleTotalInfo_17153 other) {
            if (other == FlowerFireActivityMsg.C2S_LampRiddleTotalInfo_17153.getDefaultInstance()) {
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
            C2S_LampRiddleTotalInfo_17153 parsedMessage = null;

            try {
               parsedMessage = (C2S_LampRiddleTotalInfo_17153)FlowerFireActivityMsg.C2S_LampRiddleTotalInfo_17153.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LampRiddleTotalInfo_17153)e.getUnfinishedMessage();
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

   public static final class S2C_LampRiddleTotalInfo_17154 extends GeneratedMessageV3 implements S2C_LampRiddleTotalInfo_17154OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      private byte memoizedIsInitialized;
      private static final S2C_LampRiddleTotalInfo_17154 DEFAULT_INSTANCE = new S2C_LampRiddleTotalInfo_17154();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LampRiddleTotalInfo_17154> PARSER = new AbstractParser<S2C_LampRiddleTotalInfo_17154>() {
         public S2C_LampRiddleTotalInfo_17154 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LampRiddleTotalInfo_17154(input, extensionRegistry);
         }
      };

      private S2C_LampRiddleTotalInfo_17154(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LampRiddleTotalInfo_17154() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LampRiddleTotalInfo_17154();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LampRiddleTotalInfo_17154(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LampRiddleTotalInfo_17154.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageRecharge()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LampRiddleTotalInfo_17154)) {
            return super.equals(obj);
         } else {
            S2C_LampRiddleTotalInfo_17154 other = (S2C_LampRiddleTotalInfo_17154)obj;
            if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasStageRecharge() != other.hasStageRecharge()) {
               return false;
            } else if (this.hasStageRecharge() && this.getStageRecharge() != other.getStageRecharge()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_17154)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(InputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_17154 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_17154)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LampRiddleTotalInfo_17154 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LampRiddleTotalInfo_17154 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LampRiddleTotalInfo_17154> parser() {
         return PARSER;
      }

      public Parser<S2C_LampRiddleTotalInfo_17154> getParserForType() {
         return PARSER;
      }

      public S2C_LampRiddleTotalInfo_17154 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LampRiddleTotalInfo_17154OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LampRiddleTotalInfo_17154.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_17154_descriptor;
         }

         public S2C_LampRiddleTotalInfo_17154 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.getDefaultInstance();
         }

         public S2C_LampRiddleTotalInfo_17154 build() {
            S2C_LampRiddleTotalInfo_17154 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LampRiddleTotalInfo_17154 buildPartial() {
            S2C_LampRiddleTotalInfo_17154 result = new S2C_LampRiddleTotalInfo_17154(this);
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
            if (other instanceof S2C_LampRiddleTotalInfo_17154) {
               return this.mergeFrom((S2C_LampRiddleTotalInfo_17154)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LampRiddleTotalInfo_17154 other) {
            if (other == FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.getDefaultInstance()) {
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

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageRecharge();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LampRiddleTotalInfo_17154 parsedMessage = null;

            try {
               parsedMessage = (S2C_LampRiddleTotalInfo_17154)FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LampRiddleTotalInfo_17154)e.getUnfinishedMessage();
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
               this.gotRewards_ = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.emptyIntList();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ReceiveLampRiddleReward_17155 extends GeneratedMessageV3 implements C2S_ReceiveLampRiddleReward_17155OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveLampRiddleReward_17155 DEFAULT_INSTANCE = new C2S_ReceiveLampRiddleReward_17155();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveLampRiddleReward_17155> PARSER = new AbstractParser<C2S_ReceiveLampRiddleReward_17155>() {
         public C2S_ReceiveLampRiddleReward_17155 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveLampRiddleReward_17155(input, extensionRegistry);
         }
      };

      private C2S_ReceiveLampRiddleReward_17155(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveLampRiddleReward_17155() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveLampRiddleReward_17155();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveLampRiddleReward_17155(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLampRiddleReward_17155.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveLampRiddleReward_17155)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveLampRiddleReward_17155 other = (C2S_ReceiveLampRiddleReward_17155)obj;
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

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_17155)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_17155 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_17155)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveLampRiddleReward_17155 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveLampRiddleReward_17155 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveLampRiddleReward_17155> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveLampRiddleReward_17155> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveLampRiddleReward_17155 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveLampRiddleReward_17155OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLampRiddleReward_17155.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_ReceiveLampRiddleReward_17155.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_17155_descriptor;
         }

         public C2S_ReceiveLampRiddleReward_17155 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_ReceiveLampRiddleReward_17155.getDefaultInstance();
         }

         public C2S_ReceiveLampRiddleReward_17155 build() {
            C2S_ReceiveLampRiddleReward_17155 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveLampRiddleReward_17155 buildPartial() {
            C2S_ReceiveLampRiddleReward_17155 result = new C2S_ReceiveLampRiddleReward_17155(this);
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
            if (other instanceof C2S_ReceiveLampRiddleReward_17155) {
               return this.mergeFrom((C2S_ReceiveLampRiddleReward_17155)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveLampRiddleReward_17155 other) {
            if (other == FlowerFireActivityMsg.C2S_ReceiveLampRiddleReward_17155.getDefaultInstance()) {
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
            C2S_ReceiveLampRiddleReward_17155 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveLampRiddleReward_17155)FlowerFireActivityMsg.C2S_ReceiveLampRiddleReward_17155.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveLampRiddleReward_17155)e.getUnfinishedMessage();
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

   public static final class C2S_WineTotalInfo_17156 extends GeneratedMessageV3 implements C2S_WineTotalInfo_17156OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WineTotalInfo_17156 DEFAULT_INSTANCE = new C2S_WineTotalInfo_17156();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WineTotalInfo_17156> PARSER = new AbstractParser<C2S_WineTotalInfo_17156>() {
         public C2S_WineTotalInfo_17156 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WineTotalInfo_17156(input, extensionRegistry);
         }
      };

      private C2S_WineTotalInfo_17156(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WineTotalInfo_17156() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WineTotalInfo_17156();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WineTotalInfo_17156(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WineTotalInfo_17156.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WineTotalInfo_17156)) {
            return super.equals(obj);
         } else {
            C2S_WineTotalInfo_17156 other = (C2S_WineTotalInfo_17156)obj;
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

      public static C2S_WineTotalInfo_17156 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_17156)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(InputStream input) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WineTotalInfo_17156 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_17156 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_17156 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_17156)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WineTotalInfo_17156 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WineTotalInfo_17156 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WineTotalInfo_17156> parser() {
         return PARSER;
      }

      public Parser<C2S_WineTotalInfo_17156> getParserForType() {
         return PARSER;
      }

      public C2S_WineTotalInfo_17156 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WineTotalInfo_17156OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WineTotalInfo_17156.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_WineTotalInfo_17156.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_WineTotalInfo_17156_descriptor;
         }

         public C2S_WineTotalInfo_17156 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_WineTotalInfo_17156.getDefaultInstance();
         }

         public C2S_WineTotalInfo_17156 build() {
            C2S_WineTotalInfo_17156 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WineTotalInfo_17156 buildPartial() {
            C2S_WineTotalInfo_17156 result = new C2S_WineTotalInfo_17156(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WineTotalInfo_17156) {
               return this.mergeFrom((C2S_WineTotalInfo_17156)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WineTotalInfo_17156 other) {
            if (other == FlowerFireActivityMsg.C2S_WineTotalInfo_17156.getDefaultInstance()) {
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
            C2S_WineTotalInfo_17156 parsedMessage = null;

            try {
               parsedMessage = (C2S_WineTotalInfo_17156)FlowerFireActivityMsg.C2S_WineTotalInfo_17156.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WineTotalInfo_17156)e.getUnfinishedMessage();
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

   public static final class S2C_WineTotalInfo_17157 extends GeneratedMessageV3 implements S2C_WineTotalInfo_17157OrBuilder {
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
      private static final S2C_WineTotalInfo_17157 DEFAULT_INSTANCE = new S2C_WineTotalInfo_17157();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WineTotalInfo_17157> PARSER = new AbstractParser<S2C_WineTotalInfo_17157>() {
         public S2C_WineTotalInfo_17157 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WineTotalInfo_17157(input, extensionRegistry);
         }
      };

      private S2C_WineTotalInfo_17157(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WineTotalInfo_17157() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WineTotalInfo_17157();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WineTotalInfo_17157(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.nextUnlockReceiveReward_.add(input.readMessage(FlowerFireActivityMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WineTotalInfo_17157.class, Builder.class);
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
         } else if (!(obj instanceof S2C_WineTotalInfo_17157)) {
            return super.equals(obj);
         } else {
            S2C_WineTotalInfo_17157 other = (S2C_WineTotalInfo_17157)obj;
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

      public static S2C_WineTotalInfo_17157 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_17157)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(InputStream input) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WineTotalInfo_17157 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_17157 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_17157 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_17157)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WineTotalInfo_17157 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WineTotalInfo_17157 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WineTotalInfo_17157> parser() {
         return PARSER;
      }

      public Parser<S2C_WineTotalInfo_17157> getParserForType() {
         return PARSER;
      }

      public S2C_WineTotalInfo_17157 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WineTotalInfo_17157OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WineTotalInfo_17157.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.hasReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.hasReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_WineTotalInfo_17157.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_WineTotalInfo_17157_descriptor;
         }

         public S2C_WineTotalInfo_17157 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_WineTotalInfo_17157.getDefaultInstance();
         }

         public S2C_WineTotalInfo_17157 build() {
            S2C_WineTotalInfo_17157 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WineTotalInfo_17157 buildPartial() {
            S2C_WineTotalInfo_17157 result = new S2C_WineTotalInfo_17157(this);
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
            if (other instanceof S2C_WineTotalInfo_17157) {
               return this.mergeFrom((S2C_WineTotalInfo_17157)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WineTotalInfo_17157 other) {
            if (other == FlowerFireActivityMsg.S2C_WineTotalInfo_17157.getDefaultInstance()) {
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
                     this.nextUnlockReceiveRewardBuilder_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
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
            S2C_WineTotalInfo_17157 parsedMessage = null;

            try {
               parsedMessage = (S2C_WineTotalInfo_17157)FlowerFireActivityMsg.S2C_WineTotalInfo_17157.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WineTotalInfo_17157)e.getUnfinishedMessage();
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
               this.canReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.mutableCopy(this.canReceiveRewardIds_);
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
            this.canReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.mutableCopy(this.hasReceiveRewardIds_);
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
            this.hasReceiveRewardIds_ = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.emptyIntList();
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
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(FlowerFireActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, FlowerFireActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
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
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return FlowerFireActivityMsg.NextUnlockReceiveReward.getDefaultInstance();
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
            if (other == FlowerFireActivityMsg.NextUnlockReceiveReward.getDefaultInstance()) {
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
               parsedMessage = (NextUnlockReceiveReward)FlowerFireActivityMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ReceiveWineReward_17158 extends GeneratedMessageV3 implements C2S_ReceiveWineReward_17158OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveWineReward_17158 DEFAULT_INSTANCE = new C2S_ReceiveWineReward_17158();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveWineReward_17158> PARSER = new AbstractParser<C2S_ReceiveWineReward_17158>() {
         public C2S_ReceiveWineReward_17158 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveWineReward_17158(input, extensionRegistry);
         }
      };

      private C2S_ReceiveWineReward_17158(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveWineReward_17158() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveWineReward_17158();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveWineReward_17158(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWineReward_17158.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveWineReward_17158)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveWineReward_17158 other = (C2S_ReceiveWineReward_17158)obj;
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

      public static C2S_ReceiveWineReward_17158 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_17158)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_17158 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_17158 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_17158 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_17158)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveWineReward_17158 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveWineReward_17158 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveWineReward_17158> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveWineReward_17158> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveWineReward_17158 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveWineReward_17158OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWineReward_17158.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_ReceiveWineReward_17158.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_17158_descriptor;
         }

         public C2S_ReceiveWineReward_17158 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_ReceiveWineReward_17158.getDefaultInstance();
         }

         public C2S_ReceiveWineReward_17158 build() {
            C2S_ReceiveWineReward_17158 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveWineReward_17158 buildPartial() {
            C2S_ReceiveWineReward_17158 result = new C2S_ReceiveWineReward_17158(this);
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
            if (other instanceof C2S_ReceiveWineReward_17158) {
               return this.mergeFrom((C2S_ReceiveWineReward_17158)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveWineReward_17158 other) {
            if (other == FlowerFireActivityMsg.C2S_ReceiveWineReward_17158.getDefaultInstance()) {
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
            C2S_ReceiveWineReward_17158 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveWineReward_17158)FlowerFireActivityMsg.C2S_ReceiveWineReward_17158.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveWineReward_17158)e.getUnfinishedMessage();
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

   public static final class C2S_ItemShopInfo_17160 extends GeneratedMessageV3 implements C2S_ItemShopInfo_17160OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ItemShopInfo_17160 DEFAULT_INSTANCE = new C2S_ItemShopInfo_17160();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ItemShopInfo_17160> PARSER = new AbstractParser<C2S_ItemShopInfo_17160>() {
         public C2S_ItemShopInfo_17160 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ItemShopInfo_17160(input, extensionRegistry);
         }
      };

      private C2S_ItemShopInfo_17160(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ItemShopInfo_17160() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ItemShopInfo_17160();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ItemShopInfo_17160(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemShopInfo_17160.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ItemShopInfo_17160)) {
            return super.equals(obj);
         } else {
            C2S_ItemShopInfo_17160 other = (C2S_ItemShopInfo_17160)obj;
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

      public static C2S_ItemShopInfo_17160 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ItemShopInfo_17160)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(InputStream input) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemShopInfo_17160 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ItemShopInfo_17160 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ItemShopInfo_17160 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ItemShopInfo_17160)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ItemShopInfo_17160 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ItemShopInfo_17160 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ItemShopInfo_17160> parser() {
         return PARSER;
      }

      public Parser<C2S_ItemShopInfo_17160> getParserForType() {
         return PARSER;
      }

      public C2S_ItemShopInfo_17160 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ItemShopInfo_17160OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ItemShopInfo_17160.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_ItemShopInfo_17160.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_ItemShopInfo_17160_descriptor;
         }

         public C2S_ItemShopInfo_17160 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_ItemShopInfo_17160.getDefaultInstance();
         }

         public C2S_ItemShopInfo_17160 build() {
            C2S_ItemShopInfo_17160 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ItemShopInfo_17160 buildPartial() {
            C2S_ItemShopInfo_17160 result = new C2S_ItemShopInfo_17160(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ItemShopInfo_17160) {
               return this.mergeFrom((C2S_ItemShopInfo_17160)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ItemShopInfo_17160 other) {
            if (other == FlowerFireActivityMsg.C2S_ItemShopInfo_17160.getDefaultInstance()) {
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
            C2S_ItemShopInfo_17160 parsedMessage = null;

            try {
               parsedMessage = (C2S_ItemShopInfo_17160)FlowerFireActivityMsg.C2S_ItemShopInfo_17160.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ItemShopInfo_17160)e.getUnfinishedMessage();
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

   public static final class S2C_ItemShopInfo_17161 extends GeneratedMessageV3 implements S2C_ItemShopInfo_17161OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMSHOPINFO_FIELD_NUMBER = 1;
      private List<ItemShopInfo> itemShopInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_ItemShopInfo_17161 DEFAULT_INSTANCE = new S2C_ItemShopInfo_17161();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ItemShopInfo_17161> PARSER = new AbstractParser<S2C_ItemShopInfo_17161>() {
         public S2C_ItemShopInfo_17161 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ItemShopInfo_17161(input, extensionRegistry);
         }
      };

      private S2C_ItemShopInfo_17161(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ItemShopInfo_17161() {
         this.memoizedIsInitialized = -1;
         this.itemShopInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ItemShopInfo_17161();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ItemShopInfo_17161(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.itemShopInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemShopInfo_.add(input.readMessage(FlowerFireActivityMsg.ItemShopInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.itemShopInfo_ = Collections.unmodifiableList(this.itemShopInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemShopInfo_17161.class, Builder.class);
      }

      public List<ItemShopInfo> getItemShopInfoList() {
         return this.itemShopInfo_;
      }

      public List<? extends ItemShopInfoOrBuilder> getItemShopInfoOrBuilderList() {
         return this.itemShopInfo_;
      }

      public int getItemShopInfoCount() {
         return this.itemShopInfo_.size();
      }

      public ItemShopInfo getItemShopInfo(int index) {
         return (ItemShopInfo)this.itemShopInfo_.get(index);
      }

      public ItemShopInfoOrBuilder getItemShopInfoOrBuilder(int index) {
         return (ItemShopInfoOrBuilder)this.itemShopInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemShopInfoCount(); ++i) {
               if (!this.getItemShopInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.itemShopInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.itemShopInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.itemShopInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.itemShopInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ItemShopInfo_17161)) {
            return super.equals(obj);
         } else {
            S2C_ItemShopInfo_17161 other = (S2C_ItemShopInfo_17161)obj;
            if (!this.getItemShopInfoList().equals(other.getItemShopInfoList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemShopInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemShopInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ItemShopInfo_17161 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ItemShopInfo_17161)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(InputStream input) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemShopInfo_17161 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ItemShopInfo_17161 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ItemShopInfo_17161 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ItemShopInfo_17161)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ItemShopInfo_17161 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ItemShopInfo_17161 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ItemShopInfo_17161> parser() {
         return PARSER;
      }

      public Parser<S2C_ItemShopInfo_17161> getParserForType() {
         return PARSER;
      }

      public S2C_ItemShopInfo_17161 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ItemShopInfo_17161OrBuilder {
         private int bitField0_;
         private List<ItemShopInfo> itemShopInfo_;
         private RepeatedFieldBuilderV3<ItemShopInfo, ItemShopInfo.Builder, ItemShopInfoOrBuilder> itemShopInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ItemShopInfo_17161.class, Builder.class);
         }

         private Builder() {
            this.itemShopInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemShopInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_ItemShopInfo_17161.alwaysUseFieldBuilders) {
               this.getItemShopInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.itemShopInfoBuilder_ == null) {
               this.itemShopInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.itemShopInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_ItemShopInfo_17161_descriptor;
         }

         public S2C_ItemShopInfo_17161 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_ItemShopInfo_17161.getDefaultInstance();
         }

         public S2C_ItemShopInfo_17161 build() {
            S2C_ItemShopInfo_17161 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ItemShopInfo_17161 buildPartial() {
            S2C_ItemShopInfo_17161 result = new S2C_ItemShopInfo_17161(this);
            int from_bitField0_ = this.bitField0_;
            if (this.itemShopInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.itemShopInfo_ = Collections.unmodifiableList(this.itemShopInfo_);
                  this.bitField0_ &= -2;
               }

               result.itemShopInfo_ = this.itemShopInfo_;
            } else {
               result.itemShopInfo_ = this.itemShopInfoBuilder_.build();
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
            if (other instanceof S2C_ItemShopInfo_17161) {
               return this.mergeFrom((S2C_ItemShopInfo_17161)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ItemShopInfo_17161 other) {
            if (other == FlowerFireActivityMsg.S2C_ItemShopInfo_17161.getDefaultInstance()) {
               return this;
            } else {
               if (this.itemShopInfoBuilder_ == null) {
                  if (!other.itemShopInfo_.isEmpty()) {
                     if (this.itemShopInfo_.isEmpty()) {
                        this.itemShopInfo_ = other.itemShopInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureItemShopInfoIsMutable();
                        this.itemShopInfo_.addAll(other.itemShopInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemShopInfo_.isEmpty()) {
                  if (this.itemShopInfoBuilder_.isEmpty()) {
                     this.itemShopInfoBuilder_.dispose();
                     this.itemShopInfoBuilder_ = null;
                     this.itemShopInfo_ = other.itemShopInfo_;
                     this.bitField0_ &= -2;
                     this.itemShopInfoBuilder_ = FlowerFireActivityMsg.S2C_ItemShopInfo_17161.alwaysUseFieldBuilders ? this.getItemShopInfoFieldBuilder() : null;
                  } else {
                     this.itemShopInfoBuilder_.addAllMessages(other.itemShopInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemShopInfoCount(); ++i) {
               if (!this.getItemShopInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ItemShopInfo_17161 parsedMessage = null;

            try {
               parsedMessage = (S2C_ItemShopInfo_17161)FlowerFireActivityMsg.S2C_ItemShopInfo_17161.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ItemShopInfo_17161)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemShopInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemShopInfo_ = new ArrayList(this.itemShopInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<ItemShopInfo> getItemShopInfoList() {
            return this.itemShopInfoBuilder_ == null ? Collections.unmodifiableList(this.itemShopInfo_) : this.itemShopInfoBuilder_.getMessageList();
         }

         public int getItemShopInfoCount() {
            return this.itemShopInfoBuilder_ == null ? this.itemShopInfo_.size() : this.itemShopInfoBuilder_.getCount();
         }

         public ItemShopInfo getItemShopInfo(int index) {
            return this.itemShopInfoBuilder_ == null ? (ItemShopInfo)this.itemShopInfo_.get(index) : (ItemShopInfo)this.itemShopInfoBuilder_.getMessage(index);
         }

         public Builder setItemShopInfo(int index, ItemShopInfo value) {
            if (this.itemShopInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.set(index, value);
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemShopInfo(int index, ItemShopInfo.Builder builderForValue) {
            if (this.itemShopInfoBuilder_ == null) {
               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemShopInfo(ItemShopInfo value) {
            if (this.itemShopInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.add(value);
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemShopInfo(int index, ItemShopInfo value) {
            if (this.itemShopInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.add(index, value);
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemShopInfo(ItemShopInfo.Builder builderForValue) {
            if (this.itemShopInfoBuilder_ == null) {
               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemShopInfo(int index, ItemShopInfo.Builder builderForValue) {
            if (this.itemShopInfoBuilder_ == null) {
               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemShopInfo(Iterable<? extends ItemShopInfo> values) {
            if (this.itemShopInfoBuilder_ == null) {
               this.ensureItemShopInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemShopInfo_);
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemShopInfo() {
            if (this.itemShopInfoBuilder_ == null) {
               this.itemShopInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemShopInfo(int index) {
            if (this.itemShopInfoBuilder_ == null) {
               this.ensureItemShopInfoIsMutable();
               this.itemShopInfo_.remove(index);
               this.onChanged();
            } else {
               this.itemShopInfoBuilder_.remove(index);
            }

            return this;
         }

         public ItemShopInfo.Builder getItemShopInfoBuilder(int index) {
            return (ItemShopInfo.Builder)this.getItemShopInfoFieldBuilder().getBuilder(index);
         }

         public ItemShopInfoOrBuilder getItemShopInfoOrBuilder(int index) {
            return this.itemShopInfoBuilder_ == null ? (ItemShopInfoOrBuilder)this.itemShopInfo_.get(index) : (ItemShopInfoOrBuilder)this.itemShopInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ItemShopInfoOrBuilder> getItemShopInfoOrBuilderList() {
            return this.itemShopInfoBuilder_ != null ? this.itemShopInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemShopInfo_);
         }

         public ItemShopInfo.Builder addItemShopInfoBuilder() {
            return (ItemShopInfo.Builder)this.getItemShopInfoFieldBuilder().addBuilder(FlowerFireActivityMsg.ItemShopInfo.getDefaultInstance());
         }

         public ItemShopInfo.Builder addItemShopInfoBuilder(int index) {
            return (ItemShopInfo.Builder)this.getItemShopInfoFieldBuilder().addBuilder(index, FlowerFireActivityMsg.ItemShopInfo.getDefaultInstance());
         }

         public List<ItemShopInfo.Builder> getItemShopInfoBuilderList() {
            return this.getItemShopInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ItemShopInfo, ItemShopInfo.Builder, ItemShopInfoOrBuilder> getItemShopInfoFieldBuilder() {
            if (this.itemShopInfoBuilder_ == null) {
               this.itemShopInfoBuilder_ = new RepeatedFieldBuilderV3(this.itemShopInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.itemShopInfo_ = null;
            }

            return this.itemShopInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ItemShopInfo extends GeneratedMessageV3 implements ItemShopInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int BUYTIMES_FIELD_NUMBER = 2;
      private int buyTimes_;
      private byte memoizedIsInitialized;
      private static final ItemShopInfo DEFAULT_INSTANCE = new ItemShopInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ItemShopInfo> PARSER = new AbstractParser<ItemShopInfo>() {
         public ItemShopInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ItemShopInfo(input, extensionRegistry);
         }
      };

      private ItemShopInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ItemShopInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ItemShopInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ItemShopInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.buyTimes_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemShopInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
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
         } else if (!this.hasBuyTimes()) {
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
            output.writeInt32(2, this.buyTimes_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buyTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ItemShopInfo)) {
            return super.equals(obj);
         } else {
            ItemShopInfo other = (ItemShopInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ItemShopInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data);
      }

      public static ItemShopInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ItemShopInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data);
      }

      public static ItemShopInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ItemShopInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data);
      }

      public static ItemShopInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ItemShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ItemShopInfo parseFrom(InputStream input) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ItemShopInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ItemShopInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ItemShopInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ItemShopInfo parseFrom(CodedInputStream input) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ItemShopInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ItemShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ItemShopInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ItemShopInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ItemShopInfo> parser() {
         return PARSER;
      }

      public Parser<ItemShopInfo> getParserForType() {
         return PARSER;
      }

      public ItemShopInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemShopInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int buyTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemShopInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.ItemShopInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.buyTimes_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_ItemShopInfo_descriptor;
         }

         public ItemShopInfo getDefaultInstanceForType() {
            return FlowerFireActivityMsg.ItemShopInfo.getDefaultInstance();
         }

         public ItemShopInfo build() {
            ItemShopInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ItemShopInfo buildPartial() {
            ItemShopInfo result = new ItemShopInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyTimes_ = this.buyTimes_;
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
            if (other instanceof ItemShopInfo) {
               return this.mergeFrom((ItemShopInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ItemShopInfo other) {
            if (other == FlowerFireActivityMsg.ItemShopInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
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
               return this.hasBuyTimes();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ItemShopInfo parsedMessage = null;

            try {
               parsedMessage = (ItemShopInfo)FlowerFireActivityMsg.ItemShopInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ItemShopInfo)e.getUnfinishedMessage();
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

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 2;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
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

   public static final class C2S_BuyItem_17162 extends GeneratedMessageV3 implements C2S_BuyItem_17162OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int AMOUNT_FIELD_NUMBER = 2;
      private int amount_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyItem_17162 DEFAULT_INSTANCE = new C2S_BuyItem_17162();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyItem_17162> PARSER = new AbstractParser<C2S_BuyItem_17162>() {
         public C2S_BuyItem_17162 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyItem_17162(input, extensionRegistry);
         }
      };

      private C2S_BuyItem_17162(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyItem_17162() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyItem_17162();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyItem_17162(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.amount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_17162.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasAmount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAmount() {
         return this.amount_;
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
         } else if (!this.hasAmount()) {
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
            output.writeInt32(2, this.amount_);
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
               size += CodedOutputStream.computeInt32Size(2, this.amount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyItem_17162)) {
            return super.equals(obj);
         } else {
            C2S_BuyItem_17162 other = (C2S_BuyItem_17162)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasAmount() != other.hasAmount()) {
               return false;
            } else if (this.hasAmount() && this.getAmount() != other.getAmount()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasAmount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAmount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyItem_17162 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_17162 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_17162 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_17162 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_17162 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_17162 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_17162)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_17162 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_17162 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_17162 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_17162 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_17162 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_17162 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_17162)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyItem_17162 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyItem_17162 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyItem_17162> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyItem_17162> getParserForType() {
         return PARSER;
      }

      public C2S_BuyItem_17162 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyItem_17162OrBuilder {
         private int bitField0_;
         private int id_;
         private int amount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_17162.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_BuyItem_17162.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.amount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyItem_17162_descriptor;
         }

         public C2S_BuyItem_17162 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_BuyItem_17162.getDefaultInstance();
         }

         public C2S_BuyItem_17162 build() {
            C2S_BuyItem_17162 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyItem_17162 buildPartial() {
            C2S_BuyItem_17162 result = new C2S_BuyItem_17162(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.amount_ = this.amount_;
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
            if (other instanceof C2S_BuyItem_17162) {
               return this.mergeFrom((C2S_BuyItem_17162)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyItem_17162 other) {
            if (other == FlowerFireActivityMsg.C2S_BuyItem_17162.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasAmount()) {
                  this.setAmount(other.getAmount());
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
               return this.hasAmount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyItem_17162 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyItem_17162)FlowerFireActivityMsg.C2S_BuyItem_17162.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyItem_17162)e.getUnfinishedMessage();
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

         public boolean hasAmount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAmount() {
            return this.amount_;
         }

         public Builder setAmount(int value) {
            this.bitField0_ |= 2;
            this.amount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAmount() {
            this.bitField0_ &= -3;
            this.amount_ = 0;
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

   public static final class C2S_BattleInfo_17165 extends GeneratedMessageV3 implements C2S_BattleInfo_17165OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BattleInfo_17165 DEFAULT_INSTANCE = new C2S_BattleInfo_17165();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleInfo_17165> PARSER = new AbstractParser<C2S_BattleInfo_17165>() {
         public C2S_BattleInfo_17165 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleInfo_17165(input, extensionRegistry);
         }
      };

      private C2S_BattleInfo_17165(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleInfo_17165() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleInfo_17165();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleInfo_17165(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleInfo_17165.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BattleInfo_17165)) {
            return super.equals(obj);
         } else {
            C2S_BattleInfo_17165 other = (C2S_BattleInfo_17165)obj;
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

      public static C2S_BattleInfo_17165 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data);
      }

      public static C2S_BattleInfo_17165 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleInfo_17165 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data);
      }

      public static C2S_BattleInfo_17165 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleInfo_17165 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data);
      }

      public static C2S_BattleInfo_17165 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleInfo_17165)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleInfo_17165 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleInfo_17165 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleInfo_17165 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleInfo_17165 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleInfo_17165 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleInfo_17165 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleInfo_17165)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleInfo_17165 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleInfo_17165 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleInfo_17165> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleInfo_17165> getParserForType() {
         return PARSER;
      }

      public C2S_BattleInfo_17165 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleInfo_17165OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleInfo_17165.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_BattleInfo_17165.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BattleInfo_17165_descriptor;
         }

         public C2S_BattleInfo_17165 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_BattleInfo_17165.getDefaultInstance();
         }

         public C2S_BattleInfo_17165 build() {
            C2S_BattleInfo_17165 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleInfo_17165 buildPartial() {
            C2S_BattleInfo_17165 result = new C2S_BattleInfo_17165(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BattleInfo_17165) {
               return this.mergeFrom((C2S_BattleInfo_17165)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleInfo_17165 other) {
            if (other == FlowerFireActivityMsg.C2S_BattleInfo_17165.getDefaultInstance()) {
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
            C2S_BattleInfo_17165 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleInfo_17165)FlowerFireActivityMsg.C2S_BattleInfo_17165.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleInfo_17165)e.getUnfinishedMessage();
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

   public static final class S2C_BattleInfo_17166 extends GeneratedMessageV3 implements S2C_BattleInfo_17166OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLENUM_FIELD_NUMBER = 1;
      private int battleNum_;
      public static final int BATTLEBUYNUM_FIELD_NUMBER = 2;
      private int battleBuyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleInfo_17166 DEFAULT_INSTANCE = new S2C_BattleInfo_17166();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleInfo_17166> PARSER = new AbstractParser<S2C_BattleInfo_17166>() {
         public S2C_BattleInfo_17166 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleInfo_17166(input, extensionRegistry);
         }
      };

      private S2C_BattleInfo_17166(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleInfo_17166() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleInfo_17166();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleInfo_17166(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.battleNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.battleBuyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleInfo_17166.class, Builder.class);
      }

      public boolean hasBattleNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleNum() {
         return this.battleNum_;
      }

      public boolean hasBattleBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBattleBuyNum() {
         return this.battleBuyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.battleBuyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.battleBuyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleInfo_17166)) {
            return super.equals(obj);
         } else {
            S2C_BattleInfo_17166 other = (S2C_BattleInfo_17166)obj;
            if (this.hasBattleNum() != other.hasBattleNum()) {
               return false;
            } else if (this.hasBattleNum() && this.getBattleNum() != other.getBattleNum()) {
               return false;
            } else if (this.hasBattleBuyNum() != other.hasBattleBuyNum()) {
               return false;
            } else if (this.hasBattleBuyNum() && this.getBattleBuyNum() != other.getBattleBuyNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBattleNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleNum();
            }

            if (this.hasBattleBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattleBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleInfo_17166 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data);
      }

      public static S2C_BattleInfo_17166 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleInfo_17166 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data);
      }

      public static S2C_BattleInfo_17166 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleInfo_17166 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data);
      }

      public static S2C_BattleInfo_17166 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleInfo_17166)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleInfo_17166 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleInfo_17166 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleInfo_17166 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleInfo_17166 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleInfo_17166 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleInfo_17166 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleInfo_17166)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleInfo_17166 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleInfo_17166 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleInfo_17166> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleInfo_17166> getParserForType() {
         return PARSER;
      }

      public S2C_BattleInfo_17166 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleInfo_17166OrBuilder {
         private int bitField0_;
         private int battleNum_;
         private int battleBuyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleInfo_17166.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.S2C_BattleInfo_17166.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battleNum_ = 0;
            this.bitField0_ &= -2;
            this.battleBuyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_S2C_BattleInfo_17166_descriptor;
         }

         public S2C_BattleInfo_17166 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.S2C_BattleInfo_17166.getDefaultInstance();
         }

         public S2C_BattleInfo_17166 build() {
            S2C_BattleInfo_17166 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleInfo_17166 buildPartial() {
            S2C_BattleInfo_17166 result = new S2C_BattleInfo_17166(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleNum_ = this.battleNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.battleBuyNum_ = this.battleBuyNum_;
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
            if (other instanceof S2C_BattleInfo_17166) {
               return this.mergeFrom((S2C_BattleInfo_17166)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleInfo_17166 other) {
            if (other == FlowerFireActivityMsg.S2C_BattleInfo_17166.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleNum()) {
                  this.setBattleNum(other.getBattleNum());
               }

               if (other.hasBattleBuyNum()) {
                  this.setBattleBuyNum(other.getBattleBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleNum()) {
               return false;
            } else {
               return this.hasBattleBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleInfo_17166 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleInfo_17166)FlowerFireActivityMsg.S2C_BattleInfo_17166.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleInfo_17166)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleNum() {
            return this.battleNum_;
         }

         public Builder setBattleNum(int value) {
            this.bitField0_ |= 1;
            this.battleNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleNum() {
            this.bitField0_ &= -2;
            this.battleNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBattleBuyNum() {
            return this.battleBuyNum_;
         }

         public Builder setBattleBuyNum(int value) {
            this.bitField0_ |= 2;
            this.battleBuyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleBuyNum() {
            this.bitField0_ &= -3;
            this.battleBuyNum_ = 0;
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

   public static final class C2S_BuyBattleTimes_17167 extends GeneratedMessageV3 implements C2S_BuyBattleTimes_17167OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyBattleTimes_17167 DEFAULT_INSTANCE = new C2S_BuyBattleTimes_17167();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyBattleTimes_17167> PARSER = new AbstractParser<C2S_BuyBattleTimes_17167>() {
         public C2S_BuyBattleTimes_17167 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyBattleTimes_17167(input, extensionRegistry);
         }
      };

      private C2S_BuyBattleTimes_17167(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyBattleTimes_17167() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyBattleTimes_17167();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyBattleTimes_17167(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyBattleTimes_17167.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyBattleTimes_17167)) {
            return super.equals(obj);
         } else {
            C2S_BuyBattleTimes_17167 other = (C2S_BuyBattleTimes_17167)obj;
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

      public static C2S_BuyBattleTimes_17167 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyBattleTimes_17167)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyBattleTimes_17167 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyBattleTimes_17167 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyBattleTimes_17167 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyBattleTimes_17167)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyBattleTimes_17167 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyBattleTimes_17167 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyBattleTimes_17167> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyBattleTimes_17167> getParserForType() {
         return PARSER;
      }

      public C2S_BuyBattleTimes_17167 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyBattleTimes_17167OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyBattleTimes_17167.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FlowerFireActivityMsg.C2S_BuyBattleTimes_17167.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FlowerFireActivityMsg.internal_static_flowerFireActivity_com_gzbz_protobuf_C2S_BuyBattleTimes_17167_descriptor;
         }

         public C2S_BuyBattleTimes_17167 getDefaultInstanceForType() {
            return FlowerFireActivityMsg.C2S_BuyBattleTimes_17167.getDefaultInstance();
         }

         public C2S_BuyBattleTimes_17167 build() {
            C2S_BuyBattleTimes_17167 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyBattleTimes_17167 buildPartial() {
            C2S_BuyBattleTimes_17167 result = new C2S_BuyBattleTimes_17167(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BuyBattleTimes_17167) {
               return this.mergeFrom((C2S_BuyBattleTimes_17167)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyBattleTimes_17167 other) {
            if (other == FlowerFireActivityMsg.C2S_BuyBattleTimes_17167.getDefaultInstance()) {
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
            C2S_BuyBattleTimes_17167 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyBattleTimes_17167)FlowerFireActivityMsg.C2S_BuyBattleTimes_17167.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyBattleTimes_17167)e.getUnfinishedMessage();
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

   public interface C2S_ActivityInfo_17101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BattleInfo_17165OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BuyBattleTimes_17167OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_BuyItem_17162OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasAmount();

      int getAmount();
   }

   public interface C2S_DrawRecord_17109OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_17105OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_17168OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_ItemShopInfo_17160OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LampRiddleTotalInfo_17153OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckDrawInfo_17103OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_17107OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Pray_17121OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();
   }

   public interface C2S_ReceiveLampRiddleReward_17155OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveWineReward_17158OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ServerDrawRecord_17170OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WineTotalInfo_17156OrBuilder extends MessageOrBuilder {
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

   public interface ItemShopInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasBuyTimes();

      int getBuyTimes();
   }

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_ActivityInfo_17102OrBuilder extends MessageOrBuilder {
      boolean hasActivityStartDay();

      int getActivityStartDay();

      boolean hasSeverActivityDay();

      int getSeverActivityDay();

      boolean hasActivityStartLv();

      int getActivityStartLv();
   }

   public interface S2C_BattleInfo_17166OrBuilder extends MessageOrBuilder {
      boolean hasBattleNum();

      int getBattleNum();

      boolean hasBattleBuyNum();

      int getBattleBuyNum();
   }

   public interface S2C_DrawRecord_17110OrBuilder extends MessageOrBuilder {
      List<DrawRecord> getMyRecrodList();

      DrawRecord getMyRecrod(int index);

      int getMyRecrodCount();

      List<? extends DrawRecordOrBuilder> getMyRecrodOrBuilderList();

      DrawRecordOrBuilder getMyRecrodOrBuilder(int index);
   }

   public interface S2C_Draw_17106OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FancyReward_17169OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_ItemShopInfo_17161OrBuilder extends MessageOrBuilder {
      List<ItemShopInfo> getItemShopInfoList();

      ItemShopInfo getItemShopInfo(int index);

      int getItemShopInfoCount();

      List<? extends ItemShopInfoOrBuilder> getItemShopInfoOrBuilderList();

      ItemShopInfoOrBuilder getItemShopInfoOrBuilder(int index);
   }

   public interface S2C_LampRiddleTotalInfo_17154OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();
   }

   public interface S2C_LuckDrawInfo_17104OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OpenReward_17108OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PrayInfo_17126OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();
   }

   public interface S2C_PrayTaskList_17128OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_PrayTaskNotify_17124OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_Pray_17122OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();

      boolean hasIdx();

      int getIdx();
   }

   public interface S2C_ServerDrawRecord_17171OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_WineTotalInfo_17157OrBuilder extends MessageOrBuilder {
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
