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

public final class ActivitySiMaYiMsg {
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivitySiMaYiMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014ActivitySiMaYi.proto\u0012 activitySiMaYi.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0019\n\u0017C2S_HeroThemeInfo_18101\"ÿ\u0001\n\u0017S2C_HeroThemeInfo_18102\u0012\r\n\u0005fight\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bfightReward\u0018\u0003 \u0003(\u0005\u0012\u0012\n\ntotalPoint\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0005 \u0003(\u0005\u00122\n\u0004task\u0018\u0006 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0011\n\tstartTime\u0018\u0007 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\b \u0002(\u0005\u0012\u0015\n\rserverOpenDay\u0018\t \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\n \u0002(\u0005\"\u0010\n\u000eC2S_Mate_18103\"\u0081\u0001\n\u000eS2C_Mate_18104\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012,\n\barraying\u0018\u0002 \u0002(\u000b2\u001a.common.PlayerArrayingInfo\u0012\u0011\n\tmonarchId\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0006 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0007 \u0002(\u0005\"#\n\u0015C2S_PointReward_18107\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0015S2C_PointReward_18108\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_MatchBattle_18111\"b\n\u0015S2C_MatchBattle_18112\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0004 \u0002(\u0003\u0012\u0012\n\ntotalPoint\u0018\u0005 \u0002(\u0005\"*\n\u0018C2S_TaskCommitTask_18113\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_TaskCommitTask_18114\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"J\n\u0014S2C_TaskModify_18116\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0014\n\u0012C2S_LootInfo_18121\"K\n\u0012S2C_LootInfo_18122\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\"#\n\u0014C2S_LootReward_18123\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"N\n\u0014S2C_LootReward_18124\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadEnjoy\u0018\u0003 \u0002(\b\"!\n\u0013C2S_LootEnjoy_18125\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_18126\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u001f\n\u001dC2S_AccumulateTotalInfo_18131\"Í\u0001\n\u001dS2C_AccumulateTotalInfo_18132\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012Z\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b29.activitySiMaYi.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\"5\n!C2S_ReceiveAccumulateReward_18133\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u001a\n\u0018C2S_CumulativeInfo_18135\"E\n\u0018S2C_CumulativeInfo_18136\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\"1\n\u001dC2S_GetCumulativeReward_18137\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005B(\n\u0011com.gzbz.protobufB\u0011ActivitySiMaYiMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor, new String[]{"Fight", "TotalDamage", "FightReward", "TotalPoint", "PointReward", "Task", "StartTime", "EndTime", "ServerOpenDay", "ActivityDay"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor, new String[]{"Power", "Arraying", "MonarchId", "PlayerName", "Sex"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor, new String[]{"Id"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor, new String[]{"Id"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor, new String[]{"Damage", "FightNum", "TotalDamage", "TotalPoint"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor, new String[]{"TaskId"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor, new String[]{"TaskId"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor, new String[]{"Task"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor, new String[]{"EnjoyId", "RewardId", "CurLootNum"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor, new String[]{"Num"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor, new String[]{"RewardId", "CurLootNum", "HadEnjoy"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor, new String[]{"Id"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor, new String[]{"Id"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor, new String[]{"RewardId"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor, new String[0]);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor, new String[]{"GotRewards", "StageRecharge"});
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor, new String[]{"RewardId"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_HeroThemeInfo_18101 extends GeneratedMessageV3 implements C2S_HeroThemeInfo_18101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroThemeInfo_18101 DEFAULT_INSTANCE = new C2S_HeroThemeInfo_18101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroThemeInfo_18101> PARSER = new AbstractParser<C2S_HeroThemeInfo_18101>() {
         public C2S_HeroThemeInfo_18101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroThemeInfo_18101(input, extensionRegistry);
         }
      };

      private C2S_HeroThemeInfo_18101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroThemeInfo_18101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroThemeInfo_18101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroThemeInfo_18101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_18101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroThemeInfo_18101)) {
            return super.equals(obj);
         } else {
            C2S_HeroThemeInfo_18101 other = (C2S_HeroThemeInfo_18101)obj;
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

      public static C2S_HeroThemeInfo_18101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_18101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_18101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_18101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_18101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_18101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroThemeInfo_18101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroThemeInfo_18101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroThemeInfo_18101> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroThemeInfo_18101> getParserForType() {
         return PARSER;
      }

      public C2S_HeroThemeInfo_18101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroThemeInfo_18101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_18101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_HeroThemeInfo_18101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_HeroThemeInfo_18101_descriptor;
         }

         public C2S_HeroThemeInfo_18101 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_HeroThemeInfo_18101.getDefaultInstance();
         }

         public C2S_HeroThemeInfo_18101 build() {
            C2S_HeroThemeInfo_18101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroThemeInfo_18101 buildPartial() {
            C2S_HeroThemeInfo_18101 result = new C2S_HeroThemeInfo_18101(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroThemeInfo_18101) {
               return this.mergeFrom((C2S_HeroThemeInfo_18101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroThemeInfo_18101 other) {
            if (other == ActivitySiMaYiMsg.C2S_HeroThemeInfo_18101.getDefaultInstance()) {
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
            C2S_HeroThemeInfo_18101 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroThemeInfo_18101)ActivitySiMaYiMsg.C2S_HeroThemeInfo_18101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroThemeInfo_18101)e.getUnfinishedMessage();
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

   public static final class S2C_HeroThemeInfo_18102 extends GeneratedMessageV3 implements S2C_HeroThemeInfo_18102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHT_FIELD_NUMBER = 1;
      private int fight_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 2;
      private long totalDamage_;
      public static final int FIGHTREWARD_FIELD_NUMBER = 3;
      private Internal.IntList fightReward_;
      public static final int TOTALPOINT_FIELD_NUMBER = 4;
      private int totalPoint_;
      public static final int POINTREWARD_FIELD_NUMBER = 5;
      private Internal.IntList pointReward_;
      public static final int TASK_FIELD_NUMBER = 6;
      private List<ActivityMsg.TaskData> task_;
      public static final int STARTTIME_FIELD_NUMBER = 7;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 8;
      private int endTime_;
      public static final int SERVEROPENDAY_FIELD_NUMBER = 9;
      private int serverOpenDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 10;
      private int activityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroThemeInfo_18102 DEFAULT_INSTANCE = new S2C_HeroThemeInfo_18102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroThemeInfo_18102> PARSER = new AbstractParser<S2C_HeroThemeInfo_18102>() {
         public S2C_HeroThemeInfo_18102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroThemeInfo_18102(input, extensionRegistry);
         }
      };

      private S2C_HeroThemeInfo_18102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroThemeInfo_18102() {
         this.memoizedIsInitialized = -1;
         this.fightReward_ = emptyIntList();
         this.pointReward_ = emptyIntList();
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroThemeInfo_18102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroThemeInfo_18102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.fight_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalDamage_ = input.readInt64();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.fightReward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.fightReward_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalPoint_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pointReward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.endTime_ = input.readInt32();
                        continue;
                     case 72:
                        this.bitField0_ |= 32;
                        this.serverOpenDay_ = input.readInt32();
                        continue;
                     case 80:
                        this.bitField0_ |= 64;
                        this.activityDay_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.fightReward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.fightReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.pointReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_18102.class, Builder.class);
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFight() {
         return this.fight_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public List<Integer> getFightRewardList() {
         return this.fightReward_;
      }

      public int getFightRewardCount() {
         return this.fightReward_.size();
      }

      public int getFightReward(int index) {
         return this.fightReward_.getInt(index);
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
      }

      public List<Integer> getPointRewardList() {
         return this.pointReward_;
      }

      public int getPointRewardCount() {
         return this.pointReward_.size();
      }

      public int getPointReward(int index) {
         return this.pointReward_.getInt(index);
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

      public boolean hasStartTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasServerOpenDay() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getServerOpenDay() {
         return this.serverOpenDay_;
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityDay()) {
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
            output.writeInt32(1, this.fight_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.totalDamage_);
         }

         for(int i = 0; i < this.fightReward_.size(); ++i) {
            output.writeInt32(3, this.fightReward_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.totalPoint_);
         }

         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(5, this.pointReward_.getInt(i));
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.task_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.endTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(9, this.serverOpenDay_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(10, this.activityDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fight_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.totalDamage_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.fightReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.fightReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFightRewardList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalPoint_);
            }

            dataSize = 0;

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.task_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.endTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.serverOpenDay_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.activityDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroThemeInfo_18102)) {
            return super.equals(obj);
         } else {
            S2C_HeroThemeInfo_18102 other = (S2C_HeroThemeInfo_18102)obj;
            if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (!this.getFightRewardList().equals(other.getFightRewardList())) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
               return false;
            } else if (!this.getPointRewardList().equals(other.getPointRewardList())) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasServerOpenDay() != other.hasServerOpenDay()) {
               return false;
            } else if (this.hasServerOpenDay() && this.getServerOpenDay() != other.getServerOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFight();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.getFightRewardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightRewardList().hashCode();
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalPoint();
            }

            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasServerOpenDay()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServerOpenDay();
            }

            if (this.hasActivityDay()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getActivityDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_18102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_18102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_18102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_18102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_18102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroThemeInfo_18102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroThemeInfo_18102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroThemeInfo_18102> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroThemeInfo_18102> getParserForType() {
         return PARSER;
      }

      public S2C_HeroThemeInfo_18102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroThemeInfo_18102OrBuilder {
         private int bitField0_;
         private int fight_;
         private long totalDamage_;
         private Internal.IntList fightReward_;
         private int totalPoint_;
         private Internal.IntList pointReward_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;
         private int startTime_;
         private int endTime_;
         private int serverOpenDay_;
         private int activityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_18102.class, Builder.class);
         }

         private Builder() {
            this.fightReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.pointReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.pointReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fight_ = 0;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.fightReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            this.pointReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.bitField0_ &= -17;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.taskBuilder_.clear();
            }

            this.startTime_ = 0;
            this.bitField0_ &= -65;
            this.endTime_ = 0;
            this.bitField0_ &= -129;
            this.serverOpenDay_ = 0;
            this.bitField0_ &= -257;
            this.activityDay_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_HeroThemeInfo_18102_descriptor;
         }

         public S2C_HeroThemeInfo_18102 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.getDefaultInstance();
         }

         public S2C_HeroThemeInfo_18102 build() {
            S2C_HeroThemeInfo_18102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroThemeInfo_18102 buildPartial() {
            S2C_HeroThemeInfo_18102 result = new S2C_HeroThemeInfo_18102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.fightReward_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.fightReward_ = this.fightReward_;
            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.pointReward_ = this.pointReward_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -33;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.serverOpenDay_ = this.serverOpenDay_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.activityDay_ = this.activityDay_;
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
            if (other instanceof S2C_HeroThemeInfo_18102) {
               return this.mergeFrom((S2C_HeroThemeInfo_18102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroThemeInfo_18102 other) {
            if (other == ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (!other.fightReward_.isEmpty()) {
                  if (this.fightReward_.isEmpty()) {
                     this.fightReward_ = other.fightReward_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureFightRewardIsMutable();
                     this.fightReward_.addAll(other.fightReward_);
                  }

                  this.onChanged();
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
                  }

                  this.onChanged();
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -33;
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
                     this.bitField0_ &= -33;
                     this.taskBuilder_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasServerOpenDay()) {
                  this.setServerOpenDay(other.getServerOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFight()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else if (!this.hasTotalPoint()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasServerOpenDay()) {
               return false;
            } else if (!this.hasActivityDay()) {
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
            S2C_HeroThemeInfo_18102 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroThemeInfo_18102)ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroThemeInfo_18102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFight() {
            return this.fight_;
         }

         public Builder setFight(int value) {
            this.bitField0_ |= 1;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -2;
            this.fight_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 2;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureFightRewardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.fightReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.mutableCopy(this.fightReward_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getFightRewardList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.fightReward_) : this.fightReward_);
         }

         public int getFightRewardCount() {
            return this.fightReward_.size();
         }

         public int getFightReward(int index) {
            return this.fightReward_.getInt(index);
         }

         public Builder setFightReward(int index, int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFightReward(int value) {
            this.ensureFightRewardIsMutable();
            this.fightReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFightReward(Iterable<? extends Integer> values) {
            this.ensureFightRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fightReward_);
            this.onChanged();
            return this;
         }

         public Builder clearFightReward() {
            this.fightReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.pointReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.mutableCopy(this.pointReward_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
         }

         public int getPointRewardCount() {
            return this.pointReward_.size();
         }

         public int getPointReward(int index) {
            return this.pointReward_.getInt(index);
         }

         public Builder setPointReward(int index, int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPointReward(int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPointReward(Iterable<? extends Integer> values) {
            this.ensurePointRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pointReward_);
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.pointReward_ = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 32;
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
               this.bitField0_ &= -33;
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
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 64;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -65;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 128;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -129;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerOpenDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getServerOpenDay() {
            return this.serverOpenDay_;
         }

         public Builder setServerOpenDay(int value) {
            this.bitField0_ |= 256;
            this.serverOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerOpenDay() {
            this.bitField0_ &= -257;
            this.serverOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 512;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -513;
            this.activityDay_ = 0;
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

   public static final class C2S_Mate_18103 extends GeneratedMessageV3 implements C2S_Mate_18103OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Mate_18103 DEFAULT_INSTANCE = new C2S_Mate_18103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Mate_18103> PARSER = new AbstractParser<C2S_Mate_18103>() {
         public C2S_Mate_18103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Mate_18103(input, extensionRegistry);
         }
      };

      private C2S_Mate_18103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Mate_18103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Mate_18103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Mate_18103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_18103.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Mate_18103)) {
            return super.equals(obj);
         } else {
            C2S_Mate_18103 other = (C2S_Mate_18103)obj;
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

      public static C2S_Mate_18103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data);
      }

      public static C2S_Mate_18103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_18103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data);
      }

      public static C2S_Mate_18103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_18103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data);
      }

      public static C2S_Mate_18103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_18103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_18103 parseFrom(InputStream input) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_18103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_18103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Mate_18103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_18103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_18103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_18103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Mate_18103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Mate_18103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Mate_18103> parser() {
         return PARSER;
      }

      public Parser<C2S_Mate_18103> getParserForType() {
         return PARSER;
      }

      public C2S_Mate_18103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Mate_18103OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_18103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_Mate_18103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_Mate_18103_descriptor;
         }

         public C2S_Mate_18103 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_Mate_18103.getDefaultInstance();
         }

         public C2S_Mate_18103 build() {
            C2S_Mate_18103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Mate_18103 buildPartial() {
            C2S_Mate_18103 result = new C2S_Mate_18103(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Mate_18103) {
               return this.mergeFrom((C2S_Mate_18103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Mate_18103 other) {
            if (other == ActivitySiMaYiMsg.C2S_Mate_18103.getDefaultInstance()) {
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
            C2S_Mate_18103 parsedMessage = null;

            try {
               parsedMessage = (C2S_Mate_18103)ActivitySiMaYiMsg.C2S_Mate_18103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Mate_18103)e.getUnfinishedMessage();
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

   public static final class S2C_Mate_18104 extends GeneratedMessageV3 implements S2C_Mate_18104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      public static final int ARRAYING_FIELD_NUMBER = 2;
      private CommonMsg.PlayerArrayingInfo arraying_;
      public static final int MONARCHID_FIELD_NUMBER = 5;
      private int monarchId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 6;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 7;
      private int sex_;
      private byte memoizedIsInitialized;
      private static final S2C_Mate_18104 DEFAULT_INSTANCE = new S2C_Mate_18104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Mate_18104> PARSER = new AbstractParser<S2C_Mate_18104>() {
         public S2C_Mate_18104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Mate_18104(input, extensionRegistry);
         }
      };

      private S2C_Mate_18104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Mate_18104() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Mate_18104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Mate_18104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.power_ = input.readInt64();
                        break;
                     case 18:
                        CommonMsg.PlayerArrayingInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.arraying_.toBuilder();
                        }

                        this.arraying_ = (CommonMsg.PlayerArrayingInfo)input.readMessage(CommonMsg.PlayerArrayingInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.arraying_);
                           this.arraying_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.sex_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_18104.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerArrayingInfo getArraying() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
         return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 8) != 0;
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

      public boolean hasSex() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMonarchId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getArraying().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getArraying());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.monarchId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.sex_);
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
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getArraying());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.monarchId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.sex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Mate_18104)) {
            return super.equals(obj);
         } else {
            S2C_Mate_18104 other = (S2C_Mate_18104)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && !this.getArraying().equals(other.getArraying())) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArraying().hashCode();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Mate_18104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data);
      }

      public static S2C_Mate_18104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_18104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data);
      }

      public static S2C_Mate_18104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_18104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data);
      }

      public static S2C_Mate_18104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_18104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_18104 parseFrom(InputStream input) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_18104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_18104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Mate_18104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_18104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_18104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_18104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Mate_18104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Mate_18104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Mate_18104> parser() {
         return PARSER;
      }

      public Parser<S2C_Mate_18104> getParserForType() {
         return PARSER;
      }

      public S2C_Mate_18104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Mate_18104OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PlayerArrayingInfo arraying_;
         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> arrayingBuilder_;
         private int monarchId_;
         private Object playerName_;
         private int sex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_18104.class, Builder.class);
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
            if (ActivitySiMaYiMsg.S2C_Mate_18104.alwaysUseFieldBuilders) {
               this.getArrayingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.monarchId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_Mate_18104_descriptor;
         }

         public S2C_Mate_18104 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_Mate_18104.getDefaultInstance();
         }

         public S2C_Mate_18104 build() {
            S2C_Mate_18104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Mate_18104 buildPartial() {
            S2C_Mate_18104 result = new S2C_Mate_18104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.arrayingBuilder_ == null) {
                  result.arraying_ = this.arraying_;
               } else {
                  result.arraying_ = (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.sex_ = this.sex_;
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
            if (other instanceof S2C_Mate_18104) {
               return this.mergeFrom((S2C_Mate_18104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Mate_18104 other) {
            if (other == ActivitySiMaYiMsg.S2C_Mate_18104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasArraying()) {
                  this.mergeArraying(other.getArraying());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPower()) {
               return false;
            } else if (!this.hasArraying()) {
               return false;
            } else if (!this.hasMonarchId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasSex()) {
               return false;
            } else {
               return this.getArraying().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Mate_18104 parsedMessage = null;

            try {
               parsedMessage = (S2C_Mate_18104)ActivitySiMaYiMsg.S2C_Mate_18104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Mate_18104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasArraying() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerArrayingInfo getArraying() {
            if (this.arrayingBuilder_ == null) {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            } else {
               return (CommonMsg.PlayerArrayingInfo)this.arrayingBuilder_.getMessage();
            }
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.arraying_ = value;
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setArraying(CommonMsg.PlayerArrayingInfo.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = builderForValue.build();
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeArraying(CommonMsg.PlayerArrayingInfo value) {
            if (this.arrayingBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.arraying_ != null && this.arraying_ != CommonMsg.PlayerArrayingInfo.getDefaultInstance()) {
                  this.arraying_ = CommonMsg.PlayerArrayingInfo.newBuilder(this.arraying_).mergeFrom(value).buildPartial();
               } else {
                  this.arraying_ = value;
               }

               this.onChanged();
            } else {
               this.arrayingBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearArraying() {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = null;
               this.onChanged();
            } else {
               this.arrayingBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerArrayingInfo.Builder getArrayingBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerArrayingInfo.Builder)this.getArrayingFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder() {
            if (this.arrayingBuilder_ != null) {
               return (CommonMsg.PlayerArrayingInfoOrBuilder)this.arrayingBuilder_.getMessageOrBuilder();
            } else {
               return this.arraying_ == null ? CommonMsg.PlayerArrayingInfo.getDefaultInstance() : this.arraying_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> getArrayingFieldBuilder() {
            if (this.arrayingBuilder_ == null) {
               this.arrayingBuilder_ = new SingleFieldBuilderV3(this.getArraying(), this.getParentForChildren(), this.isClean());
               this.arraying_ = null;
            }

            return this.arrayingBuilder_;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 4;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -5;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -9;
            this.playerName_ = ActivitySiMaYiMsg.S2C_Mate_18104.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSex() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 16;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -17;
            this.sex_ = 0;
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

   public static final class C2S_PointReward_18107 extends GeneratedMessageV3 implements C2S_PointReward_18107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PointReward_18107 DEFAULT_INSTANCE = new C2S_PointReward_18107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointReward_18107> PARSER = new AbstractParser<C2S_PointReward_18107>() {
         public C2S_PointReward_18107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointReward_18107(input, extensionRegistry);
         }
      };

      private C2S_PointReward_18107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointReward_18107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointReward_18107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointReward_18107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_18107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointReward_18107)) {
            return super.equals(obj);
         } else {
            C2S_PointReward_18107 other = (C2S_PointReward_18107)obj;
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

      public static C2S_PointReward_18107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_18107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_18107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_18107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_18107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_18107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_18107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_18107 parseFrom(InputStream input) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_18107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_18107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointReward_18107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_18107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_18107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_18107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointReward_18107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointReward_18107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointReward_18107> parser() {
         return PARSER;
      }

      public Parser<C2S_PointReward_18107> getParserForType() {
         return PARSER;
      }

      public C2S_PointReward_18107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointReward_18107OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_18107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_PointReward_18107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_PointReward_18107_descriptor;
         }

         public C2S_PointReward_18107 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_PointReward_18107.getDefaultInstance();
         }

         public C2S_PointReward_18107 build() {
            C2S_PointReward_18107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointReward_18107 buildPartial() {
            C2S_PointReward_18107 result = new C2S_PointReward_18107(this);
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
            if (other instanceof C2S_PointReward_18107) {
               return this.mergeFrom((C2S_PointReward_18107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointReward_18107 other) {
            if (other == ActivitySiMaYiMsg.C2S_PointReward_18107.getDefaultInstance()) {
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
            C2S_PointReward_18107 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointReward_18107)ActivitySiMaYiMsg.C2S_PointReward_18107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointReward_18107)e.getUnfinishedMessage();
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

   public static final class S2C_PointReward_18108 extends GeneratedMessageV3 implements S2C_PointReward_18108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PointReward_18108 DEFAULT_INSTANCE = new S2C_PointReward_18108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointReward_18108> PARSER = new AbstractParser<S2C_PointReward_18108>() {
         public S2C_PointReward_18108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointReward_18108(input, extensionRegistry);
         }
      };

      private S2C_PointReward_18108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointReward_18108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointReward_18108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointReward_18108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_18108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PointReward_18108)) {
            return super.equals(obj);
         } else {
            S2C_PointReward_18108 other = (S2C_PointReward_18108)obj;
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

      public static S2C_PointReward_18108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_18108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_18108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_18108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_18108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_18108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_18108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_18108 parseFrom(InputStream input) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_18108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_18108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointReward_18108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_18108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_18108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_18108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointReward_18108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointReward_18108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointReward_18108> parser() {
         return PARSER;
      }

      public Parser<S2C_PointReward_18108> getParserForType() {
         return PARSER;
      }

      public S2C_PointReward_18108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointReward_18108OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_18108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_PointReward_18108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_PointReward_18108_descriptor;
         }

         public S2C_PointReward_18108 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_PointReward_18108.getDefaultInstance();
         }

         public S2C_PointReward_18108 build() {
            S2C_PointReward_18108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointReward_18108 buildPartial() {
            S2C_PointReward_18108 result = new S2C_PointReward_18108(this);
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
            if (other instanceof S2C_PointReward_18108) {
               return this.mergeFrom((S2C_PointReward_18108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointReward_18108 other) {
            if (other == ActivitySiMaYiMsg.S2C_PointReward_18108.getDefaultInstance()) {
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
            S2C_PointReward_18108 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointReward_18108)ActivitySiMaYiMsg.S2C_PointReward_18108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointReward_18108)e.getUnfinishedMessage();
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

   public static final class C2S_MatchBattle_18111 extends GeneratedMessageV3 implements C2S_MatchBattle_18111OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MatchBattle_18111 DEFAULT_INSTANCE = new C2S_MatchBattle_18111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchBattle_18111> PARSER = new AbstractParser<C2S_MatchBattle_18111>() {
         public C2S_MatchBattle_18111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchBattle_18111(input, extensionRegistry);
         }
      };

      private C2S_MatchBattle_18111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchBattle_18111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchBattle_18111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchBattle_18111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_18111.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchBattle_18111)) {
            return super.equals(obj);
         } else {
            C2S_MatchBattle_18111 other = (C2S_MatchBattle_18111)obj;
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

      public static C2S_MatchBattle_18111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_18111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_18111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_18111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_18111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_18111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_18111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_18111 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_18111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_18111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_18111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_18111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_18111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_18111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchBattle_18111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchBattle_18111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchBattle_18111> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchBattle_18111> getParserForType() {
         return PARSER;
      }

      public C2S_MatchBattle_18111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchBattle_18111OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_18111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_MatchBattle_18111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_MatchBattle_18111_descriptor;
         }

         public C2S_MatchBattle_18111 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_MatchBattle_18111.getDefaultInstance();
         }

         public C2S_MatchBattle_18111 build() {
            C2S_MatchBattle_18111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchBattle_18111 buildPartial() {
            C2S_MatchBattle_18111 result = new C2S_MatchBattle_18111(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MatchBattle_18111) {
               return this.mergeFrom((C2S_MatchBattle_18111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchBattle_18111 other) {
            if (other == ActivitySiMaYiMsg.C2S_MatchBattle_18111.getDefaultInstance()) {
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
            C2S_MatchBattle_18111 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchBattle_18111)ActivitySiMaYiMsg.C2S_MatchBattle_18111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchBattle_18111)e.getUnfinishedMessage();
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

   public static final class S2C_MatchBattle_18112 extends GeneratedMessageV3 implements S2C_MatchBattle_18112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAMAGE_FIELD_NUMBER = 2;
      private long damage_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int TOTALDAMAGE_FIELD_NUMBER = 4;
      private long totalDamage_;
      public static final int TOTALPOINT_FIELD_NUMBER = 5;
      private int totalPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_MatchBattle_18112 DEFAULT_INSTANCE = new S2C_MatchBattle_18112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchBattle_18112> PARSER = new AbstractParser<S2C_MatchBattle_18112>() {
         public S2C_MatchBattle_18112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchBattle_18112(input, extensionRegistry);
         }
      };

      private S2C_MatchBattle_18112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchBattle_18112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchBattle_18112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchBattle_18112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.bitField0_ |= 1;
                        this.damage_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.totalDamage_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.totalPoint_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_18112.class, Builder.class);
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasTotalDamage() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getTotalDamage() {
         return this.totalDamage_;
      }

      public boolean hasTotalPoint() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalPoint() {
         return this.totalPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.damage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.totalDamage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.totalPoint_);
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
               size += CodedOutputStream.computeInt64Size(2, this.damage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.totalDamage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.totalPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MatchBattle_18112)) {
            return super.equals(obj);
         } else {
            S2C_MatchBattle_18112 other = (S2C_MatchBattle_18112)obj;
            if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasTotalDamage() != other.hasTotalDamage()) {
               return false;
            } else if (this.hasTotalDamage() && this.getTotalDamage() != other.getTotalDamage()) {
               return false;
            } else if (this.hasTotalPoint() != other.hasTotalPoint()) {
               return false;
            } else if (this.hasTotalPoint() && this.getTotalPoint() != other.getTotalPoint()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasDamage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasTotalDamage()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getTotalDamage());
            }

            if (this.hasTotalPoint()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTotalPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MatchBattle_18112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_18112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_18112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_18112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_18112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_18112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_18112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_18112 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_18112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_18112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_18112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_18112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_18112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_18112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchBattle_18112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchBattle_18112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchBattle_18112> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchBattle_18112> getParserForType() {
         return PARSER;
      }

      public S2C_MatchBattle_18112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchBattle_18112OrBuilder {
         private int bitField0_;
         private long damage_;
         private int fightNum_;
         private long totalDamage_;
         private int totalPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_18112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_MatchBattle_18112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.damage_ = 0L;
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.bitField0_ &= -3;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_MatchBattle_18112_descriptor;
         }

         public S2C_MatchBattle_18112 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_MatchBattle_18112.getDefaultInstance();
         }

         public S2C_MatchBattle_18112 build() {
            S2C_MatchBattle_18112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchBattle_18112 buildPartial() {
            S2C_MatchBattle_18112 result = new S2C_MatchBattle_18112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalDamage_ = this.totalDamage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalPoint_ = this.totalPoint_;
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
            if (other instanceof S2C_MatchBattle_18112) {
               return this.mergeFrom((S2C_MatchBattle_18112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchBattle_18112 other) {
            if (other == ActivitySiMaYiMsg.S2C_MatchBattle_18112.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasTotalDamage()) {
                  this.setTotalDamage(other.getTotalDamage());
               }

               if (other.hasTotalPoint()) {
                  this.setTotalPoint(other.getTotalPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDamage()) {
               return false;
            } else if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasTotalDamage()) {
               return false;
            } else {
               return this.hasTotalPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MatchBattle_18112 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchBattle_18112)ActivitySiMaYiMsg.S2C_MatchBattle_18112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchBattle_18112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 1;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -2;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 2;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalDamage() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getTotalDamage() {
            return this.totalDamage_;
         }

         public Builder setTotalDamage(long value) {
            this.bitField0_ |= 4;
            this.totalDamage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalDamage() {
            this.bitField0_ &= -5;
            this.totalDamage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasTotalPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalPoint() {
            return this.totalPoint_;
         }

         public Builder setTotalPoint(int value) {
            this.bitField0_ |= 8;
            this.totalPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalPoint() {
            this.bitField0_ &= -9;
            this.totalPoint_ = 0;
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

   public static final class C2S_TaskCommitTask_18113 extends GeneratedMessageV3 implements C2S_TaskCommitTask_18113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskCommitTask_18113 DEFAULT_INSTANCE = new C2S_TaskCommitTask_18113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskCommitTask_18113> PARSER = new AbstractParser<C2S_TaskCommitTask_18113>() {
         public C2S_TaskCommitTask_18113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskCommitTask_18113(input, extensionRegistry);
         }
      };

      private C2S_TaskCommitTask_18113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskCommitTask_18113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskCommitTask_18113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskCommitTask_18113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommitTask_18113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskCommitTask_18113)) {
            return super.equals(obj);
         } else {
            C2S_TaskCommitTask_18113 other = (C2S_TaskCommitTask_18113)obj;
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

      public static C2S_TaskCommitTask_18113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_18113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommitTask_18113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_18113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_18113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_18113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskCommitTask_18113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskCommitTask_18113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskCommitTask_18113> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskCommitTask_18113> getParserForType() {
         return PARSER;
      }

      public C2S_TaskCommitTask_18113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskCommitTask_18113OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommitTask_18113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_TaskCommitTask_18113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_TaskCommitTask_18113_descriptor;
         }

         public C2S_TaskCommitTask_18113 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_TaskCommitTask_18113.getDefaultInstance();
         }

         public C2S_TaskCommitTask_18113 build() {
            C2S_TaskCommitTask_18113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskCommitTask_18113 buildPartial() {
            C2S_TaskCommitTask_18113 result = new C2S_TaskCommitTask_18113(this);
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
            if (other instanceof C2S_TaskCommitTask_18113) {
               return this.mergeFrom((C2S_TaskCommitTask_18113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskCommitTask_18113 other) {
            if (other == ActivitySiMaYiMsg.C2S_TaskCommitTask_18113.getDefaultInstance()) {
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
            C2S_TaskCommitTask_18113 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskCommitTask_18113)ActivitySiMaYiMsg.C2S_TaskCommitTask_18113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskCommitTask_18113)e.getUnfinishedMessage();
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

   public static final class S2C_TaskCommitTask_18114 extends GeneratedMessageV3 implements S2C_TaskCommitTask_18114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskCommitTask_18114 DEFAULT_INSTANCE = new S2C_TaskCommitTask_18114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskCommitTask_18114> PARSER = new AbstractParser<S2C_TaskCommitTask_18114>() {
         public S2C_TaskCommitTask_18114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskCommitTask_18114(input, extensionRegistry);
         }
      };

      private S2C_TaskCommitTask_18114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskCommitTask_18114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskCommitTask_18114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskCommitTask_18114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommitTask_18114.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskCommitTask_18114)) {
            return super.equals(obj);
         } else {
            S2C_TaskCommitTask_18114 other = (S2C_TaskCommitTask_18114)obj;
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

      public static S2C_TaskCommitTask_18114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_18114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommitTask_18114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_18114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_18114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_18114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskCommitTask_18114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskCommitTask_18114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskCommitTask_18114> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskCommitTask_18114> getParserForType() {
         return PARSER;
      }

      public S2C_TaskCommitTask_18114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskCommitTask_18114OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommitTask_18114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_TaskCommitTask_18114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskCommitTask_18114_descriptor;
         }

         public S2C_TaskCommitTask_18114 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_TaskCommitTask_18114.getDefaultInstance();
         }

         public S2C_TaskCommitTask_18114 build() {
            S2C_TaskCommitTask_18114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskCommitTask_18114 buildPartial() {
            S2C_TaskCommitTask_18114 result = new S2C_TaskCommitTask_18114(this);
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
            if (other instanceof S2C_TaskCommitTask_18114) {
               return this.mergeFrom((S2C_TaskCommitTask_18114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskCommitTask_18114 other) {
            if (other == ActivitySiMaYiMsg.S2C_TaskCommitTask_18114.getDefaultInstance()) {
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
            S2C_TaskCommitTask_18114 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskCommitTask_18114)ActivitySiMaYiMsg.S2C_TaskCommitTask_18114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskCommitTask_18114)e.getUnfinishedMessage();
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

   public static final class S2C_TaskModify_18116 extends GeneratedMessageV3 implements S2C_TaskModify_18116OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskModify_18116 DEFAULT_INSTANCE = new S2C_TaskModify_18116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskModify_18116> PARSER = new AbstractParser<S2C_TaskModify_18116>() {
         public S2C_TaskModify_18116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskModify_18116(input, extensionRegistry);
         }
      };

      private S2C_TaskModify_18116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskModify_18116() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskModify_18116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskModify_18116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_18116.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskModify_18116)) {
            return super.equals(obj);
         } else {
            S2C_TaskModify_18116 other = (S2C_TaskModify_18116)obj;
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

      public static S2C_TaskModify_18116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_18116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_18116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_18116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_18116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_18116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_18116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_18116 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_18116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_18116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_18116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_18116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_18116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_18116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskModify_18116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskModify_18116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskModify_18116> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskModify_18116> getParserForType() {
         return PARSER;
      }

      public S2C_TaskModify_18116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskModify_18116OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_18116.class, Builder.class);
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
            if (ActivitySiMaYiMsg.S2C_TaskModify_18116.alwaysUseFieldBuilders) {
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
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_TaskModify_18116_descriptor;
         }

         public S2C_TaskModify_18116 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_TaskModify_18116.getDefaultInstance();
         }

         public S2C_TaskModify_18116 build() {
            S2C_TaskModify_18116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskModify_18116 buildPartial() {
            S2C_TaskModify_18116 result = new S2C_TaskModify_18116(this);
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
            if (other instanceof S2C_TaskModify_18116) {
               return this.mergeFrom((S2C_TaskModify_18116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskModify_18116 other) {
            if (other == ActivitySiMaYiMsg.S2C_TaskModify_18116.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivitySiMaYiMsg.S2C_TaskModify_18116.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_TaskModify_18116 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskModify_18116)ActivitySiMaYiMsg.S2C_TaskModify_18116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskModify_18116)e.getUnfinishedMessage();
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

   public static final class C2S_LootInfo_18121 extends GeneratedMessageV3 implements C2S_LootInfo_18121OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_18121 DEFAULT_INSTANCE = new C2S_LootInfo_18121();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_18121> PARSER = new AbstractParser<C2S_LootInfo_18121>() {
         public C2S_LootInfo_18121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_18121(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_18121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_18121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_18121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_18121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_18121.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_18121)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_18121 other = (C2S_LootInfo_18121)obj;
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

      public static C2S_LootInfo_18121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_18121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_18121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_18121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_18121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_18121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_18121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_18121 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_18121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_18121 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_18121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_18121 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_18121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_18121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_18121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_18121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_18121> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_18121> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_18121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_18121OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_18121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_LootInfo_18121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootInfo_18121_descriptor;
         }

         public C2S_LootInfo_18121 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_LootInfo_18121.getDefaultInstance();
         }

         public C2S_LootInfo_18121 build() {
            C2S_LootInfo_18121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_18121 buildPartial() {
            C2S_LootInfo_18121 result = new C2S_LootInfo_18121(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_18121) {
               return this.mergeFrom((C2S_LootInfo_18121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_18121 other) {
            if (other == ActivitySiMaYiMsg.C2S_LootInfo_18121.getDefaultInstance()) {
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
            C2S_LootInfo_18121 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_18121)ActivitySiMaYiMsg.C2S_LootInfo_18121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_18121)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_18122 extends GeneratedMessageV3 implements S2C_LootInfo_18122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOYID_FIELD_NUMBER = 1;
      private int enjoyId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootInfo_18122 DEFAULT_INSTANCE = new S2C_LootInfo_18122();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_18122> PARSER = new AbstractParser<S2C_LootInfo_18122>() {
         public S2C_LootInfo_18122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_18122(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_18122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_18122() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_18122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_18122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.enjoyId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.curLootNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_18122.class, Builder.class);
      }

      public boolean hasEnjoyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnjoyId() {
         return this.enjoyId_;
      }

      public List<Integer> getRewardIdList() {
         return this.rewardId_;
      }

      public int getRewardIdCount() {
         return this.rewardId_.size();
      }

      public int getRewardId(int index) {
         return this.rewardId_.getInt(index);
      }

      public boolean hasCurLootNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurLootNum() {
         return this.curLootNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnjoyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurLootNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enjoyId_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(2, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.curLootNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enjoyId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.curLootNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootInfo_18122)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_18122 other = (S2C_LootInfo_18122)obj;
            if (this.hasEnjoyId() != other.hasEnjoyId()) {
               return false;
            } else if (this.hasEnjoyId() && this.getEnjoyId() != other.getEnjoyId()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasCurLootNum() != other.hasCurLootNum()) {
               return false;
            } else if (this.hasCurLootNum() && this.getCurLootNum() != other.getCurLootNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEnjoyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnjoyId();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasCurLootNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCurLootNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootInfo_18122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_18122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_18122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_18122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_18122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_18122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_18122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_18122 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_18122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_18122 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_18122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_18122 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_18122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_18122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_18122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_18122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_18122> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_18122> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_18122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_18122OrBuilder {
         private int bitField0_;
         private int enjoyId_;
         private Internal.IntList rewardId_;
         private int curLootNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_18122.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootInfo_18122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootInfo_18122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_LootInfo_18122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootInfo_18122.emptyIntList();
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootInfo_18122_descriptor;
         }

         public S2C_LootInfo_18122 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_LootInfo_18122.getDefaultInstance();
         }

         public S2C_LootInfo_18122 build() {
            S2C_LootInfo_18122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_18122 buildPartial() {
            S2C_LootInfo_18122 result = new S2C_LootInfo_18122(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enjoyId_ = this.enjoyId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 4) != 0) {
               result.curLootNum_ = this.curLootNum_;
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
            if (other instanceof S2C_LootInfo_18122) {
               return this.mergeFrom((S2C_LootInfo_18122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_18122 other) {
            if (other == ActivitySiMaYiMsg.S2C_LootInfo_18122.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnjoyId()) {
                  this.setEnjoyId(other.getEnjoyId());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasCurLootNum()) {
                  this.setCurLootNum(other.getCurLootNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEnjoyId()) {
               return false;
            } else {
               return this.hasCurLootNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootInfo_18122 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_18122)ActivitySiMaYiMsg.S2C_LootInfo_18122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_18122)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnjoyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnjoyId() {
            return this.enjoyId_;
         }

         public Builder setEnjoyId(int value) {
            this.bitField0_ |= 1;
            this.enjoyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnjoyId() {
            this.bitField0_ &= -2;
            this.enjoyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardId_ = ActivitySiMaYiMsg.S2C_LootInfo_18122.mutableCopy(this.rewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
         }

         public int getRewardIdCount() {
            return this.rewardId_.size();
         }

         public int getRewardId(int index) {
            return this.rewardId_.getInt(index);
         }

         public Builder setRewardId(int index, int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardId(int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardId(Iterable<? extends Integer> values) {
            this.ensureRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootInfo_18122.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasCurLootNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCurLootNum() {
            return this.curLootNum_;
         }

         public Builder setCurLootNum(int value) {
            this.bitField0_ |= 4;
            this.curLootNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurLootNum() {
            this.bitField0_ &= -5;
            this.curLootNum_ = 0;
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

   public static final class C2S_LootReward_18123 extends GeneratedMessageV3 implements C2S_LootReward_18123OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_18123 DEFAULT_INSTANCE = new C2S_LootReward_18123();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_18123> PARSER = new AbstractParser<C2S_LootReward_18123>() {
         public C2S_LootReward_18123 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_18123(input, extensionRegistry);
         }
      };

      private C2S_LootReward_18123(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_18123() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_18123();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_18123(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_18123.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_18123)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_18123 other = (C2S_LootReward_18123)obj;
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

      public static C2S_LootReward_18123 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_18123 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_18123 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_18123 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_18123 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_18123 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_18123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_18123 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_18123 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_18123 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_18123 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_18123 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_18123 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_18123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_18123 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_18123 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_18123> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_18123> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_18123 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_18123OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_18123.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_LootReward_18123.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootReward_18123_descriptor;
         }

         public C2S_LootReward_18123 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_LootReward_18123.getDefaultInstance();
         }

         public C2S_LootReward_18123 build() {
            C2S_LootReward_18123 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_18123 buildPartial() {
            C2S_LootReward_18123 result = new C2S_LootReward_18123(this);
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
            if (other instanceof C2S_LootReward_18123) {
               return this.mergeFrom((C2S_LootReward_18123)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_18123 other) {
            if (other == ActivitySiMaYiMsg.C2S_LootReward_18123.getDefaultInstance()) {
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
            C2S_LootReward_18123 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_18123)ActivitySiMaYiMsg.C2S_LootReward_18123.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_18123)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_18124 extends GeneratedMessageV3 implements S2C_LootReward_18124OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 2;
      private int curLootNum_;
      public static final int HADENJOY_FIELD_NUMBER = 3;
      private boolean hadEnjoy_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_18124 DEFAULT_INSTANCE = new S2C_LootReward_18124();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_18124> PARSER = new AbstractParser<S2C_LootReward_18124>() {
         public S2C_LootReward_18124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_18124(input, extensionRegistry);
         }
      };

      private S2C_LootReward_18124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_18124() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_18124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_18124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.curLootNum_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.hadEnjoy_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_18124.class, Builder.class);
      }

      public List<Integer> getRewardIdList() {
         return this.rewardId_;
      }

      public int getRewardIdCount() {
         return this.rewardId_.size();
      }

      public int getRewardId(int index) {
         return this.rewardId_.getInt(index);
      }

      public boolean hasCurLootNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurLootNum() {
         return this.curLootNum_;
      }

      public boolean hasHadEnjoy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getHadEnjoy() {
         return this.hadEnjoy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurLootNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHadEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(1, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.curLootNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.hadEnjoy_);
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

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.curLootNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.hadEnjoy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootReward_18124)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_18124 other = (S2C_LootReward_18124)obj;
            if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasCurLootNum() != other.hasCurLootNum()) {
               return false;
            } else if (this.hasCurLootNum() && this.getCurLootNum() != other.getCurLootNum()) {
               return false;
            } else if (this.hasHadEnjoy() != other.hasHadEnjoy()) {
               return false;
            } else if (this.hasHadEnjoy() && this.getHadEnjoy() != other.getHadEnjoy()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasCurLootNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurLootNum();
            }

            if (this.hasHadEnjoy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getHadEnjoy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootReward_18124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_18124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_18124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_18124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_18124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_18124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_18124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_18124 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_18124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_18124 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_18124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_18124 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_18124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_18124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_18124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_18124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_18124> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_18124> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_18124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_18124OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private boolean hadEnjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_18124.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootReward_18124.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootReward_18124.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_LootReward_18124.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootReward_18124.emptyIntList();
            this.bitField0_ &= -2;
            this.curLootNum_ = 0;
            this.bitField0_ &= -3;
            this.hadEnjoy_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootReward_18124_descriptor;
         }

         public S2C_LootReward_18124 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_LootReward_18124.getDefaultInstance();
         }

         public S2C_LootReward_18124 build() {
            S2C_LootReward_18124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_18124 buildPartial() {
            S2C_LootReward_18124 result = new S2C_LootReward_18124(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 2) != 0) {
               result.curLootNum_ = this.curLootNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hadEnjoy_ = this.hadEnjoy_;
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
            if (other instanceof S2C_LootReward_18124) {
               return this.mergeFrom((S2C_LootReward_18124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_18124 other) {
            if (other == ActivitySiMaYiMsg.S2C_LootReward_18124.getDefaultInstance()) {
               return this;
            } else {
               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasCurLootNum()) {
                  this.setCurLootNum(other.getCurLootNum());
               }

               if (other.hasHadEnjoy()) {
                  this.setHadEnjoy(other.getHadEnjoy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCurLootNum()) {
               return false;
            } else {
               return this.hasHadEnjoy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootReward_18124 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_18124)ActivitySiMaYiMsg.S2C_LootReward_18124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_18124)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewardId_ = ActivitySiMaYiMsg.S2C_LootReward_18124.mutableCopy(this.rewardId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
         }

         public int getRewardIdCount() {
            return this.rewardId_.size();
         }

         public int getRewardId(int index) {
            return this.rewardId_.getInt(index);
         }

         public Builder setRewardId(int index, int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardId(int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardId(Iterable<? extends Integer> values) {
            this.ensureRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.rewardId_ = ActivitySiMaYiMsg.S2C_LootReward_18124.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasCurLootNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCurLootNum() {
            return this.curLootNum_;
         }

         public Builder setCurLootNum(int value) {
            this.bitField0_ |= 2;
            this.curLootNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurLootNum() {
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHadEnjoy() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getHadEnjoy() {
            return this.hadEnjoy_;
         }

         public Builder setHadEnjoy(boolean value) {
            this.bitField0_ |= 4;
            this.hadEnjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHadEnjoy() {
            this.bitField0_ &= -5;
            this.hadEnjoy_ = false;
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

   public static final class C2S_LootEnjoy_18125 extends GeneratedMessageV3 implements C2S_LootEnjoy_18125OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_18125 DEFAULT_INSTANCE = new C2S_LootEnjoy_18125();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_18125> PARSER = new AbstractParser<C2S_LootEnjoy_18125>() {
         public C2S_LootEnjoy_18125 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_18125(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_18125(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_18125() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_18125();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_18125(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_18125.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_18125)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_18125 other = (C2S_LootEnjoy_18125)obj;
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

      public static C2S_LootEnjoy_18125 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_18125 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_18125 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_18125 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_18125 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_18125 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_18125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_18125 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_18125 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_18125 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_18125 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_18125 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_18125 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_18125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_18125 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_18125 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_18125> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_18125> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_18125 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_18125OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_18125.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_LootEnjoy_18125.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_LootEnjoy_18125_descriptor;
         }

         public C2S_LootEnjoy_18125 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_LootEnjoy_18125.getDefaultInstance();
         }

         public C2S_LootEnjoy_18125 build() {
            C2S_LootEnjoy_18125 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_18125 buildPartial() {
            C2S_LootEnjoy_18125 result = new C2S_LootEnjoy_18125(this);
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
            if (other instanceof C2S_LootEnjoy_18125) {
               return this.mergeFrom((C2S_LootEnjoy_18125)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_18125 other) {
            if (other == ActivitySiMaYiMsg.C2S_LootEnjoy_18125.getDefaultInstance()) {
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
            C2S_LootEnjoy_18125 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_18125)ActivitySiMaYiMsg.C2S_LootEnjoy_18125.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_18125)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_18126 extends GeneratedMessageV3 implements S2C_LootEnjoy_18126OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_18126 DEFAULT_INSTANCE = new S2C_LootEnjoy_18126();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_18126> PARSER = new AbstractParser<S2C_LootEnjoy_18126>() {
         public S2C_LootEnjoy_18126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_18126(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_18126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_18126() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_18126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_18126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_18126.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_18126)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_18126 other = (S2C_LootEnjoy_18126)obj;
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

      public static S2C_LootEnjoy_18126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_18126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_18126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_18126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_18126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_18126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_18126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_18126 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_18126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_18126 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_18126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_18126 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_18126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_18126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_18126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_18126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_18126> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_18126> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_18126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_18126OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_18126.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_LootEnjoy_18126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_LootEnjoy_18126_descriptor;
         }

         public S2C_LootEnjoy_18126 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_LootEnjoy_18126.getDefaultInstance();
         }

         public S2C_LootEnjoy_18126 build() {
            S2C_LootEnjoy_18126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_18126 buildPartial() {
            S2C_LootEnjoy_18126 result = new S2C_LootEnjoy_18126(this);
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
            if (other instanceof S2C_LootEnjoy_18126) {
               return this.mergeFrom((S2C_LootEnjoy_18126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_18126 other) {
            if (other == ActivitySiMaYiMsg.S2C_LootEnjoy_18126.getDefaultInstance()) {
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
            S2C_LootEnjoy_18126 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_18126)ActivitySiMaYiMsg.S2C_LootEnjoy_18126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_18126)e.getUnfinishedMessage();
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

   public static final class C2S_AccumulateTotalInfo_18131 extends GeneratedMessageV3 implements C2S_AccumulateTotalInfo_18131OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AccumulateTotalInfo_18131 DEFAULT_INSTANCE = new C2S_AccumulateTotalInfo_18131();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AccumulateTotalInfo_18131> PARSER = new AbstractParser<C2S_AccumulateTotalInfo_18131>() {
         public C2S_AccumulateTotalInfo_18131 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AccumulateTotalInfo_18131(input, extensionRegistry);
         }
      };

      private C2S_AccumulateTotalInfo_18131(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AccumulateTotalInfo_18131() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AccumulateTotalInfo_18131();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AccumulateTotalInfo_18131(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccumulateTotalInfo_18131.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AccumulateTotalInfo_18131)) {
            return super.equals(obj);
         } else {
            C2S_AccumulateTotalInfo_18131 other = (C2S_AccumulateTotalInfo_18131)obj;
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

      public static C2S_AccumulateTotalInfo_18131 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_18131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(InputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_18131 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_18131 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_18131 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_18131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AccumulateTotalInfo_18131 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AccumulateTotalInfo_18131 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AccumulateTotalInfo_18131> parser() {
         return PARSER;
      }

      public Parser<C2S_AccumulateTotalInfo_18131> getParserForType() {
         return PARSER;
      }

      public C2S_AccumulateTotalInfo_18131 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AccumulateTotalInfo_18131OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccumulateTotalInfo_18131.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_AccumulateTotalInfo_18131.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_AccumulateTotalInfo_18131_descriptor;
         }

         public C2S_AccumulateTotalInfo_18131 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_AccumulateTotalInfo_18131.getDefaultInstance();
         }

         public C2S_AccumulateTotalInfo_18131 build() {
            C2S_AccumulateTotalInfo_18131 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AccumulateTotalInfo_18131 buildPartial() {
            C2S_AccumulateTotalInfo_18131 result = new C2S_AccumulateTotalInfo_18131(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AccumulateTotalInfo_18131) {
               return this.mergeFrom((C2S_AccumulateTotalInfo_18131)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AccumulateTotalInfo_18131 other) {
            if (other == ActivitySiMaYiMsg.C2S_AccumulateTotalInfo_18131.getDefaultInstance()) {
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
            C2S_AccumulateTotalInfo_18131 parsedMessage = null;

            try {
               parsedMessage = (C2S_AccumulateTotalInfo_18131)ActivitySiMaYiMsg.C2S_AccumulateTotalInfo_18131.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AccumulateTotalInfo_18131)e.getUnfinishedMessage();
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

   public static final class S2C_AccumulateTotalInfo_18132 extends GeneratedMessageV3 implements S2C_AccumulateTotalInfo_18132OrBuilder {
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
      private static final S2C_AccumulateTotalInfo_18132 DEFAULT_INSTANCE = new S2C_AccumulateTotalInfo_18132();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AccumulateTotalInfo_18132> PARSER = new AbstractParser<S2C_AccumulateTotalInfo_18132>() {
         public S2C_AccumulateTotalInfo_18132 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AccumulateTotalInfo_18132(input, extensionRegistry);
         }
      };

      private S2C_AccumulateTotalInfo_18132(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AccumulateTotalInfo_18132() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AccumulateTotalInfo_18132();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AccumulateTotalInfo_18132(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.nextUnlockReceiveReward_.add(input.readMessage(ActivitySiMaYiMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccumulateTotalInfo_18132.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AccumulateTotalInfo_18132)) {
            return super.equals(obj);
         } else {
            S2C_AccumulateTotalInfo_18132 other = (S2C_AccumulateTotalInfo_18132)obj;
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

      public static S2C_AccumulateTotalInfo_18132 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_18132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(InputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_18132 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_18132 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_18132 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_18132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AccumulateTotalInfo_18132 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AccumulateTotalInfo_18132 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AccumulateTotalInfo_18132> parser() {
         return PARSER;
      }

      public Parser<S2C_AccumulateTotalInfo_18132> getParserForType() {
         return PARSER;
      }

      public S2C_AccumulateTotalInfo_18132 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AccumulateTotalInfo_18132OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccumulateTotalInfo_18132.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.hasReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.hasReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
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
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_AccumulateTotalInfo_18132_descriptor;
         }

         public S2C_AccumulateTotalInfo_18132 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.getDefaultInstance();
         }

         public S2C_AccumulateTotalInfo_18132 build() {
            S2C_AccumulateTotalInfo_18132 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AccumulateTotalInfo_18132 buildPartial() {
            S2C_AccumulateTotalInfo_18132 result = new S2C_AccumulateTotalInfo_18132(this);
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
            if (other instanceof S2C_AccumulateTotalInfo_18132) {
               return this.mergeFrom((S2C_AccumulateTotalInfo_18132)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AccumulateTotalInfo_18132 other) {
            if (other == ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.getDefaultInstance()) {
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
                     this.nextUnlockReceiveRewardBuilder_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
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
            S2C_AccumulateTotalInfo_18132 parsedMessage = null;

            try {
               parsedMessage = (S2C_AccumulateTotalInfo_18132)ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AccumulateTotalInfo_18132)e.getUnfinishedMessage();
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
               this.canReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.mutableCopy(this.canReceiveRewardIds_);
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
            this.canReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.mutableCopy(this.hasReceiveRewardIds_);
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
            this.hasReceiveRewardIds_ = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.emptyIntList();
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
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(ActivitySiMaYiMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, ActivitySiMaYiMsg.NextUnlockReceiveReward.getDefaultInstance());
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
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
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
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
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.NextUnlockReceiveReward.getDefaultInstance();
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
            if (other == ActivitySiMaYiMsg.NextUnlockReceiveReward.getDefaultInstance()) {
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
               parsedMessage = (NextUnlockReceiveReward)ActivitySiMaYiMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ReceiveAccumulateReward_18133 extends GeneratedMessageV3 implements C2S_ReceiveAccumulateReward_18133OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveAccumulateReward_18133 DEFAULT_INSTANCE = new C2S_ReceiveAccumulateReward_18133();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveAccumulateReward_18133> PARSER = new AbstractParser<C2S_ReceiveAccumulateReward_18133>() {
         public C2S_ReceiveAccumulateReward_18133 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveAccumulateReward_18133(input, extensionRegistry);
         }
      };

      private C2S_ReceiveAccumulateReward_18133(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveAccumulateReward_18133() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveAccumulateReward_18133();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveAccumulateReward_18133(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAccumulateReward_18133.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveAccumulateReward_18133)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveAccumulateReward_18133 other = (C2S_ReceiveAccumulateReward_18133)obj;
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

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_18133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_18133 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_18133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveAccumulateReward_18133 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveAccumulateReward_18133 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveAccumulateReward_18133> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveAccumulateReward_18133> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveAccumulateReward_18133 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveAccumulateReward_18133OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAccumulateReward_18133.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_ReceiveAccumulateReward_18133.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_18133_descriptor;
         }

         public C2S_ReceiveAccumulateReward_18133 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_ReceiveAccumulateReward_18133.getDefaultInstance();
         }

         public C2S_ReceiveAccumulateReward_18133 build() {
            C2S_ReceiveAccumulateReward_18133 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveAccumulateReward_18133 buildPartial() {
            C2S_ReceiveAccumulateReward_18133 result = new C2S_ReceiveAccumulateReward_18133(this);
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
            if (other instanceof C2S_ReceiveAccumulateReward_18133) {
               return this.mergeFrom((C2S_ReceiveAccumulateReward_18133)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveAccumulateReward_18133 other) {
            if (other == ActivitySiMaYiMsg.C2S_ReceiveAccumulateReward_18133.getDefaultInstance()) {
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
            C2S_ReceiveAccumulateReward_18133 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveAccumulateReward_18133)ActivitySiMaYiMsg.C2S_ReceiveAccumulateReward_18133.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveAccumulateReward_18133)e.getUnfinishedMessage();
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

   public static final class C2S_CumulativeInfo_18135 extends GeneratedMessageV3 implements C2S_CumulativeInfo_18135OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CumulativeInfo_18135 DEFAULT_INSTANCE = new C2S_CumulativeInfo_18135();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CumulativeInfo_18135> PARSER = new AbstractParser<C2S_CumulativeInfo_18135>() {
         public C2S_CumulativeInfo_18135 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CumulativeInfo_18135(input, extensionRegistry);
         }
      };

      private C2S_CumulativeInfo_18135(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CumulativeInfo_18135() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CumulativeInfo_18135();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CumulativeInfo_18135(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeInfo_18135.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CumulativeInfo_18135)) {
            return super.equals(obj);
         } else {
            C2S_CumulativeInfo_18135 other = (C2S_CumulativeInfo_18135)obj;
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

      public static C2S_CumulativeInfo_18135 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CumulativeInfo_18135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(InputStream input) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeInfo_18135 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CumulativeInfo_18135 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CumulativeInfo_18135 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CumulativeInfo_18135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CumulativeInfo_18135 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CumulativeInfo_18135 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CumulativeInfo_18135> parser() {
         return PARSER;
      }

      public Parser<C2S_CumulativeInfo_18135> getParserForType() {
         return PARSER;
      }

      public C2S_CumulativeInfo_18135 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CumulativeInfo_18135OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CumulativeInfo_18135.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_CumulativeInfo_18135.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_CumulativeInfo_18135_descriptor;
         }

         public C2S_CumulativeInfo_18135 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_CumulativeInfo_18135.getDefaultInstance();
         }

         public C2S_CumulativeInfo_18135 build() {
            C2S_CumulativeInfo_18135 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CumulativeInfo_18135 buildPartial() {
            C2S_CumulativeInfo_18135 result = new C2S_CumulativeInfo_18135(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CumulativeInfo_18135) {
               return this.mergeFrom((C2S_CumulativeInfo_18135)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CumulativeInfo_18135 other) {
            if (other == ActivitySiMaYiMsg.C2S_CumulativeInfo_18135.getDefaultInstance()) {
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
            C2S_CumulativeInfo_18135 parsedMessage = null;

            try {
               parsedMessage = (C2S_CumulativeInfo_18135)ActivitySiMaYiMsg.C2S_CumulativeInfo_18135.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CumulativeInfo_18135)e.getUnfinishedMessage();
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

   public static final class S2C_CumulativeInfo_18136 extends GeneratedMessageV3 implements S2C_CumulativeInfo_18136OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      private byte memoizedIsInitialized;
      private static final S2C_CumulativeInfo_18136 DEFAULT_INSTANCE = new S2C_CumulativeInfo_18136();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CumulativeInfo_18136> PARSER = new AbstractParser<S2C_CumulativeInfo_18136>() {
         public S2C_CumulativeInfo_18136 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CumulativeInfo_18136(input, extensionRegistry);
         }
      };

      private S2C_CumulativeInfo_18136(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CumulativeInfo_18136() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CumulativeInfo_18136();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CumulativeInfo_18136(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeInfo_18136.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CumulativeInfo_18136)) {
            return super.equals(obj);
         } else {
            S2C_CumulativeInfo_18136 other = (S2C_CumulativeInfo_18136)obj;
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

      public static S2C_CumulativeInfo_18136 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CumulativeInfo_18136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(InputStream input) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeInfo_18136 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CumulativeInfo_18136 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CumulativeInfo_18136 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CumulativeInfo_18136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CumulativeInfo_18136 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CumulativeInfo_18136 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CumulativeInfo_18136> parser() {
         return PARSER;
      }

      public Parser<S2C_CumulativeInfo_18136> getParserForType() {
         return PARSER;
      }

      public S2C_CumulativeInfo_18136 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CumulativeInfo_18136OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CumulativeInfo_18136.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_S2C_CumulativeInfo_18136_descriptor;
         }

         public S2C_CumulativeInfo_18136 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.getDefaultInstance();
         }

         public S2C_CumulativeInfo_18136 build() {
            S2C_CumulativeInfo_18136 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CumulativeInfo_18136 buildPartial() {
            S2C_CumulativeInfo_18136 result = new S2C_CumulativeInfo_18136(this);
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
            if (other instanceof S2C_CumulativeInfo_18136) {
               return this.mergeFrom((S2C_CumulativeInfo_18136)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CumulativeInfo_18136 other) {
            if (other == ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.getDefaultInstance()) {
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
            S2C_CumulativeInfo_18136 parsedMessage = null;

            try {
               parsedMessage = (S2C_CumulativeInfo_18136)ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CumulativeInfo_18136)e.getUnfinishedMessage();
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
               this.gotRewards_ = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.emptyIntList();
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

   public static final class C2S_GetCumulativeReward_18137 extends GeneratedMessageV3 implements C2S_GetCumulativeReward_18137OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetCumulativeReward_18137 DEFAULT_INSTANCE = new C2S_GetCumulativeReward_18137();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetCumulativeReward_18137> PARSER = new AbstractParser<C2S_GetCumulativeReward_18137>() {
         public C2S_GetCumulativeReward_18137 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetCumulativeReward_18137(input, extensionRegistry);
         }
      };

      private C2S_GetCumulativeReward_18137(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetCumulativeReward_18137() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetCumulativeReward_18137();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetCumulativeReward_18137(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetCumulativeReward_18137.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetCumulativeReward_18137)) {
            return super.equals(obj);
         } else {
            C2S_GetCumulativeReward_18137 other = (C2S_GetCumulativeReward_18137)obj;
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

      public static C2S_GetCumulativeReward_18137 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetCumulativeReward_18137)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(InputStream input) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetCumulativeReward_18137 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetCumulativeReward_18137 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetCumulativeReward_18137 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetCumulativeReward_18137)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetCumulativeReward_18137 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetCumulativeReward_18137 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetCumulativeReward_18137> parser() {
         return PARSER;
      }

      public Parser<C2S_GetCumulativeReward_18137> getParserForType() {
         return PARSER;
      }

      public C2S_GetCumulativeReward_18137 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetCumulativeReward_18137OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetCumulativeReward_18137.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivitySiMaYiMsg.C2S_GetCumulativeReward_18137.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivitySiMaYiMsg.internal_static_activitySiMaYi_com_gzbz_protobuf_C2S_GetCumulativeReward_18137_descriptor;
         }

         public C2S_GetCumulativeReward_18137 getDefaultInstanceForType() {
            return ActivitySiMaYiMsg.C2S_GetCumulativeReward_18137.getDefaultInstance();
         }

         public C2S_GetCumulativeReward_18137 build() {
            C2S_GetCumulativeReward_18137 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetCumulativeReward_18137 buildPartial() {
            C2S_GetCumulativeReward_18137 result = new C2S_GetCumulativeReward_18137(this);
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
            if (other instanceof C2S_GetCumulativeReward_18137) {
               return this.mergeFrom((C2S_GetCumulativeReward_18137)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetCumulativeReward_18137 other) {
            if (other == ActivitySiMaYiMsg.C2S_GetCumulativeReward_18137.getDefaultInstance()) {
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
            C2S_GetCumulativeReward_18137 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetCumulativeReward_18137)ActivitySiMaYiMsg.C2S_GetCumulativeReward_18137.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetCumulativeReward_18137)e.getUnfinishedMessage();
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

   public interface C2S_AccumulateTotalInfo_18131OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CumulativeInfo_18135OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GetCumulativeReward_18137OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_HeroThemeInfo_18101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootEnjoy_18125OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_18121OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_18123OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_MatchBattle_18111OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Mate_18103OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PointReward_18107OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveAccumulateReward_18133OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_TaskCommitTask_18113OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_AccumulateTotalInfo_18132OrBuilder extends MessageOrBuilder {
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

   public interface S2C_CumulativeInfo_18136OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();
   }

   public interface S2C_HeroThemeInfo_18102OrBuilder extends MessageOrBuilder {
      boolean hasFight();

      int getFight();

      boolean hasTotalDamage();

      long getTotalDamage();

      List<Integer> getFightRewardList();

      int getFightRewardCount();

      int getFightReward(int index);

      boolean hasTotalPoint();

      int getTotalPoint();

      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasServerOpenDay();

      int getServerOpenDay();

      boolean hasActivityDay();

      int getActivityDay();
   }

   public interface S2C_LootEnjoy_18126OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_18122OrBuilder extends MessageOrBuilder {
      boolean hasEnjoyId();

      int getEnjoyId();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();
   }

   public interface S2C_LootReward_18124OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasHadEnjoy();

      boolean getHadEnjoy();
   }

   public interface S2C_MatchBattle_18112OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasFightNum();

      int getFightNum();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasTotalPoint();

      int getTotalPoint();
   }

   public interface S2C_Mate_18104OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();

      boolean hasArraying();

      CommonMsg.PlayerArrayingInfo getArraying();

      CommonMsg.PlayerArrayingInfoOrBuilder getArrayingOrBuilder();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();
   }

   public interface S2C_PointReward_18108OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TaskCommitTask_18114OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TaskModify_18116OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }
}
