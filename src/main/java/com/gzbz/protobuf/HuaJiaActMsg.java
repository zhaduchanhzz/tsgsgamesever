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

public final class HuaJiaActMsg {
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HuaJiaActMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fHuaJiaAct.proto\u0012\u001bHuaJiaAct.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"H\n\bGiftData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\r\n\u0005isBuy\u0018\u0003 \u0002(\b\"(\n\tChessData\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006iconId\u0018\u0002 \u0002(\u0005\"\u001b\n\u0019C2S_TongQueParkMain_24401\"\u009c\u0002\n\u0019S2C_TongQueParkMain_24402\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\u00127\n\bgiftList\u0018\u0002 \u0003(\u000b2%.HuaJiaAct.com.gzbz.protobuf.GiftData\u00129\n\tchessList\u0018\u0003 \u0003(\u000b2&.HuaJiaAct.com.gzbz.protobuf.ChessData\u0012\u0012\n\nflushCount\u0018\u0004 \u0002(\u0005\u0012\u0014\n\fflyGoldCount\u0018\u0006 \u0002(\u0005\u00126\n\btaskList\u0018\b \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0018\n\u0010activityStartDay\u0018\n \u0002(\u0005\"(\n\u0019C2S_TongQueParkOpen_24403\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\"d\n\u0019S2C_TongQueParkOpen_24404\u00125\n\u0005chess\u0018\u0001 \u0002(\u000b2&.HuaJiaAct.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"!\n\u001fC2S_TongQueParkOneKeyOpen_24405\"n\n\u001fS2C_TongQueParkOneKeyOpen_24406\u00129\n\tchessList\u0018\u0001 \u0003(\u000b2&.HuaJiaAct.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"\u001c\n\u001aC2S_TongQueParkFlush_24407\"0\n\u001aS2C_TongQueParkFlush_24408\u0012\u0012\n\nflushCount\u0018\u0001 \u0002(\u0005\"1\n\u001fC2S_TongQueParkCommitTask_24413\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"1\n\u001fS2C_TongQueParkCommitTask_24414\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"T\n\u001aS2C_TongQueParkTasks_24416\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0015\n\u0013C2S_ChessList_24417\"P\n\u0013S2C_ChessList_24418\u00129\n\tchessList\u0018\u0001 \u0003(\u000b2&.HuaJiaAct.com.gzbz.protobuf.ChessData\"\u001f\n\u001dC2S_TongQueTreasureInfo_24419\"î\u0001\n\u001dS2C_TongQueTreasureInfo_24420\u0012<\n\bmyRecord\u0018\u0001 \u0003(\u000b2*.HuaJiaAct.com.gzbz.protobuf.RecruitRecord\u0012=\n\tallRecord\u0018\u0002 \u0003(\u000b2*.HuaJiaAct.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0019\n\u0011specialRecruitNum\u0018\u0006 \u0001(\u0005\u0012\u000f\n\u0007drawNum\u0018\b \u0001(\u0005\"X\n\rRecruitRecord\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007awardId\u0018\u0004 \u0002(\u0005\"6\n C2S_RecruitTongQueTreasure_24421\u0012\u0012\n\nrecruitNum\u0018\u0002 \u0002(\u0005\"G\n S2C_RecruitTongQueTreasure_24422\u0012\u0012\n\nresultList\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007drawNum\u0018\b \u0001(\u0005\"\\\n\u001bS2C_RecruitRecordInfo_24424\u0012=\n\tallRecord\u0018\u0002 \u0003(\u000b2*.HuaJiaAct.com.gzbz.protobuf.RecruitRecord\"\u0019\n\u0017C2S_RecruitResult_24425\"}\n\u0017S2C_RecruitResult_24426\u0012<\n\bmyRecord\u0018\u0001 \u0003(\u000b2*.HuaJiaAct.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"U\n\u0017S2S_RecruitRecord_24427\u0012:\n\u0006record\u0018\u0001 \u0003(\u000b2*.HuaJiaAct.com.gzbz.protobuf.RecruitRecordB#\n\u0011com.gzbz.protobufB\fHuaJiaActMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor, new String[]{"Id", "Rewards", "IsBuy"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor, new String[]{"Pos", "IconId"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor, new String[]{"EndTime", "GiftList", "ChessList", "FlushCount", "FlyGoldCount", "TaskList", "ActivityStartDay"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor, new String[]{"Pos"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor, new String[]{"Chess", "PrizeIds"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor, new String[]{"ChessList", "PrizeIds"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor, new String[]{"FlushCount"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor, new String[]{"TaskId"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor, new String[]{"TaskId"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor, new String[]{"TaskList"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor, new String[]{"ChessList"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor, new String[]{"MyRecord", "AllRecord", "AwardList", "SpecialRecruitNum", "DrawNum"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "AwardId"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor, new String[]{"RecruitNum"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor, new String[]{"ResultList", "DrawNum"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor, new String[]{"AllRecord"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor, new String[0]);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor, new String[]{"MyRecord", "AwardList"});
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor, new String[]{"Record"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class GiftData extends GeneratedMessageV3 implements GiftDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int REWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int ISBUY_FIELD_NUMBER = 3;
      private boolean isBuy_;
      private byte memoizedIsInitialized;
      private static final GiftData DEFAULT_INSTANCE = new GiftData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GiftData> PARSER = new AbstractParser<GiftData>() {
         public GiftData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GiftData(input, extensionRegistry);
         }
      };

      private GiftData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GiftData() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GiftData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GiftData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.isBuy_ = input.readBool();
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<CommonMsg.ItemInfo> getRewardsList() {
         return this.rewards_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
         return this.rewards_;
      }

      public int getRewardsCount() {
         return this.rewards_.size();
      }

      public CommonMsg.ItemInfo getRewards(int index) {
         return (CommonMsg.ItemInfo)this.rewards_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index);
      }

      public boolean hasIsBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsBuy() {
         return this.isBuy_;
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
         } else if (!this.hasIsBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.id_);
         }

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.isBuy_);
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

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GiftData)) {
            return super.equals(obj);
         } else {
            GiftData other = (GiftData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasIsBuy() != other.hasIsBuy()) {
               return false;
            } else if (this.hasIsBuy() && this.getIsBuy() != other.getIsBuy()) {
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

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasIsBuy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBuy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GiftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseDelimitedFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GiftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseFrom(CodedInputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GiftData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GiftData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GiftData> parser() {
         return PARSER;
      }

      public Parser<GiftData> getParserForType() {
         return PARSER;
      }

      public GiftData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GiftDataOrBuilder {
         private int bitField0_;
         private int id_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private boolean isBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
         }

         private Builder() {
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.GiftData.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.isBuy_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_GiftData_descriptor;
         }

         public GiftData getDefaultInstanceForType() {
            return HuaJiaActMsg.GiftData.getDefaultInstance();
         }

         public GiftData build() {
            GiftData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GiftData buildPartial() {
            GiftData result = new GiftData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -3;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isBuy_ = this.isBuy_;
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
            if (other instanceof GiftData) {
               return this.mergeFrom((GiftData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GiftData other) {
            if (other == HuaJiaActMsg.GiftData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardsIsMutable();
                        this.rewards_.addAll(other.rewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewards_.isEmpty()) {
                  if (this.rewardsBuilder_.isEmpty()) {
                     this.rewardsBuilder_.dispose();
                     this.rewardsBuilder_ = null;
                     this.rewards_ = other.rewards_;
                     this.bitField0_ &= -3;
                     this.rewardsBuilder_ = HuaJiaActMsg.GiftData.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasIsBuy()) {
                  this.setIsBuy(other.getIsBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasIsBuy()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardsCount(); ++i) {
                  if (!this.getRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GiftData parsedMessage = null;

            try {
               parsedMessage = (GiftData)HuaJiaActMsg.GiftData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GiftData)e.getUnfinishedMessage();
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

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardsList() {
            return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
         }

         public int getRewardsCount() {
            return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getRewards(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfo)this.rewards_.get(index) : (CommonMsg.ItemInfo)this.rewardsBuilder_.getMessage(index);
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.set(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewards(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewards_);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewards() {
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewards(int index) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.remove(index);
               this.onChanged();
            } else {
               this.rewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
            return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardsBuilderList() {
            return this.getRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardsFieldBuilder() {
            if (this.rewardsBuilder_ == null) {
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasIsBuy() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsBuy() {
            return this.isBuy_;
         }

         public Builder setIsBuy(boolean value) {
            this.bitField0_ |= 4;
            this.isBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBuy() {
            this.bitField0_ &= -5;
            this.isBuy_ = false;
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

   public static final class ChessData extends GeneratedMessageV3 implements ChessDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      public static final int ICONID_FIELD_NUMBER = 2;
      private int iconId_;
      private byte memoizedIsInitialized;
      private static final ChessData DEFAULT_INSTANCE = new ChessData();
      /** @deprecated */
      @Deprecated
      public static final Parser<ChessData> PARSER = new AbstractParser<ChessData>() {
         public ChessData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ChessData(input, extensionRegistry);
         }
      };

      private ChessData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ChessData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ChessData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ChessData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.iconId_ = input.readInt32();
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasIconId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIconId() {
         return this.iconId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIconId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.iconId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.iconId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ChessData)) {
            return super.equals(obj);
         } else {
            ChessData other = (ChessData)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasIconId() != other.hasIconId()) {
               return false;
            } else if (this.hasIconId() && this.getIconId() != other.getIconId()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasIconId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIconId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ChessData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data);
      }

      public static ChessData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ChessData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ChessData parseFrom(InputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChessData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChessData parseDelimitedFrom(InputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ChessData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ChessData parseFrom(CodedInputStream input) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ChessData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ChessData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ChessData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ChessData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ChessData> parser() {
         return PARSER;
      }

      public Parser<ChessData> getParserForType() {
         return PARSER;
      }

      public ChessData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChessDataOrBuilder {
         private int bitField0_;
         private int pos_;
         private int iconId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.ChessData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            this.iconId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_ChessData_descriptor;
         }

         public ChessData getDefaultInstanceForType() {
            return HuaJiaActMsg.ChessData.getDefaultInstance();
         }

         public ChessData build() {
            ChessData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ChessData buildPartial() {
            ChessData result = new ChessData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.iconId_ = this.iconId_;
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
            if (other instanceof ChessData) {
               return this.mergeFrom((ChessData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ChessData other) {
            if (other == HuaJiaActMsg.ChessData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasIconId()) {
                  this.setIconId(other.getIconId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPos()) {
               return false;
            } else {
               return this.hasIconId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ChessData parsedMessage = null;

            try {
               parsedMessage = (ChessData)HuaJiaActMsg.ChessData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ChessData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIconId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIconId() {
            return this.iconId_;
         }

         public Builder setIconId(int value) {
            this.bitField0_ |= 2;
            this.iconId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIconId() {
            this.bitField0_ &= -3;
            this.iconId_ = 0;
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

   public static final class C2S_TongQueParkMain_24401 extends GeneratedMessageV3 implements C2S_TongQueParkMain_24401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkMain_24401 DEFAULT_INSTANCE = new C2S_TongQueParkMain_24401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkMain_24401> PARSER = new AbstractParser<C2S_TongQueParkMain_24401>() {
         public C2S_TongQueParkMain_24401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkMain_24401(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkMain_24401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkMain_24401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkMain_24401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkMain_24401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_24401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkMain_24401)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkMain_24401 other = (C2S_TongQueParkMain_24401)obj;
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

      public static C2S_TongQueParkMain_24401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_24401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_24401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_24401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_24401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_24401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkMain_24401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkMain_24401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkMain_24401> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkMain_24401> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkMain_24401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkMain_24401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_24401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueParkMain_24401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkMain_24401_descriptor;
         }

         public C2S_TongQueParkMain_24401 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueParkMain_24401.getDefaultInstance();
         }

         public C2S_TongQueParkMain_24401 build() {
            C2S_TongQueParkMain_24401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkMain_24401 buildPartial() {
            C2S_TongQueParkMain_24401 result = new C2S_TongQueParkMain_24401(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkMain_24401) {
               return this.mergeFrom((C2S_TongQueParkMain_24401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkMain_24401 other) {
            if (other == HuaJiaActMsg.C2S_TongQueParkMain_24401.getDefaultInstance()) {
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
            C2S_TongQueParkMain_24401 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkMain_24401)HuaJiaActMsg.C2S_TongQueParkMain_24401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkMain_24401)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkMain_24402 extends GeneratedMessageV3 implements S2C_TongQueParkMain_24402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENDTIME_FIELD_NUMBER = 1;
      private int endTime_;
      public static final int GIFTLIST_FIELD_NUMBER = 2;
      private List<GiftData> giftList_;
      public static final int CHESSLIST_FIELD_NUMBER = 3;
      private List<ChessData> chessList_;
      public static final int FLUSHCOUNT_FIELD_NUMBER = 4;
      private int flushCount_;
      public static final int FLYGOLDCOUNT_FIELD_NUMBER = 6;
      private int flyGoldCount_;
      public static final int TASKLIST_FIELD_NUMBER = 8;
      private List<ActivityMsg.TaskData> taskList_;
      public static final int ACTIVITYSTARTDAY_FIELD_NUMBER = 10;
      private int activityStartDay_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkMain_24402 DEFAULT_INSTANCE = new S2C_TongQueParkMain_24402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkMain_24402> PARSER = new AbstractParser<S2C_TongQueParkMain_24402>() {
         public S2C_TongQueParkMain_24402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkMain_24402(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkMain_24402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkMain_24402() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
         this.chessList_ = Collections.emptyList();
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkMain_24402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkMain_24402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.giftList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.giftList_.add(input.readMessage(HuaJiaActMsg.GiftData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.chessList_.add(input.readMessage(HuaJiaActMsg.ChessData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.flushCount_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 4;
                        this.flyGoldCount_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 80:
                        this.bitField0_ |= 8;
                        this.activityStartDay_ = input.readInt32();
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
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_24402.class, Builder.class);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<GiftData> getGiftListList() {
         return this.giftList_;
      }

      public List<? extends GiftDataOrBuilder> getGiftListOrBuilderList() {
         return this.giftList_;
      }

      public int getGiftListCount() {
         return this.giftList_.size();
      }

      public GiftData getGiftList(int index) {
         return (GiftData)this.giftList_.get(index);
      }

      public GiftDataOrBuilder getGiftListOrBuilder(int index) {
         return (GiftDataOrBuilder)this.giftList_.get(index);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public boolean hasFlushCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFlushCount() {
         return this.flushCount_;
      }

      public boolean hasFlyGoldCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFlyGoldCount() {
         return this.flyGoldCount_;
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public boolean hasActivityStartDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActivityStartDay() {
         return this.activityStartDay_;
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
         } else if (!this.hasFlushCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFlyGoldCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityStartDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGiftListCount(); ++i) {
               if (!this.getGiftList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
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

         for(int i = 0; i < this.giftList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.giftList_.get(i));
         }

         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.chessList_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.flushCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.flyGoldCount_);
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.taskList_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(10, this.activityStartDay_);
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

            for(int i = 0; i < this.giftList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.giftList_.get(i));
            }

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.chessList_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.flushCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.flyGoldCount_);
            }

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.taskList_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.activityStartDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkMain_24402)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkMain_24402 other = (S2C_TongQueParkMain_24402)obj;
            if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getGiftListList().equals(other.getGiftListList())) {
               return false;
            } else if (!this.getChessListList().equals(other.getChessListList())) {
               return false;
            } else if (this.hasFlushCount() != other.hasFlushCount()) {
               return false;
            } else if (this.hasFlushCount() && this.getFlushCount() != other.getFlushCount()) {
               return false;
            } else if (this.hasFlyGoldCount() != other.hasFlyGoldCount()) {
               return false;
            } else if (this.hasFlyGoldCount() && this.getFlyGoldCount() != other.getFlyGoldCount()) {
               return false;
            } else if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else if (this.hasActivityStartDay() != other.hasActivityStartDay()) {
               return false;
            } else if (this.hasActivityStartDay() && this.getActivityStartDay() != other.getActivityStartDay()) {
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

            if (this.getGiftListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGiftListList().hashCode();
            }

            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            if (this.hasFlushCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFlushCount();
            }

            if (this.hasFlyGoldCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFlyGoldCount();
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            if (this.hasActivityStartDay()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getActivityStartDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkMain_24402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_24402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_24402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_24402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_24402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_24402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkMain_24402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkMain_24402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkMain_24402> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkMain_24402> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkMain_24402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkMain_24402OrBuilder {
         private int bitField0_;
         private int endTime_;
         private List<GiftData> giftList_;
         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> giftListBuilder_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;
         private int flushCount_;
         private int flyGoldCount_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;
         private int activityStartDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_24402.class, Builder.class);
         }

         private Builder() {
            this.giftList_ = Collections.emptyList();
            this.chessList_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftList_ = Collections.emptyList();
            this.chessList_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkMain_24402.alwaysUseFieldBuilders) {
               this.getGiftListFieldBuilder();
               this.getChessListFieldBuilder();
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.endTime_ = 0;
            this.bitField0_ &= -2;
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.giftListBuilder_.clear();
            }

            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.chessListBuilder_.clear();
            }

            this.flushCount_ = 0;
            this.bitField0_ &= -9;
            this.flyGoldCount_ = 0;
            this.bitField0_ &= -17;
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.taskListBuilder_.clear();
            }

            this.activityStartDay_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkMain_24402_descriptor;
         }

         public S2C_TongQueParkMain_24402 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkMain_24402.getDefaultInstance();
         }

         public S2C_TongQueParkMain_24402 build() {
            S2C_TongQueParkMain_24402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkMain_24402 buildPartial() {
            S2C_TongQueParkMain_24402 result = new S2C_TongQueParkMain_24402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 1;
            }

            if (this.giftListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.giftList_ = Collections.unmodifiableList(this.giftList_);
                  this.bitField0_ &= -3;
               }

               result.giftList_ = this.giftList_;
            } else {
               result.giftList_ = this.giftListBuilder_.build();
            }

            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -5;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.flushCount_ = this.flushCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.flyGoldCount_ = this.flyGoldCount_;
               to_bitField0_ |= 4;
            }

            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -33;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.activityStartDay_ = this.activityStartDay_;
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
            if (other instanceof S2C_TongQueParkMain_24402) {
               return this.mergeFrom((S2C_TongQueParkMain_24402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkMain_24402 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkMain_24402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (this.giftListBuilder_ == null) {
                  if (!other.giftList_.isEmpty()) {
                     if (this.giftList_.isEmpty()) {
                        this.giftList_ = other.giftList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGiftListIsMutable();
                        this.giftList_.addAll(other.giftList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.giftList_.isEmpty()) {
                  if (this.giftListBuilder_.isEmpty()) {
                     this.giftListBuilder_.dispose();
                     this.giftListBuilder_ = null;
                     this.giftList_ = other.giftList_;
                     this.bitField0_ &= -3;
                     this.giftListBuilder_ = HuaJiaActMsg.S2C_TongQueParkMain_24402.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
                  } else {
                     this.giftListBuilder_.addAllMessages(other.giftList_);
                  }
               }

               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -5;
                     this.chessListBuilder_ = HuaJiaActMsg.S2C_TongQueParkMain_24402.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               if (other.hasFlushCount()) {
                  this.setFlushCount(other.getFlushCount());
               }

               if (other.hasFlyGoldCount()) {
                  this.setFlyGoldCount(other.getFlyGoldCount());
               }

               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -33;
                     this.taskListBuilder_ = HuaJiaActMsg.S2C_TongQueParkMain_24402.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               if (other.hasActivityStartDay()) {
                  this.setActivityStartDay(other.getActivityStartDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasFlushCount()) {
               return false;
            } else if (!this.hasFlyGoldCount()) {
               return false;
            } else if (!this.hasActivityStartDay()) {
               return false;
            } else {
               for(int i = 0; i < this.getGiftListCount(); ++i) {
                  if (!this.getGiftList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getChessListCount(); ++i) {
                  if (!this.getChessList(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkMain_24402 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkMain_24402)HuaJiaActMsg.S2C_TongQueParkMain_24402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkMain_24402)e.getUnfinishedMessage();
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

         private void ensureGiftListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.giftList_ = new ArrayList(this.giftList_);
               this.bitField0_ |= 2;
            }

         }

         public List<GiftData> getGiftListList() {
            return this.giftListBuilder_ == null ? Collections.unmodifiableList(this.giftList_) : this.giftListBuilder_.getMessageList();
         }

         public int getGiftListCount() {
            return this.giftListBuilder_ == null ? this.giftList_.size() : this.giftListBuilder_.getCount();
         }

         public GiftData getGiftList(int index) {
            return this.giftListBuilder_ == null ? (GiftData)this.giftList_.get(index) : (GiftData)this.giftListBuilder_.getMessage(index);
         }

         public Builder setGiftList(int index, GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.set(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGiftList(int index, GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGiftList(int index, GiftData value) {
            if (this.giftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftListIsMutable();
               this.giftList_.add(index, value);
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGiftList(GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGiftList(int index, GiftData.Builder builderForValue) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGiftList(Iterable<? extends GiftData> values) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftList_);
               this.onChanged();
            } else {
               this.giftListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGiftList() {
            if (this.giftListBuilder_ == null) {
               this.giftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.giftListBuilder_.clear();
            }

            return this;
         }

         public Builder removeGiftList(int index) {
            if (this.giftListBuilder_ == null) {
               this.ensureGiftListIsMutable();
               this.giftList_.remove(index);
               this.onChanged();
            } else {
               this.giftListBuilder_.remove(index);
            }

            return this;
         }

         public GiftData.Builder getGiftListBuilder(int index) {
            return (GiftData.Builder)this.getGiftListFieldBuilder().getBuilder(index);
         }

         public GiftDataOrBuilder getGiftListOrBuilder(int index) {
            return this.giftListBuilder_ == null ? (GiftDataOrBuilder)this.giftList_.get(index) : (GiftDataOrBuilder)this.giftListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GiftDataOrBuilder> getGiftListOrBuilderList() {
            return this.giftListBuilder_ != null ? this.giftListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.giftList_);
         }

         public GiftData.Builder addGiftListBuilder() {
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(HuaJiaActMsg.GiftData.getDefaultInstance());
         }

         public GiftData.Builder addGiftListBuilder(int index) {
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(index, HuaJiaActMsg.GiftData.getDefaultInstance());
         }

         public List<GiftData.Builder> getGiftListBuilderList() {
            return this.getGiftListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> getGiftListFieldBuilder() {
            if (this.giftListBuilder_ == null) {
               this.giftListBuilder_ = new RepeatedFieldBuilderV3(this.giftList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.giftList_ = null;
            }

            return this.giftListBuilder_;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 4;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         public boolean hasFlushCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFlushCount() {
            return this.flushCount_;
         }

         public Builder setFlushCount(int value) {
            this.bitField0_ |= 8;
            this.flushCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushCount() {
            this.bitField0_ &= -9;
            this.flushCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFlyGoldCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFlyGoldCount() {
            return this.flyGoldCount_;
         }

         public Builder setFlyGoldCount(int value) {
            this.bitField0_ |= 16;
            this.flyGoldCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlyGoldCount() {
            this.bitField0_ &= -17;
            this.flyGoldCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 32;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public boolean hasActivityStartDay() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getActivityStartDay() {
            return this.activityStartDay_;
         }

         public Builder setActivityStartDay(int value) {
            this.bitField0_ |= 64;
            this.activityStartDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityStartDay() {
            this.bitField0_ &= -65;
            this.activityStartDay_ = 0;
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

   public static final class C2S_TongQueParkOpen_24403 extends GeneratedMessageV3 implements C2S_TongQueParkOpen_24403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOpen_24403 DEFAULT_INSTANCE = new C2S_TongQueParkOpen_24403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOpen_24403> PARSER = new AbstractParser<C2S_TongQueParkOpen_24403>() {
         public C2S_TongQueParkOpen_24403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOpen_24403(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOpen_24403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOpen_24403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOpen_24403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOpen_24403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_24403.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TongQueParkOpen_24403)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOpen_24403 other = (C2S_TongQueParkOpen_24403)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_24403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_24403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_24403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_24403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_24403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOpen_24403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOpen_24403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOpen_24403> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOpen_24403> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOpen_24403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOpen_24403OrBuilder {
         private int bitField0_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_24403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueParkOpen_24403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOpen_24403_descriptor;
         }

         public C2S_TongQueParkOpen_24403 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueParkOpen_24403.getDefaultInstance();
         }

         public C2S_TongQueParkOpen_24403 build() {
            C2S_TongQueParkOpen_24403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOpen_24403 buildPartial() {
            C2S_TongQueParkOpen_24403 result = new C2S_TongQueParkOpen_24403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof C2S_TongQueParkOpen_24403) {
               return this.mergeFrom((C2S_TongQueParkOpen_24403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOpen_24403 other) {
            if (other == HuaJiaActMsg.C2S_TongQueParkOpen_24403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TongQueParkOpen_24403 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOpen_24403)HuaJiaActMsg.C2S_TongQueParkOpen_24403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOpen_24403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
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

   public static final class S2C_TongQueParkOpen_24404 extends GeneratedMessageV3 implements S2C_TongQueParkOpen_24404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHESS_FIELD_NUMBER = 1;
      private ChessData chess_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOpen_24404 DEFAULT_INSTANCE = new S2C_TongQueParkOpen_24404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOpen_24404> PARSER = new AbstractParser<S2C_TongQueParkOpen_24404>() {
         public S2C_TongQueParkOpen_24404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOpen_24404(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOpen_24404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOpen_24404() {
         this.memoizedIsInitialized = -1;
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOpen_24404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOpen_24404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChessData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chess_.toBuilder();
                        }

                        this.chess_ = (ChessData)input.readMessage(HuaJiaActMsg.ChessData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chess_);
                           this.chess_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.prizeIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.prizeIds_.addInt(input.readInt32());
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
                  this.prizeIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_24404.class, Builder.class);
      }

      public boolean hasChess() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChessData getChess() {
         return this.chess_ == null ? HuaJiaActMsg.ChessData.getDefaultInstance() : this.chess_;
      }

      public ChessDataOrBuilder getChessOrBuilder() {
         return this.chess_ == null ? HuaJiaActMsg.ChessData.getDefaultInstance() : this.chess_;
      }

      public List<Integer> getPrizeIdsList() {
         return this.prizeIds_;
      }

      public int getPrizeIdsCount() {
         return this.prizeIds_.size();
      }

      public int getPrizeIds(int index) {
         return this.prizeIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChess()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChess().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChess());
         }

         for(int i = 0; i < this.prizeIds_.size(); ++i) {
            output.writeInt32(2, this.prizeIds_.getInt(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getChess());
            }

            int dataSize = 0;

            for(int i = 0; i < this.prizeIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.prizeIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPrizeIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkOpen_24404)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOpen_24404 other = (S2C_TongQueParkOpen_24404)obj;
            if (this.hasChess() != other.hasChess()) {
               return false;
            } else if (this.hasChess() && !this.getChess().equals(other.getChess())) {
               return false;
            } else if (!this.getPrizeIdsList().equals(other.getPrizeIdsList())) {
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
            if (this.hasChess()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChess().hashCode();
            }

            if (this.getPrizeIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrizeIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_24404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_24404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_24404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_24404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_24404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOpen_24404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOpen_24404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOpen_24404> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOpen_24404> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOpen_24404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOpen_24404OrBuilder {
         private int bitField0_;
         private ChessData chess_;
         private SingleFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_24404.class, Builder.class);
         }

         private Builder() {
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOpen_24404.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOpen_24404.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkOpen_24404.alwaysUseFieldBuilders) {
               this.getChessFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessBuilder_ == null) {
               this.chess_ = null;
            } else {
               this.chessBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOpen_24404.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOpen_24404_descriptor;
         }

         public S2C_TongQueParkOpen_24404 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkOpen_24404.getDefaultInstance();
         }

         public S2C_TongQueParkOpen_24404 build() {
            S2C_TongQueParkOpen_24404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOpen_24404 buildPartial() {
            S2C_TongQueParkOpen_24404 result = new S2C_TongQueParkOpen_24404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chessBuilder_ == null) {
                  result.chess_ = this.chess_;
               } else {
                  result.chess_ = (ChessData)this.chessBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.prizeIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.prizeIds_ = this.prizeIds_;
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
            if (other instanceof S2C_TongQueParkOpen_24404) {
               return this.mergeFrom((S2C_TongQueParkOpen_24404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOpen_24404 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkOpen_24404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChess()) {
                  this.mergeChess(other.getChess());
               }

               if (!other.prizeIds_.isEmpty()) {
                  if (this.prizeIds_.isEmpty()) {
                     this.prizeIds_ = other.prizeIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePrizeIdsIsMutable();
                     this.prizeIds_.addAll(other.prizeIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChess()) {
               return false;
            } else {
               return this.getChess().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkOpen_24404 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOpen_24404)HuaJiaActMsg.S2C_TongQueParkOpen_24404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOpen_24404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChess() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChessData getChess() {
            if (this.chessBuilder_ == null) {
               return this.chess_ == null ? HuaJiaActMsg.ChessData.getDefaultInstance() : this.chess_;
            } else {
               return (ChessData)this.chessBuilder_.getMessage();
            }
         }

         public Builder setChess(ChessData value) {
            if (this.chessBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chess_ = value;
               this.onChanged();
            } else {
               this.chessBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChess(ChessData.Builder builderForValue) {
            if (this.chessBuilder_ == null) {
               this.chess_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chessBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChess(ChessData value) {
            if (this.chessBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chess_ != null && this.chess_ != HuaJiaActMsg.ChessData.getDefaultInstance()) {
                  this.chess_ = HuaJiaActMsg.ChessData.newBuilder(this.chess_).mergeFrom(value).buildPartial();
               } else {
                  this.chess_ = value;
               }

               this.onChanged();
            } else {
               this.chessBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChess() {
            if (this.chessBuilder_ == null) {
               this.chess_ = null;
               this.onChanged();
            } else {
               this.chessBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChessData.Builder getChessBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChessData.Builder)this.getChessFieldBuilder().getBuilder();
         }

         public ChessDataOrBuilder getChessOrBuilder() {
            if (this.chessBuilder_ != null) {
               return (ChessDataOrBuilder)this.chessBuilder_.getMessageOrBuilder();
            } else {
               return this.chess_ == null ? HuaJiaActMsg.ChessData.getDefaultInstance() : this.chess_;
            }
         }

         private SingleFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessFieldBuilder() {
            if (this.chessBuilder_ == null) {
               this.chessBuilder_ = new SingleFieldBuilderV3(this.getChess(), this.getParentForChildren(), this.isClean());
               this.chess_ = null;
            }

            return this.chessBuilder_;
         }

         private void ensurePrizeIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOpen_24404.mutableCopy(this.prizeIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPrizeIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.prizeIds_) : this.prizeIds_);
         }

         public int getPrizeIdsCount() {
            return this.prizeIds_.size();
         }

         public int getPrizeIds(int index) {
            return this.prizeIds_.getInt(index);
         }

         public Builder setPrizeIds(int index, int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPrizeIds(int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPrizeIds(Iterable<? extends Integer> values) {
            this.ensurePrizeIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prizeIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPrizeIds() {
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOpen_24404.emptyIntList();
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

   public static final class C2S_TongQueParkOneKeyOpen_24405 extends GeneratedMessageV3 implements C2S_TongQueParkOneKeyOpen_24405OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOneKeyOpen_24405 DEFAULT_INSTANCE = new C2S_TongQueParkOneKeyOpen_24405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOneKeyOpen_24405> PARSER = new AbstractParser<C2S_TongQueParkOneKeyOpen_24405>() {
         public C2S_TongQueParkOneKeyOpen_24405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOneKeyOpen_24405(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOneKeyOpen_24405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOneKeyOpen_24405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOneKeyOpen_24405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOneKeyOpen_24405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_24405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkOneKeyOpen_24405)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOneKeyOpen_24405 other = (C2S_TongQueParkOneKeyOpen_24405)obj;
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

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_24405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_24405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_24405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOneKeyOpen_24405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOneKeyOpen_24405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOneKeyOpen_24405> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOneKeyOpen_24405> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOneKeyOpen_24405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOneKeyOpen_24405OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_24405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueParkOneKeyOpen_24405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_24405_descriptor;
         }

         public C2S_TongQueParkOneKeyOpen_24405 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueParkOneKeyOpen_24405.getDefaultInstance();
         }

         public C2S_TongQueParkOneKeyOpen_24405 build() {
            C2S_TongQueParkOneKeyOpen_24405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOneKeyOpen_24405 buildPartial() {
            C2S_TongQueParkOneKeyOpen_24405 result = new C2S_TongQueParkOneKeyOpen_24405(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkOneKeyOpen_24405) {
               return this.mergeFrom((C2S_TongQueParkOneKeyOpen_24405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOneKeyOpen_24405 other) {
            if (other == HuaJiaActMsg.C2S_TongQueParkOneKeyOpen_24405.getDefaultInstance()) {
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
            C2S_TongQueParkOneKeyOpen_24405 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_24405)HuaJiaActMsg.C2S_TongQueParkOneKeyOpen_24405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_24405)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkOneKeyOpen_24406 extends GeneratedMessageV3 implements S2C_TongQueParkOneKeyOpen_24406OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOneKeyOpen_24406 DEFAULT_INSTANCE = new S2C_TongQueParkOneKeyOpen_24406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOneKeyOpen_24406> PARSER = new AbstractParser<S2C_TongQueParkOneKeyOpen_24406>() {
         public S2C_TongQueParkOneKeyOpen_24406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOneKeyOpen_24406(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOneKeyOpen_24406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOneKeyOpen_24406() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOneKeyOpen_24406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOneKeyOpen_24406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.chessList_.add(input.readMessage(HuaJiaActMsg.ChessData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.prizeIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.prizeIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.prizeIds_.addInt(input.readInt32());
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
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.prizeIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_24406.class, Builder.class);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public List<Integer> getPrizeIdsList() {
         return this.prizeIds_;
      }

      public int getPrizeIdsCount() {
         return this.prizeIds_.size();
      }

      public int getPrizeIds(int index) {
         return this.prizeIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.chessList_.get(i));
         }

         for(int i = 0; i < this.prizeIds_.size(); ++i) {
            output.writeInt32(2, this.prizeIds_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.chessList_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.prizeIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.prizeIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPrizeIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkOneKeyOpen_24406)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOneKeyOpen_24406 other = (S2C_TongQueParkOneKeyOpen_24406)obj;
            if (!this.getChessListList().equals(other.getChessListList())) {
               return false;
            } else if (!this.getPrizeIdsList().equals(other.getPrizeIdsList())) {
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
            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            if (this.getPrizeIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrizeIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_24406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_24406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_24406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOneKeyOpen_24406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOneKeyOpen_24406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOneKeyOpen_24406> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOneKeyOpen_24406> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOneKeyOpen_24406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOneKeyOpen_24406OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_24406.class, Builder.class);
         }

         private Builder() {
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.alwaysUseFieldBuilders) {
               this.getChessListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.chessListBuilder_.clear();
            }

            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_24406_descriptor;
         }

         public S2C_TongQueParkOneKeyOpen_24406 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.getDefaultInstance();
         }

         public S2C_TongQueParkOneKeyOpen_24406 build() {
            S2C_TongQueParkOneKeyOpen_24406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOneKeyOpen_24406 buildPartial() {
            S2C_TongQueParkOneKeyOpen_24406 result = new S2C_TongQueParkOneKeyOpen_24406(this);
            int from_bitField0_ = this.bitField0_;
            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -2;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.prizeIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.prizeIds_ = this.prizeIds_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_TongQueParkOneKeyOpen_24406) {
               return this.mergeFrom((S2C_TongQueParkOneKeyOpen_24406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOneKeyOpen_24406 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.getDefaultInstance()) {
               return this;
            } else {
               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -2;
                     this.chessListBuilder_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               if (!other.prizeIds_.isEmpty()) {
                  if (this.prizeIds_.isEmpty()) {
                     this.prizeIds_ = other.prizeIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePrizeIdsIsMutable();
                     this.prizeIds_.addAll(other.prizeIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkOneKeyOpen_24406 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_24406)HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_24406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         private void ensurePrizeIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.mutableCopy(this.prizeIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPrizeIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.prizeIds_) : this.prizeIds_);
         }

         public int getPrizeIdsCount() {
            return this.prizeIds_.size();
         }

         public int getPrizeIds(int index) {
            return this.prizeIds_.getInt(index);
         }

         public Builder setPrizeIds(int index, int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPrizeIds(int value) {
            this.ensurePrizeIdsIsMutable();
            this.prizeIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPrizeIds(Iterable<? extends Integer> values) {
            this.ensurePrizeIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prizeIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPrizeIds() {
            this.prizeIds_ = HuaJiaActMsg.S2C_TongQueParkOneKeyOpen_24406.emptyIntList();
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

   public static final class C2S_TongQueParkFlush_24407 extends GeneratedMessageV3 implements C2S_TongQueParkFlush_24407OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkFlush_24407 DEFAULT_INSTANCE = new C2S_TongQueParkFlush_24407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkFlush_24407> PARSER = new AbstractParser<C2S_TongQueParkFlush_24407>() {
         public C2S_TongQueParkFlush_24407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkFlush_24407(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkFlush_24407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkFlush_24407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkFlush_24407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkFlush_24407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_24407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkFlush_24407)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkFlush_24407 other = (C2S_TongQueParkFlush_24407)obj;
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

      public static C2S_TongQueParkFlush_24407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_24407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_24407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_24407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_24407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_24407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkFlush_24407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkFlush_24407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkFlush_24407> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkFlush_24407> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkFlush_24407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkFlush_24407OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_24407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueParkFlush_24407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkFlush_24407_descriptor;
         }

         public C2S_TongQueParkFlush_24407 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueParkFlush_24407.getDefaultInstance();
         }

         public C2S_TongQueParkFlush_24407 build() {
            C2S_TongQueParkFlush_24407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkFlush_24407 buildPartial() {
            C2S_TongQueParkFlush_24407 result = new C2S_TongQueParkFlush_24407(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkFlush_24407) {
               return this.mergeFrom((C2S_TongQueParkFlush_24407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkFlush_24407 other) {
            if (other == HuaJiaActMsg.C2S_TongQueParkFlush_24407.getDefaultInstance()) {
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
            C2S_TongQueParkFlush_24407 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkFlush_24407)HuaJiaActMsg.C2S_TongQueParkFlush_24407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkFlush_24407)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkFlush_24408 extends GeneratedMessageV3 implements S2C_TongQueParkFlush_24408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSHCOUNT_FIELD_NUMBER = 1;
      private int flushCount_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkFlush_24408 DEFAULT_INSTANCE = new S2C_TongQueParkFlush_24408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkFlush_24408> PARSER = new AbstractParser<S2C_TongQueParkFlush_24408>() {
         public S2C_TongQueParkFlush_24408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkFlush_24408(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkFlush_24408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkFlush_24408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkFlush_24408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkFlush_24408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.flushCount_ = input.readInt32();
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_24408.class, Builder.class);
      }

      public boolean hasFlushCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFlushCount() {
         return this.flushCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFlushCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.flushCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.flushCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkFlush_24408)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkFlush_24408 other = (S2C_TongQueParkFlush_24408)obj;
            if (this.hasFlushCount() != other.hasFlushCount()) {
               return false;
            } else if (this.hasFlushCount() && this.getFlushCount() != other.getFlushCount()) {
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
            if (this.hasFlushCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFlushCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_24408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_24408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_24408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_24408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_24408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkFlush_24408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkFlush_24408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkFlush_24408> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkFlush_24408> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkFlush_24408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkFlush_24408OrBuilder {
         private int bitField0_;
         private int flushCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_24408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkFlush_24408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.flushCount_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkFlush_24408_descriptor;
         }

         public S2C_TongQueParkFlush_24408 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkFlush_24408.getDefaultInstance();
         }

         public S2C_TongQueParkFlush_24408 build() {
            S2C_TongQueParkFlush_24408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkFlush_24408 buildPartial() {
            S2C_TongQueParkFlush_24408 result = new S2C_TongQueParkFlush_24408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.flushCount_ = this.flushCount_;
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
            if (other instanceof S2C_TongQueParkFlush_24408) {
               return this.mergeFrom((S2C_TongQueParkFlush_24408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkFlush_24408 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkFlush_24408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFlushCount()) {
                  this.setFlushCount(other.getFlushCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFlushCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkFlush_24408 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkFlush_24408)HuaJiaActMsg.S2C_TongQueParkFlush_24408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkFlush_24408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFlushCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFlushCount() {
            return this.flushCount_;
         }

         public Builder setFlushCount(int value) {
            this.bitField0_ |= 1;
            this.flushCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFlushCount() {
            this.bitField0_ &= -2;
            this.flushCount_ = 0;
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

   public static final class C2S_TongQueParkCommitTask_24413 extends GeneratedMessageV3 implements C2S_TongQueParkCommitTask_24413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkCommitTask_24413 DEFAULT_INSTANCE = new C2S_TongQueParkCommitTask_24413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkCommitTask_24413> PARSER = new AbstractParser<C2S_TongQueParkCommitTask_24413>() {
         public C2S_TongQueParkCommitTask_24413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkCommitTask_24413(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkCommitTask_24413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkCommitTask_24413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkCommitTask_24413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkCommitTask_24413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_24413.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkCommitTask_24413)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkCommitTask_24413 other = (C2S_TongQueParkCommitTask_24413)obj;
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

      public static C2S_TongQueParkCommitTask_24413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_24413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_24413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_24413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_24413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_24413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkCommitTask_24413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkCommitTask_24413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkCommitTask_24413> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkCommitTask_24413> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkCommitTask_24413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkCommitTask_24413OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_24413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueParkCommitTask_24413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueParkCommitTask_24413_descriptor;
         }

         public C2S_TongQueParkCommitTask_24413 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueParkCommitTask_24413.getDefaultInstance();
         }

         public C2S_TongQueParkCommitTask_24413 build() {
            C2S_TongQueParkCommitTask_24413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkCommitTask_24413 buildPartial() {
            C2S_TongQueParkCommitTask_24413 result = new C2S_TongQueParkCommitTask_24413(this);
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
            if (other instanceof C2S_TongQueParkCommitTask_24413) {
               return this.mergeFrom((C2S_TongQueParkCommitTask_24413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkCommitTask_24413 other) {
            if (other == HuaJiaActMsg.C2S_TongQueParkCommitTask_24413.getDefaultInstance()) {
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
            C2S_TongQueParkCommitTask_24413 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkCommitTask_24413)HuaJiaActMsg.C2S_TongQueParkCommitTask_24413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkCommitTask_24413)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkCommitTask_24414 extends GeneratedMessageV3 implements S2C_TongQueParkCommitTask_24414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkCommitTask_24414 DEFAULT_INSTANCE = new S2C_TongQueParkCommitTask_24414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkCommitTask_24414> PARSER = new AbstractParser<S2C_TongQueParkCommitTask_24414>() {
         public S2C_TongQueParkCommitTask_24414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkCommitTask_24414(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkCommitTask_24414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkCommitTask_24414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkCommitTask_24414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkCommitTask_24414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_24414.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkCommitTask_24414)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkCommitTask_24414 other = (S2C_TongQueParkCommitTask_24414)obj;
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

      public static S2C_TongQueParkCommitTask_24414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_24414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_24414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_24414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_24414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_24414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkCommitTask_24414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkCommitTask_24414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkCommitTask_24414> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkCommitTask_24414> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkCommitTask_24414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkCommitTask_24414OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_24414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkCommitTask_24414.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkCommitTask_24414_descriptor;
         }

         public S2C_TongQueParkCommitTask_24414 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkCommitTask_24414.getDefaultInstance();
         }

         public S2C_TongQueParkCommitTask_24414 build() {
            S2C_TongQueParkCommitTask_24414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkCommitTask_24414 buildPartial() {
            S2C_TongQueParkCommitTask_24414 result = new S2C_TongQueParkCommitTask_24414(this);
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
            if (other instanceof S2C_TongQueParkCommitTask_24414) {
               return this.mergeFrom((S2C_TongQueParkCommitTask_24414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkCommitTask_24414 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkCommitTask_24414.getDefaultInstance()) {
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
            S2C_TongQueParkCommitTask_24414 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkCommitTask_24414)HuaJiaActMsg.S2C_TongQueParkCommitTask_24414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkCommitTask_24414)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkTasks_24416 extends GeneratedMessageV3 implements S2C_TongQueParkTasks_24416OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkTasks_24416 DEFAULT_INSTANCE = new S2C_TongQueParkTasks_24416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkTasks_24416> PARSER = new AbstractParser<S2C_TongQueParkTasks_24416>() {
         public S2C_TongQueParkTasks_24416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkTasks_24416(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkTasks_24416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkTasks_24416() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkTasks_24416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkTasks_24416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_24416.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueParkTasks_24416)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkTasks_24416 other = (S2C_TongQueParkTasks_24416)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_24416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_24416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_24416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_24416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_24416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkTasks_24416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkTasks_24416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkTasks_24416> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkTasks_24416> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkTasks_24416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkTasks_24416OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_24416.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueParkTasks_24416.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueParkTasks_24416_descriptor;
         }

         public S2C_TongQueParkTasks_24416 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueParkTasks_24416.getDefaultInstance();
         }

         public S2C_TongQueParkTasks_24416 build() {
            S2C_TongQueParkTasks_24416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkTasks_24416 buildPartial() {
            S2C_TongQueParkTasks_24416 result = new S2C_TongQueParkTasks_24416(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_TongQueParkTasks_24416) {
               return this.mergeFrom((S2C_TongQueParkTasks_24416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkTasks_24416 other) {
            if (other == HuaJiaActMsg.S2C_TongQueParkTasks_24416.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = HuaJiaActMsg.S2C_TongQueParkTasks_24416.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueParkTasks_24416 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkTasks_24416)HuaJiaActMsg.S2C_TongQueParkTasks_24416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkTasks_24416)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ChessList_24417 extends GeneratedMessageV3 implements C2S_ChessList_24417OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChessList_24417 DEFAULT_INSTANCE = new C2S_ChessList_24417();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChessList_24417> PARSER = new AbstractParser<C2S_ChessList_24417>() {
         public C2S_ChessList_24417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChessList_24417(input, extensionRegistry);
         }
      };

      private C2S_ChessList_24417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChessList_24417() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChessList_24417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChessList_24417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_24417.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChessList_24417)) {
            return super.equals(obj);
         } else {
            C2S_ChessList_24417 other = (C2S_ChessList_24417)obj;
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

      public static C2S_ChessList_24417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_24417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_24417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_24417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_24417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_24417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_24417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_24417 parseFrom(InputStream input) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_24417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_24417 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChessList_24417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_24417 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_24417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_24417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChessList_24417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChessList_24417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChessList_24417> parser() {
         return PARSER;
      }

      public Parser<C2S_ChessList_24417> getParserForType() {
         return PARSER;
      }

      public C2S_ChessList_24417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChessList_24417OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_24417.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_ChessList_24417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_ChessList_24417_descriptor;
         }

         public C2S_ChessList_24417 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_ChessList_24417.getDefaultInstance();
         }

         public C2S_ChessList_24417 build() {
            C2S_ChessList_24417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChessList_24417 buildPartial() {
            C2S_ChessList_24417 result = new C2S_ChessList_24417(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChessList_24417) {
               return this.mergeFrom((C2S_ChessList_24417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChessList_24417 other) {
            if (other == HuaJiaActMsg.C2S_ChessList_24417.getDefaultInstance()) {
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
            C2S_ChessList_24417 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChessList_24417)HuaJiaActMsg.C2S_ChessList_24417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChessList_24417)e.getUnfinishedMessage();
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

   public static final class S2C_ChessList_24418 extends GeneratedMessageV3 implements S2C_ChessList_24418OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      private byte memoizedIsInitialized;
      private static final S2C_ChessList_24418 DEFAULT_INSTANCE = new S2C_ChessList_24418();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChessList_24418> PARSER = new AbstractParser<S2C_ChessList_24418>() {
         public S2C_ChessList_24418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChessList_24418(input, extensionRegistry);
         }
      };

      private S2C_ChessList_24418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChessList_24418() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChessList_24418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChessList_24418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.chessList_.add(input.readMessage(HuaJiaActMsg.ChessData.PARSER, extensionRegistry));
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
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_24418.class, Builder.class);
      }

      public List<ChessData> getChessListList() {
         return this.chessList_;
      }

      public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
         return this.chessList_;
      }

      public int getChessListCount() {
         return this.chessList_.size();
      }

      public ChessData getChessList(int index) {
         return (ChessData)this.chessList_.get(index);
      }

      public ChessDataOrBuilder getChessListOrBuilder(int index) {
         return (ChessDataOrBuilder)this.chessList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.chessList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.chessList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.chessList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.chessList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChessList_24418)) {
            return super.equals(obj);
         } else {
            S2C_ChessList_24418 other = (S2C_ChessList_24418)obj;
            if (!this.getChessListList().equals(other.getChessListList())) {
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
            if (this.getChessListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChessListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChessList_24418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_24418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_24418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_24418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_24418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_24418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_24418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_24418 parseFrom(InputStream input) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_24418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_24418 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChessList_24418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_24418 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_24418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_24418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChessList_24418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChessList_24418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChessList_24418> parser() {
         return PARSER;
      }

      public Parser<S2C_ChessList_24418> getParserForType() {
         return PARSER;
      }

      public S2C_ChessList_24418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChessList_24418OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_24418.class, Builder.class);
         }

         private Builder() {
            this.chessList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chessList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_ChessList_24418.alwaysUseFieldBuilders) {
               this.getChessListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_ChessList_24418_descriptor;
         }

         public S2C_ChessList_24418 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_ChessList_24418.getDefaultInstance();
         }

         public S2C_ChessList_24418 build() {
            S2C_ChessList_24418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChessList_24418 buildPartial() {
            S2C_ChessList_24418 result = new S2C_ChessList_24418(this);
            int from_bitField0_ = this.bitField0_;
            if (this.chessListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.chessList_ = Collections.unmodifiableList(this.chessList_);
                  this.bitField0_ &= -2;
               }

               result.chessList_ = this.chessList_;
            } else {
               result.chessList_ = this.chessListBuilder_.build();
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
            if (other instanceof S2C_ChessList_24418) {
               return this.mergeFrom((S2C_ChessList_24418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChessList_24418 other) {
            if (other == HuaJiaActMsg.S2C_ChessList_24418.getDefaultInstance()) {
               return this;
            } else {
               if (this.chessListBuilder_ == null) {
                  if (!other.chessList_.isEmpty()) {
                     if (this.chessList_.isEmpty()) {
                        this.chessList_ = other.chessList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureChessListIsMutable();
                        this.chessList_.addAll(other.chessList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.chessList_.isEmpty()) {
                  if (this.chessListBuilder_.isEmpty()) {
                     this.chessListBuilder_.dispose();
                     this.chessListBuilder_ = null;
                     this.chessList_ = other.chessList_;
                     this.bitField0_ &= -2;
                     this.chessListBuilder_ = HuaJiaActMsg.S2C_ChessList_24418.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
                  } else {
                     this.chessListBuilder_.addAllMessages(other.chessList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getChessListCount(); ++i) {
               if (!this.getChessList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChessList_24418 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChessList_24418)HuaJiaActMsg.S2C_ChessList_24418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChessList_24418)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureChessListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.chessList_ = new ArrayList(this.chessList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ChessData> getChessListList() {
            return this.chessListBuilder_ == null ? Collections.unmodifiableList(this.chessList_) : this.chessListBuilder_.getMessageList();
         }

         public int getChessListCount() {
            return this.chessListBuilder_ == null ? this.chessList_.size() : this.chessListBuilder_.getCount();
         }

         public ChessData getChessList(int index) {
            return this.chessListBuilder_ == null ? (ChessData)this.chessList_.get(index) : (ChessData)this.chessListBuilder_.getMessage(index);
         }

         public Builder setChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.set(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addChessList(int index, ChessData value) {
            if (this.chessListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureChessListIsMutable();
               this.chessList_.add(index, value);
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addChessList(ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addChessList(int index, ChessData.Builder builderForValue) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.chessListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllChessList(Iterable<? extends ChessData> values) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chessList_);
               this.onChanged();
            } else {
               this.chessListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearChessList() {
            if (this.chessListBuilder_ == null) {
               this.chessList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.chessListBuilder_.clear();
            }

            return this;
         }

         public Builder removeChessList(int index) {
            if (this.chessListBuilder_ == null) {
               this.ensureChessListIsMutable();
               this.chessList_.remove(index);
               this.onChanged();
            } else {
               this.chessListBuilder_.remove(index);
            }

            return this;
         }

         public ChessData.Builder getChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().getBuilder(index);
         }

         public ChessDataOrBuilder getChessListOrBuilder(int index) {
            return this.chessListBuilder_ == null ? (ChessDataOrBuilder)this.chessList_.get(index) : (ChessDataOrBuilder)this.chessListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ChessDataOrBuilder> getChessListOrBuilderList() {
            return this.chessListBuilder_ != null ? this.chessListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chessList_);
         }

         public ChessData.Builder addChessListBuilder() {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, HuaJiaActMsg.ChessData.getDefaultInstance());
         }

         public List<ChessData.Builder> getChessListBuilderList() {
            return this.getChessListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> getChessListFieldBuilder() {
            if (this.chessListBuilder_ == null) {
               this.chessListBuilder_ = new RepeatedFieldBuilderV3(this.chessList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.chessList_ = null;
            }

            return this.chessListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TongQueTreasureInfo_24419 extends GeneratedMessageV3 implements C2S_TongQueTreasureInfo_24419OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueTreasureInfo_24419 DEFAULT_INSTANCE = new C2S_TongQueTreasureInfo_24419();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueTreasureInfo_24419> PARSER = new AbstractParser<C2S_TongQueTreasureInfo_24419>() {
         public C2S_TongQueTreasureInfo_24419 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueTreasureInfo_24419(input, extensionRegistry);
         }
      };

      private C2S_TongQueTreasureInfo_24419(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueTreasureInfo_24419() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueTreasureInfo_24419();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueTreasureInfo_24419(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueTreasureInfo_24419.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueTreasureInfo_24419)) {
            return super.equals(obj);
         } else {
            C2S_TongQueTreasureInfo_24419 other = (C2S_TongQueTreasureInfo_24419)obj;
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

      public static C2S_TongQueTreasureInfo_24419 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_24419)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_24419 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_24419 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_24419 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_24419)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueTreasureInfo_24419 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueTreasureInfo_24419 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueTreasureInfo_24419> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueTreasureInfo_24419> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueTreasureInfo_24419 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueTreasureInfo_24419OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueTreasureInfo_24419.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_TongQueTreasureInfo_24419.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_TongQueTreasureInfo_24419_descriptor;
         }

         public C2S_TongQueTreasureInfo_24419 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_TongQueTreasureInfo_24419.getDefaultInstance();
         }

         public C2S_TongQueTreasureInfo_24419 build() {
            C2S_TongQueTreasureInfo_24419 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueTreasureInfo_24419 buildPartial() {
            C2S_TongQueTreasureInfo_24419 result = new C2S_TongQueTreasureInfo_24419(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueTreasureInfo_24419) {
               return this.mergeFrom((C2S_TongQueTreasureInfo_24419)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueTreasureInfo_24419 other) {
            if (other == HuaJiaActMsg.C2S_TongQueTreasureInfo_24419.getDefaultInstance()) {
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
            C2S_TongQueTreasureInfo_24419 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueTreasureInfo_24419)HuaJiaActMsg.C2S_TongQueTreasureInfo_24419.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueTreasureInfo_24419)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueTreasureInfo_24420 extends GeneratedMessageV3 implements S2C_TongQueTreasureInfo_24420OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> myRecord_;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RecruitRecord> allRecord_;
      public static final int AWARDLIST_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> awardList_;
      public static final int SPECIALRECRUITNUM_FIELD_NUMBER = 6;
      private int specialRecruitNum_;
      public static final int DRAWNUM_FIELD_NUMBER = 8;
      private int drawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueTreasureInfo_24420 DEFAULT_INSTANCE = new S2C_TongQueTreasureInfo_24420();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueTreasureInfo_24420> PARSER = new AbstractParser<S2C_TongQueTreasureInfo_24420>() {
         public S2C_TongQueTreasureInfo_24420 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueTreasureInfo_24420(input, extensionRegistry);
         }
      };

      private S2C_TongQueTreasureInfo_24420(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueTreasureInfo_24420() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.allRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueTreasureInfo_24420();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueTreasureInfo_24420(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(HuaJiaActMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.allRecord_.add(input.readMessage(HuaJiaActMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.awardList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.awardList_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 1;
                        this.specialRecruitNum_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 2;
                        this.drawNum_ = input.readInt32();
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

               if ((mutable_bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueTreasureInfo_24420.class, Builder.class);
      }

      public List<RecruitRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RecruitRecord getMyRecord(int index) {
         return (RecruitRecord)this.myRecord_.get(index);
      }

      public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.myRecord_.get(index);
      }

      public List<RecruitRecord> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RecruitRecord getAllRecord(int index) {
         return (RecruitRecord)this.allRecord_.get(index);
      }

      public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.allRecord_.get(index);
      }

      public List<CommonMsg.MapDataII> getAwardListList() {
         return this.awardList_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public CommonMsg.MapDataII getAwardList(int index) {
         return (CommonMsg.MapDataII)this.awardList_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index);
      }

      public boolean hasSpecialRecruitNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSpecialRecruitNum() {
         return this.specialRecruitNum_;
      }

      public boolean hasDrawNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDrawNum() {
         return this.drawNum_;
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

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
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

         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecord_.get(i));
         }

         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.awardList_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(6, this.specialRecruitNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(8, this.drawNum_);
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

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecord_.get(i));
            }

            for(int i = 0; i < this.awardList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.awardList_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.specialRecruitNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.drawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TongQueTreasureInfo_24420)) {
            return super.equals(obj);
         } else {
            S2C_TongQueTreasureInfo_24420 other = (S2C_TongQueTreasureInfo_24420)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAllRecordList().equals(other.getAllRecordList())) {
               return false;
            } else if (!this.getAwardListList().equals(other.getAwardListList())) {
               return false;
            } else if (this.hasSpecialRecruitNum() != other.hasSpecialRecruitNum()) {
               return false;
            } else if (this.hasSpecialRecruitNum() && this.getSpecialRecruitNum() != other.getSpecialRecruitNum()) {
               return false;
            } else if (this.hasDrawNum() != other.hasDrawNum()) {
               return false;
            } else if (this.hasDrawNum() && this.getDrawNum() != other.getDrawNum()) {
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

            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            if (this.hasSpecialRecruitNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getSpecialRecruitNum();
            }

            if (this.hasDrawNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_24420)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_24420 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_24420 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_24420 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_24420)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueTreasureInfo_24420 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueTreasureInfo_24420 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueTreasureInfo_24420> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueTreasureInfo_24420> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueTreasureInfo_24420 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueTreasureInfo_24420OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;
         private int specialRecruitNum_;
         private int drawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueTreasureInfo_24420.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
               this.getAllRecordFieldBuilder();
               this.getAwardListFieldBuilder();
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

            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.allRecordBuilder_.clear();
            }

            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.awardListBuilder_.clear();
            }

            this.specialRecruitNum_ = 0;
            this.bitField0_ &= -9;
            this.drawNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_TongQueTreasureInfo_24420_descriptor;
         }

         public S2C_TongQueTreasureInfo_24420 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.getDefaultInstance();
         }

         public S2C_TongQueTreasureInfo_24420 build() {
            S2C_TongQueTreasureInfo_24420 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueTreasureInfo_24420 buildPartial() {
            S2C_TongQueTreasureInfo_24420 result = new S2C_TongQueTreasureInfo_24420(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
            }

            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -3;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
            }

            if (this.awardListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
                  this.bitField0_ &= -5;
               }

               result.awardList_ = this.awardList_;
            } else {
               result.awardList_ = this.awardListBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.specialRecruitNum_ = this.specialRecruitNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.drawNum_ = this.drawNum_;
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
            if (other instanceof S2C_TongQueTreasureInfo_24420) {
               return this.mergeFrom((S2C_TongQueTreasureInfo_24420)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueTreasureInfo_24420 other) {
            if (other == HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -3;
                     this.allRecordBuilder_ = HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               if (this.awardListBuilder_ == null) {
                  if (!other.awardList_.isEmpty()) {
                     if (this.awardList_.isEmpty()) {
                        this.awardList_ = other.awardList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAwardListIsMutable();
                        this.awardList_.addAll(other.awardList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardList_.isEmpty()) {
                  if (this.awardListBuilder_.isEmpty()) {
                     this.awardListBuilder_.dispose();
                     this.awardListBuilder_ = null;
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -5;
                     this.awardListBuilder_ = HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
                  } else {
                     this.awardListBuilder_.addAllMessages(other.awardList_);
                  }
               }

               if (other.hasSpecialRecruitNum()) {
                  this.setSpecialRecruitNum(other.getSpecialRecruitNum());
               }

               if (other.hasDrawNum()) {
                  this.setDrawNum(other.getDrawNum());
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

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TongQueTreasureInfo_24420 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueTreasureInfo_24420)HuaJiaActMsg.S2C_TongQueTreasureInfo_24420.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueTreasureInfo_24420)e.getUnfinishedMessage();
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

         public List<RecruitRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RecruitRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecord)this.myRecord_.get(index) : (RecruitRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RecruitRecord value) {
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

         public Builder setMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord value) {
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

         public Builder addMyRecord(int index, RecruitRecord value) {
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

         public Builder addMyRecord(RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RecruitRecord> values) {
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

         public RecruitRecord.Builder getMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.myRecord_.get(index) : (RecruitRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RecruitRecord.Builder addMyRecordBuilder() {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 2;
            }

         }

         public List<RecruitRecord> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RecruitRecord getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecord)this.allRecord_.get(index) : (RecruitRecord)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.allRecord_.get(index) : (RecruitRecordOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RecruitRecord.Builder addAllRecordBuilder() {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.awardList_ = new ArrayList(this.awardList_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getAwardListList() {
            return this.awardListBuilder_ == null ? Collections.unmodifiableList(this.awardList_) : this.awardListBuilder_.getMessageList();
         }

         public int getAwardListCount() {
            return this.awardListBuilder_ == null ? this.awardList_.size() : this.awardListBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAwardList(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataII)this.awardList_.get(index) : (CommonMsg.MapDataII)this.awardListBuilder_.getMessage(index);
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.set(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardList(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
               this.onChanged();
            } else {
               this.awardListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardList() {
            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardList(int index) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.remove(index);
               this.onChanged();
            } else {
               this.awardListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.awardListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
            return this.awardListBuilder_ != null ? this.awardListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardList_);
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAwardListBuilderList() {
            return this.getAwardListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAwardListFieldBuilder() {
            if (this.awardListBuilder_ == null) {
               this.awardListBuilder_ = new RepeatedFieldBuilderV3(this.awardList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.awardList_ = null;
            }

            return this.awardListBuilder_;
         }

         public boolean hasSpecialRecruitNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSpecialRecruitNum() {
            return this.specialRecruitNum_;
         }

         public Builder setSpecialRecruitNum(int value) {
            this.bitField0_ |= 8;
            this.specialRecruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSpecialRecruitNum() {
            this.bitField0_ &= -9;
            this.specialRecruitNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDrawNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDrawNum() {
            return this.drawNum_;
         }

         public Builder setDrawNum(int value) {
            this.bitField0_ |= 16;
            this.drawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawNum() {
            this.bitField0_ &= -17;
            this.drawNum_ = 0;
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

   public static final class RecruitRecord extends GeneratedMessageV3 implements RecruitRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int AWARDID_FIELD_NUMBER = 4;
      private int awardId_;
      private byte memoizedIsInitialized;
      private static final RecruitRecord DEFAULT_INSTANCE = new RecruitRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecruitRecord> PARSER = new AbstractParser<RecruitRecord>() {
         public RecruitRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecruitRecord(input, extensionRegistry);
         }
      };

      private RecruitRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecruitRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecruitRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecruitRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.awardId_ = input.readInt32();
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasAwardId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.awardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.awardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecruitRecord)) {
            return super.equals(obj);
         } else {
            RecruitRecord other = (RecruitRecord)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasAwardId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAwardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecruitRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseFrom(CodedInputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecruitRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecruitRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecruitRecord> parser() {
         return PARSER;
      }

      public Parser<RecruitRecord> getParserForType() {
         return PARSER;
      }

      public RecruitRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecruitRecordOrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int awardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
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
            if (HuaJiaActMsg.RecruitRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.awardId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         public RecruitRecord getDefaultInstanceForType() {
            return HuaJiaActMsg.RecruitRecord.getDefaultInstance();
         }

         public RecruitRecord build() {
            RecruitRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecruitRecord buildPartial() {
            RecruitRecord result = new RecruitRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.awardId_ = this.awardId_;
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
            if (other instanceof RecruitRecord) {
               return this.mergeFrom((RecruitRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecruitRecord other) {
            if (other == HuaJiaActMsg.RecruitRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasAwardId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecruitRecord parsedMessage = null;

            try {
               parsedMessage = (RecruitRecord)HuaJiaActMsg.RecruitRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecruitRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 2;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -3;
            this.playerId_ = 0;
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
            this.playerName_ = HuaJiaActMsg.RecruitRecord.getDefaultInstance().getPlayerName();
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

         public boolean hasAwardId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 8;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -9;
            this.awardId_ = 0;
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

   public static final class C2S_RecruitTongQueTreasure_24421 extends GeneratedMessageV3 implements C2S_RecruitTongQueTreasure_24421OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECRUITNUM_FIELD_NUMBER = 2;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitTongQueTreasure_24421 DEFAULT_INSTANCE = new C2S_RecruitTongQueTreasure_24421();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitTongQueTreasure_24421> PARSER = new AbstractParser<C2S_RecruitTongQueTreasure_24421>() {
         public C2S_RecruitTongQueTreasure_24421 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitTongQueTreasure_24421(input, extensionRegistry);
         }
      };

      private C2S_RecruitTongQueTreasure_24421(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitTongQueTreasure_24421() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitTongQueTreasure_24421();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitTongQueTreasure_24421(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recruitNum_ = input.readInt32();
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitTongQueTreasure_24421.class, Builder.class);
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.recruitNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.recruitNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecruitTongQueTreasure_24421)) {
            return super.equals(obj);
         } else {
            C2S_RecruitTongQueTreasure_24421 other = (C2S_RecruitTongQueTreasure_24421)obj;
            if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
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
            if (this.hasRecruitNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecruitNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_24421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_24421 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_24421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitTongQueTreasure_24421 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitTongQueTreasure_24421 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitTongQueTreasure_24421> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitTongQueTreasure_24421> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitTongQueTreasure_24421 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitTongQueTreasure_24421OrBuilder {
         private int bitField0_;
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitTongQueTreasure_24421.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_RecruitTongQueTreasure_24421.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recruitNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_24421_descriptor;
         }

         public C2S_RecruitTongQueTreasure_24421 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_RecruitTongQueTreasure_24421.getDefaultInstance();
         }

         public C2S_RecruitTongQueTreasure_24421 build() {
            C2S_RecruitTongQueTreasure_24421 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitTongQueTreasure_24421 buildPartial() {
            C2S_RecruitTongQueTreasure_24421 result = new C2S_RecruitTongQueTreasure_24421(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recruitNum_ = this.recruitNum_;
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
            if (other instanceof C2S_RecruitTongQueTreasure_24421) {
               return this.mergeFrom((C2S_RecruitTongQueTreasure_24421)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitTongQueTreasure_24421 other) {
            if (other == HuaJiaActMsg.C2S_RecruitTongQueTreasure_24421.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecruitNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecruitTongQueTreasure_24421 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitTongQueTreasure_24421)HuaJiaActMsg.C2S_RecruitTongQueTreasure_24421.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitTongQueTreasure_24421)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 1;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -2;
            this.recruitNum_ = 0;
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

   public static final class S2C_RecruitTongQueTreasure_24422 extends GeneratedMessageV3 implements S2C_RecruitTongQueTreasure_24422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULTLIST_FIELD_NUMBER = 1;
      private Internal.IntList resultList_;
      public static final int DRAWNUM_FIELD_NUMBER = 8;
      private int drawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitTongQueTreasure_24422 DEFAULT_INSTANCE = new S2C_RecruitTongQueTreasure_24422();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitTongQueTreasure_24422> PARSER = new AbstractParser<S2C_RecruitTongQueTreasure_24422>() {
         public S2C_RecruitTongQueTreasure_24422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitTongQueTreasure_24422(input, extensionRegistry);
         }
      };

      private S2C_RecruitTongQueTreasure_24422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitTongQueTreasure_24422() {
         this.memoizedIsInitialized = -1;
         this.resultList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitTongQueTreasure_24422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitTongQueTreasure_24422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.resultList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.resultList_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.resultList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 64:
                        this.bitField0_ |= 1;
                        this.drawNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.resultList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.resultList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitTongQueTreasure_24422.class, Builder.class);
      }

      public List<Integer> getResultListList() {
         return this.resultList_;
      }

      public int getResultListCount() {
         return this.resultList_.size();
      }

      public int getResultList(int index) {
         return this.resultList_.getInt(index);
      }

      public boolean hasDrawNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawNum() {
         return this.drawNum_;
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
         for(int i = 0; i < this.resultList_.size(); ++i) {
            output.writeInt32(1, this.resultList_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(8, this.drawNum_);
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

            for(int i = 0; i < this.resultList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.resultList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getResultListList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.drawNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitTongQueTreasure_24422)) {
            return super.equals(obj);
         } else {
            S2C_RecruitTongQueTreasure_24422 other = (S2C_RecruitTongQueTreasure_24422)obj;
            if (!this.getResultListList().equals(other.getResultListList())) {
               return false;
            } else if (this.hasDrawNum() != other.hasDrawNum()) {
               return false;
            } else if (this.hasDrawNum() && this.getDrawNum() != other.getDrawNum()) {
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
            if (this.getResultListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResultListList().hashCode();
            }

            if (this.hasDrawNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDrawNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_24422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_24422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_24422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitTongQueTreasure_24422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitTongQueTreasure_24422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitTongQueTreasure_24422> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitTongQueTreasure_24422> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitTongQueTreasure_24422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitTongQueTreasure_24422OrBuilder {
         private int bitField0_;
         private Internal.IntList resultList_;
         private int drawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitTongQueTreasure_24422.class, Builder.class);
         }

         private Builder() {
            this.resultList_ = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.resultList_ = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.resultList_ = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.emptyIntList();
            this.bitField0_ &= -2;
            this.drawNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_24422_descriptor;
         }

         public S2C_RecruitTongQueTreasure_24422 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.getDefaultInstance();
         }

         public S2C_RecruitTongQueTreasure_24422 build() {
            S2C_RecruitTongQueTreasure_24422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitTongQueTreasure_24422 buildPartial() {
            S2C_RecruitTongQueTreasure_24422 result = new S2C_RecruitTongQueTreasure_24422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.resultList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.resultList_ = this.resultList_;
            if ((from_bitField0_ & 2) != 0) {
               result.drawNum_ = this.drawNum_;
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
            if (other instanceof S2C_RecruitTongQueTreasure_24422) {
               return this.mergeFrom((S2C_RecruitTongQueTreasure_24422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitTongQueTreasure_24422 other) {
            if (other == HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.getDefaultInstance()) {
               return this;
            } else {
               if (!other.resultList_.isEmpty()) {
                  if (this.resultList_.isEmpty()) {
                     this.resultList_ = other.resultList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureResultListIsMutable();
                     this.resultList_.addAll(other.resultList_);
                  }

                  this.onChanged();
               }

               if (other.hasDrawNum()) {
                  this.setDrawNum(other.getDrawNum());
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
            S2C_RecruitTongQueTreasure_24422 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitTongQueTreasure_24422)HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitTongQueTreasure_24422)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureResultListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.resultList_ = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.mutableCopy(this.resultList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getResultListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.resultList_) : this.resultList_);
         }

         public int getResultListCount() {
            return this.resultList_.size();
         }

         public int getResultList(int index) {
            return this.resultList_.getInt(index);
         }

         public Builder setResultList(int index, int value) {
            this.ensureResultListIsMutable();
            this.resultList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addResultList(int value) {
            this.ensureResultListIsMutable();
            this.resultList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllResultList(Iterable<? extends Integer> values) {
            this.ensureResultListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.resultList_);
            this.onChanged();
            return this;
         }

         public Builder clearResultList() {
            this.resultList_ = HuaJiaActMsg.S2C_RecruitTongQueTreasure_24422.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasDrawNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDrawNum() {
            return this.drawNum_;
         }

         public Builder setDrawNum(int value) {
            this.bitField0_ |= 2;
            this.drawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawNum() {
            this.bitField0_ &= -3;
            this.drawNum_ = 0;
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

   public static final class S2C_RecruitRecordInfo_24424 extends GeneratedMessageV3 implements S2C_RecruitRecordInfo_24424OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RecruitRecord> allRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitRecordInfo_24424 DEFAULT_INSTANCE = new S2C_RecruitRecordInfo_24424();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitRecordInfo_24424> PARSER = new AbstractParser<S2C_RecruitRecordInfo_24424>() {
         public S2C_RecruitRecordInfo_24424 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitRecordInfo_24424(input, extensionRegistry);
         }
      };

      private S2C_RecruitRecordInfo_24424(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitRecordInfo_24424() {
         this.memoizedIsInitialized = -1;
         this.allRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitRecordInfo_24424();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitRecordInfo_24424(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.allRecord_.add(input.readMessage(HuaJiaActMsg.RecruitRecord.PARSER, extensionRegistry));
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
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_24424.class, Builder.class);
      }

      public List<RecruitRecord> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RecruitRecord getAllRecord(int index) {
         return (RecruitRecord)this.allRecord_.get(index);
      }

      public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.allRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitRecordInfo_24424)) {
            return super.equals(obj);
         } else {
            S2C_RecruitRecordInfo_24424 other = (S2C_RecruitRecordInfo_24424)obj;
            if (!this.getAllRecordList().equals(other.getAllRecordList())) {
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
            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_24424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_24424 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_24424 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_24424 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_24424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitRecordInfo_24424 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitRecordInfo_24424 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitRecordInfo_24424> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitRecordInfo_24424> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitRecordInfo_24424 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitRecordInfo_24424OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_24424.class, Builder.class);
         }

         private Builder() {
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_RecruitRecordInfo_24424.alwaysUseFieldBuilders) {
               this.getAllRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitRecordInfo_24424_descriptor;
         }

         public S2C_RecruitRecordInfo_24424 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_RecruitRecordInfo_24424.getDefaultInstance();
         }

         public S2C_RecruitRecordInfo_24424 build() {
            S2C_RecruitRecordInfo_24424 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitRecordInfo_24424 buildPartial() {
            S2C_RecruitRecordInfo_24424 result = new S2C_RecruitRecordInfo_24424(this);
            int from_bitField0_ = this.bitField0_;
            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -2;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
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
            if (other instanceof S2C_RecruitRecordInfo_24424) {
               return this.mergeFrom((S2C_RecruitRecordInfo_24424)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitRecordInfo_24424 other) {
            if (other == HuaJiaActMsg.S2C_RecruitRecordInfo_24424.getDefaultInstance()) {
               return this;
            } else {
               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -2;
                     this.allRecordBuilder_ = HuaJiaActMsg.S2C_RecruitRecordInfo_24424.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitRecordInfo_24424 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitRecordInfo_24424)HuaJiaActMsg.S2C_RecruitRecordInfo_24424.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitRecordInfo_24424)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RecruitRecord getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecord)this.allRecord_.get(index) : (RecruitRecord)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.allRecord_.get(index) : (RecruitRecordOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RecruitRecord.Builder addAllRecordBuilder() {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecruitResult_24425 extends GeneratedMessageV3 implements C2S_RecruitResult_24425OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitResult_24425 DEFAULT_INSTANCE = new C2S_RecruitResult_24425();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitResult_24425> PARSER = new AbstractParser<C2S_RecruitResult_24425>() {
         public C2S_RecruitResult_24425 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitResult_24425(input, extensionRegistry);
         }
      };

      private C2S_RecruitResult_24425(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitResult_24425() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitResult_24425();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitResult_24425(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_24425.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitResult_24425)) {
            return super.equals(obj);
         } else {
            C2S_RecruitResult_24425 other = (C2S_RecruitResult_24425)obj;
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

      public static C2S_RecruitResult_24425 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_24425 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_24425 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_24425 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_24425 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_24425 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_24425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_24425 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_24425 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_24425 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_24425 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_24425 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_24425 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_24425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitResult_24425 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitResult_24425 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitResult_24425> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitResult_24425> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitResult_24425 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitResult_24425OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_24425.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.C2S_RecruitResult_24425.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_C2S_RecruitResult_24425_descriptor;
         }

         public C2S_RecruitResult_24425 getDefaultInstanceForType() {
            return HuaJiaActMsg.C2S_RecruitResult_24425.getDefaultInstance();
         }

         public C2S_RecruitResult_24425 build() {
            C2S_RecruitResult_24425 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitResult_24425 buildPartial() {
            C2S_RecruitResult_24425 result = new C2S_RecruitResult_24425(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RecruitResult_24425) {
               return this.mergeFrom((C2S_RecruitResult_24425)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitResult_24425 other) {
            if (other == HuaJiaActMsg.C2S_RecruitResult_24425.getDefaultInstance()) {
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
            C2S_RecruitResult_24425 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitResult_24425)HuaJiaActMsg.C2S_RecruitResult_24425.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitResult_24425)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitResult_24426 extends GeneratedMessageV3 implements S2C_RecruitResult_24426OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> myRecord_;
      public static final int AWARDLIST_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> awardList_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitResult_24426 DEFAULT_INSTANCE = new S2C_RecruitResult_24426();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitResult_24426> PARSER = new AbstractParser<S2C_RecruitResult_24426>() {
         public S2C_RecruitResult_24426 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitResult_24426(input, extensionRegistry);
         }
      };

      private S2C_RecruitResult_24426(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitResult_24426() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitResult_24426();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitResult_24426(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(HuaJiaActMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.awardList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.awardList_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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

               if ((mutable_bitField0_ & 2) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_24426.class, Builder.class);
      }

      public List<RecruitRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RecruitRecord getMyRecord(int index) {
         return (RecruitRecord)this.myRecord_.get(index);
      }

      public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.myRecord_.get(index);
      }

      public List<CommonMsg.MapDataII> getAwardListList() {
         return this.awardList_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public CommonMsg.MapDataII getAwardList(int index) {
         return (CommonMsg.MapDataII)this.awardList_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index);
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

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
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

         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.awardList_.get(i));
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

            for(int i = 0; i < this.awardList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.awardList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitResult_24426)) {
            return super.equals(obj);
         } else {
            S2C_RecruitResult_24426 other = (S2C_RecruitResult_24426)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAwardListList().equals(other.getAwardListList())) {
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

            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitResult_24426 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_24426 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_24426 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_24426 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_24426 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_24426 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_24426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_24426 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_24426 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_24426 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_24426 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_24426 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_24426 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_24426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitResult_24426 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitResult_24426 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitResult_24426> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitResult_24426> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitResult_24426 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitResult_24426OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_24426.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2C_RecruitResult_24426.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
               this.getAwardListFieldBuilder();
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

            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2C_RecruitResult_24426_descriptor;
         }

         public S2C_RecruitResult_24426 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2C_RecruitResult_24426.getDefaultInstance();
         }

         public S2C_RecruitResult_24426 build() {
            S2C_RecruitResult_24426 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitResult_24426 buildPartial() {
            S2C_RecruitResult_24426 result = new S2C_RecruitResult_24426(this);
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

            if (this.awardListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
                  this.bitField0_ &= -3;
               }

               result.awardList_ = this.awardList_;
            } else {
               result.awardList_ = this.awardListBuilder_.build();
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
            if (other instanceof S2C_RecruitResult_24426) {
               return this.mergeFrom((S2C_RecruitResult_24426)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitResult_24426 other) {
            if (other == HuaJiaActMsg.S2C_RecruitResult_24426.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = HuaJiaActMsg.S2C_RecruitResult_24426.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.awardListBuilder_ == null) {
                  if (!other.awardList_.isEmpty()) {
                     if (this.awardList_.isEmpty()) {
                        this.awardList_ = other.awardList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAwardListIsMutable();
                        this.awardList_.addAll(other.awardList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardList_.isEmpty()) {
                  if (this.awardListBuilder_.isEmpty()) {
                     this.awardListBuilder_.dispose();
                     this.awardListBuilder_ = null;
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -3;
                     this.awardListBuilder_ = HuaJiaActMsg.S2C_RecruitResult_24426.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
                  } else {
                     this.awardListBuilder_.addAllMessages(other.awardList_);
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

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitResult_24426 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitResult_24426)HuaJiaActMsg.S2C_RecruitResult_24426.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitResult_24426)e.getUnfinishedMessage();
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

         public List<RecruitRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RecruitRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecord)this.myRecord_.get(index) : (RecruitRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RecruitRecord value) {
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

         public Builder setMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord value) {
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

         public Builder addMyRecord(int index, RecruitRecord value) {
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

         public Builder addMyRecord(RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RecruitRecord> values) {
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

         public RecruitRecord.Builder getMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.myRecord_.get(index) : (RecruitRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RecruitRecord.Builder addMyRecordBuilder() {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.awardList_ = new ArrayList(this.awardList_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getAwardListList() {
            return this.awardListBuilder_ == null ? Collections.unmodifiableList(this.awardList_) : this.awardListBuilder_.getMessageList();
         }

         public int getAwardListCount() {
            return this.awardListBuilder_ == null ? this.awardList_.size() : this.awardListBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAwardList(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataII)this.awardList_.get(index) : (CommonMsg.MapDataII)this.awardListBuilder_.getMessage(index);
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.set(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardList(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
               this.onChanged();
            } else {
               this.awardListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardList() {
            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardList(int index) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.remove(index);
               this.onChanged();
            } else {
               this.awardListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.awardListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
            return this.awardListBuilder_ != null ? this.awardListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardList_);
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAwardListBuilderList() {
            return this.getAwardListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAwardListFieldBuilder() {
            if (this.awardListBuilder_ == null) {
               this.awardListBuilder_ = new RepeatedFieldBuilderV3(this.awardList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.awardList_ = null;
            }

            return this.awardListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_RecruitRecord_24427 extends GeneratedMessageV3 implements S2S_RecruitRecord_24427OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> record_;
      private byte memoizedIsInitialized;
      private static final S2S_RecruitRecord_24427 DEFAULT_INSTANCE = new S2S_RecruitRecord_24427();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_RecruitRecord_24427> PARSER = new AbstractParser<S2S_RecruitRecord_24427>() {
         public S2S_RecruitRecord_24427 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_RecruitRecord_24427(input, extensionRegistry);
         }
      };

      private S2S_RecruitRecord_24427(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_RecruitRecord_24427() {
         this.memoizedIsInitialized = -1;
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_RecruitRecord_24427();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_RecruitRecord_24427(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.record_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.record_.add(input.readMessage(HuaJiaActMsg.RecruitRecord.PARSER, extensionRegistry));
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
                  this.record_ = Collections.unmodifiableList(this.record_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_24427.class, Builder.class);
      }

      public List<RecruitRecord> getRecordList() {
         return this.record_;
      }

      public List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public RecruitRecord getRecord(int index) {
         return (RecruitRecord)this.record_.get(index);
      }

      public RecruitRecordOrBuilder getRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.record_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordCount(); ++i) {
               if (!this.getRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.record_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.record_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.record_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.record_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_RecruitRecord_24427)) {
            return super.equals(obj);
         } else {
            S2S_RecruitRecord_24427 other = (S2S_RecruitRecord_24427)obj;
            if (!this.getRecordList().equals(other.getRecordList())) {
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
            if (this.getRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_RecruitRecord_24427 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_24427 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_24427 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_24427 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_24427 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_24427 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_24427)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_24427 parseFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_24427 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_24427 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_24427 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_24427 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_24427 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_24427)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_RecruitRecord_24427 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_RecruitRecord_24427 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_RecruitRecord_24427> parser() {
         return PARSER;
      }

      public Parser<S2S_RecruitRecord_24427> getParserForType() {
         return PARSER;
      }

      public S2S_RecruitRecord_24427 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_RecruitRecord_24427OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> record_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_24427.class, Builder.class);
         }

         private Builder() {
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HuaJiaActMsg.S2S_RecruitRecord_24427.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HuaJiaActMsg.internal_static_HuaJiaAct_com_gzbz_protobuf_S2S_RecruitRecord_24427_descriptor;
         }

         public S2S_RecruitRecord_24427 getDefaultInstanceForType() {
            return HuaJiaActMsg.S2S_RecruitRecord_24427.getDefaultInstance();
         }

         public S2S_RecruitRecord_24427 build() {
            S2S_RecruitRecord_24427 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_RecruitRecord_24427 buildPartial() {
            S2S_RecruitRecord_24427 result = new S2S_RecruitRecord_24427(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.record_ = Collections.unmodifiableList(this.record_);
                  this.bitField0_ &= -2;
               }

               result.record_ = this.record_;
            } else {
               result.record_ = this.recordBuilder_.build();
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
            if (other instanceof S2S_RecruitRecord_24427) {
               return this.mergeFrom((S2S_RecruitRecord_24427)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_RecruitRecord_24427 other) {
            if (other == HuaJiaActMsg.S2S_RecruitRecord_24427.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordBuilder_ == null) {
                  if (!other.record_.isEmpty()) {
                     if (this.record_.isEmpty()) {
                        this.record_ = other.record_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordIsMutable();
                        this.record_.addAll(other.record_);
                     }

                     this.onChanged();
                  }
               } else if (!other.record_.isEmpty()) {
                  if (this.recordBuilder_.isEmpty()) {
                     this.recordBuilder_.dispose();
                     this.recordBuilder_ = null;
                     this.record_ = other.record_;
                     this.bitField0_ &= -2;
                     this.recordBuilder_ = HuaJiaActMsg.S2S_RecruitRecord_24427.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
                  } else {
                     this.recordBuilder_.addAllMessages(other.record_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordCount(); ++i) {
               if (!this.getRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_RecruitRecord_24427 parsedMessage = null;

            try {
               parsedMessage = (S2S_RecruitRecord_24427)HuaJiaActMsg.S2S_RecruitRecord_24427.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_RecruitRecord_24427)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.record_ = new ArrayList(this.record_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getRecordList() {
            return this.recordBuilder_ == null ? Collections.unmodifiableList(this.record_) : this.recordBuilder_.getMessageList();
         }

         public int getRecordCount() {
            return this.recordBuilder_ == null ? this.record_.size() : this.recordBuilder_.getCount();
         }

         public RecruitRecord getRecord(int index) {
            return this.recordBuilder_ == null ? (RecruitRecord)this.record_.get(index) : (RecruitRecord)this.recordBuilder_.getMessage(index);
         }

         public Builder setRecord(int index, RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecord(int index, RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecord(RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
               this.onChanged();
            } else {
               this.recordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecord(int index) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.remove(index);
               this.onChanged();
            } else {
               this.recordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getRecordOrBuilder(int index) {
            return this.recordBuilder_ == null ? (RecruitRecordOrBuilder)this.record_.get(index) : (RecruitRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList() {
            return this.recordBuilder_ != null ? this.recordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.record_);
         }

         public RecruitRecord.Builder addRecordBuilder() {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(index, HuaJiaActMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getRecordBuilderList() {
            return this.getRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new RepeatedFieldBuilderV3(this.record_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ChessList_24417OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitResult_24425OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitTongQueTreasure_24421OrBuilder extends MessageOrBuilder {
      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface C2S_TongQueParkCommitTask_24413OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TongQueParkFlush_24407OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkMain_24401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOneKeyOpen_24405OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOpen_24403OrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();
   }

   public interface C2S_TongQueTreasureInfo_24419OrBuilder extends MessageOrBuilder {
   }

   public interface ChessDataOrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();

      boolean hasIconId();

      int getIconId();
   }

   public interface GiftDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasIsBuy();

      boolean getIsBuy();
   }

   public interface RecruitRecordOrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasAwardId();

      int getAwardId();
   }

   public interface S2C_ChessList_24418OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);
   }

   public interface S2C_RecruitRecordInfo_24424OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);
   }

   public interface S2C_RecruitResult_24426OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getMyRecordList();

      RecruitRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList();

      RecruitRecordOrBuilder getMyRecordOrBuilder(int index);

      List<CommonMsg.MapDataII> getAwardListList();

      CommonMsg.MapDataII getAwardList(int index);

      int getAwardListCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index);
   }

   public interface S2C_RecruitTongQueTreasure_24422OrBuilder extends MessageOrBuilder {
      List<Integer> getResultListList();

      int getResultListCount();

      int getResultList(int index);

      boolean hasDrawNum();

      int getDrawNum();
   }

   public interface S2C_TongQueParkCommitTask_24414OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TongQueParkFlush_24408OrBuilder extends MessageOrBuilder {
      boolean hasFlushCount();

      int getFlushCount();
   }

   public interface S2C_TongQueParkMain_24402OrBuilder extends MessageOrBuilder {
      boolean hasEndTime();

      int getEndTime();

      List<GiftData> getGiftListList();

      GiftData getGiftList(int index);

      int getGiftListCount();

      List<? extends GiftDataOrBuilder> getGiftListOrBuilderList();

      GiftDataOrBuilder getGiftListOrBuilder(int index);

      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);

      boolean hasFlushCount();

      int getFlushCount();

      boolean hasFlyGoldCount();

      int getFlyGoldCount();

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);

      boolean hasActivityStartDay();

      int getActivityStartDay();
   }

   public interface S2C_TongQueParkOneKeyOpen_24406OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkOpen_24404OrBuilder extends MessageOrBuilder {
      boolean hasChess();

      ChessData getChess();

      ChessDataOrBuilder getChessOrBuilder();

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkTasks_24416OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_TongQueTreasureInfo_24420OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getMyRecordList();

      RecruitRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList();

      RecruitRecordOrBuilder getMyRecordOrBuilder(int index);

      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);

      List<CommonMsg.MapDataII> getAwardListList();

      CommonMsg.MapDataII getAwardList(int index);

      int getAwardListCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index);

      boolean hasSpecialRecruitNum();

      int getSpecialRecruitNum();

      boolean hasDrawNum();

      int getDrawNum();
   }

   public interface S2S_RecruitRecord_24427OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getRecordList();

      RecruitRecord getRecord(int index);

      int getRecordCount();

      List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList();

      RecruitRecordOrBuilder getRecordOrBuilder(int index);
   }
}
