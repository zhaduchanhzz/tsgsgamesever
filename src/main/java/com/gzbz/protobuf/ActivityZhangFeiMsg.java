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

public final class ActivityZhangFeiMsg {
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityZhangFeiMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016ActivityZhangFei.proto\u0012\"activityZhangFei.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0019\n\u0017C2S_HeroThemeInfo_17301\"ÿ\u0001\n\u0017S2C_HeroThemeInfo_17302\u0012\r\n\u0005fight\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bfightReward\u0018\u0003 \u0003(\u0005\u0012\u0012\n\ntotalPoint\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0005 \u0003(\u0005\u00122\n\u0004task\u0018\u0006 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0011\n\tstartTime\u0018\u0007 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\b \u0002(\u0005\u0012\u0015\n\rserverOpenDay\u0018\t \u0001(\u0005\u0012\u0013\n\u000bactivityDay\u0018\n \u0001(\u0005\"\u0010\n\u000eC2S_Mate_17303\"\u0081\u0001\n\u000eS2C_Mate_17304\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012,\n\barraying\u0018\u0002 \u0002(\u000b2\u001a.common.PlayerArrayingInfo\u0012\u0011\n\tmonarchId\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0006 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0007 \u0002(\u0005\"#\n\u0015C2S_PointReward_17307\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0015S2C_PointReward_17308\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_MatchBattle_17311\"b\n\u0015S2C_MatchBattle_17312\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0004 \u0002(\u0003\u0012\u0012\n\ntotalPoint\u0018\u0005 \u0002(\u0005\"*\n\u0018C2S_TaskCommitTask_17313\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_TaskCommitTask_17314\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"J\n\u0014S2C_TaskModify_17316\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0014\n\u0012C2S_LootInfo_17321\"K\n\u0012S2C_LootInfo_17322\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\"#\n\u0014C2S_LootReward_17323\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"N\n\u0014S2C_LootReward_17324\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadEnjoy\u0018\u0003 \u0002(\b\"!\n\u0013C2S_LootEnjoy_17325\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_17326\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u001f\n\u001dC2S_AccumulateTotalInfo_17331\"Ï\u0001\n\u001dS2C_AccumulateTotalInfo_17332\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012\\\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b2;.activityZhangFei.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\"5\n!C2S_ReceiveAccumulateReward_17333\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005B*\n\u0011com.gzbz.protobufB\u0013ActivityZhangFeiMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor, new String[0]);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor, new String[]{"Fight", "TotalDamage", "FightReward", "TotalPoint", "PointReward", "Task", "StartTime", "EndTime", "ServerOpenDay", "ActivityDay"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor, new String[0]);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor, new String[]{"Power", "Arraying", "MonarchId", "PlayerName", "Sex"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor, new String[]{"Id"});
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor, new String[]{"Id"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor, new String[0]);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor, new String[]{"Damage", "FightNum", "TotalDamage", "TotalPoint"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor, new String[]{"TaskId"});
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor, new String[]{"TaskId"});
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor, new String[]{"Task"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor, new String[0]);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor, new String[]{"EnjoyId", "RewardId", "CurLootNum"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor, new String[]{"Num"});
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor, new String[]{"RewardId", "CurLootNum", "HadEnjoy"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor, new String[]{"Id"});
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor, new String[]{"Id"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor, new String[0]);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor, new String[]{"RewardId"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_HeroThemeInfo_17301 extends GeneratedMessageV3 implements C2S_HeroThemeInfo_17301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroThemeInfo_17301 DEFAULT_INSTANCE = new C2S_HeroThemeInfo_17301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroThemeInfo_17301> PARSER = new AbstractParser<C2S_HeroThemeInfo_17301>() {
         public C2S_HeroThemeInfo_17301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroThemeInfo_17301(input, extensionRegistry);
         }
      };

      private C2S_HeroThemeInfo_17301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroThemeInfo_17301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroThemeInfo_17301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroThemeInfo_17301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_17301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroThemeInfo_17301)) {
            return super.equals(obj);
         } else {
            C2S_HeroThemeInfo_17301 other = (C2S_HeroThemeInfo_17301)obj;
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

      public static C2S_HeroThemeInfo_17301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_17301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_17301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_17301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_17301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_17301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroThemeInfo_17301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroThemeInfo_17301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroThemeInfo_17301> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroThemeInfo_17301> getParserForType() {
         return PARSER;
      }

      public C2S_HeroThemeInfo_17301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroThemeInfo_17301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_17301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_HeroThemeInfo_17301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_HeroThemeInfo_17301_descriptor;
         }

         public C2S_HeroThemeInfo_17301 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_HeroThemeInfo_17301.getDefaultInstance();
         }

         public C2S_HeroThemeInfo_17301 build() {
            C2S_HeroThemeInfo_17301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroThemeInfo_17301 buildPartial() {
            C2S_HeroThemeInfo_17301 result = new C2S_HeroThemeInfo_17301(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroThemeInfo_17301) {
               return this.mergeFrom((C2S_HeroThemeInfo_17301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroThemeInfo_17301 other) {
            if (other == ActivityZhangFeiMsg.C2S_HeroThemeInfo_17301.getDefaultInstance()) {
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
            C2S_HeroThemeInfo_17301 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroThemeInfo_17301)ActivityZhangFeiMsg.C2S_HeroThemeInfo_17301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroThemeInfo_17301)e.getUnfinishedMessage();
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

   public static final class S2C_HeroThemeInfo_17302 extends GeneratedMessageV3 implements S2C_HeroThemeInfo_17302OrBuilder {
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
      private static final S2C_HeroThemeInfo_17302 DEFAULT_INSTANCE = new S2C_HeroThemeInfo_17302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroThemeInfo_17302> PARSER = new AbstractParser<S2C_HeroThemeInfo_17302>() {
         public S2C_HeroThemeInfo_17302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroThemeInfo_17302(input, extensionRegistry);
         }
      };

      private S2C_HeroThemeInfo_17302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroThemeInfo_17302() {
         this.memoizedIsInitialized = -1;
         this.fightReward_ = emptyIntList();
         this.pointReward_ = emptyIntList();
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroThemeInfo_17302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroThemeInfo_17302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_17302.class, Builder.class);
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
         } else if (!(obj instanceof S2C_HeroThemeInfo_17302)) {
            return super.equals(obj);
         } else {
            S2C_HeroThemeInfo_17302 other = (S2C_HeroThemeInfo_17302)obj;
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

      public static S2C_HeroThemeInfo_17302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_17302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_17302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_17302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_17302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_17302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroThemeInfo_17302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroThemeInfo_17302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroThemeInfo_17302> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroThemeInfo_17302> getParserForType() {
         return PARSER;
      }

      public S2C_HeroThemeInfo_17302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroThemeInfo_17302OrBuilder {
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_17302.class, Builder.class);
         }

         private Builder() {
            this.fightReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
            this.pointReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
            this.pointReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fight_ = 0;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.fightReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            this.pointReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_HeroThemeInfo_17302_descriptor;
         }

         public S2C_HeroThemeInfo_17302 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.getDefaultInstance();
         }

         public S2C_HeroThemeInfo_17302 build() {
            S2C_HeroThemeInfo_17302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroThemeInfo_17302 buildPartial() {
            S2C_HeroThemeInfo_17302 result = new S2C_HeroThemeInfo_17302(this);
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
            if (other instanceof S2C_HeroThemeInfo_17302) {
               return this.mergeFrom((S2C_HeroThemeInfo_17302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroThemeInfo_17302 other) {
            if (other == ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_HeroThemeInfo_17302 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroThemeInfo_17302)ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroThemeInfo_17302)e.getUnfinishedMessage();
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
               this.fightReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.mutableCopy(this.fightReward_);
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
            this.fightReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
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
               this.pointReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.mutableCopy(this.pointReward_);
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
            this.pointReward_ = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.emptyIntList();
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

   public static final class C2S_Mate_17303 extends GeneratedMessageV3 implements C2S_Mate_17303OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Mate_17303 DEFAULT_INSTANCE = new C2S_Mate_17303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Mate_17303> PARSER = new AbstractParser<C2S_Mate_17303>() {
         public C2S_Mate_17303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Mate_17303(input, extensionRegistry);
         }
      };

      private C2S_Mate_17303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Mate_17303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Mate_17303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Mate_17303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_17303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Mate_17303)) {
            return super.equals(obj);
         } else {
            C2S_Mate_17303 other = (C2S_Mate_17303)obj;
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

      public static C2S_Mate_17303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data);
      }

      public static C2S_Mate_17303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_17303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data);
      }

      public static C2S_Mate_17303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_17303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data);
      }

      public static C2S_Mate_17303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_17303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_17303 parseFrom(InputStream input) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_17303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_17303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Mate_17303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_17303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_17303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_17303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Mate_17303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Mate_17303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Mate_17303> parser() {
         return PARSER;
      }

      public Parser<C2S_Mate_17303> getParserForType() {
         return PARSER;
      }

      public C2S_Mate_17303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Mate_17303OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_17303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_Mate_17303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_Mate_17303_descriptor;
         }

         public C2S_Mate_17303 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_Mate_17303.getDefaultInstance();
         }

         public C2S_Mate_17303 build() {
            C2S_Mate_17303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Mate_17303 buildPartial() {
            C2S_Mate_17303 result = new C2S_Mate_17303(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Mate_17303) {
               return this.mergeFrom((C2S_Mate_17303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Mate_17303 other) {
            if (other == ActivityZhangFeiMsg.C2S_Mate_17303.getDefaultInstance()) {
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
            C2S_Mate_17303 parsedMessage = null;

            try {
               parsedMessage = (C2S_Mate_17303)ActivityZhangFeiMsg.C2S_Mate_17303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Mate_17303)e.getUnfinishedMessage();
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

   public static final class S2C_Mate_17304 extends GeneratedMessageV3 implements S2C_Mate_17304OrBuilder {
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
      private static final S2C_Mate_17304 DEFAULT_INSTANCE = new S2C_Mate_17304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Mate_17304> PARSER = new AbstractParser<S2C_Mate_17304>() {
         public S2C_Mate_17304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Mate_17304(input, extensionRegistry);
         }
      };

      private S2C_Mate_17304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Mate_17304() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Mate_17304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Mate_17304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_17304.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Mate_17304)) {
            return super.equals(obj);
         } else {
            S2C_Mate_17304 other = (S2C_Mate_17304)obj;
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

      public static S2C_Mate_17304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data);
      }

      public static S2C_Mate_17304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_17304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data);
      }

      public static S2C_Mate_17304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_17304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data);
      }

      public static S2C_Mate_17304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_17304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_17304 parseFrom(InputStream input) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_17304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_17304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Mate_17304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_17304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_17304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_17304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Mate_17304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Mate_17304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Mate_17304> parser() {
         return PARSER;
      }

      public Parser<S2C_Mate_17304> getParserForType() {
         return PARSER;
      }

      public S2C_Mate_17304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Mate_17304OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PlayerArrayingInfo arraying_;
         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> arrayingBuilder_;
         private int monarchId_;
         private Object playerName_;
         private int sex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_17304.class, Builder.class);
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
            if (ActivityZhangFeiMsg.S2C_Mate_17304.alwaysUseFieldBuilders) {
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_Mate_17304_descriptor;
         }

         public S2C_Mate_17304 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_Mate_17304.getDefaultInstance();
         }

         public S2C_Mate_17304 build() {
            S2C_Mate_17304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Mate_17304 buildPartial() {
            S2C_Mate_17304 result = new S2C_Mate_17304(this);
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
            if (other instanceof S2C_Mate_17304) {
               return this.mergeFrom((S2C_Mate_17304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Mate_17304 other) {
            if (other == ActivityZhangFeiMsg.S2C_Mate_17304.getDefaultInstance()) {
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
            S2C_Mate_17304 parsedMessage = null;

            try {
               parsedMessage = (S2C_Mate_17304)ActivityZhangFeiMsg.S2C_Mate_17304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Mate_17304)e.getUnfinishedMessage();
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
            this.playerName_ = ActivityZhangFeiMsg.S2C_Mate_17304.getDefaultInstance().getPlayerName();
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

   public static final class C2S_PointReward_17307 extends GeneratedMessageV3 implements C2S_PointReward_17307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PointReward_17307 DEFAULT_INSTANCE = new C2S_PointReward_17307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointReward_17307> PARSER = new AbstractParser<C2S_PointReward_17307>() {
         public C2S_PointReward_17307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointReward_17307(input, extensionRegistry);
         }
      };

      private C2S_PointReward_17307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointReward_17307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointReward_17307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointReward_17307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_17307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointReward_17307)) {
            return super.equals(obj);
         } else {
            C2S_PointReward_17307 other = (C2S_PointReward_17307)obj;
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

      public static C2S_PointReward_17307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_17307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_17307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_17307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_17307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_17307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_17307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_17307 parseFrom(InputStream input) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_17307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_17307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointReward_17307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_17307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_17307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_17307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointReward_17307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointReward_17307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointReward_17307> parser() {
         return PARSER;
      }

      public Parser<C2S_PointReward_17307> getParserForType() {
         return PARSER;
      }

      public C2S_PointReward_17307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointReward_17307OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_17307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_PointReward_17307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_PointReward_17307_descriptor;
         }

         public C2S_PointReward_17307 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_PointReward_17307.getDefaultInstance();
         }

         public C2S_PointReward_17307 build() {
            C2S_PointReward_17307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointReward_17307 buildPartial() {
            C2S_PointReward_17307 result = new C2S_PointReward_17307(this);
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
            if (other instanceof C2S_PointReward_17307) {
               return this.mergeFrom((C2S_PointReward_17307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointReward_17307 other) {
            if (other == ActivityZhangFeiMsg.C2S_PointReward_17307.getDefaultInstance()) {
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
            C2S_PointReward_17307 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointReward_17307)ActivityZhangFeiMsg.C2S_PointReward_17307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointReward_17307)e.getUnfinishedMessage();
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

   public static final class S2C_PointReward_17308 extends GeneratedMessageV3 implements S2C_PointReward_17308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PointReward_17308 DEFAULT_INSTANCE = new S2C_PointReward_17308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointReward_17308> PARSER = new AbstractParser<S2C_PointReward_17308>() {
         public S2C_PointReward_17308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointReward_17308(input, extensionRegistry);
         }
      };

      private S2C_PointReward_17308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointReward_17308() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointReward_17308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointReward_17308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_17308.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PointReward_17308)) {
            return super.equals(obj);
         } else {
            S2C_PointReward_17308 other = (S2C_PointReward_17308)obj;
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

      public static S2C_PointReward_17308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_17308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_17308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_17308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_17308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_17308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_17308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_17308 parseFrom(InputStream input) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_17308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_17308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointReward_17308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_17308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_17308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_17308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointReward_17308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointReward_17308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointReward_17308> parser() {
         return PARSER;
      }

      public Parser<S2C_PointReward_17308> getParserForType() {
         return PARSER;
      }

      public S2C_PointReward_17308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointReward_17308OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_17308.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_PointReward_17308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_PointReward_17308_descriptor;
         }

         public S2C_PointReward_17308 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_PointReward_17308.getDefaultInstance();
         }

         public S2C_PointReward_17308 build() {
            S2C_PointReward_17308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointReward_17308 buildPartial() {
            S2C_PointReward_17308 result = new S2C_PointReward_17308(this);
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
            if (other instanceof S2C_PointReward_17308) {
               return this.mergeFrom((S2C_PointReward_17308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointReward_17308 other) {
            if (other == ActivityZhangFeiMsg.S2C_PointReward_17308.getDefaultInstance()) {
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
            S2C_PointReward_17308 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointReward_17308)ActivityZhangFeiMsg.S2C_PointReward_17308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointReward_17308)e.getUnfinishedMessage();
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

   public static final class C2S_MatchBattle_17311 extends GeneratedMessageV3 implements C2S_MatchBattle_17311OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MatchBattle_17311 DEFAULT_INSTANCE = new C2S_MatchBattle_17311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchBattle_17311> PARSER = new AbstractParser<C2S_MatchBattle_17311>() {
         public C2S_MatchBattle_17311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchBattle_17311(input, extensionRegistry);
         }
      };

      private C2S_MatchBattle_17311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchBattle_17311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchBattle_17311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchBattle_17311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_17311.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchBattle_17311)) {
            return super.equals(obj);
         } else {
            C2S_MatchBattle_17311 other = (C2S_MatchBattle_17311)obj;
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

      public static C2S_MatchBattle_17311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_17311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_17311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_17311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_17311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_17311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_17311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_17311 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_17311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_17311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_17311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_17311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_17311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_17311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchBattle_17311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchBattle_17311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchBattle_17311> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchBattle_17311> getParserForType() {
         return PARSER;
      }

      public C2S_MatchBattle_17311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchBattle_17311OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_17311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_MatchBattle_17311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_MatchBattle_17311_descriptor;
         }

         public C2S_MatchBattle_17311 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_MatchBattle_17311.getDefaultInstance();
         }

         public C2S_MatchBattle_17311 build() {
            C2S_MatchBattle_17311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchBattle_17311 buildPartial() {
            C2S_MatchBattle_17311 result = new C2S_MatchBattle_17311(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MatchBattle_17311) {
               return this.mergeFrom((C2S_MatchBattle_17311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchBattle_17311 other) {
            if (other == ActivityZhangFeiMsg.C2S_MatchBattle_17311.getDefaultInstance()) {
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
            C2S_MatchBattle_17311 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchBattle_17311)ActivityZhangFeiMsg.C2S_MatchBattle_17311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchBattle_17311)e.getUnfinishedMessage();
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

   public static final class S2C_MatchBattle_17312 extends GeneratedMessageV3 implements S2C_MatchBattle_17312OrBuilder {
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
      private static final S2C_MatchBattle_17312 DEFAULT_INSTANCE = new S2C_MatchBattle_17312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchBattle_17312> PARSER = new AbstractParser<S2C_MatchBattle_17312>() {
         public S2C_MatchBattle_17312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchBattle_17312(input, extensionRegistry);
         }
      };

      private S2C_MatchBattle_17312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchBattle_17312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchBattle_17312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchBattle_17312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_17312.class, Builder.class);
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
         } else if (!(obj instanceof S2C_MatchBattle_17312)) {
            return super.equals(obj);
         } else {
            S2C_MatchBattle_17312 other = (S2C_MatchBattle_17312)obj;
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

      public static S2C_MatchBattle_17312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_17312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_17312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_17312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_17312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_17312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_17312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_17312 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_17312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_17312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_17312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_17312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_17312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_17312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchBattle_17312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchBattle_17312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchBattle_17312> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchBattle_17312> getParserForType() {
         return PARSER;
      }

      public S2C_MatchBattle_17312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchBattle_17312OrBuilder {
         private int bitField0_;
         private long damage_;
         private int fightNum_;
         private long totalDamage_;
         private int totalPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_17312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_MatchBattle_17312.alwaysUseFieldBuilders) {
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_MatchBattle_17312_descriptor;
         }

         public S2C_MatchBattle_17312 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_MatchBattle_17312.getDefaultInstance();
         }

         public S2C_MatchBattle_17312 build() {
            S2C_MatchBattle_17312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchBattle_17312 buildPartial() {
            S2C_MatchBattle_17312 result = new S2C_MatchBattle_17312(this);
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
            if (other instanceof S2C_MatchBattle_17312) {
               return this.mergeFrom((S2C_MatchBattle_17312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchBattle_17312 other) {
            if (other == ActivityZhangFeiMsg.S2C_MatchBattle_17312.getDefaultInstance()) {
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
            S2C_MatchBattle_17312 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchBattle_17312)ActivityZhangFeiMsg.S2C_MatchBattle_17312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchBattle_17312)e.getUnfinishedMessage();
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

   public static final class C2S_TaskCommitTask_17313 extends GeneratedMessageV3 implements C2S_TaskCommitTask_17313OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskCommitTask_17313 DEFAULT_INSTANCE = new C2S_TaskCommitTask_17313();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskCommitTask_17313> PARSER = new AbstractParser<C2S_TaskCommitTask_17313>() {
         public C2S_TaskCommitTask_17313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskCommitTask_17313(input, extensionRegistry);
         }
      };

      private C2S_TaskCommitTask_17313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskCommitTask_17313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskCommitTask_17313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskCommitTask_17313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommitTask_17313.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskCommitTask_17313)) {
            return super.equals(obj);
         } else {
            C2S_TaskCommitTask_17313 other = (C2S_TaskCommitTask_17313)obj;
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

      public static C2S_TaskCommitTask_17313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskCommitTask_17313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommitTask_17313 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_17313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskCommitTask_17313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskCommitTask_17313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskCommitTask_17313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskCommitTask_17313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskCommitTask_17313> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskCommitTask_17313> getParserForType() {
         return PARSER;
      }

      public C2S_TaskCommitTask_17313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskCommitTask_17313OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskCommitTask_17313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_TaskCommitTask_17313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_TaskCommitTask_17313_descriptor;
         }

         public C2S_TaskCommitTask_17313 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_TaskCommitTask_17313.getDefaultInstance();
         }

         public C2S_TaskCommitTask_17313 build() {
            C2S_TaskCommitTask_17313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskCommitTask_17313 buildPartial() {
            C2S_TaskCommitTask_17313 result = new C2S_TaskCommitTask_17313(this);
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
            if (other instanceof C2S_TaskCommitTask_17313) {
               return this.mergeFrom((C2S_TaskCommitTask_17313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskCommitTask_17313 other) {
            if (other == ActivityZhangFeiMsg.C2S_TaskCommitTask_17313.getDefaultInstance()) {
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
            C2S_TaskCommitTask_17313 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskCommitTask_17313)ActivityZhangFeiMsg.C2S_TaskCommitTask_17313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskCommitTask_17313)e.getUnfinishedMessage();
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

   public static final class S2C_TaskCommitTask_17314 extends GeneratedMessageV3 implements S2C_TaskCommitTask_17314OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskCommitTask_17314 DEFAULT_INSTANCE = new S2C_TaskCommitTask_17314();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskCommitTask_17314> PARSER = new AbstractParser<S2C_TaskCommitTask_17314>() {
         public S2C_TaskCommitTask_17314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskCommitTask_17314(input, extensionRegistry);
         }
      };

      private S2C_TaskCommitTask_17314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskCommitTask_17314() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskCommitTask_17314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskCommitTask_17314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommitTask_17314.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskCommitTask_17314)) {
            return super.equals(obj);
         } else {
            S2C_TaskCommitTask_17314 other = (S2C_TaskCommitTask_17314)obj;
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

      public static S2C_TaskCommitTask_17314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskCommitTask_17314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommitTask_17314 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_17314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskCommitTask_17314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskCommitTask_17314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskCommitTask_17314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskCommitTask_17314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskCommitTask_17314> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskCommitTask_17314> getParserForType() {
         return PARSER;
      }

      public S2C_TaskCommitTask_17314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskCommitTask_17314OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskCommitTask_17314.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_TaskCommitTask_17314.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskCommitTask_17314_descriptor;
         }

         public S2C_TaskCommitTask_17314 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_TaskCommitTask_17314.getDefaultInstance();
         }

         public S2C_TaskCommitTask_17314 build() {
            S2C_TaskCommitTask_17314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskCommitTask_17314 buildPartial() {
            S2C_TaskCommitTask_17314 result = new S2C_TaskCommitTask_17314(this);
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
            if (other instanceof S2C_TaskCommitTask_17314) {
               return this.mergeFrom((S2C_TaskCommitTask_17314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskCommitTask_17314 other) {
            if (other == ActivityZhangFeiMsg.S2C_TaskCommitTask_17314.getDefaultInstance()) {
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
            S2C_TaskCommitTask_17314 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskCommitTask_17314)ActivityZhangFeiMsg.S2C_TaskCommitTask_17314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskCommitTask_17314)e.getUnfinishedMessage();
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

   public static final class S2C_TaskModify_17316 extends GeneratedMessageV3 implements S2C_TaskModify_17316OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskModify_17316 DEFAULT_INSTANCE = new S2C_TaskModify_17316();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskModify_17316> PARSER = new AbstractParser<S2C_TaskModify_17316>() {
         public S2C_TaskModify_17316 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskModify_17316(input, extensionRegistry);
         }
      };

      private S2C_TaskModify_17316(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskModify_17316() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskModify_17316();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskModify_17316(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_17316.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TaskModify_17316)) {
            return super.equals(obj);
         } else {
            S2C_TaskModify_17316 other = (S2C_TaskModify_17316)obj;
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

      public static S2C_TaskModify_17316 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_17316 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_17316 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_17316 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_17316 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data);
      }

      public static S2C_TaskModify_17316 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskModify_17316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskModify_17316 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_17316 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_17316 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_17316 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskModify_17316 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskModify_17316 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskModify_17316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskModify_17316 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskModify_17316 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskModify_17316> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskModify_17316> getParserForType() {
         return PARSER;
      }

      public S2C_TaskModify_17316 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskModify_17316OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskModify_17316.class, Builder.class);
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
            if (ActivityZhangFeiMsg.S2C_TaskModify_17316.alwaysUseFieldBuilders) {
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_TaskModify_17316_descriptor;
         }

         public S2C_TaskModify_17316 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_TaskModify_17316.getDefaultInstance();
         }

         public S2C_TaskModify_17316 build() {
            S2C_TaskModify_17316 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskModify_17316 buildPartial() {
            S2C_TaskModify_17316 result = new S2C_TaskModify_17316(this);
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
            if (other instanceof S2C_TaskModify_17316) {
               return this.mergeFrom((S2C_TaskModify_17316)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskModify_17316 other) {
            if (other == ActivityZhangFeiMsg.S2C_TaskModify_17316.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityZhangFeiMsg.S2C_TaskModify_17316.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_TaskModify_17316 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskModify_17316)ActivityZhangFeiMsg.S2C_TaskModify_17316.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskModify_17316)e.getUnfinishedMessage();
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

   public static final class C2S_LootInfo_17321 extends GeneratedMessageV3 implements C2S_LootInfo_17321OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_17321 DEFAULT_INSTANCE = new C2S_LootInfo_17321();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_17321> PARSER = new AbstractParser<C2S_LootInfo_17321>() {
         public C2S_LootInfo_17321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_17321(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_17321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_17321() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_17321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_17321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_17321.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_17321)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_17321 other = (C2S_LootInfo_17321)obj;
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

      public static C2S_LootInfo_17321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_17321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_17321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_17321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_17321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_17321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_17321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_17321 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_17321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_17321 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_17321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_17321 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_17321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_17321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_17321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_17321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_17321> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_17321> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_17321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_17321OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_17321.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_LootInfo_17321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootInfo_17321_descriptor;
         }

         public C2S_LootInfo_17321 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_LootInfo_17321.getDefaultInstance();
         }

         public C2S_LootInfo_17321 build() {
            C2S_LootInfo_17321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_17321 buildPartial() {
            C2S_LootInfo_17321 result = new C2S_LootInfo_17321(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_17321) {
               return this.mergeFrom((C2S_LootInfo_17321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_17321 other) {
            if (other == ActivityZhangFeiMsg.C2S_LootInfo_17321.getDefaultInstance()) {
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
            C2S_LootInfo_17321 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_17321)ActivityZhangFeiMsg.C2S_LootInfo_17321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_17321)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_17322 extends GeneratedMessageV3 implements S2C_LootInfo_17322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOYID_FIELD_NUMBER = 1;
      private int enjoyId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootInfo_17322 DEFAULT_INSTANCE = new S2C_LootInfo_17322();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_17322> PARSER = new AbstractParser<S2C_LootInfo_17322>() {
         public S2C_LootInfo_17322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_17322(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_17322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_17322() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_17322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_17322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_17322.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootInfo_17322)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_17322 other = (S2C_LootInfo_17322)obj;
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

      public static S2C_LootInfo_17322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_17322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_17322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_17322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_17322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_17322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_17322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_17322 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_17322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_17322 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_17322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_17322 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_17322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_17322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_17322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_17322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_17322> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_17322> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_17322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_17322OrBuilder {
         private int bitField0_;
         private int enjoyId_;
         private Internal.IntList rewardId_;
         private int curLootNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_17322.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootInfo_17322.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootInfo_17322.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_LootInfo_17322.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootInfo_17322.emptyIntList();
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootInfo_17322_descriptor;
         }

         public S2C_LootInfo_17322 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_LootInfo_17322.getDefaultInstance();
         }

         public S2C_LootInfo_17322 build() {
            S2C_LootInfo_17322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_17322 buildPartial() {
            S2C_LootInfo_17322 result = new S2C_LootInfo_17322(this);
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
            if (other instanceof S2C_LootInfo_17322) {
               return this.mergeFrom((S2C_LootInfo_17322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_17322 other) {
            if (other == ActivityZhangFeiMsg.S2C_LootInfo_17322.getDefaultInstance()) {
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
            S2C_LootInfo_17322 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_17322)ActivityZhangFeiMsg.S2C_LootInfo_17322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_17322)e.getUnfinishedMessage();
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
               this.rewardId_ = ActivityZhangFeiMsg.S2C_LootInfo_17322.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootInfo_17322.emptyIntList();
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

   public static final class C2S_LootReward_17323 extends GeneratedMessageV3 implements C2S_LootReward_17323OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_17323 DEFAULT_INSTANCE = new C2S_LootReward_17323();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_17323> PARSER = new AbstractParser<C2S_LootReward_17323>() {
         public C2S_LootReward_17323 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_17323(input, extensionRegistry);
         }
      };

      private C2S_LootReward_17323(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_17323() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_17323();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_17323(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_17323.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_17323)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_17323 other = (C2S_LootReward_17323)obj;
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

      public static C2S_LootReward_17323 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_17323 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_17323 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_17323 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_17323 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_17323 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_17323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_17323 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_17323 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_17323 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_17323 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_17323 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_17323 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_17323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_17323 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_17323 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_17323> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_17323> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_17323 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_17323OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_17323.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_LootReward_17323.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootReward_17323_descriptor;
         }

         public C2S_LootReward_17323 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_LootReward_17323.getDefaultInstance();
         }

         public C2S_LootReward_17323 build() {
            C2S_LootReward_17323 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_17323 buildPartial() {
            C2S_LootReward_17323 result = new C2S_LootReward_17323(this);
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
            if (other instanceof C2S_LootReward_17323) {
               return this.mergeFrom((C2S_LootReward_17323)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_17323 other) {
            if (other == ActivityZhangFeiMsg.C2S_LootReward_17323.getDefaultInstance()) {
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
            C2S_LootReward_17323 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_17323)ActivityZhangFeiMsg.C2S_LootReward_17323.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_17323)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_17324 extends GeneratedMessageV3 implements S2C_LootReward_17324OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 2;
      private int curLootNum_;
      public static final int HADENJOY_FIELD_NUMBER = 3;
      private boolean hadEnjoy_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_17324 DEFAULT_INSTANCE = new S2C_LootReward_17324();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_17324> PARSER = new AbstractParser<S2C_LootReward_17324>() {
         public S2C_LootReward_17324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_17324(input, extensionRegistry);
         }
      };

      private S2C_LootReward_17324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_17324() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_17324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_17324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_17324.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootReward_17324)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_17324 other = (S2C_LootReward_17324)obj;
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

      public static S2C_LootReward_17324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_17324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_17324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_17324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_17324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_17324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_17324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_17324 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_17324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_17324 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_17324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_17324 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_17324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_17324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_17324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_17324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_17324> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_17324> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_17324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_17324OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private boolean hadEnjoy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_17324.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootReward_17324.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootReward_17324.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_LootReward_17324.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootReward_17324.emptyIntList();
            this.bitField0_ &= -2;
            this.curLootNum_ = 0;
            this.bitField0_ &= -3;
            this.hadEnjoy_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootReward_17324_descriptor;
         }

         public S2C_LootReward_17324 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_LootReward_17324.getDefaultInstance();
         }

         public S2C_LootReward_17324 build() {
            S2C_LootReward_17324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_17324 buildPartial() {
            S2C_LootReward_17324 result = new S2C_LootReward_17324(this);
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
            if (other instanceof S2C_LootReward_17324) {
               return this.mergeFrom((S2C_LootReward_17324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_17324 other) {
            if (other == ActivityZhangFeiMsg.S2C_LootReward_17324.getDefaultInstance()) {
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
            S2C_LootReward_17324 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_17324)ActivityZhangFeiMsg.S2C_LootReward_17324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_17324)e.getUnfinishedMessage();
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
               this.rewardId_ = ActivityZhangFeiMsg.S2C_LootReward_17324.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ActivityZhangFeiMsg.S2C_LootReward_17324.emptyIntList();
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

   public static final class C2S_LootEnjoy_17325 extends GeneratedMessageV3 implements C2S_LootEnjoy_17325OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_17325 DEFAULT_INSTANCE = new C2S_LootEnjoy_17325();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_17325> PARSER = new AbstractParser<C2S_LootEnjoy_17325>() {
         public C2S_LootEnjoy_17325 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_17325(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_17325(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_17325() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_17325();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_17325(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_17325.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_17325)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_17325 other = (C2S_LootEnjoy_17325)obj;
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

      public static C2S_LootEnjoy_17325 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_17325 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_17325 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_17325 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_17325 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_17325 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_17325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_17325 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_17325 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_17325 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_17325 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_17325 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_17325 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_17325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_17325 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_17325 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_17325> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_17325> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_17325 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_17325OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_17325.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_LootEnjoy_17325.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_LootEnjoy_17325_descriptor;
         }

         public C2S_LootEnjoy_17325 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_LootEnjoy_17325.getDefaultInstance();
         }

         public C2S_LootEnjoy_17325 build() {
            C2S_LootEnjoy_17325 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_17325 buildPartial() {
            C2S_LootEnjoy_17325 result = new C2S_LootEnjoy_17325(this);
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
            if (other instanceof C2S_LootEnjoy_17325) {
               return this.mergeFrom((C2S_LootEnjoy_17325)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_17325 other) {
            if (other == ActivityZhangFeiMsg.C2S_LootEnjoy_17325.getDefaultInstance()) {
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
            C2S_LootEnjoy_17325 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_17325)ActivityZhangFeiMsg.C2S_LootEnjoy_17325.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_17325)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_17326 extends GeneratedMessageV3 implements S2C_LootEnjoy_17326OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_17326 DEFAULT_INSTANCE = new S2C_LootEnjoy_17326();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_17326> PARSER = new AbstractParser<S2C_LootEnjoy_17326>() {
         public S2C_LootEnjoy_17326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_17326(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_17326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_17326() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_17326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_17326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_17326.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_17326)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_17326 other = (S2C_LootEnjoy_17326)obj;
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

      public static S2C_LootEnjoy_17326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_17326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_17326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_17326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_17326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_17326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_17326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_17326 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_17326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_17326 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_17326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_17326 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_17326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_17326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_17326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_17326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_17326> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_17326> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_17326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_17326OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_17326.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_LootEnjoy_17326.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_LootEnjoy_17326_descriptor;
         }

         public S2C_LootEnjoy_17326 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_LootEnjoy_17326.getDefaultInstance();
         }

         public S2C_LootEnjoy_17326 build() {
            S2C_LootEnjoy_17326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_17326 buildPartial() {
            S2C_LootEnjoy_17326 result = new S2C_LootEnjoy_17326(this);
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
            if (other instanceof S2C_LootEnjoy_17326) {
               return this.mergeFrom((S2C_LootEnjoy_17326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_17326 other) {
            if (other == ActivityZhangFeiMsg.S2C_LootEnjoy_17326.getDefaultInstance()) {
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
            S2C_LootEnjoy_17326 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_17326)ActivityZhangFeiMsg.S2C_LootEnjoy_17326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_17326)e.getUnfinishedMessage();
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

   public static final class C2S_AccumulateTotalInfo_17331 extends GeneratedMessageV3 implements C2S_AccumulateTotalInfo_17331OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AccumulateTotalInfo_17331 DEFAULT_INSTANCE = new C2S_AccumulateTotalInfo_17331();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AccumulateTotalInfo_17331> PARSER = new AbstractParser<C2S_AccumulateTotalInfo_17331>() {
         public C2S_AccumulateTotalInfo_17331 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AccumulateTotalInfo_17331(input, extensionRegistry);
         }
      };

      private C2S_AccumulateTotalInfo_17331(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AccumulateTotalInfo_17331() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AccumulateTotalInfo_17331();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AccumulateTotalInfo_17331(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccumulateTotalInfo_17331.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AccumulateTotalInfo_17331)) {
            return super.equals(obj);
         } else {
            C2S_AccumulateTotalInfo_17331 other = (C2S_AccumulateTotalInfo_17331)obj;
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

      public static C2S_AccumulateTotalInfo_17331 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccumulateTotalInfo_17331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(InputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_17331 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_17331 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccumulateTotalInfo_17331 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccumulateTotalInfo_17331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AccumulateTotalInfo_17331 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AccumulateTotalInfo_17331 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AccumulateTotalInfo_17331> parser() {
         return PARSER;
      }

      public Parser<C2S_AccumulateTotalInfo_17331> getParserForType() {
         return PARSER;
      }

      public C2S_AccumulateTotalInfo_17331 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AccumulateTotalInfo_17331OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccumulateTotalInfo_17331.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_AccumulateTotalInfo_17331.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_AccumulateTotalInfo_17331_descriptor;
         }

         public C2S_AccumulateTotalInfo_17331 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_AccumulateTotalInfo_17331.getDefaultInstance();
         }

         public C2S_AccumulateTotalInfo_17331 build() {
            C2S_AccumulateTotalInfo_17331 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AccumulateTotalInfo_17331 buildPartial() {
            C2S_AccumulateTotalInfo_17331 result = new C2S_AccumulateTotalInfo_17331(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AccumulateTotalInfo_17331) {
               return this.mergeFrom((C2S_AccumulateTotalInfo_17331)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AccumulateTotalInfo_17331 other) {
            if (other == ActivityZhangFeiMsg.C2S_AccumulateTotalInfo_17331.getDefaultInstance()) {
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
            C2S_AccumulateTotalInfo_17331 parsedMessage = null;

            try {
               parsedMessage = (C2S_AccumulateTotalInfo_17331)ActivityZhangFeiMsg.C2S_AccumulateTotalInfo_17331.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AccumulateTotalInfo_17331)e.getUnfinishedMessage();
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

   public static final class S2C_AccumulateTotalInfo_17332 extends GeneratedMessageV3 implements S2C_AccumulateTotalInfo_17332OrBuilder {
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
      private static final S2C_AccumulateTotalInfo_17332 DEFAULT_INSTANCE = new S2C_AccumulateTotalInfo_17332();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AccumulateTotalInfo_17332> PARSER = new AbstractParser<S2C_AccumulateTotalInfo_17332>() {
         public S2C_AccumulateTotalInfo_17332 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AccumulateTotalInfo_17332(input, extensionRegistry);
         }
      };

      private S2C_AccumulateTotalInfo_17332(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AccumulateTotalInfo_17332() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AccumulateTotalInfo_17332();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AccumulateTotalInfo_17332(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.nextUnlockReceiveReward_.add(input.readMessage(ActivityZhangFeiMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccumulateTotalInfo_17332.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AccumulateTotalInfo_17332)) {
            return super.equals(obj);
         } else {
            S2C_AccumulateTotalInfo_17332 other = (S2C_AccumulateTotalInfo_17332)obj;
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

      public static S2C_AccumulateTotalInfo_17332 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccumulateTotalInfo_17332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(InputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_17332 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_17332 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccumulateTotalInfo_17332 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccumulateTotalInfo_17332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AccumulateTotalInfo_17332 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AccumulateTotalInfo_17332 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AccumulateTotalInfo_17332> parser() {
         return PARSER;
      }

      public Parser<S2C_AccumulateTotalInfo_17332> getParserForType() {
         return PARSER;
      }

      public S2C_AccumulateTotalInfo_17332 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AccumulateTotalInfo_17332OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccumulateTotalInfo_17332.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.hasReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.hasReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_S2C_AccumulateTotalInfo_17332_descriptor;
         }

         public S2C_AccumulateTotalInfo_17332 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.getDefaultInstance();
         }

         public S2C_AccumulateTotalInfo_17332 build() {
            S2C_AccumulateTotalInfo_17332 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AccumulateTotalInfo_17332 buildPartial() {
            S2C_AccumulateTotalInfo_17332 result = new S2C_AccumulateTotalInfo_17332(this);
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
            if (other instanceof S2C_AccumulateTotalInfo_17332) {
               return this.mergeFrom((S2C_AccumulateTotalInfo_17332)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AccumulateTotalInfo_17332 other) {
            if (other == ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.getDefaultInstance()) {
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
                     this.nextUnlockReceiveRewardBuilder_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
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
            S2C_AccumulateTotalInfo_17332 parsedMessage = null;

            try {
               parsedMessage = (S2C_AccumulateTotalInfo_17332)ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AccumulateTotalInfo_17332)e.getUnfinishedMessage();
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
               this.canReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.mutableCopy(this.canReceiveRewardIds_);
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
            this.canReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.mutableCopy(this.hasReceiveRewardIds_);
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
            this.hasReceiveRewardIds_ = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.emptyIntList();
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
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(ActivityZhangFeiMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, ActivityZhangFeiMsg.NextUnlockReceiveReward.getDefaultInstance());
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
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
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.NextUnlockReceiveReward.getDefaultInstance();
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
            if (other == ActivityZhangFeiMsg.NextUnlockReceiveReward.getDefaultInstance()) {
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
               parsedMessage = (NextUnlockReceiveReward)ActivityZhangFeiMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ReceiveAccumulateReward_17333 extends GeneratedMessageV3 implements C2S_ReceiveAccumulateReward_17333OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveAccumulateReward_17333 DEFAULT_INSTANCE = new C2S_ReceiveAccumulateReward_17333();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveAccumulateReward_17333> PARSER = new AbstractParser<C2S_ReceiveAccumulateReward_17333>() {
         public C2S_ReceiveAccumulateReward_17333 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveAccumulateReward_17333(input, extensionRegistry);
         }
      };

      private C2S_ReceiveAccumulateReward_17333(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveAccumulateReward_17333() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveAccumulateReward_17333();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveAccumulateReward_17333(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAccumulateReward_17333.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveAccumulateReward_17333)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveAccumulateReward_17333 other = (C2S_ReceiveAccumulateReward_17333)obj;
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

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAccumulateReward_17333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAccumulateReward_17333 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAccumulateReward_17333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveAccumulateReward_17333 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveAccumulateReward_17333 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveAccumulateReward_17333> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveAccumulateReward_17333> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveAccumulateReward_17333 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveAccumulateReward_17333OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAccumulateReward_17333.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityZhangFeiMsg.C2S_ReceiveAccumulateReward_17333.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityZhangFeiMsg.internal_static_activityZhangFei_com_gzbz_protobuf_C2S_ReceiveAccumulateReward_17333_descriptor;
         }

         public C2S_ReceiveAccumulateReward_17333 getDefaultInstanceForType() {
            return ActivityZhangFeiMsg.C2S_ReceiveAccumulateReward_17333.getDefaultInstance();
         }

         public C2S_ReceiveAccumulateReward_17333 build() {
            C2S_ReceiveAccumulateReward_17333 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveAccumulateReward_17333 buildPartial() {
            C2S_ReceiveAccumulateReward_17333 result = new C2S_ReceiveAccumulateReward_17333(this);
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
            if (other instanceof C2S_ReceiveAccumulateReward_17333) {
               return this.mergeFrom((C2S_ReceiveAccumulateReward_17333)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveAccumulateReward_17333 other) {
            if (other == ActivityZhangFeiMsg.C2S_ReceiveAccumulateReward_17333.getDefaultInstance()) {
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
            C2S_ReceiveAccumulateReward_17333 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveAccumulateReward_17333)ActivityZhangFeiMsg.C2S_ReceiveAccumulateReward_17333.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveAccumulateReward_17333)e.getUnfinishedMessage();
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

   public interface C2S_AccumulateTotalInfo_17331OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_HeroThemeInfo_17301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootEnjoy_17325OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_17321OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_17323OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_MatchBattle_17311OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Mate_17303OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PointReward_17307OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveAccumulateReward_17333OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_TaskCommitTask_17313OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_AccumulateTotalInfo_17332OrBuilder extends MessageOrBuilder {
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

   public interface S2C_HeroThemeInfo_17302OrBuilder extends MessageOrBuilder {
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

   public interface S2C_LootEnjoy_17326OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_17322OrBuilder extends MessageOrBuilder {
      boolean hasEnjoyId();

      int getEnjoyId();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();
   }

   public interface S2C_LootReward_17324OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasHadEnjoy();

      boolean getHadEnjoy();
   }

   public interface S2C_MatchBattle_17312OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasFightNum();

      int getFightNum();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasTotalPoint();

      int getTotalPoint();
   }

   public interface S2C_Mate_17304OrBuilder extends MessageOrBuilder {
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

   public interface S2C_PointReward_17308OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TaskCommitTask_17314OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TaskModify_17316OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }
}
