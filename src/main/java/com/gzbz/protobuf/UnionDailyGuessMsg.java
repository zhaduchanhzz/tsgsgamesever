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

public final class UnionDailyGuessMsg {
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private UnionDailyGuessMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015UnionDailyGuess.proto\u0012!unionDailyGuess.com.gzbz.protobuf\u001a\fcommon.proto\"\u0018\n\u0016C2S_EnterChapter_16002\"Î\u0001\n\u0016S2C_EnterChapter_16003\u0012\u0016\n\u000ecurrentChapter\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007curGrid\u0018\u0002 \u0002(\u0005\u0012G\n\bgridInfo\u0018\u0003 \u0003(\u000b25.unionDailyGuess.com.gzbz.protobuf.S2C_GridInfo_16004\u0012\u000e\n\u0006heroId\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bmapGroup\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nunionLevel\u0018\u0007 \u0002(\u0005\"C\n\u0012S2C_GridInfo_16004\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\beventIdx\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\"(\n\u0018S2C_UnlockSeeGrids_16005\u0012\f\n\u0004grid\u0018\u0001 \u0003(\u0005\"_\n\u0018S2C_UpdateGridInfo_16006\u0012C\n\u0004info\u0018\u0001 \u0003(\u000b25.unionDailyGuess.com.gzbz.protobuf.S2C_GridInfo_16004\"&\n\u0014C2S_SkipBattle_16007\u0012\u000e\n\u0006gridId\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014S2C_SkipBattle_16008\"E\n\u000eC2S_Move_16009\u0012\u000f\n\u0007oriGrid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestGrid\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bpassGrid\u0018\u0003 \u0003(\u0005\"2\n\u000eS2C_Move_16010\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestGrid\u0018\u0002 \u0002(\u0005\")\n\u0019C2S_SelectRandomBox_16012\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"+\n\u0019S2C_SelectRandomBox_16013\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"#\n\u0013C2S_EnemyData_16014\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\":\n\u0013S2C_EnemyData_16015\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rcanPassBattle\u0018\u0002 \u0002(\b\"$\n\u0014C2S_OtherEvent_16016\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"$\n\u0014S2C_OtherEvent_16017\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"%\n#C2S_PlayerUnionDailyGuessInfo_16018\"4\n#S2C_PlayerUnionDailyGuessInfo_16019\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_BattleRecord_16020\"{\n\u0016S2C_BattleRecord_16021\u0012M\n\u0010battleRecordInfo\u0018\u0001 \u0003(\u000b23.unionDailyGuess.com.gzbz.protobuf.BattleRecordInfo\u0012\u0012\n\nunionLevel\u0018\u0002 \u0002(\u0005\"m\n\u0010BattleRecordInfo\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012&\n\nplayerInfo\u0018\u0002 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0010\n\bpassTime\u0018\u0003 \u0002(\u0003\u0012\f\n\u0004type\u0018\u0004 \u0002(\u0005\"\u008d\u0001\n\u0014S2C_ShowResult_16022\u0012\u000f\n\u0007unionLv\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005share\u0018\u0003 \u0001(\u0005\u0012\u0012\n\npassOrders\u0018\u0004 \u0003(\u0005\u0012\u0011\n\tchapterId\u0018\u0005 \u0001(\u0005\u0012 \n\u0006reward\u0018\u0006 \u0003(\u000b2\u0010.common.ItemInfo\"\u0015\n\u0013C2S_QuickPass_16023\"*\n\u0017S2C_UpdatePassNum_16026\u0012\u000f\n\u0007passNum\u0018\u0001 \u0002(\u0005B)\n\u0011com.gzbz.protobufB\u0012UnionDailyGuessMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor, new String[0]);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor, new String[]{"CurrentChapter", "CurGrid", "GridInfo", "HeroId", "MapGroup", "Type", "UnionLevel"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor, new String[]{"Grid", "EventIdx", "State"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor, new String[]{"Grid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor, new String[]{"Info"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor, new String[]{"GridId"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor, new String[0]);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor, new String[]{"OriGrid", "DestGrid", "PassGrid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor, new String[]{"Result", "DestGrid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor, new String[]{"Grid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor, new String[]{"Result"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor, new String[]{"Grid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor, new String[]{"Grid", "CanPassBattle"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor, new String[]{"Grid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor, new String[]{"Grid"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor, new String[0]);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor, new String[]{"State"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor, new String[0]);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor, new String[]{"BattleRecordInfo", "UnionLevel"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor, new String[]{"ChapterId", "PlayerInfo", "PassTime", "Type"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor, new String[]{"UnionLv", "Type", "Share", "PassOrders", "ChapterId", "Reward"});
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor, new String[0]);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor, new String[]{"PassNum"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_EnterChapter_16002 extends GeneratedMessageV3 implements C2S_EnterChapter_16002OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EnterChapter_16002 DEFAULT_INSTANCE = new C2S_EnterChapter_16002();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterChapter_16002> PARSER = new AbstractParser<C2S_EnterChapter_16002>() {
         public C2S_EnterChapter_16002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterChapter_16002(input, extensionRegistry);
         }
      };

      private C2S_EnterChapter_16002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterChapter_16002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterChapter_16002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterChapter_16002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterChapter_16002.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnterChapter_16002)) {
            return super.equals(obj);
         } else {
            C2S_EnterChapter_16002 other = (C2S_EnterChapter_16002)obj;
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

      public static C2S_EnterChapter_16002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_16002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_16002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_16002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_16002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data);
      }

      public static C2S_EnterChapter_16002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterChapter_16002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterChapter_16002 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_16002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterChapter_16002 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_16002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterChapter_16002 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterChapter_16002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterChapter_16002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterChapter_16002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterChapter_16002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterChapter_16002> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterChapter_16002> getParserForType() {
         return PARSER;
      }

      public C2S_EnterChapter_16002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterChapter_16002OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterChapter_16002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_EnterChapter_16002.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnterChapter_16002_descriptor;
         }

         public C2S_EnterChapter_16002 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_EnterChapter_16002.getDefaultInstance();
         }

         public C2S_EnterChapter_16002 build() {
            C2S_EnterChapter_16002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterChapter_16002 buildPartial() {
            C2S_EnterChapter_16002 result = new C2S_EnterChapter_16002(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_EnterChapter_16002) {
               return this.mergeFrom((C2S_EnterChapter_16002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterChapter_16002 other) {
            if (other == UnionDailyGuessMsg.C2S_EnterChapter_16002.getDefaultInstance()) {
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
            C2S_EnterChapter_16002 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterChapter_16002)UnionDailyGuessMsg.C2S_EnterChapter_16002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterChapter_16002)e.getUnfinishedMessage();
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

   public static final class S2C_EnterChapter_16003 extends GeneratedMessageV3 implements S2C_EnterChapter_16003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURRENTCHAPTER_FIELD_NUMBER = 1;
      private int currentChapter_;
      public static final int CURGRID_FIELD_NUMBER = 2;
      private int curGrid_;
      public static final int GRIDINFO_FIELD_NUMBER = 3;
      private List<S2C_GridInfo_16004> gridInfo_;
      public static final int HEROID_FIELD_NUMBER = 4;
      private int heroId_;
      public static final int MAPGROUP_FIELD_NUMBER = 5;
      private int mapGroup_;
      public static final int TYPE_FIELD_NUMBER = 6;
      private int type_;
      public static final int UNIONLEVEL_FIELD_NUMBER = 7;
      private int unionLevel_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterChapter_16003 DEFAULT_INSTANCE = new S2C_EnterChapter_16003();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterChapter_16003> PARSER = new AbstractParser<S2C_EnterChapter_16003>() {
         public S2C_EnterChapter_16003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterChapter_16003(input, extensionRegistry);
         }
      };

      private S2C_EnterChapter_16003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterChapter_16003() {
         this.memoizedIsInitialized = -1;
         this.gridInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterChapter_16003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterChapter_16003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.currentChapter_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.curGrid_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gridInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gridInfo_.add(input.readMessage(UnionDailyGuessMsg.S2C_GridInfo_16004.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.heroId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.mapGroup_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.type_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.unionLevel_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.gridInfo_ = Collections.unmodifiableList(this.gridInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterChapter_16003.class, Builder.class);
      }

      public boolean hasCurrentChapter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurrentChapter() {
         return this.currentChapter_;
      }

      public boolean hasCurGrid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurGrid() {
         return this.curGrid_;
      }

      public List<S2C_GridInfo_16004> getGridInfoList() {
         return this.gridInfo_;
      }

      public List<? extends S2C_GridInfo_16004OrBuilder> getGridInfoOrBuilderList() {
         return this.gridInfo_;
      }

      public int getGridInfoCount() {
         return this.gridInfo_.size();
      }

      public S2C_GridInfo_16004 getGridInfo(int index) {
         return (S2C_GridInfo_16004)this.gridInfo_.get(index);
      }

      public S2C_GridInfo_16004OrBuilder getGridInfoOrBuilder(int index) {
         return (S2C_GridInfo_16004OrBuilder)this.gridInfo_.get(index);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasMapGroup() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMapGroup() {
         return this.mapGroup_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasUnionLevel() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getUnionLevel() {
         return this.unionLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurrentChapter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGridInfoCount(); ++i) {
               if (!this.getGridInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.currentChapter_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.curGrid_);
         }

         for(int i = 0; i < this.gridInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.gridInfo_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.heroId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.mapGroup_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.type_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.unionLevel_);
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
               size += CodedOutputStream.computeInt32Size(1, this.currentChapter_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.curGrid_);
            }

            for(int i = 0; i < this.gridInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.gridInfo_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.heroId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.mapGroup_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.type_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.unionLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterChapter_16003)) {
            return super.equals(obj);
         } else {
            S2C_EnterChapter_16003 other = (S2C_EnterChapter_16003)obj;
            if (this.hasCurrentChapter() != other.hasCurrentChapter()) {
               return false;
            } else if (this.hasCurrentChapter() && this.getCurrentChapter() != other.getCurrentChapter()) {
               return false;
            } else if (this.hasCurGrid() != other.hasCurGrid()) {
               return false;
            } else if (this.hasCurGrid() && this.getCurGrid() != other.getCurGrid()) {
               return false;
            } else if (!this.getGridInfoList().equals(other.getGridInfoList())) {
               return false;
            } else if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasMapGroup() != other.hasMapGroup()) {
               return false;
            } else if (this.hasMapGroup() && this.getMapGroup() != other.getMapGroup()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasUnionLevel() != other.hasUnionLevel()) {
               return false;
            } else if (this.hasUnionLevel() && this.getUnionLevel() != other.getUnionLevel()) {
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
            if (this.hasCurrentChapter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurrentChapter();
            }

            if (this.hasCurGrid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurGrid();
            }

            if (this.getGridInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGridInfoList().hashCode();
            }

            if (this.hasHeroId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroId();
            }

            if (this.hasMapGroup()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMapGroup();
            }

            if (this.hasType()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getType();
            }

            if (this.hasUnionLevel()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getUnionLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterChapter_16003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_16003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_16003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_16003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_16003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data);
      }

      public static S2C_EnterChapter_16003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterChapter_16003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterChapter_16003 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_16003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterChapter_16003 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_16003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterChapter_16003 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterChapter_16003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterChapter_16003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterChapter_16003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterChapter_16003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterChapter_16003> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterChapter_16003> getParserForType() {
         return PARSER;
      }

      public S2C_EnterChapter_16003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterChapter_16003OrBuilder {
         private int bitField0_;
         private int currentChapter_;
         private int curGrid_;
         private List<S2C_GridInfo_16004> gridInfo_;
         private RepeatedFieldBuilderV3<S2C_GridInfo_16004, S2C_GridInfo_16004.Builder, S2C_GridInfo_16004OrBuilder> gridInfoBuilder_;
         private int heroId_;
         private int mapGroup_;
         private int type_;
         private int unionLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterChapter_16003.class, Builder.class);
         }

         private Builder() {
            this.gridInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_EnterChapter_16003.alwaysUseFieldBuilders) {
               this.getGridInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.currentChapter_ = 0;
            this.bitField0_ &= -2;
            this.curGrid_ = 0;
            this.bitField0_ &= -3;
            if (this.gridInfoBuilder_ == null) {
               this.gridInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.gridInfoBuilder_.clear();
            }

            this.heroId_ = 0;
            this.bitField0_ &= -9;
            this.mapGroup_ = 0;
            this.bitField0_ &= -17;
            this.type_ = 0;
            this.bitField0_ &= -33;
            this.unionLevel_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnterChapter_16003_descriptor;
         }

         public S2C_EnterChapter_16003 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_EnterChapter_16003.getDefaultInstance();
         }

         public S2C_EnterChapter_16003 build() {
            S2C_EnterChapter_16003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterChapter_16003 buildPartial() {
            S2C_EnterChapter_16003 result = new S2C_EnterChapter_16003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.currentChapter_ = this.currentChapter_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.curGrid_ = this.curGrid_;
               to_bitField0_ |= 2;
            }

            if (this.gridInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.gridInfo_ = Collections.unmodifiableList(this.gridInfo_);
                  this.bitField0_ &= -5;
               }

               result.gridInfo_ = this.gridInfo_;
            } else {
               result.gridInfo_ = this.gridInfoBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.mapGroup_ = this.mapGroup_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.unionLevel_ = this.unionLevel_;
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
            if (other instanceof S2C_EnterChapter_16003) {
               return this.mergeFrom((S2C_EnterChapter_16003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterChapter_16003 other) {
            if (other == UnionDailyGuessMsg.S2C_EnterChapter_16003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurrentChapter()) {
                  this.setCurrentChapter(other.getCurrentChapter());
               }

               if (other.hasCurGrid()) {
                  this.setCurGrid(other.getCurGrid());
               }

               if (this.gridInfoBuilder_ == null) {
                  if (!other.gridInfo_.isEmpty()) {
                     if (this.gridInfo_.isEmpty()) {
                        this.gridInfo_ = other.gridInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureGridInfoIsMutable();
                        this.gridInfo_.addAll(other.gridInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.gridInfo_.isEmpty()) {
                  if (this.gridInfoBuilder_.isEmpty()) {
                     this.gridInfoBuilder_.dispose();
                     this.gridInfoBuilder_ = null;
                     this.gridInfo_ = other.gridInfo_;
                     this.bitField0_ &= -5;
                     this.gridInfoBuilder_ = UnionDailyGuessMsg.S2C_EnterChapter_16003.alwaysUseFieldBuilders ? this.getGridInfoFieldBuilder() : null;
                  } else {
                     this.gridInfoBuilder_.addAllMessages(other.gridInfo_);
                  }
               }

               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasMapGroup()) {
                  this.setMapGroup(other.getMapGroup());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasUnionLevel()) {
                  this.setUnionLevel(other.getUnionLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCurrentChapter()) {
               return false;
            } else if (!this.hasCurGrid()) {
               return false;
            } else if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasMapGroup()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasUnionLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getGridInfoCount(); ++i) {
                  if (!this.getGridInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnterChapter_16003 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterChapter_16003)UnionDailyGuessMsg.S2C_EnterChapter_16003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterChapter_16003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurrentChapter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurrentChapter() {
            return this.currentChapter_;
         }

         public Builder setCurrentChapter(int value) {
            this.bitField0_ |= 1;
            this.currentChapter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurrentChapter() {
            this.bitField0_ &= -2;
            this.currentChapter_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCurGrid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCurGrid() {
            return this.curGrid_;
         }

         public Builder setCurGrid(int value) {
            this.bitField0_ |= 2;
            this.curGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurGrid() {
            this.bitField0_ &= -3;
            this.curGrid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGridInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gridInfo_ = new ArrayList(this.gridInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<S2C_GridInfo_16004> getGridInfoList() {
            return this.gridInfoBuilder_ == null ? Collections.unmodifiableList(this.gridInfo_) : this.gridInfoBuilder_.getMessageList();
         }

         public int getGridInfoCount() {
            return this.gridInfoBuilder_ == null ? this.gridInfo_.size() : this.gridInfoBuilder_.getCount();
         }

         public S2C_GridInfo_16004 getGridInfo(int index) {
            return this.gridInfoBuilder_ == null ? (S2C_GridInfo_16004)this.gridInfo_.get(index) : (S2C_GridInfo_16004)this.gridInfoBuilder_.getMessage(index);
         }

         public Builder setGridInfo(int index, S2C_GridInfo_16004 value) {
            if (this.gridInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridInfoIsMutable();
               this.gridInfo_.set(index, value);
               this.onChanged();
            } else {
               this.gridInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGridInfo(int index, S2C_GridInfo_16004.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGridInfo(S2C_GridInfo_16004 value) {
            if (this.gridInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(value);
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGridInfo(int index, S2C_GridInfo_16004 value) {
            if (this.gridInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(index, value);
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGridInfo(S2C_GridInfo_16004.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGridInfo(int index, S2C_GridInfo_16004.Builder builderForValue) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGridInfo(Iterable<? extends S2C_GridInfo_16004> values) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gridInfo_);
               this.onChanged();
            } else {
               this.gridInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGridInfo() {
            if (this.gridInfoBuilder_ == null) {
               this.gridInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.gridInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeGridInfo(int index) {
            if (this.gridInfoBuilder_ == null) {
               this.ensureGridInfoIsMutable();
               this.gridInfo_.remove(index);
               this.onChanged();
            } else {
               this.gridInfoBuilder_.remove(index);
            }

            return this;
         }

         public S2C_GridInfo_16004.Builder getGridInfoBuilder(int index) {
            return (S2C_GridInfo_16004.Builder)this.getGridInfoFieldBuilder().getBuilder(index);
         }

         public S2C_GridInfo_16004OrBuilder getGridInfoOrBuilder(int index) {
            return this.gridInfoBuilder_ == null ? (S2C_GridInfo_16004OrBuilder)this.gridInfo_.get(index) : (S2C_GridInfo_16004OrBuilder)this.gridInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_GridInfo_16004OrBuilder> getGridInfoOrBuilderList() {
            return this.gridInfoBuilder_ != null ? this.gridInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gridInfo_);
         }

         public S2C_GridInfo_16004.Builder addGridInfoBuilder() {
            return (S2C_GridInfo_16004.Builder)this.getGridInfoFieldBuilder().addBuilder(UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance());
         }

         public S2C_GridInfo_16004.Builder addGridInfoBuilder(int index) {
            return (S2C_GridInfo_16004.Builder)this.getGridInfoFieldBuilder().addBuilder(index, UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance());
         }

         public List<S2C_GridInfo_16004.Builder> getGridInfoBuilderList() {
            return this.getGridInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_GridInfo_16004, S2C_GridInfo_16004.Builder, S2C_GridInfo_16004OrBuilder> getGridInfoFieldBuilder() {
            if (this.gridInfoBuilder_ == null) {
               this.gridInfoBuilder_ = new RepeatedFieldBuilderV3(this.gridInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.gridInfo_ = null;
            }

            return this.gridInfoBuilder_;
         }

         public boolean hasHeroId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHeroId() {
            return this.heroId_;
         }

         public Builder setHeroId(int value) {
            this.bitField0_ |= 8;
            this.heroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroId() {
            this.bitField0_ &= -9;
            this.heroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapGroup() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getMapGroup() {
            return this.mapGroup_;
         }

         public Builder setMapGroup(int value) {
            this.bitField0_ |= 16;
            this.mapGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapGroup() {
            this.bitField0_ &= -17;
            this.mapGroup_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 32;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -33;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionLevel() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getUnionLevel() {
            return this.unionLevel_;
         }

         public Builder setUnionLevel(int value) {
            this.bitField0_ |= 64;
            this.unionLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionLevel() {
            this.bitField0_ &= -65;
            this.unionLevel_ = 0;
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

   public static final class S2C_GridInfo_16004 extends GeneratedMessageV3 implements S2C_GridInfo_16004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int EVENTIDX_FIELD_NUMBER = 2;
      private int eventIdx_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_GridInfo_16004 DEFAULT_INSTANCE = new S2C_GridInfo_16004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GridInfo_16004> PARSER = new AbstractParser<S2C_GridInfo_16004>() {
         public S2C_GridInfo_16004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GridInfo_16004(input, extensionRegistry);
         }
      };

      private S2C_GridInfo_16004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GridInfo_16004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GridInfo_16004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GridInfo_16004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventIdx_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GridInfo_16004.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasEventIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventIdx() {
         return this.eventIdx_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventIdx_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventIdx_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GridInfo_16004)) {
            return super.equals(obj);
         } else {
            S2C_GridInfo_16004 other = (S2C_GridInfo_16004)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasEventIdx() != other.hasEventIdx()) {
               return false;
            } else if (this.hasEventIdx() && this.getEventIdx() != other.getEventIdx()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasEventIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventIdx();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GridInfo_16004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_16004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_16004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_16004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_16004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data);
      }

      public static S2C_GridInfo_16004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GridInfo_16004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GridInfo_16004 parseFrom(InputStream input) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_16004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GridInfo_16004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_16004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GridInfo_16004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GridInfo_16004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GridInfo_16004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GridInfo_16004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GridInfo_16004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GridInfo_16004> parser() {
         return PARSER;
      }

      public Parser<S2C_GridInfo_16004> getParserForType() {
         return PARSER;
      }

      public S2C_GridInfo_16004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GridInfo_16004OrBuilder {
         private int bitField0_;
         private int grid_;
         private int eventIdx_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GridInfo_16004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_GridInfo_16004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.eventIdx_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_GridInfo_16004_descriptor;
         }

         public S2C_GridInfo_16004 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance();
         }

         public S2C_GridInfo_16004 build() {
            S2C_GridInfo_16004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GridInfo_16004 buildPartial() {
            S2C_GridInfo_16004 result = new S2C_GridInfo_16004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventIdx_ = this.eventIdx_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_GridInfo_16004) {
               return this.mergeFrom((S2C_GridInfo_16004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GridInfo_16004 other) {
            if (other == UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasEventIdx()) {
                  this.setEventIdx(other.getEventIdx());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasEventIdx()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GridInfo_16004 parsedMessage = null;

            try {
               parsedMessage = (S2C_GridInfo_16004)UnionDailyGuessMsg.S2C_GridInfo_16004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GridInfo_16004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEventIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventIdx() {
            return this.eventIdx_;
         }

         public Builder setEventIdx(int value) {
            this.bitField0_ |= 2;
            this.eventIdx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventIdx() {
            this.bitField0_ &= -3;
            this.eventIdx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 4;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
            this.state_ = 0;
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

   public static final class S2C_UnlockSeeGrids_16005 extends GeneratedMessageV3 implements S2C_UnlockSeeGrids_16005OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GRID_FIELD_NUMBER = 1;
      private Internal.IntList grid_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockSeeGrids_16005 DEFAULT_INSTANCE = new S2C_UnlockSeeGrids_16005();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockSeeGrids_16005> PARSER = new AbstractParser<S2C_UnlockSeeGrids_16005>() {
         public S2C_UnlockSeeGrids_16005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockSeeGrids_16005(input, extensionRegistry);
         }
      };

      private S2C_UnlockSeeGrids_16005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockSeeGrids_16005() {
         this.memoizedIsInitialized = -1;
         this.grid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockSeeGrids_16005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockSeeGrids_16005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.grid_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.grid_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.grid_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.grid_.addInt(input.readInt32());
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
                  this.grid_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockSeeGrids_16005.class, Builder.class);
      }

      public List<Integer> getGridList() {
         return this.grid_;
      }

      public int getGridCount() {
         return this.grid_.size();
      }

      public int getGrid(int index) {
         return this.grid_.getInt(index);
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
         for(int i = 0; i < this.grid_.size(); ++i) {
            output.writeInt32(1, this.grid_.getInt(i));
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

            for(int i = 0; i < this.grid_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.grid_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGridList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockSeeGrids_16005)) {
            return super.equals(obj);
         } else {
            S2C_UnlockSeeGrids_16005 other = (S2C_UnlockSeeGrids_16005)obj;
            if (!this.getGridList().equals(other.getGridList())) {
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
            if (this.getGridCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockSeeGrids_16005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_16005 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_16005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockSeeGrids_16005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockSeeGrids_16005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockSeeGrids_16005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockSeeGrids_16005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockSeeGrids_16005> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockSeeGrids_16005> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockSeeGrids_16005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockSeeGrids_16005OrBuilder {
         private int bitField0_;
         private Internal.IntList grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockSeeGrids_16005.class, Builder.class);
         }

         private Builder() {
            this.grid_ = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.grid_ = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UnlockSeeGrids_16005_descriptor;
         }

         public S2C_UnlockSeeGrids_16005 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.getDefaultInstance();
         }

         public S2C_UnlockSeeGrids_16005 build() {
            S2C_UnlockSeeGrids_16005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockSeeGrids_16005 buildPartial() {
            S2C_UnlockSeeGrids_16005 result = new S2C_UnlockSeeGrids_16005(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.grid_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.grid_ = this.grid_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_UnlockSeeGrids_16005) {
               return this.mergeFrom((S2C_UnlockSeeGrids_16005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockSeeGrids_16005 other) {
            if (other == UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.getDefaultInstance()) {
               return this;
            } else {
               if (!other.grid_.isEmpty()) {
                  if (this.grid_.isEmpty()) {
                     this.grid_ = other.grid_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGridIsMutable();
                     this.grid_.addAll(other.grid_);
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
            S2C_UnlockSeeGrids_16005 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockSeeGrids_16005)UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockSeeGrids_16005)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGridIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.grid_ = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.mutableCopy(this.grid_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGridList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.grid_) : this.grid_);
         }

         public int getGridCount() {
            return this.grid_.size();
         }

         public int getGrid(int index) {
            return this.grid_.getInt(index);
         }

         public Builder setGrid(int index, int value) {
            this.ensureGridIsMutable();
            this.grid_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGrid(int value) {
            this.ensureGridIsMutable();
            this.grid_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGrid(Iterable<? extends Integer> values) {
            this.ensureGridIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.grid_);
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.grid_ = UnionDailyGuessMsg.S2C_UnlockSeeGrids_16005.emptyIntList();
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

   public static final class S2C_UpdateGridInfo_16006 extends GeneratedMessageV3 implements S2C_UpdateGridInfo_16006OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<S2C_GridInfo_16004> info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateGridInfo_16006 DEFAULT_INSTANCE = new S2C_UpdateGridInfo_16006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateGridInfo_16006> PARSER = new AbstractParser<S2C_UpdateGridInfo_16006>() {
         public S2C_UpdateGridInfo_16006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateGridInfo_16006(input, extensionRegistry);
         }
      };

      private S2C_UpdateGridInfo_16006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateGridInfo_16006() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateGridInfo_16006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateGridInfo_16006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(UnionDailyGuessMsg.S2C_GridInfo_16004.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateGridInfo_16006.class, Builder.class);
      }

      public List<S2C_GridInfo_16004> getInfoList() {
         return this.info_;
      }

      public List<? extends S2C_GridInfo_16004OrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public S2C_GridInfo_16004 getInfo(int index) {
         return (S2C_GridInfo_16004)this.info_.get(index);
      }

      public S2C_GridInfo_16004OrBuilder getInfoOrBuilder(int index) {
         return (S2C_GridInfo_16004OrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateGridInfo_16006)) {
            return super.equals(obj);
         } else {
            S2C_UpdateGridInfo_16006 other = (S2C_UpdateGridInfo_16006)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateGridInfo_16006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_16006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_16006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateGridInfo_16006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateGridInfo_16006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateGridInfo_16006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateGridInfo_16006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateGridInfo_16006> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateGridInfo_16006> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateGridInfo_16006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateGridInfo_16006OrBuilder {
         private int bitField0_;
         private List<S2C_GridInfo_16004> info_;
         private RepeatedFieldBuilderV3<S2C_GridInfo_16004, S2C_GridInfo_16004.Builder, S2C_GridInfo_16004OrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateGridInfo_16006.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdateGridInfo_16006_descriptor;
         }

         public S2C_UpdateGridInfo_16006 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.getDefaultInstance();
         }

         public S2C_UpdateGridInfo_16006 build() {
            S2C_UpdateGridInfo_16006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateGridInfo_16006 buildPartial() {
            S2C_UpdateGridInfo_16006 result = new S2C_UpdateGridInfo_16006(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_UpdateGridInfo_16006) {
               return this.mergeFrom((S2C_UpdateGridInfo_16006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateGridInfo_16006 other) {
            if (other == UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -2;
                     this.infoBuilder_ = UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateGridInfo_16006 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateGridInfo_16006)UnionDailyGuessMsg.S2C_UpdateGridInfo_16006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateGridInfo_16006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 1;
            }

         }

         public List<S2C_GridInfo_16004> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public S2C_GridInfo_16004 getInfo(int index) {
            return this.infoBuilder_ == null ? (S2C_GridInfo_16004)this.info_.get(index) : (S2C_GridInfo_16004)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, S2C_GridInfo_16004 value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, S2C_GridInfo_16004.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(S2C_GridInfo_16004 value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, S2C_GridInfo_16004 value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(S2C_GridInfo_16004.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, S2C_GridInfo_16004.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends S2C_GridInfo_16004> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public S2C_GridInfo_16004.Builder getInfoBuilder(int index) {
            return (S2C_GridInfo_16004.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public S2C_GridInfo_16004OrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (S2C_GridInfo_16004OrBuilder)this.info_.get(index) : (S2C_GridInfo_16004OrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_GridInfo_16004OrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public S2C_GridInfo_16004.Builder addInfoBuilder() {
            return (S2C_GridInfo_16004.Builder)this.getInfoFieldBuilder().addBuilder(UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance());
         }

         public S2C_GridInfo_16004.Builder addInfoBuilder(int index) {
            return (S2C_GridInfo_16004.Builder)this.getInfoFieldBuilder().addBuilder(index, UnionDailyGuessMsg.S2C_GridInfo_16004.getDefaultInstance());
         }

         public List<S2C_GridInfo_16004.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_GridInfo_16004, S2C_GridInfo_16004.Builder, S2C_GridInfo_16004OrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SkipBattle_16007 extends GeneratedMessageV3 implements C2S_SkipBattle_16007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRIDID_FIELD_NUMBER = 1;
      private int gridId_;
      private byte memoizedIsInitialized;
      private static final C2S_SkipBattle_16007 DEFAULT_INSTANCE = new C2S_SkipBattle_16007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkipBattle_16007> PARSER = new AbstractParser<C2S_SkipBattle_16007>() {
         public C2S_SkipBattle_16007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkipBattle_16007(input, extensionRegistry);
         }
      };

      private C2S_SkipBattle_16007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkipBattle_16007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkipBattle_16007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkipBattle_16007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gridId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkipBattle_16007.class, Builder.class);
      }

      public boolean hasGridId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGridId() {
         return this.gridId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGridId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gridId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gridId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SkipBattle_16007)) {
            return super.equals(obj);
         } else {
            C2S_SkipBattle_16007 other = (C2S_SkipBattle_16007)obj;
            if (this.hasGridId() != other.hasGridId()) {
               return false;
            } else if (this.hasGridId() && this.getGridId() != other.getGridId()) {
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
            if (this.hasGridId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SkipBattle_16007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data);
      }

      public static C2S_SkipBattle_16007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipBattle_16007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data);
      }

      public static C2S_SkipBattle_16007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipBattle_16007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data);
      }

      public static C2S_SkipBattle_16007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipBattle_16007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipBattle_16007 parseFrom(InputStream input) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkipBattle_16007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkipBattle_16007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkipBattle_16007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkipBattle_16007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkipBattle_16007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipBattle_16007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkipBattle_16007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkipBattle_16007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkipBattle_16007> parser() {
         return PARSER;
      }

      public Parser<C2S_SkipBattle_16007> getParserForType() {
         return PARSER;
      }

      public C2S_SkipBattle_16007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkipBattle_16007OrBuilder {
         private int bitField0_;
         private int gridId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkipBattle_16007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_SkipBattle_16007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gridId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SkipBattle_16007_descriptor;
         }

         public C2S_SkipBattle_16007 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_SkipBattle_16007.getDefaultInstance();
         }

         public C2S_SkipBattle_16007 build() {
            C2S_SkipBattle_16007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkipBattle_16007 buildPartial() {
            C2S_SkipBattle_16007 result = new C2S_SkipBattle_16007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gridId_ = this.gridId_;
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
            if (other instanceof C2S_SkipBattle_16007) {
               return this.mergeFrom((C2S_SkipBattle_16007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkipBattle_16007 other) {
            if (other == UnionDailyGuessMsg.C2S_SkipBattle_16007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGridId()) {
                  this.setGridId(other.getGridId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGridId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SkipBattle_16007 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkipBattle_16007)UnionDailyGuessMsg.C2S_SkipBattle_16007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkipBattle_16007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGridId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGridId() {
            return this.gridId_;
         }

         public Builder setGridId(int value) {
            this.bitField0_ |= 1;
            this.gridId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGridId() {
            this.bitField0_ &= -2;
            this.gridId_ = 0;
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

   public static final class S2C_SkipBattle_16008 extends GeneratedMessageV3 implements S2C_SkipBattle_16008OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_SkipBattle_16008 DEFAULT_INSTANCE = new S2C_SkipBattle_16008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkipBattle_16008> PARSER = new AbstractParser<S2C_SkipBattle_16008>() {
         public S2C_SkipBattle_16008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkipBattle_16008(input, extensionRegistry);
         }
      };

      private S2C_SkipBattle_16008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkipBattle_16008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkipBattle_16008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkipBattle_16008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkipBattle_16008.class, Builder.class);
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
         } else if (!(obj instanceof S2C_SkipBattle_16008)) {
            return super.equals(obj);
         } else {
            S2C_SkipBattle_16008 other = (S2C_SkipBattle_16008)obj;
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

      public static S2C_SkipBattle_16008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data);
      }

      public static S2C_SkipBattle_16008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipBattle_16008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data);
      }

      public static S2C_SkipBattle_16008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipBattle_16008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data);
      }

      public static S2C_SkipBattle_16008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipBattle_16008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipBattle_16008 parseFrom(InputStream input) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkipBattle_16008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkipBattle_16008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkipBattle_16008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkipBattle_16008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkipBattle_16008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipBattle_16008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkipBattle_16008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkipBattle_16008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkipBattle_16008> parser() {
         return PARSER;
      }

      public Parser<S2C_SkipBattle_16008> getParserForType() {
         return PARSER;
      }

      public S2C_SkipBattle_16008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkipBattle_16008OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkipBattle_16008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_SkipBattle_16008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SkipBattle_16008_descriptor;
         }

         public S2C_SkipBattle_16008 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_SkipBattle_16008.getDefaultInstance();
         }

         public S2C_SkipBattle_16008 build() {
            S2C_SkipBattle_16008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkipBattle_16008 buildPartial() {
            S2C_SkipBattle_16008 result = new S2C_SkipBattle_16008(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_SkipBattle_16008) {
               return this.mergeFrom((S2C_SkipBattle_16008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkipBattle_16008 other) {
            if (other == UnionDailyGuessMsg.S2C_SkipBattle_16008.getDefaultInstance()) {
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
            S2C_SkipBattle_16008 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkipBattle_16008)UnionDailyGuessMsg.S2C_SkipBattle_16008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkipBattle_16008)e.getUnfinishedMessage();
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

   public static final class C2S_Move_16009 extends GeneratedMessageV3 implements C2S_Move_16009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIGRID_FIELD_NUMBER = 1;
      private int oriGrid_;
      public static final int DESTGRID_FIELD_NUMBER = 2;
      private int destGrid_;
      public static final int PASSGRID_FIELD_NUMBER = 3;
      private Internal.IntList passGrid_;
      private byte memoizedIsInitialized;
      private static final C2S_Move_16009 DEFAULT_INSTANCE = new C2S_Move_16009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Move_16009> PARSER = new AbstractParser<C2S_Move_16009>() {
         public C2S_Move_16009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Move_16009(input, extensionRegistry);
         }
      };

      private C2S_Move_16009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Move_16009() {
         this.memoizedIsInitialized = -1;
         this.passGrid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Move_16009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Move_16009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.oriGrid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destGrid_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.passGrid_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.passGrid_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passGrid_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.passGrid_.addInt(input.readInt32());
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
                  this.passGrid_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Move_16009.class, Builder.class);
      }

      public boolean hasOriGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOriGrid() {
         return this.oriGrid_;
      }

      public boolean hasDestGrid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestGrid() {
         return this.destGrid_;
      }

      public List<Integer> getPassGridList() {
         return this.passGrid_;
      }

      public int getPassGridCount() {
         return this.passGrid_.size();
      }

      public int getPassGrid(int index) {
         return this.passGrid_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOriGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.oriGrid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destGrid_);
         }

         for(int i = 0; i < this.passGrid_.size(); ++i) {
            output.writeInt32(3, this.passGrid_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.oriGrid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destGrid_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.passGrid_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passGrid_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassGridList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Move_16009)) {
            return super.equals(obj);
         } else {
            C2S_Move_16009 other = (C2S_Move_16009)obj;
            if (this.hasOriGrid() != other.hasOriGrid()) {
               return false;
            } else if (this.hasOriGrid() && this.getOriGrid() != other.getOriGrid()) {
               return false;
            } else if (this.hasDestGrid() != other.hasDestGrid()) {
               return false;
            } else if (this.hasDestGrid() && this.getDestGrid() != other.getDestGrid()) {
               return false;
            } else if (!this.getPassGridList().equals(other.getPassGridList())) {
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
            if (this.hasOriGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriGrid();
            }

            if (this.hasDestGrid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestGrid();
            }

            if (this.getPassGridCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPassGridList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Move_16009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data);
      }

      public static C2S_Move_16009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_16009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data);
      }

      public static C2S_Move_16009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_16009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data);
      }

      public static C2S_Move_16009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Move_16009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Move_16009 parseFrom(InputStream input) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Move_16009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Move_16009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Move_16009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Move_16009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Move_16009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Move_16009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Move_16009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Move_16009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Move_16009> parser() {
         return PARSER;
      }

      public Parser<C2S_Move_16009> getParserForType() {
         return PARSER;
      }

      public C2S_Move_16009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Move_16009OrBuilder {
         private int bitField0_;
         private int oriGrid_;
         private int destGrid_;
         private Internal.IntList passGrid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Move_16009.class, Builder.class);
         }

         private Builder() {
            this.passGrid_ = UnionDailyGuessMsg.C2S_Move_16009.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passGrid_ = UnionDailyGuessMsg.C2S_Move_16009.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_Move_16009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.oriGrid_ = 0;
            this.bitField0_ &= -2;
            this.destGrid_ = 0;
            this.bitField0_ &= -3;
            this.passGrid_ = UnionDailyGuessMsg.C2S_Move_16009.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_Move_16009_descriptor;
         }

         public C2S_Move_16009 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_Move_16009.getDefaultInstance();
         }

         public C2S_Move_16009 build() {
            C2S_Move_16009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Move_16009 buildPartial() {
            C2S_Move_16009 result = new C2S_Move_16009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.oriGrid_ = this.oriGrid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destGrid_ = this.destGrid_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.passGrid_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.passGrid_ = this.passGrid_;
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
            if (other instanceof C2S_Move_16009) {
               return this.mergeFrom((C2S_Move_16009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Move_16009 other) {
            if (other == UnionDailyGuessMsg.C2S_Move_16009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOriGrid()) {
                  this.setOriGrid(other.getOriGrid());
               }

               if (other.hasDestGrid()) {
                  this.setDestGrid(other.getDestGrid());
               }

               if (!other.passGrid_.isEmpty()) {
                  if (this.passGrid_.isEmpty()) {
                     this.passGrid_ = other.passGrid_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensurePassGridIsMutable();
                     this.passGrid_.addAll(other.passGrid_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOriGrid()) {
               return false;
            } else {
               return this.hasDestGrid();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Move_16009 parsedMessage = null;

            try {
               parsedMessage = (C2S_Move_16009)UnionDailyGuessMsg.C2S_Move_16009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Move_16009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOriGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOriGrid() {
            return this.oriGrid_;
         }

         public Builder setOriGrid(int value) {
            this.bitField0_ |= 1;
            this.oriGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriGrid() {
            this.bitField0_ &= -2;
            this.oriGrid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestGrid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestGrid() {
            return this.destGrid_;
         }

         public Builder setDestGrid(int value) {
            this.bitField0_ |= 2;
            this.destGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestGrid() {
            this.bitField0_ &= -3;
            this.destGrid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePassGridIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.passGrid_ = UnionDailyGuessMsg.C2S_Move_16009.mutableCopy(this.passGrid_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getPassGridList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.passGrid_) : this.passGrid_);
         }

         public int getPassGridCount() {
            return this.passGrid_.size();
         }

         public int getPassGrid(int index) {
            return this.passGrid_.getInt(index);
         }

         public Builder setPassGrid(int index, int value) {
            this.ensurePassGridIsMutable();
            this.passGrid_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassGrid(int value) {
            this.ensurePassGridIsMutable();
            this.passGrid_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassGrid(Iterable<? extends Integer> values) {
            this.ensurePassGridIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passGrid_);
            this.onChanged();
            return this;
         }

         public Builder clearPassGrid() {
            this.passGrid_ = UnionDailyGuessMsg.C2S_Move_16009.emptyIntList();
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

   public static final class S2C_Move_16010 extends GeneratedMessageV3 implements S2C_Move_16010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DESTGRID_FIELD_NUMBER = 2;
      private int destGrid_;
      private byte memoizedIsInitialized;
      private static final S2C_Move_16010 DEFAULT_INSTANCE = new S2C_Move_16010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Move_16010> PARSER = new AbstractParser<S2C_Move_16010>() {
         public S2C_Move_16010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Move_16010(input, extensionRegistry);
         }
      };

      private S2C_Move_16010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Move_16010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Move_16010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Move_16010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.destGrid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Move_16010.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasDestGrid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestGrid() {
         return this.destGrid_;
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
         } else if (!this.hasDestGrid()) {
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
            output.writeInt32(2, this.destGrid_);
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
               size += CodedOutputStream.computeInt32Size(2, this.destGrid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Move_16010)) {
            return super.equals(obj);
         } else {
            S2C_Move_16010 other = (S2C_Move_16010)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasDestGrid() != other.hasDestGrid()) {
               return false;
            } else if (this.hasDestGrid() && this.getDestGrid() != other.getDestGrid()) {
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

            if (this.hasDestGrid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Move_16010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data);
      }

      public static S2C_Move_16010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_16010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data);
      }

      public static S2C_Move_16010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_16010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data);
      }

      public static S2C_Move_16010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Move_16010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Move_16010 parseFrom(InputStream input) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Move_16010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Move_16010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Move_16010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Move_16010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Move_16010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Move_16010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Move_16010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Move_16010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Move_16010> parser() {
         return PARSER;
      }

      public Parser<S2C_Move_16010> getParserForType() {
         return PARSER;
      }

      public S2C_Move_16010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Move_16010OrBuilder {
         private int bitField0_;
         private int result_;
         private int destGrid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Move_16010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_Move_16010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.destGrid_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_Move_16010_descriptor;
         }

         public S2C_Move_16010 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_Move_16010.getDefaultInstance();
         }

         public S2C_Move_16010 build() {
            S2C_Move_16010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Move_16010 buildPartial() {
            S2C_Move_16010 result = new S2C_Move_16010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destGrid_ = this.destGrid_;
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
            if (other instanceof S2C_Move_16010) {
               return this.mergeFrom((S2C_Move_16010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Move_16010 other) {
            if (other == UnionDailyGuessMsg.S2C_Move_16010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasDestGrid()) {
                  this.setDestGrid(other.getDestGrid());
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
               return this.hasDestGrid();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Move_16010 parsedMessage = null;

            try {
               parsedMessage = (S2C_Move_16010)UnionDailyGuessMsg.S2C_Move_16010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Move_16010)e.getUnfinishedMessage();
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

         public boolean hasDestGrid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestGrid() {
            return this.destGrid_;
         }

         public Builder setDestGrid(int value) {
            this.bitField0_ |= 2;
            this.destGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestGrid() {
            this.bitField0_ &= -3;
            this.destGrid_ = 0;
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

   public static final class C2S_SelectRandomBox_16012 extends GeneratedMessageV3 implements C2S_SelectRandomBox_16012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_SelectRandomBox_16012 DEFAULT_INSTANCE = new C2S_SelectRandomBox_16012();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SelectRandomBox_16012> PARSER = new AbstractParser<C2S_SelectRandomBox_16012>() {
         public C2S_SelectRandomBox_16012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SelectRandomBox_16012(input, extensionRegistry);
         }
      };

      private C2S_SelectRandomBox_16012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SelectRandomBox_16012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SelectRandomBox_16012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SelectRandomBox_16012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectRandomBox_16012.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SelectRandomBox_16012)) {
            return super.equals(obj);
         } else {
            C2S_SelectRandomBox_16012 other = (C2S_SelectRandomBox_16012)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SelectRandomBox_16012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectRandomBox_16012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(InputStream input) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectRandomBox_16012 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SelectRandomBox_16012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectRandomBox_16012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectRandomBox_16012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SelectRandomBox_16012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SelectRandomBox_16012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SelectRandomBox_16012> parser() {
         return PARSER;
      }

      public Parser<C2S_SelectRandomBox_16012> getParserForType() {
         return PARSER;
      }

      public C2S_SelectRandomBox_16012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SelectRandomBox_16012OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectRandomBox_16012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_SelectRandomBox_16012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_SelectRandomBox_16012_descriptor;
         }

         public C2S_SelectRandomBox_16012 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_SelectRandomBox_16012.getDefaultInstance();
         }

         public C2S_SelectRandomBox_16012 build() {
            C2S_SelectRandomBox_16012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SelectRandomBox_16012 buildPartial() {
            C2S_SelectRandomBox_16012 result = new C2S_SelectRandomBox_16012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof C2S_SelectRandomBox_16012) {
               return this.mergeFrom((C2S_SelectRandomBox_16012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SelectRandomBox_16012 other) {
            if (other == UnionDailyGuessMsg.C2S_SelectRandomBox_16012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SelectRandomBox_16012 parsedMessage = null;

            try {
               parsedMessage = (C2S_SelectRandomBox_16012)UnionDailyGuessMsg.C2S_SelectRandomBox_16012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SelectRandomBox_16012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class S2C_SelectRandomBox_16013 extends GeneratedMessageV3 implements S2C_SelectRandomBox_16013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_SelectRandomBox_16013 DEFAULT_INSTANCE = new S2C_SelectRandomBox_16013();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SelectRandomBox_16013> PARSER = new AbstractParser<S2C_SelectRandomBox_16013>() {
         public S2C_SelectRandomBox_16013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SelectRandomBox_16013(input, extensionRegistry);
         }
      };

      private S2C_SelectRandomBox_16013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SelectRandomBox_16013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SelectRandomBox_16013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SelectRandomBox_16013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SelectRandomBox_16013.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SelectRandomBox_16013)) {
            return super.equals(obj);
         } else {
            S2C_SelectRandomBox_16013 other = (S2C_SelectRandomBox_16013)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SelectRandomBox_16013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SelectRandomBox_16013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(InputStream input) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SelectRandomBox_16013 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SelectRandomBox_16013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SelectRandomBox_16013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SelectRandomBox_16013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SelectRandomBox_16013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SelectRandomBox_16013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SelectRandomBox_16013> parser() {
         return PARSER;
      }

      public Parser<S2C_SelectRandomBox_16013> getParserForType() {
         return PARSER;
      }

      public S2C_SelectRandomBox_16013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SelectRandomBox_16013OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SelectRandomBox_16013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_SelectRandomBox_16013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_SelectRandomBox_16013_descriptor;
         }

         public S2C_SelectRandomBox_16013 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_SelectRandomBox_16013.getDefaultInstance();
         }

         public S2C_SelectRandomBox_16013 build() {
            S2C_SelectRandomBox_16013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SelectRandomBox_16013 buildPartial() {
            S2C_SelectRandomBox_16013 result = new S2C_SelectRandomBox_16013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_SelectRandomBox_16013) {
               return this.mergeFrom((S2C_SelectRandomBox_16013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SelectRandomBox_16013 other) {
            if (other == UnionDailyGuessMsg.S2C_SelectRandomBox_16013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            S2C_SelectRandomBox_16013 parsedMessage = null;

            try {
               parsedMessage = (S2C_SelectRandomBox_16013)UnionDailyGuessMsg.S2C_SelectRandomBox_16013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SelectRandomBox_16013)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_EnemyData_16014 extends GeneratedMessageV3 implements C2S_EnemyData_16014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_EnemyData_16014 DEFAULT_INSTANCE = new C2S_EnemyData_16014();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnemyData_16014> PARSER = new AbstractParser<C2S_EnemyData_16014>() {
         public C2S_EnemyData_16014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnemyData_16014(input, extensionRegistry);
         }
      };

      private C2S_EnemyData_16014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnemyData_16014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnemyData_16014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnemyData_16014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnemyData_16014.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnemyData_16014)) {
            return super.equals(obj);
         } else {
            C2S_EnemyData_16014 other = (C2S_EnemyData_16014)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnemyData_16014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_16014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_16014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_16014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_16014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data);
      }

      public static C2S_EnemyData_16014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnemyData_16014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnemyData_16014 parseFrom(InputStream input) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_16014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnemyData_16014 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_16014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnemyData_16014 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnemyData_16014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnemyData_16014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnemyData_16014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnemyData_16014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnemyData_16014> parser() {
         return PARSER;
      }

      public Parser<C2S_EnemyData_16014> getParserForType() {
         return PARSER;
      }

      public C2S_EnemyData_16014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnemyData_16014OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnemyData_16014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_EnemyData_16014.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_EnemyData_16014_descriptor;
         }

         public C2S_EnemyData_16014 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_EnemyData_16014.getDefaultInstance();
         }

         public C2S_EnemyData_16014 build() {
            C2S_EnemyData_16014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnemyData_16014 buildPartial() {
            C2S_EnemyData_16014 result = new C2S_EnemyData_16014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof C2S_EnemyData_16014) {
               return this.mergeFrom((C2S_EnemyData_16014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnemyData_16014 other) {
            if (other == UnionDailyGuessMsg.C2S_EnemyData_16014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnemyData_16014 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnemyData_16014)UnionDailyGuessMsg.C2S_EnemyData_16014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnemyData_16014)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class S2C_EnemyData_16015 extends GeneratedMessageV3 implements S2C_EnemyData_16015OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int CANPASSBATTLE_FIELD_NUMBER = 2;
      private boolean canPassBattle_;
      private byte memoizedIsInitialized;
      private static final S2C_EnemyData_16015 DEFAULT_INSTANCE = new S2C_EnemyData_16015();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnemyData_16015> PARSER = new AbstractParser<S2C_EnemyData_16015>() {
         public S2C_EnemyData_16015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnemyData_16015(input, extensionRegistry);
         }
      };

      private S2C_EnemyData_16015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnemyData_16015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnemyData_16015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnemyData_16015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.canPassBattle_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnemyData_16015.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasCanPassBattle() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getCanPassBattle() {
         return this.canPassBattle_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCanPassBattle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.canPassBattle_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.canPassBattle_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnemyData_16015)) {
            return super.equals(obj);
         } else {
            S2C_EnemyData_16015 other = (S2C_EnemyData_16015)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasCanPassBattle() != other.hasCanPassBattle()) {
               return false;
            } else if (this.hasCanPassBattle() && this.getCanPassBattle() != other.getCanPassBattle()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasCanPassBattle()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getCanPassBattle());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnemyData_16015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_16015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_16015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_16015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_16015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data);
      }

      public static S2C_EnemyData_16015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnemyData_16015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnemyData_16015 parseFrom(InputStream input) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_16015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnemyData_16015 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_16015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnemyData_16015 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnemyData_16015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnemyData_16015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnemyData_16015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnemyData_16015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnemyData_16015> parser() {
         return PARSER;
      }

      public Parser<S2C_EnemyData_16015> getParserForType() {
         return PARSER;
      }

      public S2C_EnemyData_16015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnemyData_16015OrBuilder {
         private int bitField0_;
         private int grid_;
         private boolean canPassBattle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnemyData_16015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_EnemyData_16015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.canPassBattle_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_EnemyData_16015_descriptor;
         }

         public S2C_EnemyData_16015 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_EnemyData_16015.getDefaultInstance();
         }

         public S2C_EnemyData_16015 build() {
            S2C_EnemyData_16015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnemyData_16015 buildPartial() {
            S2C_EnemyData_16015 result = new S2C_EnemyData_16015(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.canPassBattle_ = this.canPassBattle_;
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
            if (other instanceof S2C_EnemyData_16015) {
               return this.mergeFrom((S2C_EnemyData_16015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnemyData_16015 other) {
            if (other == UnionDailyGuessMsg.S2C_EnemyData_16015.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasCanPassBattle()) {
                  this.setCanPassBattle(other.getCanPassBattle());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else {
               return this.hasCanPassBattle();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnemyData_16015 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnemyData_16015)UnionDailyGuessMsg.S2C_EnemyData_16015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnemyData_16015)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCanPassBattle() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getCanPassBattle() {
            return this.canPassBattle_;
         }

         public Builder setCanPassBattle(boolean value) {
            this.bitField0_ |= 2;
            this.canPassBattle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCanPassBattle() {
            this.bitField0_ &= -3;
            this.canPassBattle_ = false;
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

   public static final class C2S_OtherEvent_16016 extends GeneratedMessageV3 implements C2S_OtherEvent_16016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_OtherEvent_16016 DEFAULT_INSTANCE = new C2S_OtherEvent_16016();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OtherEvent_16016> PARSER = new AbstractParser<C2S_OtherEvent_16016>() {
         public C2S_OtherEvent_16016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OtherEvent_16016(input, extensionRegistry);
         }
      };

      private C2S_OtherEvent_16016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OtherEvent_16016() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OtherEvent_16016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OtherEvent_16016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OtherEvent_16016.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OtherEvent_16016)) {
            return super.equals(obj);
         } else {
            C2S_OtherEvent_16016 other = (C2S_OtherEvent_16016)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OtherEvent_16016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data);
      }

      public static C2S_OtherEvent_16016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherEvent_16016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data);
      }

      public static C2S_OtherEvent_16016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherEvent_16016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data);
      }

      public static C2S_OtherEvent_16016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OtherEvent_16016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OtherEvent_16016 parseFrom(InputStream input) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OtherEvent_16016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OtherEvent_16016 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OtherEvent_16016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OtherEvent_16016 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OtherEvent_16016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OtherEvent_16016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OtherEvent_16016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OtherEvent_16016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OtherEvent_16016> parser() {
         return PARSER;
      }

      public Parser<C2S_OtherEvent_16016> getParserForType() {
         return PARSER;
      }

      public C2S_OtherEvent_16016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OtherEvent_16016OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OtherEvent_16016.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_OtherEvent_16016.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_OtherEvent_16016_descriptor;
         }

         public C2S_OtherEvent_16016 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_OtherEvent_16016.getDefaultInstance();
         }

         public C2S_OtherEvent_16016 build() {
            C2S_OtherEvent_16016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OtherEvent_16016 buildPartial() {
            C2S_OtherEvent_16016 result = new C2S_OtherEvent_16016(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof C2S_OtherEvent_16016) {
               return this.mergeFrom((C2S_OtherEvent_16016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OtherEvent_16016 other) {
            if (other == UnionDailyGuessMsg.C2S_OtherEvent_16016.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OtherEvent_16016 parsedMessage = null;

            try {
               parsedMessage = (C2S_OtherEvent_16016)UnionDailyGuessMsg.C2S_OtherEvent_16016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OtherEvent_16016)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class S2C_OtherEvent_16017 extends GeneratedMessageV3 implements S2C_OtherEvent_16017OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final S2C_OtherEvent_16017 DEFAULT_INSTANCE = new S2C_OtherEvent_16017();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OtherEvent_16017> PARSER = new AbstractParser<S2C_OtherEvent_16017>() {
         public S2C_OtherEvent_16017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OtherEvent_16017(input, extensionRegistry);
         }
      };

      private S2C_OtherEvent_16017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OtherEvent_16017() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OtherEvent_16017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OtherEvent_16017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OtherEvent_16017.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OtherEvent_16017)) {
            return super.equals(obj);
         } else {
            S2C_OtherEvent_16017 other = (S2C_OtherEvent_16017)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OtherEvent_16017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data);
      }

      public static S2C_OtherEvent_16017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherEvent_16017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data);
      }

      public static S2C_OtherEvent_16017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherEvent_16017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data);
      }

      public static S2C_OtherEvent_16017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OtherEvent_16017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OtherEvent_16017 parseFrom(InputStream input) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OtherEvent_16017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OtherEvent_16017 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OtherEvent_16017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OtherEvent_16017 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OtherEvent_16017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OtherEvent_16017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OtherEvent_16017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OtherEvent_16017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OtherEvent_16017> parser() {
         return PARSER;
      }

      public Parser<S2C_OtherEvent_16017> getParserForType() {
         return PARSER;
      }

      public S2C_OtherEvent_16017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OtherEvent_16017OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OtherEvent_16017.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_OtherEvent_16017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_OtherEvent_16017_descriptor;
         }

         public S2C_OtherEvent_16017 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_OtherEvent_16017.getDefaultInstance();
         }

         public S2C_OtherEvent_16017 build() {
            S2C_OtherEvent_16017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OtherEvent_16017 buildPartial() {
            S2C_OtherEvent_16017 result = new S2C_OtherEvent_16017(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof S2C_OtherEvent_16017) {
               return this.mergeFrom((S2C_OtherEvent_16017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OtherEvent_16017 other) {
            if (other == UnionDailyGuessMsg.S2C_OtherEvent_16017.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OtherEvent_16017 parsedMessage = null;

            try {
               parsedMessage = (S2C_OtherEvent_16017)UnionDailyGuessMsg.S2C_OtherEvent_16017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OtherEvent_16017)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class C2S_PlayerUnionDailyGuessInfo_16018 extends GeneratedMessageV3 implements C2S_PlayerUnionDailyGuessInfo_16018OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PlayerUnionDailyGuessInfo_16018 DEFAULT_INSTANCE = new C2S_PlayerUnionDailyGuessInfo_16018();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayerUnionDailyGuessInfo_16018> PARSER = new AbstractParser<C2S_PlayerUnionDailyGuessInfo_16018>() {
         public C2S_PlayerUnionDailyGuessInfo_16018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayerUnionDailyGuessInfo_16018(input, extensionRegistry);
         }
      };

      private C2S_PlayerUnionDailyGuessInfo_16018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayerUnionDailyGuessInfo_16018() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayerUnionDailyGuessInfo_16018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayerUnionDailyGuessInfo_16018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerUnionDailyGuessInfo_16018.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PlayerUnionDailyGuessInfo_16018)) {
            return super.equals(obj);
         } else {
            C2S_PlayerUnionDailyGuessInfo_16018 other = (C2S_PlayerUnionDailyGuessInfo_16018)obj;
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

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerUnionDailyGuessInfo_16018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayerUnionDailyGuessInfo_16018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayerUnionDailyGuessInfo_16018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayerUnionDailyGuessInfo_16018> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayerUnionDailyGuessInfo_16018> getParserForType() {
         return PARSER;
      }

      public C2S_PlayerUnionDailyGuessInfo_16018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayerUnionDailyGuessInfo_16018OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerUnionDailyGuessInfo_16018.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_PlayerUnionDailyGuessInfo_16018.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_PlayerUnionDailyGuessInfo_16018_descriptor;
         }

         public C2S_PlayerUnionDailyGuessInfo_16018 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_PlayerUnionDailyGuessInfo_16018.getDefaultInstance();
         }

         public C2S_PlayerUnionDailyGuessInfo_16018 build() {
            C2S_PlayerUnionDailyGuessInfo_16018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayerUnionDailyGuessInfo_16018 buildPartial() {
            C2S_PlayerUnionDailyGuessInfo_16018 result = new C2S_PlayerUnionDailyGuessInfo_16018(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PlayerUnionDailyGuessInfo_16018) {
               return this.mergeFrom((C2S_PlayerUnionDailyGuessInfo_16018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayerUnionDailyGuessInfo_16018 other) {
            if (other == UnionDailyGuessMsg.C2S_PlayerUnionDailyGuessInfo_16018.getDefaultInstance()) {
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
            C2S_PlayerUnionDailyGuessInfo_16018 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayerUnionDailyGuessInfo_16018)UnionDailyGuessMsg.C2S_PlayerUnionDailyGuessInfo_16018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayerUnionDailyGuessInfo_16018)e.getUnfinishedMessage();
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

   public static final class S2C_PlayerUnionDailyGuessInfo_16019 extends GeneratedMessageV3 implements S2C_PlayerUnionDailyGuessInfo_16019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayerUnionDailyGuessInfo_16019 DEFAULT_INSTANCE = new S2C_PlayerUnionDailyGuessInfo_16019();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayerUnionDailyGuessInfo_16019> PARSER = new AbstractParser<S2C_PlayerUnionDailyGuessInfo_16019>() {
         public S2C_PlayerUnionDailyGuessInfo_16019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayerUnionDailyGuessInfo_16019(input, extensionRegistry);
         }
      };

      private S2C_PlayerUnionDailyGuessInfo_16019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayerUnionDailyGuessInfo_16019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayerUnionDailyGuessInfo_16019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayerUnionDailyGuessInfo_16019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerUnionDailyGuessInfo_16019.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PlayerUnionDailyGuessInfo_16019)) {
            return super.equals(obj);
         } else {
            S2C_PlayerUnionDailyGuessInfo_16019 other = (S2C_PlayerUnionDailyGuessInfo_16019)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerUnionDailyGuessInfo_16019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayerUnionDailyGuessInfo_16019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayerUnionDailyGuessInfo_16019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayerUnionDailyGuessInfo_16019> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayerUnionDailyGuessInfo_16019> getParserForType() {
         return PARSER;
      }

      public S2C_PlayerUnionDailyGuessInfo_16019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayerUnionDailyGuessInfo_16019OrBuilder {
         private int bitField0_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerUnionDailyGuessInfo_16019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_PlayerUnionDailyGuessInfo_16019_descriptor;
         }

         public S2C_PlayerUnionDailyGuessInfo_16019 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.getDefaultInstance();
         }

         public S2C_PlayerUnionDailyGuessInfo_16019 build() {
            S2C_PlayerUnionDailyGuessInfo_16019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayerUnionDailyGuessInfo_16019 buildPartial() {
            S2C_PlayerUnionDailyGuessInfo_16019 result = new S2C_PlayerUnionDailyGuessInfo_16019(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_PlayerUnionDailyGuessInfo_16019) {
               return this.mergeFrom((S2C_PlayerUnionDailyGuessInfo_16019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayerUnionDailyGuessInfo_16019 other) {
            if (other == UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PlayerUnionDailyGuessInfo_16019 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayerUnionDailyGuessInfo_16019)UnionDailyGuessMsg.S2C_PlayerUnionDailyGuessInfo_16019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayerUnionDailyGuessInfo_16019)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
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

   public static final class C2S_BattleRecord_16020 extends GeneratedMessageV3 implements C2S_BattleRecord_16020OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BattleRecord_16020 DEFAULT_INSTANCE = new C2S_BattleRecord_16020();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleRecord_16020> PARSER = new AbstractParser<C2S_BattleRecord_16020>() {
         public C2S_BattleRecord_16020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleRecord_16020(input, extensionRegistry);
         }
      };

      private C2S_BattleRecord_16020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleRecord_16020() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleRecord_16020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleRecord_16020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_16020.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BattleRecord_16020)) {
            return super.equals(obj);
         } else {
            C2S_BattleRecord_16020 other = (C2S_BattleRecord_16020)obj;
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

      public static C2S_BattleRecord_16020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_16020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_16020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_16020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_16020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data);
      }

      public static C2S_BattleRecord_16020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleRecord_16020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleRecord_16020 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_16020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_16020 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_16020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleRecord_16020 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleRecord_16020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleRecord_16020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleRecord_16020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleRecord_16020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleRecord_16020> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleRecord_16020> getParserForType() {
         return PARSER;
      }

      public C2S_BattleRecord_16020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleRecord_16020OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleRecord_16020.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_BattleRecord_16020.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_BattleRecord_16020_descriptor;
         }

         public C2S_BattleRecord_16020 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_BattleRecord_16020.getDefaultInstance();
         }

         public C2S_BattleRecord_16020 build() {
            C2S_BattleRecord_16020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleRecord_16020 buildPartial() {
            C2S_BattleRecord_16020 result = new C2S_BattleRecord_16020(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BattleRecord_16020) {
               return this.mergeFrom((C2S_BattleRecord_16020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleRecord_16020 other) {
            if (other == UnionDailyGuessMsg.C2S_BattleRecord_16020.getDefaultInstance()) {
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
            C2S_BattleRecord_16020 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleRecord_16020)UnionDailyGuessMsg.C2S_BattleRecord_16020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleRecord_16020)e.getUnfinishedMessage();
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

   public static final class S2C_BattleRecord_16021 extends GeneratedMessageV3 implements S2C_BattleRecord_16021OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLERECORDINFO_FIELD_NUMBER = 1;
      private List<BattleRecordInfo> battleRecordInfo_;
      public static final int UNIONLEVEL_FIELD_NUMBER = 2;
      private int unionLevel_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleRecord_16021 DEFAULT_INSTANCE = new S2C_BattleRecord_16021();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleRecord_16021> PARSER = new AbstractParser<S2C_BattleRecord_16021>() {
         public S2C_BattleRecord_16021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleRecord_16021(input, extensionRegistry);
         }
      };

      private S2C_BattleRecord_16021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleRecord_16021() {
         this.memoizedIsInitialized = -1;
         this.battleRecordInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleRecord_16021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleRecord_16021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.battleRecordInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.battleRecordInfo_.add(input.readMessage(UnionDailyGuessMsg.BattleRecordInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.unionLevel_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.battleRecordInfo_ = Collections.unmodifiableList(this.battleRecordInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_16021.class, Builder.class);
      }

      public List<BattleRecordInfo> getBattleRecordInfoList() {
         return this.battleRecordInfo_;
      }

      public List<? extends BattleRecordInfoOrBuilder> getBattleRecordInfoOrBuilderList() {
         return this.battleRecordInfo_;
      }

      public int getBattleRecordInfoCount() {
         return this.battleRecordInfo_.size();
      }

      public BattleRecordInfo getBattleRecordInfo(int index) {
         return (BattleRecordInfo)this.battleRecordInfo_.get(index);
      }

      public BattleRecordInfoOrBuilder getBattleRecordInfoOrBuilder(int index) {
         return (BattleRecordInfoOrBuilder)this.battleRecordInfo_.get(index);
      }

      public boolean hasUnionLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionLevel() {
         return this.unionLevel_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBattleRecordInfoCount(); ++i) {
               if (!this.getBattleRecordInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.battleRecordInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.battleRecordInfo_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.unionLevel_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.battleRecordInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.battleRecordInfo_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.unionLevel_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleRecord_16021)) {
            return super.equals(obj);
         } else {
            S2C_BattleRecord_16021 other = (S2C_BattleRecord_16021)obj;
            if (!this.getBattleRecordInfoList().equals(other.getBattleRecordInfoList())) {
               return false;
            } else if (this.hasUnionLevel() != other.hasUnionLevel()) {
               return false;
            } else if (this.hasUnionLevel() && this.getUnionLevel() != other.getUnionLevel()) {
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
            if (this.getBattleRecordInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleRecordInfoList().hashCode();
            }

            if (this.hasUnionLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleRecord_16021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_16021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_16021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_16021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_16021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data);
      }

      public static S2C_BattleRecord_16021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleRecord_16021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleRecord_16021 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_16021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_16021 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_16021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleRecord_16021 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleRecord_16021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleRecord_16021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleRecord_16021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleRecord_16021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleRecord_16021> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleRecord_16021> getParserForType() {
         return PARSER;
      }

      public S2C_BattleRecord_16021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleRecord_16021OrBuilder {
         private int bitField0_;
         private List<BattleRecordInfo> battleRecordInfo_;
         private RepeatedFieldBuilderV3<BattleRecordInfo, BattleRecordInfo.Builder, BattleRecordInfoOrBuilder> battleRecordInfoBuilder_;
         private int unionLevel_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleRecord_16021.class, Builder.class);
         }

         private Builder() {
            this.battleRecordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.battleRecordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_BattleRecord_16021.alwaysUseFieldBuilders) {
               this.getBattleRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleRecordInfoBuilder_ == null) {
               this.battleRecordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.battleRecordInfoBuilder_.clear();
            }

            this.unionLevel_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_BattleRecord_16021_descriptor;
         }

         public S2C_BattleRecord_16021 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_BattleRecord_16021.getDefaultInstance();
         }

         public S2C_BattleRecord_16021 build() {
            S2C_BattleRecord_16021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleRecord_16021 buildPartial() {
            S2C_BattleRecord_16021 result = new S2C_BattleRecord_16021(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.battleRecordInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.battleRecordInfo_ = Collections.unmodifiableList(this.battleRecordInfo_);
                  this.bitField0_ &= -2;
               }

               result.battleRecordInfo_ = this.battleRecordInfo_;
            } else {
               result.battleRecordInfo_ = this.battleRecordInfoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unionLevel_ = this.unionLevel_;
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
            if (other instanceof S2C_BattleRecord_16021) {
               return this.mergeFrom((S2C_BattleRecord_16021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleRecord_16021 other) {
            if (other == UnionDailyGuessMsg.S2C_BattleRecord_16021.getDefaultInstance()) {
               return this;
            } else {
               if (this.battleRecordInfoBuilder_ == null) {
                  if (!other.battleRecordInfo_.isEmpty()) {
                     if (this.battleRecordInfo_.isEmpty()) {
                        this.battleRecordInfo_ = other.battleRecordInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBattleRecordInfoIsMutable();
                        this.battleRecordInfo_.addAll(other.battleRecordInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.battleRecordInfo_.isEmpty()) {
                  if (this.battleRecordInfoBuilder_.isEmpty()) {
                     this.battleRecordInfoBuilder_.dispose();
                     this.battleRecordInfoBuilder_ = null;
                     this.battleRecordInfo_ = other.battleRecordInfo_;
                     this.bitField0_ &= -2;
                     this.battleRecordInfoBuilder_ = UnionDailyGuessMsg.S2C_BattleRecord_16021.alwaysUseFieldBuilders ? this.getBattleRecordInfoFieldBuilder() : null;
                  } else {
                     this.battleRecordInfoBuilder_.addAllMessages(other.battleRecordInfo_);
                  }
               }

               if (other.hasUnionLevel()) {
                  this.setUnionLevel(other.getUnionLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getBattleRecordInfoCount(); ++i) {
                  if (!this.getBattleRecordInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleRecord_16021 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleRecord_16021)UnionDailyGuessMsg.S2C_BattleRecord_16021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleRecord_16021)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBattleRecordInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.battleRecordInfo_ = new ArrayList(this.battleRecordInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<BattleRecordInfo> getBattleRecordInfoList() {
            return this.battleRecordInfoBuilder_ == null ? Collections.unmodifiableList(this.battleRecordInfo_) : this.battleRecordInfoBuilder_.getMessageList();
         }

         public int getBattleRecordInfoCount() {
            return this.battleRecordInfoBuilder_ == null ? this.battleRecordInfo_.size() : this.battleRecordInfoBuilder_.getCount();
         }

         public BattleRecordInfo getBattleRecordInfo(int index) {
            return this.battleRecordInfoBuilder_ == null ? (BattleRecordInfo)this.battleRecordInfo_.get(index) : (BattleRecordInfo)this.battleRecordInfoBuilder_.getMessage(index);
         }

         public Builder setBattleRecordInfo(int index, BattleRecordInfo value) {
            if (this.battleRecordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.set(index, value);
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBattleRecordInfo(int index, BattleRecordInfo.Builder builderForValue) {
            if (this.battleRecordInfoBuilder_ == null) {
               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBattleRecordInfo(BattleRecordInfo value) {
            if (this.battleRecordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.add(value);
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBattleRecordInfo(int index, BattleRecordInfo value) {
            if (this.battleRecordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.add(index, value);
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBattleRecordInfo(BattleRecordInfo.Builder builderForValue) {
            if (this.battleRecordInfoBuilder_ == null) {
               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBattleRecordInfo(int index, BattleRecordInfo.Builder builderForValue) {
            if (this.battleRecordInfoBuilder_ == null) {
               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBattleRecordInfo(Iterable<? extends BattleRecordInfo> values) {
            if (this.battleRecordInfoBuilder_ == null) {
               this.ensureBattleRecordInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.battleRecordInfo_);
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBattleRecordInfo() {
            if (this.battleRecordInfoBuilder_ == null) {
               this.battleRecordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeBattleRecordInfo(int index) {
            if (this.battleRecordInfoBuilder_ == null) {
               this.ensureBattleRecordInfoIsMutable();
               this.battleRecordInfo_.remove(index);
               this.onChanged();
            } else {
               this.battleRecordInfoBuilder_.remove(index);
            }

            return this;
         }

         public BattleRecordInfo.Builder getBattleRecordInfoBuilder(int index) {
            return (BattleRecordInfo.Builder)this.getBattleRecordInfoFieldBuilder().getBuilder(index);
         }

         public BattleRecordInfoOrBuilder getBattleRecordInfoOrBuilder(int index) {
            return this.battleRecordInfoBuilder_ == null ? (BattleRecordInfoOrBuilder)this.battleRecordInfo_.get(index) : (BattleRecordInfoOrBuilder)this.battleRecordInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BattleRecordInfoOrBuilder> getBattleRecordInfoOrBuilderList() {
            return this.battleRecordInfoBuilder_ != null ? this.battleRecordInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.battleRecordInfo_);
         }

         public BattleRecordInfo.Builder addBattleRecordInfoBuilder() {
            return (BattleRecordInfo.Builder)this.getBattleRecordInfoFieldBuilder().addBuilder(UnionDailyGuessMsg.BattleRecordInfo.getDefaultInstance());
         }

         public BattleRecordInfo.Builder addBattleRecordInfoBuilder(int index) {
            return (BattleRecordInfo.Builder)this.getBattleRecordInfoFieldBuilder().addBuilder(index, UnionDailyGuessMsg.BattleRecordInfo.getDefaultInstance());
         }

         public List<BattleRecordInfo.Builder> getBattleRecordInfoBuilderList() {
            return this.getBattleRecordInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BattleRecordInfo, BattleRecordInfo.Builder, BattleRecordInfoOrBuilder> getBattleRecordInfoFieldBuilder() {
            if (this.battleRecordInfoBuilder_ == null) {
               this.battleRecordInfoBuilder_ = new RepeatedFieldBuilderV3(this.battleRecordInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.battleRecordInfo_ = null;
            }

            return this.battleRecordInfoBuilder_;
         }

         public boolean hasUnionLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnionLevel() {
            return this.unionLevel_;
         }

         public Builder setUnionLevel(int value) {
            this.bitField0_ |= 2;
            this.unionLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionLevel() {
            this.bitField0_ &= -3;
            this.unionLevel_ = 0;
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

   public static final class BattleRecordInfo extends GeneratedMessageV3 implements BattleRecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int PLAYERINFO_FIELD_NUMBER = 2;
      private CommonMsg.PlayerInfo playerInfo_;
      public static final int PASSTIME_FIELD_NUMBER = 3;
      private long passTime_;
      public static final int TYPE_FIELD_NUMBER = 4;
      private int type_;
      private byte memoizedIsInitialized;
      private static final BattleRecordInfo DEFAULT_INSTANCE = new BattleRecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<BattleRecordInfo> PARSER = new AbstractParser<BattleRecordInfo>() {
         public BattleRecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BattleRecordInfo(input, extensionRegistry);
         }
      };

      private BattleRecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BattleRecordInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BattleRecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BattleRecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.chapterId_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.playerInfo_.toBuilder();
                        }

                        this.playerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.playerInfo_);
                           this.playerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.passTime_ = input.readInt64();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BattleRecordInfo.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerInfo getPlayerInfo() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public boolean hasPassTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getPassTime() {
         return this.passTime_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasChapterId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.chapterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPlayerInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.passTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapterId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPlayerInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.passTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BattleRecordInfo)) {
            return super.equals(obj);
         } else {
            BattleRecordInfo other = (BattleRecordInfo)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasPlayerInfo() != other.hasPlayerInfo()) {
               return false;
            } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(other.getPlayerInfo())) {
               return false;
            } else if (this.hasPassTime() != other.hasPassTime()) {
               return false;
            } else if (this.hasPassTime() && this.getPassTime() != other.getPassTime()) {
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
            if (this.hasChapterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterId();
            }

            if (this.hasPlayerInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerInfo().hashCode();
            }

            if (this.hasPassTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getPassTime());
            }

            if (this.hasType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BattleRecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data);
      }

      public static BattleRecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BattleRecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(InputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BattleRecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BattleRecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BattleRecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BattleRecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BattleRecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BattleRecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BattleRecordInfo> parser() {
         return PARSER;
      }

      public Parser<BattleRecordInfo> getParserForType() {
         return PARSER;
      }

      public BattleRecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattleRecordInfoOrBuilder {
         private int bitField0_;
         private int chapterId_;
         private CommonMsg.PlayerInfo playerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> playerInfoBuilder_;
         private long passTime_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BattleRecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.BattleRecordInfo.alwaysUseFieldBuilders) {
               this.getPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.passTime_ = 0L;
            this.bitField0_ &= -5;
            this.type_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_BattleRecordInfo_descriptor;
         }

         public BattleRecordInfo getDefaultInstanceForType() {
            return UnionDailyGuessMsg.BattleRecordInfo.getDefaultInstance();
         }

         public BattleRecordInfo build() {
            BattleRecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BattleRecordInfo buildPartial() {
            BattleRecordInfo result = new BattleRecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.playerInfoBuilder_ == null) {
                  result.playerInfo_ = this.playerInfo_;
               } else {
                  result.playerInfo_ = (CommonMsg.PlayerInfo)this.playerInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.passTime_ = this.passTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof BattleRecordInfo) {
               return this.mergeFrom((BattleRecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BattleRecordInfo other) {
            if (other == UnionDailyGuessMsg.BattleRecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (other.hasPlayerInfo()) {
                  this.mergePlayerInfo(other.getPlayerInfo());
               }

               if (other.hasPassTime()) {
                  this.setPassTime(other.getPassTime());
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
            if (!this.hasChapterId()) {
               return false;
            } else if (!this.hasPlayerInfo()) {
               return false;
            } else if (!this.hasPassTime()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               return this.getPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BattleRecordInfo parsedMessage = null;

            try {
               parsedMessage = (BattleRecordInfo)UnionDailyGuessMsg.BattleRecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BattleRecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapterId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapterId() {
            return this.chapterId_;
         }

         public Builder setChapterId(int value) {
            this.bitField0_ |= 1;
            this.chapterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapterId() {
            this.bitField0_ &= -2;
            this.chapterId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerInfo getPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.playerInfoBuilder_.getMessage();
            }
         }

         public Builder setPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.playerInfo_ = value;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.playerInfo_ != null && this.playerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.playerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.playerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.playerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.playerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getPlayerInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            if (this.playerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.playerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfoBuilder_ = new SingleFieldBuilderV3(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.playerInfo_ = null;
            }

            return this.playerInfoBuilder_;
         }

         public boolean hasPassTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getPassTime() {
            return this.passTime_;
         }

         public Builder setPassTime(long value) {
            this.bitField0_ |= 4;
            this.passTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassTime() {
            this.bitField0_ &= -5;
            this.passTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 8;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -9;
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

   public static final class S2C_ShowResult_16022 extends GeneratedMessageV3 implements S2C_ShowResult_16022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONLV_FIELD_NUMBER = 1;
      private int unionLv_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int SHARE_FIELD_NUMBER = 3;
      private int share_;
      public static final int PASSORDERS_FIELD_NUMBER = 4;
      private Internal.IntList passOrders_;
      public static final int CHAPTERID_FIELD_NUMBER = 5;
      private int chapterId_;
      public static final int REWARD_FIELD_NUMBER = 6;
      private List<CommonMsg.ItemInfo> reward_;
      private byte memoizedIsInitialized;
      private static final S2C_ShowResult_16022 DEFAULT_INSTANCE = new S2C_ShowResult_16022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShowResult_16022> PARSER = new AbstractParser<S2C_ShowResult_16022>() {
         public S2C_ShowResult_16022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShowResult_16022(input, extensionRegistry);
         }
      };

      private S2C_ShowResult_16022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShowResult_16022() {
         this.memoizedIsInitialized = -1;
         this.passOrders_ = emptyIntList();
         this.reward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShowResult_16022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShowResult_16022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionLv_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.share_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.passOrders_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.passOrders_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passOrders_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.chapterId_ = input.readInt32();
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.passOrders_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.passOrders_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowResult_16022.class, Builder.class);
      }

      public boolean hasUnionLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionLv() {
         return this.unionLv_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasShare() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShare() {
         return this.share_;
      }

      public List<Integer> getPassOrdersList() {
         return this.passOrders_;
      }

      public int getPassOrdersCount() {
         return this.passOrders_.size();
      }

      public int getPassOrders(int index) {
         return this.passOrders_.getInt(index);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnionLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
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
            output.writeInt32(1, this.unionLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.share_);
         }

         for(int i = 0; i < this.passOrders_.size(); ++i) {
            output.writeInt32(4, this.passOrders_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.chapterId_);
         }

         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.reward_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.unionLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.share_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.passOrders_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passOrders_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassOrdersList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.chapterId_);
            }

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.reward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShowResult_16022)) {
            return super.equals(obj);
         } else {
            S2C_ShowResult_16022 other = (S2C_ShowResult_16022)obj;
            if (this.hasUnionLv() != other.hasUnionLv()) {
               return false;
            } else if (this.hasUnionLv() && this.getUnionLv() != other.getUnionLv()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasShare() != other.hasShare()) {
               return false;
            } else if (this.hasShare() && this.getShare() != other.getShare()) {
               return false;
            } else if (!this.getPassOrdersList().equals(other.getPassOrdersList())) {
               return false;
            } else if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (!this.getRewardList().equals(other.getRewardList())) {
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
            if (this.hasUnionLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionLv();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasShare()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShare();
            }

            if (this.getPassOrdersCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPassOrdersList().hashCode();
            }

            if (this.hasChapterId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getChapterId();
            }

            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShowResult_16022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data);
      }

      public static S2C_ShowResult_16022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowResult_16022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data);
      }

      public static S2C_ShowResult_16022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowResult_16022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data);
      }

      public static S2C_ShowResult_16022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowResult_16022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowResult_16022 parseFrom(InputStream input) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowResult_16022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowResult_16022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShowResult_16022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowResult_16022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowResult_16022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowResult_16022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShowResult_16022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShowResult_16022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShowResult_16022> parser() {
         return PARSER;
      }

      public Parser<S2C_ShowResult_16022> getParserForType() {
         return PARSER;
      }

      public S2C_ShowResult_16022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShowResult_16022OrBuilder {
         private int bitField0_;
         private int unionLv_;
         private int type_;
         private int share_;
         private Internal.IntList passOrders_;
         private int chapterId_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowResult_16022.class, Builder.class);
         }

         private Builder() {
            this.passOrders_ = UnionDailyGuessMsg.S2C_ShowResult_16022.emptyIntList();
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passOrders_ = UnionDailyGuessMsg.S2C_ShowResult_16022.emptyIntList();
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_ShowResult_16022.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unionLv_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.share_ = 0;
            this.bitField0_ &= -5;
            this.passOrders_ = UnionDailyGuessMsg.S2C_ShowResult_16022.emptyIntList();
            this.bitField0_ &= -9;
            this.chapterId_ = 0;
            this.bitField0_ &= -17;
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_ShowResult_16022_descriptor;
         }

         public S2C_ShowResult_16022 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_ShowResult_16022.getDefaultInstance();
         }

         public S2C_ShowResult_16022 build() {
            S2C_ShowResult_16022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShowResult_16022 buildPartial() {
            S2C_ShowResult_16022 result = new S2C_ShowResult_16022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionLv_ = this.unionLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.share_ = this.share_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.passOrders_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.passOrders_ = this.passOrders_;
            if ((from_bitField0_ & 16) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 8;
            }

            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -33;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
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
            if (other instanceof S2C_ShowResult_16022) {
               return this.mergeFrom((S2C_ShowResult_16022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShowResult_16022 other) {
            if (other == UnionDailyGuessMsg.S2C_ShowResult_16022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionLv()) {
                  this.setUnionLv(other.getUnionLv());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasShare()) {
                  this.setShare(other.getShare());
               }

               if (!other.passOrders_.isEmpty()) {
                  if (this.passOrders_.isEmpty()) {
                     this.passOrders_ = other.passOrders_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensurePassOrdersIsMutable();
                     this.passOrders_.addAll(other.passOrders_);
                  }

                  this.onChanged();
               }

               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -33;
                     this.rewardBuilder_ = UnionDailyGuessMsg.S2C_ShowResult_16022.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnionLv()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardCount(); ++i) {
                  if (!this.getReward(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShowResult_16022 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShowResult_16022)UnionDailyGuessMsg.S2C_ShowResult_16022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShowResult_16022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnionLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnionLv() {
            return this.unionLv_;
         }

         public Builder setUnionLv(int value) {
            this.bitField0_ |= 1;
            this.unionLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionLv() {
            this.bitField0_ &= -2;
            this.unionLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShare() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShare() {
            return this.share_;
         }

         public Builder setShare(int value) {
            this.bitField0_ |= 4;
            this.share_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShare() {
            this.bitField0_ &= -5;
            this.share_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePassOrdersIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.passOrders_ = UnionDailyGuessMsg.S2C_ShowResult_16022.mutableCopy(this.passOrders_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getPassOrdersList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.passOrders_) : this.passOrders_);
         }

         public int getPassOrdersCount() {
            return this.passOrders_.size();
         }

         public int getPassOrders(int index) {
            return this.passOrders_.getInt(index);
         }

         public Builder setPassOrders(int index, int value) {
            this.ensurePassOrdersIsMutable();
            this.passOrders_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassOrders(int value) {
            this.ensurePassOrdersIsMutable();
            this.passOrders_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassOrders(Iterable<? extends Integer> values) {
            this.ensurePassOrdersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passOrders_);
            this.onChanged();
            return this;
         }

         public Builder clearPassOrders() {
            this.passOrders_ = UnionDailyGuessMsg.S2C_ShowResult_16022.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasChapterId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getChapterId() {
            return this.chapterId_;
         }

         public Builder setChapterId(int value) {
            this.bitField0_ |= 16;
            this.chapterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapterId() {
            this.bitField0_ &= -17;
            this.chapterId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_QuickPass_16023 extends GeneratedMessageV3 implements C2S_QuickPass_16023OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_QuickPass_16023 DEFAULT_INSTANCE = new C2S_QuickPass_16023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_QuickPass_16023> PARSER = new AbstractParser<C2S_QuickPass_16023>() {
         public C2S_QuickPass_16023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_QuickPass_16023(input, extensionRegistry);
         }
      };

      private C2S_QuickPass_16023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_QuickPass_16023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_QuickPass_16023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_QuickPass_16023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QuickPass_16023.class, Builder.class);
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
         } else if (!(obj instanceof C2S_QuickPass_16023)) {
            return super.equals(obj);
         } else {
            C2S_QuickPass_16023 other = (C2S_QuickPass_16023)obj;
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

      public static C2S_QuickPass_16023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data);
      }

      public static C2S_QuickPass_16023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickPass_16023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data);
      }

      public static C2S_QuickPass_16023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickPass_16023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data);
      }

      public static C2S_QuickPass_16023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QuickPass_16023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QuickPass_16023 parseFrom(InputStream input) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QuickPass_16023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QuickPass_16023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_QuickPass_16023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QuickPass_16023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QuickPass_16023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QuickPass_16023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_QuickPass_16023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_QuickPass_16023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_QuickPass_16023> parser() {
         return PARSER;
      }

      public Parser<C2S_QuickPass_16023> getParserForType() {
         return PARSER;
      }

      public C2S_QuickPass_16023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_QuickPass_16023OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QuickPass_16023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.C2S_QuickPass_16023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_C2S_QuickPass_16023_descriptor;
         }

         public C2S_QuickPass_16023 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.C2S_QuickPass_16023.getDefaultInstance();
         }

         public C2S_QuickPass_16023 build() {
            C2S_QuickPass_16023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_QuickPass_16023 buildPartial() {
            C2S_QuickPass_16023 result = new C2S_QuickPass_16023(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_QuickPass_16023) {
               return this.mergeFrom((C2S_QuickPass_16023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_QuickPass_16023 other) {
            if (other == UnionDailyGuessMsg.C2S_QuickPass_16023.getDefaultInstance()) {
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
            C2S_QuickPass_16023 parsedMessage = null;

            try {
               parsedMessage = (C2S_QuickPass_16023)UnionDailyGuessMsg.C2S_QuickPass_16023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_QuickPass_16023)e.getUnfinishedMessage();
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

   public static final class S2C_UpdatePassNum_16026 extends GeneratedMessageV3 implements S2C_UpdatePassNum_16026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PASSNUM_FIELD_NUMBER = 1;
      private int passNum_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdatePassNum_16026 DEFAULT_INSTANCE = new S2C_UpdatePassNum_16026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdatePassNum_16026> PARSER = new AbstractParser<S2C_UpdatePassNum_16026>() {
         public S2C_UpdatePassNum_16026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdatePassNum_16026(input, extensionRegistry);
         }
      };

      private S2C_UpdatePassNum_16026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdatePassNum_16026() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdatePassNum_16026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdatePassNum_16026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.passNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdatePassNum_16026.class, Builder.class);
      }

      public boolean hasPassNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPassNum() {
         return this.passNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPassNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.passNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.passNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdatePassNum_16026)) {
            return super.equals(obj);
         } else {
            S2C_UpdatePassNum_16026 other = (S2C_UpdatePassNum_16026)obj;
            if (this.hasPassNum() != other.hasPassNum()) {
               return false;
            } else if (this.hasPassNum() && this.getPassNum() != other.getPassNum()) {
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
            if (this.hasPassNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPassNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdatePassNum_16026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdatePassNum_16026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdatePassNum_16026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_16026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdatePassNum_16026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdatePassNum_16026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdatePassNum_16026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdatePassNum_16026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdatePassNum_16026> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdatePassNum_16026> getParserForType() {
         return PARSER;
      }

      public S2C_UpdatePassNum_16026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdatePassNum_16026OrBuilder {
         private int bitField0_;
         private int passNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdatePassNum_16026.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionDailyGuessMsg.S2C_UpdatePassNum_16026.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.passNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionDailyGuessMsg.internal_static_unionDailyGuess_com_gzbz_protobuf_S2C_UpdatePassNum_16026_descriptor;
         }

         public S2C_UpdatePassNum_16026 getDefaultInstanceForType() {
            return UnionDailyGuessMsg.S2C_UpdatePassNum_16026.getDefaultInstance();
         }

         public S2C_UpdatePassNum_16026 build() {
            S2C_UpdatePassNum_16026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdatePassNum_16026 buildPartial() {
            S2C_UpdatePassNum_16026 result = new S2C_UpdatePassNum_16026(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.passNum_ = this.passNum_;
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
            if (other instanceof S2C_UpdatePassNum_16026) {
               return this.mergeFrom((S2C_UpdatePassNum_16026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdatePassNum_16026 other) {
            if (other == UnionDailyGuessMsg.S2C_UpdatePassNum_16026.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPassNum()) {
                  this.setPassNum(other.getPassNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPassNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdatePassNum_16026 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdatePassNum_16026)UnionDailyGuessMsg.S2C_UpdatePassNum_16026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdatePassNum_16026)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPassNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPassNum() {
            return this.passNum_;
         }

         public Builder setPassNum(int value) {
            this.bitField0_ |= 1;
            this.passNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassNum() {
            this.bitField0_ &= -2;
            this.passNum_ = 0;
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

   public interface BattleRecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasPlayerInfo();

      CommonMsg.PlayerInfo getPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder();

      boolean hasPassTime();

      long getPassTime();

      boolean hasType();

      int getType();
   }

   public interface C2S_BattleRecord_16020OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_EnemyData_16014OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_EnterChapter_16002OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Move_16009OrBuilder extends MessageOrBuilder {
      boolean hasOriGrid();

      int getOriGrid();

      boolean hasDestGrid();

      int getDestGrid();

      List<Integer> getPassGridList();

      int getPassGridCount();

      int getPassGrid(int index);
   }

   public interface C2S_OtherEvent_16016OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_PlayerUnionDailyGuessInfo_16018OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_QuickPass_16023OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SelectRandomBox_16012OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface C2S_SkipBattle_16007OrBuilder extends MessageOrBuilder {
      boolean hasGridId();

      int getGridId();
   }

   public interface S2C_BattleRecord_16021OrBuilder extends MessageOrBuilder {
      List<BattleRecordInfo> getBattleRecordInfoList();

      BattleRecordInfo getBattleRecordInfo(int index);

      int getBattleRecordInfoCount();

      List<? extends BattleRecordInfoOrBuilder> getBattleRecordInfoOrBuilderList();

      BattleRecordInfoOrBuilder getBattleRecordInfoOrBuilder(int index);

      boolean hasUnionLevel();

      int getUnionLevel();
   }

   public interface S2C_EnemyData_16015OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasCanPassBattle();

      boolean getCanPassBattle();
   }

   public interface S2C_EnterChapter_16003OrBuilder extends MessageOrBuilder {
      boolean hasCurrentChapter();

      int getCurrentChapter();

      boolean hasCurGrid();

      int getCurGrid();

      List<S2C_GridInfo_16004> getGridInfoList();

      S2C_GridInfo_16004 getGridInfo(int index);

      int getGridInfoCount();

      List<? extends S2C_GridInfo_16004OrBuilder> getGridInfoOrBuilderList();

      S2C_GridInfo_16004OrBuilder getGridInfoOrBuilder(int index);

      boolean hasHeroId();

      int getHeroId();

      boolean hasMapGroup();

      int getMapGroup();

      boolean hasType();

      int getType();

      boolean hasUnionLevel();

      int getUnionLevel();
   }

   public interface S2C_GridInfo_16004OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasEventIdx();

      int getEventIdx();

      boolean hasState();

      int getState();
   }

   public interface S2C_Move_16010OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasDestGrid();

      int getDestGrid();
   }

   public interface S2C_OtherEvent_16017OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface S2C_PlayerUnionDailyGuessInfo_16019OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();
   }

   public interface S2C_SelectRandomBox_16013OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_ShowResult_16022OrBuilder extends MessageOrBuilder {
      boolean hasUnionLv();

      int getUnionLv();

      boolean hasType();

      int getType();

      boolean hasShare();

      int getShare();

      List<Integer> getPassOrdersList();

      int getPassOrdersCount();

      int getPassOrders(int index);

      boolean hasChapterId();

      int getChapterId();

      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);
   }

   public interface S2C_SkipBattle_16008OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_UnlockSeeGrids_16005OrBuilder extends MessageOrBuilder {
      List<Integer> getGridList();

      int getGridCount();

      int getGrid(int index);
   }

   public interface S2C_UpdateGridInfo_16006OrBuilder extends MessageOrBuilder {
      List<S2C_GridInfo_16004> getInfoList();

      S2C_GridInfo_16004 getInfo(int index);

      int getInfoCount();

      List<? extends S2C_GridInfo_16004OrBuilder> getInfoOrBuilderList();

      S2C_GridInfo_16004OrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_UpdatePassNum_16026OrBuilder extends MessageOrBuilder {
      boolean hasPassNum();

      int getPassNum();
   }
}
