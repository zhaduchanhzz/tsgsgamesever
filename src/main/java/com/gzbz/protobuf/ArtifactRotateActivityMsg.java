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

public final class ArtifactRotateActivityMsg {
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArtifactRotateActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u001cArtifactRotateActivity.proto\u0012(artifactRotateActivity.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"P\n\fGridTaskData\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u00122\n\u0004task\u0018\u0002 \u0001(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0018\n\u0016C2S_ArtifactInfo_19301\"_\n\u0016S2C_ArtifactInfo_19302\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nweaponBoxs\u0018\u0003 \u0003(\u0005\u0012\r\n\u0005token\u0018\u0004 \u0002(\u0005\"(\n\u0017C2S_OpenWeaponBox_19303\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"(\n\u0017S2C_OpenWeaponBox_19304\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"\u0014\n\u0012C2S_LootInfo_19305\"²\u0001\n\u0012S2C_LootInfo_19306\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nresetTimes\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bhadGetEnjoy\u0018\u0004 \u0002(\b\u0012&\n\u000bchooseTimes\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\ncurLootNum\u0018\u0006 \u0002(\u0005\u0012\u0014\n\fdailyDrawNum\u0018\u0007 \u0002(\u0005\"#\n\u0014C2S_LootReward_19307\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"M\n\u0014S2C_LootReward_19308\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007isEnjoy\u0018\u0002 \u0002(\b\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\"\u0015\n\u0013C2S_LootReset_19309\"!\n\u0013C2S_LootEnjoy_19311\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_19312\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMain_19313\"ª\u0001\n\u0016S2C_TreasureMain_19314\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fappointCount\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007gotGrid\u0018\u0005 \u0003(\u0005\u0012\u0012\n\nneedBattle\u0018\u0006 \u0002(\b\u0012\u0017\n\u000fappointCountBuy\u0018\u0007 \u0002(\u0005\"7\n\u001aC2S_TreasureRollDice_19315\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"o\n\u001aS2C_TreasureRollDice_19316\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0005 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMove_19317\"(\n\u0016S2C_TreasureMove_19318\u0012\u000e\n\u0006battle\u0018\u0001 \u0001(\u0005\"\u0014\n\u0012C2S_LineMain_19319\"\u009d\u0001\n\u0012S2C_LineMain_19320\u0012H\n\bgridTask\u0018\u0001 \u0003(\u000b26.artifactRotateActivity.com.gzbz.protobuf.GridTaskData\u0012\u0014\n\flineBoxCount\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ngotLineBox\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bgotFinalBox\u0018\u0004 \u0003(\u0005\"&\n\u0017C2S_LineBoxReward_19321\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"&\n\u0017S2C_LineBoxReward_19322\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"N\n\u0018S2C_LineTaskNotify_19324\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"(\n\u0018C2S_LineTaskReward_19325\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"(\n\u0018S2C_LineTaskReward_19326\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"'\n\u0018C2S_FinalBoxReward_19327\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"'\n\u0018S2C_FinalBoxReward_19328\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bC2S_TreasureAddRandom_19329\"M\n\u001bS2C_TreasureAddRandom_19330\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_TreasureAppointBuy_19331\"M\n\u001cS2C_TreasureAppointBuy_19332\u0012\u0014\n\fappointCount\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fappointCountBuy\u0018\u0002 \u0002(\u0005B0\n\u0011com.gzbz.protobufB\u0019ArtifactRotateActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor, new String[]{"Grid", "Task"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor, new String[]{"StartTime", "EndTime", "WeaponBoxs", "Token"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor, new String[]{"BoxId"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor, new String[]{"BoxId"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor, new String[]{"EnjoyId", "ResetTimes", "RewardId", "HadGetEnjoy", "ChooseTimes", "CurLootNum", "DailyDrawNum"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor, new String[]{"Num"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor, new String[]{"RewardId", "IsEnjoy", "CurLootNum"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor, new String[]{"Id"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor, new String[]{"Id"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor, new String[]{"RandomCount", "RandomRecoverTime", "AppointCount", "Grid", "GotGrid", "NeedBattle", "AppointCountBuy"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor, new String[]{"Type", "Num"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor, new String[]{"Type", "Num", "Grid", "Count", "RandomRecoverTime"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor, new String[]{"Battle"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor, new String[]{"GridTask", "LineBoxCount", "GotLineBox", "GotFinalBox"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor, new String[]{"Box"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor, new String[]{"Box"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor, new String[]{"Task"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor, new String[]{"Task"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor, new String[]{"Task"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor, new String[]{"Box"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor, new String[]{"Box"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor, new String[]{"RandomCount", "RandomRecoverTime"});
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor, new String[0]);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor, new String[]{"AppointCount", "AppointCountBuy"});
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.GridTaskData.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         public GridTaskData getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.GridTaskData.getDefaultInstance();
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
            if (other == ArtifactRotateActivityMsg.GridTaskData.getDefaultInstance()) {
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
               parsedMessage = (GridTaskData)ArtifactRotateActivityMsg.GridTaskData.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ArtifactInfo_19301 extends GeneratedMessageV3 implements C2S_ArtifactInfo_19301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ArtifactInfo_19301 DEFAULT_INSTANCE = new C2S_ArtifactInfo_19301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ArtifactInfo_19301> PARSER = new AbstractParser<C2S_ArtifactInfo_19301>() {
         public C2S_ArtifactInfo_19301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ArtifactInfo_19301(input, extensionRegistry);
         }
      };

      private C2S_ArtifactInfo_19301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ArtifactInfo_19301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ArtifactInfo_19301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ArtifactInfo_19301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_19301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ArtifactInfo_19301)) {
            return super.equals(obj);
         } else {
            C2S_ArtifactInfo_19301 other = (C2S_ArtifactInfo_19301)obj;
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

      public static C2S_ArtifactInfo_19301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_19301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_19301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_19301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_19301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_19301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ArtifactInfo_19301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ArtifactInfo_19301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ArtifactInfo_19301> parser() {
         return PARSER;
      }

      public Parser<C2S_ArtifactInfo_19301> getParserForType() {
         return PARSER;
      }

      public C2S_ArtifactInfo_19301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ArtifactInfo_19301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_19301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_ArtifactInfo_19301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_ArtifactInfo_19301_descriptor;
         }

         public C2S_ArtifactInfo_19301 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_ArtifactInfo_19301.getDefaultInstance();
         }

         public C2S_ArtifactInfo_19301 build() {
            C2S_ArtifactInfo_19301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ArtifactInfo_19301 buildPartial() {
            C2S_ArtifactInfo_19301 result = new C2S_ArtifactInfo_19301(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ArtifactInfo_19301) {
               return this.mergeFrom((C2S_ArtifactInfo_19301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ArtifactInfo_19301 other) {
            if (other == ArtifactRotateActivityMsg.C2S_ArtifactInfo_19301.getDefaultInstance()) {
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
            C2S_ArtifactInfo_19301 parsedMessage = null;

            try {
               parsedMessage = (C2S_ArtifactInfo_19301)ArtifactRotateActivityMsg.C2S_ArtifactInfo_19301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ArtifactInfo_19301)e.getUnfinishedMessage();
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

   public static final class S2C_ArtifactInfo_19302 extends GeneratedMessageV3 implements S2C_ArtifactInfo_19302OrBuilder {
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
      private static final S2C_ArtifactInfo_19302 DEFAULT_INSTANCE = new S2C_ArtifactInfo_19302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ArtifactInfo_19302> PARSER = new AbstractParser<S2C_ArtifactInfo_19302>() {
         public S2C_ArtifactInfo_19302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ArtifactInfo_19302(input, extensionRegistry);
         }
      };

      private S2C_ArtifactInfo_19302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ArtifactInfo_19302() {
         this.memoizedIsInitialized = -1;
         this.weaponBoxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ArtifactInfo_19302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ArtifactInfo_19302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_19302.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ArtifactInfo_19302)) {
            return super.equals(obj);
         } else {
            S2C_ArtifactInfo_19302 other = (S2C_ArtifactInfo_19302)obj;
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

      public static S2C_ArtifactInfo_19302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_19302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_19302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_19302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_19302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_19302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ArtifactInfo_19302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ArtifactInfo_19302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ArtifactInfo_19302> parser() {
         return PARSER;
      }

      public Parser<S2C_ArtifactInfo_19302> getParserForType() {
         return PARSER;
      }

      public S2C_ArtifactInfo_19302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ArtifactInfo_19302OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private Internal.IntList weaponBoxs_;
         private int token_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_19302.class, Builder.class);
         }

         private Builder() {
            this.weaponBoxs_ = ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.weaponBoxs_ = ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.weaponBoxs_ = ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.emptyIntList();
            this.bitField0_ &= -5;
            this.token_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_ArtifactInfo_19302_descriptor;
         }

         public S2C_ArtifactInfo_19302 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.getDefaultInstance();
         }

         public S2C_ArtifactInfo_19302 build() {
            S2C_ArtifactInfo_19302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ArtifactInfo_19302 buildPartial() {
            S2C_ArtifactInfo_19302 result = new S2C_ArtifactInfo_19302(this);
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
            if (other instanceof S2C_ArtifactInfo_19302) {
               return this.mergeFrom((S2C_ArtifactInfo_19302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ArtifactInfo_19302 other) {
            if (other == ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.getDefaultInstance()) {
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
            S2C_ArtifactInfo_19302 parsedMessage = null;

            try {
               parsedMessage = (S2C_ArtifactInfo_19302)ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ArtifactInfo_19302)e.getUnfinishedMessage();
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
               this.weaponBoxs_ = ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.mutableCopy(this.weaponBoxs_);
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
            this.weaponBoxs_ = ArtifactRotateActivityMsg.S2C_ArtifactInfo_19302.emptyIntList();
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

   public static final class C2S_OpenWeaponBox_19303 extends GeneratedMessageV3 implements C2S_OpenWeaponBox_19303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenWeaponBox_19303 DEFAULT_INSTANCE = new C2S_OpenWeaponBox_19303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenWeaponBox_19303> PARSER = new AbstractParser<C2S_OpenWeaponBox_19303>() {
         public C2S_OpenWeaponBox_19303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenWeaponBox_19303(input, extensionRegistry);
         }
      };

      private C2S_OpenWeaponBox_19303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenWeaponBox_19303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenWeaponBox_19303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenWeaponBox_19303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_19303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenWeaponBox_19303)) {
            return super.equals(obj);
         } else {
            C2S_OpenWeaponBox_19303 other = (C2S_OpenWeaponBox_19303)obj;
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

      public static C2S_OpenWeaponBox_19303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_19303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_19303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_19303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_19303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_19303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenWeaponBox_19303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenWeaponBox_19303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenWeaponBox_19303> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenWeaponBox_19303> getParserForType() {
         return PARSER;
      }

      public C2S_OpenWeaponBox_19303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenWeaponBox_19303OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_19303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_OpenWeaponBox_19303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_19303_descriptor;
         }

         public C2S_OpenWeaponBox_19303 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_OpenWeaponBox_19303.getDefaultInstance();
         }

         public C2S_OpenWeaponBox_19303 build() {
            C2S_OpenWeaponBox_19303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenWeaponBox_19303 buildPartial() {
            C2S_OpenWeaponBox_19303 result = new C2S_OpenWeaponBox_19303(this);
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
            if (other instanceof C2S_OpenWeaponBox_19303) {
               return this.mergeFrom((C2S_OpenWeaponBox_19303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenWeaponBox_19303 other) {
            if (other == ArtifactRotateActivityMsg.C2S_OpenWeaponBox_19303.getDefaultInstance()) {
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
            C2S_OpenWeaponBox_19303 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenWeaponBox_19303)ArtifactRotateActivityMsg.C2S_OpenWeaponBox_19303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenWeaponBox_19303)e.getUnfinishedMessage();
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

   public static final class S2C_OpenWeaponBox_19304 extends GeneratedMessageV3 implements S2C_OpenWeaponBox_19304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenWeaponBox_19304 DEFAULT_INSTANCE = new S2C_OpenWeaponBox_19304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenWeaponBox_19304> PARSER = new AbstractParser<S2C_OpenWeaponBox_19304>() {
         public S2C_OpenWeaponBox_19304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenWeaponBox_19304(input, extensionRegistry);
         }
      };

      private S2C_OpenWeaponBox_19304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenWeaponBox_19304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenWeaponBox_19304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenWeaponBox_19304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_19304.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenWeaponBox_19304)) {
            return super.equals(obj);
         } else {
            S2C_OpenWeaponBox_19304 other = (S2C_OpenWeaponBox_19304)obj;
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

      public static S2C_OpenWeaponBox_19304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_19304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_19304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_19304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_19304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_19304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenWeaponBox_19304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenWeaponBox_19304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenWeaponBox_19304> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenWeaponBox_19304> getParserForType() {
         return PARSER;
      }

      public S2C_OpenWeaponBox_19304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenWeaponBox_19304OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_19304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_OpenWeaponBox_19304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_19304_descriptor;
         }

         public S2C_OpenWeaponBox_19304 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_OpenWeaponBox_19304.getDefaultInstance();
         }

         public S2C_OpenWeaponBox_19304 build() {
            S2C_OpenWeaponBox_19304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenWeaponBox_19304 buildPartial() {
            S2C_OpenWeaponBox_19304 result = new S2C_OpenWeaponBox_19304(this);
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
            if (other instanceof S2C_OpenWeaponBox_19304) {
               return this.mergeFrom((S2C_OpenWeaponBox_19304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenWeaponBox_19304 other) {
            if (other == ArtifactRotateActivityMsg.S2C_OpenWeaponBox_19304.getDefaultInstance()) {
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
            S2C_OpenWeaponBox_19304 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenWeaponBox_19304)ArtifactRotateActivityMsg.S2C_OpenWeaponBox_19304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenWeaponBox_19304)e.getUnfinishedMessage();
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

   public static final class C2S_LootInfo_19305 extends GeneratedMessageV3 implements C2S_LootInfo_19305OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_19305 DEFAULT_INSTANCE = new C2S_LootInfo_19305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_19305> PARSER = new AbstractParser<C2S_LootInfo_19305>() {
         public C2S_LootInfo_19305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_19305(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_19305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_19305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_19305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_19305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_19305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_19305)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_19305 other = (C2S_LootInfo_19305)obj;
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

      public static C2S_LootInfo_19305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_19305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_19305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_19305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_19305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_19305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_19305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_19305 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_19305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_19305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_19305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_19305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_19305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_19305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_19305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_19305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_19305> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_19305> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_19305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_19305OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_19305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LootInfo_19305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootInfo_19305_descriptor;
         }

         public C2S_LootInfo_19305 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LootInfo_19305.getDefaultInstance();
         }

         public C2S_LootInfo_19305 build() {
            C2S_LootInfo_19305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_19305 buildPartial() {
            C2S_LootInfo_19305 result = new C2S_LootInfo_19305(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_19305) {
               return this.mergeFrom((C2S_LootInfo_19305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_19305 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LootInfo_19305.getDefaultInstance()) {
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
            C2S_LootInfo_19305 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_19305)ArtifactRotateActivityMsg.C2S_LootInfo_19305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_19305)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_19306 extends GeneratedMessageV3 implements S2C_LootInfo_19306OrBuilder {
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
      private static final S2C_LootInfo_19306 DEFAULT_INSTANCE = new S2C_LootInfo_19306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_19306> PARSER = new AbstractParser<S2C_LootInfo_19306>() {
         public S2C_LootInfo_19306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_19306(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_19306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_19306() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.chooseTimes_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_19306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_19306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_19306.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootInfo_19306)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_19306 other = (S2C_LootInfo_19306)obj;
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

      public static S2C_LootInfo_19306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_19306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_19306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_19306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_19306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_19306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_19306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_19306 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_19306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_19306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_19306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_19306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_19306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_19306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_19306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_19306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_19306> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_19306> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_19306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_19306OrBuilder {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_19306.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LootInfo_19306.alwaysUseFieldBuilders) {
               this.getChooseTimesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.resetTimes_ = 0;
            this.bitField0_ &= -3;
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.emptyIntList();
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootInfo_19306_descriptor;
         }

         public S2C_LootInfo_19306 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LootInfo_19306.getDefaultInstance();
         }

         public S2C_LootInfo_19306 build() {
            S2C_LootInfo_19306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_19306 buildPartial() {
            S2C_LootInfo_19306 result = new S2C_LootInfo_19306(this);
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
            if (other instanceof S2C_LootInfo_19306) {
               return this.mergeFrom((S2C_LootInfo_19306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_19306 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LootInfo_19306.getDefaultInstance()) {
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
                     this.chooseTimesBuilder_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.alwaysUseFieldBuilders ? this.getChooseTimesFieldBuilder() : null;
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
            S2C_LootInfo_19306 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_19306)ArtifactRotateActivityMsg.S2C_LootInfo_19306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_19306)e.getUnfinishedMessage();
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
               this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootInfo_19306.emptyIntList();
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

   public static final class C2S_LootReward_19307 extends GeneratedMessageV3 implements C2S_LootReward_19307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_19307 DEFAULT_INSTANCE = new C2S_LootReward_19307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_19307> PARSER = new AbstractParser<C2S_LootReward_19307>() {
         public C2S_LootReward_19307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_19307(input, extensionRegistry);
         }
      };

      private C2S_LootReward_19307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_19307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_19307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_19307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_19307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_19307)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_19307 other = (C2S_LootReward_19307)obj;
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

      public static C2S_LootReward_19307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_19307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_19307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_19307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_19307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_19307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_19307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_19307 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_19307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_19307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_19307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_19307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_19307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_19307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_19307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_19307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_19307> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_19307> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_19307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_19307OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_19307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LootReward_19307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReward_19307_descriptor;
         }

         public C2S_LootReward_19307 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LootReward_19307.getDefaultInstance();
         }

         public C2S_LootReward_19307 build() {
            C2S_LootReward_19307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_19307 buildPartial() {
            C2S_LootReward_19307 result = new C2S_LootReward_19307(this);
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
            if (other instanceof C2S_LootReward_19307) {
               return this.mergeFrom((C2S_LootReward_19307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_19307 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LootReward_19307.getDefaultInstance()) {
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
            C2S_LootReward_19307 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_19307)ArtifactRotateActivityMsg.C2S_LootReward_19307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_19307)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_19308 extends GeneratedMessageV3 implements S2C_LootReward_19308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int ISENJOY_FIELD_NUMBER = 2;
      private boolean isEnjoy_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_19308 DEFAULT_INSTANCE = new S2C_LootReward_19308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_19308> PARSER = new AbstractParser<S2C_LootReward_19308>() {
         public S2C_LootReward_19308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_19308(input, extensionRegistry);
         }
      };

      private S2C_LootReward_19308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_19308() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_19308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_19308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_19308.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootReward_19308)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_19308 other = (S2C_LootReward_19308)obj;
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

      public static S2C_LootReward_19308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_19308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_19308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_19308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_19308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_19308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_19308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_19308 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_19308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_19308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_19308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_19308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_19308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_19308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_19308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_19308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_19308> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_19308> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_19308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_19308OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private boolean isEnjoy_;
         private int curLootNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_19308.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootReward_19308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootReward_19308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LootReward_19308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootReward_19308.emptyIntList();
            this.bitField0_ &= -2;
            this.isEnjoy_ = false;
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootReward_19308_descriptor;
         }

         public S2C_LootReward_19308 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LootReward_19308.getDefaultInstance();
         }

         public S2C_LootReward_19308 build() {
            S2C_LootReward_19308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_19308 buildPartial() {
            S2C_LootReward_19308 result = new S2C_LootReward_19308(this);
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
            if (other instanceof S2C_LootReward_19308) {
               return this.mergeFrom((S2C_LootReward_19308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_19308 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LootReward_19308.getDefaultInstance()) {
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
            S2C_LootReward_19308 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_19308)ArtifactRotateActivityMsg.S2C_LootReward_19308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_19308)e.getUnfinishedMessage();
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
               this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootReward_19308.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ArtifactRotateActivityMsg.S2C_LootReward_19308.emptyIntList();
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

   public static final class C2S_LootReset_19309 extends GeneratedMessageV3 implements C2S_LootReset_19309OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootReset_19309 DEFAULT_INSTANCE = new C2S_LootReset_19309();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReset_19309> PARSER = new AbstractParser<C2S_LootReset_19309>() {
         public C2S_LootReset_19309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReset_19309(input, extensionRegistry);
         }
      };

      private C2S_LootReset_19309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReset_19309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReset_19309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReset_19309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_19309.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReset_19309)) {
            return super.equals(obj);
         } else {
            C2S_LootReset_19309 other = (C2S_LootReset_19309)obj;
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

      public static C2S_LootReset_19309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_19309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_19309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_19309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_19309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_19309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_19309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_19309 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_19309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_19309 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReset_19309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_19309 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_19309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_19309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReset_19309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReset_19309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReset_19309> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReset_19309> getParserForType() {
         return PARSER;
      }

      public C2S_LootReset_19309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReset_19309OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_19309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LootReset_19309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootReset_19309_descriptor;
         }

         public C2S_LootReset_19309 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LootReset_19309.getDefaultInstance();
         }

         public C2S_LootReset_19309 build() {
            C2S_LootReset_19309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReset_19309 buildPartial() {
            C2S_LootReset_19309 result = new C2S_LootReset_19309(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootReset_19309) {
               return this.mergeFrom((C2S_LootReset_19309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReset_19309 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LootReset_19309.getDefaultInstance()) {
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
            C2S_LootReset_19309 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReset_19309)ArtifactRotateActivityMsg.C2S_LootReset_19309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReset_19309)e.getUnfinishedMessage();
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

   public static final class C2S_LootEnjoy_19311 extends GeneratedMessageV3 implements C2S_LootEnjoy_19311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_19311 DEFAULT_INSTANCE = new C2S_LootEnjoy_19311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_19311> PARSER = new AbstractParser<C2S_LootEnjoy_19311>() {
         public C2S_LootEnjoy_19311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_19311(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_19311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_19311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_19311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_19311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_19311.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_19311)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_19311 other = (C2S_LootEnjoy_19311)obj;
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

      public static C2S_LootEnjoy_19311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_19311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_19311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_19311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_19311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_19311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_19311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_19311 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_19311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_19311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_19311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_19311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_19311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_19311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_19311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_19311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_19311> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_19311> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_19311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_19311OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_19311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LootEnjoy_19311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LootEnjoy_19311_descriptor;
         }

         public C2S_LootEnjoy_19311 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LootEnjoy_19311.getDefaultInstance();
         }

         public C2S_LootEnjoy_19311 build() {
            C2S_LootEnjoy_19311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_19311 buildPartial() {
            C2S_LootEnjoy_19311 result = new C2S_LootEnjoy_19311(this);
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
            if (other instanceof C2S_LootEnjoy_19311) {
               return this.mergeFrom((C2S_LootEnjoy_19311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_19311 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LootEnjoy_19311.getDefaultInstance()) {
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
            C2S_LootEnjoy_19311 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_19311)ArtifactRotateActivityMsg.C2S_LootEnjoy_19311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_19311)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_19312 extends GeneratedMessageV3 implements S2C_LootEnjoy_19312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_19312 DEFAULT_INSTANCE = new S2C_LootEnjoy_19312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_19312> PARSER = new AbstractParser<S2C_LootEnjoy_19312>() {
         public S2C_LootEnjoy_19312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_19312(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_19312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_19312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_19312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_19312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_19312.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_19312)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_19312 other = (S2C_LootEnjoy_19312)obj;
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

      public static S2C_LootEnjoy_19312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_19312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_19312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_19312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_19312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_19312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_19312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_19312 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_19312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_19312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_19312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_19312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_19312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_19312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_19312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_19312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_19312> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_19312> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_19312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_19312OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_19312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LootEnjoy_19312.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LootEnjoy_19312_descriptor;
         }

         public S2C_LootEnjoy_19312 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LootEnjoy_19312.getDefaultInstance();
         }

         public S2C_LootEnjoy_19312 build() {
            S2C_LootEnjoy_19312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_19312 buildPartial() {
            S2C_LootEnjoy_19312 result = new S2C_LootEnjoy_19312(this);
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
            if (other instanceof S2C_LootEnjoy_19312) {
               return this.mergeFrom((S2C_LootEnjoy_19312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_19312 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LootEnjoy_19312.getDefaultInstance()) {
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
            S2C_LootEnjoy_19312 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_19312)ArtifactRotateActivityMsg.S2C_LootEnjoy_19312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_19312)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureMain_19313 extends GeneratedMessageV3 implements C2S_TreasureMain_19313OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMain_19313 DEFAULT_INSTANCE = new C2S_TreasureMain_19313();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMain_19313> PARSER = new AbstractParser<C2S_TreasureMain_19313>() {
         public C2S_TreasureMain_19313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMain_19313(input, extensionRegistry);
         }
      };

      private C2S_TreasureMain_19313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMain_19313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMain_19313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMain_19313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_19313.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMain_19313)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMain_19313 other = (C2S_TreasureMain_19313)obj;
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

      public static C2S_TreasureMain_19313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_19313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_19313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_19313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_19313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_19313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_19313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_19313 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_19313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_19313 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_19313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_19313 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_19313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_19313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMain_19313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMain_19313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMain_19313> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMain_19313> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMain_19313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMain_19313OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_19313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_TreasureMain_19313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMain_19313_descriptor;
         }

         public C2S_TreasureMain_19313 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_TreasureMain_19313.getDefaultInstance();
         }

         public C2S_TreasureMain_19313 build() {
            C2S_TreasureMain_19313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMain_19313 buildPartial() {
            C2S_TreasureMain_19313 result = new C2S_TreasureMain_19313(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMain_19313) {
               return this.mergeFrom((C2S_TreasureMain_19313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMain_19313 other) {
            if (other == ArtifactRotateActivityMsg.C2S_TreasureMain_19313.getDefaultInstance()) {
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
            C2S_TreasureMain_19313 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMain_19313)ArtifactRotateActivityMsg.C2S_TreasureMain_19313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMain_19313)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMain_19314 extends GeneratedMessageV3 implements S2C_TreasureMain_19314OrBuilder {
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
      private static final S2C_TreasureMain_19314 DEFAULT_INSTANCE = new S2C_TreasureMain_19314();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMain_19314> PARSER = new AbstractParser<S2C_TreasureMain_19314>() {
         public S2C_TreasureMain_19314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMain_19314(input, extensionRegistry);
         }
      };

      private S2C_TreasureMain_19314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMain_19314() {
         this.memoizedIsInitialized = -1;
         this.gotGrid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMain_19314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMain_19314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_19314.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureMain_19314)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMain_19314 other = (S2C_TreasureMain_19314)obj;
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

      public static S2C_TreasureMain_19314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_19314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_19314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_19314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_19314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_19314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_19314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_19314 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_19314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_19314 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_19314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_19314 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_19314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_19314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMain_19314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMain_19314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMain_19314> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMain_19314> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMain_19314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMain_19314OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;
         private int appointCount_;
         private int grid_;
         private Internal.IntList gotGrid_;
         private boolean needBattle_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_19314.class, Builder.class);
         }

         private Builder() {
            this.gotGrid_ = ArtifactRotateActivityMsg.S2C_TreasureMain_19314.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotGrid_ = ArtifactRotateActivityMsg.S2C_TreasureMain_19314.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_TreasureMain_19314.alwaysUseFieldBuilders) {
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
            this.gotGrid_ = ArtifactRotateActivityMsg.S2C_TreasureMain_19314.emptyIntList();
            this.bitField0_ &= -17;
            this.needBattle_ = false;
            this.bitField0_ &= -33;
            this.appointCountBuy_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMain_19314_descriptor;
         }

         public S2C_TreasureMain_19314 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_TreasureMain_19314.getDefaultInstance();
         }

         public S2C_TreasureMain_19314 build() {
            S2C_TreasureMain_19314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMain_19314 buildPartial() {
            S2C_TreasureMain_19314 result = new S2C_TreasureMain_19314(this);
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
            if (other instanceof S2C_TreasureMain_19314) {
               return this.mergeFrom((S2C_TreasureMain_19314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMain_19314 other) {
            if (other == ArtifactRotateActivityMsg.S2C_TreasureMain_19314.getDefaultInstance()) {
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
            S2C_TreasureMain_19314 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMain_19314)ArtifactRotateActivityMsg.S2C_TreasureMain_19314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMain_19314)e.getUnfinishedMessage();
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
               this.gotGrid_ = ArtifactRotateActivityMsg.S2C_TreasureMain_19314.mutableCopy(this.gotGrid_);
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
            this.gotGrid_ = ArtifactRotateActivityMsg.S2C_TreasureMain_19314.emptyIntList();
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

   public static final class C2S_TreasureRollDice_19315 extends GeneratedMessageV3 implements C2S_TreasureRollDice_19315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureRollDice_19315 DEFAULT_INSTANCE = new C2S_TreasureRollDice_19315();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureRollDice_19315> PARSER = new AbstractParser<C2S_TreasureRollDice_19315>() {
         public C2S_TreasureRollDice_19315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureRollDice_19315(input, extensionRegistry);
         }
      };

      private C2S_TreasureRollDice_19315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureRollDice_19315() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureRollDice_19315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureRollDice_19315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_19315.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureRollDice_19315)) {
            return super.equals(obj);
         } else {
            C2S_TreasureRollDice_19315 other = (C2S_TreasureRollDice_19315)obj;
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

      public static C2S_TreasureRollDice_19315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_19315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_19315 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_19315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_19315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_19315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureRollDice_19315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureRollDice_19315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureRollDice_19315> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureRollDice_19315> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureRollDice_19315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureRollDice_19315OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_19315.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_TreasureRollDice_19315.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureRollDice_19315_descriptor;
         }

         public C2S_TreasureRollDice_19315 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_TreasureRollDice_19315.getDefaultInstance();
         }

         public C2S_TreasureRollDice_19315 build() {
            C2S_TreasureRollDice_19315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureRollDice_19315 buildPartial() {
            C2S_TreasureRollDice_19315 result = new C2S_TreasureRollDice_19315(this);
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
            if (other instanceof C2S_TreasureRollDice_19315) {
               return this.mergeFrom((C2S_TreasureRollDice_19315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureRollDice_19315 other) {
            if (other == ArtifactRotateActivityMsg.C2S_TreasureRollDice_19315.getDefaultInstance()) {
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
            C2S_TreasureRollDice_19315 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureRollDice_19315)ArtifactRotateActivityMsg.C2S_TreasureRollDice_19315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureRollDice_19315)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureRollDice_19316 extends GeneratedMessageV3 implements S2C_TreasureRollDice_19316OrBuilder {
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
      private static final S2C_TreasureRollDice_19316 DEFAULT_INSTANCE = new S2C_TreasureRollDice_19316();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureRollDice_19316> PARSER = new AbstractParser<S2C_TreasureRollDice_19316>() {
         public S2C_TreasureRollDice_19316 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureRollDice_19316(input, extensionRegistry);
         }
      };

      private S2C_TreasureRollDice_19316(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureRollDice_19316() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureRollDice_19316();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureRollDice_19316(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_19316.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureRollDice_19316)) {
            return super.equals(obj);
         } else {
            S2C_TreasureRollDice_19316 other = (S2C_TreasureRollDice_19316)obj;
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

      public static S2C_TreasureRollDice_19316 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_19316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_19316 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_19316 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_19316 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_19316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureRollDice_19316 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureRollDice_19316 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureRollDice_19316> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureRollDice_19316> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureRollDice_19316 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureRollDice_19316OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;
         private int grid_;
         private int count_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_19316.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_TreasureRollDice_19316.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureRollDice_19316_descriptor;
         }

         public S2C_TreasureRollDice_19316 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_TreasureRollDice_19316.getDefaultInstance();
         }

         public S2C_TreasureRollDice_19316 build() {
            S2C_TreasureRollDice_19316 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureRollDice_19316 buildPartial() {
            S2C_TreasureRollDice_19316 result = new S2C_TreasureRollDice_19316(this);
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
            if (other instanceof S2C_TreasureRollDice_19316) {
               return this.mergeFrom((S2C_TreasureRollDice_19316)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureRollDice_19316 other) {
            if (other == ArtifactRotateActivityMsg.S2C_TreasureRollDice_19316.getDefaultInstance()) {
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
            S2C_TreasureRollDice_19316 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureRollDice_19316)ArtifactRotateActivityMsg.S2C_TreasureRollDice_19316.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureRollDice_19316)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureMove_19317 extends GeneratedMessageV3 implements C2S_TreasureMove_19317OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMove_19317 DEFAULT_INSTANCE = new C2S_TreasureMove_19317();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMove_19317> PARSER = new AbstractParser<C2S_TreasureMove_19317>() {
         public C2S_TreasureMove_19317 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMove_19317(input, extensionRegistry);
         }
      };

      private C2S_TreasureMove_19317(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMove_19317() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMove_19317();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMove_19317(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_19317.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMove_19317)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMove_19317 other = (C2S_TreasureMove_19317)obj;
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

      public static C2S_TreasureMove_19317 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_19317 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_19317 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_19317 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_19317 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_19317 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_19317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_19317 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_19317 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_19317 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_19317 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_19317 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_19317 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_19317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMove_19317 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMove_19317 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMove_19317> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMove_19317> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMove_19317 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMove_19317OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_19317.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_TreasureMove_19317.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureMove_19317_descriptor;
         }

         public C2S_TreasureMove_19317 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_TreasureMove_19317.getDefaultInstance();
         }

         public C2S_TreasureMove_19317 build() {
            C2S_TreasureMove_19317 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMove_19317 buildPartial() {
            C2S_TreasureMove_19317 result = new C2S_TreasureMove_19317(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMove_19317) {
               return this.mergeFrom((C2S_TreasureMove_19317)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMove_19317 other) {
            if (other == ArtifactRotateActivityMsg.C2S_TreasureMove_19317.getDefaultInstance()) {
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
            C2S_TreasureMove_19317 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMove_19317)ArtifactRotateActivityMsg.C2S_TreasureMove_19317.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMove_19317)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMove_19318 extends GeneratedMessageV3 implements S2C_TreasureMove_19318OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLE_FIELD_NUMBER = 1;
      private int battle_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureMove_19318 DEFAULT_INSTANCE = new S2C_TreasureMove_19318();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMove_19318> PARSER = new AbstractParser<S2C_TreasureMove_19318>() {
         public S2C_TreasureMove_19318 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMove_19318(input, extensionRegistry);
         }
      };

      private S2C_TreasureMove_19318(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMove_19318() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMove_19318();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMove_19318(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_19318.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureMove_19318)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMove_19318 other = (S2C_TreasureMove_19318)obj;
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

      public static S2C_TreasureMove_19318 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_19318 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_19318 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_19318 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_19318 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_19318 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_19318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_19318 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_19318 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_19318 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_19318 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_19318 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_19318 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_19318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMove_19318 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMove_19318 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMove_19318> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMove_19318> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMove_19318 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMove_19318OrBuilder {
         private int bitField0_;
         private int battle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_19318.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_TreasureMove_19318.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battle_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureMove_19318_descriptor;
         }

         public S2C_TreasureMove_19318 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_TreasureMove_19318.getDefaultInstance();
         }

         public S2C_TreasureMove_19318 build() {
            S2C_TreasureMove_19318 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMove_19318 buildPartial() {
            S2C_TreasureMove_19318 result = new S2C_TreasureMove_19318(this);
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
            if (other instanceof S2C_TreasureMove_19318) {
               return this.mergeFrom((S2C_TreasureMove_19318)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMove_19318 other) {
            if (other == ArtifactRotateActivityMsg.S2C_TreasureMove_19318.getDefaultInstance()) {
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
            S2C_TreasureMove_19318 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMove_19318)ArtifactRotateActivityMsg.S2C_TreasureMove_19318.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMove_19318)e.getUnfinishedMessage();
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

   public static final class C2S_LineMain_19319 extends GeneratedMessageV3 implements C2S_LineMain_19319OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LineMain_19319 DEFAULT_INSTANCE = new C2S_LineMain_19319();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineMain_19319> PARSER = new AbstractParser<C2S_LineMain_19319>() {
         public C2S_LineMain_19319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineMain_19319(input, extensionRegistry);
         }
      };

      private C2S_LineMain_19319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineMain_19319() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineMain_19319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineMain_19319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_19319.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineMain_19319)) {
            return super.equals(obj);
         } else {
            C2S_LineMain_19319 other = (C2S_LineMain_19319)obj;
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

      public static C2S_LineMain_19319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_19319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_19319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_19319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_19319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_19319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_19319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_19319 parseFrom(InputStream input) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_19319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_19319 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineMain_19319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_19319 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_19319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_19319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineMain_19319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineMain_19319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineMain_19319> parser() {
         return PARSER;
      }

      public Parser<C2S_LineMain_19319> getParserForType() {
         return PARSER;
      }

      public C2S_LineMain_19319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineMain_19319OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_19319.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LineMain_19319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineMain_19319_descriptor;
         }

         public C2S_LineMain_19319 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LineMain_19319.getDefaultInstance();
         }

         public C2S_LineMain_19319 build() {
            C2S_LineMain_19319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineMain_19319 buildPartial() {
            C2S_LineMain_19319 result = new C2S_LineMain_19319(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LineMain_19319) {
               return this.mergeFrom((C2S_LineMain_19319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineMain_19319 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LineMain_19319.getDefaultInstance()) {
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
            C2S_LineMain_19319 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineMain_19319)ArtifactRotateActivityMsg.C2S_LineMain_19319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineMain_19319)e.getUnfinishedMessage();
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

   public static final class S2C_LineMain_19320 extends GeneratedMessageV3 implements S2C_LineMain_19320OrBuilder {
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
      private static final S2C_LineMain_19320 DEFAULT_INSTANCE = new S2C_LineMain_19320();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineMain_19320> PARSER = new AbstractParser<S2C_LineMain_19320>() {
         public S2C_LineMain_19320 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineMain_19320(input, extensionRegistry);
         }
      };

      private S2C_LineMain_19320(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineMain_19320() {
         this.memoizedIsInitialized = -1;
         this.gridTask_ = Collections.emptyList();
         this.gotLineBox_ = emptyIntList();
         this.gotFinalBox_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineMain_19320();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineMain_19320(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.gridTask_.add(input.readMessage(ArtifactRotateActivityMsg.GridTaskData.PARSER, extensionRegistry));
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_19320.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineMain_19320)) {
            return super.equals(obj);
         } else {
            S2C_LineMain_19320 other = (S2C_LineMain_19320)obj;
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

      public static S2C_LineMain_19320 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_19320 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_19320 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_19320 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_19320 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_19320 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_19320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_19320 parseFrom(InputStream input) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_19320 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_19320 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineMain_19320 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_19320 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_19320 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_19320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineMain_19320 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineMain_19320 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineMain_19320> parser() {
         return PARSER;
      }

      public Parser<S2C_LineMain_19320> getParserForType() {
         return PARSER;
      }

      public S2C_LineMain_19320 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineMain_19320OrBuilder {
         private int bitField0_;
         private List<GridTaskData> gridTask_;
         private RepeatedFieldBuilderV3<GridTaskData, GridTaskData.Builder, GridTaskDataOrBuilder> gridTaskBuilder_;
         private int lineBoxCount_;
         private Internal.IntList gotLineBox_;
         private Internal.IntList gotFinalBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_19320.class, Builder.class);
         }

         private Builder() {
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.gotFinalBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.gotFinalBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LineMain_19320.alwaysUseFieldBuilders) {
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
            this.gotLineBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.bitField0_ &= -5;
            this.gotFinalBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineMain_19320_descriptor;
         }

         public S2C_LineMain_19320 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LineMain_19320.getDefaultInstance();
         }

         public S2C_LineMain_19320 build() {
            S2C_LineMain_19320 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineMain_19320 buildPartial() {
            S2C_LineMain_19320 result = new S2C_LineMain_19320(this);
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
            if (other instanceof S2C_LineMain_19320) {
               return this.mergeFrom((S2C_LineMain_19320)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineMain_19320 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LineMain_19320.getDefaultInstance()) {
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
                     this.gridTaskBuilder_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.alwaysUseFieldBuilders ? this.getGridTaskFieldBuilder() : null;
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
            S2C_LineMain_19320 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineMain_19320)ArtifactRotateActivityMsg.S2C_LineMain_19320.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineMain_19320)e.getUnfinishedMessage();
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
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(ArtifactRotateActivityMsg.GridTaskData.getDefaultInstance());
         }

         public GridTaskData.Builder addGridTaskBuilder(int index) {
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(index, ArtifactRotateActivityMsg.GridTaskData.getDefaultInstance());
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
               this.gotLineBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.mutableCopy(this.gotLineBox_);
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
            this.gotLineBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureGotFinalBoxIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotFinalBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.mutableCopy(this.gotFinalBox_);
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
            this.gotFinalBox_ = ArtifactRotateActivityMsg.S2C_LineMain_19320.emptyIntList();
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

   public static final class C2S_LineBoxReward_19321 extends GeneratedMessageV3 implements C2S_LineBoxReward_19321OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_LineBoxReward_19321 DEFAULT_INSTANCE = new C2S_LineBoxReward_19321();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineBoxReward_19321> PARSER = new AbstractParser<C2S_LineBoxReward_19321>() {
         public C2S_LineBoxReward_19321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineBoxReward_19321(input, extensionRegistry);
         }
      };

      private C2S_LineBoxReward_19321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineBoxReward_19321() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineBoxReward_19321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineBoxReward_19321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_19321.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineBoxReward_19321)) {
            return super.equals(obj);
         } else {
            C2S_LineBoxReward_19321 other = (C2S_LineBoxReward_19321)obj;
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

      public static C2S_LineBoxReward_19321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_19321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_19321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_19321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_19321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_19321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_19321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_19321 parseFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_19321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_19321 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_19321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_19321 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_19321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_19321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineBoxReward_19321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineBoxReward_19321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineBoxReward_19321> parser() {
         return PARSER;
      }

      public Parser<C2S_LineBoxReward_19321> getParserForType() {
         return PARSER;
      }

      public C2S_LineBoxReward_19321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineBoxReward_19321OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_19321.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LineBoxReward_19321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineBoxReward_19321_descriptor;
         }

         public C2S_LineBoxReward_19321 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LineBoxReward_19321.getDefaultInstance();
         }

         public C2S_LineBoxReward_19321 build() {
            C2S_LineBoxReward_19321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineBoxReward_19321 buildPartial() {
            C2S_LineBoxReward_19321 result = new C2S_LineBoxReward_19321(this);
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
            if (other instanceof C2S_LineBoxReward_19321) {
               return this.mergeFrom((C2S_LineBoxReward_19321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineBoxReward_19321 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LineBoxReward_19321.getDefaultInstance()) {
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
            C2S_LineBoxReward_19321 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineBoxReward_19321)ArtifactRotateActivityMsg.C2S_LineBoxReward_19321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineBoxReward_19321)e.getUnfinishedMessage();
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

   public static final class S2C_LineBoxReward_19322 extends GeneratedMessageV3 implements S2C_LineBoxReward_19322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_LineBoxReward_19322 DEFAULT_INSTANCE = new S2C_LineBoxReward_19322();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineBoxReward_19322> PARSER = new AbstractParser<S2C_LineBoxReward_19322>() {
         public S2C_LineBoxReward_19322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineBoxReward_19322(input, extensionRegistry);
         }
      };

      private S2C_LineBoxReward_19322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineBoxReward_19322() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineBoxReward_19322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineBoxReward_19322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_19322.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineBoxReward_19322)) {
            return super.equals(obj);
         } else {
            S2C_LineBoxReward_19322 other = (S2C_LineBoxReward_19322)obj;
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

      public static S2C_LineBoxReward_19322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_19322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_19322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_19322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_19322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_19322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_19322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_19322 parseFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_19322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_19322 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_19322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_19322 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_19322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_19322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineBoxReward_19322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineBoxReward_19322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineBoxReward_19322> parser() {
         return PARSER;
      }

      public Parser<S2C_LineBoxReward_19322> getParserForType() {
         return PARSER;
      }

      public S2C_LineBoxReward_19322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineBoxReward_19322OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_19322.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LineBoxReward_19322.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineBoxReward_19322_descriptor;
         }

         public S2C_LineBoxReward_19322 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LineBoxReward_19322.getDefaultInstance();
         }

         public S2C_LineBoxReward_19322 build() {
            S2C_LineBoxReward_19322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineBoxReward_19322 buildPartial() {
            S2C_LineBoxReward_19322 result = new S2C_LineBoxReward_19322(this);
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
            if (other instanceof S2C_LineBoxReward_19322) {
               return this.mergeFrom((S2C_LineBoxReward_19322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineBoxReward_19322 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LineBoxReward_19322.getDefaultInstance()) {
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
            S2C_LineBoxReward_19322 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineBoxReward_19322)ArtifactRotateActivityMsg.S2C_LineBoxReward_19322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineBoxReward_19322)e.getUnfinishedMessage();
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

   public static final class S2C_LineTaskNotify_19324 extends GeneratedMessageV3 implements S2C_LineTaskNotify_19324OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskNotify_19324 DEFAULT_INSTANCE = new S2C_LineTaskNotify_19324();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskNotify_19324> PARSER = new AbstractParser<S2C_LineTaskNotify_19324>() {
         public S2C_LineTaskNotify_19324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskNotify_19324(input, extensionRegistry);
         }
      };

      private S2C_LineTaskNotify_19324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskNotify_19324() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskNotify_19324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskNotify_19324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_19324.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineTaskNotify_19324)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskNotify_19324 other = (S2C_LineTaskNotify_19324)obj;
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

      public static S2C_LineTaskNotify_19324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_19324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_19324 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_19324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_19324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_19324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskNotify_19324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskNotify_19324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskNotify_19324> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskNotify_19324> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskNotify_19324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskNotify_19324OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_19324.class, Builder.class);
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
            if (ArtifactRotateActivityMsg.S2C_LineTaskNotify_19324.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskNotify_19324_descriptor;
         }

         public S2C_LineTaskNotify_19324 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LineTaskNotify_19324.getDefaultInstance();
         }

         public S2C_LineTaskNotify_19324 build() {
            S2C_LineTaskNotify_19324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskNotify_19324 buildPartial() {
            S2C_LineTaskNotify_19324 result = new S2C_LineTaskNotify_19324(this);
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
            if (other instanceof S2C_LineTaskNotify_19324) {
               return this.mergeFrom((S2C_LineTaskNotify_19324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskNotify_19324 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LineTaskNotify_19324.getDefaultInstance()) {
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
                     this.taskBuilder_ = ArtifactRotateActivityMsg.S2C_LineTaskNotify_19324.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_LineTaskNotify_19324 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskNotify_19324)ArtifactRotateActivityMsg.S2C_LineTaskNotify_19324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskNotify_19324)e.getUnfinishedMessage();
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

   public static final class C2S_LineTaskReward_19325 extends GeneratedMessageV3 implements C2S_LineTaskReward_19325OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final C2S_LineTaskReward_19325 DEFAULT_INSTANCE = new C2S_LineTaskReward_19325();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineTaskReward_19325> PARSER = new AbstractParser<C2S_LineTaskReward_19325>() {
         public C2S_LineTaskReward_19325 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineTaskReward_19325(input, extensionRegistry);
         }
      };

      private C2S_LineTaskReward_19325(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineTaskReward_19325() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineTaskReward_19325();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineTaskReward_19325(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_19325.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineTaskReward_19325)) {
            return super.equals(obj);
         } else {
            C2S_LineTaskReward_19325 other = (C2S_LineTaskReward_19325)obj;
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

      public static C2S_LineTaskReward_19325 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_19325 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_19325 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_19325 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_19325 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_19325 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_19325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_19325 parseFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_19325 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_19325 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_19325 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_19325 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_19325 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_19325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineTaskReward_19325 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineTaskReward_19325 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineTaskReward_19325> parser() {
         return PARSER;
      }

      public Parser<C2S_LineTaskReward_19325> getParserForType() {
         return PARSER;
      }

      public C2S_LineTaskReward_19325 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineTaskReward_19325OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_19325.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_LineTaskReward_19325.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_LineTaskReward_19325_descriptor;
         }

         public C2S_LineTaskReward_19325 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_LineTaskReward_19325.getDefaultInstance();
         }

         public C2S_LineTaskReward_19325 build() {
            C2S_LineTaskReward_19325 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineTaskReward_19325 buildPartial() {
            C2S_LineTaskReward_19325 result = new C2S_LineTaskReward_19325(this);
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
            if (other instanceof C2S_LineTaskReward_19325) {
               return this.mergeFrom((C2S_LineTaskReward_19325)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineTaskReward_19325 other) {
            if (other == ArtifactRotateActivityMsg.C2S_LineTaskReward_19325.getDefaultInstance()) {
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
            C2S_LineTaskReward_19325 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineTaskReward_19325)ArtifactRotateActivityMsg.C2S_LineTaskReward_19325.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineTaskReward_19325)e.getUnfinishedMessage();
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

   public static final class S2C_LineTaskReward_19326 extends GeneratedMessageV3 implements S2C_LineTaskReward_19326OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskReward_19326 DEFAULT_INSTANCE = new S2C_LineTaskReward_19326();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskReward_19326> PARSER = new AbstractParser<S2C_LineTaskReward_19326>() {
         public S2C_LineTaskReward_19326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskReward_19326(input, extensionRegistry);
         }
      };

      private S2C_LineTaskReward_19326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskReward_19326() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskReward_19326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskReward_19326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_19326.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineTaskReward_19326)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskReward_19326 other = (S2C_LineTaskReward_19326)obj;
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

      public static S2C_LineTaskReward_19326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_19326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_19326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_19326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_19326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_19326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_19326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_19326 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_19326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_19326 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_19326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_19326 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_19326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_19326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskReward_19326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskReward_19326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskReward_19326> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskReward_19326> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskReward_19326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskReward_19326OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_19326.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_LineTaskReward_19326.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_LineTaskReward_19326_descriptor;
         }

         public S2C_LineTaskReward_19326 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_LineTaskReward_19326.getDefaultInstance();
         }

         public S2C_LineTaskReward_19326 build() {
            S2C_LineTaskReward_19326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskReward_19326 buildPartial() {
            S2C_LineTaskReward_19326 result = new S2C_LineTaskReward_19326(this);
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
            if (other instanceof S2C_LineTaskReward_19326) {
               return this.mergeFrom((S2C_LineTaskReward_19326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskReward_19326 other) {
            if (other == ArtifactRotateActivityMsg.S2C_LineTaskReward_19326.getDefaultInstance()) {
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
            S2C_LineTaskReward_19326 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskReward_19326)ArtifactRotateActivityMsg.S2C_LineTaskReward_19326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskReward_19326)e.getUnfinishedMessage();
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

   public static final class C2S_FinalBoxReward_19327 extends GeneratedMessageV3 implements C2S_FinalBoxReward_19327OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_FinalBoxReward_19327 DEFAULT_INSTANCE = new C2S_FinalBoxReward_19327();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FinalBoxReward_19327> PARSER = new AbstractParser<C2S_FinalBoxReward_19327>() {
         public C2S_FinalBoxReward_19327 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FinalBoxReward_19327(input, extensionRegistry);
         }
      };

      private C2S_FinalBoxReward_19327(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FinalBoxReward_19327() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FinalBoxReward_19327();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FinalBoxReward_19327(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_19327.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FinalBoxReward_19327)) {
            return super.equals(obj);
         } else {
            C2S_FinalBoxReward_19327 other = (C2S_FinalBoxReward_19327)obj;
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

      public static C2S_FinalBoxReward_19327 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_19327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_19327 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_19327 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_19327 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_19327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FinalBoxReward_19327 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FinalBoxReward_19327 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FinalBoxReward_19327> parser() {
         return PARSER;
      }

      public Parser<C2S_FinalBoxReward_19327> getParserForType() {
         return PARSER;
      }

      public C2S_FinalBoxReward_19327 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FinalBoxReward_19327OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_19327.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_FinalBoxReward_19327.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_FinalBoxReward_19327_descriptor;
         }

         public C2S_FinalBoxReward_19327 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_FinalBoxReward_19327.getDefaultInstance();
         }

         public C2S_FinalBoxReward_19327 build() {
            C2S_FinalBoxReward_19327 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FinalBoxReward_19327 buildPartial() {
            C2S_FinalBoxReward_19327 result = new C2S_FinalBoxReward_19327(this);
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
            if (other instanceof C2S_FinalBoxReward_19327) {
               return this.mergeFrom((C2S_FinalBoxReward_19327)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FinalBoxReward_19327 other) {
            if (other == ArtifactRotateActivityMsg.C2S_FinalBoxReward_19327.getDefaultInstance()) {
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
            C2S_FinalBoxReward_19327 parsedMessage = null;

            try {
               parsedMessage = (C2S_FinalBoxReward_19327)ArtifactRotateActivityMsg.C2S_FinalBoxReward_19327.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FinalBoxReward_19327)e.getUnfinishedMessage();
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

   public static final class S2C_FinalBoxReward_19328 extends GeneratedMessageV3 implements S2C_FinalBoxReward_19328OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_FinalBoxReward_19328 DEFAULT_INSTANCE = new S2C_FinalBoxReward_19328();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FinalBoxReward_19328> PARSER = new AbstractParser<S2C_FinalBoxReward_19328>() {
         public S2C_FinalBoxReward_19328 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FinalBoxReward_19328(input, extensionRegistry);
         }
      };

      private S2C_FinalBoxReward_19328(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FinalBoxReward_19328() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FinalBoxReward_19328();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FinalBoxReward_19328(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_19328.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FinalBoxReward_19328)) {
            return super.equals(obj);
         } else {
            S2C_FinalBoxReward_19328 other = (S2C_FinalBoxReward_19328)obj;
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

      public static S2C_FinalBoxReward_19328 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_19328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_19328 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_19328 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_19328 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_19328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FinalBoxReward_19328 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FinalBoxReward_19328 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FinalBoxReward_19328> parser() {
         return PARSER;
      }

      public Parser<S2C_FinalBoxReward_19328> getParserForType() {
         return PARSER;
      }

      public S2C_FinalBoxReward_19328 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FinalBoxReward_19328OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_19328.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_FinalBoxReward_19328.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_FinalBoxReward_19328_descriptor;
         }

         public S2C_FinalBoxReward_19328 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_FinalBoxReward_19328.getDefaultInstance();
         }

         public S2C_FinalBoxReward_19328 build() {
            S2C_FinalBoxReward_19328 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FinalBoxReward_19328 buildPartial() {
            S2C_FinalBoxReward_19328 result = new S2C_FinalBoxReward_19328(this);
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
            if (other instanceof S2C_FinalBoxReward_19328) {
               return this.mergeFrom((S2C_FinalBoxReward_19328)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FinalBoxReward_19328 other) {
            if (other == ArtifactRotateActivityMsg.S2C_FinalBoxReward_19328.getDefaultInstance()) {
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
            S2C_FinalBoxReward_19328 parsedMessage = null;

            try {
               parsedMessage = (S2C_FinalBoxReward_19328)ArtifactRotateActivityMsg.S2C_FinalBoxReward_19328.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FinalBoxReward_19328)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureAddRandom_19329 extends GeneratedMessageV3 implements C2S_TreasureAddRandom_19329OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAddRandom_19329 DEFAULT_INSTANCE = new C2S_TreasureAddRandom_19329();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAddRandom_19329> PARSER = new AbstractParser<C2S_TreasureAddRandom_19329>() {
         public C2S_TreasureAddRandom_19329 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAddRandom_19329(input, extensionRegistry);
         }
      };

      private C2S_TreasureAddRandom_19329(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAddRandom_19329() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAddRandom_19329();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAddRandom_19329(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_19329.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAddRandom_19329)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAddRandom_19329 other = (C2S_TreasureAddRandom_19329)obj;
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

      public static C2S_TreasureAddRandom_19329 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_19329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_19329 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_19329 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_19329 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_19329)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAddRandom_19329 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAddRandom_19329 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAddRandom_19329> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAddRandom_19329> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAddRandom_19329 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAddRandom_19329OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_19329.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_TreasureAddRandom_19329.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_19329_descriptor;
         }

         public C2S_TreasureAddRandom_19329 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_TreasureAddRandom_19329.getDefaultInstance();
         }

         public C2S_TreasureAddRandom_19329 build() {
            C2S_TreasureAddRandom_19329 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAddRandom_19329 buildPartial() {
            C2S_TreasureAddRandom_19329 result = new C2S_TreasureAddRandom_19329(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAddRandom_19329) {
               return this.mergeFrom((C2S_TreasureAddRandom_19329)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAddRandom_19329 other) {
            if (other == ArtifactRotateActivityMsg.C2S_TreasureAddRandom_19329.getDefaultInstance()) {
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
            C2S_TreasureAddRandom_19329 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAddRandom_19329)ArtifactRotateActivityMsg.C2S_TreasureAddRandom_19329.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAddRandom_19329)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAddRandom_19330 extends GeneratedMessageV3 implements S2C_TreasureAddRandom_19330OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANDOMCOUNT_FIELD_NUMBER = 1;
      private int randomCount_;
      public static final int RANDOMRECOVERTIME_FIELD_NUMBER = 2;
      private int randomRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAddRandom_19330 DEFAULT_INSTANCE = new S2C_TreasureAddRandom_19330();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAddRandom_19330> PARSER = new AbstractParser<S2C_TreasureAddRandom_19330>() {
         public S2C_TreasureAddRandom_19330 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAddRandom_19330(input, extensionRegistry);
         }
      };

      private S2C_TreasureAddRandom_19330(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAddRandom_19330() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAddRandom_19330();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAddRandom_19330(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_19330.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureAddRandom_19330)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAddRandom_19330 other = (S2C_TreasureAddRandom_19330)obj;
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

      public static S2C_TreasureAddRandom_19330 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_19330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_19330 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_19330 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_19330 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_19330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAddRandom_19330 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAddRandom_19330 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAddRandom_19330> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAddRandom_19330> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAddRandom_19330 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAddRandom_19330OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_19330.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_TreasureAddRandom_19330.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_19330_descriptor;
         }

         public S2C_TreasureAddRandom_19330 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_TreasureAddRandom_19330.getDefaultInstance();
         }

         public S2C_TreasureAddRandom_19330 build() {
            S2C_TreasureAddRandom_19330 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAddRandom_19330 buildPartial() {
            S2C_TreasureAddRandom_19330 result = new S2C_TreasureAddRandom_19330(this);
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
            if (other instanceof S2C_TreasureAddRandom_19330) {
               return this.mergeFrom((S2C_TreasureAddRandom_19330)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAddRandom_19330 other) {
            if (other == ArtifactRotateActivityMsg.S2C_TreasureAddRandom_19330.getDefaultInstance()) {
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
            S2C_TreasureAddRandom_19330 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAddRandom_19330)ArtifactRotateActivityMsg.S2C_TreasureAddRandom_19330.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAddRandom_19330)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureAppointBuy_19331 extends GeneratedMessageV3 implements C2S_TreasureAppointBuy_19331OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAppointBuy_19331 DEFAULT_INSTANCE = new C2S_TreasureAppointBuy_19331();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAppointBuy_19331> PARSER = new AbstractParser<C2S_TreasureAppointBuy_19331>() {
         public C2S_TreasureAppointBuy_19331 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAppointBuy_19331(input, extensionRegistry);
         }
      };

      private C2S_TreasureAppointBuy_19331(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAppointBuy_19331() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAppointBuy_19331();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAppointBuy_19331(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_19331.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAppointBuy_19331)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAppointBuy_19331 other = (C2S_TreasureAppointBuy_19331)obj;
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

      public static C2S_TreasureAppointBuy_19331 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_19331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_19331 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_19331 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_19331 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_19331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAppointBuy_19331 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAppointBuy_19331 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAppointBuy_19331> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAppointBuy_19331> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAppointBuy_19331 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAppointBuy_19331OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_19331.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.C2S_TreasureAppointBuy_19331.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_19331_descriptor;
         }

         public C2S_TreasureAppointBuy_19331 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.C2S_TreasureAppointBuy_19331.getDefaultInstance();
         }

         public C2S_TreasureAppointBuy_19331 build() {
            C2S_TreasureAppointBuy_19331 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAppointBuy_19331 buildPartial() {
            C2S_TreasureAppointBuy_19331 result = new C2S_TreasureAppointBuy_19331(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAppointBuy_19331) {
               return this.mergeFrom((C2S_TreasureAppointBuy_19331)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAppointBuy_19331 other) {
            if (other == ArtifactRotateActivityMsg.C2S_TreasureAppointBuy_19331.getDefaultInstance()) {
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
            C2S_TreasureAppointBuy_19331 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAppointBuy_19331)ArtifactRotateActivityMsg.C2S_TreasureAppointBuy_19331.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAppointBuy_19331)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAppointBuy_19332 extends GeneratedMessageV3 implements S2C_TreasureAppointBuy_19332OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int APPOINTCOUNT_FIELD_NUMBER = 1;
      private int appointCount_;
      public static final int APPOINTCOUNTBUY_FIELD_NUMBER = 2;
      private int appointCountBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAppointBuy_19332 DEFAULT_INSTANCE = new S2C_TreasureAppointBuy_19332();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAppointBuy_19332> PARSER = new AbstractParser<S2C_TreasureAppointBuy_19332>() {
         public S2C_TreasureAppointBuy_19332 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAppointBuy_19332(input, extensionRegistry);
         }
      };

      private S2C_TreasureAppointBuy_19332(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAppointBuy_19332() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAppointBuy_19332();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAppointBuy_19332(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_19332.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureAppointBuy_19332)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAppointBuy_19332 other = (S2C_TreasureAppointBuy_19332)obj;
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

      public static S2C_TreasureAppointBuy_19332 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_19332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_19332 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_19332 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_19332 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_19332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAppointBuy_19332 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAppointBuy_19332 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAppointBuy_19332> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAppointBuy_19332> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAppointBuy_19332 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAppointBuy_19332OrBuilder {
         private int bitField0_;
         private int appointCount_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_19332.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactRotateActivityMsg.S2C_TreasureAppointBuy_19332.alwaysUseFieldBuilders) {
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
            return ArtifactRotateActivityMsg.internal_static_artifactRotateActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_19332_descriptor;
         }

         public S2C_TreasureAppointBuy_19332 getDefaultInstanceForType() {
            return ArtifactRotateActivityMsg.S2C_TreasureAppointBuy_19332.getDefaultInstance();
         }

         public S2C_TreasureAppointBuy_19332 build() {
            S2C_TreasureAppointBuy_19332 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAppointBuy_19332 buildPartial() {
            S2C_TreasureAppointBuy_19332 result = new S2C_TreasureAppointBuy_19332(this);
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
            if (other instanceof S2C_TreasureAppointBuy_19332) {
               return this.mergeFrom((S2C_TreasureAppointBuy_19332)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAppointBuy_19332 other) {
            if (other == ArtifactRotateActivityMsg.S2C_TreasureAppointBuy_19332.getDefaultInstance()) {
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
            S2C_TreasureAppointBuy_19332 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAppointBuy_19332)ArtifactRotateActivityMsg.S2C_TreasureAppointBuy_19332.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAppointBuy_19332)e.getUnfinishedMessage();
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

   public interface C2S_ArtifactInfo_19301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FinalBoxReward_19327OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineBoxReward_19321OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineMain_19319OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LineTaskReward_19325OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface C2S_LootEnjoy_19311OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_19305OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReset_19309OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_19307OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenWeaponBox_19303OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface C2S_TreasureAddRandom_19329OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureAppointBuy_19331OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMain_19313OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMove_19317OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureRollDice_19315OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ArtifactInfo_19302OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FinalBoxReward_19328OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineBoxReward_19322OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineMain_19320OrBuilder extends MessageOrBuilder {
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

   public interface S2C_LineTaskNotify_19324OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LineTaskReward_19326OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface S2C_LootEnjoy_19312OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_19306OrBuilder extends MessageOrBuilder {
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

   public interface S2C_LootReward_19308OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasIsEnjoy();

      boolean getIsEnjoy();

      boolean hasCurLootNum();

      int getCurLootNum();
   }

   public interface S2C_OpenWeaponBox_19304OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface S2C_TreasureAddRandom_19330OrBuilder extends MessageOrBuilder {
      boolean hasRandomCount();

      int getRandomCount();

      boolean hasRandomRecoverTime();

      int getRandomRecoverTime();
   }

   public interface S2C_TreasureAppointBuy_19332OrBuilder extends MessageOrBuilder {
      boolean hasAppointCount();

      int getAppointCount();

      boolean hasAppointCountBuy();

      int getAppointCountBuy();
   }

   public interface S2C_TreasureMain_19314OrBuilder extends MessageOrBuilder {
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

   public interface S2C_TreasureMove_19318OrBuilder extends MessageOrBuilder {
      boolean hasBattle();

      int getBattle();
   }

   public interface S2C_TreasureRollDice_19316OrBuilder extends MessageOrBuilder {
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
