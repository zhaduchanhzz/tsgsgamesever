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

public final class ArtifactActivityMsg {
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArtifactActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016ArtifactActivity.proto\u0012\"artifactActivity.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"P\n\fGridTaskData\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u00122\n\u0004task\u0018\u0002 \u0001(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0018\n\u0016C2S_ArtifactInfo_13301\"_\n\u0016S2C_ArtifactInfo_13302\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nweaponBoxs\u0018\u0003 \u0003(\u0005\u0012\r\n\u0005token\u0018\u0004 \u0002(\u0005\"(\n\u0017C2S_OpenWeaponBox_13303\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"(\n\u0017S2C_OpenWeaponBox_13304\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"\u0014\n\u0012C2S_LootInfo_13305\"²\u0001\n\u0012S2C_LootInfo_13306\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nresetTimes\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bhadGetEnjoy\u0018\u0004 \u0002(\b\u0012&\n\u000bchooseTimes\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\ncurLootNum\u0018\u0006 \u0002(\u0005\u0012\u0014\n\fdailyDrawNum\u0018\u0007 \u0002(\u0005\"#\n\u0014C2S_LootReward_13307\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"M\n\u0014S2C_LootReward_13308\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007isEnjoy\u0018\u0002 \u0002(\b\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\"\u0015\n\u0013C2S_LootReset_13309\"!\n\u0013C2S_LootEnjoy_13311\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_13312\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMain_13451\"ª\u0001\n\u0016S2C_TreasureMain_13452\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fappointCount\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007gotGrid\u0018\u0005 \u0003(\u0005\u0012\u0012\n\nneedBattle\u0018\u0006 \u0002(\b\u0012\u0017\n\u000fappointCountBuy\u0018\u0007 \u0002(\u0005\"7\n\u001aC2S_TreasureRollDice_13453\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"o\n\u001aS2C_TreasureRollDice_13454\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0005 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMove_13455\"(\n\u0016S2C_TreasureMove_13456\u0012\u000e\n\u0006battle\u0018\u0001 \u0001(\u0005\"\u0014\n\u0012C2S_LineMain_13457\"\u0097\u0001\n\u0012S2C_LineMain_13458\u0012B\n\bgridTask\u0018\u0001 \u0003(\u000b20.artifactActivity.com.gzbz.protobuf.GridTaskData\u0012\u0014\n\flineBoxCount\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ngotLineBox\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bgotFinalBox\u0018\u0004 \u0003(\u0005\"&\n\u0017C2S_LineBoxReward_13459\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"&\n\u0017S2C_LineBoxReward_13460\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"N\n\u0018S2C_LineTaskNotify_13462\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"(\n\u0018C2S_LineTaskReward_13463\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"(\n\u0018S2C_LineTaskReward_13464\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"'\n\u0018C2S_FinalBoxReward_13465\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"'\n\u0018S2C_FinalBoxReward_13466\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bC2S_TreasureAddRandom_13467\"M\n\u001bS2C_TreasureAddRandom_13468\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_TreasureAppointBuy_13469\"M\n\u001cS2C_TreasureAppointBuy_13470\u0012\u0014\n\fappointCount\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fappointCountBuy\u0018\u0002 \u0002(\u0005B*\n\u0011com.gzbz.protobufB\u0013ArtifactActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor, new String[]{"Grid", "Task"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor, new String[]{"StartTime", "EndTime", "WeaponBoxs", "Token"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor, new String[]{"BoxId"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor, new String[]{"BoxId"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor, new String[]{"EnjoyId", "ResetTimes", "RewardId", "HadGetEnjoy", "ChooseTimes", "CurLootNum", "DailyDrawNum"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor, new String[]{"Num"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor, new String[]{"RewardId", "IsEnjoy", "CurLootNum"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor, new String[]{"Id"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor, new String[]{"Id"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor, new String[]{"RandomCount", "RandomRecoverTime", "AppointCount", "Grid", "GotGrid", "NeedBattle", "AppointCountBuy"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor, new String[]{"Type", "Num"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor, new String[]{"Type", "Num", "Grid", "Count", "RandomRecoverTime"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor, new String[]{"Battle"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor, new String[]{"GridTask", "LineBoxCount", "GotLineBox", "GotFinalBox"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor, new String[]{"Box"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor, new String[]{"Box"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor, new String[]{"Task"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor, new String[]{"Task"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor, new String[]{"Task"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor, new String[]{"Box"});
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor, new String[]{"Box"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor, new String[]{"RandomCount", "RandomRecoverTime"});
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor, new String[0]);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor, new String[]{"AppointCount", "AppointCountBuy"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class GridTaskData extends GeneratedMessageV3 implements GridTaskDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int TASK_FIELD_NUMBER = 2;
      private ActivityMsg.TaskData task_;
      private byte memoizedIsInitialized;
      private static final GridTaskData DEFAULT_INSTANCE = new GridTaskData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GridTaskData> PARSER = new AbstractParser<GridTaskData>() {
         public GridTaskData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GridTaskData(input, extensionRegistry);
         }
      };

      private GridTaskData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GridTaskData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GridTaskData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GridTaskData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ActivityMsg.TaskData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.task_.toBuilder();
                        }

                        this.task_ = (ActivityMsg.TaskData)input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.task_);
                           this.task_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasTask() {
         return (this.bitField0_ & 2) != 0;
      }

      public ActivityMsg.TaskData getTask() {
         return this.task_ == null ? ActivityMsg.TaskData.getDefaultInstance() : this.task_;
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder() {
         return this.task_ == null ? ActivityMsg.TaskData.getDefaultInstance() : this.task_;
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
         } else if (this.hasTask() && !this.getTask().isInitialized()) {
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
            output.writeMessage(2, this.getTask());
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
               size += CodedOutputStream.computeMessageSize(2, this.getTask());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GridTaskData)) {
            return super.equals(obj);
         } else {
            GridTaskData other = (GridTaskData)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && !this.getTask().equals(other.getTask())) {
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

            if (this.hasTask()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTask().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GridTaskData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data);
      }

      public static GridTaskData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GridTaskData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data);
      }

      public static GridTaskData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GridTaskData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data);
      }

      public static GridTaskData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GridTaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GridTaskData parseFrom(InputStream input) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GridTaskData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GridTaskData parseDelimitedFrom(InputStream input) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GridTaskData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GridTaskData parseFrom(CodedInputStream input) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GridTaskData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GridTaskData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GridTaskData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GridTaskData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GridTaskData> parser() {
         return PARSER;
      }

      public Parser<GridTaskData> getParserForType() {
         return PARSER;
      }

      public GridTaskData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GridTaskDataOrBuilder {
         private int bitField0_;
         private int grid_;
         private ActivityMsg.TaskData task_;
         private SingleFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.GridTaskData.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            if (this.taskBuilder_ == null) {
               this.task_ = null;
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         public GridTaskData getDefaultInstanceForType() {
            return ArtifactActivityMsg.GridTaskData.getDefaultInstance();
         }

         public GridTaskData build() {
            GridTaskData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GridTaskData buildPartial() {
            GridTaskData result = new GridTaskData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.taskBuilder_ == null) {
                  result.task_ = this.task_;
               } else {
                  result.task_ = (ActivityMsg.TaskData)this.taskBuilder_.build();
               }

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
            if (other instanceof GridTaskData) {
               return this.mergeFrom((GridTaskData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GridTaskData other) {
            if (other == ArtifactActivityMsg.GridTaskData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasTask()) {
                  this.mergeTask(other.getTask());
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
               return !this.hasTask() || this.getTask().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GridTaskData parsedMessage = null;

            try {
               parsedMessage = (GridTaskData)ArtifactActivityMsg.GridTaskData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GridTaskData)e.getUnfinishedMessage();
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

         public boolean hasTask() {
            return (this.bitField0_ & 2) != 0;
         }

         public ActivityMsg.TaskData getTask() {
            if (this.taskBuilder_ == null) {
               return this.task_ == null ? ActivityMsg.TaskData.getDefaultInstance() : this.task_;
            } else {
               return (ActivityMsg.TaskData)this.taskBuilder_.getMessage();
            }
         }

         public Builder setTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.task_ = value;
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.task_ = builderForValue.build();
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.task_ != null && this.task_ != ActivityMsg.TaskData.getDefaultInstance()) {
                  this.task_ = ActivityMsg.TaskData.newBuilder(this.task_).mergeFrom(value).buildPartial();
               } else {
                  this.task_ = value;
               }

               this.onChanged();
            } else {
               this.taskBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = null;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder();
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder() {
            if (this.taskBuilder_ != null) {
               return (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder();
            } else {
               return this.task_ == null ? ActivityMsg.TaskData.getDefaultInstance() : this.task_;
            }
         }

         private SingleFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new SingleFieldBuilderV3(this.getTask(), this.getParentForChildren(), this.isClean());
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

   public static final class C2S_ArtifactInfo_13301 extends GeneratedMessageV3 implements C2S_ArtifactInfo_13301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ArtifactInfo_13301 DEFAULT_INSTANCE = new C2S_ArtifactInfo_13301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ArtifactInfo_13301> PARSER = new AbstractParser<C2S_ArtifactInfo_13301>() {
         public C2S_ArtifactInfo_13301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ArtifactInfo_13301(input, extensionRegistry);
         }
      };

      private C2S_ArtifactInfo_13301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ArtifactInfo_13301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ArtifactInfo_13301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ArtifactInfo_13301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_13301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ArtifactInfo_13301)) {
            return super.equals(obj);
         } else {
            C2S_ArtifactInfo_13301 other = (C2S_ArtifactInfo_13301)obj;
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

      public static C2S_ArtifactInfo_13301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_13301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_13301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_13301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_13301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_13301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ArtifactInfo_13301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ArtifactInfo_13301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ArtifactInfo_13301> parser() {
         return PARSER;
      }

      public Parser<C2S_ArtifactInfo_13301> getParserForType() {
         return PARSER;
      }

      public C2S_ArtifactInfo_13301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ArtifactInfo_13301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_13301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_ArtifactInfo_13301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_ArtifactInfo_13301_descriptor;
         }

         public C2S_ArtifactInfo_13301 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_ArtifactInfo_13301.getDefaultInstance();
         }

         public C2S_ArtifactInfo_13301 build() {
            C2S_ArtifactInfo_13301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ArtifactInfo_13301 buildPartial() {
            C2S_ArtifactInfo_13301 result = new C2S_ArtifactInfo_13301(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ArtifactInfo_13301) {
               return this.mergeFrom((C2S_ArtifactInfo_13301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ArtifactInfo_13301 other) {
            if (other == ArtifactActivityMsg.C2S_ArtifactInfo_13301.getDefaultInstance()) {
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
            C2S_ArtifactInfo_13301 parsedMessage = null;

            try {
               parsedMessage = (C2S_ArtifactInfo_13301)ArtifactActivityMsg.C2S_ArtifactInfo_13301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ArtifactInfo_13301)e.getUnfinishedMessage();
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

   public static final class S2C_ArtifactInfo_13302 extends GeneratedMessageV3 implements S2C_ArtifactInfo_13302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int WEAPONBOXS_FIELD_NUMBER = 3;
      private Internal.IntList weaponBoxs_;
      public static final int TOKEN_FIELD_NUMBER = 4;
      private int token_;
      private byte memoizedIsInitialized;
      private static final S2C_ArtifactInfo_13302 DEFAULT_INSTANCE = new S2C_ArtifactInfo_13302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ArtifactInfo_13302> PARSER = new AbstractParser<S2C_ArtifactInfo_13302>() {
         public S2C_ArtifactInfo_13302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ArtifactInfo_13302(input, extensionRegistry);
         }
      };

      private S2C_ArtifactInfo_13302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ArtifactInfo_13302() {
         this.memoizedIsInitialized = -1;
         this.weaponBoxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ArtifactInfo_13302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ArtifactInfo_13302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.weaponBoxs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.weaponBoxs_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.weaponBoxs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.token_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.weaponBoxs_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.weaponBoxs_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_13302.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<Integer> getWeaponBoxsList() {
         return this.weaponBoxs_;
      }

      public int getWeaponBoxsCount() {
         return this.weaponBoxs_.size();
      }

      public int getWeaponBoxs(int index) {
         return this.weaponBoxs_.getInt(index);
      }

      public boolean hasToken() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getToken() {
         return this.token_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasToken()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         for(int i = 0; i < this.weaponBoxs_.size(); ++i) {
            output.writeInt32(3, this.weaponBoxs_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.token_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.weaponBoxs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.weaponBoxs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getWeaponBoxsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.token_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ArtifactInfo_13302)) {
            return super.equals(obj);
         } else {
            S2C_ArtifactInfo_13302 other = (S2C_ArtifactInfo_13302)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getWeaponBoxsList().equals(other.getWeaponBoxsList())) {
               return false;
            } else if (this.hasToken() != other.hasToken()) {
               return false;
            } else if (this.hasToken() && this.getToken() != other.getToken()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getWeaponBoxsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWeaponBoxsList().hashCode();
            }

            if (this.hasToken()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getToken();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ArtifactInfo_13302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_13302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_13302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_13302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_13302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_13302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ArtifactInfo_13302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ArtifactInfo_13302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ArtifactInfo_13302> parser() {
         return PARSER;
      }

      public Parser<S2C_ArtifactInfo_13302> getParserForType() {
         return PARSER;
      }

      public S2C_ArtifactInfo_13302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ArtifactInfo_13302OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private Internal.IntList weaponBoxs_;
         private int token_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_13302.class, Builder.class);
         }

         private Builder() {
            this.weaponBoxs_ = ArtifactActivityMsg.S2C_ArtifactInfo_13302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.weaponBoxs_ = ArtifactActivityMsg.S2C_ArtifactInfo_13302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_ArtifactInfo_13302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.weaponBoxs_ = ArtifactActivityMsg.S2C_ArtifactInfo_13302.emptyIntList();
            this.bitField0_ &= -5;
            this.token_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_ArtifactInfo_13302_descriptor;
         }

         public S2C_ArtifactInfo_13302 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_ArtifactInfo_13302.getDefaultInstance();
         }

         public S2C_ArtifactInfo_13302 build() {
            S2C_ArtifactInfo_13302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ArtifactInfo_13302 buildPartial() {
            S2C_ArtifactInfo_13302 result = new S2C_ArtifactInfo_13302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.weaponBoxs_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.weaponBoxs_ = this.weaponBoxs_;
            if ((from_bitField0_ & 8) != 0) {
               result.token_ = this.token_;
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
            if (other instanceof S2C_ArtifactInfo_13302) {
               return this.mergeFrom((S2C_ArtifactInfo_13302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ArtifactInfo_13302 other) {
            if (other == ArtifactActivityMsg.S2C_ArtifactInfo_13302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (!other.weaponBoxs_.isEmpty()) {
                  if (this.weaponBoxs_.isEmpty()) {
                     this.weaponBoxs_ = other.weaponBoxs_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureWeaponBoxsIsMutable();
                     this.weaponBoxs_.addAll(other.weaponBoxs_);
                  }

                  this.onChanged();
               }

               if (other.hasToken()) {
                  this.setToken(other.getToken());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasToken();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ArtifactInfo_13302 parsedMessage = null;

            try {
               parsedMessage = (S2C_ArtifactInfo_13302)ArtifactActivityMsg.S2C_ArtifactInfo_13302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ArtifactInfo_13302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureWeaponBoxsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.weaponBoxs_ = ArtifactActivityMsg.S2C_ArtifactInfo_13302.mutableCopy(this.weaponBoxs_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getWeaponBoxsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.weaponBoxs_) : this.weaponBoxs_);
         }

         public int getWeaponBoxsCount() {
            return this.weaponBoxs_.size();
         }

         public int getWeaponBoxs(int index) {
            return this.weaponBoxs_.getInt(index);
         }

         public Builder setWeaponBoxs(int index, int value) {
            this.ensureWeaponBoxsIsMutable();
            this.weaponBoxs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addWeaponBoxs(int value) {
            this.ensureWeaponBoxsIsMutable();
            this.weaponBoxs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllWeaponBoxs(Iterable<? extends Integer> values) {
            this.ensureWeaponBoxsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weaponBoxs_);
            this.onChanged();
            return this;
         }

         public Builder clearWeaponBoxs() {
            this.weaponBoxs_ = ArtifactActivityMsg.S2C_ArtifactInfo_13302.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasToken() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getToken() {
            return this.token_;
         }

         public Builder setToken(int value) {
            this.bitField0_ |= 8;
            this.token_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearToken() {
            this.bitField0_ &= -9;
            this.token_ = 0;
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

   public static final class C2S_OpenWeaponBox_13303 extends GeneratedMessageV3 implements C2S_OpenWeaponBox_13303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenWeaponBox_13303 DEFAULT_INSTANCE = new C2S_OpenWeaponBox_13303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenWeaponBox_13303> PARSER = new AbstractParser<C2S_OpenWeaponBox_13303>() {
         public C2S_OpenWeaponBox_13303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenWeaponBox_13303(input, extensionRegistry);
         }
      };

      private C2S_OpenWeaponBox_13303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenWeaponBox_13303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenWeaponBox_13303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenWeaponBox_13303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.boxId_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_13303.class, Builder.class);
      }

      public boolean hasBoxId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBoxId() {
         return this.boxId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBoxId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.boxId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.boxId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenWeaponBox_13303)) {
            return super.equals(obj);
         } else {
            C2S_OpenWeaponBox_13303 other = (C2S_OpenWeaponBox_13303)obj;
            if (this.hasBoxId() != other.hasBoxId()) {
               return false;
            } else if (this.hasBoxId() && this.getBoxId() != other.getBoxId()) {
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
            if (this.hasBoxId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_13303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_13303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_13303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_13303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_13303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenWeaponBox_13303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenWeaponBox_13303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenWeaponBox_13303> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenWeaponBox_13303> getParserForType() {
         return PARSER;
      }

      public C2S_OpenWeaponBox_13303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenWeaponBox_13303OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_13303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_OpenWeaponBox_13303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_13303_descriptor;
         }

         public C2S_OpenWeaponBox_13303 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_OpenWeaponBox_13303.getDefaultInstance();
         }

         public C2S_OpenWeaponBox_13303 build() {
            C2S_OpenWeaponBox_13303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenWeaponBox_13303 buildPartial() {
            C2S_OpenWeaponBox_13303 result = new C2S_OpenWeaponBox_13303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.boxId_ = this.boxId_;
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
            if (other instanceof C2S_OpenWeaponBox_13303) {
               return this.mergeFrom((C2S_OpenWeaponBox_13303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenWeaponBox_13303 other) {
            if (other == ArtifactActivityMsg.C2S_OpenWeaponBox_13303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBoxId()) {
                  this.setBoxId(other.getBoxId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBoxId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenWeaponBox_13303 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenWeaponBox_13303)ArtifactActivityMsg.C2S_OpenWeaponBox_13303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenWeaponBox_13303)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBoxId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBoxId() {
            return this.boxId_;
         }

         public Builder setBoxId(int value) {
            this.bitField0_ |= 1;
            this.boxId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.bitField0_ &= -2;
            this.boxId_ = 0;
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

   public static final class S2C_OpenWeaponBox_13304 extends GeneratedMessageV3 implements S2C_OpenWeaponBox_13304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenWeaponBox_13304 DEFAULT_INSTANCE = new S2C_OpenWeaponBox_13304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenWeaponBox_13304> PARSER = new AbstractParser<S2C_OpenWeaponBox_13304>() {
         public S2C_OpenWeaponBox_13304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenWeaponBox_13304(input, extensionRegistry);
         }
      };

      private S2C_OpenWeaponBox_13304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenWeaponBox_13304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenWeaponBox_13304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenWeaponBox_13304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.boxId_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_13304.class, Builder.class);
      }

      public boolean hasBoxId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBoxId() {
         return this.boxId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBoxId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.boxId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.boxId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenWeaponBox_13304)) {
            return super.equals(obj);
         } else {
            S2C_OpenWeaponBox_13304 other = (S2C_OpenWeaponBox_13304)obj;
            if (this.hasBoxId() != other.hasBoxId()) {
               return false;
            } else if (this.hasBoxId() && this.getBoxId() != other.getBoxId()) {
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
            if (this.hasBoxId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_13304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_13304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_13304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_13304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_13304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenWeaponBox_13304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenWeaponBox_13304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenWeaponBox_13304> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenWeaponBox_13304> getParserForType() {
         return PARSER;
      }

      public S2C_OpenWeaponBox_13304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenWeaponBox_13304OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_13304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_OpenWeaponBox_13304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_13304_descriptor;
         }

         public S2C_OpenWeaponBox_13304 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_OpenWeaponBox_13304.getDefaultInstance();
         }

         public S2C_OpenWeaponBox_13304 build() {
            S2C_OpenWeaponBox_13304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenWeaponBox_13304 buildPartial() {
            S2C_OpenWeaponBox_13304 result = new S2C_OpenWeaponBox_13304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.boxId_ = this.boxId_;
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
            if (other instanceof S2C_OpenWeaponBox_13304) {
               return this.mergeFrom((S2C_OpenWeaponBox_13304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenWeaponBox_13304 other) {
            if (other == ArtifactActivityMsg.S2C_OpenWeaponBox_13304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBoxId()) {
                  this.setBoxId(other.getBoxId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBoxId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenWeaponBox_13304 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenWeaponBox_13304)ArtifactActivityMsg.S2C_OpenWeaponBox_13304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenWeaponBox_13304)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBoxId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBoxId() {
            return this.boxId_;
         }

         public Builder setBoxId(int value) {
            this.bitField0_ |= 1;
            this.boxId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.bitField0_ &= -2;
            this.boxId_ = 0;
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

   public static final class C2S_LootInfo_13305 extends GeneratedMessageV3 implements C2S_LootInfo_13305OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_13305 DEFAULT_INSTANCE = new C2S_LootInfo_13305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_13305> PARSER = new AbstractParser<C2S_LootInfo_13305>() {
         public C2S_LootInfo_13305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_13305(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_13305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_13305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_13305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_13305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_13305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_13305)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_13305 other = (C2S_LootInfo_13305)obj;
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

      public static C2S_LootInfo_13305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_13305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_13305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_13305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_13305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_13305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_13305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_13305 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_13305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_13305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_13305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_13305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_13305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_13305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_13305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_13305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_13305> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_13305> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_13305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_13305OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_13305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LootInfo_13305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootInfo_13305_descriptor;
         }

         public C2S_LootInfo_13305 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LootInfo_13305.getDefaultInstance();
         }

         public C2S_LootInfo_13305 build() {
            C2S_LootInfo_13305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_13305 buildPartial() {
            C2S_LootInfo_13305 result = new C2S_LootInfo_13305(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_13305) {
               return this.mergeFrom((C2S_LootInfo_13305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_13305 other) {
            if (other == ArtifactActivityMsg.C2S_LootInfo_13305.getDefaultInstance()) {
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
            C2S_LootInfo_13305 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_13305)ArtifactActivityMsg.C2S_LootInfo_13305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_13305)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_13306 extends GeneratedMessageV3 implements S2C_LootInfo_13306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENJOYID_FIELD_NUMBER = 1;
      private int enjoyId_;
      public static final int RESETTIMES_FIELD_NUMBER = 2;
      private int resetTimes_;
      public static final int REWARDID_FIELD_NUMBER = 3;
      private Internal.IntList rewardId_;
      public static final int HADGETENJOY_FIELD_NUMBER = 4;
      private boolean hadGetEnjoy_;
      public static final int CHOOSETIMES_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> chooseTimes_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 6;
      private int curLootNum_;
      public static final int DAILYDRAWNUM_FIELD_NUMBER = 7;
      private int dailyDrawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootInfo_13306 DEFAULT_INSTANCE = new S2C_LootInfo_13306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_13306> PARSER = new AbstractParser<S2C_LootInfo_13306>() {
         public S2C_LootInfo_13306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_13306(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_13306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_13306() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.chooseTimes_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_13306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_13306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 2;
                        this.resetTimes_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.hadGetEnjoy_ = input.readBool();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.chooseTimes_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.chooseTimes_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.curLootNum_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.dailyDrawNum_ = input.readInt32();
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.chooseTimes_ = Collections.unmodifiableList(this.chooseTimes_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_13306.class, Builder.class);
      }

      public boolean hasEnjoyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnjoyId() {
         return this.enjoyId_;
      }

      public boolean hasResetTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResetTimes() {
         return this.resetTimes_;
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

      public boolean hasHadGetEnjoy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getHadGetEnjoy() {
         return this.hadGetEnjoy_;
      }

      public List<CommonMsg.MapDataII> getChooseTimesList() {
         return this.chooseTimes_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getChooseTimesOrBuilderList() {
         return this.chooseTimes_;
      }

      public int getChooseTimesCount() {
         return this.chooseTimes_.size();
      }

      public CommonMsg.MapDataII getChooseTimes(int index) {
         return (CommonMsg.MapDataII)this.chooseTimes_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getChooseTimesOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.chooseTimes_.get(index);
      }

      public boolean hasCurLootNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCurLootNum() {
         return this.curLootNum_;
      }

      public boolean hasDailyDrawNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDailyDrawNum() {
         return this.dailyDrawNum_;
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
         } else if (!this.hasResetTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHadGetEnjoy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurLootNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getChooseTimesCount(); ++i) {
               if (!this.getChooseTimes(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.resetTimes_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(3, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.hadGetEnjoy_);
         }

         for(int i = 0; i < this.chooseTimes_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.chooseTimes_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.curLootNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.dailyDrawNum_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.resetTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.hadGetEnjoy_);
            }

            for(int i = 0; i < this.chooseTimes_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.chooseTimes_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.curLootNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.dailyDrawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LootInfo_13306)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_13306 other = (S2C_LootInfo_13306)obj;
            if (this.hasEnjoyId() != other.hasEnjoyId()) {
               return false;
            } else if (this.hasEnjoyId() && this.getEnjoyId() != other.getEnjoyId()) {
               return false;
            } else if (this.hasResetTimes() != other.hasResetTimes()) {
               return false;
            } else if (this.hasResetTimes() && this.getResetTimes() != other.getResetTimes()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasHadGetEnjoy() != other.hasHadGetEnjoy()) {
               return false;
            } else if (this.hasHadGetEnjoy() && this.getHadGetEnjoy() != other.getHadGetEnjoy()) {
               return false;
            } else if (!this.getChooseTimesList().equals(other.getChooseTimesList())) {
               return false;
            } else if (this.hasCurLootNum() != other.hasCurLootNum()) {
               return false;
            } else if (this.hasCurLootNum() && this.getCurLootNum() != other.getCurLootNum()) {
               return false;
            } else if (this.hasDailyDrawNum() != other.hasDailyDrawNum()) {
               return false;
            } else if (this.hasDailyDrawNum() && this.getDailyDrawNum() != other.getDailyDrawNum()) {
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

            if (this.hasResetTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResetTimes();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasHadGetEnjoy()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getHadGetEnjoy());
            }

            if (this.getChooseTimesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getChooseTimesList().hashCode();
            }

            if (this.hasCurLootNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getCurLootNum();
            }

            if (this.hasDailyDrawNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getDailyDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LootInfo_13306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_13306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_13306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_13306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_13306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_13306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_13306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_13306 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_13306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_13306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_13306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_13306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_13306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_13306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_13306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_13306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_13306> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_13306> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_13306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_13306OrBuilder {
         private int bitField0_;
         private int enjoyId_;
         private int resetTimes_;
         private Internal.IntList rewardId_;
         private boolean hadGetEnjoy_;
         private List<CommonMsg.MapDataII> chooseTimes_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> chooseTimesBuilder_;
         private int curLootNum_;
         private int dailyDrawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_13306.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactActivityMsg.S2C_LootInfo_13306.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactActivityMsg.S2C_LootInfo_13306.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LootInfo_13306.alwaysUseFieldBuilders) {
               this.getChooseTimesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.resetTimes_ = 0;
            this.bitField0_ &= -3;
            this.rewardId_ = ArtifactActivityMsg.S2C_LootInfo_13306.emptyIntList();
            this.bitField0_ &= -5;
            this.hadGetEnjoy_ = false;
            this.bitField0_ &= -9;
            if (this.chooseTimesBuilder_ == null) {
               this.chooseTimes_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.chooseTimesBuilder_.clear();
            }

            this.curLootNum_ = 0;
            this.bitField0_ &= -33;
            this.dailyDrawNum_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootInfo_13306_descriptor;
         }

         public S2C_LootInfo_13306 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LootInfo_13306.getDefaultInstance();
         }

         public S2C_LootInfo_13306 build() {
            S2C_LootInfo_13306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_13306 buildPartial() {
            S2C_LootInfo_13306 result = new S2C_LootInfo_13306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enjoyId_ = this.enjoyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.resetTimes_ = this.resetTimes_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 8) != 0) {
               result.hadGetEnjoy_ = this.hadGetEnjoy_;
               to_bitField0_ |= 4;
            }

            if (this.chooseTimesBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.chooseTimes_ = Collections.unmodifiableList(this.chooseTimes_);
                  this.bitField0_ &= -17;
               }

               result.chooseTimes_ = this.chooseTimes_;
            } else {
               result.chooseTimes_ = this.chooseTimesBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.curLootNum_ = this.curLootNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.dailyDrawNum_ = this.dailyDrawNum_;
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
            if (other instanceof S2C_LootInfo_13306) {
               return this.mergeFrom((S2C_LootInfo_13306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_13306 other) {
            if (other == ArtifactActivityMsg.S2C_LootInfo_13306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnjoyId()) {
                  this.setEnjoyId(other.getEnjoyId());
               }

               if (other.hasResetTimes()) {
                  this.setResetTimes(other.getResetTimes());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasHadGetEnjoy()) {
                  this.setHadGetEnjoy(other.getHadGetEnjoy());
               }

               if (this.chooseTimesBuilder_ == null) {
                  if (!other.chooseTimes_.isEmpty()) {
                     if (this.chooseTimes_.isEmpty()) {
                        this.chooseTimes_ = other.chooseTimes_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureChooseTimesIsMutable();
                        this.chooseTimes_.addAll(other.chooseTimes_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chooseTimes_.isEmpty()) {
                  if (this.chooseTimesBuilder_.isEmpty()) {
                     this.chooseTimesBuilder_.dispose();
                     this.chooseTimesBuilder_ = null;
                     this.chooseTimes_ = other.chooseTimes_;
                     this.bitField0_ &= -17;
                     this.chooseTimesBuilder_ = ArtifactActivityMsg.S2C_LootInfo_13306.alwaysUseFieldBuilders ? this.getChooseTimesFieldBuilder() : null;
                  } else {
                     this.chooseTimesBuilder_.addAllMessages(other.chooseTimes_);
                  }
               }

               if (other.hasCurLootNum()) {
                  this.setCurLootNum(other.getCurLootNum());
               }

               if (other.hasDailyDrawNum()) {
                  this.setDailyDrawNum(other.getDailyDrawNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEnjoyId()) {
               return false;
            } else if (!this.hasResetTimes()) {
               return false;
            } else if (!this.hasHadGetEnjoy()) {
               return false;
            } else if (!this.hasCurLootNum()) {
               return false;
            } else if (!this.hasDailyDrawNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getChooseTimesCount(); ++i) {
                  if (!this.getChooseTimes(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootInfo_13306 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_13306)ArtifactActivityMsg.S2C_LootInfo_13306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_13306)e.getUnfinishedMessage();
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

         public boolean hasResetTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResetTimes() {
            return this.resetTimes_;
         }

         public Builder setResetTimes(int value) {
            this.bitField0_ |= 2;
            this.resetTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResetTimes() {
            this.bitField0_ &= -3;
            this.resetTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardId_ = ArtifactActivityMsg.S2C_LootInfo_13306.mutableCopy(this.rewardId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
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
            this.rewardId_ = ArtifactActivityMsg.S2C_LootInfo_13306.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasHadGetEnjoy() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getHadGetEnjoy() {
            return this.hadGetEnjoy_;
         }

         public Builder setHadGetEnjoy(boolean value) {
            this.bitField0_ |= 8;
            this.hadGetEnjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHadGetEnjoy() {
            this.bitField0_ &= -9;
            this.hadGetEnjoy_ = false;
            this.onChanged();
            return this;
         }

         private void ensureChooseTimesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.chooseTimes_ = new ArrayList(this.chooseTimes_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getChooseTimesList() {
            return this.chooseTimesBuilder_ == null ? Collections.unmodifiableList(this.chooseTimes_) : this.chooseTimesBuilder_.getMessageList();
         }

         public int getChooseTimesCount() {
            return this.chooseTimesBuilder_ == null ? this.chooseTimes_.size() : this.chooseTimesBuilder_.getCount();
         }

         public CommonMsg.MapDataII getChooseTimes(int index) {
            return this.chooseTimesBuilder_ == null ? (CommonMsg.MapDataII)this.chooseTimes_.get(index) : (CommonMsg.MapDataII)this.chooseTimesBuilder_.getMessage(index);
         }

         public Builder setChooseTimes(int index, CommonMsg.MapDataII value) {
            if (this.chooseTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.set(index, value);
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChooseTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.chooseTimesBuilder_ == null) {
               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChooseTimes(CommonMsg.MapDataII value) {
            if (this.chooseTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.add(value);
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChooseTimes(int index, CommonMsg.MapDataII value) {
            if (this.chooseTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.add(index, value);
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChooseTimes(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.chooseTimesBuilder_ == null) {
               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChooseTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.chooseTimesBuilder_ == null) {
               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChooseTimes(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.chooseTimesBuilder_ == null) {
               this.ensureChooseTimesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chooseTimes_);
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChooseTimes() {
            if (this.chooseTimesBuilder_ == null) {
               this.chooseTimes_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.clear();
            }

            return this;
         }

         public Builder removeChooseTimes(int index) {
            if (this.chooseTimesBuilder_ == null) {
               this.ensureChooseTimesIsMutable();
               this.chooseTimes_.remove(index);
               this.onChanged();
            } else {
               this.chooseTimesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getChooseTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getChooseTimesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getChooseTimesOrBuilder(int index) {
            return this.chooseTimesBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.chooseTimes_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.chooseTimesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getChooseTimesOrBuilderList() {
            return this.chooseTimesBuilder_ != null ? this.chooseTimesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chooseTimes_);
         }

         public CommonMsg.MapDataII.Builder addChooseTimesBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getChooseTimesFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addChooseTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getChooseTimesFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getChooseTimesBuilderList() {
            return this.getChooseTimesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getChooseTimesFieldBuilder() {
            if (this.chooseTimesBuilder_ == null) {
               this.chooseTimesBuilder_ = new RepeatedFieldBuilderV3(this.chooseTimes_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.chooseTimes_ = null;
            }

            return this.chooseTimesBuilder_;
         }

         public boolean hasCurLootNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getCurLootNum() {
            return this.curLootNum_;
         }

         public Builder setCurLootNum(int value) {
            this.bitField0_ |= 32;
            this.curLootNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurLootNum() {
            this.bitField0_ &= -33;
            this.curLootNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyDrawNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getDailyDrawNum() {
            return this.dailyDrawNum_;
         }

         public Builder setDailyDrawNum(int value) {
            this.bitField0_ |= 64;
            this.dailyDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyDrawNum() {
            this.bitField0_ &= -65;
            this.dailyDrawNum_ = 0;
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

   public static final class C2S_LootReward_13307 extends GeneratedMessageV3 implements C2S_LootReward_13307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_13307 DEFAULT_INSTANCE = new C2S_LootReward_13307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_13307> PARSER = new AbstractParser<C2S_LootReward_13307>() {
         public C2S_LootReward_13307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_13307(input, extensionRegistry);
         }
      };

      private C2S_LootReward_13307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_13307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_13307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_13307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_13307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_13307)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_13307 other = (C2S_LootReward_13307)obj;
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

      public static C2S_LootReward_13307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_13307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_13307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_13307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_13307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_13307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_13307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_13307 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_13307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_13307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_13307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_13307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_13307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_13307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_13307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_13307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_13307> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_13307> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_13307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_13307OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_13307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LootReward_13307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReward_13307_descriptor;
         }

         public C2S_LootReward_13307 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LootReward_13307.getDefaultInstance();
         }

         public C2S_LootReward_13307 build() {
            C2S_LootReward_13307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_13307 buildPartial() {
            C2S_LootReward_13307 result = new C2S_LootReward_13307(this);
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
            if (other instanceof C2S_LootReward_13307) {
               return this.mergeFrom((C2S_LootReward_13307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_13307 other) {
            if (other == ArtifactActivityMsg.C2S_LootReward_13307.getDefaultInstance()) {
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
            C2S_LootReward_13307 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_13307)ArtifactActivityMsg.C2S_LootReward_13307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_13307)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_13308 extends GeneratedMessageV3 implements S2C_LootReward_13308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int ISENJOY_FIELD_NUMBER = 2;
      private boolean isEnjoy_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_13308 DEFAULT_INSTANCE = new S2C_LootReward_13308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_13308> PARSER = new AbstractParser<S2C_LootReward_13308>() {
         public S2C_LootReward_13308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_13308(input, extensionRegistry);
         }
      };

      private S2C_LootReward_13308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_13308() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_13308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_13308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isEnjoy_ = input.readBool();
                        continue;
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_13308.class, Builder.class);
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

      public boolean hasIsEnjoy() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsEnjoy() {
         return this.isEnjoy_;
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
         } else if (!this.hasIsEnjoy()) {
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
         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(1, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isEnjoy_);
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
            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isEnjoy_);
            }

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
         } else if (!(obj instanceof S2C_LootReward_13308)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_13308 other = (S2C_LootReward_13308)obj;
            if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasIsEnjoy() != other.hasIsEnjoy()) {
               return false;
            } else if (this.hasIsEnjoy() && this.getIsEnjoy() != other.getIsEnjoy()) {
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
            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasIsEnjoy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsEnjoy());
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

      public static S2C_LootReward_13308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_13308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_13308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_13308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_13308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_13308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_13308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_13308 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_13308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_13308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_13308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_13308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_13308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_13308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_13308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_13308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_13308> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_13308> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_13308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_13308OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private boolean isEnjoy_;
         private int curLootNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_13308.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactActivityMsg.S2C_LootReward_13308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactActivityMsg.S2C_LootReward_13308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LootReward_13308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ArtifactActivityMsg.S2C_LootReward_13308.emptyIntList();
            this.bitField0_ &= -2;
            this.isEnjoy_ = false;
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootReward_13308_descriptor;
         }

         public S2C_LootReward_13308 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LootReward_13308.getDefaultInstance();
         }

         public S2C_LootReward_13308 build() {
            S2C_LootReward_13308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_13308 buildPartial() {
            S2C_LootReward_13308 result = new S2C_LootReward_13308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 2) != 0) {
               result.isEnjoy_ = this.isEnjoy_;
               to_bitField0_ |= 1;
            }

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
            if (other instanceof S2C_LootReward_13308) {
               return this.mergeFrom((S2C_LootReward_13308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_13308 other) {
            if (other == ArtifactActivityMsg.S2C_LootReward_13308.getDefaultInstance()) {
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

               if (other.hasIsEnjoy()) {
                  this.setIsEnjoy(other.getIsEnjoy());
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
            if (!this.hasIsEnjoy()) {
               return false;
            } else {
               return this.hasCurLootNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LootReward_13308 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_13308)ArtifactActivityMsg.S2C_LootReward_13308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_13308)e.getUnfinishedMessage();
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
               this.rewardId_ = ArtifactActivityMsg.S2C_LootReward_13308.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ArtifactActivityMsg.S2C_LootReward_13308.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasIsEnjoy() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsEnjoy() {
            return this.isEnjoy_;
         }

         public Builder setIsEnjoy(boolean value) {
            this.bitField0_ |= 2;
            this.isEnjoy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsEnjoy() {
            this.bitField0_ &= -3;
            this.isEnjoy_ = false;
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

   public static final class C2S_LootReset_13309 extends GeneratedMessageV3 implements C2S_LootReset_13309OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootReset_13309 DEFAULT_INSTANCE = new C2S_LootReset_13309();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReset_13309> PARSER = new AbstractParser<C2S_LootReset_13309>() {
         public C2S_LootReset_13309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReset_13309(input, extensionRegistry);
         }
      };

      private C2S_LootReset_13309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReset_13309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReset_13309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReset_13309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_13309.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReset_13309)) {
            return super.equals(obj);
         } else {
            C2S_LootReset_13309 other = (C2S_LootReset_13309)obj;
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

      public static C2S_LootReset_13309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_13309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_13309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_13309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_13309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_13309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_13309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_13309 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_13309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_13309 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReset_13309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_13309 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_13309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_13309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReset_13309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReset_13309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReset_13309> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReset_13309> getParserForType() {
         return PARSER;
      }

      public C2S_LootReset_13309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReset_13309OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_13309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LootReset_13309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootReset_13309_descriptor;
         }

         public C2S_LootReset_13309 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LootReset_13309.getDefaultInstance();
         }

         public C2S_LootReset_13309 build() {
            C2S_LootReset_13309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReset_13309 buildPartial() {
            C2S_LootReset_13309 result = new C2S_LootReset_13309(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootReset_13309) {
               return this.mergeFrom((C2S_LootReset_13309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReset_13309 other) {
            if (other == ArtifactActivityMsg.C2S_LootReset_13309.getDefaultInstance()) {
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
            C2S_LootReset_13309 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReset_13309)ArtifactActivityMsg.C2S_LootReset_13309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReset_13309)e.getUnfinishedMessage();
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

   public static final class C2S_LootEnjoy_13311 extends GeneratedMessageV3 implements C2S_LootEnjoy_13311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_13311 DEFAULT_INSTANCE = new C2S_LootEnjoy_13311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_13311> PARSER = new AbstractParser<C2S_LootEnjoy_13311>() {
         public C2S_LootEnjoy_13311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_13311(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_13311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_13311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_13311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_13311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_13311.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_13311)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_13311 other = (C2S_LootEnjoy_13311)obj;
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

      public static C2S_LootEnjoy_13311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_13311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_13311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_13311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_13311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_13311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_13311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_13311 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_13311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_13311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_13311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_13311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_13311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_13311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_13311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_13311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_13311> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_13311> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_13311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_13311OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_13311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LootEnjoy_13311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LootEnjoy_13311_descriptor;
         }

         public C2S_LootEnjoy_13311 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LootEnjoy_13311.getDefaultInstance();
         }

         public C2S_LootEnjoy_13311 build() {
            C2S_LootEnjoy_13311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_13311 buildPartial() {
            C2S_LootEnjoy_13311 result = new C2S_LootEnjoy_13311(this);
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
            if (other instanceof C2S_LootEnjoy_13311) {
               return this.mergeFrom((C2S_LootEnjoy_13311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_13311 other) {
            if (other == ArtifactActivityMsg.C2S_LootEnjoy_13311.getDefaultInstance()) {
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
            C2S_LootEnjoy_13311 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_13311)ArtifactActivityMsg.C2S_LootEnjoy_13311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_13311)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_13312 extends GeneratedMessageV3 implements S2C_LootEnjoy_13312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_13312 DEFAULT_INSTANCE = new S2C_LootEnjoy_13312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_13312> PARSER = new AbstractParser<S2C_LootEnjoy_13312>() {
         public S2C_LootEnjoy_13312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_13312(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_13312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_13312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_13312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_13312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_13312.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_13312)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_13312 other = (S2C_LootEnjoy_13312)obj;
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

      public static S2C_LootEnjoy_13312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_13312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_13312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_13312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_13312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_13312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_13312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_13312 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_13312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_13312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_13312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_13312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_13312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_13312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_13312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_13312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_13312> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_13312> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_13312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_13312OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_13312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LootEnjoy_13312.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LootEnjoy_13312_descriptor;
         }

         public S2C_LootEnjoy_13312 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LootEnjoy_13312.getDefaultInstance();
         }

         public S2C_LootEnjoy_13312 build() {
            S2C_LootEnjoy_13312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_13312 buildPartial() {
            S2C_LootEnjoy_13312 result = new S2C_LootEnjoy_13312(this);
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
            if (other instanceof S2C_LootEnjoy_13312) {
               return this.mergeFrom((S2C_LootEnjoy_13312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_13312 other) {
            if (other == ArtifactActivityMsg.S2C_LootEnjoy_13312.getDefaultInstance()) {
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
            S2C_LootEnjoy_13312 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_13312)ArtifactActivityMsg.S2C_LootEnjoy_13312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_13312)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureMain_13451 extends GeneratedMessageV3 implements C2S_TreasureMain_13451OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMain_13451 DEFAULT_INSTANCE = new C2S_TreasureMain_13451();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMain_13451> PARSER = new AbstractParser<C2S_TreasureMain_13451>() {
         public C2S_TreasureMain_13451 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMain_13451(input, extensionRegistry);
         }
      };

      private C2S_TreasureMain_13451(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMain_13451() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMain_13451();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMain_13451(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_13451.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMain_13451)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMain_13451 other = (C2S_TreasureMain_13451)obj;
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

      public static C2S_TreasureMain_13451 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_13451 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_13451 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_13451 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_13451 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_13451 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_13451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_13451 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_13451 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_13451 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_13451 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_13451 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_13451 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_13451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMain_13451 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMain_13451 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMain_13451> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMain_13451> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMain_13451 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMain_13451OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_13451.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_TreasureMain_13451.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMain_13451_descriptor;
         }

         public C2S_TreasureMain_13451 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_TreasureMain_13451.getDefaultInstance();
         }

         public C2S_TreasureMain_13451 build() {
            C2S_TreasureMain_13451 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMain_13451 buildPartial() {
            C2S_TreasureMain_13451 result = new C2S_TreasureMain_13451(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMain_13451) {
               return this.mergeFrom((C2S_TreasureMain_13451)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMain_13451 other) {
            if (other == ArtifactActivityMsg.C2S_TreasureMain_13451.getDefaultInstance()) {
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
            C2S_TreasureMain_13451 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMain_13451)ArtifactActivityMsg.C2S_TreasureMain_13451.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMain_13451)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMain_13452 extends GeneratedMessageV3 implements S2C_TreasureMain_13452OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANDOMCOUNT_FIELD_NUMBER = 1;
      private int randomCount_;
      public static final int RANDOMRECOVERTIME_FIELD_NUMBER = 2;
      private int randomRecoverTime_;
      public static final int APPOINTCOUNT_FIELD_NUMBER = 3;
      private int appointCount_;
      public static final int GRID_FIELD_NUMBER = 4;
      private int grid_;
      public static final int GOTGRID_FIELD_NUMBER = 5;
      private Internal.IntList gotGrid_;
      public static final int NEEDBATTLE_FIELD_NUMBER = 6;
      private boolean needBattle_;
      public static final int APPOINTCOUNTBUY_FIELD_NUMBER = 7;
      private int appointCountBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureMain_13452 DEFAULT_INSTANCE = new S2C_TreasureMain_13452();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMain_13452> PARSER = new AbstractParser<S2C_TreasureMain_13452>() {
         public S2C_TreasureMain_13452 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMain_13452(input, extensionRegistry);
         }
      };

      private S2C_TreasureMain_13452(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMain_13452() {
         this.memoizedIsInitialized = -1;
         this.gotGrid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMain_13452();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMain_13452(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.randomCount_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.randomRecoverTime_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.appointCount_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.grid_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.gotGrid_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.gotGrid_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotGrid_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.needBattle_ = input.readBool();
                        continue;
                     case 56:
                        this.bitField0_ |= 32;
                        this.appointCountBuy_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotGrid_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 16) != 0) {
                  this.gotGrid_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_13452.class, Builder.class);
      }

      public boolean hasRandomCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRandomCount() {
         return this.randomCount_;
      }

      public boolean hasRandomRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRandomRecoverTime() {
         return this.randomRecoverTime_;
      }

      public boolean hasAppointCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAppointCount() {
         return this.appointCount_;
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public List<Integer> getGotGridList() {
         return this.gotGrid_;
      }

      public int getGotGridCount() {
         return this.gotGrid_.size();
      }

      public int getGotGrid(int index) {
         return this.gotGrid_.getInt(index);
      }

      public boolean hasNeedBattle() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getNeedBattle() {
         return this.needBattle_;
      }

      public boolean hasAppointCountBuy() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getAppointCountBuy() {
         return this.appointCountBuy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRandomCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRandomRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAppointCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNeedBattle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAppointCountBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.randomCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.randomRecoverTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.appointCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.grid_);
         }

         for(int i = 0; i < this.gotGrid_.size(); ++i) {
            output.writeInt32(5, this.gotGrid_.getInt(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(6, this.needBattle_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.appointCountBuy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.randomCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.randomRecoverTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.appointCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.grid_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotGrid_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotGrid_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotGridList().size();
            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.needBattle_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.appointCountBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureMain_13452)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMain_13452 other = (S2C_TreasureMain_13452)obj;
            if (this.hasRandomCount() != other.hasRandomCount()) {
               return false;
            } else if (this.hasRandomCount() && this.getRandomCount() != other.getRandomCount()) {
               return false;
            } else if (this.hasRandomRecoverTime() != other.hasRandomRecoverTime()) {
               return false;
            } else if (this.hasRandomRecoverTime() && this.getRandomRecoverTime() != other.getRandomRecoverTime()) {
               return false;
            } else if (this.hasAppointCount() != other.hasAppointCount()) {
               return false;
            } else if (this.hasAppointCount() && this.getAppointCount() != other.getAppointCount()) {
               return false;
            } else if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (!this.getGotGridList().equals(other.getGotGridList())) {
               return false;
            } else if (this.hasNeedBattle() != other.hasNeedBattle()) {
               return false;
            } else if (this.hasNeedBattle() && this.getNeedBattle() != other.getNeedBattle()) {
               return false;
            } else if (this.hasAppointCountBuy() != other.hasAppointCountBuy()) {
               return false;
            } else if (this.hasAppointCountBuy() && this.getAppointCountBuy() != other.getAppointCountBuy()) {
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
            if (this.hasRandomCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRandomCount();
            }

            if (this.hasRandomRecoverTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRandomRecoverTime();
            }

            if (this.hasAppointCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAppointCount();
            }

            if (this.hasGrid()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGrid();
            }

            if (this.getGotGridCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGotGridList().hashCode();
            }

            if (this.hasNeedBattle()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getNeedBattle());
            }

            if (this.hasAppointCountBuy()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getAppointCountBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureMain_13452 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_13452 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_13452 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_13452 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_13452 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_13452 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_13452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_13452 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_13452 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_13452 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_13452 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_13452 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_13452 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_13452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMain_13452 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMain_13452 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMain_13452> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMain_13452> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMain_13452 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMain_13452OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;
         private int appointCount_;
         private int grid_;
         private Internal.IntList gotGrid_;
         private boolean needBattle_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_13452.class, Builder.class);
         }

         private Builder() {
            this.gotGrid_ = ArtifactActivityMsg.S2C_TreasureMain_13452.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotGrid_ = ArtifactActivityMsg.S2C_TreasureMain_13452.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_TreasureMain_13452.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.randomCount_ = 0;
            this.bitField0_ &= -2;
            this.randomRecoverTime_ = 0;
            this.bitField0_ &= -3;
            this.appointCount_ = 0;
            this.bitField0_ &= -5;
            this.grid_ = 0;
            this.bitField0_ &= -9;
            this.gotGrid_ = ArtifactActivityMsg.S2C_TreasureMain_13452.emptyIntList();
            this.bitField0_ &= -17;
            this.needBattle_ = false;
            this.bitField0_ &= -33;
            this.appointCountBuy_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMain_13452_descriptor;
         }

         public S2C_TreasureMain_13452 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_TreasureMain_13452.getDefaultInstance();
         }

         public S2C_TreasureMain_13452 build() {
            S2C_TreasureMain_13452 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMain_13452 buildPartial() {
            S2C_TreasureMain_13452 result = new S2C_TreasureMain_13452(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.randomCount_ = this.randomCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.randomRecoverTime_ = this.randomRecoverTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.appointCount_ = this.appointCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.gotGrid_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.gotGrid_ = this.gotGrid_;
            if ((from_bitField0_ & 32) != 0) {
               result.needBattle_ = this.needBattle_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.appointCountBuy_ = this.appointCountBuy_;
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
            if (other instanceof S2C_TreasureMain_13452) {
               return this.mergeFrom((S2C_TreasureMain_13452)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMain_13452 other) {
            if (other == ArtifactActivityMsg.S2C_TreasureMain_13452.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRandomCount()) {
                  this.setRandomCount(other.getRandomCount());
               }

               if (other.hasRandomRecoverTime()) {
                  this.setRandomRecoverTime(other.getRandomRecoverTime());
               }

               if (other.hasAppointCount()) {
                  this.setAppointCount(other.getAppointCount());
               }

               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (!other.gotGrid_.isEmpty()) {
                  if (this.gotGrid_.isEmpty()) {
                     this.gotGrid_ = other.gotGrid_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureGotGridIsMutable();
                     this.gotGrid_.addAll(other.gotGrid_);
                  }

                  this.onChanged();
               }

               if (other.hasNeedBattle()) {
                  this.setNeedBattle(other.getNeedBattle());
               }

               if (other.hasAppointCountBuy()) {
                  this.setAppointCountBuy(other.getAppointCountBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRandomCount()) {
               return false;
            } else if (!this.hasRandomRecoverTime()) {
               return false;
            } else if (!this.hasAppointCount()) {
               return false;
            } else if (!this.hasGrid()) {
               return false;
            } else if (!this.hasNeedBattle()) {
               return false;
            } else {
               return this.hasAppointCountBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureMain_13452 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMain_13452)ArtifactActivityMsg.S2C_TreasureMain_13452.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMain_13452)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRandomCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRandomCount() {
            return this.randomCount_;
         }

         public Builder setRandomCount(int value) {
            this.bitField0_ |= 1;
            this.randomCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRandomCount() {
            this.bitField0_ &= -2;
            this.randomCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRandomRecoverTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRandomRecoverTime() {
            return this.randomRecoverTime_;
         }

         public Builder setRandomRecoverTime(int value) {
            this.bitField0_ |= 2;
            this.randomRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRandomRecoverTime() {
            this.bitField0_ &= -3;
            this.randomRecoverTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAppointCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAppointCount() {
            return this.appointCount_;
         }

         public Builder setAppointCount(int value) {
            this.bitField0_ |= 4;
            this.appointCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAppointCount() {
            this.bitField0_ &= -5;
            this.appointCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 8;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -9;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotGridIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.gotGrid_ = ArtifactActivityMsg.S2C_TreasureMain_13452.mutableCopy(this.gotGrid_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getGotGridList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.gotGrid_) : this.gotGrid_);
         }

         public int getGotGridCount() {
            return this.gotGrid_.size();
         }

         public int getGotGrid(int index) {
            return this.gotGrid_.getInt(index);
         }

         public Builder setGotGrid(int index, int value) {
            this.ensureGotGridIsMutable();
            this.gotGrid_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotGrid(int value) {
            this.ensureGotGridIsMutable();
            this.gotGrid_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotGrid(Iterable<? extends Integer> values) {
            this.ensureGotGridIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotGrid_);
            this.onChanged();
            return this;
         }

         public Builder clearGotGrid() {
            this.gotGrid_ = ArtifactActivityMsg.S2C_TreasureMain_13452.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasNeedBattle() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getNeedBattle() {
            return this.needBattle_;
         }

         public Builder setNeedBattle(boolean value) {
            this.bitField0_ |= 32;
            this.needBattle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNeedBattle() {
            this.bitField0_ &= -33;
            this.needBattle_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAppointCountBuy() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getAppointCountBuy() {
            return this.appointCountBuy_;
         }

         public Builder setAppointCountBuy(int value) {
            this.bitField0_ |= 64;
            this.appointCountBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAppointCountBuy() {
            this.bitField0_ &= -65;
            this.appointCountBuy_ = 0;
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

   public static final class C2S_TreasureRollDice_13453 extends GeneratedMessageV3 implements C2S_TreasureRollDice_13453OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureRollDice_13453 DEFAULT_INSTANCE = new C2S_TreasureRollDice_13453();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureRollDice_13453> PARSER = new AbstractParser<C2S_TreasureRollDice_13453>() {
         public C2S_TreasureRollDice_13453 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureRollDice_13453(input, extensionRegistry);
         }
      };

      private C2S_TreasureRollDice_13453(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureRollDice_13453() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureRollDice_13453();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureRollDice_13453(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_13453.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TreasureRollDice_13453)) {
            return super.equals(obj);
         } else {
            C2S_TreasureRollDice_13453 other = (C2S_TreasureRollDice_13453)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TreasureRollDice_13453 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_13453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_13453 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_13453 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_13453 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_13453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureRollDice_13453 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureRollDice_13453 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureRollDice_13453> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureRollDice_13453> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureRollDice_13453 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureRollDice_13453OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_13453.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_TreasureRollDice_13453.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureRollDice_13453_descriptor;
         }

         public C2S_TreasureRollDice_13453 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_TreasureRollDice_13453.getDefaultInstance();
         }

         public C2S_TreasureRollDice_13453 build() {
            C2S_TreasureRollDice_13453 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureRollDice_13453 buildPartial() {
            C2S_TreasureRollDice_13453 result = new C2S_TreasureRollDice_13453(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_TreasureRollDice_13453) {
               return this.mergeFrom((C2S_TreasureRollDice_13453)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureRollDice_13453 other) {
            if (other == ArtifactActivityMsg.C2S_TreasureRollDice_13453.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
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
            C2S_TreasureRollDice_13453 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureRollDice_13453)ArtifactActivityMsg.C2S_TreasureRollDice_13453.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureRollDice_13453)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
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

   public static final class S2C_TreasureRollDice_13454 extends GeneratedMessageV3 implements S2C_TreasureRollDice_13454OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int GRID_FIELD_NUMBER = 3;
      private int grid_;
      public static final int COUNT_FIELD_NUMBER = 4;
      private int count_;
      public static final int RANDOMRECOVERTIME_FIELD_NUMBER = 5;
      private int randomRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureRollDice_13454 DEFAULT_INSTANCE = new S2C_TreasureRollDice_13454();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureRollDice_13454> PARSER = new AbstractParser<S2C_TreasureRollDice_13454>() {
         public S2C_TreasureRollDice_13454 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureRollDice_13454(input, extensionRegistry);
         }
      };

      private S2C_TreasureRollDice_13454(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureRollDice_13454() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureRollDice_13454();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureRollDice_13454(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.grid_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.count_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.randomRecoverTime_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_13454.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasRandomRecoverTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRandomRecoverTime() {
         return this.randomRecoverTime_;
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
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRandomRecoverTime()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.grid_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.count_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.randomRecoverTime_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.grid_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.count_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.randomRecoverTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureRollDice_13454)) {
            return super.equals(obj);
         } else {
            S2C_TreasureRollDice_13454 other = (S2C_TreasureRollDice_13454)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasRandomRecoverTime() != other.hasRandomRecoverTime()) {
               return false;
            } else if (this.hasRandomRecoverTime() && this.getRandomRecoverTime() != other.getRandomRecoverTime()) {
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

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasGrid()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasRandomRecoverTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRandomRecoverTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureRollDice_13454 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_13454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_13454 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_13454 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_13454 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_13454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureRollDice_13454 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureRollDice_13454 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureRollDice_13454> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureRollDice_13454> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureRollDice_13454 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureRollDice_13454OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;
         private int grid_;
         private int count_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_13454.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_TreasureRollDice_13454.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.grid_ = 0;
            this.bitField0_ &= -5;
            this.count_ = 0;
            this.bitField0_ &= -9;
            this.randomRecoverTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureRollDice_13454_descriptor;
         }

         public S2C_TreasureRollDice_13454 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_TreasureRollDice_13454.getDefaultInstance();
         }

         public S2C_TreasureRollDice_13454 build() {
            S2C_TreasureRollDice_13454 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureRollDice_13454 buildPartial() {
            S2C_TreasureRollDice_13454 result = new S2C_TreasureRollDice_13454(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.randomRecoverTime_ = this.randomRecoverTime_;
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
            if (other instanceof S2C_TreasureRollDice_13454) {
               return this.mergeFrom((S2C_TreasureRollDice_13454)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureRollDice_13454 other) {
            if (other == ArtifactActivityMsg.S2C_TreasureRollDice_13454.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasRandomRecoverTime()) {
                  this.setRandomRecoverTime(other.getRandomRecoverTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else if (!this.hasGrid()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else {
               return this.hasRandomRecoverTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureRollDice_13454 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureRollDice_13454)ArtifactActivityMsg.S2C_TreasureRollDice_13454.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureRollDice_13454)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 4;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -5;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 8;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -9;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRandomRecoverTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRandomRecoverTime() {
            return this.randomRecoverTime_;
         }

         public Builder setRandomRecoverTime(int value) {
            this.bitField0_ |= 16;
            this.randomRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRandomRecoverTime() {
            this.bitField0_ &= -17;
            this.randomRecoverTime_ = 0;
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

   public static final class C2S_TreasureMove_13455 extends GeneratedMessageV3 implements C2S_TreasureMove_13455OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMove_13455 DEFAULT_INSTANCE = new C2S_TreasureMove_13455();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMove_13455> PARSER = new AbstractParser<C2S_TreasureMove_13455>() {
         public C2S_TreasureMove_13455 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMove_13455(input, extensionRegistry);
         }
      };

      private C2S_TreasureMove_13455(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMove_13455() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMove_13455();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMove_13455(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_13455.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMove_13455)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMove_13455 other = (C2S_TreasureMove_13455)obj;
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

      public static C2S_TreasureMove_13455 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_13455 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_13455 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_13455 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_13455 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_13455 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_13455)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_13455 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_13455 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_13455 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_13455 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_13455 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_13455 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_13455)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMove_13455 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMove_13455 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMove_13455> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMove_13455> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMove_13455 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMove_13455OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_13455.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_TreasureMove_13455.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureMove_13455_descriptor;
         }

         public C2S_TreasureMove_13455 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_TreasureMove_13455.getDefaultInstance();
         }

         public C2S_TreasureMove_13455 build() {
            C2S_TreasureMove_13455 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMove_13455 buildPartial() {
            C2S_TreasureMove_13455 result = new C2S_TreasureMove_13455(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMove_13455) {
               return this.mergeFrom((C2S_TreasureMove_13455)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMove_13455 other) {
            if (other == ArtifactActivityMsg.C2S_TreasureMove_13455.getDefaultInstance()) {
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
            C2S_TreasureMove_13455 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMove_13455)ArtifactActivityMsg.C2S_TreasureMove_13455.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMove_13455)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMove_13456 extends GeneratedMessageV3 implements S2C_TreasureMove_13456OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLE_FIELD_NUMBER = 1;
      private int battle_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureMove_13456 DEFAULT_INSTANCE = new S2C_TreasureMove_13456();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMove_13456> PARSER = new AbstractParser<S2C_TreasureMove_13456>() {
         public S2C_TreasureMove_13456 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMove_13456(input, extensionRegistry);
         }
      };

      private S2C_TreasureMove_13456(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMove_13456() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMove_13456();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMove_13456(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battle_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_13456.class, Builder.class);
      }

      public boolean hasBattle() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattle() {
         return this.battle_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battle_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battle_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureMove_13456)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMove_13456 other = (S2C_TreasureMove_13456)obj;
            if (this.hasBattle() != other.hasBattle()) {
               return false;
            } else if (this.hasBattle() && this.getBattle() != other.getBattle()) {
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
            if (this.hasBattle()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattle();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureMove_13456 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_13456 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_13456 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_13456 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_13456 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_13456 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_13456)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_13456 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_13456 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_13456 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_13456 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_13456 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_13456 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_13456)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMove_13456 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMove_13456 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMove_13456> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMove_13456> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMove_13456 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMove_13456OrBuilder {
         private int bitField0_;
         private int battle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_13456.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_TreasureMove_13456.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battle_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureMove_13456_descriptor;
         }

         public S2C_TreasureMove_13456 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_TreasureMove_13456.getDefaultInstance();
         }

         public S2C_TreasureMove_13456 build() {
            S2C_TreasureMove_13456 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMove_13456 buildPartial() {
            S2C_TreasureMove_13456 result = new S2C_TreasureMove_13456(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battle_ = this.battle_;
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
            if (other instanceof S2C_TreasureMove_13456) {
               return this.mergeFrom((S2C_TreasureMove_13456)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMove_13456 other) {
            if (other == ArtifactActivityMsg.S2C_TreasureMove_13456.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattle()) {
                  this.setBattle(other.getBattle());
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
            S2C_TreasureMove_13456 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMove_13456)ArtifactActivityMsg.S2C_TreasureMove_13456.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMove_13456)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattle() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattle() {
            return this.battle_;
         }

         public Builder setBattle(int value) {
            this.bitField0_ |= 1;
            this.battle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattle() {
            this.bitField0_ &= -2;
            this.battle_ = 0;
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

   public static final class C2S_LineMain_13457 extends GeneratedMessageV3 implements C2S_LineMain_13457OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LineMain_13457 DEFAULT_INSTANCE = new C2S_LineMain_13457();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineMain_13457> PARSER = new AbstractParser<C2S_LineMain_13457>() {
         public C2S_LineMain_13457 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineMain_13457(input, extensionRegistry);
         }
      };

      private C2S_LineMain_13457(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineMain_13457() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineMain_13457();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineMain_13457(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_13457.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineMain_13457)) {
            return super.equals(obj);
         } else {
            C2S_LineMain_13457 other = (C2S_LineMain_13457)obj;
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

      public static C2S_LineMain_13457 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_13457 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_13457 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_13457 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_13457 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_13457 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_13457)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_13457 parseFrom(InputStream input) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_13457 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_13457 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineMain_13457 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_13457 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_13457 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_13457)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineMain_13457 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineMain_13457 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineMain_13457> parser() {
         return PARSER;
      }

      public Parser<C2S_LineMain_13457> getParserForType() {
         return PARSER;
      }

      public C2S_LineMain_13457 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineMain_13457OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_13457.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LineMain_13457.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineMain_13457_descriptor;
         }

         public C2S_LineMain_13457 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LineMain_13457.getDefaultInstance();
         }

         public C2S_LineMain_13457 build() {
            C2S_LineMain_13457 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineMain_13457 buildPartial() {
            C2S_LineMain_13457 result = new C2S_LineMain_13457(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LineMain_13457) {
               return this.mergeFrom((C2S_LineMain_13457)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineMain_13457 other) {
            if (other == ArtifactActivityMsg.C2S_LineMain_13457.getDefaultInstance()) {
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
            C2S_LineMain_13457 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineMain_13457)ArtifactActivityMsg.C2S_LineMain_13457.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineMain_13457)e.getUnfinishedMessage();
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

   public static final class S2C_LineMain_13458 extends GeneratedMessageV3 implements S2C_LineMain_13458OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRIDTASK_FIELD_NUMBER = 1;
      private List<GridTaskData> gridTask_;
      public static final int LINEBOXCOUNT_FIELD_NUMBER = 2;
      private int lineBoxCount_;
      public static final int GOTLINEBOX_FIELD_NUMBER = 3;
      private Internal.IntList gotLineBox_;
      public static final int GOTFINALBOX_FIELD_NUMBER = 4;
      private Internal.IntList gotFinalBox_;
      private byte memoizedIsInitialized;
      private static final S2C_LineMain_13458 DEFAULT_INSTANCE = new S2C_LineMain_13458();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineMain_13458> PARSER = new AbstractParser<S2C_LineMain_13458>() {
         public S2C_LineMain_13458 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineMain_13458(input, extensionRegistry);
         }
      };

      private S2C_LineMain_13458(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineMain_13458() {
         this.memoizedIsInitialized = -1;
         this.gridTask_ = Collections.emptyList();
         this.gotLineBox_ = emptyIntList();
         this.gotFinalBox_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineMain_13458();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineMain_13458(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.gridTask_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gridTask_.add(input.readMessage(ArtifactActivityMsg.GridTaskData.PARSER, extensionRegistry));
                        continue;
                     case 16:
                        this.bitField0_ |= 1;
                        this.lineBoxCount_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotLineBox_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotLineBox_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotLineBox_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.gotFinalBox_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.gotFinalBox_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotFinalBox_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotFinalBox_.addInt(input.readInt32());
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
                     this.gotLineBox_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.gridTask_ = Collections.unmodifiableList(this.gridTask_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.gotLineBox_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.gotFinalBox_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_13458.class, Builder.class);
      }

      public List<GridTaskData> getGridTaskList() {
         return this.gridTask_;
      }

      public List<? extends GridTaskDataOrBuilder> getGridTaskOrBuilderList() {
         return this.gridTask_;
      }

      public int getGridTaskCount() {
         return this.gridTask_.size();
      }

      public GridTaskData getGridTask(int index) {
         return (GridTaskData)this.gridTask_.get(index);
      }

      public GridTaskDataOrBuilder getGridTaskOrBuilder(int index) {
         return (GridTaskDataOrBuilder)this.gridTask_.get(index);
      }

      public boolean hasLineBoxCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLineBoxCount() {
         return this.lineBoxCount_;
      }

      public List<Integer> getGotLineBoxList() {
         return this.gotLineBox_;
      }

      public int getGotLineBoxCount() {
         return this.gotLineBox_.size();
      }

      public int getGotLineBox(int index) {
         return this.gotLineBox_.getInt(index);
      }

      public List<Integer> getGotFinalBoxList() {
         return this.gotFinalBox_;
      }

      public int getGotFinalBoxCount() {
         return this.gotFinalBox_.size();
      }

      public int getGotFinalBox(int index) {
         return this.gotFinalBox_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLineBoxCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGridTaskCount(); ++i) {
               if (!this.getGridTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.gridTask_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.gridTask_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.lineBoxCount_);
         }

         for(int i = 0; i < this.gotLineBox_.size(); ++i) {
            output.writeInt32(3, this.gotLineBox_.getInt(i));
         }

         for(int i = 0; i < this.gotFinalBox_.size(); ++i) {
            output.writeInt32(4, this.gotFinalBox_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.gridTask_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.gridTask_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.lineBoxCount_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotLineBox_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotLineBox_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotLineBoxList().size();
            dataSize = 0;

            for(int i = 0; i < this.gotFinalBox_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotFinalBox_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotFinalBoxList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LineMain_13458)) {
            return super.equals(obj);
         } else {
            S2C_LineMain_13458 other = (S2C_LineMain_13458)obj;
            if (!this.getGridTaskList().equals(other.getGridTaskList())) {
               return false;
            } else if (this.hasLineBoxCount() != other.hasLineBoxCount()) {
               return false;
            } else if (this.hasLineBoxCount() && this.getLineBoxCount() != other.getLineBoxCount()) {
               return false;
            } else if (!this.getGotLineBoxList().equals(other.getGotLineBoxList())) {
               return false;
            } else if (!this.getGotFinalBoxList().equals(other.getGotFinalBoxList())) {
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
            if (this.getGridTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridTaskList().hashCode();
            }

            if (this.hasLineBoxCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLineBoxCount();
            }

            if (this.getGotLineBoxCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotLineBoxList().hashCode();
            }

            if (this.getGotFinalBoxCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotFinalBoxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LineMain_13458 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_13458 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_13458 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_13458 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_13458 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_13458 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_13458)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_13458 parseFrom(InputStream input) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_13458 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_13458 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineMain_13458 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_13458 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_13458 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_13458)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineMain_13458 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineMain_13458 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineMain_13458> parser() {
         return PARSER;
      }

      public Parser<S2C_LineMain_13458> getParserForType() {
         return PARSER;
      }

      public S2C_LineMain_13458 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineMain_13458OrBuilder {
         private int bitField0_;
         private List<GridTaskData> gridTask_;
         private RepeatedFieldBuilderV3<GridTaskData, GridTaskData.Builder, GridTaskDataOrBuilder> gridTaskBuilder_;
         private int lineBoxCount_;
         private Internal.IntList gotLineBox_;
         private Internal.IntList gotFinalBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_13458.class, Builder.class);
         }

         private Builder() {
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.gotFinalBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.gotFinalBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LineMain_13458.alwaysUseFieldBuilders) {
               this.getGridTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.gridTaskBuilder_ == null) {
               this.gridTask_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.gridTaskBuilder_.clear();
            }

            this.lineBoxCount_ = 0;
            this.bitField0_ &= -3;
            this.gotLineBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.bitField0_ &= -5;
            this.gotFinalBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineMain_13458_descriptor;
         }

         public S2C_LineMain_13458 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LineMain_13458.getDefaultInstance();
         }

         public S2C_LineMain_13458 build() {
            S2C_LineMain_13458 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineMain_13458 buildPartial() {
            S2C_LineMain_13458 result = new S2C_LineMain_13458(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.gridTaskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.gridTask_ = Collections.unmodifiableList(this.gridTask_);
                  this.bitField0_ &= -2;
               }

               result.gridTask_ = this.gridTask_;
            } else {
               result.gridTask_ = this.gridTaskBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lineBoxCount_ = this.lineBoxCount_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotLineBox_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotLineBox_ = this.gotLineBox_;
            if ((this.bitField0_ & 8) != 0) {
               this.gotFinalBox_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.gotFinalBox_ = this.gotFinalBox_;
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
            if (other instanceof S2C_LineMain_13458) {
               return this.mergeFrom((S2C_LineMain_13458)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineMain_13458 other) {
            if (other == ArtifactActivityMsg.S2C_LineMain_13458.getDefaultInstance()) {
               return this;
            } else {
               if (this.gridTaskBuilder_ == null) {
                  if (!other.gridTask_.isEmpty()) {
                     if (this.gridTask_.isEmpty()) {
                        this.gridTask_ = other.gridTask_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGridTaskIsMutable();
                        this.gridTask_.addAll(other.gridTask_);
                     }

                     this.onChanged();
                  }
               } else if (!other.gridTask_.isEmpty()) {
                  if (this.gridTaskBuilder_.isEmpty()) {
                     this.gridTaskBuilder_.dispose();
                     this.gridTaskBuilder_ = null;
                     this.gridTask_ = other.gridTask_;
                     this.bitField0_ &= -2;
                     this.gridTaskBuilder_ = ArtifactActivityMsg.S2C_LineMain_13458.alwaysUseFieldBuilders ? this.getGridTaskFieldBuilder() : null;
                  } else {
                     this.gridTaskBuilder_.addAllMessages(other.gridTask_);
                  }
               }

               if (other.hasLineBoxCount()) {
                  this.setLineBoxCount(other.getLineBoxCount());
               }

               if (!other.gotLineBox_.isEmpty()) {
                  if (this.gotLineBox_.isEmpty()) {
                     this.gotLineBox_ = other.gotLineBox_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotLineBoxIsMutable();
                     this.gotLineBox_.addAll(other.gotLineBox_);
                  }

                  this.onChanged();
               }

               if (!other.gotFinalBox_.isEmpty()) {
                  if (this.gotFinalBox_.isEmpty()) {
                     this.gotFinalBox_ = other.gotFinalBox_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureGotFinalBoxIsMutable();
                     this.gotFinalBox_.addAll(other.gotFinalBox_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLineBoxCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getGridTaskCount(); ++i) {
                  if (!this.getGridTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LineMain_13458 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineMain_13458)ArtifactActivityMsg.S2C_LineMain_13458.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineMain_13458)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGridTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gridTask_ = new ArrayList(this.gridTask_);
               this.bitField0_ |= 1;
            }

         }

         public List<GridTaskData> getGridTaskList() {
            return this.gridTaskBuilder_ == null ? Collections.unmodifiableList(this.gridTask_) : this.gridTaskBuilder_.getMessageList();
         }

         public int getGridTaskCount() {
            return this.gridTaskBuilder_ == null ? this.gridTask_.size() : this.gridTaskBuilder_.getCount();
         }

         public GridTaskData getGridTask(int index) {
            return this.gridTaskBuilder_ == null ? (GridTaskData)this.gridTask_.get(index) : (GridTaskData)this.gridTaskBuilder_.getMessage(index);
         }

         public Builder setGridTask(int index, GridTaskData value) {
            if (this.gridTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridTaskIsMutable();
               this.gridTask_.set(index, value);
               this.onChanged();
            } else {
               this.gridTaskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGridTask(int index, GridTaskData.Builder builderForValue) {
            if (this.gridTaskBuilder_ == null) {
               this.ensureGridTaskIsMutable();
               this.gridTask_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridTaskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGridTask(GridTaskData value) {
            if (this.gridTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridTaskIsMutable();
               this.gridTask_.add(value);
               this.onChanged();
            } else {
               this.gridTaskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGridTask(int index, GridTaskData value) {
            if (this.gridTaskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridTaskIsMutable();
               this.gridTask_.add(index, value);
               this.onChanged();
            } else {
               this.gridTaskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGridTask(GridTaskData.Builder builderForValue) {
            if (this.gridTaskBuilder_ == null) {
               this.ensureGridTaskIsMutable();
               this.gridTask_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gridTaskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGridTask(int index, GridTaskData.Builder builderForValue) {
            if (this.gridTaskBuilder_ == null) {
               this.ensureGridTaskIsMutable();
               this.gridTask_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridTaskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGridTask(Iterable<? extends GridTaskData> values) {
            if (this.gridTaskBuilder_ == null) {
               this.ensureGridTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gridTask_);
               this.onChanged();
            } else {
               this.gridTaskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGridTask() {
            if (this.gridTaskBuilder_ == null) {
               this.gridTask_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.gridTaskBuilder_.clear();
            }

            return this;
         }

         public Builder removeGridTask(int index) {
            if (this.gridTaskBuilder_ == null) {
               this.ensureGridTaskIsMutable();
               this.gridTask_.remove(index);
               this.onChanged();
            } else {
               this.gridTaskBuilder_.remove(index);
            }

            return this;
         }

         public GridTaskData.Builder getGridTaskBuilder(int index) {
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().getBuilder(index);
         }

         public GridTaskDataOrBuilder getGridTaskOrBuilder(int index) {
            return this.gridTaskBuilder_ == null ? (GridTaskDataOrBuilder)this.gridTask_.get(index) : (GridTaskDataOrBuilder)this.gridTaskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GridTaskDataOrBuilder> getGridTaskOrBuilderList() {
            return this.gridTaskBuilder_ != null ? this.gridTaskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gridTask_);
         }

         public GridTaskData.Builder addGridTaskBuilder() {
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(ArtifactActivityMsg.GridTaskData.getDefaultInstance());
         }

         public GridTaskData.Builder addGridTaskBuilder(int index) {
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(index, ArtifactActivityMsg.GridTaskData.getDefaultInstance());
         }

         public List<GridTaskData.Builder> getGridTaskBuilderList() {
            return this.getGridTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GridTaskData, GridTaskData.Builder, GridTaskDataOrBuilder> getGridTaskFieldBuilder() {
            if (this.gridTaskBuilder_ == null) {
               this.gridTaskBuilder_ = new RepeatedFieldBuilderV3(this.gridTask_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.gridTask_ = null;
            }

            return this.gridTaskBuilder_;
         }

         public boolean hasLineBoxCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLineBoxCount() {
            return this.lineBoxCount_;
         }

         public Builder setLineBoxCount(int value) {
            this.bitField0_ |= 2;
            this.lineBoxCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLineBoxCount() {
            this.bitField0_ &= -3;
            this.lineBoxCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotLineBoxIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotLineBox_ = ArtifactActivityMsg.S2C_LineMain_13458.mutableCopy(this.gotLineBox_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotLineBoxList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotLineBox_) : this.gotLineBox_);
         }

         public int getGotLineBoxCount() {
            return this.gotLineBox_.size();
         }

         public int getGotLineBox(int index) {
            return this.gotLineBox_.getInt(index);
         }

         public Builder setGotLineBox(int index, int value) {
            this.ensureGotLineBoxIsMutable();
            this.gotLineBox_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotLineBox(int value) {
            this.ensureGotLineBoxIsMutable();
            this.gotLineBox_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotLineBox(Iterable<? extends Integer> values) {
            this.ensureGotLineBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotLineBox_);
            this.onChanged();
            return this;
         }

         public Builder clearGotLineBox() {
            this.gotLineBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureGotFinalBoxIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotFinalBox_ = ArtifactActivityMsg.S2C_LineMain_13458.mutableCopy(this.gotFinalBox_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getGotFinalBoxList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.gotFinalBox_) : this.gotFinalBox_);
         }

         public int getGotFinalBoxCount() {
            return this.gotFinalBox_.size();
         }

         public int getGotFinalBox(int index) {
            return this.gotFinalBox_.getInt(index);
         }

         public Builder setGotFinalBox(int index, int value) {
            this.ensureGotFinalBoxIsMutable();
            this.gotFinalBox_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotFinalBox(int value) {
            this.ensureGotFinalBoxIsMutable();
            this.gotFinalBox_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotFinalBox(Iterable<? extends Integer> values) {
            this.ensureGotFinalBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotFinalBox_);
            this.onChanged();
            return this;
         }

         public Builder clearGotFinalBox() {
            this.gotFinalBox_ = ArtifactActivityMsg.S2C_LineMain_13458.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class C2S_LineBoxReward_13459 extends GeneratedMessageV3 implements C2S_LineBoxReward_13459OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_LineBoxReward_13459 DEFAULT_INSTANCE = new C2S_LineBoxReward_13459();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineBoxReward_13459> PARSER = new AbstractParser<C2S_LineBoxReward_13459>() {
         public C2S_LineBoxReward_13459 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineBoxReward_13459(input, extensionRegistry);
         }
      };

      private C2S_LineBoxReward_13459(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineBoxReward_13459() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineBoxReward_13459();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineBoxReward_13459(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.box_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_13459.class, Builder.class);
      }

      public boolean hasBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LineBoxReward_13459)) {
            return super.equals(obj);
         } else {
            C2S_LineBoxReward_13459 other = (C2S_LineBoxReward_13459)obj;
            if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LineBoxReward_13459 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_13459 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_13459 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_13459 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_13459 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_13459 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_13459)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_13459 parseFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_13459 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_13459 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_13459 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_13459 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_13459 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_13459)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineBoxReward_13459 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineBoxReward_13459 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineBoxReward_13459> parser() {
         return PARSER;
      }

      public Parser<C2S_LineBoxReward_13459> getParserForType() {
         return PARSER;
      }

      public C2S_LineBoxReward_13459 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineBoxReward_13459OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_13459.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LineBoxReward_13459.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineBoxReward_13459_descriptor;
         }

         public C2S_LineBoxReward_13459 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LineBoxReward_13459.getDefaultInstance();
         }

         public C2S_LineBoxReward_13459 build() {
            C2S_LineBoxReward_13459 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineBoxReward_13459 buildPartial() {
            C2S_LineBoxReward_13459 result = new C2S_LineBoxReward_13459(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof C2S_LineBoxReward_13459) {
               return this.mergeFrom((C2S_LineBoxReward_13459)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineBoxReward_13459 other) {
            if (other == ArtifactActivityMsg.C2S_LineBoxReward_13459.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBox();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LineBoxReward_13459 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineBoxReward_13459)ArtifactActivityMsg.C2S_LineBoxReward_13459.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineBoxReward_13459)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 1;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -2;
            this.box_ = 0;
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

   public static final class S2C_LineBoxReward_13460 extends GeneratedMessageV3 implements S2C_LineBoxReward_13460OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_LineBoxReward_13460 DEFAULT_INSTANCE = new S2C_LineBoxReward_13460();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineBoxReward_13460> PARSER = new AbstractParser<S2C_LineBoxReward_13460>() {
         public S2C_LineBoxReward_13460 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineBoxReward_13460(input, extensionRegistry);
         }
      };

      private S2C_LineBoxReward_13460(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineBoxReward_13460() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineBoxReward_13460();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineBoxReward_13460(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.box_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_13460.class, Builder.class);
      }

      public boolean hasBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LineBoxReward_13460)) {
            return super.equals(obj);
         } else {
            S2C_LineBoxReward_13460 other = (S2C_LineBoxReward_13460)obj;
            if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LineBoxReward_13460 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_13460 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_13460 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_13460 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_13460 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_13460 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_13460)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_13460 parseFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_13460 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_13460 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_13460 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_13460 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_13460 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_13460)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineBoxReward_13460 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineBoxReward_13460 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineBoxReward_13460> parser() {
         return PARSER;
      }

      public Parser<S2C_LineBoxReward_13460> getParserForType() {
         return PARSER;
      }

      public S2C_LineBoxReward_13460 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineBoxReward_13460OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_13460.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LineBoxReward_13460.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineBoxReward_13460_descriptor;
         }

         public S2C_LineBoxReward_13460 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LineBoxReward_13460.getDefaultInstance();
         }

         public S2C_LineBoxReward_13460 build() {
            S2C_LineBoxReward_13460 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineBoxReward_13460 buildPartial() {
            S2C_LineBoxReward_13460 result = new S2C_LineBoxReward_13460(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof S2C_LineBoxReward_13460) {
               return this.mergeFrom((S2C_LineBoxReward_13460)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineBoxReward_13460 other) {
            if (other == ArtifactActivityMsg.S2C_LineBoxReward_13460.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBox();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LineBoxReward_13460 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineBoxReward_13460)ArtifactActivityMsg.S2C_LineBoxReward_13460.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineBoxReward_13460)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 1;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -2;
            this.box_ = 0;
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

   public static final class S2C_LineTaskNotify_13462 extends GeneratedMessageV3 implements S2C_LineTaskNotify_13462OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskNotify_13462 DEFAULT_INSTANCE = new S2C_LineTaskNotify_13462();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskNotify_13462> PARSER = new AbstractParser<S2C_LineTaskNotify_13462>() {
         public S2C_LineTaskNotify_13462 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskNotify_13462(input, extensionRegistry);
         }
      };

      private S2C_LineTaskNotify_13462(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskNotify_13462() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskNotify_13462();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskNotify_13462(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_13462.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineTaskNotify_13462)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskNotify_13462 other = (S2C_LineTaskNotify_13462)obj;
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

      public static S2C_LineTaskNotify_13462 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_13462)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_13462 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_13462 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_13462 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_13462)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskNotify_13462 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskNotify_13462 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskNotify_13462> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskNotify_13462> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskNotify_13462 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskNotify_13462OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_13462.class, Builder.class);
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
            if (ArtifactActivityMsg.S2C_LineTaskNotify_13462.alwaysUseFieldBuilders) {
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
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskNotify_13462_descriptor;
         }

         public S2C_LineTaskNotify_13462 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LineTaskNotify_13462.getDefaultInstance();
         }

         public S2C_LineTaskNotify_13462 build() {
            S2C_LineTaskNotify_13462 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskNotify_13462 buildPartial() {
            S2C_LineTaskNotify_13462 result = new S2C_LineTaskNotify_13462(this);
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
            if (other instanceof S2C_LineTaskNotify_13462) {
               return this.mergeFrom((S2C_LineTaskNotify_13462)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskNotify_13462 other) {
            if (other == ArtifactActivityMsg.S2C_LineTaskNotify_13462.getDefaultInstance()) {
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
                     this.taskBuilder_ = ArtifactActivityMsg.S2C_LineTaskNotify_13462.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_LineTaskNotify_13462 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskNotify_13462)ArtifactActivityMsg.S2C_LineTaskNotify_13462.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskNotify_13462)e.getUnfinishedMessage();
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

   public static final class C2S_LineTaskReward_13463 extends GeneratedMessageV3 implements C2S_LineTaskReward_13463OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final C2S_LineTaskReward_13463 DEFAULT_INSTANCE = new C2S_LineTaskReward_13463();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineTaskReward_13463> PARSER = new AbstractParser<C2S_LineTaskReward_13463>() {
         public C2S_LineTaskReward_13463 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineTaskReward_13463(input, extensionRegistry);
         }
      };

      private C2S_LineTaskReward_13463(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineTaskReward_13463() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineTaskReward_13463();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineTaskReward_13463(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.task_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_13463.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTask() {
         return this.task_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.task_);
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
               size += CodedOutputStream.computeInt32Size(1, this.task_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LineTaskReward_13463)) {
            return super.equals(obj);
         } else {
            C2S_LineTaskReward_13463 other = (C2S_LineTaskReward_13463)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && this.getTask() != other.getTask()) {
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
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LineTaskReward_13463 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_13463 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_13463 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_13463 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_13463 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_13463 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_13463)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_13463 parseFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_13463 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_13463 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_13463 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_13463 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_13463 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_13463)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineTaskReward_13463 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineTaskReward_13463 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineTaskReward_13463> parser() {
         return PARSER;
      }

      public Parser<C2S_LineTaskReward_13463> getParserForType() {
         return PARSER;
      }

      public C2S_LineTaskReward_13463 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineTaskReward_13463OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_13463.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_LineTaskReward_13463.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_LineTaskReward_13463_descriptor;
         }

         public C2S_LineTaskReward_13463 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_LineTaskReward_13463.getDefaultInstance();
         }

         public C2S_LineTaskReward_13463 build() {
            C2S_LineTaskReward_13463 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineTaskReward_13463 buildPartial() {
            C2S_LineTaskReward_13463 result = new C2S_LineTaskReward_13463(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.task_ = this.task_;
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
            if (other instanceof C2S_LineTaskReward_13463) {
               return this.mergeFrom((C2S_LineTaskReward_13463)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineTaskReward_13463 other) {
            if (other == ArtifactActivityMsg.C2S_LineTaskReward_13463.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.setTask(other.getTask());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTask();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LineTaskReward_13463 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineTaskReward_13463)ArtifactActivityMsg.C2S_LineTaskReward_13463.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineTaskReward_13463)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTask() {
            return this.task_;
         }

         public Builder setTask(int value) {
            this.bitField0_ |= 1;
            this.task_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTask() {
            this.bitField0_ &= -2;
            this.task_ = 0;
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

   public static final class S2C_LineTaskReward_13464 extends GeneratedMessageV3 implements S2C_LineTaskReward_13464OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskReward_13464 DEFAULT_INSTANCE = new S2C_LineTaskReward_13464();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskReward_13464> PARSER = new AbstractParser<S2C_LineTaskReward_13464>() {
         public S2C_LineTaskReward_13464 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskReward_13464(input, extensionRegistry);
         }
      };

      private S2C_LineTaskReward_13464(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskReward_13464() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskReward_13464();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskReward_13464(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.task_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_13464.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTask() {
         return this.task_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.task_);
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
               size += CodedOutputStream.computeInt32Size(1, this.task_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LineTaskReward_13464)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskReward_13464 other = (S2C_LineTaskReward_13464)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && this.getTask() != other.getTask()) {
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
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LineTaskReward_13464 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_13464 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_13464 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_13464 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_13464 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_13464 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_13464)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_13464 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_13464 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_13464 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_13464 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_13464 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_13464 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_13464)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskReward_13464 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskReward_13464 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskReward_13464> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskReward_13464> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskReward_13464 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskReward_13464OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_13464.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_LineTaskReward_13464.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_LineTaskReward_13464_descriptor;
         }

         public S2C_LineTaskReward_13464 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_LineTaskReward_13464.getDefaultInstance();
         }

         public S2C_LineTaskReward_13464 build() {
            S2C_LineTaskReward_13464 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskReward_13464 buildPartial() {
            S2C_LineTaskReward_13464 result = new S2C_LineTaskReward_13464(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.task_ = this.task_;
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
            if (other instanceof S2C_LineTaskReward_13464) {
               return this.mergeFrom((S2C_LineTaskReward_13464)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskReward_13464 other) {
            if (other == ArtifactActivityMsg.S2C_LineTaskReward_13464.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.setTask(other.getTask());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTask();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LineTaskReward_13464 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskReward_13464)ArtifactActivityMsg.S2C_LineTaskReward_13464.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskReward_13464)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTask() {
            return this.task_;
         }

         public Builder setTask(int value) {
            this.bitField0_ |= 1;
            this.task_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTask() {
            this.bitField0_ &= -2;
            this.task_ = 0;
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

   public static final class C2S_FinalBoxReward_13465 extends GeneratedMessageV3 implements C2S_FinalBoxReward_13465OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_FinalBoxReward_13465 DEFAULT_INSTANCE = new C2S_FinalBoxReward_13465();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FinalBoxReward_13465> PARSER = new AbstractParser<C2S_FinalBoxReward_13465>() {
         public C2S_FinalBoxReward_13465 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FinalBoxReward_13465(input, extensionRegistry);
         }
      };

      private C2S_FinalBoxReward_13465(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FinalBoxReward_13465() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FinalBoxReward_13465();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FinalBoxReward_13465(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.box_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_13465.class, Builder.class);
      }

      public boolean hasBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FinalBoxReward_13465)) {
            return super.equals(obj);
         } else {
            C2S_FinalBoxReward_13465 other = (C2S_FinalBoxReward_13465)obj;
            if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FinalBoxReward_13465 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_13465)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_13465 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_13465 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_13465 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_13465)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FinalBoxReward_13465 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FinalBoxReward_13465 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FinalBoxReward_13465> parser() {
         return PARSER;
      }

      public Parser<C2S_FinalBoxReward_13465> getParserForType() {
         return PARSER;
      }

      public C2S_FinalBoxReward_13465 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FinalBoxReward_13465OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_13465.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_FinalBoxReward_13465.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_FinalBoxReward_13465_descriptor;
         }

         public C2S_FinalBoxReward_13465 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_FinalBoxReward_13465.getDefaultInstance();
         }

         public C2S_FinalBoxReward_13465 build() {
            C2S_FinalBoxReward_13465 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FinalBoxReward_13465 buildPartial() {
            C2S_FinalBoxReward_13465 result = new C2S_FinalBoxReward_13465(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof C2S_FinalBoxReward_13465) {
               return this.mergeFrom((C2S_FinalBoxReward_13465)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FinalBoxReward_13465 other) {
            if (other == ArtifactActivityMsg.C2S_FinalBoxReward_13465.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBox();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FinalBoxReward_13465 parsedMessage = null;

            try {
               parsedMessage = (C2S_FinalBoxReward_13465)ArtifactActivityMsg.C2S_FinalBoxReward_13465.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FinalBoxReward_13465)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 1;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -2;
            this.box_ = 0;
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

   public static final class S2C_FinalBoxReward_13466 extends GeneratedMessageV3 implements S2C_FinalBoxReward_13466OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_FinalBoxReward_13466 DEFAULT_INSTANCE = new S2C_FinalBoxReward_13466();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FinalBoxReward_13466> PARSER = new AbstractParser<S2C_FinalBoxReward_13466>() {
         public S2C_FinalBoxReward_13466 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FinalBoxReward_13466(input, extensionRegistry);
         }
      };

      private S2C_FinalBoxReward_13466(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FinalBoxReward_13466() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FinalBoxReward_13466();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FinalBoxReward_13466(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.box_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_13466.class, Builder.class);
      }

      public boolean hasBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBox() {
         return this.box_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBox()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.box_);
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
               size += CodedOutputStream.computeInt32Size(1, this.box_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FinalBoxReward_13466)) {
            return super.equals(obj);
         } else {
            S2C_FinalBoxReward_13466 other = (S2C_FinalBoxReward_13466)obj;
            if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && this.getBox() != other.getBox()) {
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
            if (this.hasBox()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBox();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FinalBoxReward_13466 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_13466)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_13466 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_13466 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_13466 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_13466)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FinalBoxReward_13466 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FinalBoxReward_13466 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FinalBoxReward_13466> parser() {
         return PARSER;
      }

      public Parser<S2C_FinalBoxReward_13466> getParserForType() {
         return PARSER;
      }

      public S2C_FinalBoxReward_13466 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FinalBoxReward_13466OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_13466.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_FinalBoxReward_13466.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_FinalBoxReward_13466_descriptor;
         }

         public S2C_FinalBoxReward_13466 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_FinalBoxReward_13466.getDefaultInstance();
         }

         public S2C_FinalBoxReward_13466 build() {
            S2C_FinalBoxReward_13466 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FinalBoxReward_13466 buildPartial() {
            S2C_FinalBoxReward_13466 result = new S2C_FinalBoxReward_13466(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.box_ = this.box_;
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
            if (other instanceof S2C_FinalBoxReward_13466) {
               return this.mergeFrom((S2C_FinalBoxReward_13466)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FinalBoxReward_13466 other) {
            if (other == ArtifactActivityMsg.S2C_FinalBoxReward_13466.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBox()) {
                  this.setBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBox();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FinalBoxReward_13466 parsedMessage = null;

            try {
               parsedMessage = (S2C_FinalBoxReward_13466)ArtifactActivityMsg.S2C_FinalBoxReward_13466.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FinalBoxReward_13466)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBox() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBox() {
            return this.box_;
         }

         public Builder setBox(int value) {
            this.bitField0_ |= 1;
            this.box_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.bitField0_ &= -2;
            this.box_ = 0;
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

   public static final class C2S_TreasureAddRandom_13467 extends GeneratedMessageV3 implements C2S_TreasureAddRandom_13467OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAddRandom_13467 DEFAULT_INSTANCE = new C2S_TreasureAddRandom_13467();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAddRandom_13467> PARSER = new AbstractParser<C2S_TreasureAddRandom_13467>() {
         public C2S_TreasureAddRandom_13467 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAddRandom_13467(input, extensionRegistry);
         }
      };

      private C2S_TreasureAddRandom_13467(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAddRandom_13467() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAddRandom_13467();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAddRandom_13467(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_13467.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAddRandom_13467)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAddRandom_13467 other = (C2S_TreasureAddRandom_13467)obj;
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

      public static C2S_TreasureAddRandom_13467 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_13467)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_13467 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_13467 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_13467 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_13467)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAddRandom_13467 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAddRandom_13467 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAddRandom_13467> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAddRandom_13467> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAddRandom_13467 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAddRandom_13467OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_13467.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_TreasureAddRandom_13467.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_13467_descriptor;
         }

         public C2S_TreasureAddRandom_13467 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_TreasureAddRandom_13467.getDefaultInstance();
         }

         public C2S_TreasureAddRandom_13467 build() {
            C2S_TreasureAddRandom_13467 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAddRandom_13467 buildPartial() {
            C2S_TreasureAddRandom_13467 result = new C2S_TreasureAddRandom_13467(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAddRandom_13467) {
               return this.mergeFrom((C2S_TreasureAddRandom_13467)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAddRandom_13467 other) {
            if (other == ArtifactActivityMsg.C2S_TreasureAddRandom_13467.getDefaultInstance()) {
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
            C2S_TreasureAddRandom_13467 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAddRandom_13467)ArtifactActivityMsg.C2S_TreasureAddRandom_13467.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAddRandom_13467)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAddRandom_13468 extends GeneratedMessageV3 implements S2C_TreasureAddRandom_13468OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANDOMCOUNT_FIELD_NUMBER = 1;
      private int randomCount_;
      public static final int RANDOMRECOVERTIME_FIELD_NUMBER = 2;
      private int randomRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAddRandom_13468 DEFAULT_INSTANCE = new S2C_TreasureAddRandom_13468();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAddRandom_13468> PARSER = new AbstractParser<S2C_TreasureAddRandom_13468>() {
         public S2C_TreasureAddRandom_13468 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAddRandom_13468(input, extensionRegistry);
         }
      };

      private S2C_TreasureAddRandom_13468(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAddRandom_13468() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAddRandom_13468();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAddRandom_13468(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.randomCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.randomRecoverTime_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_13468.class, Builder.class);
      }

      public boolean hasRandomCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRandomCount() {
         return this.randomCount_;
      }

      public boolean hasRandomRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRandomRecoverTime() {
         return this.randomRecoverTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRandomCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRandomRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.randomCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.randomRecoverTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.randomCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.randomRecoverTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureAddRandom_13468)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAddRandom_13468 other = (S2C_TreasureAddRandom_13468)obj;
            if (this.hasRandomCount() != other.hasRandomCount()) {
               return false;
            } else if (this.hasRandomCount() && this.getRandomCount() != other.getRandomCount()) {
               return false;
            } else if (this.hasRandomRecoverTime() != other.hasRandomRecoverTime()) {
               return false;
            } else if (this.hasRandomRecoverTime() && this.getRandomRecoverTime() != other.getRandomRecoverTime()) {
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
            if (this.hasRandomCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRandomCount();
            }

            if (this.hasRandomRecoverTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRandomRecoverTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_13468)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_13468 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_13468 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_13468 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_13468)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAddRandom_13468 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAddRandom_13468 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAddRandom_13468> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAddRandom_13468> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAddRandom_13468 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAddRandom_13468OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_13468.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_TreasureAddRandom_13468.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.randomCount_ = 0;
            this.bitField0_ &= -2;
            this.randomRecoverTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_13468_descriptor;
         }

         public S2C_TreasureAddRandom_13468 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_TreasureAddRandom_13468.getDefaultInstance();
         }

         public S2C_TreasureAddRandom_13468 build() {
            S2C_TreasureAddRandom_13468 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAddRandom_13468 buildPartial() {
            S2C_TreasureAddRandom_13468 result = new S2C_TreasureAddRandom_13468(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.randomCount_ = this.randomCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.randomRecoverTime_ = this.randomRecoverTime_;
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
            if (other instanceof S2C_TreasureAddRandom_13468) {
               return this.mergeFrom((S2C_TreasureAddRandom_13468)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAddRandom_13468 other) {
            if (other == ArtifactActivityMsg.S2C_TreasureAddRandom_13468.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRandomCount()) {
                  this.setRandomCount(other.getRandomCount());
               }

               if (other.hasRandomRecoverTime()) {
                  this.setRandomRecoverTime(other.getRandomRecoverTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRandomCount()) {
               return false;
            } else {
               return this.hasRandomRecoverTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureAddRandom_13468 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAddRandom_13468)ArtifactActivityMsg.S2C_TreasureAddRandom_13468.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAddRandom_13468)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRandomCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRandomCount() {
            return this.randomCount_;
         }

         public Builder setRandomCount(int value) {
            this.bitField0_ |= 1;
            this.randomCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRandomCount() {
            this.bitField0_ &= -2;
            this.randomCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRandomRecoverTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRandomRecoverTime() {
            return this.randomRecoverTime_;
         }

         public Builder setRandomRecoverTime(int value) {
            this.bitField0_ |= 2;
            this.randomRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRandomRecoverTime() {
            this.bitField0_ &= -3;
            this.randomRecoverTime_ = 0;
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

   public static final class C2S_TreasureAppointBuy_13469 extends GeneratedMessageV3 implements C2S_TreasureAppointBuy_13469OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAppointBuy_13469 DEFAULT_INSTANCE = new C2S_TreasureAppointBuy_13469();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAppointBuy_13469> PARSER = new AbstractParser<C2S_TreasureAppointBuy_13469>() {
         public C2S_TreasureAppointBuy_13469 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAppointBuy_13469(input, extensionRegistry);
         }
      };

      private C2S_TreasureAppointBuy_13469(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAppointBuy_13469() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAppointBuy_13469();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAppointBuy_13469(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_13469.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAppointBuy_13469)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAppointBuy_13469 other = (C2S_TreasureAppointBuy_13469)obj;
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

      public static C2S_TreasureAppointBuy_13469 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_13469)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_13469 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_13469 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_13469 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_13469)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAppointBuy_13469 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAppointBuy_13469 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAppointBuy_13469> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAppointBuy_13469> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAppointBuy_13469 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAppointBuy_13469OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_13469.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.C2S_TreasureAppointBuy_13469.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_13469_descriptor;
         }

         public C2S_TreasureAppointBuy_13469 getDefaultInstanceForType() {
            return ArtifactActivityMsg.C2S_TreasureAppointBuy_13469.getDefaultInstance();
         }

         public C2S_TreasureAppointBuy_13469 build() {
            C2S_TreasureAppointBuy_13469 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAppointBuy_13469 buildPartial() {
            C2S_TreasureAppointBuy_13469 result = new C2S_TreasureAppointBuy_13469(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAppointBuy_13469) {
               return this.mergeFrom((C2S_TreasureAppointBuy_13469)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAppointBuy_13469 other) {
            if (other == ArtifactActivityMsg.C2S_TreasureAppointBuy_13469.getDefaultInstance()) {
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
            C2S_TreasureAppointBuy_13469 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAppointBuy_13469)ArtifactActivityMsg.C2S_TreasureAppointBuy_13469.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAppointBuy_13469)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAppointBuy_13470 extends GeneratedMessageV3 implements S2C_TreasureAppointBuy_13470OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int APPOINTCOUNT_FIELD_NUMBER = 1;
      private int appointCount_;
      public static final int APPOINTCOUNTBUY_FIELD_NUMBER = 2;
      private int appointCountBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAppointBuy_13470 DEFAULT_INSTANCE = new S2C_TreasureAppointBuy_13470();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAppointBuy_13470> PARSER = new AbstractParser<S2C_TreasureAppointBuy_13470>() {
         public S2C_TreasureAppointBuy_13470 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAppointBuy_13470(input, extensionRegistry);
         }
      };

      private S2C_TreasureAppointBuy_13470(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAppointBuy_13470() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAppointBuy_13470();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAppointBuy_13470(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.appointCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.appointCountBuy_ = input.readInt32();
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
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_13470.class, Builder.class);
      }

      public boolean hasAppointCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAppointCount() {
         return this.appointCount_;
      }

      public boolean hasAppointCountBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAppointCountBuy() {
         return this.appointCountBuy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAppointCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAppointCountBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.appointCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.appointCountBuy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.appointCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.appointCountBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureAppointBuy_13470)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAppointBuy_13470 other = (S2C_TreasureAppointBuy_13470)obj;
            if (this.hasAppointCount() != other.hasAppointCount()) {
               return false;
            } else if (this.hasAppointCount() && this.getAppointCount() != other.getAppointCount()) {
               return false;
            } else if (this.hasAppointCountBuy() != other.hasAppointCountBuy()) {
               return false;
            } else if (this.hasAppointCountBuy() && this.getAppointCountBuy() != other.getAppointCountBuy()) {
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
            if (this.hasAppointCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAppointCount();
            }

            if (this.hasAppointCountBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAppointCountBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_13470)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_13470 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_13470 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_13470 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_13470)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAppointBuy_13470 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAppointBuy_13470 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAppointBuy_13470> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAppointBuy_13470> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAppointBuy_13470 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAppointBuy_13470OrBuilder {
         private int bitField0_;
         private int appointCount_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_13470.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.appointCount_ = 0;
            this.bitField0_ &= -2;
            this.appointCountBuy_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactActivityMsg.internal_static_artifactActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_13470_descriptor;
         }

         public S2C_TreasureAppointBuy_13470 getDefaultInstanceForType() {
            return ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.getDefaultInstance();
         }

         public S2C_TreasureAppointBuy_13470 build() {
            S2C_TreasureAppointBuy_13470 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAppointBuy_13470 buildPartial() {
            S2C_TreasureAppointBuy_13470 result = new S2C_TreasureAppointBuy_13470(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.appointCount_ = this.appointCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.appointCountBuy_ = this.appointCountBuy_;
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
            if (other instanceof S2C_TreasureAppointBuy_13470) {
               return this.mergeFrom((S2C_TreasureAppointBuy_13470)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAppointBuy_13470 other) {
            if (other == ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAppointCount()) {
                  this.setAppointCount(other.getAppointCount());
               }

               if (other.hasAppointCountBuy()) {
                  this.setAppointCountBuy(other.getAppointCountBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAppointCount()) {
               return false;
            } else {
               return this.hasAppointCountBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureAppointBuy_13470 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAppointBuy_13470)ArtifactActivityMsg.S2C_TreasureAppointBuy_13470.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAppointBuy_13470)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAppointCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAppointCount() {
            return this.appointCount_;
         }

         public Builder setAppointCount(int value) {
            this.bitField0_ |= 1;
            this.appointCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAppointCount() {
            this.bitField0_ &= -2;
            this.appointCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAppointCountBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAppointCountBuy() {
            return this.appointCountBuy_;
         }

         public Builder setAppointCountBuy(int value) {
            this.bitField0_ |= 2;
            this.appointCountBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAppointCountBuy() {
            this.bitField0_ &= -3;
            this.appointCountBuy_ = 0;
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

   public interface C2S_ArtifactInfo_13301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FinalBoxReward_13465OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineBoxReward_13459OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineMain_13457OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LineTaskReward_13463OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface C2S_LootEnjoy_13311OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_13305OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReset_13309OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_13307OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenWeaponBox_13303OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface C2S_TreasureAddRandom_13467OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureAppointBuy_13469OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMain_13451OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMove_13455OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureRollDice_13453OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();
   }

   public interface GridTaskDataOrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasTask();

      ActivityMsg.TaskData getTask();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder();
   }

   public interface S2C_ArtifactInfo_13302OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      List<Integer> getWeaponBoxsList();

      int getWeaponBoxsCount();

      int getWeaponBoxs(int index);

      boolean hasToken();

      int getToken();
   }

   public interface S2C_FinalBoxReward_13466OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineBoxReward_13460OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineMain_13458OrBuilder extends MessageOrBuilder {
      List<GridTaskData> getGridTaskList();

      GridTaskData getGridTask(int index);

      int getGridTaskCount();

      List<? extends GridTaskDataOrBuilder> getGridTaskOrBuilderList();

      GridTaskDataOrBuilder getGridTaskOrBuilder(int index);

      boolean hasLineBoxCount();

      int getLineBoxCount();

      List<Integer> getGotLineBoxList();

      int getGotLineBoxCount();

      int getGotLineBox(int index);

      List<Integer> getGotFinalBoxList();

      int getGotFinalBoxCount();

      int getGotFinalBox(int index);
   }

   public interface S2C_LineTaskNotify_13462OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LineTaskReward_13464OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface S2C_LootEnjoy_13312OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_13306OrBuilder extends MessageOrBuilder {
      boolean hasEnjoyId();

      int getEnjoyId();

      boolean hasResetTimes();

      int getResetTimes();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasHadGetEnjoy();

      boolean getHadGetEnjoy();

      List<CommonMsg.MapDataII> getChooseTimesList();

      CommonMsg.MapDataII getChooseTimes(int index);

      int getChooseTimesCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getChooseTimesOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getChooseTimesOrBuilder(int index);

      boolean hasCurLootNum();

      int getCurLootNum();

      boolean hasDailyDrawNum();

      int getDailyDrawNum();
   }

   public interface S2C_LootReward_13308OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasIsEnjoy();

      boolean getIsEnjoy();

      boolean hasCurLootNum();

      int getCurLootNum();
   }

   public interface S2C_OpenWeaponBox_13304OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface S2C_TreasureAddRandom_13468OrBuilder extends MessageOrBuilder {
      boolean hasRandomCount();

      int getRandomCount();

      boolean hasRandomRecoverTime();

      int getRandomRecoverTime();
   }

   public interface S2C_TreasureAppointBuy_13470OrBuilder extends MessageOrBuilder {
      boolean hasAppointCount();

      int getAppointCount();

      boolean hasAppointCountBuy();

      int getAppointCountBuy();
   }

   public interface S2C_TreasureMain_13452OrBuilder extends MessageOrBuilder {
      boolean hasRandomCount();

      int getRandomCount();

      boolean hasRandomRecoverTime();

      int getRandomRecoverTime();

      boolean hasAppointCount();

      int getAppointCount();

      boolean hasGrid();

      int getGrid();

      List<Integer> getGotGridList();

      int getGotGridCount();

      int getGotGrid(int index);

      boolean hasNeedBattle();

      boolean getNeedBattle();

      boolean hasAppointCountBuy();

      int getAppointCountBuy();
   }

   public interface S2C_TreasureMove_13456OrBuilder extends MessageOrBuilder {
      boolean hasBattle();

      int getBattle();
   }

   public interface S2C_TreasureRollDice_13454OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasNum();

      int getNum();

      boolean hasGrid();

      int getGrid();

      boolean hasCount();

      int getCount();

      boolean hasRandomRecoverTime();

      int getRandomRecoverTime();
   }
}
