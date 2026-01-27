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

public final class KittyActivityMsg {
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private KittyActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013KittyActivity.proto\u0012\u001fkittyActivity.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\u001a\nRank.proto\"H\n\u0010NumOnePlayerInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006headId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\"^\n\u0010IllustrationData\u0012\u0016\n\u000eillustrationId\u0018\u0001 \u0002(\u0005\u00122\n\u0004task\u0018\u0002 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"G\n\u0012GreenTreeRoundData\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000broundReward\u0018\u0002 \u0002(\b\u0012\r\n\u0005gotId\u0018\u0003 \u0003(\u0005\"\u008a\u0001\n\u0010RainTreeRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006server\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007process\u0018\u0003 \u0002(\u0005\u0012G\n\fnumOnePlayer\u0018\u0004 \u0002(\u000b21.kittyActivity.com.gzbz.protobuf.NumOnePlayerInfo\"\u001c\n\u001aC2S_IllustrationMain_15901\"\u0083\u0001\n\u001aS2C_IllustrationMain_15902\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\u0012G\n\fillustration\u0018\u0003 \u0003(\u000b21.kittyActivity.com.gzbz.protobuf.IllustrationData\"2\n C2S_IllustrationTaskCommit_15903\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"2\n S2C_IllustrationTaskCommit_15904\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"W\n!S2C_IllustrationTasksNotify_15906\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0018\n\u0016C2S_RainTreeMain_15907\"c\n\u0016S2C_RainTreeMain_15908\u0012\u000f\n\u0007process\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tfreeCount\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ncycleCount\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tplanCount\u0018\u0004 \u0002(\u0005\"(\n\u0017C2S_RainTreeWater_15909\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"s\n\u0017S2C_RainTreeWater_15910\u0012\u0011\n\tfreeCount\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ncycleCount\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007process\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tplanCount\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0005 \u0002(\u0005\"\u001e\n\u001cC2S_RainTreeServerRank_15911\"c\n\u001cS2C_RainTreeServerRank_15912\u0012C\n\brankData\u0018\u0001 \u0003(\u000b21.kittyActivity.com.gzbz.protobuf.RainTreeRankData\"\u0019\n\u0017C2S_GreenTreeMain_15913\"p\n\u0017S2C_GreenTreeMain_15914\u0012F\n\troundData\u0018\u0001 \u0003(\u000b23.kittyActivity.com.gzbz.protobuf.GreenTreeRoundData\u0012\r\n\u0005gotId\u0018\u0002 \u0003(\u0005\"'\n\u0019C2S_GreenTreeReward_15915\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"'\n\u0019S2C_GreenTreeReward_15916\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"/\n\u001eC2S_GreenTreeRoundReward_15917\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\"/\n\u001eS2C_GreenTreeRoundReward_15918\u0012\r\n\u0005round\u0018\u0001 \u0002(\u0005\",\n\u0019S2C_RainTreeProcess_15920\u0012\u000f\n\u0007process\u0018\u0001 \u0002(\u0005\"\u001f\n\u001dC2S_SpringEnjoyPrayMain_15921\"_\n\u001dS2C_SpringEnjoyPrayMain_15922\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\u00122\n\u0004task\u0018\u0002 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"'\n\u0019C2S_SpringEnjoyPray_15923\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\"'\n\u0019S2C_SpringEnjoyPray_15924\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\"Y\n#S2C_SpringEnjoyPrayTaskNotify_15926\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0094\u0001\n\u001fS2C_SpringEnjoyMainNotify_15928\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\u00120\n\u0006myRank\u0018\u0002 \u0002(\u000b2 .rank.com.gzbz.protobuf.RankData\u0012.\n\u0004rank\u0018\u0003 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\"8\n\u001eC2S_IllustrationExchange_15929\u0012\u0016\n\u000eillustrationId\u0018\u0001 \u0002(\u0005\"8\n\u001eS2C_IllustrationExchange_15930\u0012\u0016\n\u000eillustrationId\u0018\u0001 \u0002(\u0005B'\n\u0011com.gzbz.protobufB\u0010KittyActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor(), RankMsg.getDescriptor()});
      internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor, new String[]{"PlayerId", "HeadId", "PlayerName"});
      internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor, new String[]{"IllustrationId", "Task"});
      internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor, new String[]{"Round", "RoundReward", "GotId"});
      internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor, new String[]{"Rank", "Server", "Process", "NumOnePlayer"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor, new String[0]);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor, new String[]{"EndTime", "Day", "Illustration"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor, new String[]{"TaskId"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor, new String[]{"TaskId"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor, new String[]{"Task"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor, new String[0]);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor, new String[]{"Process", "FreeCount", "CycleCount", "PlanCount"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor, new String[]{"Count"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor, new String[]{"FreeCount", "CycleCount", "Process", "PlanCount", "Count"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor, new String[0]);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor, new String[]{"RankData"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor, new String[0]);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor, new String[]{"RoundData", "GotId"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor, new String[]{"Id"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor, new String[]{"Id"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor, new String[]{"Round"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor, new String[]{"Round"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor, new String[]{"Process"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor, new String[0]);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor, new String[]{"Id", "Task"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor, new String[]{"Id"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor, new String[]{"Id"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor, new String[]{"Task"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor, new String[]{"EndTime", "MyRank", "Rank"});
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor, new String[]{"IllustrationId"});
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor, new String[]{"IllustrationId"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
      RankMsg.getDescriptor();
   }

   public static final class NumOnePlayerInfo extends GeneratedMessageV3 implements NumOnePlayerInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEADID_FIELD_NUMBER = 2;
      private int headId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final NumOnePlayerInfo DEFAULT_INSTANCE = new NumOnePlayerInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<NumOnePlayerInfo> PARSER = new AbstractParser<NumOnePlayerInfo>() {
         public NumOnePlayerInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NumOnePlayerInfo(input, extensionRegistry);
         }
      };

      private NumOnePlayerInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NumOnePlayerInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NumOnePlayerInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NumOnePlayerInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.headId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
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
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NumOnePlayerInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeadId() {
         return this.headId_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
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
            output.writeInt32(2, this.headId_);
         }

         if ((this.bitField0_ & 4) != 0) {
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.headId_);
            }

            if ((this.bitField0_ & 4) != 0) {
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
         } else if (!(obj instanceof NumOnePlayerInfo)) {
            return super.equals(obj);
         } else {
            NumOnePlayerInfo other = (NumOnePlayerInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeadId();
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

      public static NumOnePlayerInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data);
      }

      public static NumOnePlayerInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NumOnePlayerInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data);
      }

      public static NumOnePlayerInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NumOnePlayerInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data);
      }

      public static NumOnePlayerInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NumOnePlayerInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NumOnePlayerInfo parseFrom(InputStream input) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NumOnePlayerInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NumOnePlayerInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NumOnePlayerInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NumOnePlayerInfo parseFrom(CodedInputStream input) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NumOnePlayerInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NumOnePlayerInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NumOnePlayerInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NumOnePlayerInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NumOnePlayerInfo> parser() {
         return PARSER;
      }

      public Parser<NumOnePlayerInfo> getParserForType() {
         return PARSER;
      }

      public NumOnePlayerInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NumOnePlayerInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int headId_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NumOnePlayerInfo.class, Builder.class);
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
            if (KittyActivityMsg.NumOnePlayerInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.headId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_NumOnePlayerInfo_descriptor;
         }

         public NumOnePlayerInfo getDefaultInstanceForType() {
            return KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance();
         }

         public NumOnePlayerInfo build() {
            NumOnePlayerInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NumOnePlayerInfo buildPartial() {
            NumOnePlayerInfo result = new NumOnePlayerInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
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
            if (other instanceof NumOnePlayerInfo) {
               return this.mergeFrom((NumOnePlayerInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NumOnePlayerInfo other) {
            if (other == KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
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
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHeadId()) {
               return false;
            } else {
               return this.hasPlayerName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NumOnePlayerInfo parsedMessage = null;

            try {
               parsedMessage = (NumOnePlayerInfo)KittyActivityMsg.NumOnePlayerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NumOnePlayerInfo)e.getUnfinishedMessage();
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

         public boolean hasHeadId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 2;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -3;
            this.headId_ = 0;
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
            this.playerName_ = KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance().getPlayerName();
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

   public static final class IllustrationData extends GeneratedMessageV3 implements IllustrationDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ILLUSTRATIONID_FIELD_NUMBER = 1;
      private int illustrationId_;
      public static final int TASK_FIELD_NUMBER = 2;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final IllustrationData DEFAULT_INSTANCE = new IllustrationData();
      /** @deprecated */
      @Deprecated
      public static final Parser<IllustrationData> PARSER = new AbstractParser<IllustrationData>() {
         public IllustrationData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new IllustrationData(input, extensionRegistry);
         }
      };

      private IllustrationData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private IllustrationData() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new IllustrationData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private IllustrationData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.illustrationId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_fieldAccessorTable.ensureFieldAccessorsInitialized(IllustrationData.class, Builder.class);
      }

      public boolean hasIllustrationId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIllustrationId() {
         return this.illustrationId_;
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
         } else if (!this.hasIllustrationId()) {
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
            output.writeInt32(1, this.illustrationId_);
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.task_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.illustrationId_);
            }

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof IllustrationData)) {
            return super.equals(obj);
         } else {
            IllustrationData other = (IllustrationData)obj;
            if (this.hasIllustrationId() != other.hasIllustrationId()) {
               return false;
            } else if (this.hasIllustrationId() && this.getIllustrationId() != other.getIllustrationId()) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIllustrationId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIllustrationId();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static IllustrationData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data);
      }

      public static IllustrationData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static IllustrationData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data);
      }

      public static IllustrationData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static IllustrationData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data);
      }

      public static IllustrationData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (IllustrationData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static IllustrationData parseFrom(InputStream input) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static IllustrationData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static IllustrationData parseDelimitedFrom(InputStream input) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static IllustrationData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static IllustrationData parseFrom(CodedInputStream input) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static IllustrationData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (IllustrationData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(IllustrationData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static IllustrationData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<IllustrationData> parser() {
         return PARSER;
      }

      public Parser<IllustrationData> getParserForType() {
         return PARSER;
      }

      public IllustrationData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IllustrationDataOrBuilder {
         private int bitField0_;
         private int illustrationId_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_fieldAccessorTable.ensureFieldAccessorsInitialized(IllustrationData.class, Builder.class);
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
            if (KittyActivityMsg.IllustrationData.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.illustrationId_ = 0;
            this.bitField0_ &= -2;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_IllustrationData_descriptor;
         }

         public IllustrationData getDefaultInstanceForType() {
            return KittyActivityMsg.IllustrationData.getDefaultInstance();
         }

         public IllustrationData build() {
            IllustrationData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public IllustrationData buildPartial() {
            IllustrationData result = new IllustrationData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.illustrationId_ = this.illustrationId_;
               to_bitField0_ |= 1;
            }

            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -3;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof IllustrationData) {
               return this.mergeFrom((IllustrationData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(IllustrationData other) {
            if (other == KittyActivityMsg.IllustrationData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIllustrationId()) {
                  this.setIllustrationId(other.getIllustrationId());
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.taskBuilder_ = KittyActivityMsg.IllustrationData.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            if (!this.hasIllustrationId()) {
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
            IllustrationData parsedMessage = null;

            try {
               parsedMessage = (IllustrationData)KittyActivityMsg.IllustrationData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (IllustrationData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIllustrationId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIllustrationId() {
            return this.illustrationId_;
         }

         public Builder setIllustrationId(int value) {
            this.bitField0_ |= 1;
            this.illustrationId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIllustrationId() {
            this.bitField0_ &= -2;
            this.illustrationId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class GreenTreeRoundData extends GeneratedMessageV3 implements GreenTreeRoundDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      public static final int ROUNDREWARD_FIELD_NUMBER = 2;
      private boolean roundReward_;
      public static final int GOTID_FIELD_NUMBER = 3;
      private Internal.IntList gotId_;
      private byte memoizedIsInitialized;
      private static final GreenTreeRoundData DEFAULT_INSTANCE = new GreenTreeRoundData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GreenTreeRoundData> PARSER = new AbstractParser<GreenTreeRoundData>() {
         public GreenTreeRoundData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GreenTreeRoundData(input, extensionRegistry);
         }
      };

      private GreenTreeRoundData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GreenTreeRoundData() {
         this.memoizedIsInitialized = -1;
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GreenTreeRoundData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GreenTreeRoundData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.round_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.roundReward_ = input.readBool();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotId_.addInt(input.readInt32());
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
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_fieldAccessorTable.ensureFieldAccessorsInitialized(GreenTreeRoundData.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public boolean hasRoundReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getRoundReward() {
         return this.roundReward_;
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.roundReward_);
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(3, this.gotId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.roundReward_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GreenTreeRoundData)) {
            return super.equals(obj);
         } else {
            GreenTreeRoundData other = (GreenTreeRoundData)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else if (this.hasRoundReward() != other.hasRoundReward()) {
               return false;
            } else if (this.hasRoundReward() && this.getRoundReward() != other.getRoundReward()) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            if (this.hasRoundReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getRoundReward());
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GreenTreeRoundData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data);
      }

      public static GreenTreeRoundData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GreenTreeRoundData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data);
      }

      public static GreenTreeRoundData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GreenTreeRoundData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data);
      }

      public static GreenTreeRoundData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GreenTreeRoundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GreenTreeRoundData parseFrom(InputStream input) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GreenTreeRoundData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GreenTreeRoundData parseDelimitedFrom(InputStream input) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GreenTreeRoundData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GreenTreeRoundData parseFrom(CodedInputStream input) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GreenTreeRoundData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GreenTreeRoundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GreenTreeRoundData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GreenTreeRoundData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GreenTreeRoundData> parser() {
         return PARSER;
      }

      public Parser<GreenTreeRoundData> getParserForType() {
         return PARSER;
      }

      public GreenTreeRoundData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GreenTreeRoundDataOrBuilder {
         private int bitField0_;
         private int round_;
         private boolean roundReward_;
         private Internal.IntList gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_fieldAccessorTable.ensureFieldAccessorsInitialized(GreenTreeRoundData.class, Builder.class);
         }

         private Builder() {
            this.gotId_ = KittyActivityMsg.GreenTreeRoundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotId_ = KittyActivityMsg.GreenTreeRoundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.GreenTreeRoundData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            this.roundReward_ = false;
            this.bitField0_ &= -3;
            this.gotId_ = KittyActivityMsg.GreenTreeRoundData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_GreenTreeRoundData_descriptor;
         }

         public GreenTreeRoundData getDefaultInstanceForType() {
            return KittyActivityMsg.GreenTreeRoundData.getDefaultInstance();
         }

         public GreenTreeRoundData build() {
            GreenTreeRoundData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GreenTreeRoundData buildPartial() {
            GreenTreeRoundData result = new GreenTreeRoundData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.roundReward_ = this.roundReward_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotId_ = this.gotId_;
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
            if (other instanceof GreenTreeRoundData) {
               return this.mergeFrom((GreenTreeRoundData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GreenTreeRoundData other) {
            if (other == KittyActivityMsg.GreenTreeRoundData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               if (other.hasRoundReward()) {
                  this.setRoundReward(other.getRoundReward());
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRound()) {
               return false;
            } else {
               return this.hasRoundReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GreenTreeRoundData parsedMessage = null;

            try {
               parsedMessage = (GreenTreeRoundData)KittyActivityMsg.GreenTreeRoundData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GreenTreeRoundData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getRoundReward() {
            return this.roundReward_;
         }

         public Builder setRoundReward(boolean value) {
            this.bitField0_ |= 2;
            this.roundReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundReward() {
            this.bitField0_ &= -3;
            this.roundReward_ = false;
            this.onChanged();
            return this;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotId_ = KittyActivityMsg.GreenTreeRoundData.mutableCopy(this.gotId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = KittyActivityMsg.GreenTreeRoundData.emptyIntList();
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

   public static final class RainTreeRankData extends GeneratedMessageV3 implements RainTreeRankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SERVER_FIELD_NUMBER = 2;
      private int server_;
      public static final int PROCESS_FIELD_NUMBER = 3;
      private int process_;
      public static final int NUMONEPLAYER_FIELD_NUMBER = 4;
      private NumOnePlayerInfo numOnePlayer_;
      private byte memoizedIsInitialized;
      private static final RainTreeRankData DEFAULT_INSTANCE = new RainTreeRankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RainTreeRankData> PARSER = new AbstractParser<RainTreeRankData>() {
         public RainTreeRankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RainTreeRankData(input, extensionRegistry);
         }
      };

      private RainTreeRankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RainTreeRankData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RainTreeRankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RainTreeRankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.rank_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.server_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.process_ = input.readInt32();
                        break;
                     case 34:
                        NumOnePlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.numOnePlayer_.toBuilder();
                        }

                        this.numOnePlayer_ = (NumOnePlayerInfo)input.readMessage(KittyActivityMsg.NumOnePlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.numOnePlayer_);
                           this.numOnePlayer_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RainTreeRankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasServer() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServer() {
         return this.server_;
      }

      public boolean hasProcess() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getProcess() {
         return this.process_;
      }

      public boolean hasNumOnePlayer() {
         return (this.bitField0_ & 8) != 0;
      }

      public NumOnePlayerInfo getNumOnePlayer() {
         return this.numOnePlayer_ == null ? KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance() : this.numOnePlayer_;
      }

      public NumOnePlayerInfoOrBuilder getNumOnePlayerOrBuilder() {
         return this.numOnePlayer_ == null ? KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance() : this.numOnePlayer_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNumOnePlayer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getNumOnePlayer().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.server_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.process_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getNumOnePlayer());
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.server_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.process_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getNumOnePlayer());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RainTreeRankData)) {
            return super.equals(obj);
         } else {
            RainTreeRankData other = (RainTreeRankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasProcess() != other.hasProcess()) {
               return false;
            } else if (this.hasProcess() && this.getProcess() != other.getProcess()) {
               return false;
            } else if (this.hasNumOnePlayer() != other.hasNumOnePlayer()) {
               return false;
            } else if (this.hasNumOnePlayer() && !this.getNumOnePlayer().equals(other.getNumOnePlayer())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasProcess()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProcess();
            }

            if (this.hasNumOnePlayer()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNumOnePlayer().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RainTreeRankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data);
      }

      public static RainTreeRankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RainTreeRankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data);
      }

      public static RainTreeRankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RainTreeRankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data);
      }

      public static RainTreeRankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RainTreeRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RainTreeRankData parseFrom(InputStream input) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RainTreeRankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RainTreeRankData parseDelimitedFrom(InputStream input) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RainTreeRankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RainTreeRankData parseFrom(CodedInputStream input) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RainTreeRankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RainTreeRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RainTreeRankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RainTreeRankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RainTreeRankData> parser() {
         return PARSER;
      }

      public Parser<RainTreeRankData> getParserForType() {
         return PARSER;
      }

      public RainTreeRankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RainTreeRankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private int server_;
         private int process_;
         private NumOnePlayerInfo numOnePlayer_;
         private SingleFieldBuilderV3<NumOnePlayerInfo, NumOnePlayerInfo.Builder, NumOnePlayerInfoOrBuilder> numOnePlayerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RainTreeRankData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.RainTreeRankData.alwaysUseFieldBuilders) {
               this.getNumOnePlayerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.server_ = 0;
            this.bitField0_ &= -3;
            this.process_ = 0;
            this.bitField0_ &= -5;
            if (this.numOnePlayerBuilder_ == null) {
               this.numOnePlayer_ = null;
            } else {
               this.numOnePlayerBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_RainTreeRankData_descriptor;
         }

         public RainTreeRankData getDefaultInstanceForType() {
            return KittyActivityMsg.RainTreeRankData.getDefaultInstance();
         }

         public RainTreeRankData build() {
            RainTreeRankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RainTreeRankData buildPartial() {
            RainTreeRankData result = new RainTreeRankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.process_ = this.process_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.numOnePlayerBuilder_ == null) {
                  result.numOnePlayer_ = this.numOnePlayer_;
               } else {
                  result.numOnePlayer_ = (NumOnePlayerInfo)this.numOnePlayerBuilder_.build();
               }

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
            if (other instanceof RainTreeRankData) {
               return this.mergeFrom((RainTreeRankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RainTreeRankData other) {
            if (other == KittyActivityMsg.RainTreeRankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasProcess()) {
                  this.setProcess(other.getProcess());
               }

               if (other.hasNumOnePlayer()) {
                  this.mergeNumOnePlayer(other.getNumOnePlayer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasServer()) {
               return false;
            } else if (!this.hasProcess()) {
               return false;
            } else if (!this.hasNumOnePlayer()) {
               return false;
            } else {
               return this.getNumOnePlayer().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RainTreeRankData parsedMessage = null;

            try {
               parsedMessage = (RainTreeRankData)KittyActivityMsg.RainTreeRankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RainTreeRankData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServer() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 2;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -3;
            this.server_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProcess() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getProcess() {
            return this.process_;
         }

         public Builder setProcess(int value) {
            this.bitField0_ |= 4;
            this.process_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProcess() {
            this.bitField0_ &= -5;
            this.process_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNumOnePlayer() {
            return (this.bitField0_ & 8) != 0;
         }

         public NumOnePlayerInfo getNumOnePlayer() {
            if (this.numOnePlayerBuilder_ == null) {
               return this.numOnePlayer_ == null ? KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance() : this.numOnePlayer_;
            } else {
               return (NumOnePlayerInfo)this.numOnePlayerBuilder_.getMessage();
            }
         }

         public Builder setNumOnePlayer(NumOnePlayerInfo value) {
            if (this.numOnePlayerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.numOnePlayer_ = value;
               this.onChanged();
            } else {
               this.numOnePlayerBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setNumOnePlayer(NumOnePlayerInfo.Builder builderForValue) {
            if (this.numOnePlayerBuilder_ == null) {
               this.numOnePlayer_ = builderForValue.build();
               this.onChanged();
            } else {
               this.numOnePlayerBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeNumOnePlayer(NumOnePlayerInfo value) {
            if (this.numOnePlayerBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.numOnePlayer_ != null && this.numOnePlayer_ != KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance()) {
                  this.numOnePlayer_ = KittyActivityMsg.NumOnePlayerInfo.newBuilder(this.numOnePlayer_).mergeFrom(value).buildPartial();
               } else {
                  this.numOnePlayer_ = value;
               }

               this.onChanged();
            } else {
               this.numOnePlayerBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearNumOnePlayer() {
            if (this.numOnePlayerBuilder_ == null) {
               this.numOnePlayer_ = null;
               this.onChanged();
            } else {
               this.numOnePlayerBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public NumOnePlayerInfo.Builder getNumOnePlayerBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (NumOnePlayerInfo.Builder)this.getNumOnePlayerFieldBuilder().getBuilder();
         }

         public NumOnePlayerInfoOrBuilder getNumOnePlayerOrBuilder() {
            if (this.numOnePlayerBuilder_ != null) {
               return (NumOnePlayerInfoOrBuilder)this.numOnePlayerBuilder_.getMessageOrBuilder();
            } else {
               return this.numOnePlayer_ == null ? KittyActivityMsg.NumOnePlayerInfo.getDefaultInstance() : this.numOnePlayer_;
            }
         }

         private SingleFieldBuilderV3<NumOnePlayerInfo, NumOnePlayerInfo.Builder, NumOnePlayerInfoOrBuilder> getNumOnePlayerFieldBuilder() {
            if (this.numOnePlayerBuilder_ == null) {
               this.numOnePlayerBuilder_ = new SingleFieldBuilderV3(this.getNumOnePlayer(), this.getParentForChildren(), this.isClean());
               this.numOnePlayer_ = null;
            }

            return this.numOnePlayerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_IllustrationMain_15901 extends GeneratedMessageV3 implements C2S_IllustrationMain_15901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_IllustrationMain_15901 DEFAULT_INSTANCE = new C2S_IllustrationMain_15901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IllustrationMain_15901> PARSER = new AbstractParser<C2S_IllustrationMain_15901>() {
         public C2S_IllustrationMain_15901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IllustrationMain_15901(input, extensionRegistry);
         }
      };

      private C2S_IllustrationMain_15901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IllustrationMain_15901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IllustrationMain_15901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IllustrationMain_15901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationMain_15901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IllustrationMain_15901)) {
            return super.equals(obj);
         } else {
            C2S_IllustrationMain_15901 other = (C2S_IllustrationMain_15901)obj;
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

      public static C2S_IllustrationMain_15901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationMain_15901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationMain_15901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationMain_15901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationMain_15901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationMain_15901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationMain_15901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationMain_15901 parseFrom(InputStream input) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationMain_15901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationMain_15901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IllustrationMain_15901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationMain_15901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationMain_15901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationMain_15901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IllustrationMain_15901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IllustrationMain_15901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IllustrationMain_15901> parser() {
         return PARSER;
      }

      public Parser<C2S_IllustrationMain_15901> getParserForType() {
         return PARSER;
      }

      public C2S_IllustrationMain_15901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IllustrationMain_15901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationMain_15901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_IllustrationMain_15901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationMain_15901_descriptor;
         }

         public C2S_IllustrationMain_15901 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_IllustrationMain_15901.getDefaultInstance();
         }

         public C2S_IllustrationMain_15901 build() {
            C2S_IllustrationMain_15901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IllustrationMain_15901 buildPartial() {
            C2S_IllustrationMain_15901 result = new C2S_IllustrationMain_15901(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_IllustrationMain_15901) {
               return this.mergeFrom((C2S_IllustrationMain_15901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IllustrationMain_15901 other) {
            if (other == KittyActivityMsg.C2S_IllustrationMain_15901.getDefaultInstance()) {
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
            C2S_IllustrationMain_15901 parsedMessage = null;

            try {
               parsedMessage = (C2S_IllustrationMain_15901)KittyActivityMsg.C2S_IllustrationMain_15901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IllustrationMain_15901)e.getUnfinishedMessage();
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

   public static final class S2C_IllustrationMain_15902 extends GeneratedMessageV3 implements S2C_IllustrationMain_15902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENDTIME_FIELD_NUMBER = 1;
      private int endTime_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      public static final int ILLUSTRATION_FIELD_NUMBER = 3;
      private List<IllustrationData> illustration_;
      private byte memoizedIsInitialized;
      private static final S2C_IllustrationMain_15902 DEFAULT_INSTANCE = new S2C_IllustrationMain_15902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IllustrationMain_15902> PARSER = new AbstractParser<S2C_IllustrationMain_15902>() {
         public S2C_IllustrationMain_15902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IllustrationMain_15902(input, extensionRegistry);
         }
      };

      private S2C_IllustrationMain_15902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IllustrationMain_15902() {
         this.memoizedIsInitialized = -1;
         this.illustration_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IllustrationMain_15902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IllustrationMain_15902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.endTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.illustration_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.illustration_.add(input.readMessage(KittyActivityMsg.IllustrationData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.illustration_ = Collections.unmodifiableList(this.illustration_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationMain_15902.class, Builder.class);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public List<IllustrationData> getIllustrationList() {
         return this.illustration_;
      }

      public List<? extends IllustrationDataOrBuilder> getIllustrationOrBuilderList() {
         return this.illustration_;
      }

      public int getIllustrationCount() {
         return this.illustration_.size();
      }

      public IllustrationData getIllustration(int index) {
         return (IllustrationData)this.illustration_.get(index);
      }

      public IllustrationDataOrBuilder getIllustrationOrBuilder(int index) {
         return (IllustrationDataOrBuilder)this.illustration_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getIllustrationCount(); ++i) {
               if (!this.getIllustration(i).isInitialized()) {
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
            output.writeInt32(1, this.endTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
         }

         for(int i = 0; i < this.illustration_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.illustration_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.endTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            for(int i = 0; i < this.illustration_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.illustration_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_IllustrationMain_15902)) {
            return super.equals(obj);
         } else {
            S2C_IllustrationMain_15902 other = (S2C_IllustrationMain_15902)obj;
            if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (!this.getIllustrationList().equals(other.getIllustrationList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEndTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            if (this.getIllustrationCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getIllustrationList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_IllustrationMain_15902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationMain_15902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationMain_15902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationMain_15902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationMain_15902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationMain_15902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationMain_15902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationMain_15902 parseFrom(InputStream input) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationMain_15902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationMain_15902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IllustrationMain_15902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationMain_15902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationMain_15902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationMain_15902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IllustrationMain_15902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IllustrationMain_15902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IllustrationMain_15902> parser() {
         return PARSER;
      }

      public Parser<S2C_IllustrationMain_15902> getParserForType() {
         return PARSER;
      }

      public S2C_IllustrationMain_15902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IllustrationMain_15902OrBuilder {
         private int bitField0_;
         private int endTime_;
         private int day_;
         private List<IllustrationData> illustration_;
         private RepeatedFieldBuilderV3<IllustrationData, IllustrationData.Builder, IllustrationDataOrBuilder> illustrationBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationMain_15902.class, Builder.class);
         }

         private Builder() {
            this.illustration_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.illustration_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_IllustrationMain_15902.alwaysUseFieldBuilders) {
               this.getIllustrationFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.endTime_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            if (this.illustrationBuilder_ == null) {
               this.illustration_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.illustrationBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationMain_15902_descriptor;
         }

         public S2C_IllustrationMain_15902 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_IllustrationMain_15902.getDefaultInstance();
         }

         public S2C_IllustrationMain_15902 build() {
            S2C_IllustrationMain_15902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IllustrationMain_15902 buildPartial() {
            S2C_IllustrationMain_15902 result = new S2C_IllustrationMain_15902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
            }

            if (this.illustrationBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.illustration_ = Collections.unmodifiableList(this.illustration_);
                  this.bitField0_ &= -5;
               }

               result.illustration_ = this.illustration_;
            } else {
               result.illustration_ = this.illustrationBuilder_.build();
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
            if (other instanceof S2C_IllustrationMain_15902) {
               return this.mergeFrom((S2C_IllustrationMain_15902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IllustrationMain_15902 other) {
            if (other == KittyActivityMsg.S2C_IllustrationMain_15902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (this.illustrationBuilder_ == null) {
                  if (!other.illustration_.isEmpty()) {
                     if (this.illustration_.isEmpty()) {
                        this.illustration_ = other.illustration_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureIllustrationIsMutable();
                        this.illustration_.addAll(other.illustration_);
                     }

                     this.onChanged();
                  }
               } else if (!other.illustration_.isEmpty()) {
                  if (this.illustrationBuilder_.isEmpty()) {
                     this.illustrationBuilder_.dispose();
                     this.illustrationBuilder_ = null;
                     this.illustration_ = other.illustration_;
                     this.bitField0_ &= -5;
                     this.illustrationBuilder_ = KittyActivityMsg.S2C_IllustrationMain_15902.alwaysUseFieldBuilders ? this.getIllustrationFieldBuilder() : null;
                  } else {
                     this.illustrationBuilder_.addAllMessages(other.illustration_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasDay()) {
               return false;
            } else {
               for(int i = 0; i < this.getIllustrationCount(); ++i) {
                  if (!this.getIllustration(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_IllustrationMain_15902 parsedMessage = null;

            try {
               parsedMessage = (S2C_IllustrationMain_15902)KittyActivityMsg.S2C_IllustrationMain_15902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IllustrationMain_15902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 1;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureIllustrationIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.illustration_ = new ArrayList(this.illustration_);
               this.bitField0_ |= 4;
            }

         }

         public List<IllustrationData> getIllustrationList() {
            return this.illustrationBuilder_ == null ? Collections.unmodifiableList(this.illustration_) : this.illustrationBuilder_.getMessageList();
         }

         public int getIllustrationCount() {
            return this.illustrationBuilder_ == null ? this.illustration_.size() : this.illustrationBuilder_.getCount();
         }

         public IllustrationData getIllustration(int index) {
            return this.illustrationBuilder_ == null ? (IllustrationData)this.illustration_.get(index) : (IllustrationData)this.illustrationBuilder_.getMessage(index);
         }

         public Builder setIllustration(int index, IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.set(index, value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setIllustration(int index, IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addIllustration(IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.add(value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addIllustration(int index, IllustrationData value) {
            if (this.illustrationBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureIllustrationIsMutable();
               this.illustration_.add(index, value);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addIllustration(IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addIllustration(int index, IllustrationData.Builder builderForValue) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.illustrationBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllIllustration(Iterable<? extends IllustrationData> values) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.illustration_);
               this.onChanged();
            } else {
               this.illustrationBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearIllustration() {
            if (this.illustrationBuilder_ == null) {
               this.illustration_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.illustrationBuilder_.clear();
            }

            return this;
         }

         public Builder removeIllustration(int index) {
            if (this.illustrationBuilder_ == null) {
               this.ensureIllustrationIsMutable();
               this.illustration_.remove(index);
               this.onChanged();
            } else {
               this.illustrationBuilder_.remove(index);
            }

            return this;
         }

         public IllustrationData.Builder getIllustrationBuilder(int index) {
            return (IllustrationData.Builder)this.getIllustrationFieldBuilder().getBuilder(index);
         }

         public IllustrationDataOrBuilder getIllustrationOrBuilder(int index) {
            return this.illustrationBuilder_ == null ? (IllustrationDataOrBuilder)this.illustration_.get(index) : (IllustrationDataOrBuilder)this.illustrationBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends IllustrationDataOrBuilder> getIllustrationOrBuilderList() {
            return this.illustrationBuilder_ != null ? this.illustrationBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.illustration_);
         }

         public IllustrationData.Builder addIllustrationBuilder() {
            return (IllustrationData.Builder)this.getIllustrationFieldBuilder().addBuilder(KittyActivityMsg.IllustrationData.getDefaultInstance());
         }

         public IllustrationData.Builder addIllustrationBuilder(int index) {
            return (IllustrationData.Builder)this.getIllustrationFieldBuilder().addBuilder(index, KittyActivityMsg.IllustrationData.getDefaultInstance());
         }

         public List<IllustrationData.Builder> getIllustrationBuilderList() {
            return this.getIllustrationFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<IllustrationData, IllustrationData.Builder, IllustrationDataOrBuilder> getIllustrationFieldBuilder() {
            if (this.illustrationBuilder_ == null) {
               this.illustrationBuilder_ = new RepeatedFieldBuilderV3(this.illustration_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.illustration_ = null;
            }

            return this.illustrationBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_IllustrationTaskCommit_15903 extends GeneratedMessageV3 implements C2S_IllustrationTaskCommit_15903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_IllustrationTaskCommit_15903 DEFAULT_INSTANCE = new C2S_IllustrationTaskCommit_15903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IllustrationTaskCommit_15903> PARSER = new AbstractParser<C2S_IllustrationTaskCommit_15903>() {
         public C2S_IllustrationTaskCommit_15903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IllustrationTaskCommit_15903(input, extensionRegistry);
         }
      };

      private C2S_IllustrationTaskCommit_15903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IllustrationTaskCommit_15903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IllustrationTaskCommit_15903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IllustrationTaskCommit_15903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationTaskCommit_15903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IllustrationTaskCommit_15903)) {
            return super.equals(obj);
         } else {
            C2S_IllustrationTaskCommit_15903 other = (C2S_IllustrationTaskCommit_15903)obj;
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

      public static C2S_IllustrationTaskCommit_15903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationTaskCommit_15903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(InputStream input) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationTaskCommit_15903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IllustrationTaskCommit_15903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationTaskCommit_15903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationTaskCommit_15903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IllustrationTaskCommit_15903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IllustrationTaskCommit_15903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IllustrationTaskCommit_15903> parser() {
         return PARSER;
      }

      public Parser<C2S_IllustrationTaskCommit_15903> getParserForType() {
         return PARSER;
      }

      public C2S_IllustrationTaskCommit_15903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IllustrationTaskCommit_15903OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationTaskCommit_15903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_IllustrationTaskCommit_15903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationTaskCommit_15903_descriptor;
         }

         public C2S_IllustrationTaskCommit_15903 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_IllustrationTaskCommit_15903.getDefaultInstance();
         }

         public C2S_IllustrationTaskCommit_15903 build() {
            C2S_IllustrationTaskCommit_15903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IllustrationTaskCommit_15903 buildPartial() {
            C2S_IllustrationTaskCommit_15903 result = new C2S_IllustrationTaskCommit_15903(this);
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
            if (other instanceof C2S_IllustrationTaskCommit_15903) {
               return this.mergeFrom((C2S_IllustrationTaskCommit_15903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IllustrationTaskCommit_15903 other) {
            if (other == KittyActivityMsg.C2S_IllustrationTaskCommit_15903.getDefaultInstance()) {
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
            C2S_IllustrationTaskCommit_15903 parsedMessage = null;

            try {
               parsedMessage = (C2S_IllustrationTaskCommit_15903)KittyActivityMsg.C2S_IllustrationTaskCommit_15903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IllustrationTaskCommit_15903)e.getUnfinishedMessage();
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

   public static final class S2C_IllustrationTaskCommit_15904 extends GeneratedMessageV3 implements S2C_IllustrationTaskCommit_15904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_IllustrationTaskCommit_15904 DEFAULT_INSTANCE = new S2C_IllustrationTaskCommit_15904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IllustrationTaskCommit_15904> PARSER = new AbstractParser<S2C_IllustrationTaskCommit_15904>() {
         public S2C_IllustrationTaskCommit_15904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IllustrationTaskCommit_15904(input, extensionRegistry);
         }
      };

      private S2C_IllustrationTaskCommit_15904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IllustrationTaskCommit_15904() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IllustrationTaskCommit_15904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IllustrationTaskCommit_15904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationTaskCommit_15904.class, Builder.class);
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
         } else if (!(obj instanceof S2C_IllustrationTaskCommit_15904)) {
            return super.equals(obj);
         } else {
            S2C_IllustrationTaskCommit_15904 other = (S2C_IllustrationTaskCommit_15904)obj;
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

      public static S2C_IllustrationTaskCommit_15904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTaskCommit_15904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(InputStream input) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationTaskCommit_15904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTaskCommit_15904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTaskCommit_15904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTaskCommit_15904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IllustrationTaskCommit_15904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IllustrationTaskCommit_15904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IllustrationTaskCommit_15904> parser() {
         return PARSER;
      }

      public Parser<S2C_IllustrationTaskCommit_15904> getParserForType() {
         return PARSER;
      }

      public S2C_IllustrationTaskCommit_15904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IllustrationTaskCommit_15904OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationTaskCommit_15904.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_IllustrationTaskCommit_15904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTaskCommit_15904_descriptor;
         }

         public S2C_IllustrationTaskCommit_15904 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_IllustrationTaskCommit_15904.getDefaultInstance();
         }

         public S2C_IllustrationTaskCommit_15904 build() {
            S2C_IllustrationTaskCommit_15904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IllustrationTaskCommit_15904 buildPartial() {
            S2C_IllustrationTaskCommit_15904 result = new S2C_IllustrationTaskCommit_15904(this);
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
            if (other instanceof S2C_IllustrationTaskCommit_15904) {
               return this.mergeFrom((S2C_IllustrationTaskCommit_15904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IllustrationTaskCommit_15904 other) {
            if (other == KittyActivityMsg.S2C_IllustrationTaskCommit_15904.getDefaultInstance()) {
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
            S2C_IllustrationTaskCommit_15904 parsedMessage = null;

            try {
               parsedMessage = (S2C_IllustrationTaskCommit_15904)KittyActivityMsg.S2C_IllustrationTaskCommit_15904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IllustrationTaskCommit_15904)e.getUnfinishedMessage();
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

   public static final class S2C_IllustrationTasksNotify_15906 extends GeneratedMessageV3 implements S2C_IllustrationTasksNotify_15906OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_IllustrationTasksNotify_15906 DEFAULT_INSTANCE = new S2C_IllustrationTasksNotify_15906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IllustrationTasksNotify_15906> PARSER = new AbstractParser<S2C_IllustrationTasksNotify_15906>() {
         public S2C_IllustrationTasksNotify_15906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IllustrationTasksNotify_15906(input, extensionRegistry);
         }
      };

      private S2C_IllustrationTasksNotify_15906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IllustrationTasksNotify_15906() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IllustrationTasksNotify_15906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IllustrationTasksNotify_15906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationTasksNotify_15906.class, Builder.class);
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
         } else if (!(obj instanceof S2C_IllustrationTasksNotify_15906)) {
            return super.equals(obj);
         } else {
            S2C_IllustrationTasksNotify_15906 other = (S2C_IllustrationTasksNotify_15906)obj;
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

      public static S2C_IllustrationTasksNotify_15906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationTasksNotify_15906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(InputStream input) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationTasksNotify_15906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTasksNotify_15906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationTasksNotify_15906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationTasksNotify_15906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IllustrationTasksNotify_15906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IllustrationTasksNotify_15906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IllustrationTasksNotify_15906> parser() {
         return PARSER;
      }

      public Parser<S2C_IllustrationTasksNotify_15906> getParserForType() {
         return PARSER;
      }

      public S2C_IllustrationTasksNotify_15906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IllustrationTasksNotify_15906OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationTasksNotify_15906.class, Builder.class);
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
            if (KittyActivityMsg.S2C_IllustrationTasksNotify_15906.alwaysUseFieldBuilders) {
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
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationTasksNotify_15906_descriptor;
         }

         public S2C_IllustrationTasksNotify_15906 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_IllustrationTasksNotify_15906.getDefaultInstance();
         }

         public S2C_IllustrationTasksNotify_15906 build() {
            S2C_IllustrationTasksNotify_15906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IllustrationTasksNotify_15906 buildPartial() {
            S2C_IllustrationTasksNotify_15906 result = new S2C_IllustrationTasksNotify_15906(this);
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
            if (other instanceof S2C_IllustrationTasksNotify_15906) {
               return this.mergeFrom((S2C_IllustrationTasksNotify_15906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IllustrationTasksNotify_15906 other) {
            if (other == KittyActivityMsg.S2C_IllustrationTasksNotify_15906.getDefaultInstance()) {
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
                     this.taskBuilder_ = KittyActivityMsg.S2C_IllustrationTasksNotify_15906.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_IllustrationTasksNotify_15906 parsedMessage = null;

            try {
               parsedMessage = (S2C_IllustrationTasksNotify_15906)KittyActivityMsg.S2C_IllustrationTasksNotify_15906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IllustrationTasksNotify_15906)e.getUnfinishedMessage();
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

   public static final class C2S_RainTreeMain_15907 extends GeneratedMessageV3 implements C2S_RainTreeMain_15907OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RainTreeMain_15907 DEFAULT_INSTANCE = new C2S_RainTreeMain_15907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RainTreeMain_15907> PARSER = new AbstractParser<C2S_RainTreeMain_15907>() {
         public C2S_RainTreeMain_15907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RainTreeMain_15907(input, extensionRegistry);
         }
      };

      private C2S_RainTreeMain_15907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RainTreeMain_15907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RainTreeMain_15907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RainTreeMain_15907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeMain_15907.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RainTreeMain_15907)) {
            return super.equals(obj);
         } else {
            C2S_RainTreeMain_15907 other = (C2S_RainTreeMain_15907)obj;
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

      public static C2S_RainTreeMain_15907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeMain_15907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeMain_15907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeMain_15907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeMain_15907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeMain_15907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeMain_15907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeMain_15907 parseFrom(InputStream input) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeMain_15907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeMain_15907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RainTreeMain_15907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeMain_15907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeMain_15907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeMain_15907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RainTreeMain_15907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RainTreeMain_15907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RainTreeMain_15907> parser() {
         return PARSER;
      }

      public Parser<C2S_RainTreeMain_15907> getParserForType() {
         return PARSER;
      }

      public C2S_RainTreeMain_15907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RainTreeMain_15907OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeMain_15907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_RainTreeMain_15907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeMain_15907_descriptor;
         }

         public C2S_RainTreeMain_15907 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_RainTreeMain_15907.getDefaultInstance();
         }

         public C2S_RainTreeMain_15907 build() {
            C2S_RainTreeMain_15907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RainTreeMain_15907 buildPartial() {
            C2S_RainTreeMain_15907 result = new C2S_RainTreeMain_15907(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RainTreeMain_15907) {
               return this.mergeFrom((C2S_RainTreeMain_15907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RainTreeMain_15907 other) {
            if (other == KittyActivityMsg.C2S_RainTreeMain_15907.getDefaultInstance()) {
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
            C2S_RainTreeMain_15907 parsedMessage = null;

            try {
               parsedMessage = (C2S_RainTreeMain_15907)KittyActivityMsg.C2S_RainTreeMain_15907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RainTreeMain_15907)e.getUnfinishedMessage();
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

   public static final class S2C_RainTreeMain_15908 extends GeneratedMessageV3 implements S2C_RainTreeMain_15908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PROCESS_FIELD_NUMBER = 1;
      private int process_;
      public static final int FREECOUNT_FIELD_NUMBER = 2;
      private int freeCount_;
      public static final int CYCLECOUNT_FIELD_NUMBER = 3;
      private int cycleCount_;
      public static final int PLANCOUNT_FIELD_NUMBER = 4;
      private int planCount_;
      private byte memoizedIsInitialized;
      private static final S2C_RainTreeMain_15908 DEFAULT_INSTANCE = new S2C_RainTreeMain_15908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RainTreeMain_15908> PARSER = new AbstractParser<S2C_RainTreeMain_15908>() {
         public S2C_RainTreeMain_15908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RainTreeMain_15908(input, extensionRegistry);
         }
      };

      private S2C_RainTreeMain_15908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RainTreeMain_15908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RainTreeMain_15908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RainTreeMain_15908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.process_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.freeCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.cycleCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.planCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeMain_15908.class, Builder.class);
      }

      public boolean hasProcess() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getProcess() {
         return this.process_;
      }

      public boolean hasFreeCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFreeCount() {
         return this.freeCount_;
      }

      public boolean hasCycleCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCycleCount() {
         return this.cycleCount_;
      }

      public boolean hasPlanCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlanCount() {
         return this.planCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCycleCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlanCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.process_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.freeCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.cycleCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.planCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.process_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.freeCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.cycleCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.planCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RainTreeMain_15908)) {
            return super.equals(obj);
         } else {
            S2C_RainTreeMain_15908 other = (S2C_RainTreeMain_15908)obj;
            if (this.hasProcess() != other.hasProcess()) {
               return false;
            } else if (this.hasProcess() && this.getProcess() != other.getProcess()) {
               return false;
            } else if (this.hasFreeCount() != other.hasFreeCount()) {
               return false;
            } else if (this.hasFreeCount() && this.getFreeCount() != other.getFreeCount()) {
               return false;
            } else if (this.hasCycleCount() != other.hasCycleCount()) {
               return false;
            } else if (this.hasCycleCount() && this.getCycleCount() != other.getCycleCount()) {
               return false;
            } else if (this.hasPlanCount() != other.hasPlanCount()) {
               return false;
            } else if (this.hasPlanCount() && this.getPlanCount() != other.getPlanCount()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasProcess()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getProcess();
            }

            if (this.hasFreeCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFreeCount();
            }

            if (this.hasCycleCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCycleCount();
            }

            if (this.hasPlanCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlanCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RainTreeMain_15908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeMain_15908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeMain_15908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeMain_15908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeMain_15908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeMain_15908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeMain_15908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeMain_15908 parseFrom(InputStream input) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeMain_15908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeMain_15908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RainTreeMain_15908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeMain_15908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeMain_15908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeMain_15908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RainTreeMain_15908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RainTreeMain_15908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RainTreeMain_15908> parser() {
         return PARSER;
      }

      public Parser<S2C_RainTreeMain_15908> getParserForType() {
         return PARSER;
      }

      public S2C_RainTreeMain_15908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RainTreeMain_15908OrBuilder {
         private int bitField0_;
         private int process_;
         private int freeCount_;
         private int cycleCount_;
         private int planCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeMain_15908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_RainTreeMain_15908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.process_ = 0;
            this.bitField0_ &= -2;
            this.freeCount_ = 0;
            this.bitField0_ &= -3;
            this.cycleCount_ = 0;
            this.bitField0_ &= -5;
            this.planCount_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeMain_15908_descriptor;
         }

         public S2C_RainTreeMain_15908 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_RainTreeMain_15908.getDefaultInstance();
         }

         public S2C_RainTreeMain_15908 build() {
            S2C_RainTreeMain_15908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RainTreeMain_15908 buildPartial() {
            S2C_RainTreeMain_15908 result = new S2C_RainTreeMain_15908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.process_ = this.process_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.freeCount_ = this.freeCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.cycleCount_ = this.cycleCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.planCount_ = this.planCount_;
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
            if (other instanceof S2C_RainTreeMain_15908) {
               return this.mergeFrom((S2C_RainTreeMain_15908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RainTreeMain_15908 other) {
            if (other == KittyActivityMsg.S2C_RainTreeMain_15908.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasProcess()) {
                  this.setProcess(other.getProcess());
               }

               if (other.hasFreeCount()) {
                  this.setFreeCount(other.getFreeCount());
               }

               if (other.hasCycleCount()) {
                  this.setCycleCount(other.getCycleCount());
               }

               if (other.hasPlanCount()) {
                  this.setPlanCount(other.getPlanCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasProcess()) {
               return false;
            } else if (!this.hasFreeCount()) {
               return false;
            } else if (!this.hasCycleCount()) {
               return false;
            } else {
               return this.hasPlanCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RainTreeMain_15908 parsedMessage = null;

            try {
               parsedMessage = (S2C_RainTreeMain_15908)KittyActivityMsg.S2C_RainTreeMain_15908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RainTreeMain_15908)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasProcess() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getProcess() {
            return this.process_;
         }

         public Builder setProcess(int value) {
            this.bitField0_ |= 1;
            this.process_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProcess() {
            this.bitField0_ &= -2;
            this.process_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFreeCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFreeCount() {
            return this.freeCount_;
         }

         public Builder setFreeCount(int value) {
            this.bitField0_ |= 2;
            this.freeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeCount() {
            this.bitField0_ &= -3;
            this.freeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCycleCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCycleCount() {
            return this.cycleCount_;
         }

         public Builder setCycleCount(int value) {
            this.bitField0_ |= 4;
            this.cycleCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCycleCount() {
            this.bitField0_ &= -5;
            this.cycleCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlanCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlanCount() {
            return this.planCount_;
         }

         public Builder setPlanCount(int value) {
            this.bitField0_ |= 8;
            this.planCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlanCount() {
            this.bitField0_ &= -9;
            this.planCount_ = 0;
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

   public static final class C2S_RainTreeWater_15909 extends GeneratedMessageV3 implements C2S_RainTreeWater_15909OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_RainTreeWater_15909 DEFAULT_INSTANCE = new C2S_RainTreeWater_15909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RainTreeWater_15909> PARSER = new AbstractParser<C2S_RainTreeWater_15909>() {
         public C2S_RainTreeWater_15909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RainTreeWater_15909(input, extensionRegistry);
         }
      };

      private C2S_RainTreeWater_15909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RainTreeWater_15909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RainTreeWater_15909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RainTreeWater_15909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeWater_15909.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RainTreeWater_15909)) {
            return super.equals(obj);
         } else {
            C2S_RainTreeWater_15909 other = (C2S_RainTreeWater_15909)obj;
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

      public static C2S_RainTreeWater_15909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeWater_15909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeWater_15909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeWater_15909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeWater_15909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeWater_15909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeWater_15909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeWater_15909 parseFrom(InputStream input) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeWater_15909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeWater_15909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RainTreeWater_15909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeWater_15909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeWater_15909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeWater_15909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RainTreeWater_15909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RainTreeWater_15909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RainTreeWater_15909> parser() {
         return PARSER;
      }

      public Parser<C2S_RainTreeWater_15909> getParserForType() {
         return PARSER;
      }

      public C2S_RainTreeWater_15909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RainTreeWater_15909OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeWater_15909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_RainTreeWater_15909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeWater_15909_descriptor;
         }

         public C2S_RainTreeWater_15909 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_RainTreeWater_15909.getDefaultInstance();
         }

         public C2S_RainTreeWater_15909 build() {
            C2S_RainTreeWater_15909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RainTreeWater_15909 buildPartial() {
            C2S_RainTreeWater_15909 result = new C2S_RainTreeWater_15909(this);
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
            if (other instanceof C2S_RainTreeWater_15909) {
               return this.mergeFrom((C2S_RainTreeWater_15909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RainTreeWater_15909 other) {
            if (other == KittyActivityMsg.C2S_RainTreeWater_15909.getDefaultInstance()) {
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
            C2S_RainTreeWater_15909 parsedMessage = null;

            try {
               parsedMessage = (C2S_RainTreeWater_15909)KittyActivityMsg.C2S_RainTreeWater_15909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RainTreeWater_15909)e.getUnfinishedMessage();
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

   public static final class S2C_RainTreeWater_15910 extends GeneratedMessageV3 implements S2C_RainTreeWater_15910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREECOUNT_FIELD_NUMBER = 1;
      private int freeCount_;
      public static final int CYCLECOUNT_FIELD_NUMBER = 2;
      private int cycleCount_;
      public static final int PROCESS_FIELD_NUMBER = 3;
      private int process_;
      public static final int PLANCOUNT_FIELD_NUMBER = 4;
      private int planCount_;
      public static final int COUNT_FIELD_NUMBER = 5;
      private int count_;
      private byte memoizedIsInitialized;
      private static final S2C_RainTreeWater_15910 DEFAULT_INSTANCE = new S2C_RainTreeWater_15910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RainTreeWater_15910> PARSER = new AbstractParser<S2C_RainTreeWater_15910>() {
         public S2C_RainTreeWater_15910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RainTreeWater_15910(input, extensionRegistry);
         }
      };

      private S2C_RainTreeWater_15910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RainTreeWater_15910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RainTreeWater_15910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RainTreeWater_15910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.freeCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.cycleCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.process_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.planCount_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeWater_15910.class, Builder.class);
      }

      public boolean hasFreeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFreeCount() {
         return this.freeCount_;
      }

      public boolean hasCycleCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCycleCount() {
         return this.cycleCount_;
      }

      public boolean hasProcess() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getProcess() {
         return this.process_;
      }

      public boolean hasPlanCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlanCount() {
         return this.planCount_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCycleCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlanCount()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.freeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.cycleCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.process_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.planCount_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.freeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.cycleCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.process_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.planCount_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RainTreeWater_15910)) {
            return super.equals(obj);
         } else {
            S2C_RainTreeWater_15910 other = (S2C_RainTreeWater_15910)obj;
            if (this.hasFreeCount() != other.hasFreeCount()) {
               return false;
            } else if (this.hasFreeCount() && this.getFreeCount() != other.getFreeCount()) {
               return false;
            } else if (this.hasCycleCount() != other.hasCycleCount()) {
               return false;
            } else if (this.hasCycleCount() && this.getCycleCount() != other.getCycleCount()) {
               return false;
            } else if (this.hasProcess() != other.hasProcess()) {
               return false;
            } else if (this.hasProcess() && this.getProcess() != other.getProcess()) {
               return false;
            } else if (this.hasPlanCount() != other.hasPlanCount()) {
               return false;
            } else if (this.hasPlanCount() && this.getPlanCount() != other.getPlanCount()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
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
            if (this.hasFreeCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFreeCount();
            }

            if (this.hasCycleCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCycleCount();
            }

            if (this.hasProcess()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProcess();
            }

            if (this.hasPlanCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlanCount();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RainTreeWater_15910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeWater_15910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeWater_15910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeWater_15910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeWater_15910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeWater_15910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeWater_15910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeWater_15910 parseFrom(InputStream input) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeWater_15910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeWater_15910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RainTreeWater_15910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeWater_15910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeWater_15910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeWater_15910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RainTreeWater_15910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RainTreeWater_15910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RainTreeWater_15910> parser() {
         return PARSER;
      }

      public Parser<S2C_RainTreeWater_15910> getParserForType() {
         return PARSER;
      }

      public S2C_RainTreeWater_15910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RainTreeWater_15910OrBuilder {
         private int bitField0_;
         private int freeCount_;
         private int cycleCount_;
         private int process_;
         private int planCount_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeWater_15910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_RainTreeWater_15910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.freeCount_ = 0;
            this.bitField0_ &= -2;
            this.cycleCount_ = 0;
            this.bitField0_ &= -3;
            this.process_ = 0;
            this.bitField0_ &= -5;
            this.planCount_ = 0;
            this.bitField0_ &= -9;
            this.count_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeWater_15910_descriptor;
         }

         public S2C_RainTreeWater_15910 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_RainTreeWater_15910.getDefaultInstance();
         }

         public S2C_RainTreeWater_15910 build() {
            S2C_RainTreeWater_15910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RainTreeWater_15910 buildPartial() {
            S2C_RainTreeWater_15910 result = new S2C_RainTreeWater_15910(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.freeCount_ = this.freeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.cycleCount_ = this.cycleCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.process_ = this.process_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.planCount_ = this.planCount_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof S2C_RainTreeWater_15910) {
               return this.mergeFrom((S2C_RainTreeWater_15910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RainTreeWater_15910 other) {
            if (other == KittyActivityMsg.S2C_RainTreeWater_15910.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFreeCount()) {
                  this.setFreeCount(other.getFreeCount());
               }

               if (other.hasCycleCount()) {
                  this.setCycleCount(other.getCycleCount());
               }

               if (other.hasProcess()) {
                  this.setProcess(other.getProcess());
               }

               if (other.hasPlanCount()) {
                  this.setPlanCount(other.getPlanCount());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFreeCount()) {
               return false;
            } else if (!this.hasCycleCount()) {
               return false;
            } else if (!this.hasProcess()) {
               return false;
            } else if (!this.hasPlanCount()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RainTreeWater_15910 parsedMessage = null;

            try {
               parsedMessage = (S2C_RainTreeWater_15910)KittyActivityMsg.S2C_RainTreeWater_15910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RainTreeWater_15910)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFreeCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFreeCount() {
            return this.freeCount_;
         }

         public Builder setFreeCount(int value) {
            this.bitField0_ |= 1;
            this.freeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeCount() {
            this.bitField0_ &= -2;
            this.freeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCycleCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCycleCount() {
            return this.cycleCount_;
         }

         public Builder setCycleCount(int value) {
            this.bitField0_ |= 2;
            this.cycleCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCycleCount() {
            this.bitField0_ &= -3;
            this.cycleCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProcess() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getProcess() {
            return this.process_;
         }

         public Builder setProcess(int value) {
            this.bitField0_ |= 4;
            this.process_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProcess() {
            this.bitField0_ &= -5;
            this.process_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlanCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlanCount() {
            return this.planCount_;
         }

         public Builder setPlanCount(int value) {
            this.bitField0_ |= 8;
            this.planCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlanCount() {
            this.bitField0_ &= -9;
            this.planCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 16;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -17;
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

   public static final class C2S_RainTreeServerRank_15911 extends GeneratedMessageV3 implements C2S_RainTreeServerRank_15911OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RainTreeServerRank_15911 DEFAULT_INSTANCE = new C2S_RainTreeServerRank_15911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RainTreeServerRank_15911> PARSER = new AbstractParser<C2S_RainTreeServerRank_15911>() {
         public C2S_RainTreeServerRank_15911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RainTreeServerRank_15911(input, extensionRegistry);
         }
      };

      private C2S_RainTreeServerRank_15911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RainTreeServerRank_15911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RainTreeServerRank_15911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RainTreeServerRank_15911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeServerRank_15911.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RainTreeServerRank_15911)) {
            return super.equals(obj);
         } else {
            C2S_RainTreeServerRank_15911 other = (C2S_RainTreeServerRank_15911)obj;
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

      public static C2S_RainTreeServerRank_15911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RainTreeServerRank_15911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(InputStream input) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeServerRank_15911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RainTreeServerRank_15911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RainTreeServerRank_15911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RainTreeServerRank_15911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RainTreeServerRank_15911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RainTreeServerRank_15911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RainTreeServerRank_15911> parser() {
         return PARSER;
      }

      public Parser<C2S_RainTreeServerRank_15911> getParserForType() {
         return PARSER;
      }

      public C2S_RainTreeServerRank_15911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RainTreeServerRank_15911OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RainTreeServerRank_15911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_RainTreeServerRank_15911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_RainTreeServerRank_15911_descriptor;
         }

         public C2S_RainTreeServerRank_15911 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_RainTreeServerRank_15911.getDefaultInstance();
         }

         public C2S_RainTreeServerRank_15911 build() {
            C2S_RainTreeServerRank_15911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RainTreeServerRank_15911 buildPartial() {
            C2S_RainTreeServerRank_15911 result = new C2S_RainTreeServerRank_15911(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RainTreeServerRank_15911) {
               return this.mergeFrom((C2S_RainTreeServerRank_15911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RainTreeServerRank_15911 other) {
            if (other == KittyActivityMsg.C2S_RainTreeServerRank_15911.getDefaultInstance()) {
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
            C2S_RainTreeServerRank_15911 parsedMessage = null;

            try {
               parsedMessage = (C2S_RainTreeServerRank_15911)KittyActivityMsg.C2S_RainTreeServerRank_15911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RainTreeServerRank_15911)e.getUnfinishedMessage();
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

   public static final class S2C_RainTreeServerRank_15912 extends GeneratedMessageV3 implements S2C_RainTreeServerRank_15912OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKDATA_FIELD_NUMBER = 1;
      private List<RainTreeRankData> rankData_;
      private byte memoizedIsInitialized;
      private static final S2C_RainTreeServerRank_15912 DEFAULT_INSTANCE = new S2C_RainTreeServerRank_15912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RainTreeServerRank_15912> PARSER = new AbstractParser<S2C_RainTreeServerRank_15912>() {
         public S2C_RainTreeServerRank_15912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RainTreeServerRank_15912(input, extensionRegistry);
         }
      };

      private S2C_RainTreeServerRank_15912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RainTreeServerRank_15912() {
         this.memoizedIsInitialized = -1;
         this.rankData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RainTreeServerRank_15912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RainTreeServerRank_15912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.rankData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rankData_.add(input.readMessage(KittyActivityMsg.RainTreeRankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeServerRank_15912.class, Builder.class);
      }

      public List<RainTreeRankData> getRankDataList() {
         return this.rankData_;
      }

      public List<? extends RainTreeRankDataOrBuilder> getRankDataOrBuilderList() {
         return this.rankData_;
      }

      public int getRankDataCount() {
         return this.rankData_.size();
      }

      public RainTreeRankData getRankData(int index) {
         return (RainTreeRankData)this.rankData_.get(index);
      }

      public RainTreeRankDataOrBuilder getRankDataOrBuilder(int index) {
         return (RainTreeRankDataOrBuilder)this.rankData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRankDataCount(); ++i) {
               if (!this.getRankData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rankData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.rankData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rankData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.rankData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RainTreeServerRank_15912)) {
            return super.equals(obj);
         } else {
            S2C_RainTreeServerRank_15912 other = (S2C_RainTreeServerRank_15912)obj;
            if (!this.getRankDataList().equals(other.getRankDataList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRankDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeServerRank_15912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(InputStream input) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeServerRank_15912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RainTreeServerRank_15912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeServerRank_15912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeServerRank_15912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RainTreeServerRank_15912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RainTreeServerRank_15912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RainTreeServerRank_15912> parser() {
         return PARSER;
      }

      public Parser<S2C_RainTreeServerRank_15912> getParserForType() {
         return PARSER;
      }

      public S2C_RainTreeServerRank_15912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RainTreeServerRank_15912OrBuilder {
         private int bitField0_;
         private List<RainTreeRankData> rankData_;
         private RepeatedFieldBuilderV3<RainTreeRankData, RainTreeRankData.Builder, RainTreeRankDataOrBuilder> rankDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeServerRank_15912.class, Builder.class);
         }

         private Builder() {
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_RainTreeServerRank_15912.alwaysUseFieldBuilders) {
               this.getRankDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeServerRank_15912_descriptor;
         }

         public S2C_RainTreeServerRank_15912 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_RainTreeServerRank_15912.getDefaultInstance();
         }

         public S2C_RainTreeServerRank_15912 build() {
            S2C_RainTreeServerRank_15912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RainTreeServerRank_15912 buildPartial() {
            S2C_RainTreeServerRank_15912 result = new S2C_RainTreeServerRank_15912(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rankDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
                  this.bitField0_ &= -2;
               }

               result.rankData_ = this.rankData_;
            } else {
               result.rankData_ = this.rankDataBuilder_.build();
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
            if (other instanceof S2C_RainTreeServerRank_15912) {
               return this.mergeFrom((S2C_RainTreeServerRank_15912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RainTreeServerRank_15912 other) {
            if (other == KittyActivityMsg.S2C_RainTreeServerRank_15912.getDefaultInstance()) {
               return this;
            } else {
               if (this.rankDataBuilder_ == null) {
                  if (!other.rankData_.isEmpty()) {
                     if (this.rankData_.isEmpty()) {
                        this.rankData_ = other.rankData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRankDataIsMutable();
                        this.rankData_.addAll(other.rankData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankData_.isEmpty()) {
                  if (this.rankDataBuilder_.isEmpty()) {
                     this.rankDataBuilder_.dispose();
                     this.rankDataBuilder_ = null;
                     this.rankData_ = other.rankData_;
                     this.bitField0_ &= -2;
                     this.rankDataBuilder_ = KittyActivityMsg.S2C_RainTreeServerRank_15912.alwaysUseFieldBuilders ? this.getRankDataFieldBuilder() : null;
                  } else {
                     this.rankDataBuilder_.addAllMessages(other.rankData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRankDataCount(); ++i) {
               if (!this.getRankData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RainTreeServerRank_15912 parsedMessage = null;

            try {
               parsedMessage = (S2C_RainTreeServerRank_15912)KittyActivityMsg.S2C_RainTreeServerRank_15912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RainTreeServerRank_15912)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRankDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rankData_ = new ArrayList(this.rankData_);
               this.bitField0_ |= 1;
            }

         }

         public List<RainTreeRankData> getRankDataList() {
            return this.rankDataBuilder_ == null ? Collections.unmodifiableList(this.rankData_) : this.rankDataBuilder_.getMessageList();
         }

         public int getRankDataCount() {
            return this.rankDataBuilder_ == null ? this.rankData_.size() : this.rankDataBuilder_.getCount();
         }

         public RainTreeRankData getRankData(int index) {
            return this.rankDataBuilder_ == null ? (RainTreeRankData)this.rankData_.get(index) : (RainTreeRankData)this.rankDataBuilder_.getMessage(index);
         }

         public Builder setRankData(int index, RainTreeRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.set(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankData(int index, RainTreeRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(RainTreeRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankData(int index, RainTreeRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankData(RainTreeRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(int index, RainTreeRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankData(Iterable<? extends RainTreeRankData> values) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankData_);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankData() {
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankData(int index) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.remove(index);
               this.onChanged();
            } else {
               this.rankDataBuilder_.remove(index);
            }

            return this;
         }

         public RainTreeRankData.Builder getRankDataBuilder(int index) {
            return (RainTreeRankData.Builder)this.getRankDataFieldBuilder().getBuilder(index);
         }

         public RainTreeRankDataOrBuilder getRankDataOrBuilder(int index) {
            return this.rankDataBuilder_ == null ? (RainTreeRankDataOrBuilder)this.rankData_.get(index) : (RainTreeRankDataOrBuilder)this.rankDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RainTreeRankDataOrBuilder> getRankDataOrBuilderList() {
            return this.rankDataBuilder_ != null ? this.rankDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankData_);
         }

         public RainTreeRankData.Builder addRankDataBuilder() {
            return (RainTreeRankData.Builder)this.getRankDataFieldBuilder().addBuilder(KittyActivityMsg.RainTreeRankData.getDefaultInstance());
         }

         public RainTreeRankData.Builder addRankDataBuilder(int index) {
            return (RainTreeRankData.Builder)this.getRankDataFieldBuilder().addBuilder(index, KittyActivityMsg.RainTreeRankData.getDefaultInstance());
         }

         public List<RainTreeRankData.Builder> getRankDataBuilderList() {
            return this.getRankDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RainTreeRankData, RainTreeRankData.Builder, RainTreeRankDataOrBuilder> getRankDataFieldBuilder() {
            if (this.rankDataBuilder_ == null) {
               this.rankDataBuilder_ = new RepeatedFieldBuilderV3(this.rankData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rankData_ = null;
            }

            return this.rankDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GreenTreeMain_15913 extends GeneratedMessageV3 implements C2S_GreenTreeMain_15913OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GreenTreeMain_15913 DEFAULT_INSTANCE = new C2S_GreenTreeMain_15913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GreenTreeMain_15913> PARSER = new AbstractParser<C2S_GreenTreeMain_15913>() {
         public C2S_GreenTreeMain_15913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GreenTreeMain_15913(input, extensionRegistry);
         }
      };

      private C2S_GreenTreeMain_15913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GreenTreeMain_15913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GreenTreeMain_15913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GreenTreeMain_15913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeMain_15913.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GreenTreeMain_15913)) {
            return super.equals(obj);
         } else {
            C2S_GreenTreeMain_15913 other = (C2S_GreenTreeMain_15913)obj;
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

      public static C2S_GreenTreeMain_15913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeMain_15913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeMain_15913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeMain_15913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeMain_15913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeMain_15913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GreenTreeMain_15913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GreenTreeMain_15913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GreenTreeMain_15913> parser() {
         return PARSER;
      }

      public Parser<C2S_GreenTreeMain_15913> getParserForType() {
         return PARSER;
      }

      public C2S_GreenTreeMain_15913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GreenTreeMain_15913OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeMain_15913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_GreenTreeMain_15913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeMain_15913_descriptor;
         }

         public C2S_GreenTreeMain_15913 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_GreenTreeMain_15913.getDefaultInstance();
         }

         public C2S_GreenTreeMain_15913 build() {
            C2S_GreenTreeMain_15913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GreenTreeMain_15913 buildPartial() {
            C2S_GreenTreeMain_15913 result = new C2S_GreenTreeMain_15913(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GreenTreeMain_15913) {
               return this.mergeFrom((C2S_GreenTreeMain_15913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GreenTreeMain_15913 other) {
            if (other == KittyActivityMsg.C2S_GreenTreeMain_15913.getDefaultInstance()) {
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
            C2S_GreenTreeMain_15913 parsedMessage = null;

            try {
               parsedMessage = (C2S_GreenTreeMain_15913)KittyActivityMsg.C2S_GreenTreeMain_15913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GreenTreeMain_15913)e.getUnfinishedMessage();
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

   public static final class S2C_GreenTreeMain_15914 extends GeneratedMessageV3 implements S2C_GreenTreeMain_15914OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ROUNDDATA_FIELD_NUMBER = 1;
      private List<GreenTreeRoundData> roundData_;
      public static final int GOTID_FIELD_NUMBER = 2;
      private Internal.IntList gotId_;
      private byte memoizedIsInitialized;
      private static final S2C_GreenTreeMain_15914 DEFAULT_INSTANCE = new S2C_GreenTreeMain_15914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GreenTreeMain_15914> PARSER = new AbstractParser<S2C_GreenTreeMain_15914>() {
         public S2C_GreenTreeMain_15914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GreenTreeMain_15914(input, extensionRegistry);
         }
      };

      private S2C_GreenTreeMain_15914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GreenTreeMain_15914() {
         this.memoizedIsInitialized = -1;
         this.roundData_ = Collections.emptyList();
         this.gotId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GreenTreeMain_15914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GreenTreeMain_15914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.roundData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.roundData_.add(input.readMessage(KittyActivityMsg.GreenTreeRoundData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotId_.addInt(input.readInt32());
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
                  this.roundData_ = Collections.unmodifiableList(this.roundData_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.gotId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeMain_15914.class, Builder.class);
      }

      public List<GreenTreeRoundData> getRoundDataList() {
         return this.roundData_;
      }

      public List<? extends GreenTreeRoundDataOrBuilder> getRoundDataOrBuilderList() {
         return this.roundData_;
      }

      public int getRoundDataCount() {
         return this.roundData_.size();
      }

      public GreenTreeRoundData getRoundData(int index) {
         return (GreenTreeRoundData)this.roundData_.get(index);
      }

      public GreenTreeRoundDataOrBuilder getRoundDataOrBuilder(int index) {
         return (GreenTreeRoundDataOrBuilder)this.roundData_.get(index);
      }

      public List<Integer> getGotIdList() {
         return this.gotId_;
      }

      public int getGotIdCount() {
         return this.gotId_.size();
      }

      public int getGotId(int index) {
         return this.gotId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRoundDataCount(); ++i) {
               if (!this.getRoundData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.roundData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.roundData_.get(i));
         }

         for(int i = 0; i < this.gotId_.size(); ++i) {
            output.writeInt32(2, this.gotId_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.roundData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.roundData_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GreenTreeMain_15914)) {
            return super.equals(obj);
         } else {
            S2C_GreenTreeMain_15914 other = (S2C_GreenTreeMain_15914)obj;
            if (!this.getRoundDataList().equals(other.getRoundDataList())) {
               return false;
            } else if (!this.getGotIdList().equals(other.getGotIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRoundDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRoundDataList().hashCode();
            }

            if (this.getGotIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GreenTreeMain_15914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeMain_15914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeMain_15914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeMain_15914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeMain_15914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeMain_15914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GreenTreeMain_15914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GreenTreeMain_15914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GreenTreeMain_15914> parser() {
         return PARSER;
      }

      public Parser<S2C_GreenTreeMain_15914> getParserForType() {
         return PARSER;
      }

      public S2C_GreenTreeMain_15914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GreenTreeMain_15914OrBuilder {
         private int bitField0_;
         private List<GreenTreeRoundData> roundData_;
         private RepeatedFieldBuilderV3<GreenTreeRoundData, GreenTreeRoundData.Builder, GreenTreeRoundDataOrBuilder> roundDataBuilder_;
         private Internal.IntList gotId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeMain_15914.class, Builder.class);
         }

         private Builder() {
            this.roundData_ = Collections.emptyList();
            this.gotId_ = KittyActivityMsg.S2C_GreenTreeMain_15914.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.roundData_ = Collections.emptyList();
            this.gotId_ = KittyActivityMsg.S2C_GreenTreeMain_15914.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_GreenTreeMain_15914.alwaysUseFieldBuilders) {
               this.getRoundDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.roundDataBuilder_ == null) {
               this.roundData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.roundDataBuilder_.clear();
            }

            this.gotId_ = KittyActivityMsg.S2C_GreenTreeMain_15914.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeMain_15914_descriptor;
         }

         public S2C_GreenTreeMain_15914 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_GreenTreeMain_15914.getDefaultInstance();
         }

         public S2C_GreenTreeMain_15914 build() {
            S2C_GreenTreeMain_15914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GreenTreeMain_15914 buildPartial() {
            S2C_GreenTreeMain_15914 result = new S2C_GreenTreeMain_15914(this);
            int from_bitField0_ = this.bitField0_;
            if (this.roundDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.roundData_ = Collections.unmodifiableList(this.roundData_);
                  this.bitField0_ &= -2;
               }

               result.roundData_ = this.roundData_;
            } else {
               result.roundData_ = this.roundDataBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotId_ = this.gotId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_GreenTreeMain_15914) {
               return this.mergeFrom((S2C_GreenTreeMain_15914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GreenTreeMain_15914 other) {
            if (other == KittyActivityMsg.S2C_GreenTreeMain_15914.getDefaultInstance()) {
               return this;
            } else {
               if (this.roundDataBuilder_ == null) {
                  if (!other.roundData_.isEmpty()) {
                     if (this.roundData_.isEmpty()) {
                        this.roundData_ = other.roundData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRoundDataIsMutable();
                        this.roundData_.addAll(other.roundData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.roundData_.isEmpty()) {
                  if (this.roundDataBuilder_.isEmpty()) {
                     this.roundDataBuilder_.dispose();
                     this.roundDataBuilder_ = null;
                     this.roundData_ = other.roundData_;
                     this.bitField0_ &= -2;
                     this.roundDataBuilder_ = KittyActivityMsg.S2C_GreenTreeMain_15914.alwaysUseFieldBuilders ? this.getRoundDataFieldBuilder() : null;
                  } else {
                     this.roundDataBuilder_.addAllMessages(other.roundData_);
                  }
               }

               if (!other.gotId_.isEmpty()) {
                  if (this.gotId_.isEmpty()) {
                     this.gotId_ = other.gotId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotIdIsMutable();
                     this.gotId_.addAll(other.gotId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRoundDataCount(); ++i) {
               if (!this.getRoundData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GreenTreeMain_15914 parsedMessage = null;

            try {
               parsedMessage = (S2C_GreenTreeMain_15914)KittyActivityMsg.S2C_GreenTreeMain_15914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GreenTreeMain_15914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRoundDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.roundData_ = new ArrayList(this.roundData_);
               this.bitField0_ |= 1;
            }

         }

         public List<GreenTreeRoundData> getRoundDataList() {
            return this.roundDataBuilder_ == null ? Collections.unmodifiableList(this.roundData_) : this.roundDataBuilder_.getMessageList();
         }

         public int getRoundDataCount() {
            return this.roundDataBuilder_ == null ? this.roundData_.size() : this.roundDataBuilder_.getCount();
         }

         public GreenTreeRoundData getRoundData(int index) {
            return this.roundDataBuilder_ == null ? (GreenTreeRoundData)this.roundData_.get(index) : (GreenTreeRoundData)this.roundDataBuilder_.getMessage(index);
         }

         public Builder setRoundData(int index, GreenTreeRoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.set(index, value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRoundData(int index, GreenTreeRoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRoundData(GreenTreeRoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.add(value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRoundData(int index, GreenTreeRoundData value) {
            if (this.roundDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRoundDataIsMutable();
               this.roundData_.add(index, value);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRoundData(GreenTreeRoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRoundData(int index, GreenTreeRoundData.Builder builderForValue) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.roundDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRoundData(Iterable<? extends GreenTreeRoundData> values) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.roundData_);
               this.onChanged();
            } else {
               this.roundDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRoundData() {
            if (this.roundDataBuilder_ == null) {
               this.roundData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.roundDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRoundData(int index) {
            if (this.roundDataBuilder_ == null) {
               this.ensureRoundDataIsMutable();
               this.roundData_.remove(index);
               this.onChanged();
            } else {
               this.roundDataBuilder_.remove(index);
            }

            return this;
         }

         public GreenTreeRoundData.Builder getRoundDataBuilder(int index) {
            return (GreenTreeRoundData.Builder)this.getRoundDataFieldBuilder().getBuilder(index);
         }

         public GreenTreeRoundDataOrBuilder getRoundDataOrBuilder(int index) {
            return this.roundDataBuilder_ == null ? (GreenTreeRoundDataOrBuilder)this.roundData_.get(index) : (GreenTreeRoundDataOrBuilder)this.roundDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GreenTreeRoundDataOrBuilder> getRoundDataOrBuilderList() {
            return this.roundDataBuilder_ != null ? this.roundDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.roundData_);
         }

         public GreenTreeRoundData.Builder addRoundDataBuilder() {
            return (GreenTreeRoundData.Builder)this.getRoundDataFieldBuilder().addBuilder(KittyActivityMsg.GreenTreeRoundData.getDefaultInstance());
         }

         public GreenTreeRoundData.Builder addRoundDataBuilder(int index) {
            return (GreenTreeRoundData.Builder)this.getRoundDataFieldBuilder().addBuilder(index, KittyActivityMsg.GreenTreeRoundData.getDefaultInstance());
         }

         public List<GreenTreeRoundData.Builder> getRoundDataBuilderList() {
            return this.getRoundDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GreenTreeRoundData, GreenTreeRoundData.Builder, GreenTreeRoundDataOrBuilder> getRoundDataFieldBuilder() {
            if (this.roundDataBuilder_ == null) {
               this.roundDataBuilder_ = new RepeatedFieldBuilderV3(this.roundData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.roundData_ = null;
            }

            return this.roundDataBuilder_;
         }

         private void ensureGotIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotId_ = KittyActivityMsg.S2C_GreenTreeMain_15914.mutableCopy(this.gotId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotId_) : this.gotId_);
         }

         public int getGotIdCount() {
            return this.gotId_.size();
         }

         public int getGotId(int index) {
            return this.gotId_.getInt(index);
         }

         public Builder setGotId(int index, int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotId(int value) {
            this.ensureGotIdIsMutable();
            this.gotId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotId(Iterable<? extends Integer> values) {
            this.ensureGotIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotId_);
            this.onChanged();
            return this;
         }

         public Builder clearGotId() {
            this.gotId_ = KittyActivityMsg.S2C_GreenTreeMain_15914.emptyIntList();
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

   public static final class C2S_GreenTreeReward_15915 extends GeneratedMessageV3 implements C2S_GreenTreeReward_15915OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GreenTreeReward_15915 DEFAULT_INSTANCE = new C2S_GreenTreeReward_15915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GreenTreeReward_15915> PARSER = new AbstractParser<C2S_GreenTreeReward_15915>() {
         public C2S_GreenTreeReward_15915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GreenTreeReward_15915(input, extensionRegistry);
         }
      };

      private C2S_GreenTreeReward_15915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GreenTreeReward_15915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GreenTreeReward_15915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GreenTreeReward_15915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeReward_15915.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GreenTreeReward_15915)) {
            return super.equals(obj);
         } else {
            C2S_GreenTreeReward_15915 other = (C2S_GreenTreeReward_15915)obj;
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

      public static C2S_GreenTreeReward_15915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeReward_15915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeReward_15915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeReward_15915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeReward_15915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeReward_15915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GreenTreeReward_15915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GreenTreeReward_15915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GreenTreeReward_15915> parser() {
         return PARSER;
      }

      public Parser<C2S_GreenTreeReward_15915> getParserForType() {
         return PARSER;
      }

      public C2S_GreenTreeReward_15915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GreenTreeReward_15915OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeReward_15915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_GreenTreeReward_15915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeReward_15915_descriptor;
         }

         public C2S_GreenTreeReward_15915 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_GreenTreeReward_15915.getDefaultInstance();
         }

         public C2S_GreenTreeReward_15915 build() {
            C2S_GreenTreeReward_15915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GreenTreeReward_15915 buildPartial() {
            C2S_GreenTreeReward_15915 result = new C2S_GreenTreeReward_15915(this);
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
            if (other instanceof C2S_GreenTreeReward_15915) {
               return this.mergeFrom((C2S_GreenTreeReward_15915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GreenTreeReward_15915 other) {
            if (other == KittyActivityMsg.C2S_GreenTreeReward_15915.getDefaultInstance()) {
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
            C2S_GreenTreeReward_15915 parsedMessage = null;

            try {
               parsedMessage = (C2S_GreenTreeReward_15915)KittyActivityMsg.C2S_GreenTreeReward_15915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GreenTreeReward_15915)e.getUnfinishedMessage();
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

   public static final class S2C_GreenTreeReward_15916 extends GeneratedMessageV3 implements S2C_GreenTreeReward_15916OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_GreenTreeReward_15916 DEFAULT_INSTANCE = new S2C_GreenTreeReward_15916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GreenTreeReward_15916> PARSER = new AbstractParser<S2C_GreenTreeReward_15916>() {
         public S2C_GreenTreeReward_15916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GreenTreeReward_15916(input, extensionRegistry);
         }
      };

      private S2C_GreenTreeReward_15916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GreenTreeReward_15916() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GreenTreeReward_15916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GreenTreeReward_15916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeReward_15916.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GreenTreeReward_15916)) {
            return super.equals(obj);
         } else {
            S2C_GreenTreeReward_15916 other = (S2C_GreenTreeReward_15916)obj;
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

      public static S2C_GreenTreeReward_15916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeReward_15916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeReward_15916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeReward_15916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeReward_15916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeReward_15916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GreenTreeReward_15916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GreenTreeReward_15916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GreenTreeReward_15916> parser() {
         return PARSER;
      }

      public Parser<S2C_GreenTreeReward_15916> getParserForType() {
         return PARSER;
      }

      public S2C_GreenTreeReward_15916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GreenTreeReward_15916OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeReward_15916.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_GreenTreeReward_15916.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeReward_15916_descriptor;
         }

         public S2C_GreenTreeReward_15916 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_GreenTreeReward_15916.getDefaultInstance();
         }

         public S2C_GreenTreeReward_15916 build() {
            S2C_GreenTreeReward_15916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GreenTreeReward_15916 buildPartial() {
            S2C_GreenTreeReward_15916 result = new S2C_GreenTreeReward_15916(this);
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
            if (other instanceof S2C_GreenTreeReward_15916) {
               return this.mergeFrom((S2C_GreenTreeReward_15916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GreenTreeReward_15916 other) {
            if (other == KittyActivityMsg.S2C_GreenTreeReward_15916.getDefaultInstance()) {
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
            S2C_GreenTreeReward_15916 parsedMessage = null;

            try {
               parsedMessage = (S2C_GreenTreeReward_15916)KittyActivityMsg.S2C_GreenTreeReward_15916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GreenTreeReward_15916)e.getUnfinishedMessage();
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

   public static final class C2S_GreenTreeRoundReward_15917 extends GeneratedMessageV3 implements C2S_GreenTreeRoundReward_15917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      private byte memoizedIsInitialized;
      private static final C2S_GreenTreeRoundReward_15917 DEFAULT_INSTANCE = new C2S_GreenTreeRoundReward_15917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GreenTreeRoundReward_15917> PARSER = new AbstractParser<C2S_GreenTreeRoundReward_15917>() {
         public C2S_GreenTreeRoundReward_15917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GreenTreeRoundReward_15917(input, extensionRegistry);
         }
      };

      private C2S_GreenTreeRoundReward_15917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GreenTreeRoundReward_15917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GreenTreeRoundReward_15917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GreenTreeRoundReward_15917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.round_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeRoundReward_15917.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GreenTreeRoundReward_15917)) {
            return super.equals(obj);
         } else {
            C2S_GreenTreeRoundReward_15917 other = (C2S_GreenTreeRoundReward_15917)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GreenTreeRoundReward_15917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeRoundReward_15917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeRoundReward_15917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GreenTreeRoundReward_15917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GreenTreeRoundReward_15917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GreenTreeRoundReward_15917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GreenTreeRoundReward_15917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GreenTreeRoundReward_15917> parser() {
         return PARSER;
      }

      public Parser<C2S_GreenTreeRoundReward_15917> getParserForType() {
         return PARSER;
      }

      public C2S_GreenTreeRoundReward_15917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GreenTreeRoundReward_15917OrBuilder {
         private int bitField0_;
         private int round_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GreenTreeRoundReward_15917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_GreenTreeRoundReward_15917.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_GreenTreeRoundReward_15917_descriptor;
         }

         public C2S_GreenTreeRoundReward_15917 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_GreenTreeRoundReward_15917.getDefaultInstance();
         }

         public C2S_GreenTreeRoundReward_15917 build() {
            C2S_GreenTreeRoundReward_15917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GreenTreeRoundReward_15917 buildPartial() {
            C2S_GreenTreeRoundReward_15917 result = new C2S_GreenTreeRoundReward_15917(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
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
            if (other instanceof C2S_GreenTreeRoundReward_15917) {
               return this.mergeFrom((C2S_GreenTreeRoundReward_15917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GreenTreeRoundReward_15917 other) {
            if (other == KittyActivityMsg.C2S_GreenTreeRoundReward_15917.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GreenTreeRoundReward_15917 parsedMessage = null;

            try {
               parsedMessage = (C2S_GreenTreeRoundReward_15917)KittyActivityMsg.C2S_GreenTreeRoundReward_15917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GreenTreeRoundReward_15917)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
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

   public static final class S2C_GreenTreeRoundReward_15918 extends GeneratedMessageV3 implements S2C_GreenTreeRoundReward_15918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ROUND_FIELD_NUMBER = 1;
      private int round_;
      private byte memoizedIsInitialized;
      private static final S2C_GreenTreeRoundReward_15918 DEFAULT_INSTANCE = new S2C_GreenTreeRoundReward_15918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GreenTreeRoundReward_15918> PARSER = new AbstractParser<S2C_GreenTreeRoundReward_15918>() {
         public S2C_GreenTreeRoundReward_15918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GreenTreeRoundReward_15918(input, extensionRegistry);
         }
      };

      private S2C_GreenTreeRoundReward_15918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GreenTreeRoundReward_15918() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GreenTreeRoundReward_15918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GreenTreeRoundReward_15918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.round_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeRoundReward_15918.class, Builder.class);
      }

      public boolean hasRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRound() {
         return this.round_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.round_);
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
               size += CodedOutputStream.computeInt32Size(1, this.round_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GreenTreeRoundReward_15918)) {
            return super.equals(obj);
         } else {
            S2C_GreenTreeRoundReward_15918 other = (S2C_GreenTreeRoundReward_15918)obj;
            if (this.hasRound() != other.hasRound()) {
               return false;
            } else if (this.hasRound() && this.getRound() != other.getRound()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRound();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GreenTreeRoundReward_15918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeRoundReward_15918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeRoundReward_15918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GreenTreeRoundReward_15918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GreenTreeRoundReward_15918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GreenTreeRoundReward_15918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GreenTreeRoundReward_15918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GreenTreeRoundReward_15918> parser() {
         return PARSER;
      }

      public Parser<S2C_GreenTreeRoundReward_15918> getParserForType() {
         return PARSER;
      }

      public S2C_GreenTreeRoundReward_15918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GreenTreeRoundReward_15918OrBuilder {
         private int bitField0_;
         private int round_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GreenTreeRoundReward_15918.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_GreenTreeRoundReward_15918.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.round_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_GreenTreeRoundReward_15918_descriptor;
         }

         public S2C_GreenTreeRoundReward_15918 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_GreenTreeRoundReward_15918.getDefaultInstance();
         }

         public S2C_GreenTreeRoundReward_15918 build() {
            S2C_GreenTreeRoundReward_15918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GreenTreeRoundReward_15918 buildPartial() {
            S2C_GreenTreeRoundReward_15918 result = new S2C_GreenTreeRoundReward_15918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.round_ = this.round_;
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
            if (other instanceof S2C_GreenTreeRoundReward_15918) {
               return this.mergeFrom((S2C_GreenTreeRoundReward_15918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GreenTreeRoundReward_15918 other) {
            if (other == KittyActivityMsg.S2C_GreenTreeRoundReward_15918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRound()) {
                  this.setRound(other.getRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GreenTreeRoundReward_15918 parsedMessage = null;

            try {
               parsedMessage = (S2C_GreenTreeRoundReward_15918)KittyActivityMsg.S2C_GreenTreeRoundReward_15918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GreenTreeRoundReward_15918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRound() {
            return this.round_;
         }

         public Builder setRound(int value) {
            this.bitField0_ |= 1;
            this.round_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRound() {
            this.bitField0_ &= -2;
            this.round_ = 0;
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

   public static final class S2C_RainTreeProcess_15920 extends GeneratedMessageV3 implements S2C_RainTreeProcess_15920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PROCESS_FIELD_NUMBER = 1;
      private int process_;
      private byte memoizedIsInitialized;
      private static final S2C_RainTreeProcess_15920 DEFAULT_INSTANCE = new S2C_RainTreeProcess_15920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RainTreeProcess_15920> PARSER = new AbstractParser<S2C_RainTreeProcess_15920>() {
         public S2C_RainTreeProcess_15920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RainTreeProcess_15920(input, extensionRegistry);
         }
      };

      private S2C_RainTreeProcess_15920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RainTreeProcess_15920() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RainTreeProcess_15920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RainTreeProcess_15920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.process_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeProcess_15920.class, Builder.class);
      }

      public boolean hasProcess() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getProcess() {
         return this.process_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasProcess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.process_);
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
               size += CodedOutputStream.computeInt32Size(1, this.process_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RainTreeProcess_15920)) {
            return super.equals(obj);
         } else {
            S2C_RainTreeProcess_15920 other = (S2C_RainTreeProcess_15920)obj;
            if (this.hasProcess() != other.hasProcess()) {
               return false;
            } else if (this.hasProcess() && this.getProcess() != other.getProcess()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasProcess()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getProcess();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RainTreeProcess_15920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RainTreeProcess_15920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(InputStream input) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeProcess_15920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RainTreeProcess_15920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RainTreeProcess_15920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RainTreeProcess_15920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RainTreeProcess_15920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RainTreeProcess_15920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RainTreeProcess_15920> parser() {
         return PARSER;
      }

      public Parser<S2C_RainTreeProcess_15920> getParserForType() {
         return PARSER;
      }

      public S2C_RainTreeProcess_15920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RainTreeProcess_15920OrBuilder {
         private int bitField0_;
         private int process_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RainTreeProcess_15920.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_RainTreeProcess_15920.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.process_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_RainTreeProcess_15920_descriptor;
         }

         public S2C_RainTreeProcess_15920 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_RainTreeProcess_15920.getDefaultInstance();
         }

         public S2C_RainTreeProcess_15920 build() {
            S2C_RainTreeProcess_15920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RainTreeProcess_15920 buildPartial() {
            S2C_RainTreeProcess_15920 result = new S2C_RainTreeProcess_15920(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.process_ = this.process_;
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
            if (other instanceof S2C_RainTreeProcess_15920) {
               return this.mergeFrom((S2C_RainTreeProcess_15920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RainTreeProcess_15920 other) {
            if (other == KittyActivityMsg.S2C_RainTreeProcess_15920.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasProcess()) {
                  this.setProcess(other.getProcess());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasProcess();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RainTreeProcess_15920 parsedMessage = null;

            try {
               parsedMessage = (S2C_RainTreeProcess_15920)KittyActivityMsg.S2C_RainTreeProcess_15920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RainTreeProcess_15920)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasProcess() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getProcess() {
            return this.process_;
         }

         public Builder setProcess(int value) {
            this.bitField0_ |= 1;
            this.process_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProcess() {
            this.bitField0_ &= -2;
            this.process_ = 0;
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

   public static final class C2S_SpringEnjoyPrayMain_15921 extends GeneratedMessageV3 implements C2S_SpringEnjoyPrayMain_15921OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SpringEnjoyPrayMain_15921 DEFAULT_INSTANCE = new C2S_SpringEnjoyPrayMain_15921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SpringEnjoyPrayMain_15921> PARSER = new AbstractParser<C2S_SpringEnjoyPrayMain_15921>() {
         public C2S_SpringEnjoyPrayMain_15921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SpringEnjoyPrayMain_15921(input, extensionRegistry);
         }
      };

      private C2S_SpringEnjoyPrayMain_15921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SpringEnjoyPrayMain_15921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SpringEnjoyPrayMain_15921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SpringEnjoyPrayMain_15921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpringEnjoyPrayMain_15921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SpringEnjoyPrayMain_15921)) {
            return super.equals(obj);
         } else {
            C2S_SpringEnjoyPrayMain_15921 other = (C2S_SpringEnjoyPrayMain_15921)obj;
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

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPrayMain_15921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(InputStream input) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPrayMain_15921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPrayMain_15921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SpringEnjoyPrayMain_15921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SpringEnjoyPrayMain_15921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SpringEnjoyPrayMain_15921> parser() {
         return PARSER;
      }

      public Parser<C2S_SpringEnjoyPrayMain_15921> getParserForType() {
         return PARSER;
      }

      public C2S_SpringEnjoyPrayMain_15921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SpringEnjoyPrayMain_15921OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpringEnjoyPrayMain_15921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_SpringEnjoyPrayMain_15921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPrayMain_15921_descriptor;
         }

         public C2S_SpringEnjoyPrayMain_15921 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_SpringEnjoyPrayMain_15921.getDefaultInstance();
         }

         public C2S_SpringEnjoyPrayMain_15921 build() {
            C2S_SpringEnjoyPrayMain_15921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SpringEnjoyPrayMain_15921 buildPartial() {
            C2S_SpringEnjoyPrayMain_15921 result = new C2S_SpringEnjoyPrayMain_15921(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SpringEnjoyPrayMain_15921) {
               return this.mergeFrom((C2S_SpringEnjoyPrayMain_15921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SpringEnjoyPrayMain_15921 other) {
            if (other == KittyActivityMsg.C2S_SpringEnjoyPrayMain_15921.getDefaultInstance()) {
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
            C2S_SpringEnjoyPrayMain_15921 parsedMessage = null;

            try {
               parsedMessage = (C2S_SpringEnjoyPrayMain_15921)KittyActivityMsg.C2S_SpringEnjoyPrayMain_15921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SpringEnjoyPrayMain_15921)e.getUnfinishedMessage();
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

   public static final class S2C_SpringEnjoyPrayMain_15922 extends GeneratedMessageV3 implements S2C_SpringEnjoyPrayMain_15922OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      public static final int TASK_FIELD_NUMBER = 2;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_SpringEnjoyPrayMain_15922 DEFAULT_INSTANCE = new S2C_SpringEnjoyPrayMain_15922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpringEnjoyPrayMain_15922> PARSER = new AbstractParser<S2C_SpringEnjoyPrayMain_15922>() {
         public S2C_SpringEnjoyPrayMain_15922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpringEnjoyPrayMain_15922(input, extensionRegistry);
         }
      };

      private S2C_SpringEnjoyPrayMain_15922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpringEnjoyPrayMain_15922() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpringEnjoyPrayMain_15922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpringEnjoyPrayMain_15922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.id_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPrayMain_15922.class, Builder.class);
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
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.task_.get(i));
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpringEnjoyPrayMain_15922)) {
            return super.equals(obj);
         } else {
            S2C_SpringEnjoyPrayMain_15922 other = (S2C_SpringEnjoyPrayMain_15922)obj;
            if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayMain_15922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayMain_15922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayMain_15922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpringEnjoyPrayMain_15922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpringEnjoyPrayMain_15922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpringEnjoyPrayMain_15922> parser() {
         return PARSER;
      }

      public Parser<S2C_SpringEnjoyPrayMain_15922> getParserForType() {
         return PARSER;
      }

      public S2C_SpringEnjoyPrayMain_15922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpringEnjoyPrayMain_15922OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPrayMain_15922.class, Builder.class);
         }

         private Builder() {
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.emptyIntList();
            this.bitField0_ &= -2;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayMain_15922_descriptor;
         }

         public S2C_SpringEnjoyPrayMain_15922 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.getDefaultInstance();
         }

         public S2C_SpringEnjoyPrayMain_15922 build() {
            S2C_SpringEnjoyPrayMain_15922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpringEnjoyPrayMain_15922 buildPartial() {
            S2C_SpringEnjoyPrayMain_15922 result = new S2C_SpringEnjoyPrayMain_15922(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -3;
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
            if (other instanceof S2C_SpringEnjoyPrayMain_15922) {
               return this.mergeFrom((S2C_SpringEnjoyPrayMain_15922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpringEnjoyPrayMain_15922 other) {
            if (other == KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.taskBuilder_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_SpringEnjoyPrayMain_15922 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpringEnjoyPrayMain_15922)KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpringEnjoyPrayMain_15922)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_SpringEnjoyPray_15923 extends GeneratedMessageV3 implements C2S_SpringEnjoyPray_15923OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final C2S_SpringEnjoyPray_15923 DEFAULT_INSTANCE = new C2S_SpringEnjoyPray_15923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SpringEnjoyPray_15923> PARSER = new AbstractParser<C2S_SpringEnjoyPray_15923>() {
         public C2S_SpringEnjoyPray_15923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SpringEnjoyPray_15923(input, extensionRegistry);
         }
      };

      private C2S_SpringEnjoyPray_15923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SpringEnjoyPray_15923() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SpringEnjoyPray_15923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SpringEnjoyPray_15923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpringEnjoyPray_15923.class, Builder.class);
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
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SpringEnjoyPray_15923)) {
            return super.equals(obj);
         } else {
            C2S_SpringEnjoyPray_15923 other = (C2S_SpringEnjoyPray_15923)obj;
            if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpringEnjoyPray_15923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(InputStream input) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpringEnjoyPray_15923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPray_15923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpringEnjoyPray_15923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpringEnjoyPray_15923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SpringEnjoyPray_15923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SpringEnjoyPray_15923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SpringEnjoyPray_15923> parser() {
         return PARSER;
      }

      public Parser<C2S_SpringEnjoyPray_15923> getParserForType() {
         return PARSER;
      }

      public C2S_SpringEnjoyPray_15923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SpringEnjoyPray_15923OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpringEnjoyPray_15923.class, Builder.class);
         }

         private Builder() {
            this.id_ = KittyActivityMsg.C2S_SpringEnjoyPray_15923.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = KittyActivityMsg.C2S_SpringEnjoyPray_15923.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_SpringEnjoyPray_15923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = KittyActivityMsg.C2S_SpringEnjoyPray_15923.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_SpringEnjoyPray_15923_descriptor;
         }

         public C2S_SpringEnjoyPray_15923 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_SpringEnjoyPray_15923.getDefaultInstance();
         }

         public C2S_SpringEnjoyPray_15923 build() {
            C2S_SpringEnjoyPray_15923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SpringEnjoyPray_15923 buildPartial() {
            C2S_SpringEnjoyPray_15923 result = new C2S_SpringEnjoyPray_15923(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SpringEnjoyPray_15923) {
               return this.mergeFrom((C2S_SpringEnjoyPray_15923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SpringEnjoyPray_15923 other) {
            if (other == KittyActivityMsg.C2S_SpringEnjoyPray_15923.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
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
            C2S_SpringEnjoyPray_15923 parsedMessage = null;

            try {
               parsedMessage = (C2S_SpringEnjoyPray_15923)KittyActivityMsg.C2S_SpringEnjoyPray_15923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SpringEnjoyPray_15923)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = KittyActivityMsg.C2S_SpringEnjoyPray_15923.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = KittyActivityMsg.C2S_SpringEnjoyPray_15923.emptyIntList();
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

   public static final class S2C_SpringEnjoyPray_15924 extends GeneratedMessageV3 implements S2C_SpringEnjoyPray_15924OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final S2C_SpringEnjoyPray_15924 DEFAULT_INSTANCE = new S2C_SpringEnjoyPray_15924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpringEnjoyPray_15924> PARSER = new AbstractParser<S2C_SpringEnjoyPray_15924>() {
         public S2C_SpringEnjoyPray_15924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpringEnjoyPray_15924(input, extensionRegistry);
         }
      };

      private S2C_SpringEnjoyPray_15924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpringEnjoyPray_15924() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpringEnjoyPray_15924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpringEnjoyPray_15924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPray_15924.class, Builder.class);
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
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
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

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpringEnjoyPray_15924)) {
            return super.equals(obj);
         } else {
            S2C_SpringEnjoyPray_15924 other = (S2C_SpringEnjoyPray_15924)obj;
            if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPray_15924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPray_15924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPray_15924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPray_15924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPray_15924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpringEnjoyPray_15924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpringEnjoyPray_15924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpringEnjoyPray_15924> parser() {
         return PARSER;
      }

      public Parser<S2C_SpringEnjoyPray_15924> getParserForType() {
         return PARSER;
      }

      public S2C_SpringEnjoyPray_15924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpringEnjoyPray_15924OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPray_15924.class, Builder.class);
         }

         private Builder() {
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPray_15924.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPray_15924.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_SpringEnjoyPray_15924.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPray_15924.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPray_15924_descriptor;
         }

         public S2C_SpringEnjoyPray_15924 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_SpringEnjoyPray_15924.getDefaultInstance();
         }

         public S2C_SpringEnjoyPray_15924 build() {
            S2C_SpringEnjoyPray_15924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpringEnjoyPray_15924 buildPartial() {
            S2C_SpringEnjoyPray_15924 result = new S2C_SpringEnjoyPray_15924(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_SpringEnjoyPray_15924) {
               return this.mergeFrom((S2C_SpringEnjoyPray_15924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpringEnjoyPray_15924 other) {
            if (other == KittyActivityMsg.S2C_SpringEnjoyPray_15924.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
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
            S2C_SpringEnjoyPray_15924 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpringEnjoyPray_15924)KittyActivityMsg.S2C_SpringEnjoyPray_15924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpringEnjoyPray_15924)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = KittyActivityMsg.S2C_SpringEnjoyPray_15924.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = KittyActivityMsg.S2C_SpringEnjoyPray_15924.emptyIntList();
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

   public static final class S2C_SpringEnjoyPrayTaskNotify_15926 extends GeneratedMessageV3 implements S2C_SpringEnjoyPrayTaskNotify_15926OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_SpringEnjoyPrayTaskNotify_15926 DEFAULT_INSTANCE = new S2C_SpringEnjoyPrayTaskNotify_15926();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpringEnjoyPrayTaskNotify_15926> PARSER = new AbstractParser<S2C_SpringEnjoyPrayTaskNotify_15926>() {
         public S2C_SpringEnjoyPrayTaskNotify_15926 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpringEnjoyPrayTaskNotify_15926(input, extensionRegistry);
         }
      };

      private S2C_SpringEnjoyPrayTaskNotify_15926(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpringEnjoyPrayTaskNotify_15926() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpringEnjoyPrayTaskNotify_15926();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpringEnjoyPrayTaskNotify_15926(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPrayTaskNotify_15926.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SpringEnjoyPrayTaskNotify_15926)) {
            return super.equals(obj);
         } else {
            S2C_SpringEnjoyPrayTaskNotify_15926 other = (S2C_SpringEnjoyPrayTaskNotify_15926)obj;
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

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyPrayTaskNotify_15926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpringEnjoyPrayTaskNotify_15926 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpringEnjoyPrayTaskNotify_15926 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpringEnjoyPrayTaskNotify_15926> parser() {
         return PARSER;
      }

      public Parser<S2C_SpringEnjoyPrayTaskNotify_15926> getParserForType() {
         return PARSER;
      }

      public S2C_SpringEnjoyPrayTaskNotify_15926 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpringEnjoyPrayTaskNotify_15926OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyPrayTaskNotify_15926.class, Builder.class);
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
            if (KittyActivityMsg.S2C_SpringEnjoyPrayTaskNotify_15926.alwaysUseFieldBuilders) {
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
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyPrayTaskNotify_15926_descriptor;
         }

         public S2C_SpringEnjoyPrayTaskNotify_15926 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_SpringEnjoyPrayTaskNotify_15926.getDefaultInstance();
         }

         public S2C_SpringEnjoyPrayTaskNotify_15926 build() {
            S2C_SpringEnjoyPrayTaskNotify_15926 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpringEnjoyPrayTaskNotify_15926 buildPartial() {
            S2C_SpringEnjoyPrayTaskNotify_15926 result = new S2C_SpringEnjoyPrayTaskNotify_15926(this);
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
            if (other instanceof S2C_SpringEnjoyPrayTaskNotify_15926) {
               return this.mergeFrom((S2C_SpringEnjoyPrayTaskNotify_15926)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpringEnjoyPrayTaskNotify_15926 other) {
            if (other == KittyActivityMsg.S2C_SpringEnjoyPrayTaskNotify_15926.getDefaultInstance()) {
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
                     this.taskBuilder_ = KittyActivityMsg.S2C_SpringEnjoyPrayTaskNotify_15926.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_SpringEnjoyPrayTaskNotify_15926 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpringEnjoyPrayTaskNotify_15926)KittyActivityMsg.S2C_SpringEnjoyPrayTaskNotify_15926.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpringEnjoyPrayTaskNotify_15926)e.getUnfinishedMessage();
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

   public static final class S2C_SpringEnjoyMainNotify_15928 extends GeneratedMessageV3 implements S2C_SpringEnjoyMainNotify_15928OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENDTIME_FIELD_NUMBER = 1;
      private int endTime_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankMsg.RankData myRank_;
      public static final int RANK_FIELD_NUMBER = 3;
      private List<RankMsg.RankData> rank_;
      private byte memoizedIsInitialized;
      private static final S2C_SpringEnjoyMainNotify_15928 DEFAULT_INSTANCE = new S2C_SpringEnjoyMainNotify_15928();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpringEnjoyMainNotify_15928> PARSER = new AbstractParser<S2C_SpringEnjoyMainNotify_15928>() {
         public S2C_SpringEnjoyMainNotify_15928 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpringEnjoyMainNotify_15928(input, extensionRegistry);
         }
      };

      private S2C_SpringEnjoyMainNotify_15928(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpringEnjoyMainNotify_15928() {
         this.memoizedIsInitialized = -1;
         this.rank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpringEnjoyMainNotify_15928();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpringEnjoyMainNotify_15928(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.endTime_ = input.readInt32();
                        break;
                     case 18:
                        RankMsg.RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankMsg.RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rank_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rank_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rank_ = Collections.unmodifiableList(this.rank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyMainNotify_15928.class, Builder.class);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankMsg.RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public List<RankMsg.RankData> getRankList() {
         return this.rank_;
      }

      public List<? extends RankMsg.RankDataOrBuilder> getRankOrBuilderList() {
         return this.rank_;
      }

      public int getRankCount() {
         return this.rank_.size();
      }

      public RankMsg.RankData getRank(int index) {
         return (RankMsg.RankData)this.rank_.get(index);
      }

      public RankMsg.RankDataOrBuilder getRankOrBuilder(int index) {
         return (RankMsg.RankDataOrBuilder)this.rank_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMyRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
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
            output.writeInt32(1, this.endTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getMyRank());
         }

         for(int i = 0; i < this.rank_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.rank_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.endTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            for(int i = 0; i < this.rank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.rank_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpringEnjoyMainNotify_15928)) {
            return super.equals(obj);
         } else {
            S2C_SpringEnjoyMainNotify_15928 other = (S2C_SpringEnjoyMainNotify_15928)obj;
            if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (!this.getRankList().equals(other.getRankList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEndTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.getRankCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRankList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpringEnjoyMainNotify_15928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpringEnjoyMainNotify_15928 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpringEnjoyMainNotify_15928)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpringEnjoyMainNotify_15928 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpringEnjoyMainNotify_15928 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpringEnjoyMainNotify_15928> parser() {
         return PARSER;
      }

      public Parser<S2C_SpringEnjoyMainNotify_15928> getParserForType() {
         return PARSER;
      }

      public S2C_SpringEnjoyMainNotify_15928 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpringEnjoyMainNotify_15928OrBuilder {
         private int bitField0_;
         private int endTime_;
         private RankMsg.RankData myRank_;
         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> myRankBuilder_;
         private List<RankMsg.RankData> rank_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> rankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpringEnjoyMainNotify_15928.class, Builder.class);
         }

         private Builder() {
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.alwaysUseFieldBuilders) {
               this.getMyRankFieldBuilder();
               this.getRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.endTime_ = 0;
            this.bitField0_ &= -2;
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_SpringEnjoyMainNotify_15928_descriptor;
         }

         public S2C_SpringEnjoyMainNotify_15928 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.getDefaultInstance();
         }

         public S2C_SpringEnjoyMainNotify_15928 build() {
            S2C_SpringEnjoyMainNotify_15928 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpringEnjoyMainNotify_15928 buildPartial() {
            S2C_SpringEnjoyMainNotify_15928 result = new S2C_SpringEnjoyMainNotify_15928(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankMsg.RankData)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.rankBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.rank_ = Collections.unmodifiableList(this.rank_);
                  this.bitField0_ &= -5;
               }

               result.rank_ = this.rank_;
            } else {
               result.rank_ = this.rankBuilder_.build();
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
            if (other instanceof S2C_SpringEnjoyMainNotify_15928) {
               return this.mergeFrom((S2C_SpringEnjoyMainNotify_15928)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpringEnjoyMainNotify_15928 other) {
            if (other == KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (this.rankBuilder_ == null) {
                  if (!other.rank_.isEmpty()) {
                     if (this.rank_.isEmpty()) {
                        this.rank_ = other.rank_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRankIsMutable();
                        this.rank_.addAll(other.rank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rank_.isEmpty()) {
                  if (this.rankBuilder_.isEmpty()) {
                     this.rankBuilder_.dispose();
                     this.rankBuilder_ = null;
                     this.rank_ = other.rank_;
                     this.bitField0_ &= -5;
                     this.rankBuilder_ = KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.alwaysUseFieldBuilders ? this.getRankFieldBuilder() : null;
                  } else {
                     this.rankBuilder_.addAllMessages(other.rank_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasMyRank()) {
               return false;
            } else if (!this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankCount(); ++i) {
                  if (!this.getRank(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SpringEnjoyMainNotify_15928 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpringEnjoyMainNotify_15928)KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpringEnjoyMainNotify_15928)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 1;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankMsg.RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankMsg.RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMyRank(RankMsg.RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public RankMsg.RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankMsg.RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankMsg.RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         private void ensureRankIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rank_ = new ArrayList(this.rank_);
               this.bitField0_ |= 4;
            }

         }

         public List<RankMsg.RankData> getRankList() {
            return this.rankBuilder_ == null ? Collections.unmodifiableList(this.rank_) : this.rankBuilder_.getMessageList();
         }

         public int getRankCount() {
            return this.rankBuilder_ == null ? this.rank_.size() : this.rankBuilder_.getCount();
         }

         public RankMsg.RankData getRank(int index) {
            return this.rankBuilder_ == null ? (RankMsg.RankData)this.rank_.get(index) : (RankMsg.RankData)this.rankBuilder_.getMessage(index);
         }

         public Builder setRank(int index, RankMsg.RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.set(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRank(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRank(RankMsg.RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRank(int index, RankMsg.RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRank(RankMsg.RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRank(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRank(Iterable<? extends RankMsg.RankData> values) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rank_);
               this.onChanged();
            } else {
               this.rankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRank() {
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Builder removeRank(int index) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.remove(index);
               this.onChanged();
            } else {
               this.rankBuilder_.remove(index);
            }

            return this;
         }

         public RankMsg.RankData.Builder getRankBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRankFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankDataOrBuilder getRankOrBuilder(int index) {
            return this.rankBuilder_ == null ? (RankMsg.RankDataOrBuilder)this.rank_.get(index) : (RankMsg.RankDataOrBuilder)this.rankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankDataOrBuilder> getRankOrBuilderList() {
            return this.rankBuilder_ != null ? this.rankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rank_);
         }

         public RankMsg.RankData.Builder addRankBuilder() {
            return (RankMsg.RankData.Builder)this.getRankFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankMsg.RankData.Builder addRankBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRankFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankMsg.RankData.Builder> getRankBuilderList() {
            return this.getRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getRankFieldBuilder() {
            if (this.rankBuilder_ == null) {
               this.rankBuilder_ = new RepeatedFieldBuilderV3(this.rank_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.rank_ = null;
            }

            return this.rankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_IllustrationExchange_15929 extends GeneratedMessageV3 implements C2S_IllustrationExchange_15929OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ILLUSTRATIONID_FIELD_NUMBER = 1;
      private int illustrationId_;
      private byte memoizedIsInitialized;
      private static final C2S_IllustrationExchange_15929 DEFAULT_INSTANCE = new C2S_IllustrationExchange_15929();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IllustrationExchange_15929> PARSER = new AbstractParser<C2S_IllustrationExchange_15929>() {
         public C2S_IllustrationExchange_15929 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IllustrationExchange_15929(input, extensionRegistry);
         }
      };

      private C2S_IllustrationExchange_15929(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IllustrationExchange_15929() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IllustrationExchange_15929();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IllustrationExchange_15929(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.illustrationId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationExchange_15929.class, Builder.class);
      }

      public boolean hasIllustrationId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIllustrationId() {
         return this.illustrationId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIllustrationId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.illustrationId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.illustrationId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_IllustrationExchange_15929)) {
            return super.equals(obj);
         } else {
            C2S_IllustrationExchange_15929 other = (C2S_IllustrationExchange_15929)obj;
            if (this.hasIllustrationId() != other.hasIllustrationId()) {
               return false;
            } else if (this.hasIllustrationId() && this.getIllustrationId() != other.getIllustrationId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIllustrationId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIllustrationId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_IllustrationExchange_15929 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IllustrationExchange_15929)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(InputStream input) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationExchange_15929 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IllustrationExchange_15929 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IllustrationExchange_15929 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IllustrationExchange_15929)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IllustrationExchange_15929 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IllustrationExchange_15929 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IllustrationExchange_15929> parser() {
         return PARSER;
      }

      public Parser<C2S_IllustrationExchange_15929> getParserForType() {
         return PARSER;
      }

      public C2S_IllustrationExchange_15929 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IllustrationExchange_15929OrBuilder {
         private int bitField0_;
         private int illustrationId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IllustrationExchange_15929.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.C2S_IllustrationExchange_15929.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.illustrationId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_C2S_IllustrationExchange_15929_descriptor;
         }

         public C2S_IllustrationExchange_15929 getDefaultInstanceForType() {
            return KittyActivityMsg.C2S_IllustrationExchange_15929.getDefaultInstance();
         }

         public C2S_IllustrationExchange_15929 build() {
            C2S_IllustrationExchange_15929 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IllustrationExchange_15929 buildPartial() {
            C2S_IllustrationExchange_15929 result = new C2S_IllustrationExchange_15929(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.illustrationId_ = this.illustrationId_;
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
            if (other instanceof C2S_IllustrationExchange_15929) {
               return this.mergeFrom((C2S_IllustrationExchange_15929)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IllustrationExchange_15929 other) {
            if (other == KittyActivityMsg.C2S_IllustrationExchange_15929.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIllustrationId()) {
                  this.setIllustrationId(other.getIllustrationId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIllustrationId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_IllustrationExchange_15929 parsedMessage = null;

            try {
               parsedMessage = (C2S_IllustrationExchange_15929)KittyActivityMsg.C2S_IllustrationExchange_15929.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IllustrationExchange_15929)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIllustrationId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIllustrationId() {
            return this.illustrationId_;
         }

         public Builder setIllustrationId(int value) {
            this.bitField0_ |= 1;
            this.illustrationId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIllustrationId() {
            this.bitField0_ &= -2;
            this.illustrationId_ = 0;
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

   public static final class S2C_IllustrationExchange_15930 extends GeneratedMessageV3 implements S2C_IllustrationExchange_15930OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ILLUSTRATIONID_FIELD_NUMBER = 1;
      private int illustrationId_;
      private byte memoizedIsInitialized;
      private static final S2C_IllustrationExchange_15930 DEFAULT_INSTANCE = new S2C_IllustrationExchange_15930();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IllustrationExchange_15930> PARSER = new AbstractParser<S2C_IllustrationExchange_15930>() {
         public S2C_IllustrationExchange_15930 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IllustrationExchange_15930(input, extensionRegistry);
         }
      };

      private S2C_IllustrationExchange_15930(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IllustrationExchange_15930() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IllustrationExchange_15930();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IllustrationExchange_15930(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.illustrationId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationExchange_15930.class, Builder.class);
      }

      public boolean hasIllustrationId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIllustrationId() {
         return this.illustrationId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIllustrationId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.illustrationId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.illustrationId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_IllustrationExchange_15930)) {
            return super.equals(obj);
         } else {
            S2C_IllustrationExchange_15930 other = (S2C_IllustrationExchange_15930)obj;
            if (this.hasIllustrationId() != other.hasIllustrationId()) {
               return false;
            } else if (this.hasIllustrationId() && this.getIllustrationId() != other.getIllustrationId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIllustrationId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIllustrationId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_IllustrationExchange_15930 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IllustrationExchange_15930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(InputStream input) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationExchange_15930 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IllustrationExchange_15930 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IllustrationExchange_15930 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IllustrationExchange_15930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IllustrationExchange_15930 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IllustrationExchange_15930 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IllustrationExchange_15930> parser() {
         return PARSER;
      }

      public Parser<S2C_IllustrationExchange_15930> getParserForType() {
         return PARSER;
      }

      public S2C_IllustrationExchange_15930 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IllustrationExchange_15930OrBuilder {
         private int bitField0_;
         private int illustrationId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IllustrationExchange_15930.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (KittyActivityMsg.S2C_IllustrationExchange_15930.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.illustrationId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return KittyActivityMsg.internal_static_kittyActivity_com_gzbz_protobuf_S2C_IllustrationExchange_15930_descriptor;
         }

         public S2C_IllustrationExchange_15930 getDefaultInstanceForType() {
            return KittyActivityMsg.S2C_IllustrationExchange_15930.getDefaultInstance();
         }

         public S2C_IllustrationExchange_15930 build() {
            S2C_IllustrationExchange_15930 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IllustrationExchange_15930 buildPartial() {
            S2C_IllustrationExchange_15930 result = new S2C_IllustrationExchange_15930(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.illustrationId_ = this.illustrationId_;
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
            if (other instanceof S2C_IllustrationExchange_15930) {
               return this.mergeFrom((S2C_IllustrationExchange_15930)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IllustrationExchange_15930 other) {
            if (other == KittyActivityMsg.S2C_IllustrationExchange_15930.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIllustrationId()) {
                  this.setIllustrationId(other.getIllustrationId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIllustrationId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_IllustrationExchange_15930 parsedMessage = null;

            try {
               parsedMessage = (S2C_IllustrationExchange_15930)KittyActivityMsg.S2C_IllustrationExchange_15930.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IllustrationExchange_15930)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIllustrationId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIllustrationId() {
            return this.illustrationId_;
         }

         public Builder setIllustrationId(int value) {
            this.bitField0_ |= 1;
            this.illustrationId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIllustrationId() {
            this.bitField0_ &= -2;
            this.illustrationId_ = 0;
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

   public interface C2S_GreenTreeMain_15913OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GreenTreeReward_15915OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_GreenTreeRoundReward_15917OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();
   }

   public interface C2S_IllustrationExchange_15929OrBuilder extends MessageOrBuilder {
      boolean hasIllustrationId();

      int getIllustrationId();
   }

   public interface C2S_IllustrationMain_15901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_IllustrationTaskCommit_15903OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_RainTreeMain_15907OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RainTreeServerRank_15911OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RainTreeWater_15909OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface C2S_SpringEnjoyPrayMain_15921OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SpringEnjoyPray_15923OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface GreenTreeRoundDataOrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();

      boolean hasRoundReward();

      boolean getRoundReward();

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);
   }

   public interface IllustrationDataOrBuilder extends MessageOrBuilder {
      boolean hasIllustrationId();

      int getIllustrationId();

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface NumOnePlayerInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeadId();

      int getHeadId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface RainTreeRankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasServer();

      int getServer();

      boolean hasProcess();

      int getProcess();

      boolean hasNumOnePlayer();

      NumOnePlayerInfo getNumOnePlayer();

      NumOnePlayerInfoOrBuilder getNumOnePlayerOrBuilder();
   }

   public interface S2C_GreenTreeMain_15914OrBuilder extends MessageOrBuilder {
      List<GreenTreeRoundData> getRoundDataList();

      GreenTreeRoundData getRoundData(int index);

      int getRoundDataCount();

      List<? extends GreenTreeRoundDataOrBuilder> getRoundDataOrBuilderList();

      GreenTreeRoundDataOrBuilder getRoundDataOrBuilder(int index);

      List<Integer> getGotIdList();

      int getGotIdCount();

      int getGotId(int index);
   }

   public interface S2C_GreenTreeReward_15916OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_GreenTreeRoundReward_15918OrBuilder extends MessageOrBuilder {
      boolean hasRound();

      int getRound();
   }

   public interface S2C_IllustrationExchange_15930OrBuilder extends MessageOrBuilder {
      boolean hasIllustrationId();

      int getIllustrationId();
   }

   public interface S2C_IllustrationMain_15902OrBuilder extends MessageOrBuilder {
      boolean hasEndTime();

      int getEndTime();

      boolean hasDay();

      int getDay();

      List<IllustrationData> getIllustrationList();

      IllustrationData getIllustration(int index);

      int getIllustrationCount();

      List<? extends IllustrationDataOrBuilder> getIllustrationOrBuilderList();

      IllustrationDataOrBuilder getIllustrationOrBuilder(int index);
   }

   public interface S2C_IllustrationTaskCommit_15904OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_IllustrationTasksNotify_15906OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_RainTreeMain_15908OrBuilder extends MessageOrBuilder {
      boolean hasProcess();

      int getProcess();

      boolean hasFreeCount();

      int getFreeCount();

      boolean hasCycleCount();

      int getCycleCount();

      boolean hasPlanCount();

      int getPlanCount();
   }

   public interface S2C_RainTreeProcess_15920OrBuilder extends MessageOrBuilder {
      boolean hasProcess();

      int getProcess();
   }

   public interface S2C_RainTreeServerRank_15912OrBuilder extends MessageOrBuilder {
      List<RainTreeRankData> getRankDataList();

      RainTreeRankData getRankData(int index);

      int getRankDataCount();

      List<? extends RainTreeRankDataOrBuilder> getRankDataOrBuilderList();

      RainTreeRankDataOrBuilder getRankDataOrBuilder(int index);
   }

   public interface S2C_RainTreeWater_15910OrBuilder extends MessageOrBuilder {
      boolean hasFreeCount();

      int getFreeCount();

      boolean hasCycleCount();

      int getCycleCount();

      boolean hasProcess();

      int getProcess();

      boolean hasPlanCount();

      int getPlanCount();

      boolean hasCount();

      int getCount();
   }

   public interface S2C_SpringEnjoyMainNotify_15928OrBuilder extends MessageOrBuilder {
      boolean hasEndTime();

      int getEndTime();

      boolean hasMyRank();

      RankMsg.RankData getMyRank();

      RankMsg.RankDataOrBuilder getMyRankOrBuilder();

      List<RankMsg.RankData> getRankList();

      RankMsg.RankData getRank(int index);

      int getRankCount();

      List<? extends RankMsg.RankDataOrBuilder> getRankOrBuilderList();

      RankMsg.RankDataOrBuilder getRankOrBuilder(int index);
   }

   public interface S2C_SpringEnjoyPrayMain_15922OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_SpringEnjoyPrayTaskNotify_15926OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_SpringEnjoyPray_15924OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }
}
