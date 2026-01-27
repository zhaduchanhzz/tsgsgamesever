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

public final class ArtifactSkinActivityMsg {
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArtifactSkinActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u001aArtifactSkinActivity.proto\u0012&artifactSkinActivity.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"P\n\fGridTaskData\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u00122\n\u0004task\u0018\u0002 \u0001(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0018\n\u0016C2S_ArtifactInfo_20701\"_\n\u0016S2C_ArtifactInfo_20702\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nweaponBoxs\u0018\u0003 \u0003(\u0005\u0012\r\n\u0005token\u0018\u0004 \u0002(\u0005\"(\n\u0017C2S_OpenWeaponBox_20703\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"(\n\u0017S2C_OpenWeaponBox_20704\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"\u0014\n\u0012C2S_LootInfo_20705\"²\u0001\n\u0012S2C_LootInfo_20706\u0012\u000f\n\u0007enjoyId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nresetTimes\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bhadGetEnjoy\u0018\u0004 \u0002(\b\u0012&\n\u000bchooseTimes\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\ncurLootNum\u0018\u0006 \u0002(\u0005\u0012\u0014\n\fdailyDrawNum\u0018\u0007 \u0002(\u0005\"#\n\u0014C2S_LootReward_20707\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"M\n\u0014S2C_LootReward_20708\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007isEnjoy\u0018\u0002 \u0002(\b\u0012\u0012\n\ncurLootNum\u0018\u0003 \u0002(\u0005\"\u0015\n\u0013C2S_LootReset_20709\"!\n\u0013C2S_LootEnjoy_20711\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"!\n\u0013S2C_LootEnjoy_20712\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMain_20713\"ª\u0001\n\u0016S2C_TreasureMain_20714\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fappointCount\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007gotGrid\u0018\u0005 \u0003(\u0005\u0012\u0012\n\nneedBattle\u0018\u0006 \u0002(\b\u0012\u0017\n\u000fappointCountBuy\u0018\u0007 \u0002(\u0005\"7\n\u001aC2S_TreasureRollDice_20715\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0001(\u0005\"o\n\u001aS2C_TreasureRollDice_20716\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004grid\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0005 \u0002(\u0005\"\u0018\n\u0016C2S_TreasureMove_20717\"(\n\u0016S2C_TreasureMove_20718\u0012\u000e\n\u0006battle\u0018\u0001 \u0001(\u0005\"\u0014\n\u0012C2S_LineMain_20719\"\u009b\u0001\n\u0012S2C_LineMain_20720\u0012F\n\bgridTask\u0018\u0001 \u0003(\u000b24.artifactSkinActivity.com.gzbz.protobuf.GridTaskData\u0012\u0014\n\flineBoxCount\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ngotLineBox\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bgotFinalBox\u0018\u0004 \u0003(\u0005\"&\n\u0017C2S_LineBoxReward_20721\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"&\n\u0017S2C_LineBoxReward_20722\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"N\n\u0018S2C_LineTaskNotify_20724\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"(\n\u0018C2S_LineTaskReward_20725\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"(\n\u0018S2C_LineTaskReward_20726\u0012\f\n\u0004task\u0018\u0001 \u0002(\u0005\"'\n\u0018C2S_FinalBoxReward_20727\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"'\n\u0018S2C_FinalBoxReward_20728\u0012\u000b\n\u0003box\u0018\u0001 \u0002(\u0005\"\u001d\n\u001bC2S_TreasureAddRandom_20729\"M\n\u001bS2C_TreasureAddRandom_20730\u0012\u0013\n\u000brandomCount\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011randomRecoverTime\u0018\u0002 \u0002(\u0005\"\u001e\n\u001cC2S_TreasureAppointBuy_20731\"M\n\u001cS2C_TreasureAppointBuy_20732\u0012\u0014\n\fappointCount\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fappointCountBuy\u0018\u0002 \u0002(\u0005B.\n\u0011com.gzbz.protobufB\u0017ArtifactSkinActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor, new String[]{"Grid", "Task"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor, new String[]{"StartTime", "EndTime", "WeaponBoxs", "Token"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor, new String[]{"BoxId"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor, new String[]{"BoxId"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor, new String[]{"EnjoyId", "ResetTimes", "RewardId", "HadGetEnjoy", "ChooseTimes", "CurLootNum", "DailyDrawNum"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor, new String[]{"Num"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor, new String[]{"RewardId", "IsEnjoy", "CurLootNum"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor, new String[]{"Id"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor, new String[]{"Id"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor, new String[]{"RandomCount", "RandomRecoverTime", "AppointCount", "Grid", "GotGrid", "NeedBattle", "AppointCountBuy"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor, new String[]{"Type", "Num"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor, new String[]{"Type", "Num", "Grid", "Count", "RandomRecoverTime"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor, new String[]{"Battle"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor, new String[]{"GridTask", "LineBoxCount", "GotLineBox", "GotFinalBox"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor, new String[]{"Box"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor, new String[]{"Box"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor, new String[]{"Task"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor, new String[]{"Task"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor, new String[]{"Task"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor, new String[]{"Box"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor, new String[]{"Box"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor, new String[]{"RandomCount", "RandomRecoverTime"});
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor, new String[0]);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor, new String[]{"AppointCount", "AppointCountBuy"});
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(GridTaskData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.GridTaskData.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_GridTaskData_descriptor;
         }

         public GridTaskData getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.GridTaskData.getDefaultInstance();
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
            if (other == ArtifactSkinActivityMsg.GridTaskData.getDefaultInstance()) {
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
               parsedMessage = (GridTaskData)ArtifactSkinActivityMsg.GridTaskData.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ArtifactInfo_20701 extends GeneratedMessageV3 implements C2S_ArtifactInfo_20701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ArtifactInfo_20701 DEFAULT_INSTANCE = new C2S_ArtifactInfo_20701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ArtifactInfo_20701> PARSER = new AbstractParser<C2S_ArtifactInfo_20701>() {
         public C2S_ArtifactInfo_20701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ArtifactInfo_20701(input, extensionRegistry);
         }
      };

      private C2S_ArtifactInfo_20701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ArtifactInfo_20701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ArtifactInfo_20701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ArtifactInfo_20701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_20701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ArtifactInfo_20701)) {
            return super.equals(obj);
         } else {
            C2S_ArtifactInfo_20701 other = (C2S_ArtifactInfo_20701)obj;
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

      public static C2S_ArtifactInfo_20701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ArtifactInfo_20701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_20701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_20701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ArtifactInfo_20701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ArtifactInfo_20701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ArtifactInfo_20701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ArtifactInfo_20701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ArtifactInfo_20701> parser() {
         return PARSER;
      }

      public Parser<C2S_ArtifactInfo_20701> getParserForType() {
         return PARSER;
      }

      public C2S_ArtifactInfo_20701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ArtifactInfo_20701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ArtifactInfo_20701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_ArtifactInfo_20701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_ArtifactInfo_20701_descriptor;
         }

         public C2S_ArtifactInfo_20701 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_ArtifactInfo_20701.getDefaultInstance();
         }

         public C2S_ArtifactInfo_20701 build() {
            C2S_ArtifactInfo_20701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ArtifactInfo_20701 buildPartial() {
            C2S_ArtifactInfo_20701 result = new C2S_ArtifactInfo_20701(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ArtifactInfo_20701) {
               return this.mergeFrom((C2S_ArtifactInfo_20701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ArtifactInfo_20701 other) {
            if (other == ArtifactSkinActivityMsg.C2S_ArtifactInfo_20701.getDefaultInstance()) {
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
            C2S_ArtifactInfo_20701 parsedMessage = null;

            try {
               parsedMessage = (C2S_ArtifactInfo_20701)ArtifactSkinActivityMsg.C2S_ArtifactInfo_20701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ArtifactInfo_20701)e.getUnfinishedMessage();
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

   public static final class S2C_ArtifactInfo_20702 extends GeneratedMessageV3 implements S2C_ArtifactInfo_20702OrBuilder {
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
      private static final S2C_ArtifactInfo_20702 DEFAULT_INSTANCE = new S2C_ArtifactInfo_20702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ArtifactInfo_20702> PARSER = new AbstractParser<S2C_ArtifactInfo_20702>() {
         public S2C_ArtifactInfo_20702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ArtifactInfo_20702(input, extensionRegistry);
         }
      };

      private S2C_ArtifactInfo_20702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ArtifactInfo_20702() {
         this.memoizedIsInitialized = -1;
         this.weaponBoxs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ArtifactInfo_20702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ArtifactInfo_20702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_20702.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ArtifactInfo_20702)) {
            return super.equals(obj);
         } else {
            S2C_ArtifactInfo_20702 other = (S2C_ArtifactInfo_20702)obj;
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

      public static S2C_ArtifactInfo_20702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ArtifactInfo_20702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_20702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_20702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ArtifactInfo_20702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ArtifactInfo_20702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ArtifactInfo_20702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ArtifactInfo_20702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ArtifactInfo_20702> parser() {
         return PARSER;
      }

      public Parser<S2C_ArtifactInfo_20702> getParserForType() {
         return PARSER;
      }

      public S2C_ArtifactInfo_20702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ArtifactInfo_20702OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private Internal.IntList weaponBoxs_;
         private int token_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ArtifactInfo_20702.class, Builder.class);
         }

         private Builder() {
            this.weaponBoxs_ = ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.weaponBoxs_ = ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.weaponBoxs_ = ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.emptyIntList();
            this.bitField0_ &= -5;
            this.token_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_ArtifactInfo_20702_descriptor;
         }

         public S2C_ArtifactInfo_20702 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.getDefaultInstance();
         }

         public S2C_ArtifactInfo_20702 build() {
            S2C_ArtifactInfo_20702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ArtifactInfo_20702 buildPartial() {
            S2C_ArtifactInfo_20702 result = new S2C_ArtifactInfo_20702(this);
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
            if (other instanceof S2C_ArtifactInfo_20702) {
               return this.mergeFrom((S2C_ArtifactInfo_20702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ArtifactInfo_20702 other) {
            if (other == ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.getDefaultInstance()) {
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
            S2C_ArtifactInfo_20702 parsedMessage = null;

            try {
               parsedMessage = (S2C_ArtifactInfo_20702)ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ArtifactInfo_20702)e.getUnfinishedMessage();
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
               this.weaponBoxs_ = ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.mutableCopy(this.weaponBoxs_);
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
            this.weaponBoxs_ = ArtifactSkinActivityMsg.S2C_ArtifactInfo_20702.emptyIntList();
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

   public static final class C2S_OpenWeaponBox_20703 extends GeneratedMessageV3 implements C2S_OpenWeaponBox_20703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenWeaponBox_20703 DEFAULT_INSTANCE = new C2S_OpenWeaponBox_20703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenWeaponBox_20703> PARSER = new AbstractParser<C2S_OpenWeaponBox_20703>() {
         public C2S_OpenWeaponBox_20703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenWeaponBox_20703(input, extensionRegistry);
         }
      };

      private C2S_OpenWeaponBox_20703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenWeaponBox_20703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenWeaponBox_20703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenWeaponBox_20703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_20703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenWeaponBox_20703)) {
            return super.equals(obj);
         } else {
            C2S_OpenWeaponBox_20703 other = (C2S_OpenWeaponBox_20703)obj;
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

      public static C2S_OpenWeaponBox_20703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenWeaponBox_20703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_20703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_20703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenWeaponBox_20703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenWeaponBox_20703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenWeaponBox_20703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenWeaponBox_20703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenWeaponBox_20703> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenWeaponBox_20703> getParserForType() {
         return PARSER;
      }

      public C2S_OpenWeaponBox_20703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenWeaponBox_20703OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenWeaponBox_20703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_OpenWeaponBox_20703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_OpenWeaponBox_20703_descriptor;
         }

         public C2S_OpenWeaponBox_20703 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_OpenWeaponBox_20703.getDefaultInstance();
         }

         public C2S_OpenWeaponBox_20703 build() {
            C2S_OpenWeaponBox_20703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenWeaponBox_20703 buildPartial() {
            C2S_OpenWeaponBox_20703 result = new C2S_OpenWeaponBox_20703(this);
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
            if (other instanceof C2S_OpenWeaponBox_20703) {
               return this.mergeFrom((C2S_OpenWeaponBox_20703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenWeaponBox_20703 other) {
            if (other == ArtifactSkinActivityMsg.C2S_OpenWeaponBox_20703.getDefaultInstance()) {
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
            C2S_OpenWeaponBox_20703 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenWeaponBox_20703)ArtifactSkinActivityMsg.C2S_OpenWeaponBox_20703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenWeaponBox_20703)e.getUnfinishedMessage();
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

   public static final class S2C_OpenWeaponBox_20704 extends GeneratedMessageV3 implements S2C_OpenWeaponBox_20704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenWeaponBox_20704 DEFAULT_INSTANCE = new S2C_OpenWeaponBox_20704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenWeaponBox_20704> PARSER = new AbstractParser<S2C_OpenWeaponBox_20704>() {
         public S2C_OpenWeaponBox_20704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenWeaponBox_20704(input, extensionRegistry);
         }
      };

      private S2C_OpenWeaponBox_20704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenWeaponBox_20704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenWeaponBox_20704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenWeaponBox_20704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_20704.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenWeaponBox_20704)) {
            return super.equals(obj);
         } else {
            S2C_OpenWeaponBox_20704 other = (S2C_OpenWeaponBox_20704)obj;
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

      public static S2C_OpenWeaponBox_20704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenWeaponBox_20704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_20704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_20704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenWeaponBox_20704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenWeaponBox_20704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenWeaponBox_20704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenWeaponBox_20704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenWeaponBox_20704> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenWeaponBox_20704> getParserForType() {
         return PARSER;
      }

      public S2C_OpenWeaponBox_20704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenWeaponBox_20704OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenWeaponBox_20704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_OpenWeaponBox_20704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_OpenWeaponBox_20704_descriptor;
         }

         public S2C_OpenWeaponBox_20704 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_OpenWeaponBox_20704.getDefaultInstance();
         }

         public S2C_OpenWeaponBox_20704 build() {
            S2C_OpenWeaponBox_20704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenWeaponBox_20704 buildPartial() {
            S2C_OpenWeaponBox_20704 result = new S2C_OpenWeaponBox_20704(this);
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
            if (other instanceof S2C_OpenWeaponBox_20704) {
               return this.mergeFrom((S2C_OpenWeaponBox_20704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenWeaponBox_20704 other) {
            if (other == ArtifactSkinActivityMsg.S2C_OpenWeaponBox_20704.getDefaultInstance()) {
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
            S2C_OpenWeaponBox_20704 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenWeaponBox_20704)ArtifactSkinActivityMsg.S2C_OpenWeaponBox_20704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenWeaponBox_20704)e.getUnfinishedMessage();
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

   public static final class C2S_LootInfo_20705 extends GeneratedMessageV3 implements C2S_LootInfo_20705OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootInfo_20705 DEFAULT_INSTANCE = new C2S_LootInfo_20705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootInfo_20705> PARSER = new AbstractParser<C2S_LootInfo_20705>() {
         public C2S_LootInfo_20705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootInfo_20705(input, extensionRegistry);
         }
      };

      private C2S_LootInfo_20705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootInfo_20705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootInfo_20705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootInfo_20705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20705.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootInfo_20705)) {
            return super.equals(obj);
         } else {
            C2S_LootInfo_20705 other = (C2S_LootInfo_20705)obj;
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

      public static C2S_LootInfo_20705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data);
      }

      public static C2S_LootInfo_20705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootInfo_20705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootInfo_20705 parseFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootInfo_20705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootInfo_20705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootInfo_20705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootInfo_20705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootInfo_20705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootInfo_20705> parser() {
         return PARSER;
      }

      public Parser<C2S_LootInfo_20705> getParserForType() {
         return PARSER;
      }

      public C2S_LootInfo_20705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootInfo_20705OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootInfo_20705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LootInfo_20705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootInfo_20705_descriptor;
         }

         public C2S_LootInfo_20705 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LootInfo_20705.getDefaultInstance();
         }

         public C2S_LootInfo_20705 build() {
            C2S_LootInfo_20705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootInfo_20705 buildPartial() {
            C2S_LootInfo_20705 result = new C2S_LootInfo_20705(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootInfo_20705) {
               return this.mergeFrom((C2S_LootInfo_20705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootInfo_20705 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LootInfo_20705.getDefaultInstance()) {
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
            C2S_LootInfo_20705 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootInfo_20705)ArtifactSkinActivityMsg.C2S_LootInfo_20705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootInfo_20705)e.getUnfinishedMessage();
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

   public static final class S2C_LootInfo_20706 extends GeneratedMessageV3 implements S2C_LootInfo_20706OrBuilder {
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
      private static final S2C_LootInfo_20706 DEFAULT_INSTANCE = new S2C_LootInfo_20706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootInfo_20706> PARSER = new AbstractParser<S2C_LootInfo_20706>() {
         public S2C_LootInfo_20706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootInfo_20706(input, extensionRegistry);
         }
      };

      private S2C_LootInfo_20706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootInfo_20706() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.chooseTimes_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootInfo_20706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootInfo_20706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20706.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootInfo_20706)) {
            return super.equals(obj);
         } else {
            S2C_LootInfo_20706 other = (S2C_LootInfo_20706)obj;
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

      public static S2C_LootInfo_20706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data);
      }

      public static S2C_LootInfo_20706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootInfo_20706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootInfo_20706 parseFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootInfo_20706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootInfo_20706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootInfo_20706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootInfo_20706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootInfo_20706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootInfo_20706> parser() {
         return PARSER;
      }

      public Parser<S2C_LootInfo_20706> getParserForType() {
         return PARSER;
      }

      public S2C_LootInfo_20706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootInfo_20706OrBuilder {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootInfo_20706.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.emptyIntList();
            this.chooseTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LootInfo_20706.alwaysUseFieldBuilders) {
               this.getChooseTimesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.enjoyId_ = 0;
            this.bitField0_ &= -2;
            this.resetTimes_ = 0;
            this.bitField0_ &= -3;
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.emptyIntList();
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootInfo_20706_descriptor;
         }

         public S2C_LootInfo_20706 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LootInfo_20706.getDefaultInstance();
         }

         public S2C_LootInfo_20706 build() {
            S2C_LootInfo_20706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootInfo_20706 buildPartial() {
            S2C_LootInfo_20706 result = new S2C_LootInfo_20706(this);
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
            if (other instanceof S2C_LootInfo_20706) {
               return this.mergeFrom((S2C_LootInfo_20706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootInfo_20706 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LootInfo_20706.getDefaultInstance()) {
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
                     this.chooseTimesBuilder_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.alwaysUseFieldBuilders ? this.getChooseTimesFieldBuilder() : null;
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
            S2C_LootInfo_20706 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootInfo_20706)ArtifactSkinActivityMsg.S2C_LootInfo_20706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootInfo_20706)e.getUnfinishedMessage();
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
               this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootInfo_20706.emptyIntList();
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

   public static final class C2S_LootReward_20707 extends GeneratedMessageV3 implements C2S_LootReward_20707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LootReward_20707 DEFAULT_INSTANCE = new C2S_LootReward_20707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReward_20707> PARSER = new AbstractParser<C2S_LootReward_20707>() {
         public C2S_LootReward_20707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReward_20707(input, extensionRegistry);
         }
      };

      private C2S_LootReward_20707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReward_20707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReward_20707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReward_20707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20707.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReward_20707)) {
            return super.equals(obj);
         } else {
            C2S_LootReward_20707 other = (C2S_LootReward_20707)obj;
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

      public static C2S_LootReward_20707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data);
      }

      public static C2S_LootReward_20707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReward_20707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReward_20707 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReward_20707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReward_20707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReward_20707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReward_20707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReward_20707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReward_20707> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReward_20707> getParserForType() {
         return PARSER;
      }

      public C2S_LootReward_20707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReward_20707OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReward_20707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LootReward_20707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReward_20707_descriptor;
         }

         public C2S_LootReward_20707 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LootReward_20707.getDefaultInstance();
         }

         public C2S_LootReward_20707 build() {
            C2S_LootReward_20707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReward_20707 buildPartial() {
            C2S_LootReward_20707 result = new C2S_LootReward_20707(this);
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
            if (other instanceof C2S_LootReward_20707) {
               return this.mergeFrom((C2S_LootReward_20707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReward_20707 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LootReward_20707.getDefaultInstance()) {
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
            C2S_LootReward_20707 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReward_20707)ArtifactSkinActivityMsg.C2S_LootReward_20707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReward_20707)e.getUnfinishedMessage();
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

   public static final class S2C_LootReward_20708 extends GeneratedMessageV3 implements S2C_LootReward_20708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int ISENJOY_FIELD_NUMBER = 2;
      private boolean isEnjoy_;
      public static final int CURLOOTNUM_FIELD_NUMBER = 3;
      private int curLootNum_;
      private byte memoizedIsInitialized;
      private static final S2C_LootReward_20708 DEFAULT_INSTANCE = new S2C_LootReward_20708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootReward_20708> PARSER = new AbstractParser<S2C_LootReward_20708>() {
         public S2C_LootReward_20708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootReward_20708(input, extensionRegistry);
         }
      };

      private S2C_LootReward_20708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootReward_20708() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootReward_20708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootReward_20708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20708.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootReward_20708)) {
            return super.equals(obj);
         } else {
            S2C_LootReward_20708 other = (S2C_LootReward_20708)obj;
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

      public static S2C_LootReward_20708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data);
      }

      public static S2C_LootReward_20708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootReward_20708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootReward_20708 parseFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootReward_20708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootReward_20708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootReward_20708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootReward_20708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootReward_20708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootReward_20708> parser() {
         return PARSER;
      }

      public Parser<S2C_LootReward_20708> getParserForType() {
         return PARSER;
      }

      public S2C_LootReward_20708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootReward_20708OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private boolean isEnjoy_;
         private int curLootNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootReward_20708.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootReward_20708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootReward_20708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LootReward_20708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootReward_20708.emptyIntList();
            this.bitField0_ &= -2;
            this.isEnjoy_ = false;
            this.bitField0_ &= -3;
            this.curLootNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootReward_20708_descriptor;
         }

         public S2C_LootReward_20708 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LootReward_20708.getDefaultInstance();
         }

         public S2C_LootReward_20708 build() {
            S2C_LootReward_20708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootReward_20708 buildPartial() {
            S2C_LootReward_20708 result = new S2C_LootReward_20708(this);
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
            if (other instanceof S2C_LootReward_20708) {
               return this.mergeFrom((S2C_LootReward_20708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootReward_20708 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LootReward_20708.getDefaultInstance()) {
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
            S2C_LootReward_20708 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootReward_20708)ArtifactSkinActivityMsg.S2C_LootReward_20708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootReward_20708)e.getUnfinishedMessage();
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
               this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootReward_20708.mutableCopy(this.rewardId_);
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
            this.rewardId_ = ArtifactSkinActivityMsg.S2C_LootReward_20708.emptyIntList();
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

   public static final class C2S_LootReset_20709 extends GeneratedMessageV3 implements C2S_LootReset_20709OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LootReset_20709 DEFAULT_INSTANCE = new C2S_LootReset_20709();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootReset_20709> PARSER = new AbstractParser<C2S_LootReset_20709>() {
         public C2S_LootReset_20709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootReset_20709(input, extensionRegistry);
         }
      };

      private C2S_LootReset_20709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootReset_20709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootReset_20709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootReset_20709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_20709.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootReset_20709)) {
            return super.equals(obj);
         } else {
            C2S_LootReset_20709 other = (C2S_LootReset_20709)obj;
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

      public static C2S_LootReset_20709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_20709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_20709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_20709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_20709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data);
      }

      public static C2S_LootReset_20709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootReset_20709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootReset_20709 parseFrom(InputStream input) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_20709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_20709 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootReset_20709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootReset_20709 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootReset_20709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootReset_20709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootReset_20709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootReset_20709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootReset_20709> parser() {
         return PARSER;
      }

      public Parser<C2S_LootReset_20709> getParserForType() {
         return PARSER;
      }

      public C2S_LootReset_20709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootReset_20709OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootReset_20709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LootReset_20709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootReset_20709_descriptor;
         }

         public C2S_LootReset_20709 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LootReset_20709.getDefaultInstance();
         }

         public C2S_LootReset_20709 build() {
            C2S_LootReset_20709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootReset_20709 buildPartial() {
            C2S_LootReset_20709 result = new C2S_LootReset_20709(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LootReset_20709) {
               return this.mergeFrom((C2S_LootReset_20709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootReset_20709 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LootReset_20709.getDefaultInstance()) {
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
            C2S_LootReset_20709 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootReset_20709)ArtifactSkinActivityMsg.C2S_LootReset_20709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootReset_20709)e.getUnfinishedMessage();
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

   public static final class C2S_LootEnjoy_20711 extends GeneratedMessageV3 implements C2S_LootEnjoy_20711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_LootEnjoy_20711 DEFAULT_INSTANCE = new C2S_LootEnjoy_20711();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LootEnjoy_20711> PARSER = new AbstractParser<C2S_LootEnjoy_20711>() {
         public C2S_LootEnjoy_20711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LootEnjoy_20711(input, extensionRegistry);
         }
      };

      private C2S_LootEnjoy_20711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LootEnjoy_20711() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LootEnjoy_20711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LootEnjoy_20711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20711.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LootEnjoy_20711)) {
            return super.equals(obj);
         } else {
            C2S_LootEnjoy_20711 other = (C2S_LootEnjoy_20711)obj;
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

      public static C2S_LootEnjoy_20711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data);
      }

      public static C2S_LootEnjoy_20711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LootEnjoy_20711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LootEnjoy_20711 parseFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20711 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LootEnjoy_20711 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LootEnjoy_20711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LootEnjoy_20711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LootEnjoy_20711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LootEnjoy_20711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LootEnjoy_20711> parser() {
         return PARSER;
      }

      public Parser<C2S_LootEnjoy_20711> getParserForType() {
         return PARSER;
      }

      public C2S_LootEnjoy_20711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LootEnjoy_20711OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LootEnjoy_20711.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LootEnjoy_20711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LootEnjoy_20711_descriptor;
         }

         public C2S_LootEnjoy_20711 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LootEnjoy_20711.getDefaultInstance();
         }

         public C2S_LootEnjoy_20711 build() {
            C2S_LootEnjoy_20711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LootEnjoy_20711 buildPartial() {
            C2S_LootEnjoy_20711 result = new C2S_LootEnjoy_20711(this);
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
            if (other instanceof C2S_LootEnjoy_20711) {
               return this.mergeFrom((C2S_LootEnjoy_20711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LootEnjoy_20711 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LootEnjoy_20711.getDefaultInstance()) {
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
            C2S_LootEnjoy_20711 parsedMessage = null;

            try {
               parsedMessage = (C2S_LootEnjoy_20711)ArtifactSkinActivityMsg.C2S_LootEnjoy_20711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LootEnjoy_20711)e.getUnfinishedMessage();
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

   public static final class S2C_LootEnjoy_20712 extends GeneratedMessageV3 implements S2C_LootEnjoy_20712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_LootEnjoy_20712 DEFAULT_INSTANCE = new S2C_LootEnjoy_20712();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LootEnjoy_20712> PARSER = new AbstractParser<S2C_LootEnjoy_20712>() {
         public S2C_LootEnjoy_20712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LootEnjoy_20712(input, extensionRegistry);
         }
      };

      private S2C_LootEnjoy_20712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LootEnjoy_20712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LootEnjoy_20712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LootEnjoy_20712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20712.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LootEnjoy_20712)) {
            return super.equals(obj);
         } else {
            S2C_LootEnjoy_20712 other = (S2C_LootEnjoy_20712)obj;
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

      public static S2C_LootEnjoy_20712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data);
      }

      public static S2C_LootEnjoy_20712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LootEnjoy_20712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LootEnjoy_20712 parseFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20712 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LootEnjoy_20712 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LootEnjoy_20712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LootEnjoy_20712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LootEnjoy_20712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LootEnjoy_20712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LootEnjoy_20712> parser() {
         return PARSER;
      }

      public Parser<S2C_LootEnjoy_20712> getParserForType() {
         return PARSER;
      }

      public S2C_LootEnjoy_20712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LootEnjoy_20712OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LootEnjoy_20712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LootEnjoy_20712.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LootEnjoy_20712_descriptor;
         }

         public S2C_LootEnjoy_20712 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LootEnjoy_20712.getDefaultInstance();
         }

         public S2C_LootEnjoy_20712 build() {
            S2C_LootEnjoy_20712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LootEnjoy_20712 buildPartial() {
            S2C_LootEnjoy_20712 result = new S2C_LootEnjoy_20712(this);
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
            if (other instanceof S2C_LootEnjoy_20712) {
               return this.mergeFrom((S2C_LootEnjoy_20712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LootEnjoy_20712 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LootEnjoy_20712.getDefaultInstance()) {
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
            S2C_LootEnjoy_20712 parsedMessage = null;

            try {
               parsedMessage = (S2C_LootEnjoy_20712)ArtifactSkinActivityMsg.S2C_LootEnjoy_20712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LootEnjoy_20712)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureMain_20713 extends GeneratedMessageV3 implements C2S_TreasureMain_20713OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMain_20713 DEFAULT_INSTANCE = new C2S_TreasureMain_20713();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMain_20713> PARSER = new AbstractParser<C2S_TreasureMain_20713>() {
         public C2S_TreasureMain_20713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMain_20713(input, extensionRegistry);
         }
      };

      private C2S_TreasureMain_20713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMain_20713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMain_20713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMain_20713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_20713.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMain_20713)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMain_20713 other = (C2S_TreasureMain_20713)obj;
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

      public static C2S_TreasureMain_20713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_20713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_20713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_20713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_20713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMain_20713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMain_20713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMain_20713 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_20713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_20713 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_20713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMain_20713 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMain_20713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMain_20713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMain_20713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMain_20713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMain_20713> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMain_20713> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMain_20713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMain_20713OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMain_20713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_TreasureMain_20713.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMain_20713_descriptor;
         }

         public C2S_TreasureMain_20713 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_TreasureMain_20713.getDefaultInstance();
         }

         public C2S_TreasureMain_20713 build() {
            C2S_TreasureMain_20713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMain_20713 buildPartial() {
            C2S_TreasureMain_20713 result = new C2S_TreasureMain_20713(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMain_20713) {
               return this.mergeFrom((C2S_TreasureMain_20713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMain_20713 other) {
            if (other == ArtifactSkinActivityMsg.C2S_TreasureMain_20713.getDefaultInstance()) {
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
            C2S_TreasureMain_20713 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMain_20713)ArtifactSkinActivityMsg.C2S_TreasureMain_20713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMain_20713)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMain_20714 extends GeneratedMessageV3 implements S2C_TreasureMain_20714OrBuilder {
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
      private static final S2C_TreasureMain_20714 DEFAULT_INSTANCE = new S2C_TreasureMain_20714();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMain_20714> PARSER = new AbstractParser<S2C_TreasureMain_20714>() {
         public S2C_TreasureMain_20714 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMain_20714(input, extensionRegistry);
         }
      };

      private S2C_TreasureMain_20714(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMain_20714() {
         this.memoizedIsInitialized = -1;
         this.gotGrid_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMain_20714();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMain_20714(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_20714.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureMain_20714)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMain_20714 other = (S2C_TreasureMain_20714)obj;
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

      public static S2C_TreasureMain_20714 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_20714 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_20714 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_20714 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_20714 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMain_20714 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMain_20714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMain_20714 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_20714 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_20714 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_20714 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMain_20714 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMain_20714 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMain_20714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMain_20714 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMain_20714 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMain_20714> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMain_20714> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMain_20714 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMain_20714OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;
         private int appointCount_;
         private int grid_;
         private Internal.IntList gotGrid_;
         private boolean needBattle_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMain_20714.class, Builder.class);
         }

         private Builder() {
            this.gotGrid_ = ArtifactSkinActivityMsg.S2C_TreasureMain_20714.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotGrid_ = ArtifactSkinActivityMsg.S2C_TreasureMain_20714.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_TreasureMain_20714.alwaysUseFieldBuilders) {
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
            this.gotGrid_ = ArtifactSkinActivityMsg.S2C_TreasureMain_20714.emptyIntList();
            this.bitField0_ &= -17;
            this.needBattle_ = false;
            this.bitField0_ &= -33;
            this.appointCountBuy_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMain_20714_descriptor;
         }

         public S2C_TreasureMain_20714 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_TreasureMain_20714.getDefaultInstance();
         }

         public S2C_TreasureMain_20714 build() {
            S2C_TreasureMain_20714 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMain_20714 buildPartial() {
            S2C_TreasureMain_20714 result = new S2C_TreasureMain_20714(this);
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
            if (other instanceof S2C_TreasureMain_20714) {
               return this.mergeFrom((S2C_TreasureMain_20714)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMain_20714 other) {
            if (other == ArtifactSkinActivityMsg.S2C_TreasureMain_20714.getDefaultInstance()) {
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
            S2C_TreasureMain_20714 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMain_20714)ArtifactSkinActivityMsg.S2C_TreasureMain_20714.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMain_20714)e.getUnfinishedMessage();
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
               this.gotGrid_ = ArtifactSkinActivityMsg.S2C_TreasureMain_20714.mutableCopy(this.gotGrid_);
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
            this.gotGrid_ = ArtifactSkinActivityMsg.S2C_TreasureMain_20714.emptyIntList();
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

   public static final class C2S_TreasureRollDice_20715 extends GeneratedMessageV3 implements C2S_TreasureRollDice_20715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureRollDice_20715 DEFAULT_INSTANCE = new C2S_TreasureRollDice_20715();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureRollDice_20715> PARSER = new AbstractParser<C2S_TreasureRollDice_20715>() {
         public C2S_TreasureRollDice_20715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureRollDice_20715(input, extensionRegistry);
         }
      };

      private C2S_TreasureRollDice_20715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureRollDice_20715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureRollDice_20715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureRollDice_20715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_20715.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureRollDice_20715)) {
            return super.equals(obj);
         } else {
            C2S_TreasureRollDice_20715 other = (C2S_TreasureRollDice_20715)obj;
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

      public static C2S_TreasureRollDice_20715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureRollDice_20715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_20715 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_20715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureRollDice_20715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureRollDice_20715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureRollDice_20715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureRollDice_20715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureRollDice_20715> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureRollDice_20715> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureRollDice_20715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureRollDice_20715OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureRollDice_20715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_TreasureRollDice_20715.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureRollDice_20715_descriptor;
         }

         public C2S_TreasureRollDice_20715 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_TreasureRollDice_20715.getDefaultInstance();
         }

         public C2S_TreasureRollDice_20715 build() {
            C2S_TreasureRollDice_20715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureRollDice_20715 buildPartial() {
            C2S_TreasureRollDice_20715 result = new C2S_TreasureRollDice_20715(this);
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
            if (other instanceof C2S_TreasureRollDice_20715) {
               return this.mergeFrom((C2S_TreasureRollDice_20715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureRollDice_20715 other) {
            if (other == ArtifactSkinActivityMsg.C2S_TreasureRollDice_20715.getDefaultInstance()) {
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
            C2S_TreasureRollDice_20715 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureRollDice_20715)ArtifactSkinActivityMsg.C2S_TreasureRollDice_20715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureRollDice_20715)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureRollDice_20716 extends GeneratedMessageV3 implements S2C_TreasureRollDice_20716OrBuilder {
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
      private static final S2C_TreasureRollDice_20716 DEFAULT_INSTANCE = new S2C_TreasureRollDice_20716();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureRollDice_20716> PARSER = new AbstractParser<S2C_TreasureRollDice_20716>() {
         public S2C_TreasureRollDice_20716 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureRollDice_20716(input, extensionRegistry);
         }
      };

      private S2C_TreasureRollDice_20716(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureRollDice_20716() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureRollDice_20716();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureRollDice_20716(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_20716.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureRollDice_20716)) {
            return super.equals(obj);
         } else {
            S2C_TreasureRollDice_20716 other = (S2C_TreasureRollDice_20716)obj;
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

      public static S2C_TreasureRollDice_20716 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureRollDice_20716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_20716 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_20716 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureRollDice_20716 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureRollDice_20716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureRollDice_20716 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureRollDice_20716 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureRollDice_20716> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureRollDice_20716> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureRollDice_20716 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureRollDice_20716OrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;
         private int grid_;
         private int count_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureRollDice_20716.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_TreasureRollDice_20716.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureRollDice_20716_descriptor;
         }

         public S2C_TreasureRollDice_20716 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_TreasureRollDice_20716.getDefaultInstance();
         }

         public S2C_TreasureRollDice_20716 build() {
            S2C_TreasureRollDice_20716 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureRollDice_20716 buildPartial() {
            S2C_TreasureRollDice_20716 result = new S2C_TreasureRollDice_20716(this);
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
            if (other instanceof S2C_TreasureRollDice_20716) {
               return this.mergeFrom((S2C_TreasureRollDice_20716)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureRollDice_20716 other) {
            if (other == ArtifactSkinActivityMsg.S2C_TreasureRollDice_20716.getDefaultInstance()) {
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
            S2C_TreasureRollDice_20716 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureRollDice_20716)ArtifactSkinActivityMsg.S2C_TreasureRollDice_20716.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureRollDice_20716)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureMove_20717 extends GeneratedMessageV3 implements C2S_TreasureMove_20717OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureMove_20717 DEFAULT_INSTANCE = new C2S_TreasureMove_20717();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureMove_20717> PARSER = new AbstractParser<C2S_TreasureMove_20717>() {
         public C2S_TreasureMove_20717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureMove_20717(input, extensionRegistry);
         }
      };

      private C2S_TreasureMove_20717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureMove_20717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureMove_20717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureMove_20717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_20717.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureMove_20717)) {
            return super.equals(obj);
         } else {
            C2S_TreasureMove_20717 other = (C2S_TreasureMove_20717)obj;
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

      public static C2S_TreasureMove_20717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_20717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_20717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_20717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_20717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data);
      }

      public static C2S_TreasureMove_20717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureMove_20717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureMove_20717 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_20717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_20717 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_20717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureMove_20717 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureMove_20717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureMove_20717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureMove_20717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureMove_20717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureMove_20717> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureMove_20717> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureMove_20717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureMove_20717OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureMove_20717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_TreasureMove_20717.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureMove_20717_descriptor;
         }

         public C2S_TreasureMove_20717 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_TreasureMove_20717.getDefaultInstance();
         }

         public C2S_TreasureMove_20717 build() {
            C2S_TreasureMove_20717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureMove_20717 buildPartial() {
            C2S_TreasureMove_20717 result = new C2S_TreasureMove_20717(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureMove_20717) {
               return this.mergeFrom((C2S_TreasureMove_20717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureMove_20717 other) {
            if (other == ArtifactSkinActivityMsg.C2S_TreasureMove_20717.getDefaultInstance()) {
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
            C2S_TreasureMove_20717 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureMove_20717)ArtifactSkinActivityMsg.C2S_TreasureMove_20717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureMove_20717)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureMove_20718 extends GeneratedMessageV3 implements S2C_TreasureMove_20718OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLE_FIELD_NUMBER = 1;
      private int battle_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureMove_20718 DEFAULT_INSTANCE = new S2C_TreasureMove_20718();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureMove_20718> PARSER = new AbstractParser<S2C_TreasureMove_20718>() {
         public S2C_TreasureMove_20718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureMove_20718(input, extensionRegistry);
         }
      };

      private S2C_TreasureMove_20718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureMove_20718() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureMove_20718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureMove_20718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_20718.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureMove_20718)) {
            return super.equals(obj);
         } else {
            S2C_TreasureMove_20718 other = (S2C_TreasureMove_20718)obj;
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

      public static S2C_TreasureMove_20718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_20718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_20718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_20718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_20718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data);
      }

      public static S2C_TreasureMove_20718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureMove_20718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureMove_20718 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_20718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_20718 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_20718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureMove_20718 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureMove_20718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureMove_20718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureMove_20718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureMove_20718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureMove_20718> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureMove_20718> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureMove_20718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureMove_20718OrBuilder {
         private int bitField0_;
         private int battle_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureMove_20718.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_TreasureMove_20718.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.battle_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureMove_20718_descriptor;
         }

         public S2C_TreasureMove_20718 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_TreasureMove_20718.getDefaultInstance();
         }

         public S2C_TreasureMove_20718 build() {
            S2C_TreasureMove_20718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureMove_20718 buildPartial() {
            S2C_TreasureMove_20718 result = new S2C_TreasureMove_20718(this);
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
            if (other instanceof S2C_TreasureMove_20718) {
               return this.mergeFrom((S2C_TreasureMove_20718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureMove_20718 other) {
            if (other == ArtifactSkinActivityMsg.S2C_TreasureMove_20718.getDefaultInstance()) {
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
            S2C_TreasureMove_20718 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureMove_20718)ArtifactSkinActivityMsg.S2C_TreasureMove_20718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureMove_20718)e.getUnfinishedMessage();
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

   public static final class C2S_LineMain_20719 extends GeneratedMessageV3 implements C2S_LineMain_20719OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LineMain_20719 DEFAULT_INSTANCE = new C2S_LineMain_20719();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineMain_20719> PARSER = new AbstractParser<C2S_LineMain_20719>() {
         public C2S_LineMain_20719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineMain_20719(input, extensionRegistry);
         }
      };

      private C2S_LineMain_20719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineMain_20719() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineMain_20719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineMain_20719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_20719.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineMain_20719)) {
            return super.equals(obj);
         } else {
            C2S_LineMain_20719 other = (C2S_LineMain_20719)obj;
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

      public static C2S_LineMain_20719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_20719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_20719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_20719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_20719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data);
      }

      public static C2S_LineMain_20719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineMain_20719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineMain_20719 parseFrom(InputStream input) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_20719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_20719 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineMain_20719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineMain_20719 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineMain_20719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineMain_20719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineMain_20719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineMain_20719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineMain_20719> parser() {
         return PARSER;
      }

      public Parser<C2S_LineMain_20719> getParserForType() {
         return PARSER;
      }

      public C2S_LineMain_20719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineMain_20719OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineMain_20719.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LineMain_20719.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineMain_20719_descriptor;
         }

         public C2S_LineMain_20719 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LineMain_20719.getDefaultInstance();
         }

         public C2S_LineMain_20719 build() {
            C2S_LineMain_20719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineMain_20719 buildPartial() {
            C2S_LineMain_20719 result = new C2S_LineMain_20719(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LineMain_20719) {
               return this.mergeFrom((C2S_LineMain_20719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineMain_20719 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LineMain_20719.getDefaultInstance()) {
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
            C2S_LineMain_20719 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineMain_20719)ArtifactSkinActivityMsg.C2S_LineMain_20719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineMain_20719)e.getUnfinishedMessage();
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

   public static final class S2C_LineMain_20720 extends GeneratedMessageV3 implements S2C_LineMain_20720OrBuilder {
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
      private static final S2C_LineMain_20720 DEFAULT_INSTANCE = new S2C_LineMain_20720();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineMain_20720> PARSER = new AbstractParser<S2C_LineMain_20720>() {
         public S2C_LineMain_20720 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineMain_20720(input, extensionRegistry);
         }
      };

      private S2C_LineMain_20720(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineMain_20720() {
         this.memoizedIsInitialized = -1;
         this.gridTask_ = Collections.emptyList();
         this.gotLineBox_ = emptyIntList();
         this.gotFinalBox_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineMain_20720();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineMain_20720(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.gridTask_.add(input.readMessage(ArtifactSkinActivityMsg.GridTaskData.PARSER, extensionRegistry));
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_20720.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineMain_20720)) {
            return super.equals(obj);
         } else {
            S2C_LineMain_20720 other = (S2C_LineMain_20720)obj;
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

      public static S2C_LineMain_20720 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_20720 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_20720 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_20720 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_20720 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data);
      }

      public static S2C_LineMain_20720 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineMain_20720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineMain_20720 parseFrom(InputStream input) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_20720 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_20720 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineMain_20720 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineMain_20720 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineMain_20720 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineMain_20720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineMain_20720 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineMain_20720 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineMain_20720> parser() {
         return PARSER;
      }

      public Parser<S2C_LineMain_20720> getParserForType() {
         return PARSER;
      }

      public S2C_LineMain_20720 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineMain_20720OrBuilder {
         private int bitField0_;
         private List<GridTaskData> gridTask_;
         private RepeatedFieldBuilderV3<GridTaskData, GridTaskData.Builder, GridTaskDataOrBuilder> gridTaskBuilder_;
         private int lineBoxCount_;
         private Internal.IntList gotLineBox_;
         private Internal.IntList gotFinalBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineMain_20720.class, Builder.class);
         }

         private Builder() {
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.gotFinalBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gridTask_ = Collections.emptyList();
            this.gotLineBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.gotFinalBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LineMain_20720.alwaysUseFieldBuilders) {
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
            this.gotLineBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.bitField0_ &= -5;
            this.gotFinalBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineMain_20720_descriptor;
         }

         public S2C_LineMain_20720 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LineMain_20720.getDefaultInstance();
         }

         public S2C_LineMain_20720 build() {
            S2C_LineMain_20720 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineMain_20720 buildPartial() {
            S2C_LineMain_20720 result = new S2C_LineMain_20720(this);
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
            if (other instanceof S2C_LineMain_20720) {
               return this.mergeFrom((S2C_LineMain_20720)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineMain_20720 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LineMain_20720.getDefaultInstance()) {
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
                     this.gridTaskBuilder_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.alwaysUseFieldBuilders ? this.getGridTaskFieldBuilder() : null;
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
            S2C_LineMain_20720 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineMain_20720)ArtifactSkinActivityMsg.S2C_LineMain_20720.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineMain_20720)e.getUnfinishedMessage();
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
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(ArtifactSkinActivityMsg.GridTaskData.getDefaultInstance());
         }

         public GridTaskData.Builder addGridTaskBuilder(int index) {
            return (GridTaskData.Builder)this.getGridTaskFieldBuilder().addBuilder(index, ArtifactSkinActivityMsg.GridTaskData.getDefaultInstance());
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
               this.gotLineBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.mutableCopy(this.gotLineBox_);
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
            this.gotLineBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureGotFinalBoxIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotFinalBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.mutableCopy(this.gotFinalBox_);
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
            this.gotFinalBox_ = ArtifactSkinActivityMsg.S2C_LineMain_20720.emptyIntList();
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

   public static final class C2S_LineBoxReward_20721 extends GeneratedMessageV3 implements C2S_LineBoxReward_20721OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_LineBoxReward_20721 DEFAULT_INSTANCE = new C2S_LineBoxReward_20721();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineBoxReward_20721> PARSER = new AbstractParser<C2S_LineBoxReward_20721>() {
         public C2S_LineBoxReward_20721 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineBoxReward_20721(input, extensionRegistry);
         }
      };

      private C2S_LineBoxReward_20721(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineBoxReward_20721() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineBoxReward_20721();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineBoxReward_20721(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_20721.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineBoxReward_20721)) {
            return super.equals(obj);
         } else {
            C2S_LineBoxReward_20721 other = (C2S_LineBoxReward_20721)obj;
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

      public static C2S_LineBoxReward_20721 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_20721 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_20721 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_20721 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_20721 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data);
      }

      public static C2S_LineBoxReward_20721 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineBoxReward_20721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineBoxReward_20721 parseFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_20721 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_20721 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_20721 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineBoxReward_20721 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineBoxReward_20721 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineBoxReward_20721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineBoxReward_20721 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineBoxReward_20721 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineBoxReward_20721> parser() {
         return PARSER;
      }

      public Parser<C2S_LineBoxReward_20721> getParserForType() {
         return PARSER;
      }

      public C2S_LineBoxReward_20721 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineBoxReward_20721OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineBoxReward_20721.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LineBoxReward_20721.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineBoxReward_20721_descriptor;
         }

         public C2S_LineBoxReward_20721 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LineBoxReward_20721.getDefaultInstance();
         }

         public C2S_LineBoxReward_20721 build() {
            C2S_LineBoxReward_20721 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineBoxReward_20721 buildPartial() {
            C2S_LineBoxReward_20721 result = new C2S_LineBoxReward_20721(this);
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
            if (other instanceof C2S_LineBoxReward_20721) {
               return this.mergeFrom((C2S_LineBoxReward_20721)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineBoxReward_20721 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LineBoxReward_20721.getDefaultInstance()) {
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
            C2S_LineBoxReward_20721 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineBoxReward_20721)ArtifactSkinActivityMsg.C2S_LineBoxReward_20721.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineBoxReward_20721)e.getUnfinishedMessage();
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

   public static final class S2C_LineBoxReward_20722 extends GeneratedMessageV3 implements S2C_LineBoxReward_20722OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_LineBoxReward_20722 DEFAULT_INSTANCE = new S2C_LineBoxReward_20722();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineBoxReward_20722> PARSER = new AbstractParser<S2C_LineBoxReward_20722>() {
         public S2C_LineBoxReward_20722 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineBoxReward_20722(input, extensionRegistry);
         }
      };

      private S2C_LineBoxReward_20722(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineBoxReward_20722() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineBoxReward_20722();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineBoxReward_20722(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_20722.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineBoxReward_20722)) {
            return super.equals(obj);
         } else {
            S2C_LineBoxReward_20722 other = (S2C_LineBoxReward_20722)obj;
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

      public static S2C_LineBoxReward_20722 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_20722 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_20722 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_20722 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_20722 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data);
      }

      public static S2C_LineBoxReward_20722 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineBoxReward_20722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineBoxReward_20722 parseFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_20722 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_20722 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_20722 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineBoxReward_20722 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineBoxReward_20722 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineBoxReward_20722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineBoxReward_20722 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineBoxReward_20722 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineBoxReward_20722> parser() {
         return PARSER;
      }

      public Parser<S2C_LineBoxReward_20722> getParserForType() {
         return PARSER;
      }

      public S2C_LineBoxReward_20722 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineBoxReward_20722OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineBoxReward_20722.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LineBoxReward_20722.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineBoxReward_20722_descriptor;
         }

         public S2C_LineBoxReward_20722 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LineBoxReward_20722.getDefaultInstance();
         }

         public S2C_LineBoxReward_20722 build() {
            S2C_LineBoxReward_20722 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineBoxReward_20722 buildPartial() {
            S2C_LineBoxReward_20722 result = new S2C_LineBoxReward_20722(this);
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
            if (other instanceof S2C_LineBoxReward_20722) {
               return this.mergeFrom((S2C_LineBoxReward_20722)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineBoxReward_20722 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LineBoxReward_20722.getDefaultInstance()) {
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
            S2C_LineBoxReward_20722 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineBoxReward_20722)ArtifactSkinActivityMsg.S2C_LineBoxReward_20722.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineBoxReward_20722)e.getUnfinishedMessage();
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

   public static final class S2C_LineTaskNotify_20724 extends GeneratedMessageV3 implements S2C_LineTaskNotify_20724OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskNotify_20724 DEFAULT_INSTANCE = new S2C_LineTaskNotify_20724();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskNotify_20724> PARSER = new AbstractParser<S2C_LineTaskNotify_20724>() {
         public S2C_LineTaskNotify_20724 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskNotify_20724(input, extensionRegistry);
         }
      };

      private S2C_LineTaskNotify_20724(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskNotify_20724() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskNotify_20724();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskNotify_20724(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_20724.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineTaskNotify_20724)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskNotify_20724 other = (S2C_LineTaskNotify_20724)obj;
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

      public static S2C_LineTaskNotify_20724 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskNotify_20724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_20724 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_20724 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskNotify_20724 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskNotify_20724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskNotify_20724 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskNotify_20724 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskNotify_20724> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskNotify_20724> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskNotify_20724 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskNotify_20724OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskNotify_20724.class, Builder.class);
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
            if (ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskNotify_20724_descriptor;
         }

         public S2C_LineTaskNotify_20724 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.getDefaultInstance();
         }

         public S2C_LineTaskNotify_20724 build() {
            S2C_LineTaskNotify_20724 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskNotify_20724 buildPartial() {
            S2C_LineTaskNotify_20724 result = new S2C_LineTaskNotify_20724(this);
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
            if (other instanceof S2C_LineTaskNotify_20724) {
               return this.mergeFrom((S2C_LineTaskNotify_20724)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskNotify_20724 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.getDefaultInstance()) {
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
                     this.taskBuilder_ = ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_LineTaskNotify_20724 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskNotify_20724)ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskNotify_20724)e.getUnfinishedMessage();
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

   public static final class C2S_LineTaskReward_20725 extends GeneratedMessageV3 implements C2S_LineTaskReward_20725OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final C2S_LineTaskReward_20725 DEFAULT_INSTANCE = new C2S_LineTaskReward_20725();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LineTaskReward_20725> PARSER = new AbstractParser<C2S_LineTaskReward_20725>() {
         public C2S_LineTaskReward_20725 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LineTaskReward_20725(input, extensionRegistry);
         }
      };

      private C2S_LineTaskReward_20725(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LineTaskReward_20725() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LineTaskReward_20725();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LineTaskReward_20725(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_20725.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LineTaskReward_20725)) {
            return super.equals(obj);
         } else {
            C2S_LineTaskReward_20725 other = (C2S_LineTaskReward_20725)obj;
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

      public static C2S_LineTaskReward_20725 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_20725 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_20725 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_20725 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_20725 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data);
      }

      public static C2S_LineTaskReward_20725 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LineTaskReward_20725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LineTaskReward_20725 parseFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_20725 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_20725 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_20725 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LineTaskReward_20725 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LineTaskReward_20725 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LineTaskReward_20725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LineTaskReward_20725 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LineTaskReward_20725 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LineTaskReward_20725> parser() {
         return PARSER;
      }

      public Parser<C2S_LineTaskReward_20725> getParserForType() {
         return PARSER;
      }

      public C2S_LineTaskReward_20725 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LineTaskReward_20725OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LineTaskReward_20725.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_LineTaskReward_20725.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_LineTaskReward_20725_descriptor;
         }

         public C2S_LineTaskReward_20725 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_LineTaskReward_20725.getDefaultInstance();
         }

         public C2S_LineTaskReward_20725 build() {
            C2S_LineTaskReward_20725 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LineTaskReward_20725 buildPartial() {
            C2S_LineTaskReward_20725 result = new C2S_LineTaskReward_20725(this);
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
            if (other instanceof C2S_LineTaskReward_20725) {
               return this.mergeFrom((C2S_LineTaskReward_20725)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LineTaskReward_20725 other) {
            if (other == ArtifactSkinActivityMsg.C2S_LineTaskReward_20725.getDefaultInstance()) {
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
            C2S_LineTaskReward_20725 parsedMessage = null;

            try {
               parsedMessage = (C2S_LineTaskReward_20725)ArtifactSkinActivityMsg.C2S_LineTaskReward_20725.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LineTaskReward_20725)e.getUnfinishedMessage();
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

   public static final class S2C_LineTaskReward_20726 extends GeneratedMessageV3 implements S2C_LineTaskReward_20726OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private int task_;
      private byte memoizedIsInitialized;
      private static final S2C_LineTaskReward_20726 DEFAULT_INSTANCE = new S2C_LineTaskReward_20726();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LineTaskReward_20726> PARSER = new AbstractParser<S2C_LineTaskReward_20726>() {
         public S2C_LineTaskReward_20726 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LineTaskReward_20726(input, extensionRegistry);
         }
      };

      private S2C_LineTaskReward_20726(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LineTaskReward_20726() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LineTaskReward_20726();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LineTaskReward_20726(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_20726.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LineTaskReward_20726)) {
            return super.equals(obj);
         } else {
            S2C_LineTaskReward_20726 other = (S2C_LineTaskReward_20726)obj;
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

      public static S2C_LineTaskReward_20726 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_20726 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_20726 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_20726 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_20726 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data);
      }

      public static S2C_LineTaskReward_20726 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LineTaskReward_20726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LineTaskReward_20726 parseFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_20726 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_20726 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_20726 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LineTaskReward_20726 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LineTaskReward_20726 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LineTaskReward_20726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LineTaskReward_20726 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LineTaskReward_20726 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LineTaskReward_20726> parser() {
         return PARSER;
      }

      public Parser<S2C_LineTaskReward_20726> getParserForType() {
         return PARSER;
      }

      public S2C_LineTaskReward_20726 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LineTaskReward_20726OrBuilder {
         private int bitField0_;
         private int task_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LineTaskReward_20726.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.task_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_LineTaskReward_20726_descriptor;
         }

         public S2C_LineTaskReward_20726 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.getDefaultInstance();
         }

         public S2C_LineTaskReward_20726 build() {
            S2C_LineTaskReward_20726 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LineTaskReward_20726 buildPartial() {
            S2C_LineTaskReward_20726 result = new S2C_LineTaskReward_20726(this);
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
            if (other instanceof S2C_LineTaskReward_20726) {
               return this.mergeFrom((S2C_LineTaskReward_20726)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LineTaskReward_20726 other) {
            if (other == ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.getDefaultInstance()) {
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
            S2C_LineTaskReward_20726 parsedMessage = null;

            try {
               parsedMessage = (S2C_LineTaskReward_20726)ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LineTaskReward_20726)e.getUnfinishedMessage();
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

   public static final class C2S_FinalBoxReward_20727 extends GeneratedMessageV3 implements C2S_FinalBoxReward_20727OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final C2S_FinalBoxReward_20727 DEFAULT_INSTANCE = new C2S_FinalBoxReward_20727();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FinalBoxReward_20727> PARSER = new AbstractParser<C2S_FinalBoxReward_20727>() {
         public C2S_FinalBoxReward_20727 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FinalBoxReward_20727(input, extensionRegistry);
         }
      };

      private C2S_FinalBoxReward_20727(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FinalBoxReward_20727() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FinalBoxReward_20727();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FinalBoxReward_20727(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_20727.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FinalBoxReward_20727)) {
            return super.equals(obj);
         } else {
            C2S_FinalBoxReward_20727 other = (C2S_FinalBoxReward_20727)obj;
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

      public static C2S_FinalBoxReward_20727 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinalBoxReward_20727)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_20727 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_20727 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinalBoxReward_20727 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinalBoxReward_20727)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FinalBoxReward_20727 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FinalBoxReward_20727 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FinalBoxReward_20727> parser() {
         return PARSER;
      }

      public Parser<C2S_FinalBoxReward_20727> getParserForType() {
         return PARSER;
      }

      public C2S_FinalBoxReward_20727 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FinalBoxReward_20727OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinalBoxReward_20727.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_FinalBoxReward_20727.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_FinalBoxReward_20727_descriptor;
         }

         public C2S_FinalBoxReward_20727 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_FinalBoxReward_20727.getDefaultInstance();
         }

         public C2S_FinalBoxReward_20727 build() {
            C2S_FinalBoxReward_20727 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FinalBoxReward_20727 buildPartial() {
            C2S_FinalBoxReward_20727 result = new C2S_FinalBoxReward_20727(this);
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
            if (other instanceof C2S_FinalBoxReward_20727) {
               return this.mergeFrom((C2S_FinalBoxReward_20727)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FinalBoxReward_20727 other) {
            if (other == ArtifactSkinActivityMsg.C2S_FinalBoxReward_20727.getDefaultInstance()) {
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
            C2S_FinalBoxReward_20727 parsedMessage = null;

            try {
               parsedMessage = (C2S_FinalBoxReward_20727)ArtifactSkinActivityMsg.C2S_FinalBoxReward_20727.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FinalBoxReward_20727)e.getUnfinishedMessage();
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

   public static final class S2C_FinalBoxReward_20728 extends GeneratedMessageV3 implements S2C_FinalBoxReward_20728OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private int box_;
      private byte memoizedIsInitialized;
      private static final S2C_FinalBoxReward_20728 DEFAULT_INSTANCE = new S2C_FinalBoxReward_20728();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FinalBoxReward_20728> PARSER = new AbstractParser<S2C_FinalBoxReward_20728>() {
         public S2C_FinalBoxReward_20728 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FinalBoxReward_20728(input, extensionRegistry);
         }
      };

      private S2C_FinalBoxReward_20728(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FinalBoxReward_20728() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FinalBoxReward_20728();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FinalBoxReward_20728(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_20728.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FinalBoxReward_20728)) {
            return super.equals(obj);
         } else {
            S2C_FinalBoxReward_20728 other = (S2C_FinalBoxReward_20728)obj;
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

      public static S2C_FinalBoxReward_20728 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinalBoxReward_20728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_20728 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_20728 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinalBoxReward_20728 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinalBoxReward_20728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FinalBoxReward_20728 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FinalBoxReward_20728 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FinalBoxReward_20728> parser() {
         return PARSER;
      }

      public Parser<S2C_FinalBoxReward_20728> getParserForType() {
         return PARSER;
      }

      public S2C_FinalBoxReward_20728 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FinalBoxReward_20728OrBuilder {
         private int bitField0_;
         private int box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinalBoxReward_20728.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_FinalBoxReward_20728.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.box_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_FinalBoxReward_20728_descriptor;
         }

         public S2C_FinalBoxReward_20728 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_FinalBoxReward_20728.getDefaultInstance();
         }

         public S2C_FinalBoxReward_20728 build() {
            S2C_FinalBoxReward_20728 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FinalBoxReward_20728 buildPartial() {
            S2C_FinalBoxReward_20728 result = new S2C_FinalBoxReward_20728(this);
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
            if (other instanceof S2C_FinalBoxReward_20728) {
               return this.mergeFrom((S2C_FinalBoxReward_20728)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FinalBoxReward_20728 other) {
            if (other == ArtifactSkinActivityMsg.S2C_FinalBoxReward_20728.getDefaultInstance()) {
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
            S2C_FinalBoxReward_20728 parsedMessage = null;

            try {
               parsedMessage = (S2C_FinalBoxReward_20728)ArtifactSkinActivityMsg.S2C_FinalBoxReward_20728.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FinalBoxReward_20728)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureAddRandom_20729 extends GeneratedMessageV3 implements C2S_TreasureAddRandom_20729OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAddRandom_20729 DEFAULT_INSTANCE = new C2S_TreasureAddRandom_20729();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAddRandom_20729> PARSER = new AbstractParser<C2S_TreasureAddRandom_20729>() {
         public C2S_TreasureAddRandom_20729 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAddRandom_20729(input, extensionRegistry);
         }
      };

      private C2S_TreasureAddRandom_20729(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAddRandom_20729() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAddRandom_20729();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAddRandom_20729(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_20729.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAddRandom_20729)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAddRandom_20729 other = (C2S_TreasureAddRandom_20729)obj;
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

      public static C2S_TreasureAddRandom_20729 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAddRandom_20729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_20729 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_20729 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAddRandom_20729 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAddRandom_20729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAddRandom_20729 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAddRandom_20729 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAddRandom_20729> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAddRandom_20729> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAddRandom_20729 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAddRandom_20729OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAddRandom_20729.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_TreasureAddRandom_20729.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAddRandom_20729_descriptor;
         }

         public C2S_TreasureAddRandom_20729 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_TreasureAddRandom_20729.getDefaultInstance();
         }

         public C2S_TreasureAddRandom_20729 build() {
            C2S_TreasureAddRandom_20729 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAddRandom_20729 buildPartial() {
            C2S_TreasureAddRandom_20729 result = new C2S_TreasureAddRandom_20729(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAddRandom_20729) {
               return this.mergeFrom((C2S_TreasureAddRandom_20729)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAddRandom_20729 other) {
            if (other == ArtifactSkinActivityMsg.C2S_TreasureAddRandom_20729.getDefaultInstance()) {
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
            C2S_TreasureAddRandom_20729 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAddRandom_20729)ArtifactSkinActivityMsg.C2S_TreasureAddRandom_20729.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAddRandom_20729)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAddRandom_20730 extends GeneratedMessageV3 implements S2C_TreasureAddRandom_20730OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANDOMCOUNT_FIELD_NUMBER = 1;
      private int randomCount_;
      public static final int RANDOMRECOVERTIME_FIELD_NUMBER = 2;
      private int randomRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAddRandom_20730 DEFAULT_INSTANCE = new S2C_TreasureAddRandom_20730();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAddRandom_20730> PARSER = new AbstractParser<S2C_TreasureAddRandom_20730>() {
         public S2C_TreasureAddRandom_20730 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAddRandom_20730(input, extensionRegistry);
         }
      };

      private S2C_TreasureAddRandom_20730(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAddRandom_20730() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAddRandom_20730();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAddRandom_20730(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_20730.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureAddRandom_20730)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAddRandom_20730 other = (S2C_TreasureAddRandom_20730)obj;
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

      public static S2C_TreasureAddRandom_20730 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAddRandom_20730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_20730 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_20730 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAddRandom_20730 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAddRandom_20730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAddRandom_20730 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAddRandom_20730 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAddRandom_20730> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAddRandom_20730> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAddRandom_20730 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAddRandom_20730OrBuilder {
         private int bitField0_;
         private int randomCount_;
         private int randomRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAddRandom_20730.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_TreasureAddRandom_20730.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAddRandom_20730_descriptor;
         }

         public S2C_TreasureAddRandom_20730 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_TreasureAddRandom_20730.getDefaultInstance();
         }

         public S2C_TreasureAddRandom_20730 build() {
            S2C_TreasureAddRandom_20730 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAddRandom_20730 buildPartial() {
            S2C_TreasureAddRandom_20730 result = new S2C_TreasureAddRandom_20730(this);
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
            if (other instanceof S2C_TreasureAddRandom_20730) {
               return this.mergeFrom((S2C_TreasureAddRandom_20730)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAddRandom_20730 other) {
            if (other == ArtifactSkinActivityMsg.S2C_TreasureAddRandom_20730.getDefaultInstance()) {
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
            S2C_TreasureAddRandom_20730 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAddRandom_20730)ArtifactSkinActivityMsg.S2C_TreasureAddRandom_20730.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAddRandom_20730)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureAppointBuy_20731 extends GeneratedMessageV3 implements C2S_TreasureAppointBuy_20731OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureAppointBuy_20731 DEFAULT_INSTANCE = new C2S_TreasureAppointBuy_20731();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureAppointBuy_20731> PARSER = new AbstractParser<C2S_TreasureAppointBuy_20731>() {
         public C2S_TreasureAppointBuy_20731 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureAppointBuy_20731(input, extensionRegistry);
         }
      };

      private C2S_TreasureAppointBuy_20731(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureAppointBuy_20731() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureAppointBuy_20731();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureAppointBuy_20731(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_20731.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureAppointBuy_20731)) {
            return super.equals(obj);
         } else {
            C2S_TreasureAppointBuy_20731 other = (C2S_TreasureAppointBuy_20731)obj;
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

      public static C2S_TreasureAppointBuy_20731 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureAppointBuy_20731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_20731 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_20731 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureAppointBuy_20731 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureAppointBuy_20731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureAppointBuy_20731 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureAppointBuy_20731 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureAppointBuy_20731> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureAppointBuy_20731> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureAppointBuy_20731 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureAppointBuy_20731OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureAppointBuy_20731.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.C2S_TreasureAppointBuy_20731.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_C2S_TreasureAppointBuy_20731_descriptor;
         }

         public C2S_TreasureAppointBuy_20731 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.C2S_TreasureAppointBuy_20731.getDefaultInstance();
         }

         public C2S_TreasureAppointBuy_20731 build() {
            C2S_TreasureAppointBuy_20731 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureAppointBuy_20731 buildPartial() {
            C2S_TreasureAppointBuy_20731 result = new C2S_TreasureAppointBuy_20731(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TreasureAppointBuy_20731) {
               return this.mergeFrom((C2S_TreasureAppointBuy_20731)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureAppointBuy_20731 other) {
            if (other == ArtifactSkinActivityMsg.C2S_TreasureAppointBuy_20731.getDefaultInstance()) {
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
            C2S_TreasureAppointBuy_20731 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureAppointBuy_20731)ArtifactSkinActivityMsg.C2S_TreasureAppointBuy_20731.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureAppointBuy_20731)e.getUnfinishedMessage();
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

   public static final class S2C_TreasureAppointBuy_20732 extends GeneratedMessageV3 implements S2C_TreasureAppointBuy_20732OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int APPOINTCOUNT_FIELD_NUMBER = 1;
      private int appointCount_;
      public static final int APPOINTCOUNTBUY_FIELD_NUMBER = 2;
      private int appointCountBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureAppointBuy_20732 DEFAULT_INSTANCE = new S2C_TreasureAppointBuy_20732();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureAppointBuy_20732> PARSER = new AbstractParser<S2C_TreasureAppointBuy_20732>() {
         public S2C_TreasureAppointBuy_20732 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureAppointBuy_20732(input, extensionRegistry);
         }
      };

      private S2C_TreasureAppointBuy_20732(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureAppointBuy_20732() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureAppointBuy_20732();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureAppointBuy_20732(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_20732.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TreasureAppointBuy_20732)) {
            return super.equals(obj);
         } else {
            S2C_TreasureAppointBuy_20732 other = (S2C_TreasureAppointBuy_20732)obj;
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

      public static S2C_TreasureAppointBuy_20732 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureAppointBuy_20732)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_20732 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_20732 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureAppointBuy_20732 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureAppointBuy_20732)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureAppointBuy_20732 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureAppointBuy_20732 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureAppointBuy_20732> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureAppointBuy_20732> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureAppointBuy_20732 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureAppointBuy_20732OrBuilder {
         private int bitField0_;
         private int appointCount_;
         private int appointCountBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureAppointBuy_20732.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactSkinActivityMsg.S2C_TreasureAppointBuy_20732.alwaysUseFieldBuilders) {
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
            return ArtifactSkinActivityMsg.internal_static_artifactSkinActivity_com_gzbz_protobuf_S2C_TreasureAppointBuy_20732_descriptor;
         }

         public S2C_TreasureAppointBuy_20732 getDefaultInstanceForType() {
            return ArtifactSkinActivityMsg.S2C_TreasureAppointBuy_20732.getDefaultInstance();
         }

         public S2C_TreasureAppointBuy_20732 build() {
            S2C_TreasureAppointBuy_20732 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureAppointBuy_20732 buildPartial() {
            S2C_TreasureAppointBuy_20732 result = new S2C_TreasureAppointBuy_20732(this);
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
            if (other instanceof S2C_TreasureAppointBuy_20732) {
               return this.mergeFrom((S2C_TreasureAppointBuy_20732)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureAppointBuy_20732 other) {
            if (other == ArtifactSkinActivityMsg.S2C_TreasureAppointBuy_20732.getDefaultInstance()) {
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
            S2C_TreasureAppointBuy_20732 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureAppointBuy_20732)ArtifactSkinActivityMsg.S2C_TreasureAppointBuy_20732.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureAppointBuy_20732)e.getUnfinishedMessage();
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

   public interface C2S_ArtifactInfo_20701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FinalBoxReward_20727OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineBoxReward_20721OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface C2S_LineMain_20719OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LineTaskReward_20725OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface C2S_LootEnjoy_20711OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_LootInfo_20705OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReset_20709OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LootReward_20707OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenWeaponBox_20703OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface C2S_TreasureAddRandom_20729OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureAppointBuy_20731OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMain_20713OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureMove_20717OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TreasureRollDice_20715OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ArtifactInfo_20702OrBuilder extends MessageOrBuilder {
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

   public interface S2C_FinalBoxReward_20728OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineBoxReward_20722OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      int getBox();
   }

   public interface S2C_LineMain_20720OrBuilder extends MessageOrBuilder {
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

   public interface S2C_LineTaskNotify_20724OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LineTaskReward_20726OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      int getTask();
   }

   public interface S2C_LootEnjoy_20712OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_LootInfo_20706OrBuilder extends MessageOrBuilder {
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

   public interface S2C_LootReward_20708OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasIsEnjoy();

      boolean getIsEnjoy();

      boolean hasCurLootNum();

      int getCurLootNum();
   }

   public interface S2C_OpenWeaponBox_20704OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface S2C_TreasureAddRandom_20730OrBuilder extends MessageOrBuilder {
      boolean hasRandomCount();

      int getRandomCount();

      boolean hasRandomRecoverTime();

      int getRandomRecoverTime();
   }

   public interface S2C_TreasureAppointBuy_20732OrBuilder extends MessageOrBuilder {
      boolean hasAppointCount();

      int getAppointCount();

      boolean hasAppointCountBuy();

      int getAppointCountBuy();
   }

   public interface S2C_TreasureMain_20714OrBuilder extends MessageOrBuilder {
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

   public interface S2C_TreasureMove_20718OrBuilder extends MessageOrBuilder {
      boolean hasBattle();

      int getBattle();
   }

   public interface S2C_TreasureRollDice_20716OrBuilder extends MessageOrBuilder {
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
