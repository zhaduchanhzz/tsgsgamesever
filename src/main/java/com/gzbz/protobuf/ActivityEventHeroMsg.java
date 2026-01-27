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

public final class ActivityEventHeroMsg {
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityEventHeroMsg() {
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
      String[] descriptorData = new String[]{"\n\u0017ActivityEventHero.proto\u0012#activityEventHero.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0019\n\u0017C2S_HeroThemeInfo_20901\"ï\u0001\n\u0017S2C_HeroThemeInfo_20902\u0012\r\n\u0005fight\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bfightReward\u0018\u0003 \u0003(\u0005\u0012\u0012\n\ntotalPoint\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0005 \u0003(\u0005\u0012\u0011\n\tstartTime\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0007 \u0002(\u0005\u0012\u0015\n\rserverOpenDay\u0018\b \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\t \u0002(\u0005\u0012\u000e\n\u0006mainId\u0018\n \u0002(\u0005\u0012\u0012\n\nreceiveBox\u0018\u000b \u0001(\b\"\u0010\n\u000eC2S_Mate_20903\"\u0081\u0001\n\u000eS2C_Mate_20904\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012,\n\barraying\u0018\u0002 \u0002(\u000b2\u001a.common.PlayerArrayingInfo\u0012\u0011\n\tmonarchId\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0006 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0007 \u0002(\u0005\"#\n\u0015C2S_PointReward_20907\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"#\n\u0015S2C_PointReward_20908\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0017\n\u0015C2S_MatchBattle_20911\"b\n\u0015S2C_MatchBattle_20912\u0012\u000e\n\u0006damage\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000btotalDamage\u0018\u0004 \u0002(\u0003\u0012\u0012\n\ntotalPoint\u0018\u0005 \u0002(\u0005\"\u0014\n\u0012C2S_LootInfo_20921\"\u0086\u0001\n\u0012S2C_LootInfo_20922\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fdailyDrawNum\u0018\u0004 \u0002(\u0005\u0012#\n\benjoyNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\"#\n\u0014C2S_LootReward_20923\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"\u0089\u0001\n\u0014S2C_LootReward_20924\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u0012\n\ncurLootNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bhadEnjoy\u0018\u0003 \u0002(\b\u0012\u0014\n\fdailyDrawNum\u0018\u0004 \u0002(\u0005\u0012#\n\benjoyNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\"!\n\u0013C2S_LootEnjoy_20925\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_20926\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0014C2S_CommitTask_20941\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_20942\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aC2S_ActivityTaskList_20944\"P\n\u001aS2C_ActivityTaskList_20945\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"R\n\u001cS2C_ActivityTaskNotify_20946\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0016\n\u0014C2S_ReceiveBox_20947\"*\n\u0014S2C_ReceiveBox_20948\u0012\u0012\n\nreceiveBox\u0018\u0001 \u0002(\b\"q\n\u0019C2S_OptionalGiftBuy_20949\u0012\u0010\n\bcustomId\u0018\u0001 \u0002(\u0005\u0012B\n\u0007buyData\u0018\u0002 \u0003(\u000b21.activity.com.gzbz.protobuf.CustomGiftBuyItemData\"_\n\u0019S2C_OptionalGiftBuy_20950\u0012B\n\u0007buyData\u0018\u0001 \u0003(\u000b21.activity.com.gzbz.protobuf.CustomGiftBuyItemDataB+\n\u0011com.gzbz.protobufB\u0014ActivityEventHeroMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor, new String[]{"Fight", "TotalDamage", "FightReward", "TotalPoint", "PointReward", "StartTime", "EndTime", "ServerOpenDay", "ActivityDay", "MainId", "ReceiveBox"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor, new String[]{"Power", "Arraying", "MonarchId", "PlayerName", "Sex"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor, new String[]{"Id"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor, new String[]{"Id"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor, new String[]{"Damage", "FightNum", "TotalDamage", "TotalPoint"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor, new String[]{"EnjoyId", "RewardId", "CurLootNum", "DailyDrawNum", "EnjoyNum"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor, new String[]{"Num"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor, new String[]{"RewardId", "CurLootNum", "HadEnjoy", "DailyDrawNum", "EnjoyNum"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor, new String[]{"Id"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor, new String[]{"Id"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor, new String[]{"TaskId"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor, new String[]{"TaskId"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor, new String[]{"Task"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor, new String[]{"Task"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor, new String[0]);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor, new String[]{"ReceiveBox"});
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor, new String[]{"CustomId", "BuyData"});
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor, new String[]{"BuyData"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_HeroThemeInfo_20901 extends GeneratedMessageV3 implements C2S_HeroThemeInfo_20901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroThemeInfo_20901 DEFAULT_INSTANCE = new C2S_HeroThemeInfo_20901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroThemeInfo_20901> PARSER = new AbstractParser<C2S_HeroThemeInfo_20901>() {
         public C2S_HeroThemeInfo_20901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroThemeInfo_20901(input, extensionRegistry);
         }
      };

      private C2S_HeroThemeInfo_20901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroThemeInfo_20901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroThemeInfo_20901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroThemeInfo_20901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_20901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroThemeInfo_20901)) {
            return super.equals(obj);
         } else {
            C2S_HeroThemeInfo_20901 other = (C2S_HeroThemeInfo_20901)obj;
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

      public static C2S_HeroThemeInfo_20901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroThemeInfo_20901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroThemeInfo_20901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroThemeInfo_20901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroThemeInfo_20901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroThemeInfo_20901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroThemeInfo_20901> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroThemeInfo_20901> getParserForType() {
         return PARSER;
      }

      public C2S_HeroThemeInfo_20901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroThemeInfo_20901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroThemeInfo_20901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_HeroThemeInfo_20901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_HeroThemeInfo_20901_descriptor;
         }

         public C2S_HeroThemeInfo_20901 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_HeroThemeInfo_20901.getDefaultInstance();
         }

         public C2S_HeroThemeInfo_20901 build() {
            C2S_HeroThemeInfo_20901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroThemeInfo_20901 buildPartial() {
            C2S_HeroThemeInfo_20901 result = new C2S_HeroThemeInfo_20901(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroThemeInfo_20901) {
               return this.mergeFrom((C2S_HeroThemeInfo_20901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroThemeInfo_20901 other) {
            if (other == ActivityEventHeroMsg.C2S_HeroThemeInfo_20901.getDefaultInstance()) {
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
            C2S_HeroThemeInfo_20901 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroThemeInfo_20901)ActivityEventHeroMsg.C2S_HeroThemeInfo_20901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroThemeInfo_20901)e.getUnfinishedMessage();
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

   public static final class S2C_HeroThemeInfo_20902 extends GeneratedMessageV3 implements S2C_HeroThemeInfo_20902OrBuilder {
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
      public static final int STARTTIME_FIELD_NUMBER = 6;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 7;
      private int endTime_;
      public static final int SERVEROPENDAY_FIELD_NUMBER = 8;
      private int serverOpenDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 9;
      private int activityDay_;
      public static final int MAINID_FIELD_NUMBER = 10;
      private int mainId_;
      public static final int RECEIVEBOX_FIELD_NUMBER = 11;
      private boolean receiveBox_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroThemeInfo_20902 DEFAULT_INSTANCE = new S2C_HeroThemeInfo_20902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroThemeInfo_20902> PARSER = new AbstractParser<S2C_HeroThemeInfo_20902>() {
         public S2C_HeroThemeInfo_20902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroThemeInfo_20902(input, extensionRegistry);
         }
      };

      private S2C_HeroThemeInfo_20902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroThemeInfo_20902() {
         this.memoizedIsInitialized = -1;
         this.fightReward_ = emptyIntList();
         this.pointReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroThemeInfo_20902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroThemeInfo_20902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 48:
                        this.bitField0_ |= 8;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.endTime_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.serverOpenDay_ = input.readInt32();
                        continue;
                     case 72:
                        this.bitField0_ |= 64;
                        this.activityDay_ = input.readInt32();
                        continue;
                     case 80:
                        this.bitField0_ |= 128;
                        this.mainId_ = input.readInt32();
                        continue;
                     case 88:
                        this.bitField0_ |= 256;
                        this.receiveBox_ = input.readBool();
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

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_20902.class, Builder.class);
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

      public boolean hasMainId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getMainId() {
         return this.mainId_;
      }

      public boolean hasReceiveBox() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getReceiveBox() {
         return this.receiveBox_;
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
         } else if (!this.hasMainId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
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

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.startTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.endTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.serverOpenDay_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.activityDay_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(10, this.mainId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(11, this.receiveBox_);
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
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.startTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.endTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.serverOpenDay_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.activityDay_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.mainId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(11, this.receiveBox_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroThemeInfo_20902)) {
            return super.equals(obj);
         } else {
            S2C_HeroThemeInfo_20902 other = (S2C_HeroThemeInfo_20902)obj;
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
            } else if (this.hasMainId() != other.hasMainId()) {
               return false;
            } else if (this.hasMainId() && this.getMainId() != other.getMainId()) {
               return false;
            } else if (this.hasReceiveBox() != other.hasReceiveBox()) {
               return false;
            } else if (this.hasReceiveBox() && this.getReceiveBox() != other.getReceiveBox()) {
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

            if (this.hasStartTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasServerOpenDay()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getServerOpenDay();
            }

            if (this.hasActivityDay()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.hasMainId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getMainId();
            }

            if (this.hasReceiveBox()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + Internal.hashBoolean(this.getReceiveBox());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroThemeInfo_20902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroThemeInfo_20902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroThemeInfo_20902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroThemeInfo_20902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroThemeInfo_20902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroThemeInfo_20902> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroThemeInfo_20902> getParserForType() {
         return PARSER;
      }

      public S2C_HeroThemeInfo_20902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroThemeInfo_20902OrBuilder {
         private int bitField0_;
         private int fight_;
         private long totalDamage_;
         private Internal.IntList fightReward_;
         private int totalPoint_;
         private Internal.IntList pointReward_;
         private int startTime_;
         private int endTime_;
         private int serverOpenDay_;
         private int activityDay_;
         private int mainId_;
         private boolean receiveBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroThemeInfo_20902.class, Builder.class);
         }

         private Builder() {
            this.fightReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.pointReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.pointReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fight_ = 0;
            this.bitField0_ &= -2;
            this.totalDamage_ = 0L;
            this.bitField0_ &= -3;
            this.fightReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.bitField0_ &= -5;
            this.totalPoint_ = 0;
            this.bitField0_ &= -9;
            this.pointReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.bitField0_ &= -17;
            this.startTime_ = 0;
            this.bitField0_ &= -33;
            this.endTime_ = 0;
            this.bitField0_ &= -65;
            this.serverOpenDay_ = 0;
            this.bitField0_ &= -129;
            this.activityDay_ = 0;
            this.bitField0_ &= -257;
            this.mainId_ = 0;
            this.bitField0_ &= -513;
            this.receiveBox_ = false;
            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_HeroThemeInfo_20902_descriptor;
         }

         public S2C_HeroThemeInfo_20902 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.getDefaultInstance();
         }

         public S2C_HeroThemeInfo_20902 build() {
            S2C_HeroThemeInfo_20902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroThemeInfo_20902 buildPartial() {
            S2C_HeroThemeInfo_20902 result = new S2C_HeroThemeInfo_20902(this);
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
            if ((from_bitField0_ & 32) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverOpenDay_ = this.serverOpenDay_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.mainId_ = this.mainId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.receiveBox_ = this.receiveBox_;
               to_bitField0_ |= 256;
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
            if (other instanceof S2C_HeroThemeInfo_20902) {
               return this.mergeFrom((S2C_HeroThemeInfo_20902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroThemeInfo_20902 other) {
            if (other == ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.getDefaultInstance()) {
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

               if (other.hasMainId()) {
                  this.setMainId(other.getMainId());
               }

               if (other.hasReceiveBox()) {
                  this.setReceiveBox(other.getReceiveBox());
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
               return this.hasMainId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroThemeInfo_20902 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroThemeInfo_20902)ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroThemeInfo_20902)e.getUnfinishedMessage();
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
               this.fightReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.mutableCopy(this.fightReward_);
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
            this.fightReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
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
               this.pointReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.mutableCopy(this.pointReward_);
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
            this.pointReward_ = ActivityEventHeroMsg.S2C_HeroThemeInfo_20902.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 32;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -33;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 64;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -65;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerOpenDay() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerOpenDay() {
            return this.serverOpenDay_;
         }

         public Builder setServerOpenDay(int value) {
            this.bitField0_ |= 128;
            this.serverOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerOpenDay() {
            this.bitField0_ &= -129;
            this.serverOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 256;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -257;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getMainId() {
            return this.mainId_;
         }

         public Builder setMainId(int value) {
            this.bitField0_ |= 512;
            this.mainId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainId() {
            this.bitField0_ &= -513;
            this.mainId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReceiveBox() {
            return (this.bitField0_ & 1024) != 0;
         }

         public boolean getReceiveBox() {
            return this.receiveBox_;
         }

         public Builder setReceiveBox(boolean value) {
            this.bitField0_ |= 1024;
            this.receiveBox_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReceiveBox() {
            this.bitField0_ &= -1025;
            this.receiveBox_ = false;
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

   public static final class C2S_Mate_20903 extends GeneratedMessageV3 implements C2S_Mate_20903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Mate_20903 DEFAULT_INSTANCE = new C2S_Mate_20903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Mate_20903> PARSER = new AbstractParser<C2S_Mate_20903>() {
         public C2S_Mate_20903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Mate_20903(input, extensionRegistry);
         }
      };

      private C2S_Mate_20903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Mate_20903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Mate_20903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Mate_20903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_20903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Mate_20903)) {
            return super.equals(obj);
         } else {
            C2S_Mate_20903 other = (C2S_Mate_20903)obj;
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

      public static C2S_Mate_20903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data);
      }

      public static C2S_Mate_20903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Mate_20903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Mate_20903 parseFrom(InputStream input) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_20903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_20903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Mate_20903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Mate_20903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Mate_20903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Mate_20903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Mate_20903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Mate_20903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Mate_20903> parser() {
         return PARSER;
      }

      public Parser<C2S_Mate_20903> getParserForType() {
         return PARSER;
      }

      public C2S_Mate_20903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Mate_20903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Mate_20903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_Mate_20903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_Mate_20903_descriptor;
         }

         public C2S_Mate_20903 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_Mate_20903.getDefaultInstance();
         }

         public C2S_Mate_20903 build() {
            C2S_Mate_20903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Mate_20903 buildPartial() {
            C2S_Mate_20903 result = new C2S_Mate_20903(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Mate_20903) {
               return this.mergeFrom((C2S_Mate_20903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Mate_20903 other) {
            if (other == ActivityEventHeroMsg.C2S_Mate_20903.getDefaultInstance()) {
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
            C2S_Mate_20903 parsedMessage = null;

            try {
               parsedMessage = (C2S_Mate_20903)ActivityEventHeroMsg.C2S_Mate_20903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Mate_20903)e.getUnfinishedMessage();
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

   public static final class S2C_Mate_20904 extends GeneratedMessageV3 implements S2C_Mate_20904OrBuilder {
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
      private static final S2C_Mate_20904 DEFAULT_INSTANCE = new S2C_Mate_20904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Mate_20904> PARSER = new AbstractParser<S2C_Mate_20904>() {
         public S2C_Mate_20904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Mate_20904(input, extensionRegistry);
         }
      };

      private S2C_Mate_20904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Mate_20904() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Mate_20904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Mate_20904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_20904.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Mate_20904)) {
            return super.equals(obj);
         } else {
            S2C_Mate_20904 other = (S2C_Mate_20904)obj;
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

      public static S2C_Mate_20904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data);
      }

      public static S2C_Mate_20904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Mate_20904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Mate_20904 parseFrom(InputStream input) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_20904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_20904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Mate_20904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Mate_20904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Mate_20904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Mate_20904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Mate_20904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Mate_20904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Mate_20904> parser() {
         return PARSER;
      }

      public Parser<S2C_Mate_20904> getParserForType() {
         return PARSER;
      }

      public S2C_Mate_20904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Mate_20904OrBuilder {
         private int bitField0_;
         private long power_;
         private CommonMsg.PlayerArrayingInfo arraying_;
         private SingleFieldBuilderV3<CommonMsg.PlayerArrayingInfo, CommonMsg.PlayerArrayingInfo.Builder, CommonMsg.PlayerArrayingInfoOrBuilder> arrayingBuilder_;
         private int monarchId_;
         private Object playerName_;
         private int sex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Mate_20904.class, Builder.class);
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
            if (ActivityEventHeroMsg.S2C_Mate_20904.alwaysUseFieldBuilders) {
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
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_Mate_20904_descriptor;
         }

         public S2C_Mate_20904 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_Mate_20904.getDefaultInstance();
         }

         public S2C_Mate_20904 build() {
            S2C_Mate_20904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Mate_20904 buildPartial() {
            S2C_Mate_20904 result = new S2C_Mate_20904(this);
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
            if (other instanceof S2C_Mate_20904) {
               return this.mergeFrom((S2C_Mate_20904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Mate_20904 other) {
            if (other == ActivityEventHeroMsg.S2C_Mate_20904.getDefaultInstance()) {
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
            S2C_Mate_20904 parsedMessage = null;

            try {
               parsedMessage = (S2C_Mate_20904)ActivityEventHeroMsg.S2C_Mate_20904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Mate_20904)e.getUnfinishedMessage();
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
            this.playerName_ = ActivityEventHeroMsg.S2C_Mate_20904.getDefaultInstance().getPlayerName();
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

   public static final class C2S_PointReward_20907 extends GeneratedMessageV3 implements C2S_PointReward_20907OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PointReward_20907 DEFAULT_INSTANCE = new C2S_PointReward_20907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointReward_20907> PARSER = new AbstractParser<C2S_PointReward_20907>() {
         public C2S_PointReward_20907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointReward_20907(input, extensionRegistry);
         }
      };

      private C2S_PointReward_20907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointReward_20907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointReward_20907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointReward_20907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_20907.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointReward_20907)) {
            return super.equals(obj);
         } else {
            C2S_PointReward_20907 other = (C2S_PointReward_20907)obj;
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

      public static C2S_PointReward_20907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data);
      }

      public static C2S_PointReward_20907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointReward_20907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointReward_20907 parseFrom(InputStream input) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_20907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointReward_20907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointReward_20907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointReward_20907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointReward_20907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointReward_20907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointReward_20907> parser() {
         return PARSER;
      }

      public Parser<C2S_PointReward_20907> getParserForType() {
         return PARSER;
      }

      public C2S_PointReward_20907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointReward_20907OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointReward_20907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_PointReward_20907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_PointReward_20907_descriptor;
         }

         public C2S_PointReward_20907 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_PointReward_20907.getDefaultInstance();
         }

         public C2S_PointReward_20907 build() {
            C2S_PointReward_20907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointReward_20907 buildPartial() {
            C2S_PointReward_20907 result = new C2S_PointReward_20907(this);
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
            if (other instanceof C2S_PointReward_20907) {
               return this.mergeFrom((C2S_PointReward_20907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointReward_20907 other) {
            if (other == ActivityEventHeroMsg.C2S_PointReward_20907.getDefaultInstance()) {
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
            C2S_PointReward_20907 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointReward_20907)ActivityEventHeroMsg.C2S_PointReward_20907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointReward_20907)e.getUnfinishedMessage();
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

   public static final class S2C_PointReward_20908 extends GeneratedMessageV3 implements S2C_PointReward_20908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_PointReward_20908 DEFAULT_INSTANCE = new S2C_PointReward_20908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointReward_20908> PARSER = new AbstractParser<S2C_PointReward_20908>() {
         public S2C_PointReward_20908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointReward_20908(input, extensionRegistry);
         }
      };

      private S2C_PointReward_20908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointReward_20908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointReward_20908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointReward_20908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_20908.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PointReward_20908)) {
            return super.equals(obj);
         } else {
            S2C_PointReward_20908 other = (S2C_PointReward_20908)obj;
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

      public static S2C_PointReward_20908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data);
      }

      public static S2C_PointReward_20908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointReward_20908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointReward_20908 parseFrom(InputStream input) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_20908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointReward_20908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointReward_20908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointReward_20908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointReward_20908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointReward_20908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointReward_20908> parser() {
         return PARSER;
      }

      public Parser<S2C_PointReward_20908> getParserForType() {
         return PARSER;
      }

      public S2C_PointReward_20908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointReward_20908OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointReward_20908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_PointReward_20908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_PointReward_20908_descriptor;
         }

         public S2C_PointReward_20908 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_PointReward_20908.getDefaultInstance();
         }

         public S2C_PointReward_20908 build() {
            S2C_PointReward_20908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointReward_20908 buildPartial() {
            S2C_PointReward_20908 result = new S2C_PointReward_20908(this);
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
            if (other instanceof S2C_PointReward_20908) {
               return this.mergeFrom((S2C_PointReward_20908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointReward_20908 other) {
            if (other == ActivityEventHeroMsg.S2C_PointReward_20908.getDefaultInstance()) {
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
            S2C_PointReward_20908 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointReward_20908)ActivityEventHeroMsg.S2C_PointReward_20908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointReward_20908)e.getUnfinishedMessage();
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

   public static final class C2S_MatchBattle_20911 extends GeneratedMessageV3 implements C2S_MatchBattle_20911OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MatchBattle_20911 DEFAULT_INSTANCE = new C2S_MatchBattle_20911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MatchBattle_20911> PARSER = new AbstractParser<C2S_MatchBattle_20911>() {
         public C2S_MatchBattle_20911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MatchBattle_20911(input, extensionRegistry);
         }
      };

      private C2S_MatchBattle_20911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MatchBattle_20911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MatchBattle_20911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MatchBattle_20911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_20911.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MatchBattle_20911)) {
            return super.equals(obj);
         } else {
            C2S_MatchBattle_20911 other = (C2S_MatchBattle_20911)obj;
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

      public static C2S_MatchBattle_20911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data);
      }

      public static C2S_MatchBattle_20911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MatchBattle_20911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MatchBattle_20911 parseFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_20911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MatchBattle_20911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MatchBattle_20911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MatchBattle_20911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MatchBattle_20911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MatchBattle_20911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MatchBattle_20911> parser() {
         return PARSER;
      }

      public Parser<C2S_MatchBattle_20911> getParserForType() {
         return PARSER;
      }

      public C2S_MatchBattle_20911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MatchBattle_20911OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MatchBattle_20911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_MatchBattle_20911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_MatchBattle_20911_descriptor;
         }

         public C2S_MatchBattle_20911 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_MatchBattle_20911.getDefaultInstance();
         }

         public C2S_MatchBattle_20911 build() {
            C2S_MatchBattle_20911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MatchBattle_20911 buildPartial() {
            C2S_MatchBattle_20911 result = new C2S_MatchBattle_20911(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MatchBattle_20911) {
               return this.mergeFrom((C2S_MatchBattle_20911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MatchBattle_20911 other) {
            if (other == ActivityEventHeroMsg.C2S_MatchBattle_20911.getDefaultInstance()) {
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
            C2S_MatchBattle_20911 parsedMessage = null;

            try {
               parsedMessage = (C2S_MatchBattle_20911)ActivityEventHeroMsg.C2S_MatchBattle_20911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MatchBattle_20911)e.getUnfinishedMessage();
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

   public static final class S2C_MatchBattle_20912 extends GeneratedMessageV3 implements S2C_MatchBattle_20912OrBuilder {
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
      private static final S2C_MatchBattle_20912 DEFAULT_INSTANCE = new S2C_MatchBattle_20912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MatchBattle_20912> PARSER = new AbstractParser<S2C_MatchBattle_20912>() {
         public S2C_MatchBattle_20912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MatchBattle_20912(input, extensionRegistry);
         }
      };

      private S2C_MatchBattle_20912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MatchBattle_20912() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MatchBattle_20912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MatchBattle_20912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_20912.class, Builder.class);
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
         } else if (!(obj instanceof S2C_MatchBattle_20912)) {
            return super.equals(obj);
         } else {
            S2C_MatchBattle_20912 other = (S2C_MatchBattle_20912)obj;
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

      public static S2C_MatchBattle_20912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data);
      }

      public static S2C_MatchBattle_20912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MatchBattle_20912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MatchBattle_20912 parseFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_20912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MatchBattle_20912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MatchBattle_20912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MatchBattle_20912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MatchBattle_20912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MatchBattle_20912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MatchBattle_20912> parser() {
         return PARSER;
      }

      public Parser<S2C_MatchBattle_20912> getParserForType() {
         return PARSER;
      }

      public S2C_MatchBattle_20912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MatchBattle_20912OrBuilder {
         private int bitField0_;
         private long damage_;
         private int fightNum_;
         private long totalDamage_;
         private int totalPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MatchBattle_20912.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_MatchBattle_20912.alwaysUseFieldBuilders) {
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
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_MatchBattle_20912_descriptor;
         }

         public S2C_MatchBattle_20912 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_MatchBattle_20912.getDefaultInstance();
         }

         public S2C_MatchBattle_20912 build() {
            S2C_MatchBattle_20912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MatchBattle_20912 buildPartial() {
            S2C_MatchBattle_20912 result = new S2C_MatchBattle_20912(this);
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
            if (other instanceof S2C_MatchBattle_20912) {
               return this.mergeFrom((S2C_MatchBattle_20912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MatchBattle_20912 other) {
            if (other == ActivityEventHeroMsg.S2C_MatchBattle_20912.getDefaultInstance()) {
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
            S2C_MatchBattle_20912 parsedMessage = null;

            try {
               parsedMessage = (S2C_MatchBattle_20912)ActivityEventHeroMsg.S2C_MatchBattle_20912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MatchBattle_20912)e.getUnfinishedMessage();
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

   public static final class C2S_LootInfo_20921 extends GeneratedMessageV3 implements C2S_LootInfo_20921OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_20921 DEFAULT_INSTANCE = new C2S_LootInfo_20921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_20921> PARSER = new AbstractParser<C2S_LootInfo_20921>() {
         public C2S_LootInfo_20921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_20921(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_20921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_20921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_20921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_20921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_20921)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_20921 other = (C2S_LootInfo_20921)obj;
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

      public static C2S_LootInfo_20921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20921 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_20921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_20921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_20921> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_20921> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_20921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_20921OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_LootInfo_20921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootInfo_20921_descriptor;
         }

         public C2S_LootInfo_20921 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_LootInfo_20921.getDefaultInstance();
         }

         public C2S_LootInfo_20921 build() {
            C2S_LootInfo_20921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_20921 buildPartial() {
            C2S_LootInfo_20921 result = new C2S_LootInfo_20921(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_20921) {
               return this.mergeFrom((C2S_LootInfo_20921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_20921 other) {
            if (other == ActivityEventHeroMsg.C2S_LootInfo_20921.getDefaultInstance()) {
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
            C2S_LootInfo_20921 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_20921)ActivityEventHeroMsg.C2S_LootInfo_20921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_20921)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_20922 extends GeneratedMessageV3 implements S2C_LootInfo_20922OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOYID_FIELD_NUMBER = 1;
      private int enjoyId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 4;
      private int dailyDrawNum_;
      public static final int ENJOYNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> enjoyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootInfo_20922 DEFAULT_INSTANCE = new S2C_LootInfo_20922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_20922> PARSER = new AbstractParser<S2C_LootInfo_20922>() {
         public S2C_LootInfo_20922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_20922(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_20922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_20922() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.enjoyNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_20922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_20922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 32:
                        this.bitField0_ |= 4;
                        this.dailyDrawNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.enjoyNum_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.enjoyNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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

               if ((mutable_bitField0_ & 16) != 0) {
                  this.enjoyNum_ = Collections.unmodifiableList(this.enjoyNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20922.class, Builder.class);
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

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
      }

      public List<CommonMsg.MapDataII> getEnjoyNumList() {
         return this.enjoyNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList() {
         return this.enjoyNum_;
      }

      public int getEnjoyNumCount() {
         return this.enjoyNum_.size();
      }

      public CommonMsg.MapDataII getEnjoyNum(int index) {
         return (CommonMsg.MapDataII)this.enjoyNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.enjoyNum_.get(index);
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
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEnjoyNumCount(); ++i) {
               if (!this.getEnjoyNum(i).isInitialized()) {
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
            output.writeInt32(1, this.enjoyId_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(2, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.curLootNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.dailyDrawNum_);
         }

         for(int i = 0; i < this.enjoyNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.enjoyNum_.get(i));
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

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dailyDrawNum_);
            }

            for(int i = 0; i < this.enjoyNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.enjoyNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootInfo_20922)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_20922 other = (S2C_LootInfo_20922)obj;
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
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
               return false;
            } else if (!this.getEnjoyNumList().equals(other.getEnjoyNumList())) {
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

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            if (this.getEnjoyNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEnjoyNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootInfo_20922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20922 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_20922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_20922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_20922> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_20922> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_20922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_20922OrBuilder {
         private int bitField0_;
         private int enjoyId_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private int dailyDrawNum_;
         private List<CommonMsg.MapDataII> enjoyNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> enjoyNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20922.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootInfo_20922.emptyIntList();
            this.enjoyNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootInfo_20922.emptyIntList();
            this.enjoyNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_LootInfo_20922.alwaysUseFieldBuilders) {
               this.getEnjoyNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootInfo_20922.emptyIntList();
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -9;
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.enjoyNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootInfo_20922_descriptor;
         }

         public S2C_LootInfo_20922 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_LootInfo_20922.getDefaultInstance();
         }

         public S2C_LootInfo_20922 build() {
            S2C_LootInfo_20922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_20922 buildPartial() {
            S2C_LootInfo_20922 result = new S2C_LootInfo_20922(this);
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

            if ((from_bitField0_ & 8) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
               to_bitField0_ |= 4;
            }

            if (this.enjoyNumBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.enjoyNum_ = Collections.unmodifiableList(this.enjoyNum_);
                  this.bitField0_ &= -17;
               }

               result.enjoyNum_ = this.enjoyNum_;
            } else {
               result.enjoyNum_ = this.enjoyNumBuilder_.build();
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
            if (other instanceof S2C_LootInfo_20922) {
               return this.mergeFrom((S2C_LootInfo_20922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_20922 other) {
            if (other == ActivityEventHeroMsg.S2C_LootInfo_20922.getDefaultInstance()) {
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

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               if (this.enjoyNumBuilder_ == null) {
                  if (!other.enjoyNum_.isEmpty()) {
                     if (this.enjoyNum_.isEmpty()) {
                        this.enjoyNum_ = other.enjoyNum_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEnjoyNumIsMutable();
                        this.enjoyNum_.addAll(other.enjoyNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.enjoyNum_.isEmpty()) {
                  if (this.enjoyNumBuilder_.isEmpty()) {
                     this.enjoyNumBuilder_.dispose();
                     this.enjoyNumBuilder_ = null;
                     this.enjoyNum_ = other.enjoyNum_;
                     this.bitField0_ &= -17;
                     this.enjoyNumBuilder_ = ActivityEventHeroMsg.S2C_LootInfo_20922.alwaysUseFieldBuilders ? this.getEnjoyNumFieldBuilder() : null;
                  } else {
                     this.enjoyNumBuilder_.addAllMessages(other.enjoyNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEnjoyId()) {
               return false;
            } else if (!this.hasCurLootNum()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getEnjoyNumCount(); ++i) {
                  if (!this.getEnjoyNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootInfo_20922 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_20922)ActivityEventHeroMsg.S2C_LootInfo_20922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_20922)e.getUnfinishedMessage();
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
               this.rewardId_ = ActivityEventHeroMsg.S2C_LootInfo_20922.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootInfo_20922.emptyIntList();
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

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 8;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -9;
            this.dailyDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEnjoyNumIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.enjoyNum_ = new ArrayList(this.enjoyNum_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getEnjoyNumList() {
            return this.enjoyNumBuilder_ == null ? Collections.unmodifiableList(this.enjoyNum_) : this.enjoyNumBuilder_.getMessageList();
         }

         public int getEnjoyNumCount() {
            return this.enjoyNumBuilder_ == null ? this.enjoyNum_.size() : this.enjoyNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getEnjoyNum(int index) {
            return this.enjoyNumBuilder_ == null ? (CommonMsg.MapDataII)this.enjoyNum_.get(index) : (CommonMsg.MapDataII)this.enjoyNumBuilder_.getMessage(index);
         }

         public Builder setEnjoyNum(int index, CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.set(index, value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEnjoyNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEnjoyNum(CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEnjoyNum(int index, CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(index, value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEnjoyNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEnjoyNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEnjoyNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.enjoyNum_);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEnjoyNum() {
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeEnjoyNum(int index) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.remove(index);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getEnjoyNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index) {
            return this.enjoyNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.enjoyNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.enjoyNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList() {
            return this.enjoyNumBuilder_ != null ? this.enjoyNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.enjoyNum_);
         }

         public CommonMsg.MapDataII.Builder addEnjoyNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addEnjoyNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getEnjoyNumBuilderList() {
            return this.getEnjoyNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getEnjoyNumFieldBuilder() {
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNumBuilder_ = new RepeatedFieldBuilderV3(this.enjoyNum_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.enjoyNum_ = null;
            }

            return this.enjoyNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LootReward_20923 extends GeneratedMessageV3 implements C2S_LootReward_20923OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_20923 DEFAULT_INSTANCE = new C2S_LootReward_20923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_20923> PARSER = new AbstractParser<C2S_LootReward_20923>() {
         public C2S_LootReward_20923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_20923(input, extensionRegistry);
         }
      };

      private C2S_LootReward_20923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_20923() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_20923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_20923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20923.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_20923)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_20923 other = (C2S_LootReward_20923)obj;
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

      public static C2S_LootReward_20923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20923 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_20923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_20923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_20923> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_20923> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_20923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_20923OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20923.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_LootReward_20923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootReward_20923_descriptor;
         }

         public C2S_LootReward_20923 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_LootReward_20923.getDefaultInstance();
         }

         public C2S_LootReward_20923 build() {
            C2S_LootReward_20923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_20923 buildPartial() {
            C2S_LootReward_20923 result = new C2S_LootReward_20923(this);
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
            if (other instanceof C2S_LootReward_20923) {
               return this.mergeFrom((C2S_LootReward_20923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_20923 other) {
            if (other == ActivityEventHeroMsg.C2S_LootReward_20923.getDefaultInstance()) {
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
            C2S_LootReward_20923 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_20923)ActivityEventHeroMsg.C2S_LootReward_20923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_20923)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_20924 extends GeneratedMessageV3 implements S2C_LootReward_20924OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 2;
      private int curLootNum_;
      public static final int HADENJOY_FIELD_NUMBER = 3;
      private boolean hadEnjoy_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 4;
      private int dailyDrawNum_;
      public static final int ENJOYNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> enjoyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_20924 DEFAULT_INSTANCE = new S2C_LootReward_20924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_20924> PARSER = new AbstractParser<S2C_LootReward_20924>() {
         public S2C_LootReward_20924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_20924(input, extensionRegistry);
         }
      };

      private S2C_LootReward_20924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_20924() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.enjoyNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_20924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_20924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 32:
                        this.bitField0_ |= 4;
                        this.dailyDrawNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.enjoyNum_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.enjoyNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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

               if ((mutable_bitField0_ & 16) != 0) {
                  this.enjoyNum_ = Collections.unmodifiableList(this.enjoyNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20924.class, Builder.class);
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

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
      }

      public List<CommonMsg.MapDataII> getEnjoyNumList() {
         return this.enjoyNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList() {
         return this.enjoyNum_;
      }

      public int getEnjoyNumCount() {
         return this.enjoyNum_.size();
      }

      public CommonMsg.MapDataII getEnjoyNum(int index) {
         return (CommonMsg.MapDataII)this.enjoyNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.enjoyNum_.get(index);
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
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEnjoyNumCount(); ++i) {
               if (!this.getEnjoyNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

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

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.dailyDrawNum_);
         }

         for(int i = 0; i < this.enjoyNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.enjoyNum_.get(i));
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

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.dailyDrawNum_);
            }

            for(int i = 0; i < this.enjoyNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.enjoyNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootReward_20924)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_20924 other = (S2C_LootReward_20924)obj;
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
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
               return false;
            } else if (!this.getEnjoyNumList().equals(other.getEnjoyNumList())) {
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

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            if (this.getEnjoyNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEnjoyNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootReward_20924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20924 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_20924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_20924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_20924> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_20924> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_20924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_20924OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private int curLootNum_;
         private boolean hadEnjoy_;
         private int dailyDrawNum_;
         private List<CommonMsg.MapDataII> enjoyNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> enjoyNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20924.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootReward_20924.emptyIntList();
            this.enjoyNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootReward_20924.emptyIntList();
            this.enjoyNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_LootReward_20924.alwaysUseFieldBuilders) {
               this.getEnjoyNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootReward_20924.emptyIntList();
            this.bitField0_ &= -2;
            this.curLootNum_ = 0;
            this.bitField0_ &= -3;
            this.hadEnjoy_ = false;
            this.bitField0_ &= -5;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -9;
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.enjoyNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootReward_20924_descriptor;
         }

         public S2C_LootReward_20924 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_LootReward_20924.getDefaultInstance();
         }

         public S2C_LootReward_20924 build() {
            S2C_LootReward_20924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_20924 buildPartial() {
            S2C_LootReward_20924 result = new S2C_LootReward_20924(this);
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

            if ((from_bitField0_ & 8) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
               to_bitField0_ |= 4;
            }

            if (this.enjoyNumBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.enjoyNum_ = Collections.unmodifiableList(this.enjoyNum_);
                  this.bitField0_ &= -17;
               }

               result.enjoyNum_ = this.enjoyNum_;
            } else {
               result.enjoyNum_ = this.enjoyNumBuilder_.build();
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
            if (other instanceof S2C_LootReward_20924) {
               return this.mergeFrom((S2C_LootReward_20924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_20924 other) {
            if (other == ActivityEventHeroMsg.S2C_LootReward_20924.getDefaultInstance()) {
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

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               if (this.enjoyNumBuilder_ == null) {
                  if (!other.enjoyNum_.isEmpty()) {
                     if (this.enjoyNum_.isEmpty()) {
                        this.enjoyNum_ = other.enjoyNum_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEnjoyNumIsMutable();
                        this.enjoyNum_.addAll(other.enjoyNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.enjoyNum_.isEmpty()) {
                  if (this.enjoyNumBuilder_.isEmpty()) {
                     this.enjoyNumBuilder_.dispose();
                     this.enjoyNumBuilder_ = null;
                     this.enjoyNum_ = other.enjoyNum_;
                     this.bitField0_ &= -17;
                     this.enjoyNumBuilder_ = ActivityEventHeroMsg.S2C_LootReward_20924.alwaysUseFieldBuilders ? this.getEnjoyNumFieldBuilder() : null;
                  } else {
                     this.enjoyNumBuilder_.addAllMessages(other.enjoyNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCurLootNum()) {
               return false;
            } else if (!this.hasHadEnjoy()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getEnjoyNumCount(); ++i) {
                  if (!this.getEnjoyNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootReward_20924 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_20924)ActivityEventHeroMsg.S2C_LootReward_20924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_20924)e.getUnfinishedMessage();
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
               this.rewardId_ = ActivityEventHeroMsg.S2C_LootReward_20924.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ActivityEventHeroMsg.S2C_LootReward_20924.emptyIntList();
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

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 8;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -9;
            this.dailyDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEnjoyNumIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.enjoyNum_ = new ArrayList(this.enjoyNum_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getEnjoyNumList() {
            return this.enjoyNumBuilder_ == null ? Collections.unmodifiableList(this.enjoyNum_) : this.enjoyNumBuilder_.getMessageList();
         }

         public int getEnjoyNumCount() {
            return this.enjoyNumBuilder_ == null ? this.enjoyNum_.size() : this.enjoyNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getEnjoyNum(int index) {
            return this.enjoyNumBuilder_ == null ? (CommonMsg.MapDataII)this.enjoyNum_.get(index) : (CommonMsg.MapDataII)this.enjoyNumBuilder_.getMessage(index);
         }

         public Builder setEnjoyNum(int index, CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.set(index, value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEnjoyNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEnjoyNum(CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEnjoyNum(int index, CommonMsg.MapDataII value) {
            if (this.enjoyNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(index, value);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEnjoyNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEnjoyNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEnjoyNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.enjoyNum_);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEnjoyNum() {
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeEnjoyNum(int index) {
            if (this.enjoyNumBuilder_ == null) {
               this.ensureEnjoyNumIsMutable();
               this.enjoyNum_.remove(index);
               this.onChanged();
            } else {
               this.enjoyNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getEnjoyNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index) {
            return this.enjoyNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.enjoyNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.enjoyNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList() {
            return this.enjoyNumBuilder_ != null ? this.enjoyNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.enjoyNum_);
         }

         public CommonMsg.MapDataII.Builder addEnjoyNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addEnjoyNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getEnjoyNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getEnjoyNumBuilderList() {
            return this.getEnjoyNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getEnjoyNumFieldBuilder() {
            if (this.enjoyNumBuilder_ == null) {
               this.enjoyNumBuilder_ = new RepeatedFieldBuilderV3(this.enjoyNum_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.enjoyNum_ = null;
            }

            return this.enjoyNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LootEnjoy_20925 extends GeneratedMessageV3 implements C2S_LootEnjoy_20925OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_20925 DEFAULT_INSTANCE = new C2S_LootEnjoy_20925();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_20925> PARSER = new AbstractParser<C2S_LootEnjoy_20925>() {
         public C2S_LootEnjoy_20925 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_20925(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_20925(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_20925() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_20925();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_20925(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20925.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_20925)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_20925 other = (C2S_LootEnjoy_20925)obj;
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

      public static C2S_LootEnjoy_20925 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20925 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20925 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20925 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20925 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20925 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20925 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20925 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20925 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20925 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20925 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20925 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_20925 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_20925 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_20925> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_20925> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_20925 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_20925OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20925.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_LootEnjoy_20925.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_LootEnjoy_20925_descriptor;
         }

         public C2S_LootEnjoy_20925 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_LootEnjoy_20925.getDefaultInstance();
         }

         public C2S_LootEnjoy_20925 build() {
            C2S_LootEnjoy_20925 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_20925 buildPartial() {
            C2S_LootEnjoy_20925 result = new C2S_LootEnjoy_20925(this);
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
            if (other instanceof C2S_LootEnjoy_20925) {
               return this.mergeFrom((C2S_LootEnjoy_20925)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_20925 other) {
            if (other == ActivityEventHeroMsg.C2S_LootEnjoy_20925.getDefaultInstance()) {
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
            C2S_LootEnjoy_20925 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_20925)ActivityEventHeroMsg.C2S_LootEnjoy_20925.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_20925)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_20926 extends GeneratedMessageV3 implements S2C_LootEnjoy_20926OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_20926 DEFAULT_INSTANCE = new S2C_LootEnjoy_20926();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_20926> PARSER = new AbstractParser<S2C_LootEnjoy_20926>() {
         public S2C_LootEnjoy_20926 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_20926(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_20926(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_20926() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_20926();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_20926(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20926.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_20926)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_20926 other = (S2C_LootEnjoy_20926)obj;
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

      public static S2C_LootEnjoy_20926 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20926 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20926 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20926 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20926 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20926 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20926 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20926 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20926 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20926 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20926 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20926 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_20926 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_20926 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_20926> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_20926> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_20926 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_20926OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20926.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_LootEnjoy_20926.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_LootEnjoy_20926_descriptor;
         }

         public S2C_LootEnjoy_20926 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_LootEnjoy_20926.getDefaultInstance();
         }

         public S2C_LootEnjoy_20926 build() {
            S2C_LootEnjoy_20926 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_20926 buildPartial() {
            S2C_LootEnjoy_20926 result = new S2C_LootEnjoy_20926(this);
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
            if (other instanceof S2C_LootEnjoy_20926) {
               return this.mergeFrom((S2C_LootEnjoy_20926)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_20926 other) {
            if (other == ActivityEventHeroMsg.S2C_LootEnjoy_20926.getDefaultInstance()) {
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
            S2C_LootEnjoy_20926 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_20926)ActivityEventHeroMsg.S2C_LootEnjoy_20926.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_20926)e.getUnfinishedMessage();
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

   public static final class C2S_CommitTask_20941 extends GeneratedMessageV3 implements C2S_CommitTask_20941OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_20941 DEFAULT_INSTANCE = new C2S_CommitTask_20941();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_20941> PARSER = new AbstractParser<C2S_CommitTask_20941>() {
         public C2S_CommitTask_20941 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_20941(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_20941(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_20941() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_20941();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_20941(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_20941.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_20941)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_20941 other = (C2S_CommitTask_20941)obj;
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

      public static C2S_CommitTask_20941 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_20941 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_20941 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_20941 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_20941 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_20941 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_20941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_20941 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_20941 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_20941 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_20941 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_20941 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_20941 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_20941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_20941 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_20941 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_20941> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_20941> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_20941 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_20941OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_20941.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_CommitTask_20941.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_CommitTask_20941_descriptor;
         }

         public C2S_CommitTask_20941 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_CommitTask_20941.getDefaultInstance();
         }

         public C2S_CommitTask_20941 build() {
            C2S_CommitTask_20941 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_20941 buildPartial() {
            C2S_CommitTask_20941 result = new C2S_CommitTask_20941(this);
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
            if (other instanceof C2S_CommitTask_20941) {
               return this.mergeFrom((C2S_CommitTask_20941)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_20941 other) {
            if (other == ActivityEventHeroMsg.C2S_CommitTask_20941.getDefaultInstance()) {
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
            C2S_CommitTask_20941 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_20941)ActivityEventHeroMsg.C2S_CommitTask_20941.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_20941)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_20942 extends GeneratedMessageV3 implements S2C_CommitTask_20942OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_20942 DEFAULT_INSTANCE = new S2C_CommitTask_20942();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_20942> PARSER = new AbstractParser<S2C_CommitTask_20942>() {
         public S2C_CommitTask_20942 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_20942(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_20942(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_20942() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_20942();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_20942(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_20942.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_20942)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_20942 other = (S2C_CommitTask_20942)obj;
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

      public static S2C_CommitTask_20942 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_20942 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_20942 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_20942 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_20942 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_20942 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_20942)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_20942 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_20942 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_20942 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_20942 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_20942 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_20942 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_20942)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_20942 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_20942 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_20942> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_20942> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_20942 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_20942OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_20942.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_CommitTask_20942.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_CommitTask_20942_descriptor;
         }

         public S2C_CommitTask_20942 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_CommitTask_20942.getDefaultInstance();
         }

         public S2C_CommitTask_20942 build() {
            S2C_CommitTask_20942 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_20942 buildPartial() {
            S2C_CommitTask_20942 result = new S2C_CommitTask_20942(this);
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
            if (other instanceof S2C_CommitTask_20942) {
               return this.mergeFrom((S2C_CommitTask_20942)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_20942 other) {
            if (other == ActivityEventHeroMsg.S2C_CommitTask_20942.getDefaultInstance()) {
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
            S2C_CommitTask_20942 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_20942)ActivityEventHeroMsg.S2C_CommitTask_20942.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_20942)e.getUnfinishedMessage();
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

   public static final class C2S_ActivityTaskList_20944 extends GeneratedMessageV3 implements C2S_ActivityTaskList_20944OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityTaskList_20944 DEFAULT_INSTANCE = new C2S_ActivityTaskList_20944();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityTaskList_20944> PARSER = new AbstractParser<C2S_ActivityTaskList_20944>() {
         public C2S_ActivityTaskList_20944 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityTaskList_20944(input, extensionRegistry);
         }
      };

      private C2S_ActivityTaskList_20944(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityTaskList_20944() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityTaskList_20944();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityTaskList_20944(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityTaskList_20944.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityTaskList_20944)) {
            return super.equals(obj);
         } else {
            C2S_ActivityTaskList_20944 other = (C2S_ActivityTaskList_20944)obj;
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

      public static C2S_ActivityTaskList_20944 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_20944)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityTaskList_20944 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_20944 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_20944 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_20944)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityTaskList_20944 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityTaskList_20944 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityTaskList_20944> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityTaskList_20944> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityTaskList_20944 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityTaskList_20944OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityTaskList_20944.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_ActivityTaskList_20944.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ActivityTaskList_20944_descriptor;
         }

         public C2S_ActivityTaskList_20944 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_ActivityTaskList_20944.getDefaultInstance();
         }

         public C2S_ActivityTaskList_20944 build() {
            C2S_ActivityTaskList_20944 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityTaskList_20944 buildPartial() {
            C2S_ActivityTaskList_20944 result = new C2S_ActivityTaskList_20944(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityTaskList_20944) {
               return this.mergeFrom((C2S_ActivityTaskList_20944)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityTaskList_20944 other) {
            if (other == ActivityEventHeroMsg.C2S_ActivityTaskList_20944.getDefaultInstance()) {
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
            C2S_ActivityTaskList_20944 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityTaskList_20944)ActivityEventHeroMsg.C2S_ActivityTaskList_20944.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityTaskList_20944)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityTaskList_20945 extends GeneratedMessageV3 implements S2C_ActivityTaskList_20945OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityTaskList_20945 DEFAULT_INSTANCE = new S2C_ActivityTaskList_20945();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityTaskList_20945> PARSER = new AbstractParser<S2C_ActivityTaskList_20945>() {
         public S2C_ActivityTaskList_20945 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityTaskList_20945(input, extensionRegistry);
         }
      };

      private S2C_ActivityTaskList_20945(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityTaskList_20945() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityTaskList_20945();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityTaskList_20945(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskList_20945.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityTaskList_20945)) {
            return super.equals(obj);
         } else {
            S2C_ActivityTaskList_20945 other = (S2C_ActivityTaskList_20945)obj;
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

      public static S2C_ActivityTaskList_20945 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_20945)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskList_20945 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_20945 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_20945 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_20945)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityTaskList_20945 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityTaskList_20945 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityTaskList_20945> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityTaskList_20945> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityTaskList_20945 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityTaskList_20945OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskList_20945.class, Builder.class);
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
            if (ActivityEventHeroMsg.S2C_ActivityTaskList_20945.alwaysUseFieldBuilders) {
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
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskList_20945_descriptor;
         }

         public S2C_ActivityTaskList_20945 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_ActivityTaskList_20945.getDefaultInstance();
         }

         public S2C_ActivityTaskList_20945 build() {
            S2C_ActivityTaskList_20945 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityTaskList_20945 buildPartial() {
            S2C_ActivityTaskList_20945 result = new S2C_ActivityTaskList_20945(this);
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
            if (other instanceof S2C_ActivityTaskList_20945) {
               return this.mergeFrom((S2C_ActivityTaskList_20945)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityTaskList_20945 other) {
            if (other == ActivityEventHeroMsg.S2C_ActivityTaskList_20945.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityEventHeroMsg.S2C_ActivityTaskList_20945.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_ActivityTaskList_20945 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityTaskList_20945)ActivityEventHeroMsg.S2C_ActivityTaskList_20945.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityTaskList_20945)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityTaskNotify_20946 extends GeneratedMessageV3 implements S2C_ActivityTaskNotify_20946OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityTaskNotify_20946 DEFAULT_INSTANCE = new S2C_ActivityTaskNotify_20946();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityTaskNotify_20946> PARSER = new AbstractParser<S2C_ActivityTaskNotify_20946>() {
         public S2C_ActivityTaskNotify_20946 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityTaskNotify_20946(input, extensionRegistry);
         }
      };

      private S2C_ActivityTaskNotify_20946(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityTaskNotify_20946() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityTaskNotify_20946();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityTaskNotify_20946(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskNotify_20946.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityTaskNotify_20946)) {
            return super.equals(obj);
         } else {
            S2C_ActivityTaskNotify_20946 other = (S2C_ActivityTaskNotify_20946)obj;
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

      public static S2C_ActivityTaskNotify_20946 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_20946)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_20946 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_20946 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_20946 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_20946)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityTaskNotify_20946 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityTaskNotify_20946 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityTaskNotify_20946> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityTaskNotify_20946> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityTaskNotify_20946 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityTaskNotify_20946OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskNotify_20946.class, Builder.class);
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
            if (ActivityEventHeroMsg.S2C_ActivityTaskNotify_20946.alwaysUseFieldBuilders) {
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
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ActivityTaskNotify_20946_descriptor;
         }

         public S2C_ActivityTaskNotify_20946 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_ActivityTaskNotify_20946.getDefaultInstance();
         }

         public S2C_ActivityTaskNotify_20946 build() {
            S2C_ActivityTaskNotify_20946 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityTaskNotify_20946 buildPartial() {
            S2C_ActivityTaskNotify_20946 result = new S2C_ActivityTaskNotify_20946(this);
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
            if (other instanceof S2C_ActivityTaskNotify_20946) {
               return this.mergeFrom((S2C_ActivityTaskNotify_20946)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityTaskNotify_20946 other) {
            if (other == ActivityEventHeroMsg.S2C_ActivityTaskNotify_20946.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityEventHeroMsg.S2C_ActivityTaskNotify_20946.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_ActivityTaskNotify_20946 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityTaskNotify_20946)ActivityEventHeroMsg.S2C_ActivityTaskNotify_20946.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityTaskNotify_20946)e.getUnfinishedMessage();
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

   public static final class C2S_ReceiveBox_20947 extends GeneratedMessageV3 implements C2S_ReceiveBox_20947OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveBox_20947 DEFAULT_INSTANCE = new C2S_ReceiveBox_20947();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveBox_20947> PARSER = new AbstractParser<C2S_ReceiveBox_20947>() {
         public C2S_ReceiveBox_20947 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveBox_20947(input, extensionRegistry);
         }
      };

      private C2S_ReceiveBox_20947(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveBox_20947() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveBox_20947();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveBox_20947(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBox_20947.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveBox_20947)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveBox_20947 other = (C2S_ReceiveBox_20947)obj;
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

      public static C2S_ReceiveBox_20947 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBox_20947 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBox_20947 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBox_20947 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBox_20947 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBox_20947 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBox_20947)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBox_20947 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBox_20947 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBox_20947 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBox_20947 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBox_20947 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBox_20947 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBox_20947)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveBox_20947 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveBox_20947 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveBox_20947> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveBox_20947> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveBox_20947 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveBox_20947OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBox_20947.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_ReceiveBox_20947.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_ReceiveBox_20947_descriptor;
         }

         public C2S_ReceiveBox_20947 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_ReceiveBox_20947.getDefaultInstance();
         }

         public C2S_ReceiveBox_20947 build() {
            C2S_ReceiveBox_20947 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveBox_20947 buildPartial() {
            C2S_ReceiveBox_20947 result = new C2S_ReceiveBox_20947(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ReceiveBox_20947) {
               return this.mergeFrom((C2S_ReceiveBox_20947)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveBox_20947 other) {
            if (other == ActivityEventHeroMsg.C2S_ReceiveBox_20947.getDefaultInstance()) {
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
            C2S_ReceiveBox_20947 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveBox_20947)ActivityEventHeroMsg.C2S_ReceiveBox_20947.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveBox_20947)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveBox_20948 extends GeneratedMessageV3 implements S2C_ReceiveBox_20948OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECEIVEBOX_FIELD_NUMBER = 1;
      private boolean receiveBox_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveBox_20948 DEFAULT_INSTANCE = new S2C_ReceiveBox_20948();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveBox_20948> PARSER = new AbstractParser<S2C_ReceiveBox_20948>() {
         public S2C_ReceiveBox_20948 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveBox_20948(input, extensionRegistry);
         }
      };

      private S2C_ReceiveBox_20948(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveBox_20948() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveBox_20948();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveBox_20948(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.receiveBox_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBox_20948.class, Builder.class);
      }

      public boolean hasReceiveBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getReceiveBox() {
         return this.receiveBox_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReceiveBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.receiveBox_);
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
               size += CodedOutputStream.computeBoolSize(1, this.receiveBox_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveBox_20948)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveBox_20948 other = (S2C_ReceiveBox_20948)obj;
            if (this.hasReceiveBox() != other.hasReceiveBox()) {
               return false;
            } else if (this.hasReceiveBox() && this.getReceiveBox() != other.getReceiveBox()) {
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
            if (this.hasReceiveBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getReceiveBox());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveBox_20948 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBox_20948 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBox_20948 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBox_20948 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBox_20948 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBox_20948 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBox_20948)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBox_20948 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBox_20948 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBox_20948 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBox_20948 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBox_20948 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBox_20948 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBox_20948)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveBox_20948 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveBox_20948 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveBox_20948> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveBox_20948> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveBox_20948 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveBox_20948OrBuilder {
         private int bitField0_;
         private boolean receiveBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBox_20948.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_ReceiveBox_20948.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveBox_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_ReceiveBox_20948_descriptor;
         }

         public S2C_ReceiveBox_20948 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_ReceiveBox_20948.getDefaultInstance();
         }

         public S2C_ReceiveBox_20948 build() {
            S2C_ReceiveBox_20948 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveBox_20948 buildPartial() {
            S2C_ReceiveBox_20948 result = new S2C_ReceiveBox_20948(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.receiveBox_ = this.receiveBox_;
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
            if (other instanceof S2C_ReceiveBox_20948) {
               return this.mergeFrom((S2C_ReceiveBox_20948)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveBox_20948 other) {
            if (other == ActivityEventHeroMsg.S2C_ReceiveBox_20948.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReceiveBox()) {
                  this.setReceiveBox(other.getReceiveBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReceiveBox();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveBox_20948 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveBox_20948)ActivityEventHeroMsg.S2C_ReceiveBox_20948.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveBox_20948)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReceiveBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getReceiveBox() {
            return this.receiveBox_;
         }

         public Builder setReceiveBox(boolean value) {
            this.bitField0_ |= 1;
            this.receiveBox_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReceiveBox() {
            this.bitField0_ &= -2;
            this.receiveBox_ = false;
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

   public static final class C2S_OptionalGiftBuy_20949 extends GeneratedMessageV3 implements C2S_OptionalGiftBuy_20949OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CUSTOMID_FIELD_NUMBER = 1;
      private int customId_;
      public static final int BUYDATA_FIELD_NUMBER = 2;
      private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
      private byte memoizedIsInitialized;
      private static final C2S_OptionalGiftBuy_20949 DEFAULT_INSTANCE = new C2S_OptionalGiftBuy_20949();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionalGiftBuy_20949> PARSER = new AbstractParser<C2S_OptionalGiftBuy_20949>() {
         public C2S_OptionalGiftBuy_20949 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionalGiftBuy_20949(input, extensionRegistry);
         }
      };

      private C2S_OptionalGiftBuy_20949(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionalGiftBuy_20949() {
         this.memoizedIsInitialized = -1;
         this.buyData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionalGiftBuy_20949();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionalGiftBuy_20949(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.customId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.buyData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.buyData_.add(input.readMessage(ActivityMsg.CustomGiftBuyItemData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftBuy_20949.class, Builder.class);
      }

      public boolean hasCustomId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCustomId() {
         return this.customId_;
      }

      public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
         return this.buyData_;
      }

      public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
         return this.buyData_;
      }

      public int getBuyDataCount() {
         return this.buyData_.size();
      }

      public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
         return (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index);
      }

      public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
         return (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCustomId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBuyDataCount(); ++i) {
               if (!this.getBuyData(i).isInitialized()) {
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
            output.writeInt32(1, this.customId_);
         }

         for(int i = 0; i < this.buyData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.buyData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.customId_);
            }

            for(int i = 0; i < this.buyData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.buyData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OptionalGiftBuy_20949)) {
            return super.equals(obj);
         } else {
            C2S_OptionalGiftBuy_20949 other = (C2S_OptionalGiftBuy_20949)obj;
            if (this.hasCustomId() != other.hasCustomId()) {
               return false;
            } else if (this.hasCustomId() && this.getCustomId() != other.getCustomId()) {
               return false;
            } else if (!this.getBuyDataList().equals(other.getBuyDataList())) {
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
            if (this.hasCustomId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCustomId();
            }

            if (this.getBuyDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionalGiftBuy_20949)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftBuy_20949 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftBuy_20949 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionalGiftBuy_20949 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionalGiftBuy_20949)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionalGiftBuy_20949 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionalGiftBuy_20949 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionalGiftBuy_20949> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionalGiftBuy_20949> getParserForType() {
         return PARSER;
      }

      public C2S_OptionalGiftBuy_20949 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionalGiftBuy_20949OrBuilder {
         private int bitField0_;
         private int customId_;
         private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> buyDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionalGiftBuy_20949.class, Builder.class);
         }

         private Builder() {
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.C2S_OptionalGiftBuy_20949.alwaysUseFieldBuilders) {
               this.getBuyDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.customId_ = 0;
            this.bitField0_ &= -2;
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_C2S_OptionalGiftBuy_20949_descriptor;
         }

         public C2S_OptionalGiftBuy_20949 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.C2S_OptionalGiftBuy_20949.getDefaultInstance();
         }

         public C2S_OptionalGiftBuy_20949 build() {
            C2S_OptionalGiftBuy_20949 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionalGiftBuy_20949 buildPartial() {
            C2S_OptionalGiftBuy_20949 result = new C2S_OptionalGiftBuy_20949(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.customId_ = this.customId_;
               to_bitField0_ |= 1;
            }

            if (this.buyDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
                  this.bitField0_ &= -3;
               }

               result.buyData_ = this.buyData_;
            } else {
               result.buyData_ = this.buyDataBuilder_.build();
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
            if (other instanceof C2S_OptionalGiftBuy_20949) {
               return this.mergeFrom((C2S_OptionalGiftBuy_20949)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionalGiftBuy_20949 other) {
            if (other == ActivityEventHeroMsg.C2S_OptionalGiftBuy_20949.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCustomId()) {
                  this.setCustomId(other.getCustomId());
               }

               if (this.buyDataBuilder_ == null) {
                  if (!other.buyData_.isEmpty()) {
                     if (this.buyData_.isEmpty()) {
                        this.buyData_ = other.buyData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureBuyDataIsMutable();
                        this.buyData_.addAll(other.buyData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buyData_.isEmpty()) {
                  if (this.buyDataBuilder_.isEmpty()) {
                     this.buyDataBuilder_.dispose();
                     this.buyDataBuilder_ = null;
                     this.buyData_ = other.buyData_;
                     this.bitField0_ &= -3;
                     this.buyDataBuilder_ = ActivityEventHeroMsg.C2S_OptionalGiftBuy_20949.alwaysUseFieldBuilders ? this.getBuyDataFieldBuilder() : null;
                  } else {
                     this.buyDataBuilder_.addAllMessages(other.buyData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCustomId()) {
               return false;
            } else {
               for(int i = 0; i < this.getBuyDataCount(); ++i) {
                  if (!this.getBuyData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OptionalGiftBuy_20949 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionalGiftBuy_20949)ActivityEventHeroMsg.C2S_OptionalGiftBuy_20949.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionalGiftBuy_20949)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCustomId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCustomId() {
            return this.customId_;
         }

         public Builder setCustomId(int value) {
            this.bitField0_ |= 1;
            this.customId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCustomId() {
            this.bitField0_ &= -2;
            this.customId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuyDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.buyData_ = new ArrayList(this.buyData_);
               this.bitField0_ |= 2;
            }

         }

         public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
            return this.buyDataBuilder_ == null ? Collections.unmodifiableList(this.buyData_) : this.buyDataBuilder_.getMessageList();
         }

         public int getBuyDataCount() {
            return this.buyDataBuilder_ == null ? this.buyData_.size() : this.buyDataBuilder_.getCount();
         }

         public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemData)this.buyDataBuilder_.getMessage(index);
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuyData(Iterable<? extends ActivityMsg.CustomGiftBuyItemData> values) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyData_);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuyData() {
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuyData(int index) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.remove(index);
               this.onChanged();
            } else {
               this.buyDataBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder getBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
            return this.buyDataBuilder_ != null ? this.buyDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buyData_);
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder() {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(index, ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public List<ActivityMsg.CustomGiftBuyItemData.Builder> getBuyDataBuilderList() {
            return this.getBuyDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataFieldBuilder() {
            if (this.buyDataBuilder_ == null) {
               this.buyDataBuilder_ = new RepeatedFieldBuilderV3(this.buyData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.buyData_ = null;
            }

            return this.buyDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OptionalGiftBuy_20950 extends GeneratedMessageV3 implements S2C_OptionalGiftBuy_20950OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUYDATA_FIELD_NUMBER = 1;
      private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionalGiftBuy_20950 DEFAULT_INSTANCE = new S2C_OptionalGiftBuy_20950();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionalGiftBuy_20950> PARSER = new AbstractParser<S2C_OptionalGiftBuy_20950>() {
         public S2C_OptionalGiftBuy_20950 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionalGiftBuy_20950(input, extensionRegistry);
         }
      };

      private S2C_OptionalGiftBuy_20950(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionalGiftBuy_20950() {
         this.memoizedIsInitialized = -1;
         this.buyData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionalGiftBuy_20950();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionalGiftBuy_20950(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.buyData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buyData_.add(input.readMessage(ActivityMsg.CustomGiftBuyItemData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_20950.class, Builder.class);
      }

      public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
         return this.buyData_;
      }

      public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
         return this.buyData_;
      }

      public int getBuyDataCount() {
         return this.buyData_.size();
      }

      public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
         return (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index);
      }

      public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
         return (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBuyDataCount(); ++i) {
               if (!this.getBuyData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.buyData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.buyData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.buyData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.buyData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionalGiftBuy_20950)) {
            return super.equals(obj);
         } else {
            S2C_OptionalGiftBuy_20950 other = (S2C_OptionalGiftBuy_20950)obj;
            if (!this.getBuyDataList().equals(other.getBuyDataList())) {
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
            if (this.getBuyDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionalGiftBuy_20950)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_20950 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_20950 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionalGiftBuy_20950 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionalGiftBuy_20950)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionalGiftBuy_20950 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionalGiftBuy_20950 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionalGiftBuy_20950> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionalGiftBuy_20950> getParserForType() {
         return PARSER;
      }

      public S2C_OptionalGiftBuy_20950 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionalGiftBuy_20950OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.CustomGiftBuyItemData> buyData_;
         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> buyDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionalGiftBuy_20950.class, Builder.class);
         }

         private Builder() {
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buyData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityEventHeroMsg.S2C_OptionalGiftBuy_20950.alwaysUseFieldBuilders) {
               this.getBuyDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityEventHeroMsg.internal_static_activityEventHero_com_gzbz_protobuf_S2C_OptionalGiftBuy_20950_descriptor;
         }

         public S2C_OptionalGiftBuy_20950 getDefaultInstanceForType() {
            return ActivityEventHeroMsg.S2C_OptionalGiftBuy_20950.getDefaultInstance();
         }

         public S2C_OptionalGiftBuy_20950 build() {
            S2C_OptionalGiftBuy_20950 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionalGiftBuy_20950 buildPartial() {
            S2C_OptionalGiftBuy_20950 result = new S2C_OptionalGiftBuy_20950(this);
            int from_bitField0_ = this.bitField0_;
            if (this.buyDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.buyData_ = Collections.unmodifiableList(this.buyData_);
                  this.bitField0_ &= -2;
               }

               result.buyData_ = this.buyData_;
            } else {
               result.buyData_ = this.buyDataBuilder_.build();
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
            if (other instanceof S2C_OptionalGiftBuy_20950) {
               return this.mergeFrom((S2C_OptionalGiftBuy_20950)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionalGiftBuy_20950 other) {
            if (other == ActivityEventHeroMsg.S2C_OptionalGiftBuy_20950.getDefaultInstance()) {
               return this;
            } else {
               if (this.buyDataBuilder_ == null) {
                  if (!other.buyData_.isEmpty()) {
                     if (this.buyData_.isEmpty()) {
                        this.buyData_ = other.buyData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBuyDataIsMutable();
                        this.buyData_.addAll(other.buyData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buyData_.isEmpty()) {
                  if (this.buyDataBuilder_.isEmpty()) {
                     this.buyDataBuilder_.dispose();
                     this.buyDataBuilder_ = null;
                     this.buyData_ = other.buyData_;
                     this.bitField0_ &= -2;
                     this.buyDataBuilder_ = ActivityEventHeroMsg.S2C_OptionalGiftBuy_20950.alwaysUseFieldBuilders ? this.getBuyDataFieldBuilder() : null;
                  } else {
                     this.buyDataBuilder_.addAllMessages(other.buyData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBuyDataCount(); ++i) {
               if (!this.getBuyData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionalGiftBuy_20950 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionalGiftBuy_20950)ActivityEventHeroMsg.S2C_OptionalGiftBuy_20950.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionalGiftBuy_20950)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuyDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buyData_ = new ArrayList(this.buyData_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList() {
            return this.buyDataBuilder_ == null ? Collections.unmodifiableList(this.buyData_) : this.buyDataBuilder_.getMessageList();
         }

         public int getBuyDataCount() {
            return this.buyDataBuilder_ == null ? this.buyData_.size() : this.buyDataBuilder_.getCount();
         }

         public ActivityMsg.CustomGiftBuyItemData getBuyData(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemData)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemData)this.buyDataBuilder_.getMessage(index);
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData value) {
            if (this.buyDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, value);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuyData(ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuyData(int index, ActivityMsg.CustomGiftBuyItemData.Builder builderForValue) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuyData(Iterable<? extends ActivityMsg.CustomGiftBuyItemData> values) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyData_);
               this.onChanged();
            } else {
               this.buyDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuyData() {
            if (this.buyDataBuilder_ == null) {
               this.buyData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.buyDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuyData(int index) {
            if (this.buyDataBuilder_ == null) {
               this.ensureBuyDataIsMutable();
               this.buyData_.remove(index);
               this.onChanged();
            } else {
               this.buyDataBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder getBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index) {
            return this.buyDataBuilder_ == null ? (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyData_.get(index) : (ActivityMsg.CustomGiftBuyItemDataOrBuilder)this.buyDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList() {
            return this.buyDataBuilder_ != null ? this.buyDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buyData_);
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder() {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public ActivityMsg.CustomGiftBuyItemData.Builder addBuyDataBuilder(int index) {
            return (ActivityMsg.CustomGiftBuyItemData.Builder)this.getBuyDataFieldBuilder().addBuilder(index, ActivityMsg.CustomGiftBuyItemData.getDefaultInstance());
         }

         public List<ActivityMsg.CustomGiftBuyItemData.Builder> getBuyDataBuilderList() {
            return this.getBuyDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.CustomGiftBuyItemData, ActivityMsg.CustomGiftBuyItemData.Builder, ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataFieldBuilder() {
            if (this.buyDataBuilder_ == null) {
               this.buyDataBuilder_ = new RepeatedFieldBuilderV3(this.buyData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.buyData_ = null;
            }

            return this.buyDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ActivityTaskList_20944OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_20941OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_HeroThemeInfo_20901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootEnjoy_20925OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_20921OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_20923OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_MatchBattle_20911OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Mate_20903OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OptionalGiftBuy_20949OrBuilder extends MessageOrBuilder {
      boolean hasCustomId();

      int getCustomId();

      List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList();

      ActivityMsg.CustomGiftBuyItemData getBuyData(int index);

      int getBuyDataCount();

      List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList();

      ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index);
   }

   public interface C2S_PointReward_20907OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReceiveBox_20947OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ActivityTaskList_20945OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_ActivityTaskNotify_20946OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_CommitTask_20942OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_HeroThemeInfo_20902OrBuilder extends MessageOrBuilder {
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

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasServerOpenDay();

      int getServerOpenDay();

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasMainId();

      int getMainId();

      boolean hasReceiveBox();

      boolean getReceiveBox();
   }

   public interface S2C_LootEnjoy_20926OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_20922OrBuilder extends MessageOrBuilder {
      boolean hasEnjoyId();

      int getEnjoyId();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();

      List<CommonMsg.MapDataII> getEnjoyNumList();

      CommonMsg.MapDataII getEnjoyNum(int index);

      int getEnjoyNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index);
   }

   public interface S2C_LootReward_20924OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasHadEnjoy();

      boolean getHadEnjoy();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();

      List<CommonMsg.MapDataII> getEnjoyNumList();

      CommonMsg.MapDataII getEnjoyNum(int index);

      int getEnjoyNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getEnjoyNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getEnjoyNumOrBuilder(int index);
   }

   public interface S2C_MatchBattle_20912OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasFightNum();

      int getFightNum();

      boolean hasTotalDamage();

      long getTotalDamage();

      boolean hasTotalPoint();

      int getTotalPoint();
   }

   public interface S2C_Mate_20904OrBuilder extends MessageOrBuilder {
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

   public interface S2C_OptionalGiftBuy_20950OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.CustomGiftBuyItemData> getBuyDataList();

      ActivityMsg.CustomGiftBuyItemData getBuyData(int index);

      int getBuyDataCount();

      List<? extends ActivityMsg.CustomGiftBuyItemDataOrBuilder> getBuyDataOrBuilderList();

      ActivityMsg.CustomGiftBuyItemDataOrBuilder getBuyDataOrBuilder(int index);
   }

   public interface S2C_PointReward_20908OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ReceiveBox_20948OrBuilder extends MessageOrBuilder {
      boolean hasReceiveBox();

      boolean getReceiveBox();
   }
}
