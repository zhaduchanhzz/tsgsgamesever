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

public final class TongQueRotateMsg {
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TongQueRotateMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013TongQueRotate.proto\u0012\u001ftongQueRotate.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"H\n\bGiftData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\r\n\u0005isBuy\u0018\u0003 \u0002(\b\"(\n\tChessData\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006iconId\u0018\u0002 \u0002(\u0005\"\u001b\n\u0019C2S_TongQueParkMain_20101\"¤\u0002\n\u0019S2C_TongQueParkMain_20102\u0012\u000f\n\u0007endTime\u0018\u0001 \u0002(\u0005\u0012;\n\bgiftList\u0018\u0002 \u0003(\u000b2).tongQueRotate.com.gzbz.protobuf.GiftData\u0012=\n\tchessList\u0018\u0003 \u0003(\u000b2*.tongQueRotate.com.gzbz.protobuf.ChessData\u0012\u0012\n\nflushCount\u0018\u0004 \u0002(\u0005\u0012\u0014\n\fflyGoldCount\u0018\u0006 \u0002(\u0005\u00126\n\btaskList\u0018\b \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0018\n\u0010activityStartDay\u0018\n \u0002(\u0005\"(\n\u0019C2S_TongQueParkOpen_20103\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\"h\n\u0019S2C_TongQueParkOpen_20104\u00129\n\u0005chess\u0018\u0001 \u0002(\u000b2*.tongQueRotate.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"!\n\u001fC2S_TongQueParkOneKeyOpen_20105\"r\n\u001fS2C_TongQueParkOneKeyOpen_20106\u0012=\n\tchessList\u0018\u0001 \u0003(\u000b2*.tongQueRotate.com.gzbz.protobuf.ChessData\u0012\u0010\n\bprizeIds\u0018\u0002 \u0003(\u0005\"\u001c\n\u001aC2S_TongQueParkFlush_20107\"0\n\u001aS2C_TongQueParkFlush_20108\u0012\u0012\n\nflushCount\u0018\u0001 \u0002(\u0005\"1\n\u001fC2S_TongQueParkCommitTask_20113\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"1\n\u001fS2C_TongQueParkCommitTask_20114\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"T\n\u001aS2C_TongQueParkTasks_20116\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0015\n\u0013C2S_ChessList_20117\"T\n\u0013S2C_ChessList_20118\u0012=\n\tchessList\u0018\u0001 \u0003(\u000b2*.tongQueRotate.com.gzbz.protobuf.ChessData\"\u001f\n\u001dC2S_TongQueTreasureInfo_20119\"ö\u0001\n\u001dS2C_TongQueTreasureInfo_20120\u0012@\n\bmyRecord\u0018\u0001 \u0003(\u000b2..tongQueRotate.com.gzbz.protobuf.RecruitRecord\u0012A\n\tallRecord\u0018\u0002 \u0003(\u000b2..tongQueRotate.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0019\n\u0011specialRecruitNum\u0018\u0006 \u0001(\u0005\u0012\u000f\n\u0007drawNum\u0018\b \u0001(\u0005\"X\n\rRecruitRecord\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007awardId\u0018\u0004 \u0002(\u0005\"6\n C2S_RecruitTongQueTreasure_20121\u0012\u0012\n\nrecruitNum\u0018\u0002 \u0002(\u0005\"G\n S2C_RecruitTongQueTreasure_20122\u0012\u0012\n\nresultList\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007drawNum\u0018\b \u0001(\u0005\"`\n\u001bS2C_RecruitRecordInfo_20124\u0012A\n\tallRecord\u0018\u0002 \u0003(\u000b2..tongQueRotate.com.gzbz.protobuf.RecruitRecord\"\u0019\n\u0017C2S_RecruitResult_20125\"\u0081\u0001\n\u0017S2C_RecruitResult_20126\u0012@\n\bmyRecord\u0018\u0001 \u0003(\u000b2..tongQueRotate.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"Y\n\u0017S2S_RecruitRecord_20127\u0012>\n\u0006record\u0018\u0001 \u0003(\u000b2..tongQueRotate.com.gzbz.protobuf.RecruitRecordB'\n\u0011com.gzbz.protobufB\u0010TongQueRotateMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor, new String[]{"Id", "Rewards", "IsBuy"});
      internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor, new String[]{"Pos", "IconId"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor, new String[]{"EndTime", "GiftList", "ChessList", "FlushCount", "FlyGoldCount", "TaskList", "ActivityStartDay"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor, new String[]{"Pos"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor, new String[]{"Chess", "PrizeIds"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor, new String[]{"ChessList", "PrizeIds"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor, new String[]{"FlushCount"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor, new String[]{"TaskId"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor, new String[]{"TaskId"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor, new String[]{"TaskList"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor, new String[]{"ChessList"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor, new String[]{"MyRecord", "AllRecord", "AwardList", "SpecialRecruitNum", "DrawNum"});
      internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "AwardId"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor, new String[]{"RecruitNum"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor, new String[]{"ResultList", "DrawNum"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor, new String[]{"AllRecord"});
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor, new String[0]);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor, new String[]{"MyRecord", "AwardList"});
      internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor, new String[]{"Record"});
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
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
            if (TongQueRotateMsg.GiftData.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_GiftData_descriptor;
         }

         public GiftData getDefaultInstanceForType() {
            return TongQueRotateMsg.GiftData.getDefaultInstance();
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
            if (other == TongQueRotateMsg.GiftData.getDefaultInstance()) {
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
                     this.rewardsBuilder_ = TongQueRotateMsg.GiftData.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
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
               parsedMessage = (GiftData)TongQueRotateMsg.GiftData.PARSER.parsePartialFrom(input, extensionRegistry);
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChessData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.ChessData.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_ChessData_descriptor;
         }

         public ChessData getDefaultInstanceForType() {
            return TongQueRotateMsg.ChessData.getDefaultInstance();
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
            if (other == TongQueRotateMsg.ChessData.getDefaultInstance()) {
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
               parsedMessage = (ChessData)TongQueRotateMsg.ChessData.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_TongQueParkMain_20101 extends GeneratedMessageV3 implements C2S_TongQueParkMain_20101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkMain_20101 DEFAULT_INSTANCE = new C2S_TongQueParkMain_20101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkMain_20101> PARSER = new AbstractParser<C2S_TongQueParkMain_20101>() {
         public C2S_TongQueParkMain_20101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkMain_20101(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkMain_20101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkMain_20101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkMain_20101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkMain_20101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_20101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkMain_20101)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkMain_20101 other = (C2S_TongQueParkMain_20101)obj;
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

      public static C2S_TongQueParkMain_20101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkMain_20101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_20101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_20101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkMain_20101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkMain_20101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkMain_20101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkMain_20101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkMain_20101> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkMain_20101> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkMain_20101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkMain_20101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkMain_20101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueParkMain_20101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkMain_20101_descriptor;
         }

         public C2S_TongQueParkMain_20101 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueParkMain_20101.getDefaultInstance();
         }

         public C2S_TongQueParkMain_20101 build() {
            C2S_TongQueParkMain_20101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkMain_20101 buildPartial() {
            C2S_TongQueParkMain_20101 result = new C2S_TongQueParkMain_20101(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkMain_20101) {
               return this.mergeFrom((C2S_TongQueParkMain_20101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkMain_20101 other) {
            if (other == TongQueRotateMsg.C2S_TongQueParkMain_20101.getDefaultInstance()) {
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
            C2S_TongQueParkMain_20101 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkMain_20101)TongQueRotateMsg.C2S_TongQueParkMain_20101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkMain_20101)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkMain_20102 extends GeneratedMessageV3 implements S2C_TongQueParkMain_20102OrBuilder {
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
      private static final S2C_TongQueParkMain_20102 DEFAULT_INSTANCE = new S2C_TongQueParkMain_20102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkMain_20102> PARSER = new AbstractParser<S2C_TongQueParkMain_20102>() {
         public S2C_TongQueParkMain_20102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkMain_20102(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkMain_20102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkMain_20102() {
         this.memoizedIsInitialized = -1;
         this.giftList_ = Collections.emptyList();
         this.chessList_ = Collections.emptyList();
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkMain_20102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkMain_20102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.giftList_.add(input.readMessage(TongQueRotateMsg.GiftData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.chessList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.chessList_.add(input.readMessage(TongQueRotateMsg.ChessData.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_20102.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkMain_20102)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkMain_20102 other = (S2C_TongQueParkMain_20102)obj;
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

      public static S2C_TongQueParkMain_20102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkMain_20102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_20102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_20102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkMain_20102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkMain_20102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkMain_20102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkMain_20102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkMain_20102> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkMain_20102> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkMain_20102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkMain_20102OrBuilder {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkMain_20102.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_TongQueParkMain_20102.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkMain_20102_descriptor;
         }

         public S2C_TongQueParkMain_20102 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkMain_20102.getDefaultInstance();
         }

         public S2C_TongQueParkMain_20102 build() {
            S2C_TongQueParkMain_20102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkMain_20102 buildPartial() {
            S2C_TongQueParkMain_20102 result = new S2C_TongQueParkMain_20102(this);
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
            if (other instanceof S2C_TongQueParkMain_20102) {
               return this.mergeFrom((S2C_TongQueParkMain_20102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkMain_20102 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkMain_20102.getDefaultInstance()) {
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
                     this.giftListBuilder_ = TongQueRotateMsg.S2C_TongQueParkMain_20102.alwaysUseFieldBuilders ? this.getGiftListFieldBuilder() : null;
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
                     this.chessListBuilder_ = TongQueRotateMsg.S2C_TongQueParkMain_20102.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
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
                     this.taskListBuilder_ = TongQueRotateMsg.S2C_TongQueParkMain_20102.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_TongQueParkMain_20102 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkMain_20102)TongQueRotateMsg.S2C_TongQueParkMain_20102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkMain_20102)e.getUnfinishedMessage();
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
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(TongQueRotateMsg.GiftData.getDefaultInstance());
         }

         public GiftData.Builder addGiftListBuilder(int index) {
            return (GiftData.Builder)this.getGiftListFieldBuilder().addBuilder(index, TongQueRotateMsg.GiftData.getDefaultInstance());
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
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueRotateMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueRotateMsg.ChessData.getDefaultInstance());
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

   public static final class C2S_TongQueParkOpen_20103 extends GeneratedMessageV3 implements C2S_TongQueParkOpen_20103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOpen_20103 DEFAULT_INSTANCE = new C2S_TongQueParkOpen_20103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOpen_20103> PARSER = new AbstractParser<C2S_TongQueParkOpen_20103>() {
         public C2S_TongQueParkOpen_20103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOpen_20103(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOpen_20103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOpen_20103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOpen_20103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOpen_20103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_20103.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkOpen_20103)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOpen_20103 other = (C2S_TongQueParkOpen_20103)obj;
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

      public static C2S_TongQueParkOpen_20103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOpen_20103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_20103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_20103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOpen_20103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOpen_20103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOpen_20103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOpen_20103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOpen_20103> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOpen_20103> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOpen_20103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOpen_20103OrBuilder {
         private int bitField0_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOpen_20103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueParkOpen_20103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOpen_20103_descriptor;
         }

         public C2S_TongQueParkOpen_20103 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueParkOpen_20103.getDefaultInstance();
         }

         public C2S_TongQueParkOpen_20103 build() {
            C2S_TongQueParkOpen_20103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOpen_20103 buildPartial() {
            C2S_TongQueParkOpen_20103 result = new C2S_TongQueParkOpen_20103(this);
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
            if (other instanceof C2S_TongQueParkOpen_20103) {
               return this.mergeFrom((C2S_TongQueParkOpen_20103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOpen_20103 other) {
            if (other == TongQueRotateMsg.C2S_TongQueParkOpen_20103.getDefaultInstance()) {
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
            C2S_TongQueParkOpen_20103 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOpen_20103)TongQueRotateMsg.C2S_TongQueParkOpen_20103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOpen_20103)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkOpen_20104 extends GeneratedMessageV3 implements S2C_TongQueParkOpen_20104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHESS_FIELD_NUMBER = 1;
      private ChessData chess_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOpen_20104 DEFAULT_INSTANCE = new S2C_TongQueParkOpen_20104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOpen_20104> PARSER = new AbstractParser<S2C_TongQueParkOpen_20104>() {
         public S2C_TongQueParkOpen_20104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOpen_20104(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOpen_20104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOpen_20104() {
         this.memoizedIsInitialized = -1;
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOpen_20104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOpen_20104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.chess_ = (ChessData)input.readMessage(TongQueRotateMsg.ChessData.PARSER, extensionRegistry);
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_20104.class, Builder.class);
      }

      public boolean hasChess() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChessData getChess() {
         return this.chess_ == null ? TongQueRotateMsg.ChessData.getDefaultInstance() : this.chess_;
      }

      public ChessDataOrBuilder getChessOrBuilder() {
         return this.chess_ == null ? TongQueRotateMsg.ChessData.getDefaultInstance() : this.chess_;
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
         } else if (!(obj instanceof S2C_TongQueParkOpen_20104)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOpen_20104 other = (S2C_TongQueParkOpen_20104)obj;
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

      public static S2C_TongQueParkOpen_20104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOpen_20104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_20104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_20104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOpen_20104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOpen_20104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOpen_20104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOpen_20104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOpen_20104> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOpen_20104> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOpen_20104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOpen_20104OrBuilder {
         private int bitField0_;
         private ChessData chess_;
         private SingleFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOpen_20104.class, Builder.class);
         }

         private Builder() {
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOpen_20104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOpen_20104.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.S2C_TongQueParkOpen_20104.alwaysUseFieldBuilders) {
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
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOpen_20104.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOpen_20104_descriptor;
         }

         public S2C_TongQueParkOpen_20104 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkOpen_20104.getDefaultInstance();
         }

         public S2C_TongQueParkOpen_20104 build() {
            S2C_TongQueParkOpen_20104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOpen_20104 buildPartial() {
            S2C_TongQueParkOpen_20104 result = new S2C_TongQueParkOpen_20104(this);
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
            if (other instanceof S2C_TongQueParkOpen_20104) {
               return this.mergeFrom((S2C_TongQueParkOpen_20104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOpen_20104 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkOpen_20104.getDefaultInstance()) {
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
            S2C_TongQueParkOpen_20104 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOpen_20104)TongQueRotateMsg.S2C_TongQueParkOpen_20104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOpen_20104)e.getUnfinishedMessage();
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
               return this.chess_ == null ? TongQueRotateMsg.ChessData.getDefaultInstance() : this.chess_;
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
               if ((this.bitField0_ & 1) != 0 && this.chess_ != null && this.chess_ != TongQueRotateMsg.ChessData.getDefaultInstance()) {
                  this.chess_ = TongQueRotateMsg.ChessData.newBuilder(this.chess_).mergeFrom(value).buildPartial();
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
               return this.chess_ == null ? TongQueRotateMsg.ChessData.getDefaultInstance() : this.chess_;
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
               this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOpen_20104.mutableCopy(this.prizeIds_);
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
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOpen_20104.emptyIntList();
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

   public static final class C2S_TongQueParkOneKeyOpen_20105 extends GeneratedMessageV3 implements C2S_TongQueParkOneKeyOpen_20105OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkOneKeyOpen_20105 DEFAULT_INSTANCE = new C2S_TongQueParkOneKeyOpen_20105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkOneKeyOpen_20105> PARSER = new AbstractParser<C2S_TongQueParkOneKeyOpen_20105>() {
         public C2S_TongQueParkOneKeyOpen_20105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkOneKeyOpen_20105(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkOneKeyOpen_20105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkOneKeyOpen_20105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkOneKeyOpen_20105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkOneKeyOpen_20105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_20105.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkOneKeyOpen_20105)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkOneKeyOpen_20105 other = (C2S_TongQueParkOneKeyOpen_20105)obj;
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

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkOneKeyOpen_20105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkOneKeyOpen_20105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkOneKeyOpen_20105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkOneKeyOpen_20105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkOneKeyOpen_20105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkOneKeyOpen_20105> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkOneKeyOpen_20105> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkOneKeyOpen_20105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkOneKeyOpen_20105OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkOneKeyOpen_20105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueParkOneKeyOpen_20105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkOneKeyOpen_20105_descriptor;
         }

         public C2S_TongQueParkOneKeyOpen_20105 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueParkOneKeyOpen_20105.getDefaultInstance();
         }

         public C2S_TongQueParkOneKeyOpen_20105 build() {
            C2S_TongQueParkOneKeyOpen_20105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkOneKeyOpen_20105 buildPartial() {
            C2S_TongQueParkOneKeyOpen_20105 result = new C2S_TongQueParkOneKeyOpen_20105(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkOneKeyOpen_20105) {
               return this.mergeFrom((C2S_TongQueParkOneKeyOpen_20105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkOneKeyOpen_20105 other) {
            if (other == TongQueRotateMsg.C2S_TongQueParkOneKeyOpen_20105.getDefaultInstance()) {
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
            C2S_TongQueParkOneKeyOpen_20105 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_20105)TongQueRotateMsg.C2S_TongQueParkOneKeyOpen_20105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkOneKeyOpen_20105)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkOneKeyOpen_20106 extends GeneratedMessageV3 implements S2C_TongQueParkOneKeyOpen_20106OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      public static final int PRIZEIDS_FIELD_NUMBER = 2;
      private Internal.IntList prizeIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkOneKeyOpen_20106 DEFAULT_INSTANCE = new S2C_TongQueParkOneKeyOpen_20106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkOneKeyOpen_20106> PARSER = new AbstractParser<S2C_TongQueParkOneKeyOpen_20106>() {
         public S2C_TongQueParkOneKeyOpen_20106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkOneKeyOpen_20106(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkOneKeyOpen_20106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkOneKeyOpen_20106() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
         this.prizeIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkOneKeyOpen_20106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkOneKeyOpen_20106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.chessList_.add(input.readMessage(TongQueRotateMsg.ChessData.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_20106.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkOneKeyOpen_20106)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkOneKeyOpen_20106 other = (S2C_TongQueParkOneKeyOpen_20106)obj;
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

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkOneKeyOpen_20106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkOneKeyOpen_20106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkOneKeyOpen_20106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkOneKeyOpen_20106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkOneKeyOpen_20106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkOneKeyOpen_20106> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkOneKeyOpen_20106> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkOneKeyOpen_20106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkOneKeyOpen_20106OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;
         private Internal.IntList prizeIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkOneKeyOpen_20106.class, Builder.class);
         }

         private Builder() {
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.chessList_ = Collections.emptyList();
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.alwaysUseFieldBuilders) {
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

            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkOneKeyOpen_20106_descriptor;
         }

         public S2C_TongQueParkOneKeyOpen_20106 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.getDefaultInstance();
         }

         public S2C_TongQueParkOneKeyOpen_20106 build() {
            S2C_TongQueParkOneKeyOpen_20106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkOneKeyOpen_20106 buildPartial() {
            S2C_TongQueParkOneKeyOpen_20106 result = new S2C_TongQueParkOneKeyOpen_20106(this);
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
            if (other instanceof S2C_TongQueParkOneKeyOpen_20106) {
               return this.mergeFrom((S2C_TongQueParkOneKeyOpen_20106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkOneKeyOpen_20106 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.getDefaultInstance()) {
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
                     this.chessListBuilder_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
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
            S2C_TongQueParkOneKeyOpen_20106 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_20106)TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkOneKeyOpen_20106)e.getUnfinishedMessage();
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
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueRotateMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueRotateMsg.ChessData.getDefaultInstance());
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
               this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.mutableCopy(this.prizeIds_);
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
            this.prizeIds_ = TongQueRotateMsg.S2C_TongQueParkOneKeyOpen_20106.emptyIntList();
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

   public static final class C2S_TongQueParkFlush_20107 extends GeneratedMessageV3 implements C2S_TongQueParkFlush_20107OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkFlush_20107 DEFAULT_INSTANCE = new C2S_TongQueParkFlush_20107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkFlush_20107> PARSER = new AbstractParser<C2S_TongQueParkFlush_20107>() {
         public C2S_TongQueParkFlush_20107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkFlush_20107(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkFlush_20107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkFlush_20107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkFlush_20107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkFlush_20107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_20107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkFlush_20107)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkFlush_20107 other = (C2S_TongQueParkFlush_20107)obj;
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

      public static C2S_TongQueParkFlush_20107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkFlush_20107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_20107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_20107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkFlush_20107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkFlush_20107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkFlush_20107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkFlush_20107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkFlush_20107> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkFlush_20107> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkFlush_20107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkFlush_20107OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkFlush_20107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueParkFlush_20107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkFlush_20107_descriptor;
         }

         public C2S_TongQueParkFlush_20107 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueParkFlush_20107.getDefaultInstance();
         }

         public C2S_TongQueParkFlush_20107 build() {
            C2S_TongQueParkFlush_20107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkFlush_20107 buildPartial() {
            C2S_TongQueParkFlush_20107 result = new C2S_TongQueParkFlush_20107(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueParkFlush_20107) {
               return this.mergeFrom((C2S_TongQueParkFlush_20107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkFlush_20107 other) {
            if (other == TongQueRotateMsg.C2S_TongQueParkFlush_20107.getDefaultInstance()) {
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
            C2S_TongQueParkFlush_20107 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkFlush_20107)TongQueRotateMsg.C2S_TongQueParkFlush_20107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkFlush_20107)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkFlush_20108 extends GeneratedMessageV3 implements S2C_TongQueParkFlush_20108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FLUSHCOUNT_FIELD_NUMBER = 1;
      private int flushCount_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkFlush_20108 DEFAULT_INSTANCE = new S2C_TongQueParkFlush_20108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkFlush_20108> PARSER = new AbstractParser<S2C_TongQueParkFlush_20108>() {
         public S2C_TongQueParkFlush_20108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkFlush_20108(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkFlush_20108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkFlush_20108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkFlush_20108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkFlush_20108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_20108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkFlush_20108)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkFlush_20108 other = (S2C_TongQueParkFlush_20108)obj;
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

      public static S2C_TongQueParkFlush_20108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkFlush_20108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_20108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_20108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkFlush_20108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkFlush_20108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkFlush_20108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkFlush_20108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkFlush_20108> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkFlush_20108> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkFlush_20108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkFlush_20108OrBuilder {
         private int bitField0_;
         private int flushCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkFlush_20108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.S2C_TongQueParkFlush_20108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.flushCount_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkFlush_20108_descriptor;
         }

         public S2C_TongQueParkFlush_20108 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkFlush_20108.getDefaultInstance();
         }

         public S2C_TongQueParkFlush_20108 build() {
            S2C_TongQueParkFlush_20108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkFlush_20108 buildPartial() {
            S2C_TongQueParkFlush_20108 result = new S2C_TongQueParkFlush_20108(this);
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
            if (other instanceof S2C_TongQueParkFlush_20108) {
               return this.mergeFrom((S2C_TongQueParkFlush_20108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkFlush_20108 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkFlush_20108.getDefaultInstance()) {
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
            S2C_TongQueParkFlush_20108 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkFlush_20108)TongQueRotateMsg.S2C_TongQueParkFlush_20108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkFlush_20108)e.getUnfinishedMessage();
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

   public static final class C2S_TongQueParkCommitTask_20113 extends GeneratedMessageV3 implements C2S_TongQueParkCommitTask_20113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueParkCommitTask_20113 DEFAULT_INSTANCE = new C2S_TongQueParkCommitTask_20113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueParkCommitTask_20113> PARSER = new AbstractParser<C2S_TongQueParkCommitTask_20113>() {
         public C2S_TongQueParkCommitTask_20113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueParkCommitTask_20113(input, extensionRegistry);
         }
      };

      private C2S_TongQueParkCommitTask_20113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueParkCommitTask_20113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueParkCommitTask_20113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueParkCommitTask_20113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_20113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueParkCommitTask_20113)) {
            return super.equals(obj);
         } else {
            C2S_TongQueParkCommitTask_20113 other = (C2S_TongQueParkCommitTask_20113)obj;
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

      public static C2S_TongQueParkCommitTask_20113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueParkCommitTask_20113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_20113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_20113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueParkCommitTask_20113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueParkCommitTask_20113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueParkCommitTask_20113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueParkCommitTask_20113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueParkCommitTask_20113> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueParkCommitTask_20113> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueParkCommitTask_20113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueParkCommitTask_20113OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueParkCommitTask_20113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueParkCommitTask_20113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueParkCommitTask_20113_descriptor;
         }

         public C2S_TongQueParkCommitTask_20113 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueParkCommitTask_20113.getDefaultInstance();
         }

         public C2S_TongQueParkCommitTask_20113 build() {
            C2S_TongQueParkCommitTask_20113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueParkCommitTask_20113 buildPartial() {
            C2S_TongQueParkCommitTask_20113 result = new C2S_TongQueParkCommitTask_20113(this);
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
            if (other instanceof C2S_TongQueParkCommitTask_20113) {
               return this.mergeFrom((C2S_TongQueParkCommitTask_20113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueParkCommitTask_20113 other) {
            if (other == TongQueRotateMsg.C2S_TongQueParkCommitTask_20113.getDefaultInstance()) {
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
            C2S_TongQueParkCommitTask_20113 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueParkCommitTask_20113)TongQueRotateMsg.C2S_TongQueParkCommitTask_20113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueParkCommitTask_20113)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkCommitTask_20114 extends GeneratedMessageV3 implements S2C_TongQueParkCommitTask_20114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkCommitTask_20114 DEFAULT_INSTANCE = new S2C_TongQueParkCommitTask_20114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkCommitTask_20114> PARSER = new AbstractParser<S2C_TongQueParkCommitTask_20114>() {
         public S2C_TongQueParkCommitTask_20114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkCommitTask_20114(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkCommitTask_20114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkCommitTask_20114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkCommitTask_20114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkCommitTask_20114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_20114.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkCommitTask_20114)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkCommitTask_20114 other = (S2C_TongQueParkCommitTask_20114)obj;
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

      public static S2C_TongQueParkCommitTask_20114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkCommitTask_20114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_20114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_20114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkCommitTask_20114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkCommitTask_20114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkCommitTask_20114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkCommitTask_20114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkCommitTask_20114> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkCommitTask_20114> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkCommitTask_20114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkCommitTask_20114OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkCommitTask_20114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkCommitTask_20114_descriptor;
         }

         public S2C_TongQueParkCommitTask_20114 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.getDefaultInstance();
         }

         public S2C_TongQueParkCommitTask_20114 build() {
            S2C_TongQueParkCommitTask_20114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkCommitTask_20114 buildPartial() {
            S2C_TongQueParkCommitTask_20114 result = new S2C_TongQueParkCommitTask_20114(this);
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
            if (other instanceof S2C_TongQueParkCommitTask_20114) {
               return this.mergeFrom((S2C_TongQueParkCommitTask_20114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkCommitTask_20114 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.getDefaultInstance()) {
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
            S2C_TongQueParkCommitTask_20114 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkCommitTask_20114)TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkCommitTask_20114)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueParkTasks_20116 extends GeneratedMessageV3 implements S2C_TongQueParkTasks_20116OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TongQueParkTasks_20116 DEFAULT_INSTANCE = new S2C_TongQueParkTasks_20116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueParkTasks_20116> PARSER = new AbstractParser<S2C_TongQueParkTasks_20116>() {
         public S2C_TongQueParkTasks_20116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueParkTasks_20116(input, extensionRegistry);
         }
      };

      private S2C_TongQueParkTasks_20116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueParkTasks_20116() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueParkTasks_20116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueParkTasks_20116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_20116.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueParkTasks_20116)) {
            return super.equals(obj);
         } else {
            S2C_TongQueParkTasks_20116 other = (S2C_TongQueParkTasks_20116)obj;
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

      public static S2C_TongQueParkTasks_20116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueParkTasks_20116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_20116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_20116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueParkTasks_20116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueParkTasks_20116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueParkTasks_20116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueParkTasks_20116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueParkTasks_20116> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueParkTasks_20116> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueParkTasks_20116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueParkTasks_20116OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueParkTasks_20116.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_TongQueParkTasks_20116.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueParkTasks_20116_descriptor;
         }

         public S2C_TongQueParkTasks_20116 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueParkTasks_20116.getDefaultInstance();
         }

         public S2C_TongQueParkTasks_20116 build() {
            S2C_TongQueParkTasks_20116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueParkTasks_20116 buildPartial() {
            S2C_TongQueParkTasks_20116 result = new S2C_TongQueParkTasks_20116(this);
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
            if (other instanceof S2C_TongQueParkTasks_20116) {
               return this.mergeFrom((S2C_TongQueParkTasks_20116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueParkTasks_20116 other) {
            if (other == TongQueRotateMsg.S2C_TongQueParkTasks_20116.getDefaultInstance()) {
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
                     this.taskListBuilder_ = TongQueRotateMsg.S2C_TongQueParkTasks_20116.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_TongQueParkTasks_20116 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueParkTasks_20116)TongQueRotateMsg.S2C_TongQueParkTasks_20116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueParkTasks_20116)e.getUnfinishedMessage();
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

   public static final class C2S_ChessList_20117 extends GeneratedMessageV3 implements C2S_ChessList_20117OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChessList_20117 DEFAULT_INSTANCE = new C2S_ChessList_20117();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChessList_20117> PARSER = new AbstractParser<C2S_ChessList_20117>() {
         public C2S_ChessList_20117 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChessList_20117(input, extensionRegistry);
         }
      };

      private C2S_ChessList_20117(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChessList_20117() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChessList_20117();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChessList_20117(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_20117.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChessList_20117)) {
            return super.equals(obj);
         } else {
            C2S_ChessList_20117 other = (C2S_ChessList_20117)obj;
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

      public static C2S_ChessList_20117 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_20117 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_20117 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_20117 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_20117 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data);
      }

      public static C2S_ChessList_20117 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChessList_20117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChessList_20117 parseFrom(InputStream input) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_20117 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_20117 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChessList_20117 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChessList_20117 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChessList_20117 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChessList_20117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChessList_20117 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChessList_20117 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChessList_20117> parser() {
         return PARSER;
      }

      public Parser<C2S_ChessList_20117> getParserForType() {
         return PARSER;
      }

      public C2S_ChessList_20117 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChessList_20117OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChessList_20117.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_ChessList_20117.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_ChessList_20117_descriptor;
         }

         public C2S_ChessList_20117 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_ChessList_20117.getDefaultInstance();
         }

         public C2S_ChessList_20117 build() {
            C2S_ChessList_20117 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChessList_20117 buildPartial() {
            C2S_ChessList_20117 result = new C2S_ChessList_20117(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChessList_20117) {
               return this.mergeFrom((C2S_ChessList_20117)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChessList_20117 other) {
            if (other == TongQueRotateMsg.C2S_ChessList_20117.getDefaultInstance()) {
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
            C2S_ChessList_20117 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChessList_20117)TongQueRotateMsg.C2S_ChessList_20117.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChessList_20117)e.getUnfinishedMessage();
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

   public static final class S2C_ChessList_20118 extends GeneratedMessageV3 implements S2C_ChessList_20118OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CHESSLIST_FIELD_NUMBER = 1;
      private List<ChessData> chessList_;
      private byte memoizedIsInitialized;
      private static final S2C_ChessList_20118 DEFAULT_INSTANCE = new S2C_ChessList_20118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChessList_20118> PARSER = new AbstractParser<S2C_ChessList_20118>() {
         public S2C_ChessList_20118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChessList_20118(input, extensionRegistry);
         }
      };

      private S2C_ChessList_20118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChessList_20118() {
         this.memoizedIsInitialized = -1;
         this.chessList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChessList_20118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChessList_20118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.chessList_.add(input.readMessage(TongQueRotateMsg.ChessData.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_20118.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ChessList_20118)) {
            return super.equals(obj);
         } else {
            S2C_ChessList_20118 other = (S2C_ChessList_20118)obj;
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

      public static S2C_ChessList_20118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_20118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_20118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_20118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_20118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data);
      }

      public static S2C_ChessList_20118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChessList_20118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChessList_20118 parseFrom(InputStream input) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_20118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_20118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChessList_20118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChessList_20118 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChessList_20118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChessList_20118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChessList_20118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChessList_20118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChessList_20118> parser() {
         return PARSER;
      }

      public Parser<S2C_ChessList_20118> getParserForType() {
         return PARSER;
      }

      public S2C_ChessList_20118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChessList_20118OrBuilder {
         private int bitField0_;
         private List<ChessData> chessList_;
         private RepeatedFieldBuilderV3<ChessData, ChessData.Builder, ChessDataOrBuilder> chessListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChessList_20118.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_ChessList_20118.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_ChessList_20118_descriptor;
         }

         public S2C_ChessList_20118 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_ChessList_20118.getDefaultInstance();
         }

         public S2C_ChessList_20118 build() {
            S2C_ChessList_20118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChessList_20118 buildPartial() {
            S2C_ChessList_20118 result = new S2C_ChessList_20118(this);
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
            if (other instanceof S2C_ChessList_20118) {
               return this.mergeFrom((S2C_ChessList_20118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChessList_20118 other) {
            if (other == TongQueRotateMsg.S2C_ChessList_20118.getDefaultInstance()) {
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
                     this.chessListBuilder_ = TongQueRotateMsg.S2C_ChessList_20118.alwaysUseFieldBuilders ? this.getChessListFieldBuilder() : null;
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
            S2C_ChessList_20118 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChessList_20118)TongQueRotateMsg.S2C_ChessList_20118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChessList_20118)e.getUnfinishedMessage();
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
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(TongQueRotateMsg.ChessData.getDefaultInstance());
         }

         public ChessData.Builder addChessListBuilder(int index) {
            return (ChessData.Builder)this.getChessListFieldBuilder().addBuilder(index, TongQueRotateMsg.ChessData.getDefaultInstance());
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

   public static final class C2S_TongQueTreasureInfo_20119 extends GeneratedMessageV3 implements C2S_TongQueTreasureInfo_20119OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TongQueTreasureInfo_20119 DEFAULT_INSTANCE = new C2S_TongQueTreasureInfo_20119();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TongQueTreasureInfo_20119> PARSER = new AbstractParser<C2S_TongQueTreasureInfo_20119>() {
         public C2S_TongQueTreasureInfo_20119 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TongQueTreasureInfo_20119(input, extensionRegistry);
         }
      };

      private C2S_TongQueTreasureInfo_20119(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TongQueTreasureInfo_20119() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TongQueTreasureInfo_20119();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TongQueTreasureInfo_20119(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueTreasureInfo_20119.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TongQueTreasureInfo_20119)) {
            return super.equals(obj);
         } else {
            C2S_TongQueTreasureInfo_20119 other = (C2S_TongQueTreasureInfo_20119)obj;
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

      public static C2S_TongQueTreasureInfo_20119 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TongQueTreasureInfo_20119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(InputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_20119 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_20119 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TongQueTreasureInfo_20119 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TongQueTreasureInfo_20119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TongQueTreasureInfo_20119 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TongQueTreasureInfo_20119 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TongQueTreasureInfo_20119> parser() {
         return PARSER;
      }

      public Parser<C2S_TongQueTreasureInfo_20119> getParserForType() {
         return PARSER;
      }

      public C2S_TongQueTreasureInfo_20119 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TongQueTreasureInfo_20119OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TongQueTreasureInfo_20119.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_TongQueTreasureInfo_20119.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_TongQueTreasureInfo_20119_descriptor;
         }

         public C2S_TongQueTreasureInfo_20119 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_TongQueTreasureInfo_20119.getDefaultInstance();
         }

         public C2S_TongQueTreasureInfo_20119 build() {
            C2S_TongQueTreasureInfo_20119 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TongQueTreasureInfo_20119 buildPartial() {
            C2S_TongQueTreasureInfo_20119 result = new C2S_TongQueTreasureInfo_20119(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TongQueTreasureInfo_20119) {
               return this.mergeFrom((C2S_TongQueTreasureInfo_20119)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TongQueTreasureInfo_20119 other) {
            if (other == TongQueRotateMsg.C2S_TongQueTreasureInfo_20119.getDefaultInstance()) {
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
            C2S_TongQueTreasureInfo_20119 parsedMessage = null;

            try {
               parsedMessage = (C2S_TongQueTreasureInfo_20119)TongQueRotateMsg.C2S_TongQueTreasureInfo_20119.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TongQueTreasureInfo_20119)e.getUnfinishedMessage();
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

   public static final class S2C_TongQueTreasureInfo_20120 extends GeneratedMessageV3 implements S2C_TongQueTreasureInfo_20120OrBuilder {
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
      private static final S2C_TongQueTreasureInfo_20120 DEFAULT_INSTANCE = new S2C_TongQueTreasureInfo_20120();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TongQueTreasureInfo_20120> PARSER = new AbstractParser<S2C_TongQueTreasureInfo_20120>() {
         public S2C_TongQueTreasureInfo_20120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TongQueTreasureInfo_20120(input, extensionRegistry);
         }
      };

      private S2C_TongQueTreasureInfo_20120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TongQueTreasureInfo_20120() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.allRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TongQueTreasureInfo_20120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TongQueTreasureInfo_20120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(TongQueRotateMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.allRecord_.add(input.readMessage(TongQueRotateMsg.RecruitRecord.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueTreasureInfo_20120.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TongQueTreasureInfo_20120)) {
            return super.equals(obj);
         } else {
            S2C_TongQueTreasureInfo_20120 other = (S2C_TongQueTreasureInfo_20120)obj;
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

      public static S2C_TongQueTreasureInfo_20120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TongQueTreasureInfo_20120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(InputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_20120 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_20120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TongQueTreasureInfo_20120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TongQueTreasureInfo_20120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TongQueTreasureInfo_20120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TongQueTreasureInfo_20120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TongQueTreasureInfo_20120> parser() {
         return PARSER;
      }

      public Parser<S2C_TongQueTreasureInfo_20120> getParserForType() {
         return PARSER;
      }

      public S2C_TongQueTreasureInfo_20120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TongQueTreasureInfo_20120OrBuilder {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TongQueTreasureInfo_20120.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_TongQueTreasureInfo_20120_descriptor;
         }

         public S2C_TongQueTreasureInfo_20120 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.getDefaultInstance();
         }

         public S2C_TongQueTreasureInfo_20120 build() {
            S2C_TongQueTreasureInfo_20120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TongQueTreasureInfo_20120 buildPartial() {
            S2C_TongQueTreasureInfo_20120 result = new S2C_TongQueTreasureInfo_20120(this);
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
            if (other instanceof S2C_TongQueTreasureInfo_20120) {
               return this.mergeFrom((S2C_TongQueTreasureInfo_20120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TongQueTreasureInfo_20120 other) {
            if (other == TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
                     this.allRecordBuilder_ = TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
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
                     this.awardListBuilder_ = TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
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
            S2C_TongQueTreasureInfo_20120 parsedMessage = null;

            try {
               parsedMessage = (S2C_TongQueTreasureInfo_20120)TongQueRotateMsg.S2C_TongQueTreasureInfo_20120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TongQueTreasureInfo_20120)e.getUnfinishedMessage();
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
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(TongQueRotateMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, TongQueRotateMsg.RecruitRecord.getDefaultInstance());
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
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(TongQueRotateMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, TongQueRotateMsg.RecruitRecord.getDefaultInstance());
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
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
            if (TongQueRotateMsg.RecruitRecord.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         public RecruitRecord getDefaultInstanceForType() {
            return TongQueRotateMsg.RecruitRecord.getDefaultInstance();
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
            if (other == TongQueRotateMsg.RecruitRecord.getDefaultInstance()) {
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
               parsedMessage = (RecruitRecord)TongQueRotateMsg.RecruitRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = TongQueRotateMsg.RecruitRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_RecruitTongQueTreasure_20121 extends GeneratedMessageV3 implements C2S_RecruitTongQueTreasure_20121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECRUITNUM_FIELD_NUMBER = 2;
      private int recruitNum_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitTongQueTreasure_20121 DEFAULT_INSTANCE = new C2S_RecruitTongQueTreasure_20121();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitTongQueTreasure_20121> PARSER = new AbstractParser<C2S_RecruitTongQueTreasure_20121>() {
         public C2S_RecruitTongQueTreasure_20121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitTongQueTreasure_20121(input, extensionRegistry);
         }
      };

      private C2S_RecruitTongQueTreasure_20121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitTongQueTreasure_20121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitTongQueTreasure_20121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitTongQueTreasure_20121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitTongQueTreasure_20121.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitTongQueTreasure_20121)) {
            return super.equals(obj);
         } else {
            C2S_RecruitTongQueTreasure_20121 other = (C2S_RecruitTongQueTreasure_20121)obj;
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

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitTongQueTreasure_20121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitTongQueTreasure_20121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitTongQueTreasure_20121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitTongQueTreasure_20121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitTongQueTreasure_20121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitTongQueTreasure_20121> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitTongQueTreasure_20121> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitTongQueTreasure_20121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitTongQueTreasure_20121OrBuilder {
         private int bitField0_;
         private int recruitNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitTongQueTreasure_20121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_RecruitTongQueTreasure_20121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recruitNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitTongQueTreasure_20121_descriptor;
         }

         public C2S_RecruitTongQueTreasure_20121 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_RecruitTongQueTreasure_20121.getDefaultInstance();
         }

         public C2S_RecruitTongQueTreasure_20121 build() {
            C2S_RecruitTongQueTreasure_20121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitTongQueTreasure_20121 buildPartial() {
            C2S_RecruitTongQueTreasure_20121 result = new C2S_RecruitTongQueTreasure_20121(this);
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
            if (other instanceof C2S_RecruitTongQueTreasure_20121) {
               return this.mergeFrom((C2S_RecruitTongQueTreasure_20121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitTongQueTreasure_20121 other) {
            if (other == TongQueRotateMsg.C2S_RecruitTongQueTreasure_20121.getDefaultInstance()) {
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
            C2S_RecruitTongQueTreasure_20121 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitTongQueTreasure_20121)TongQueRotateMsg.C2S_RecruitTongQueTreasure_20121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitTongQueTreasure_20121)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitTongQueTreasure_20122 extends GeneratedMessageV3 implements S2C_RecruitTongQueTreasure_20122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULTLIST_FIELD_NUMBER = 1;
      private Internal.IntList resultList_;
      public static final int DRAWNUM_FIELD_NUMBER = 8;
      private int drawNum_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitTongQueTreasure_20122 DEFAULT_INSTANCE = new S2C_RecruitTongQueTreasure_20122();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitTongQueTreasure_20122> PARSER = new AbstractParser<S2C_RecruitTongQueTreasure_20122>() {
         public S2C_RecruitTongQueTreasure_20122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitTongQueTreasure_20122(input, extensionRegistry);
         }
      };

      private S2C_RecruitTongQueTreasure_20122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitTongQueTreasure_20122() {
         this.memoizedIsInitialized = -1;
         this.resultList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitTongQueTreasure_20122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitTongQueTreasure_20122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitTongQueTreasure_20122.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecruitTongQueTreasure_20122)) {
            return super.equals(obj);
         } else {
            S2C_RecruitTongQueTreasure_20122 other = (S2C_RecruitTongQueTreasure_20122)obj;
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

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitTongQueTreasure_20122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitTongQueTreasure_20122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitTongQueTreasure_20122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitTongQueTreasure_20122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitTongQueTreasure_20122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitTongQueTreasure_20122> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitTongQueTreasure_20122> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitTongQueTreasure_20122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitTongQueTreasure_20122OrBuilder {
         private int bitField0_;
         private Internal.IntList resultList_;
         private int drawNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitTongQueTreasure_20122.class, Builder.class);
         }

         private Builder() {
            this.resultList_ = TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.resultList_ = TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.resultList_ = TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.emptyIntList();
            this.bitField0_ &= -2;
            this.drawNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitTongQueTreasure_20122_descriptor;
         }

         public S2C_RecruitTongQueTreasure_20122 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.getDefaultInstance();
         }

         public S2C_RecruitTongQueTreasure_20122 build() {
            S2C_RecruitTongQueTreasure_20122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitTongQueTreasure_20122 buildPartial() {
            S2C_RecruitTongQueTreasure_20122 result = new S2C_RecruitTongQueTreasure_20122(this);
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
            if (other instanceof S2C_RecruitTongQueTreasure_20122) {
               return this.mergeFrom((S2C_RecruitTongQueTreasure_20122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitTongQueTreasure_20122 other) {
            if (other == TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.getDefaultInstance()) {
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
            S2C_RecruitTongQueTreasure_20122 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitTongQueTreasure_20122)TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitTongQueTreasure_20122)e.getUnfinishedMessage();
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
               this.resultList_ = TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.mutableCopy(this.resultList_);
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
            this.resultList_ = TongQueRotateMsg.S2C_RecruitTongQueTreasure_20122.emptyIntList();
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

   public static final class S2C_RecruitRecordInfo_20124 extends GeneratedMessageV3 implements S2C_RecruitRecordInfo_20124OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RecruitRecord> allRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitRecordInfo_20124 DEFAULT_INSTANCE = new S2C_RecruitRecordInfo_20124();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitRecordInfo_20124> PARSER = new AbstractParser<S2C_RecruitRecordInfo_20124>() {
         public S2C_RecruitRecordInfo_20124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitRecordInfo_20124(input, extensionRegistry);
         }
      };

      private S2C_RecruitRecordInfo_20124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitRecordInfo_20124() {
         this.memoizedIsInitialized = -1;
         this.allRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitRecordInfo_20124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitRecordInfo_20124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.allRecord_.add(input.readMessage(TongQueRotateMsg.RecruitRecord.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_20124.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecruitRecordInfo_20124)) {
            return super.equals(obj);
         } else {
            S2C_RecruitRecordInfo_20124 other = (S2C_RecruitRecordInfo_20124)obj;
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

      public static S2C_RecruitRecordInfo_20124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_20124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_20124 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_20124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_20124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_20124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitRecordInfo_20124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitRecordInfo_20124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitRecordInfo_20124> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitRecordInfo_20124> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitRecordInfo_20124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitRecordInfo_20124OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_20124.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_RecruitRecordInfo_20124.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitRecordInfo_20124_descriptor;
         }

         public S2C_RecruitRecordInfo_20124 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_RecruitRecordInfo_20124.getDefaultInstance();
         }

         public S2C_RecruitRecordInfo_20124 build() {
            S2C_RecruitRecordInfo_20124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitRecordInfo_20124 buildPartial() {
            S2C_RecruitRecordInfo_20124 result = new S2C_RecruitRecordInfo_20124(this);
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
            if (other instanceof S2C_RecruitRecordInfo_20124) {
               return this.mergeFrom((S2C_RecruitRecordInfo_20124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitRecordInfo_20124 other) {
            if (other == TongQueRotateMsg.S2C_RecruitRecordInfo_20124.getDefaultInstance()) {
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
                     this.allRecordBuilder_ = TongQueRotateMsg.S2C_RecruitRecordInfo_20124.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
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
            S2C_RecruitRecordInfo_20124 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitRecordInfo_20124)TongQueRotateMsg.S2C_RecruitRecordInfo_20124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitRecordInfo_20124)e.getUnfinishedMessage();
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
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(TongQueRotateMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, TongQueRotateMsg.RecruitRecord.getDefaultInstance());
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

   public static final class C2S_RecruitResult_20125 extends GeneratedMessageV3 implements C2S_RecruitResult_20125OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitResult_20125 DEFAULT_INSTANCE = new C2S_RecruitResult_20125();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitResult_20125> PARSER = new AbstractParser<C2S_RecruitResult_20125>() {
         public C2S_RecruitResult_20125 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitResult_20125(input, extensionRegistry);
         }
      };

      private C2S_RecruitResult_20125(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitResult_20125() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitResult_20125();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitResult_20125(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_20125.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitResult_20125)) {
            return super.equals(obj);
         } else {
            C2S_RecruitResult_20125 other = (C2S_RecruitResult_20125)obj;
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

      public static C2S_RecruitResult_20125 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_20125 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_20125 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_20125 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_20125 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_20125 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_20125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_20125 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_20125 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_20125 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_20125 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_20125 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_20125 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_20125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitResult_20125 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitResult_20125 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitResult_20125> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitResult_20125> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitResult_20125 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitResult_20125OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_20125.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongQueRotateMsg.C2S_RecruitResult_20125.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_C2S_RecruitResult_20125_descriptor;
         }

         public C2S_RecruitResult_20125 getDefaultInstanceForType() {
            return TongQueRotateMsg.C2S_RecruitResult_20125.getDefaultInstance();
         }

         public C2S_RecruitResult_20125 build() {
            C2S_RecruitResult_20125 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitResult_20125 buildPartial() {
            C2S_RecruitResult_20125 result = new C2S_RecruitResult_20125(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_RecruitResult_20125) {
               return this.mergeFrom((C2S_RecruitResult_20125)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitResult_20125 other) {
            if (other == TongQueRotateMsg.C2S_RecruitResult_20125.getDefaultInstance()) {
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
            C2S_RecruitResult_20125 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitResult_20125)TongQueRotateMsg.C2S_RecruitResult_20125.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitResult_20125)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitResult_20126 extends GeneratedMessageV3 implements S2C_RecruitResult_20126OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> myRecord_;
      public static final int AWARDLIST_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> awardList_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitResult_20126 DEFAULT_INSTANCE = new S2C_RecruitResult_20126();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitResult_20126> PARSER = new AbstractParser<S2C_RecruitResult_20126>() {
         public S2C_RecruitResult_20126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitResult_20126(input, extensionRegistry);
         }
      };

      private S2C_RecruitResult_20126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitResult_20126() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitResult_20126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitResult_20126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.myRecord_.add(input.readMessage(TongQueRotateMsg.RecruitRecord.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_20126.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecruitResult_20126)) {
            return super.equals(obj);
         } else {
            S2C_RecruitResult_20126 other = (S2C_RecruitResult_20126)obj;
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

      public static S2C_RecruitResult_20126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_20126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_20126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_20126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_20126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_20126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_20126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_20126 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_20126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_20126 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_20126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_20126 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_20126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_20126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitResult_20126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitResult_20126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitResult_20126> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitResult_20126> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitResult_20126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitResult_20126OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_20126.class, Builder.class);
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
            if (TongQueRotateMsg.S2C_RecruitResult_20126.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2C_RecruitResult_20126_descriptor;
         }

         public S2C_RecruitResult_20126 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2C_RecruitResult_20126.getDefaultInstance();
         }

         public S2C_RecruitResult_20126 build() {
            S2C_RecruitResult_20126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitResult_20126 buildPartial() {
            S2C_RecruitResult_20126 result = new S2C_RecruitResult_20126(this);
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
            if (other instanceof S2C_RecruitResult_20126) {
               return this.mergeFrom((S2C_RecruitResult_20126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitResult_20126 other) {
            if (other == TongQueRotateMsg.S2C_RecruitResult_20126.getDefaultInstance()) {
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
                     this.myRecordBuilder_ = TongQueRotateMsg.S2C_RecruitResult_20126.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
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
                     this.awardListBuilder_ = TongQueRotateMsg.S2C_RecruitResult_20126.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
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
            S2C_RecruitResult_20126 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitResult_20126)TongQueRotateMsg.S2C_RecruitResult_20126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitResult_20126)e.getUnfinishedMessage();
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
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(TongQueRotateMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, TongQueRotateMsg.RecruitRecord.getDefaultInstance());
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

   public static final class S2S_RecruitRecord_20127 extends GeneratedMessageV3 implements S2S_RecruitRecord_20127OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> record_;
      private byte memoizedIsInitialized;
      private static final S2S_RecruitRecord_20127 DEFAULT_INSTANCE = new S2S_RecruitRecord_20127();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_RecruitRecord_20127> PARSER = new AbstractParser<S2S_RecruitRecord_20127>() {
         public S2S_RecruitRecord_20127 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_RecruitRecord_20127(input, extensionRegistry);
         }
      };

      private S2S_RecruitRecord_20127(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_RecruitRecord_20127() {
         this.memoizedIsInitialized = -1;
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_RecruitRecord_20127();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_RecruitRecord_20127(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.record_.add(input.readMessage(TongQueRotateMsg.RecruitRecord.PARSER, extensionRegistry));
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
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_20127.class, Builder.class);
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
         } else if (!(obj instanceof S2S_RecruitRecord_20127)) {
            return super.equals(obj);
         } else {
            S2S_RecruitRecord_20127 other = (S2S_RecruitRecord_20127)obj;
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

      public static S2S_RecruitRecord_20127 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_20127 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_20127 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_20127 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_20127 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_20127 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_20127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_20127 parseFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_20127 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_20127 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_20127 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_20127 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_20127 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_20127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_RecruitRecord_20127 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_RecruitRecord_20127 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_RecruitRecord_20127> parser() {
         return PARSER;
      }

      public Parser<S2S_RecruitRecord_20127> getParserForType() {
         return PARSER;
      }

      public S2S_RecruitRecord_20127 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_RecruitRecord_20127OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> record_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_20127.class, Builder.class);
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
            if (TongQueRotateMsg.S2S_RecruitRecord_20127.alwaysUseFieldBuilders) {
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
            return TongQueRotateMsg.internal_static_tongQueRotate_com_gzbz_protobuf_S2S_RecruitRecord_20127_descriptor;
         }

         public S2S_RecruitRecord_20127 getDefaultInstanceForType() {
            return TongQueRotateMsg.S2S_RecruitRecord_20127.getDefaultInstance();
         }

         public S2S_RecruitRecord_20127 build() {
            S2S_RecruitRecord_20127 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_RecruitRecord_20127 buildPartial() {
            S2S_RecruitRecord_20127 result = new S2S_RecruitRecord_20127(this);
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
            if (other instanceof S2S_RecruitRecord_20127) {
               return this.mergeFrom((S2S_RecruitRecord_20127)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_RecruitRecord_20127 other) {
            if (other == TongQueRotateMsg.S2S_RecruitRecord_20127.getDefaultInstance()) {
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
                     this.recordBuilder_ = TongQueRotateMsg.S2S_RecruitRecord_20127.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
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
            S2S_RecruitRecord_20127 parsedMessage = null;

            try {
               parsedMessage = (S2S_RecruitRecord_20127)TongQueRotateMsg.S2S_RecruitRecord_20127.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_RecruitRecord_20127)e.getUnfinishedMessage();
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
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(TongQueRotateMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(index, TongQueRotateMsg.RecruitRecord.getDefaultInstance());
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

   public interface C2S_ChessList_20117OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitResult_20125OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitTongQueTreasure_20121OrBuilder extends MessageOrBuilder {
      boolean hasRecruitNum();

      int getRecruitNum();
   }

   public interface C2S_TongQueParkCommitTask_20113OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TongQueParkFlush_20107OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkMain_20101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOneKeyOpen_20105OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TongQueParkOpen_20103OrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();
   }

   public interface C2S_TongQueTreasureInfo_20119OrBuilder extends MessageOrBuilder {
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

   public interface S2C_ChessList_20118OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);
   }

   public interface S2C_RecruitRecordInfo_20124OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);
   }

   public interface S2C_RecruitResult_20126OrBuilder extends MessageOrBuilder {
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

   public interface S2C_RecruitTongQueTreasure_20122OrBuilder extends MessageOrBuilder {
      List<Integer> getResultListList();

      int getResultListCount();

      int getResultList(int index);

      boolean hasDrawNum();

      int getDrawNum();
   }

   public interface S2C_TongQueParkCommitTask_20114OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TongQueParkFlush_20108OrBuilder extends MessageOrBuilder {
      boolean hasFlushCount();

      int getFlushCount();
   }

   public interface S2C_TongQueParkMain_20102OrBuilder extends MessageOrBuilder {
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

   public interface S2C_TongQueParkOneKeyOpen_20106OrBuilder extends MessageOrBuilder {
      List<ChessData> getChessListList();

      ChessData getChessList(int index);

      int getChessListCount();

      List<? extends ChessDataOrBuilder> getChessListOrBuilderList();

      ChessDataOrBuilder getChessListOrBuilder(int index);

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkOpen_20104OrBuilder extends MessageOrBuilder {
      boolean hasChess();

      ChessData getChess();

      ChessDataOrBuilder getChessOrBuilder();

      List<Integer> getPrizeIdsList();

      int getPrizeIdsCount();

      int getPrizeIds(int index);
   }

   public interface S2C_TongQueParkTasks_20116OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_TongQueTreasureInfo_20120OrBuilder extends MessageOrBuilder {
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

   public interface S2S_RecruitRecord_20127OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getRecordList();

      RecruitRecord getRecord(int index);

      int getRecordCount();

      List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList();

      RecruitRecordOrBuilder getRecordOrBuilder(int index);
   }
}
