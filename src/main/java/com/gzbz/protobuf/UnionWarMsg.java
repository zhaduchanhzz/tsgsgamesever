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

public final class UnionWarMsg {
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarRankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarBoxData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private UnionWarMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eUnionWar.proto\u0012\u001aunionWar.com.gzbz.protobuf\u001a\fcommon.proto\"\u008f\u0001\n\u000eWarAgainstData\u0012=\n\u0004left\u0018\u0001 \u0002(\u000b2/.unionWar.com.gzbz.protobuf.WarAgainstUnionData\u0012>\n\u0005right\u0018\u0002 \u0002(\u000b2/.unionWar.com.gzbz.protobuf.WarAgainstUnionData\"[\n\u0013WarAgainstUnionData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u000e\n\u0006server\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0005 \u0002(\u0005\"¬\u0001\n\u0011WarStrongholdData\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012\r\n\u0005power\u0018\u0004 \u0001(\u0003\u0012\f\n\u0004star\u0018\u0005 \u0002(\u0005\u0012\u0016\n\u000echallengeCount\u0018\u0006 \u0002(\u0005\u0012\u001e\n\u0004hero\u0018\u0007 \u0003(\u000b2\u0010.common.HeroInfo\u0012\u0010\n\bfighting\u0018\b \u0001(\b\"_\n\u0010WarAttackLogData\u0012\f\n\u0004time\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007content\u0018\u0002 \u0002(\t\u0012\u0016\n\u000eattackPlayerId\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fholdPlayerId\u0018\u0004 \u0002(\u0005\"´\u0001\n\u000bWarRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006record\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0005 \u0001(\t\u0012\f\n\u0004head\u0018\u0006 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0007 \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\b \u0001(\u0005\u0012\r\n\u0005level\u0018\t \u0001(\u0005\u0012\u0010\n\bserverId\u0018\n \u0001(\u0005\"d\n\nWarBoxData\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u001e\n\u0004item\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfo\"m\n\u0017WarStrongholdRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012@\n\u0007records\u0018\u0002 \u0003(\u000b2/.unionWar.com.gzbz.protobuf.WarBattleRecordData\"¹\u0001\n\u0013WarBattleRecordData\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\r\n\u0005power\u0018\u0004 \u0002(\u0003\u0012\f\n\u0004star\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0006 \u0002(\u0005\u0012\u001e\n\u0004hero\u0018\u0007 \u0003(\u000b2\u0010.common.HeroInfo\u0012\r\n\u0005isWin\u0018\b \u0002(\b\u0012\u0010\n\bserverId\u0018\t \u0001(\u0005\"R\n\u0018WarBattleAchievementData\u0012\u0015\n\rachievementId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0003 \u0002(\u0005\"\u0019\n\u0017C2S_WarAgainstList_9701\"Z\n\u0017S2C_WarAgainstList_9702\u0012?\n\u000bagainstList\u0018\u0001 \u0003(\u000b2*.unionWar.com.gzbz.protobuf.WarAgainstData\"\u0012\n\u0010C2S_WarInfo_9703\"¿\u0001\n\u0010S2C_WarInfo_9704\u0012\u000e\n\u0006status\u0018\u0001 \u0002(\u0005\u0012B\n\u000eourAgainstData\u0018\u0002 \u0001(\u000b2*.unionWar.com.gzbz.protobuf.WarAgainstData\u0012G\n\u0010myStrongholdList\u0018\u0003 \u0003(\u000b2-.unionWar.com.gzbz.protobuf.WarStrongholdData\u0012\u000e\n\u0006buffLv\u0018\u0004 \u0001(\u0005\"*\n\u001aC2S_WarStrongholdList_9705\u0012\f\n\u0004size\u0018\u0001 \u0002(\u0005\"k\n\u001aS2C_WarStrongholdList_9706\u0012\f\n\u0004size\u0018\u0001 \u0002(\u0005\u0012?\n\binfoList\u0018\u0002 \u0003(\u000b2-.unionWar.com.gzbz.protobuf.WarStrongholdData\"\u0018\n\u0016C2S_WarAttackLogs_9707\"T\n\u0016S2C_WarAttackLogs_9708\u0012:\n\u0004logs\u0018\u0001 \u0003(\u000b2,.unionWar.com.gzbz.protobuf.WarAttackLogData\"\u0011\n\u000fC2S_WarBox_9709\"\u008f\u0001\n\u000fS2C_WarBox_9710\u0012\u000f\n\u0007boxSize\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005boxId\u0018\u0002 \u0002(\u0005\u00125\n\u0005boxes\u0018\u0003 \u0003(\u000b2&.unionWar.com.gzbz.protobuf.WarBoxData\u0012\u000f\n\u0007endTime\u0018\u0004 \u0002(\u0005\u0012\u0014\n\factiveMember\u0018\u0005 \u0003(\u0005\")\n\u0012C2S_WarGetBox_9711\u0012\u0013\n\u000bboxPosition\u0018\u0001 \u0002(\u0005\"I\n\u0012S2C_WarGetBox_9712\u00123\n\u0003box\u0018\u0001 \u0002(\u000b2&.unionWar.com.gzbz.protobuf.WarBoxData\"\u0016\n\u0014C2S_WarRankList_9713\"N\n\u0014S2C_WarRankList_9714\u00126\n\u0005ranks\u0018\u0001 \u0003(\u000b2'.unionWar.com.gzbz.protobuf.WarRankData\"4\n\u0012C2S_WarBattle_9715\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0002 \u0002(\u0005\"4\n\u0012S2C_WarBattle_9716\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0002 \u0002(\u0005\"x\n\u001aS2C_WarStrongholdData_9718\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012H\n\u0011warStrongholdData\u0018\u0002 \u0002(\u000b2-.unionWar.com.gzbz.protobuf.WarStrongholdData\",\n\u001cC2S_WarBattleRecordList_9719\u0012\f\n\u0004size\u0018\u0001 \u0002(\u0005\"u\n\u001cS2C_WarBattleRecordList_9720\u0012\f\n\u0004size\u0018\u0001 \u0002(\u0005\u0012G\n\nstronghold\u0018\u0002 \u0003(\u000b23.unionWar.com.gzbz.protobuf.WarStrongholdRecordData\"m\n\u0018S2C_WarBattleRecord_9722\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012?\n\u0006record\u0018\u0002 \u0002(\u000b2/.unionWar.com.gzbz.protobuf.WarBattleRecordData\"#\n!C2S_WarBattleAchievementList_9723\"o\n!S2C_WarBattleAchievementList_9724\u0012J\n\fachievements\u0018\u0001 \u0003(\u000b24.unionWar.com.gzbz.protobuf.WarBattleAchievementData\"@\n'C2S_WarBattleCommitAchievementList_9725\u0012\u0015\n\rachievementId\u0018\u0001 \u0002(\u0005\"@\n'S2C_WarBattleCommitAchievementList_9726\u0012\u0015\n\rachievementId\u0018\u0001 \u0002(\u0005\"h\n\u001aS2C_AchievementNotify_9728\u0012J\n\fachievements\u0018\u0001 \u0002(\u000b24.unionWar.com.gzbz.protobuf.WarBattleAchievementData\"\u001a\n\u0018C2S_WarBattleShopLv_9729\"3\n\u0018S2C_WarBattleShopLv_9730\u0012\n\n\u0002lv\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0002 \u0002(\u0005B\"\n\u0011com.gzbz.protobufB\u000bUnionWarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor, new String[]{"Left", "Right"});
      internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor, new String[]{"Id", "Name", "Server", "Rank", "Star"});
      internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor, new String[]{"Position", "PlayerId", "Name", "Power", "Star", "ChallengeCount", "Hero", "Fighting"});
      internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor, new String[]{"Time", "Content", "AttackPlayerId", "HoldPlayerId"});
      internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_unionWar_com_gzbz_protobuf_WarRankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor, new String[]{"Rank", "Star", "Record", "PlayerId", "PlayerName", "Head", "HeadFrame", "MonarchId", "Level", "ServerId"});
      internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_unionWar_com_gzbz_protobuf_WarBoxData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor, new String[]{"Position", "PlayerId", "PlayerName", "Item"});
      internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor, new String[]{"PlayerId", "Records"});
      internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor, new String[]{"RecordId", "PlayerId", "PlayerName", "Power", "Star", "Time", "Hero", "IsWin", "ServerId"});
      internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor, new String[]{"AchievementId", "State", "Progress"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor, new String[]{"AgainstList"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor, new String[]{"Status", "OurAgainstData", "MyStrongholdList", "BuffLv"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor, new String[]{"Size"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor, new String[]{"Size", "InfoList"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor, new String[]{"Logs"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor, new String[]{"BoxSize", "BoxId", "Boxes", "EndTime", "ActiveMember"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor, new String[]{"BoxPosition"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor, new String[]{"Box"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor, new String[]{"Ranks"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor, new String[]{"Position", "Star"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor, new String[]{"Position", "Star"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor, new String[]{"PlayerId", "WarStrongholdData"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor, new String[]{"Size"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor, new String[]{"Size", "Stronghold"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor, new String[]{"PlayerId", "Record"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor, new String[]{"Achievements"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor, new String[]{"AchievementId"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor, new String[]{"AchievementId"});
      internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor, new String[]{"Achievements"});
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor, new String[0]);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor, new String[]{"Lv", "Exp"});
      CommonMsg.getDescriptor();
   }

   public static final class WarAgainstData extends GeneratedMessageV3 implements WarAgainstDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEFT_FIELD_NUMBER = 1;
      private WarAgainstUnionData left_;
      public static final int RIGHT_FIELD_NUMBER = 2;
      private WarAgainstUnionData right_;
      private byte memoizedIsInitialized;
      private static final WarAgainstData DEFAULT_INSTANCE = new WarAgainstData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarAgainstData> PARSER = new AbstractParser<WarAgainstData>() {
         public WarAgainstData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarAgainstData(input, extensionRegistry);
         }
      };

      private WarAgainstData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarAgainstData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarAgainstData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarAgainstData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WarAgainstUnionData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.left_.toBuilder();
                        }

                        this.left_ = (WarAgainstUnionData)input.readMessage(UnionWarMsg.WarAgainstUnionData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.left_);
                           this.left_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        WarAgainstUnionData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.right_.toBuilder();
                        }

                        this.right_ = (WarAgainstUnionData)input.readMessage(UnionWarMsg.WarAgainstUnionData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.right_);
                           this.right_ = subBuilder.buildPartial();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstData.class, Builder.class);
      }

      public boolean hasLeft() {
         return (this.bitField0_ & 1) != 0;
      }

      public WarAgainstUnionData getLeft() {
         return this.left_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.left_;
      }

      public WarAgainstUnionDataOrBuilder getLeftOrBuilder() {
         return this.left_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.left_;
      }

      public boolean hasRight() {
         return (this.bitField0_ & 2) != 0;
      }

      public WarAgainstUnionData getRight() {
         return this.right_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.right_;
      }

      public WarAgainstUnionDataOrBuilder getRightOrBuilder() {
         return this.right_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.right_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeft()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getLeft().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRight().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getLeft());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getRight());
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
               size += CodedOutputStream.computeMessageSize(1, this.getLeft());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getRight());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarAgainstData)) {
            return super.equals(obj);
         } else {
            WarAgainstData other = (WarAgainstData)obj;
            if (this.hasLeft() != other.hasLeft()) {
               return false;
            } else if (this.hasLeft() && !this.getLeft().equals(other.getLeft())) {
               return false;
            } else if (this.hasRight() != other.hasRight()) {
               return false;
            } else if (this.hasRight() && !this.getRight().equals(other.getRight())) {
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
            if (this.hasLeft()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLeft().hashCode();
            }

            if (this.hasRight()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRight().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarAgainstData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data);
      }

      public static WarAgainstData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstData parseFrom(InputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarAgainstData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstData parseFrom(CodedInputStream input) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarAgainstData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarAgainstData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarAgainstData> parser() {
         return PARSER;
      }

      public Parser<WarAgainstData> getParserForType() {
         return PARSER;
      }

      public WarAgainstData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarAgainstDataOrBuilder {
         private int bitField0_;
         private WarAgainstUnionData left_;
         private SingleFieldBuilderV3<WarAgainstUnionData, WarAgainstUnionData.Builder, WarAgainstUnionDataOrBuilder> leftBuilder_;
         private WarAgainstUnionData right_;
         private SingleFieldBuilderV3<WarAgainstUnionData, WarAgainstUnionData.Builder, WarAgainstUnionDataOrBuilder> rightBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarAgainstData.alwaysUseFieldBuilders) {
               this.getLeftFieldBuilder();
               this.getRightFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.leftBuilder_ == null) {
               this.left_ = null;
            } else {
               this.leftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.rightBuilder_ == null) {
               this.right_ = null;
            } else {
               this.rightBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstData_descriptor;
         }

         public WarAgainstData getDefaultInstanceForType() {
            return UnionWarMsg.WarAgainstData.getDefaultInstance();
         }

         public WarAgainstData build() {
            WarAgainstData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarAgainstData buildPartial() {
            WarAgainstData result = new WarAgainstData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.leftBuilder_ == null) {
                  result.left_ = this.left_;
               } else {
                  result.left_ = (WarAgainstUnionData)this.leftBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.rightBuilder_ == null) {
                  result.right_ = this.right_;
               } else {
                  result.right_ = (WarAgainstUnionData)this.rightBuilder_.build();
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
            if (other instanceof WarAgainstData) {
               return this.mergeFrom((WarAgainstData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarAgainstData other) {
            if (other == UnionWarMsg.WarAgainstData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeft()) {
                  this.mergeLeft(other.getLeft());
               }

               if (other.hasRight()) {
                  this.mergeRight(other.getRight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeft()) {
               return false;
            } else if (!this.hasRight()) {
               return false;
            } else if (!this.getLeft().isInitialized()) {
               return false;
            } else {
               return this.getRight().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarAgainstData parsedMessage = null;

            try {
               parsedMessage = (WarAgainstData)UnionWarMsg.WarAgainstData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarAgainstData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeft() {
            return (this.bitField0_ & 1) != 0;
         }

         public WarAgainstUnionData getLeft() {
            if (this.leftBuilder_ == null) {
               return this.left_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.left_;
            } else {
               return (WarAgainstUnionData)this.leftBuilder_.getMessage();
            }
         }

         public Builder setLeft(WarAgainstUnionData value) {
            if (this.leftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.left_ = value;
               this.onChanged();
            } else {
               this.leftBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setLeft(WarAgainstUnionData.Builder builderForValue) {
            if (this.leftBuilder_ == null) {
               this.left_ = builderForValue.build();
               this.onChanged();
            } else {
               this.leftBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeLeft(WarAgainstUnionData value) {
            if (this.leftBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.left_ != null && this.left_ != UnionWarMsg.WarAgainstUnionData.getDefaultInstance()) {
                  this.left_ = UnionWarMsg.WarAgainstUnionData.newBuilder(this.left_).mergeFrom(value).buildPartial();
               } else {
                  this.left_ = value;
               }

               this.onChanged();
            } else {
               this.leftBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearLeft() {
            if (this.leftBuilder_ == null) {
               this.left_ = null;
               this.onChanged();
            } else {
               this.leftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WarAgainstUnionData.Builder getLeftBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WarAgainstUnionData.Builder)this.getLeftFieldBuilder().getBuilder();
         }

         public WarAgainstUnionDataOrBuilder getLeftOrBuilder() {
            if (this.leftBuilder_ != null) {
               return (WarAgainstUnionDataOrBuilder)this.leftBuilder_.getMessageOrBuilder();
            } else {
               return this.left_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.left_;
            }
         }

         private SingleFieldBuilderV3<WarAgainstUnionData, WarAgainstUnionData.Builder, WarAgainstUnionDataOrBuilder> getLeftFieldBuilder() {
            if (this.leftBuilder_ == null) {
               this.leftBuilder_ = new SingleFieldBuilderV3(this.getLeft(), this.getParentForChildren(), this.isClean());
               this.left_ = null;
            }

            return this.leftBuilder_;
         }

         public boolean hasRight() {
            return (this.bitField0_ & 2) != 0;
         }

         public WarAgainstUnionData getRight() {
            if (this.rightBuilder_ == null) {
               return this.right_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.right_;
            } else {
               return (WarAgainstUnionData)this.rightBuilder_.getMessage();
            }
         }

         public Builder setRight(WarAgainstUnionData value) {
            if (this.rightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.right_ = value;
               this.onChanged();
            } else {
               this.rightBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRight(WarAgainstUnionData.Builder builderForValue) {
            if (this.rightBuilder_ == null) {
               this.right_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rightBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRight(WarAgainstUnionData value) {
            if (this.rightBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.right_ != null && this.right_ != UnionWarMsg.WarAgainstUnionData.getDefaultInstance()) {
                  this.right_ = UnionWarMsg.WarAgainstUnionData.newBuilder(this.right_).mergeFrom(value).buildPartial();
               } else {
                  this.right_ = value;
               }

               this.onChanged();
            } else {
               this.rightBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRight() {
            if (this.rightBuilder_ == null) {
               this.right_ = null;
               this.onChanged();
            } else {
               this.rightBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public WarAgainstUnionData.Builder getRightBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (WarAgainstUnionData.Builder)this.getRightFieldBuilder().getBuilder();
         }

         public WarAgainstUnionDataOrBuilder getRightOrBuilder() {
            if (this.rightBuilder_ != null) {
               return (WarAgainstUnionDataOrBuilder)this.rightBuilder_.getMessageOrBuilder();
            } else {
               return this.right_ == null ? UnionWarMsg.WarAgainstUnionData.getDefaultInstance() : this.right_;
            }
         }

         private SingleFieldBuilderV3<WarAgainstUnionData, WarAgainstUnionData.Builder, WarAgainstUnionDataOrBuilder> getRightFieldBuilder() {
            if (this.rightBuilder_ == null) {
               this.rightBuilder_ = new SingleFieldBuilderV3(this.getRight(), this.getParentForChildren(), this.isClean());
               this.right_ = null;
            }

            return this.rightBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class WarAgainstUnionData extends GeneratedMessageV3 implements WarAgainstUnionDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NAME_FIELD_NUMBER = 2;
      private volatile Object name_;
      public static final int SERVER_FIELD_NUMBER = 3;
      private int server_;
      public static final int RANK_FIELD_NUMBER = 4;
      private int rank_;
      public static final int STAR_FIELD_NUMBER = 5;
      private int star_;
      private byte memoizedIsInitialized;
      private static final WarAgainstUnionData DEFAULT_INSTANCE = new WarAgainstUnionData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarAgainstUnionData> PARSER = new AbstractParser<WarAgainstUnionData>() {
         public WarAgainstUnionData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarAgainstUnionData(input, extensionRegistry);
         }
      };

      private WarAgainstUnionData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarAgainstUnionData() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarAgainstUnionData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarAgainstUnionData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.name_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.server_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.rank_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.star_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstUnionData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasServer() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServer() {
         return this.server_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStar() {
         return this.star_;
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
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
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

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.name_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.server_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.rank_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.star_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.server_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.rank_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.star_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarAgainstUnionData)) {
            return super.equals(obj);
         } else {
            WarAgainstUnionData other = (WarAgainstUnionData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
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

            if (this.hasName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarAgainstUnionData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data);
      }

      public static WarAgainstUnionData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstUnionData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data);
      }

      public static WarAgainstUnionData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstUnionData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data);
      }

      public static WarAgainstUnionData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAgainstUnionData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAgainstUnionData parseFrom(InputStream input) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstUnionData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstUnionData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarAgainstUnionData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAgainstUnionData parseFrom(CodedInputStream input) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAgainstUnionData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAgainstUnionData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarAgainstUnionData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarAgainstUnionData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarAgainstUnionData> parser() {
         return PARSER;
      }

      public Parser<WarAgainstUnionData> getParserForType() {
         return PARSER;
      }

      public WarAgainstUnionData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarAgainstUnionDataOrBuilder {
         private int bitField0_;
         private int id_;
         private Object name_;
         private int server_;
         private int rank_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAgainstUnionData.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarAgainstUnionData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.name_ = "";
            this.bitField0_ &= -3;
            this.server_ = 0;
            this.bitField0_ &= -5;
            this.rank_ = 0;
            this.bitField0_ &= -9;
            this.star_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAgainstUnionData_descriptor;
         }

         public WarAgainstUnionData getDefaultInstanceForType() {
            return UnionWarMsg.WarAgainstUnionData.getDefaultInstance();
         }

         public WarAgainstUnionData build() {
            WarAgainstUnionData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarAgainstUnionData buildPartial() {
            WarAgainstUnionData result = new WarAgainstUnionData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 4) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.star_ = this.star_;
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
            if (other instanceof WarAgainstUnionData) {
               return this.mergeFrom((WarAgainstUnionData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarAgainstUnionData other) {
            if (other == UnionWarMsg.WarAgainstUnionData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 2;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasServer()) {
               return false;
            } else if (!this.hasRank()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarAgainstUnionData parsedMessage = null;

            try {
               parsedMessage = (WarAgainstUnionData)UnionWarMsg.WarAgainstUnionData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarAgainstUnionData)e.getUnfinishedMessage();
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

         public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -3;
            this.name_ = UnionWarMsg.WarAgainstUnionData.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServer() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 4;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -5;
            this.server_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 8;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -9;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 16;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -17;
            this.star_ = 0;
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

   public static final class WarStrongholdData extends GeneratedMessageV3 implements WarStrongholdDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int NAME_FIELD_NUMBER = 3;
      private volatile Object name_;
      public static final int POWER_FIELD_NUMBER = 4;
      private long power_;
      public static final int STAR_FIELD_NUMBER = 5;
      private int star_;
      public static final int CHALLENGECOUNT_FIELD_NUMBER = 6;
      private int challengeCount_;
      public static final int HERO_FIELD_NUMBER = 7;
      private List<CommonMsg.HeroInfo> hero_;
      public static final int FIGHTING_FIELD_NUMBER = 8;
      private boolean fighting_;
      private byte memoizedIsInitialized;
      private static final WarStrongholdData DEFAULT_INSTANCE = new WarStrongholdData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarStrongholdData> PARSER = new AbstractParser<WarStrongholdData>() {
         public WarStrongholdData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarStrongholdData(input, extensionRegistry);
         }
      };

      private WarStrongholdData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarStrongholdData() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarStrongholdData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarStrongholdData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.name_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.power_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.star_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.challengeCount_ = input.readInt32();
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.hero_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.fighting_ = input.readBool();
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
               if ((mutable_bitField0_ & 64) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdData.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public boolean hasChallengeCount() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getChallengeCount() {
         return this.challengeCount_;
      }

      public List<CommonMsg.HeroInfo> getHeroList() {
         return this.hero_;
      }

      public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public CommonMsg.HeroInfo getHero(int index) {
         return (CommonMsg.HeroInfo)this.hero_.get(index);
      }

      public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
         return (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index);
      }

      public boolean hasFighting() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getFighting() {
         return this.fighting_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChallengeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroCount(); ++i) {
               if (!this.getHero(i).isInitialized()) {
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
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.power_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.star_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.challengeCount_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.hero_.get(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(8, this.fighting_);
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.name_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.power_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.star_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.challengeCount_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.hero_.get(i));
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.fighting_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarStrongholdData)) {
            return super.equals(obj);
         } else {
            WarStrongholdData other = (WarStrongholdData)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (this.hasChallengeCount() != other.hasChallengeCount()) {
               return false;
            } else if (this.hasChallengeCount() && this.getChallengeCount() != other.getChallengeCount()) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (this.hasFighting() != other.hasFighting()) {
               return false;
            } else if (this.hasFighting() && this.getFighting() != other.getFighting()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasStar()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStar();
            }

            if (this.hasChallengeCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getChallengeCount();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.hasFighting()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getFighting());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarStrongholdData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data);
      }

      public static WarStrongholdData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(InputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdData parseFrom(CodedInputStream input) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarStrongholdData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarStrongholdData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarStrongholdData> parser() {
         return PARSER;
      }

      public Parser<WarStrongholdData> getParserForType() {
         return PARSER;
      }

      public WarStrongholdData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarStrongholdDataOrBuilder {
         private int bitField0_;
         private int position_;
         private int playerId_;
         private Object name_;
         private long power_;
         private int star_;
         private int challengeCount_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;
         private boolean fighting_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdData.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarStrongholdData.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.name_ = "";
            this.bitField0_ &= -5;
            this.power_ = 0L;
            this.bitField0_ &= -9;
            this.star_ = 0;
            this.bitField0_ &= -17;
            this.challengeCount_ = 0;
            this.bitField0_ &= -33;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.heroBuilder_.clear();
            }

            this.fighting_ = false;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdData_descriptor;
         }

         public WarStrongholdData getDefaultInstanceForType() {
            return UnionWarMsg.WarStrongholdData.getDefaultInstance();
         }

         public WarStrongholdData build() {
            WarStrongholdData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarStrongholdData buildPartial() {
            WarStrongholdData result = new WarStrongholdData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 8) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.challengeCount_ = this.challengeCount_;
               to_bitField0_ |= 32;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -65;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((from_bitField0_ & 128) != 0) {
               result.fighting_ = this.fighting_;
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
            if (other instanceof WarStrongholdData) {
               return this.mergeFrom((WarStrongholdData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarStrongholdData other) {
            if (other == UnionWarMsg.WarStrongholdData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 4;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (other.hasChallengeCount()) {
                  this.setChallengeCount(other.getChallengeCount());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureHeroIsMutable();
                        this.hero_.addAll(other.hero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hero_.isEmpty()) {
                  if (this.heroBuilder_.isEmpty()) {
                     this.heroBuilder_.dispose();
                     this.heroBuilder_ = null;
                     this.hero_ = other.hero_;
                     this.bitField0_ &= -65;
                     this.heroBuilder_ = UnionWarMsg.WarStrongholdData.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (other.hasFighting()) {
                  this.setFighting(other.getFighting());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasStar()) {
               return false;
            } else if (!this.hasChallengeCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroCount(); ++i) {
                  if (!this.getHero(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarStrongholdData parsedMessage = null;

            try {
               parsedMessage = (WarStrongholdData)UnionWarMsg.WarStrongholdData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarStrongholdData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
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

         public boolean hasName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -5;
            this.name_ = UnionWarMsg.WarStrongholdData.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 8;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -9;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 16;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -17;
            this.star_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChallengeCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getChallengeCount() {
            return this.challengeCount_;
         }

         public Builder setChallengeCount(int value) {
            this.bitField0_ |= 32;
            this.challengeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChallengeCount() {
            this.bitField0_ &= -33;
            this.challengeCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.HeroInfo> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public CommonMsg.HeroInfo getHero(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfo)this.hero_.get(index) : (CommonMsg.HeroInfo)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.set(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends CommonMsg.HeroInfo> values) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hero_);
               this.onChanged();
            } else {
               this.heroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHero() {
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Builder removeHero(int index) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.remove(index);
               this.onChanged();
            } else {
               this.heroBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index) : (CommonMsg.HeroInfoOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder() {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(CommonMsg.HeroInfo.getDefaultInstance());
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(index, CommonMsg.HeroInfo.getDefaultInstance());
         }

         public List<CommonMsg.HeroInfo.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public boolean hasFighting() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getFighting() {
            return this.fighting_;
         }

         public Builder setFighting(boolean value) {
            this.bitField0_ |= 128;
            this.fighting_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFighting() {
            this.bitField0_ &= -129;
            this.fighting_ = false;
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

   public static final class WarAttackLogData extends GeneratedMessageV3 implements WarAttackLogDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TIME_FIELD_NUMBER = 1;
      private int time_;
      public static final int CONTENT_FIELD_NUMBER = 2;
      private volatile Object content_;
      public static final int ATTACKPLAYERID_FIELD_NUMBER = 3;
      private int attackPlayerId_;
      public static final int HOLDPLAYERID_FIELD_NUMBER = 4;
      private int holdPlayerId_;
      private byte memoizedIsInitialized;
      private static final WarAttackLogData DEFAULT_INSTANCE = new WarAttackLogData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarAttackLogData> PARSER = new AbstractParser<WarAttackLogData>() {
         public WarAttackLogData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarAttackLogData(input, extensionRegistry);
         }
      };

      private WarAttackLogData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarAttackLogData() {
         this.memoizedIsInitialized = -1;
         this.content_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarAttackLogData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarAttackLogData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.time_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.content_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.attackPlayerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.holdPlayerId_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAttackLogData.class, Builder.class);
      }

      public boolean hasTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasContent() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.content_ = s;
            }

            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasAttackPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAttackPlayerId() {
         return this.attackPlayerId_;
      }

      public boolean hasHoldPlayerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHoldPlayerId() {
         return this.holdPlayerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAttackPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHoldPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.time_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.content_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.attackPlayerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.holdPlayerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.time_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.attackPlayerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.holdPlayerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarAttackLogData)) {
            return super.equals(obj);
         } else {
            WarAttackLogData other = (WarAttackLogData)obj;
            if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasContent() != other.hasContent()) {
               return false;
            } else if (this.hasContent() && !this.getContent().equals(other.getContent())) {
               return false;
            } else if (this.hasAttackPlayerId() != other.hasAttackPlayerId()) {
               return false;
            } else if (this.hasAttackPlayerId() && this.getAttackPlayerId() != other.getAttackPlayerId()) {
               return false;
            } else if (this.hasHoldPlayerId() != other.hasHoldPlayerId()) {
               return false;
            } else if (this.hasHoldPlayerId() && this.getHoldPlayerId() != other.getHoldPlayerId()) {
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
            if (this.hasTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasContent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getContent().hashCode();
            }

            if (this.hasAttackPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAttackPlayerId();
            }

            if (this.hasHoldPlayerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHoldPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarAttackLogData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data);
      }

      public static WarAttackLogData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAttackLogData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data);
      }

      public static WarAttackLogData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAttackLogData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data);
      }

      public static WarAttackLogData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarAttackLogData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarAttackLogData parseFrom(InputStream input) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAttackLogData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAttackLogData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarAttackLogData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarAttackLogData parseFrom(CodedInputStream input) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarAttackLogData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarAttackLogData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarAttackLogData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarAttackLogData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarAttackLogData> parser() {
         return PARSER;
      }

      public Parser<WarAttackLogData> getParserForType() {
         return PARSER;
      }

      public WarAttackLogData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarAttackLogDataOrBuilder {
         private int bitField0_;
         private int time_;
         private Object content_;
         private int attackPlayerId_;
         private int holdPlayerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarAttackLogData.class, Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarAttackLogData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.time_ = 0;
            this.bitField0_ &= -2;
            this.content_ = "";
            this.bitField0_ &= -3;
            this.attackPlayerId_ = 0;
            this.bitField0_ &= -5;
            this.holdPlayerId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarAttackLogData_descriptor;
         }

         public WarAttackLogData getDefaultInstanceForType() {
            return UnionWarMsg.WarAttackLogData.getDefaultInstance();
         }

         public WarAttackLogData build() {
            WarAttackLogData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarAttackLogData buildPartial() {
            WarAttackLogData result = new WarAttackLogData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.content_ = this.content_;
            if ((from_bitField0_ & 4) != 0) {
               result.attackPlayerId_ = this.attackPlayerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.holdPlayerId_ = this.holdPlayerId_;
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
            if (other instanceof WarAttackLogData) {
               return this.mergeFrom((WarAttackLogData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarAttackLogData other) {
            if (other == UnionWarMsg.WarAttackLogData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasContent()) {
                  this.bitField0_ |= 2;
                  this.content_ = other.content_;
                  this.onChanged();
               }

               if (other.hasAttackPlayerId()) {
                  this.setAttackPlayerId(other.getAttackPlayerId());
               }

               if (other.hasHoldPlayerId()) {
                  this.setHoldPlayerId(other.getHoldPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTime()) {
               return false;
            } else if (!this.hasContent()) {
               return false;
            } else if (!this.hasAttackPlayerId()) {
               return false;
            } else {
               return this.hasHoldPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarAttackLogData parsedMessage = null;

            try {
               parsedMessage = (WarAttackLogData)UnionWarMsg.WarAttackLogData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarAttackLogData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 1;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.content_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContent() {
            this.bitField0_ &= -3;
            this.content_ = UnionWarMsg.WarAttackLogData.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasAttackPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAttackPlayerId() {
            return this.attackPlayerId_;
         }

         public Builder setAttackPlayerId(int value) {
            this.bitField0_ |= 4;
            this.attackPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAttackPlayerId() {
            this.bitField0_ &= -5;
            this.attackPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHoldPlayerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHoldPlayerId() {
            return this.holdPlayerId_;
         }

         public Builder setHoldPlayerId(int value) {
            this.bitField0_ |= 8;
            this.holdPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHoldPlayerId() {
            this.bitField0_ &= -9;
            this.holdPlayerId_ = 0;
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

   public static final class WarRankData extends GeneratedMessageV3 implements WarRankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int STAR_FIELD_NUMBER = 2;
      private int star_;
      public static final int RECORD_FIELD_NUMBER = 3;
      private int record_;
      public static final int PLAYERID_FIELD_NUMBER = 4;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 5;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 6;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 7;
      private int headFrame_;
      public static final int MONARCHID_FIELD_NUMBER = 8;
      private int monarchId_;
      public static final int LEVEL_FIELD_NUMBER = 9;
      private int level_;
      public static final int SERVERID_FIELD_NUMBER = 10;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final WarRankData DEFAULT_INSTANCE = new WarRankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarRankData> PARSER = new AbstractParser<WarRankData>() {
         public WarRankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarRankData(input, extensionRegistry);
         }
      };

      private WarRankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarRankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarRankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarRankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.star_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.record_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.playerId_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.playerName_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.head_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.level_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.serverId_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarRankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecord() {
         return this.record_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 16) != 0;
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

      public boolean hasHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getServerId() {
         return this.serverId_;
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
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
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
            output.writeInt32(2, this.star_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.record_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.playerId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.playerName_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.head_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headFrame_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.monarchId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.level_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.star_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.record_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.playerId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.playerName_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.head_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headFrame_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.monarchId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.level_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarRankData)) {
            return super.equals(obj);
         } else {
            WarRankData other = (WarRankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && this.getRecord() != other.getRecord()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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

            if (this.hasStar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStar();
            }

            if (this.hasRecord()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecord();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarRankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data);
      }

      public static WarRankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarRankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data);
      }

      public static WarRankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarRankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data);
      }

      public static WarRankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarRankData parseFrom(InputStream input) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarRankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarRankData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarRankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarRankData parseFrom(CodedInputStream input) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarRankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarRankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarRankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarRankData> parser() {
         return PARSER;
      }

      public Parser<WarRankData> getParserForType() {
         return PARSER;
      }

      public WarRankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarRankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private int star_;
         private int record_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int monarchId_;
         private int level_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarRankData.class, Builder.class);
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
            if (UnionWarMsg.WarRankData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.star_ = 0;
            this.bitField0_ &= -3;
            this.record_ = 0;
            this.bitField0_ &= -5;
            this.playerId_ = 0;
            this.bitField0_ &= -9;
            this.playerName_ = "";
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.bitField0_ &= -65;
            this.monarchId_ = 0;
            this.bitField0_ &= -129;
            this.level_ = 0;
            this.bitField0_ &= -257;
            this.serverId_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarRankData_descriptor;
         }

         public WarRankData getDefaultInstanceForType() {
            return UnionWarMsg.WarRankData.getDefaultInstance();
         }

         public WarRankData build() {
            WarRankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarRankData buildPartial() {
            WarRankData result = new WarRankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.record_ = this.record_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 32) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 512;
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
            if (other instanceof WarRankData) {
               return this.mergeFrom((WarRankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarRankData other) {
            if (other == UnionWarMsg.WarRankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (other.hasRecord()) {
                  this.setRecord(other.getRecord());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 16;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasStar()) {
               return false;
            } else if (!this.hasRecord()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarRankData parsedMessage = null;

            try {
               parsedMessage = (WarRankData)UnionWarMsg.WarRankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarRankData)e.getUnfinishedMessage();
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

         public boolean hasStar() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 2;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecord() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecord() {
            return this.record_;
         }

         public Builder setRecord(int value) {
            this.bitField0_ |= 4;
            this.record_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecord() {
            this.bitField0_ &= -5;
            this.record_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 8;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -9;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 16) != 0;
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
               this.bitField0_ |= 16;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -17;
            this.playerName_ = UnionWarMsg.WarRankData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHead() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 32;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -33;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 64;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 128;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -129;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 256;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -257;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 512;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -513;
            this.serverId_ = 0;
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

   public static final class WarBoxData extends GeneratedMessageV3 implements WarBoxDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int ITEM_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> item_;
      private byte memoizedIsInitialized;
      private static final WarBoxData DEFAULT_INSTANCE = new WarBoxData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarBoxData> PARSER = new AbstractParser<WarBoxData>() {
         public WarBoxData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarBoxData(input, extensionRegistry);
         }
      };

      private WarBoxData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarBoxData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.item_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarBoxData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarBoxData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
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
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.item_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.item_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBoxData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBoxData.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
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

      public List<CommonMsg.ItemInfo> getItemList() {
         return this.item_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
         return this.item_;
      }

      public int getItemCount() {
         return this.item_.size();
      }

      public CommonMsg.ItemInfo getItem(int index) {
         return (CommonMsg.ItemInfo)this.item_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.item_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
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
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         for(int i = 0; i < this.item_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.item_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            for(int i = 0; i < this.item_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.item_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarBoxData)) {
            return super.equals(obj);
         } else {
            WarBoxData other = (WarBoxData)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (!this.getItemList().equals(other.getItemList())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.getItemCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarBoxData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data);
      }

      public static WarBoxData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBoxData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data);
      }

      public static WarBoxData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBoxData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data);
      }

      public static WarBoxData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBoxData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBoxData parseFrom(InputStream input) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBoxData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBoxData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarBoxData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBoxData parseFrom(CodedInputStream input) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBoxData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBoxData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarBoxData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarBoxData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarBoxData> parser() {
         return PARSER;
      }

      public Parser<WarBoxData> getParserForType() {
         return PARSER;
      }

      public WarBoxData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarBoxDataOrBuilder {
         private int bitField0_;
         private int position_;
         private int playerId_;
         private Object playerName_;
         private List<CommonMsg.ItemInfo> item_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBoxData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBoxData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarBoxData.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBoxData_descriptor;
         }

         public WarBoxData getDefaultInstanceForType() {
            return UnionWarMsg.WarBoxData.getDefaultInstance();
         }

         public WarBoxData build() {
            WarBoxData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarBoxData buildPartial() {
            WarBoxData result = new WarBoxData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
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
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
                  this.bitField0_ &= -9;
               }

               result.item_ = this.item_;
            } else {
               result.item_ = this.itemBuilder_.build();
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
            if (other instanceof WarBoxData) {
               return this.mergeFrom((WarBoxData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarBoxData other) {
            if (other == UnionWarMsg.WarBoxData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (this.itemBuilder_ == null) {
                  if (!other.item_.isEmpty()) {
                     if (this.item_.isEmpty()) {
                        this.item_ = other.item_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureItemIsMutable();
                        this.item_.addAll(other.item_);
                     }

                     this.onChanged();
                  }
               } else if (!other.item_.isEmpty()) {
                  if (this.itemBuilder_.isEmpty()) {
                     this.itemBuilder_.dispose();
                     this.itemBuilder_ = null;
                     this.item_ = other.item_;
                     this.bitField0_ &= -9;
                     this.itemBuilder_ = UnionWarMsg.WarBoxData.alwaysUseFieldBuilders ? this.getItemFieldBuilder() : null;
                  } else {
                     this.itemBuilder_.addAllMessages(other.item_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemCount(); ++i) {
                  if (!this.getItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarBoxData parsedMessage = null;

            try {
               parsedMessage = (WarBoxData)UnionWarMsg.WarBoxData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarBoxData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
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
            this.playerName_ = UnionWarMsg.WarBoxData.getDefaultInstance().getPlayerName();
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

         private void ensureItemIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.item_ = new ArrayList(this.item_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.ItemInfo> getItemList() {
            return this.itemBuilder_ == null ? Collections.unmodifiableList(this.item_) : this.itemBuilder_.getMessageList();
         }

         public int getItemCount() {
            return this.itemBuilder_ == null ? this.item_.size() : this.itemBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItem(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfo)this.item_.get(index) : (CommonMsg.ItemInfo)this.itemBuilder_.getMessage(index);
         }

         public Builder setItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.set(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItem(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItem(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
               this.onChanged();
            } else {
               this.itemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Builder removeItem(int index) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.remove(index);
               this.onChanged();
            } else {
               this.itemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index) {
            return this.itemBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.item_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList() {
            return this.itemBuilder_ != null ? this.itemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemBuilderList() {
            return this.getItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new RepeatedFieldBuilderV3(this.item_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class WarStrongholdRecordData extends GeneratedMessageV3 implements WarStrongholdRecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RECORDS_FIELD_NUMBER = 2;
      private List<WarBattleRecordData> records_;
      private byte memoizedIsInitialized;
      private static final WarStrongholdRecordData DEFAULT_INSTANCE = new WarStrongholdRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarStrongholdRecordData> PARSER = new AbstractParser<WarStrongholdRecordData>() {
         public WarStrongholdRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarStrongholdRecordData(input, extensionRegistry);
         }
      };

      private WarStrongholdRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarStrongholdRecordData() {
         this.memoizedIsInitialized = -1;
         this.records_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarStrongholdRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarStrongholdRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.records_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.records_.add(input.readMessage(UnionWarMsg.WarBattleRecordData.PARSER, extensionRegistry));
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
                  this.records_ = Collections.unmodifiableList(this.records_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdRecordData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public List<WarBattleRecordData> getRecordsList() {
         return this.records_;
      }

      public List<? extends WarBattleRecordDataOrBuilder> getRecordsOrBuilderList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public WarBattleRecordData getRecords(int index) {
         return (WarBattleRecordData)this.records_.get(index);
      }

      public WarBattleRecordDataOrBuilder getRecordsOrBuilder(int index) {
         return (WarBattleRecordDataOrBuilder)this.records_.get(index);
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
         } else {
            for(int i = 0; i < this.getRecordsCount(); ++i) {
               if (!this.getRecords(i).isInitialized()) {
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
            output.writeInt32(1, this.playerId_);
         }

         for(int i = 0; i < this.records_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.records_.get(i));
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

            for(int i = 0; i < this.records_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.records_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarStrongholdRecordData)) {
            return super.equals(obj);
         } else {
            WarStrongholdRecordData other = (WarStrongholdRecordData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (!this.getRecordsList().equals(other.getRecordsList())) {
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

            if (this.getRecordsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarStrongholdRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data);
      }

      public static WarStrongholdRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data);
      }

      public static WarStrongholdRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data);
      }

      public static WarStrongholdRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarStrongholdRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarStrongholdRecordData parseFrom(InputStream input) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarStrongholdRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarStrongholdRecordData parseFrom(CodedInputStream input) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarStrongholdRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarStrongholdRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarStrongholdRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarStrongholdRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarStrongholdRecordData> parser() {
         return PARSER;
      }

      public Parser<WarStrongholdRecordData> getParserForType() {
         return PARSER;
      }

      public WarStrongholdRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarStrongholdRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private List<WarBattleRecordData> records_;
         private RepeatedFieldBuilderV3<WarBattleRecordData, WarBattleRecordData.Builder, WarBattleRecordDataOrBuilder> recordsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarStrongholdRecordData.class, Builder.class);
         }

         private Builder() {
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarStrongholdRecordData.alwaysUseFieldBuilders) {
               this.getRecordsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.recordsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarStrongholdRecordData_descriptor;
         }

         public WarStrongholdRecordData getDefaultInstanceForType() {
            return UnionWarMsg.WarStrongholdRecordData.getDefaultInstance();
         }

         public WarStrongholdRecordData build() {
            WarStrongholdRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarStrongholdRecordData buildPartial() {
            WarStrongholdRecordData result = new WarStrongholdRecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if (this.recordsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.records_ = Collections.unmodifiableList(this.records_);
                  this.bitField0_ &= -3;
               }

               result.records_ = this.records_;
            } else {
               result.records_ = this.recordsBuilder_.build();
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
            if (other instanceof WarStrongholdRecordData) {
               return this.mergeFrom((WarStrongholdRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarStrongholdRecordData other) {
            if (other == UnionWarMsg.WarStrongholdRecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (this.recordsBuilder_ == null) {
                  if (!other.records_.isEmpty()) {
                     if (this.records_.isEmpty()) {
                        this.records_ = other.records_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRecordsIsMutable();
                        this.records_.addAll(other.records_);
                     }

                     this.onChanged();
                  }
               } else if (!other.records_.isEmpty()) {
                  if (this.recordsBuilder_.isEmpty()) {
                     this.recordsBuilder_.dispose();
                     this.recordsBuilder_ = null;
                     this.records_ = other.records_;
                     this.bitField0_ &= -3;
                     this.recordsBuilder_ = UnionWarMsg.WarStrongholdRecordData.alwaysUseFieldBuilders ? this.getRecordsFieldBuilder() : null;
                  } else {
                     this.recordsBuilder_.addAllMessages(other.records_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else {
               for(int i = 0; i < this.getRecordsCount(); ++i) {
                  if (!this.getRecords(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarStrongholdRecordData parsedMessage = null;

            try {
               parsedMessage = (WarStrongholdRecordData)UnionWarMsg.WarStrongholdRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarStrongholdRecordData)e.getUnfinishedMessage();
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

         private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.records_ = new ArrayList(this.records_);
               this.bitField0_ |= 2;
            }

         }

         public List<WarBattleRecordData> getRecordsList() {
            return this.recordsBuilder_ == null ? Collections.unmodifiableList(this.records_) : this.recordsBuilder_.getMessageList();
         }

         public int getRecordsCount() {
            return this.recordsBuilder_ == null ? this.records_.size() : this.recordsBuilder_.getCount();
         }

         public WarBattleRecordData getRecords(int index) {
            return this.recordsBuilder_ == null ? (WarBattleRecordData)this.records_.get(index) : (WarBattleRecordData)this.recordsBuilder_.getMessage(index);
         }

         public Builder setRecords(int index, WarBattleRecordData value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.set(index, value);
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecords(int index, WarBattleRecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(WarBattleRecordData value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.add(value);
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecords(int index, WarBattleRecordData value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.add(index, value);
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecords(WarBattleRecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(int index, WarBattleRecordData.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecords(Iterable<? extends WarBattleRecordData> values) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.records_);
               this.onChanged();
            } else {
               this.recordsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecords() {
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.recordsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecords(int index) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.remove(index);
               this.onChanged();
            } else {
               this.recordsBuilder_.remove(index);
            }

            return this;
         }

         public WarBattleRecordData.Builder getRecordsBuilder(int index) {
            return (WarBattleRecordData.Builder)this.getRecordsFieldBuilder().getBuilder(index);
         }

         public WarBattleRecordDataOrBuilder getRecordsOrBuilder(int index) {
            return this.recordsBuilder_ == null ? (WarBattleRecordDataOrBuilder)this.records_.get(index) : (WarBattleRecordDataOrBuilder)this.recordsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarBattleRecordDataOrBuilder> getRecordsOrBuilderList() {
            return this.recordsBuilder_ != null ? this.recordsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
         }

         public WarBattleRecordData.Builder addRecordsBuilder() {
            return (WarBattleRecordData.Builder)this.getRecordsFieldBuilder().addBuilder(UnionWarMsg.WarBattleRecordData.getDefaultInstance());
         }

         public WarBattleRecordData.Builder addRecordsBuilder(int index) {
            return (WarBattleRecordData.Builder)this.getRecordsFieldBuilder().addBuilder(index, UnionWarMsg.WarBattleRecordData.getDefaultInstance());
         }

         public List<WarBattleRecordData.Builder> getRecordsBuilderList() {
            return this.getRecordsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarBattleRecordData, WarBattleRecordData.Builder, WarBattleRecordDataOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
               this.recordsBuilder_ = new RepeatedFieldBuilderV3(this.records_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.records_ = null;
            }

            return this.recordsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class WarBattleRecordData extends GeneratedMessageV3 implements WarBattleRecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int POWER_FIELD_NUMBER = 4;
      private long power_;
      public static final int STAR_FIELD_NUMBER = 5;
      private int star_;
      public static final int TIME_FIELD_NUMBER = 6;
      private int time_;
      public static final int HERO_FIELD_NUMBER = 7;
      private List<CommonMsg.HeroInfo> hero_;
      public static final int ISWIN_FIELD_NUMBER = 8;
      private boolean isWin_;
      public static final int SERVERID_FIELD_NUMBER = 9;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final WarBattleRecordData DEFAULT_INSTANCE = new WarBattleRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarBattleRecordData> PARSER = new AbstractParser<WarBattleRecordData>() {
         public WarBattleRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarBattleRecordData(input, extensionRegistry);
         }
      };

      private WarBattleRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarBattleRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarBattleRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarBattleRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recordId_ = input.readInt32();
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
                        this.power_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.star_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.time_ = input.readInt32();
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.hero_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
                        break;
                     case 64:
                        this.bitField0_ |= 64;
                        this.isWin_ = input.readBool();
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.serverId_ = input.readInt32();
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
               if ((mutable_bitField0_ & 64) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBattleRecordData.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
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

      public boolean hasPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public List<CommonMsg.HeroInfo> getHeroList() {
         return this.hero_;
      }

      public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public CommonMsg.HeroInfo getHero(int index) {
         return (CommonMsg.HeroInfo)this.hero_.get(index);
      }

      public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
         return (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index);
      }

      public boolean hasIsWin() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsWin() {
         return this.isWin_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsWin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroCount(); ++i) {
               if (!this.getHero(i).isInitialized()) {
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
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.power_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.star_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.time_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.hero_.get(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(8, this.isWin_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.power_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.star_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.time_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.hero_.get(i));
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isWin_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarBattleRecordData)) {
            return super.equals(obj);
         } else {
            WarBattleRecordData other = (WarBattleRecordData)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (this.hasIsWin() != other.hasIsWin()) {
               return false;
            } else if (this.hasIsWin() && this.getIsWin() != other.getIsWin()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasStar()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStar();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTime();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.hasIsWin()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsWin());
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarBattleRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data);
      }

      public static WarBattleRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data);
      }

      public static WarBattleRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data);
      }

      public static WarBattleRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleRecordData parseFrom(InputStream input) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBattleRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBattleRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarBattleRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBattleRecordData parseFrom(CodedInputStream input) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBattleRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarBattleRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarBattleRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarBattleRecordData> parser() {
         return PARSER;
      }

      public Parser<WarBattleRecordData> getParserForType() {
         return PARSER;
      }

      public WarBattleRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarBattleRecordDataOrBuilder {
         private int bitField0_;
         private int recordId_;
         private int playerId_;
         private Object playerName_;
         private long power_;
         private int star_;
         private int time_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;
         private boolean isWin_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBattleRecordData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarBattleRecordData.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.power_ = 0L;
            this.bitField0_ &= -9;
            this.star_ = 0;
            this.bitField0_ &= -17;
            this.time_ = 0;
            this.bitField0_ &= -33;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.heroBuilder_.clear();
            }

            this.isWin_ = false;
            this.bitField0_ &= -129;
            this.serverId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleRecordData_descriptor;
         }

         public WarBattleRecordData getDefaultInstanceForType() {
            return UnionWarMsg.WarBattleRecordData.getDefaultInstance();
         }

         public WarBattleRecordData build() {
            WarBattleRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarBattleRecordData buildPartial() {
            WarBattleRecordData result = new WarBattleRecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
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
               result.power_ = this.power_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 32;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -65;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isWin_ = this.isWin_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 128;
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
            if (other instanceof WarBattleRecordData) {
               return this.mergeFrom((WarBattleRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarBattleRecordData other) {
            if (other == UnionWarMsg.WarBattleRecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureHeroIsMutable();
                        this.hero_.addAll(other.hero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hero_.isEmpty()) {
                  if (this.heroBuilder_.isEmpty()) {
                     this.heroBuilder_.dispose();
                     this.heroBuilder_ = null;
                     this.hero_ = other.hero_;
                     this.bitField0_ &= -65;
                     this.heroBuilder_ = UnionWarMsg.WarBattleRecordData.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (other.hasIsWin()) {
                  this.setIsWin(other.getIsWin());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.hasStar()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasIsWin()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroCount(); ++i) {
                  if (!this.getHero(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarBattleRecordData parsedMessage = null;

            try {
               parsedMessage = (WarBattleRecordData)UnionWarMsg.WarBattleRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarBattleRecordData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0;
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
            this.playerName_ = UnionWarMsg.WarBattleRecordData.getDefaultInstance().getPlayerName();
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

         public boolean hasPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 8;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -9;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 16;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -17;
            this.star_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 32;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -33;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.HeroInfo> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public CommonMsg.HeroInfo getHero(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfo)this.hero_.get(index) : (CommonMsg.HeroInfo)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.set(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends CommonMsg.HeroInfo> values) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hero_);
               this.onChanged();
            } else {
               this.heroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHero() {
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Builder removeHero(int index) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.remove(index);
               this.onChanged();
            } else {
               this.heroBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index) : (CommonMsg.HeroInfoOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder() {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(CommonMsg.HeroInfo.getDefaultInstance());
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(index, CommonMsg.HeroInfo.getDefaultInstance());
         }

         public List<CommonMsg.HeroInfo.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public boolean hasIsWin() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsWin() {
            return this.isWin_;
         }

         public Builder setIsWin(boolean value) {
            this.bitField0_ |= 128;
            this.isWin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsWin() {
            this.bitField0_ &= -129;
            this.isWin_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 256;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -257;
            this.serverId_ = 0;
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

   public static final class WarBattleAchievementData extends GeneratedMessageV3 implements WarBattleAchievementDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACHIEVEMENTID_FIELD_NUMBER = 1;
      private int achievementId_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int PROGRESS_FIELD_NUMBER = 3;
      private int progress_;
      private byte memoizedIsInitialized;
      private static final WarBattleAchievementData DEFAULT_INSTANCE = new WarBattleAchievementData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarBattleAchievementData> PARSER = new AbstractParser<WarBattleAchievementData>() {
         public WarBattleAchievementData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarBattleAchievementData(input, extensionRegistry);
         }
      };

      private WarBattleAchievementData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarBattleAchievementData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarBattleAchievementData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarBattleAchievementData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.achievementId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.progress_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBattleAchievementData.class, Builder.class);
      }

      public boolean hasAchievementId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAchievementId() {
         return this.achievementId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasProgress() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getProgress() {
         return this.progress_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAchievementId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
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
            output.writeInt32(1, this.achievementId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.progress_);
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
               size += CodedOutputStream.computeInt32Size(1, this.achievementId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.progress_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarBattleAchievementData)) {
            return super.equals(obj);
         } else {
            WarBattleAchievementData other = (WarBattleAchievementData)obj;
            if (this.hasAchievementId() != other.hasAchievementId()) {
               return false;
            } else if (this.hasAchievementId() && this.getAchievementId() != other.getAchievementId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasProgress() != other.hasProgress()) {
               return false;
            } else if (this.hasProgress() && this.getProgress() != other.getProgress()) {
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
            if (this.hasAchievementId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAchievementId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasProgress()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProgress();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarBattleAchievementData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data);
      }

      public static WarBattleAchievementData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleAchievementData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data);
      }

      public static WarBattleAchievementData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleAchievementData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data);
      }

      public static WarBattleAchievementData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarBattleAchievementData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarBattleAchievementData parseFrom(InputStream input) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBattleAchievementData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBattleAchievementData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarBattleAchievementData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarBattleAchievementData parseFrom(CodedInputStream input) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarBattleAchievementData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarBattleAchievementData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarBattleAchievementData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarBattleAchievementData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarBattleAchievementData> parser() {
         return PARSER;
      }

      public Parser<WarBattleAchievementData> getParserForType() {
         return PARSER;
      }

      public WarBattleAchievementData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarBattleAchievementDataOrBuilder {
         private int bitField0_;
         private int achievementId_;
         private int state_;
         private int progress_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarBattleAchievementData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.WarBattleAchievementData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.achievementId_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.progress_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_WarBattleAchievementData_descriptor;
         }

         public WarBattleAchievementData getDefaultInstanceForType() {
            return UnionWarMsg.WarBattleAchievementData.getDefaultInstance();
         }

         public WarBattleAchievementData build() {
            WarBattleAchievementData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarBattleAchievementData buildPartial() {
            WarBattleAchievementData result = new WarBattleAchievementData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.achievementId_ = this.achievementId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.progress_ = this.progress_;
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
            if (other instanceof WarBattleAchievementData) {
               return this.mergeFrom((WarBattleAchievementData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarBattleAchievementData other) {
            if (other == UnionWarMsg.WarBattleAchievementData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAchievementId()) {
                  this.setAchievementId(other.getAchievementId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
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
            if (!this.hasAchievementId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.hasProgress();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarBattleAchievementData parsedMessage = null;

            try {
               parsedMessage = (WarBattleAchievementData)UnionWarMsg.WarBattleAchievementData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarBattleAchievementData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAchievementId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAchievementId() {
            return this.achievementId_;
         }

         public Builder setAchievementId(int value) {
            this.bitField0_ |= 1;
            this.achievementId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAchievementId() {
            this.bitField0_ &= -2;
            this.achievementId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProgress() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getProgress() {
            return this.progress_;
         }

         public Builder setProgress(int value) {
            this.bitField0_ |= 4;
            this.progress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProgress() {
            this.bitField0_ &= -5;
            this.progress_ = 0;
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

   public static final class C2S_WarAgainstList_9701 extends GeneratedMessageV3 implements C2S_WarAgainstList_9701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarAgainstList_9701 DEFAULT_INSTANCE = new C2S_WarAgainstList_9701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarAgainstList_9701> PARSER = new AbstractParser<C2S_WarAgainstList_9701>() {
         public C2S_WarAgainstList_9701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarAgainstList_9701(input, extensionRegistry);
         }
      };

      private C2S_WarAgainstList_9701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarAgainstList_9701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarAgainstList_9701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarAgainstList_9701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarAgainstList_9701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarAgainstList_9701)) {
            return super.equals(obj);
         } else {
            C2S_WarAgainstList_9701 other = (C2S_WarAgainstList_9701)obj;
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

      public static C2S_WarAgainstList_9701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data);
      }

      public static C2S_WarAgainstList_9701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAgainstList_9701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data);
      }

      public static C2S_WarAgainstList_9701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAgainstList_9701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data);
      }

      public static C2S_WarAgainstList_9701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAgainstList_9701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAgainstList_9701 parseFrom(InputStream input) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarAgainstList_9701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarAgainstList_9701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarAgainstList_9701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarAgainstList_9701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarAgainstList_9701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAgainstList_9701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarAgainstList_9701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarAgainstList_9701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarAgainstList_9701> parser() {
         return PARSER;
      }

      public Parser<C2S_WarAgainstList_9701> getParserForType() {
         return PARSER;
      }

      public C2S_WarAgainstList_9701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarAgainstList_9701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarAgainstList_9701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarAgainstList_9701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAgainstList_9701_descriptor;
         }

         public C2S_WarAgainstList_9701 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarAgainstList_9701.getDefaultInstance();
         }

         public C2S_WarAgainstList_9701 build() {
            C2S_WarAgainstList_9701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarAgainstList_9701 buildPartial() {
            C2S_WarAgainstList_9701 result = new C2S_WarAgainstList_9701(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarAgainstList_9701) {
               return this.mergeFrom((C2S_WarAgainstList_9701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarAgainstList_9701 other) {
            if (other == UnionWarMsg.C2S_WarAgainstList_9701.getDefaultInstance()) {
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
            C2S_WarAgainstList_9701 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarAgainstList_9701)UnionWarMsg.C2S_WarAgainstList_9701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarAgainstList_9701)e.getUnfinishedMessage();
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

   public static final class S2C_WarAgainstList_9702 extends GeneratedMessageV3 implements S2C_WarAgainstList_9702OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AGAINSTLIST_FIELD_NUMBER = 1;
      private List<WarAgainstData> againstList_;
      private byte memoizedIsInitialized;
      private static final S2C_WarAgainstList_9702 DEFAULT_INSTANCE = new S2C_WarAgainstList_9702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarAgainstList_9702> PARSER = new AbstractParser<S2C_WarAgainstList_9702>() {
         public S2C_WarAgainstList_9702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarAgainstList_9702(input, extensionRegistry);
         }
      };

      private S2C_WarAgainstList_9702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarAgainstList_9702() {
         this.memoizedIsInitialized = -1;
         this.againstList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarAgainstList_9702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarAgainstList_9702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.againstList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.againstList_.add(input.readMessage(UnionWarMsg.WarAgainstData.PARSER, extensionRegistry));
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
                  this.againstList_ = Collections.unmodifiableList(this.againstList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarAgainstList_9702.class, Builder.class);
      }

      public List<WarAgainstData> getAgainstListList() {
         return this.againstList_;
      }

      public List<? extends WarAgainstDataOrBuilder> getAgainstListOrBuilderList() {
         return this.againstList_;
      }

      public int getAgainstListCount() {
         return this.againstList_.size();
      }

      public WarAgainstData getAgainstList(int index) {
         return (WarAgainstData)this.againstList_.get(index);
      }

      public WarAgainstDataOrBuilder getAgainstListOrBuilder(int index) {
         return (WarAgainstDataOrBuilder)this.againstList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAgainstListCount(); ++i) {
               if (!this.getAgainstList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.againstList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.againstList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.againstList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.againstList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarAgainstList_9702)) {
            return super.equals(obj);
         } else {
            S2C_WarAgainstList_9702 other = (S2C_WarAgainstList_9702)obj;
            if (!this.getAgainstListList().equals(other.getAgainstListList())) {
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
            if (this.getAgainstListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAgainstListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarAgainstList_9702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data);
      }

      public static S2C_WarAgainstList_9702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAgainstList_9702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data);
      }

      public static S2C_WarAgainstList_9702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAgainstList_9702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data);
      }

      public static S2C_WarAgainstList_9702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAgainstList_9702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAgainstList_9702 parseFrom(InputStream input) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarAgainstList_9702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarAgainstList_9702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarAgainstList_9702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarAgainstList_9702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarAgainstList_9702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAgainstList_9702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarAgainstList_9702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarAgainstList_9702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarAgainstList_9702> parser() {
         return PARSER;
      }

      public Parser<S2C_WarAgainstList_9702> getParserForType() {
         return PARSER;
      }

      public S2C_WarAgainstList_9702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarAgainstList_9702OrBuilder {
         private int bitField0_;
         private List<WarAgainstData> againstList_;
         private RepeatedFieldBuilderV3<WarAgainstData, WarAgainstData.Builder, WarAgainstDataOrBuilder> againstListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarAgainstList_9702.class, Builder.class);
         }

         private Builder() {
            this.againstList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.againstList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarAgainstList_9702.alwaysUseFieldBuilders) {
               this.getAgainstListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.againstListBuilder_ == null) {
               this.againstList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.againstListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAgainstList_9702_descriptor;
         }

         public S2C_WarAgainstList_9702 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarAgainstList_9702.getDefaultInstance();
         }

         public S2C_WarAgainstList_9702 build() {
            S2C_WarAgainstList_9702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarAgainstList_9702 buildPartial() {
            S2C_WarAgainstList_9702 result = new S2C_WarAgainstList_9702(this);
            int from_bitField0_ = this.bitField0_;
            if (this.againstListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.againstList_ = Collections.unmodifiableList(this.againstList_);
                  this.bitField0_ &= -2;
               }

               result.againstList_ = this.againstList_;
            } else {
               result.againstList_ = this.againstListBuilder_.build();
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
            if (other instanceof S2C_WarAgainstList_9702) {
               return this.mergeFrom((S2C_WarAgainstList_9702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarAgainstList_9702 other) {
            if (other == UnionWarMsg.S2C_WarAgainstList_9702.getDefaultInstance()) {
               return this;
            } else {
               if (this.againstListBuilder_ == null) {
                  if (!other.againstList_.isEmpty()) {
                     if (this.againstList_.isEmpty()) {
                        this.againstList_ = other.againstList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAgainstListIsMutable();
                        this.againstList_.addAll(other.againstList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.againstList_.isEmpty()) {
                  if (this.againstListBuilder_.isEmpty()) {
                     this.againstListBuilder_.dispose();
                     this.againstListBuilder_ = null;
                     this.againstList_ = other.againstList_;
                     this.bitField0_ &= -2;
                     this.againstListBuilder_ = UnionWarMsg.S2C_WarAgainstList_9702.alwaysUseFieldBuilders ? this.getAgainstListFieldBuilder() : null;
                  } else {
                     this.againstListBuilder_.addAllMessages(other.againstList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAgainstListCount(); ++i) {
               if (!this.getAgainstList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarAgainstList_9702 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarAgainstList_9702)UnionWarMsg.S2C_WarAgainstList_9702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarAgainstList_9702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAgainstListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.againstList_ = new ArrayList(this.againstList_);
               this.bitField0_ |= 1;
            }

         }

         public List<WarAgainstData> getAgainstListList() {
            return this.againstListBuilder_ == null ? Collections.unmodifiableList(this.againstList_) : this.againstListBuilder_.getMessageList();
         }

         public int getAgainstListCount() {
            return this.againstListBuilder_ == null ? this.againstList_.size() : this.againstListBuilder_.getCount();
         }

         public WarAgainstData getAgainstList(int index) {
            return this.againstListBuilder_ == null ? (WarAgainstData)this.againstList_.get(index) : (WarAgainstData)this.againstListBuilder_.getMessage(index);
         }

         public Builder setAgainstList(int index, WarAgainstData value) {
            if (this.againstListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAgainstListIsMutable();
               this.againstList_.set(index, value);
               this.onChanged();
            } else {
               this.againstListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAgainstList(int index, WarAgainstData.Builder builderForValue) {
            if (this.againstListBuilder_ == null) {
               this.ensureAgainstListIsMutable();
               this.againstList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.againstListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAgainstList(WarAgainstData value) {
            if (this.againstListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAgainstListIsMutable();
               this.againstList_.add(value);
               this.onChanged();
            } else {
               this.againstListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAgainstList(int index, WarAgainstData value) {
            if (this.againstListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAgainstListIsMutable();
               this.againstList_.add(index, value);
               this.onChanged();
            } else {
               this.againstListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAgainstList(WarAgainstData.Builder builderForValue) {
            if (this.againstListBuilder_ == null) {
               this.ensureAgainstListIsMutable();
               this.againstList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.againstListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAgainstList(int index, WarAgainstData.Builder builderForValue) {
            if (this.againstListBuilder_ == null) {
               this.ensureAgainstListIsMutable();
               this.againstList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.againstListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAgainstList(Iterable<? extends WarAgainstData> values) {
            if (this.againstListBuilder_ == null) {
               this.ensureAgainstListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.againstList_);
               this.onChanged();
            } else {
               this.againstListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAgainstList() {
            if (this.againstListBuilder_ == null) {
               this.againstList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.againstListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAgainstList(int index) {
            if (this.againstListBuilder_ == null) {
               this.ensureAgainstListIsMutable();
               this.againstList_.remove(index);
               this.onChanged();
            } else {
               this.againstListBuilder_.remove(index);
            }

            return this;
         }

         public WarAgainstData.Builder getAgainstListBuilder(int index) {
            return (WarAgainstData.Builder)this.getAgainstListFieldBuilder().getBuilder(index);
         }

         public WarAgainstDataOrBuilder getAgainstListOrBuilder(int index) {
            return this.againstListBuilder_ == null ? (WarAgainstDataOrBuilder)this.againstList_.get(index) : (WarAgainstDataOrBuilder)this.againstListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarAgainstDataOrBuilder> getAgainstListOrBuilderList() {
            return this.againstListBuilder_ != null ? this.againstListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.againstList_);
         }

         public WarAgainstData.Builder addAgainstListBuilder() {
            return (WarAgainstData.Builder)this.getAgainstListFieldBuilder().addBuilder(UnionWarMsg.WarAgainstData.getDefaultInstance());
         }

         public WarAgainstData.Builder addAgainstListBuilder(int index) {
            return (WarAgainstData.Builder)this.getAgainstListFieldBuilder().addBuilder(index, UnionWarMsg.WarAgainstData.getDefaultInstance());
         }

         public List<WarAgainstData.Builder> getAgainstListBuilderList() {
            return this.getAgainstListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarAgainstData, WarAgainstData.Builder, WarAgainstDataOrBuilder> getAgainstListFieldBuilder() {
            if (this.againstListBuilder_ == null) {
               this.againstListBuilder_ = new RepeatedFieldBuilderV3(this.againstList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.againstList_ = null;
            }

            return this.againstListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarInfo_9703 extends GeneratedMessageV3 implements C2S_WarInfo_9703OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarInfo_9703 DEFAULT_INSTANCE = new C2S_WarInfo_9703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarInfo_9703> PARSER = new AbstractParser<C2S_WarInfo_9703>() {
         public C2S_WarInfo_9703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarInfo_9703(input, extensionRegistry);
         }
      };

      private C2S_WarInfo_9703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarInfo_9703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarInfo_9703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarInfo_9703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarInfo_9703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarInfo_9703)) {
            return super.equals(obj);
         } else {
            C2S_WarInfo_9703 other = (C2S_WarInfo_9703)obj;
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

      public static C2S_WarInfo_9703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data);
      }

      public static C2S_WarInfo_9703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarInfo_9703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data);
      }

      public static C2S_WarInfo_9703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarInfo_9703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data);
      }

      public static C2S_WarInfo_9703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarInfo_9703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarInfo_9703 parseFrom(InputStream input) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarInfo_9703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarInfo_9703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarInfo_9703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarInfo_9703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarInfo_9703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarInfo_9703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarInfo_9703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarInfo_9703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarInfo_9703> parser() {
         return PARSER;
      }

      public Parser<C2S_WarInfo_9703> getParserForType() {
         return PARSER;
      }

      public C2S_WarInfo_9703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarInfo_9703OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarInfo_9703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarInfo_9703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarInfo_9703_descriptor;
         }

         public C2S_WarInfo_9703 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarInfo_9703.getDefaultInstance();
         }

         public C2S_WarInfo_9703 build() {
            C2S_WarInfo_9703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarInfo_9703 buildPartial() {
            C2S_WarInfo_9703 result = new C2S_WarInfo_9703(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarInfo_9703) {
               return this.mergeFrom((C2S_WarInfo_9703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarInfo_9703 other) {
            if (other == UnionWarMsg.C2S_WarInfo_9703.getDefaultInstance()) {
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
            C2S_WarInfo_9703 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarInfo_9703)UnionWarMsg.C2S_WarInfo_9703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarInfo_9703)e.getUnfinishedMessage();
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

   public static final class S2C_WarInfo_9704 extends GeneratedMessageV3 implements S2C_WarInfo_9704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private int status_;
      public static final int OURAGAINSTDATA_FIELD_NUMBER = 2;
      private WarAgainstData ourAgainstData_;
      public static final int MYSTRONGHOLDLIST_FIELD_NUMBER = 3;
      private List<WarStrongholdData> myStrongholdList_;
      public static final int BUFFLV_FIELD_NUMBER = 4;
      private int buffLv_;
      private byte memoizedIsInitialized;
      private static final S2C_WarInfo_9704 DEFAULT_INSTANCE = new S2C_WarInfo_9704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarInfo_9704> PARSER = new AbstractParser<S2C_WarInfo_9704>() {
         public S2C_WarInfo_9704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarInfo_9704(input, extensionRegistry);
         }
      };

      private S2C_WarInfo_9704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarInfo_9704() {
         this.memoizedIsInitialized = -1;
         this.myStrongholdList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarInfo_9704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarInfo_9704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readInt32();
                        break;
                     case 18:
                        WarAgainstData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.ourAgainstData_.toBuilder();
                        }

                        this.ourAgainstData_ = (WarAgainstData)input.readMessage(UnionWarMsg.WarAgainstData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.ourAgainstData_);
                           this.ourAgainstData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.myStrongholdList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.myStrongholdList_.add(input.readMessage(UnionWarMsg.WarStrongholdData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.buffLv_ = input.readInt32();
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
                  this.myStrongholdList_ = Collections.unmodifiableList(this.myStrongholdList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarInfo_9704.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean hasOurAgainstData() {
         return (this.bitField0_ & 2) != 0;
      }

      public WarAgainstData getOurAgainstData() {
         return this.ourAgainstData_ == null ? UnionWarMsg.WarAgainstData.getDefaultInstance() : this.ourAgainstData_;
      }

      public WarAgainstDataOrBuilder getOurAgainstDataOrBuilder() {
         return this.ourAgainstData_ == null ? UnionWarMsg.WarAgainstData.getDefaultInstance() : this.ourAgainstData_;
      }

      public List<WarStrongholdData> getMyStrongholdListList() {
         return this.myStrongholdList_;
      }

      public List<? extends WarStrongholdDataOrBuilder> getMyStrongholdListOrBuilderList() {
         return this.myStrongholdList_;
      }

      public int getMyStrongholdListCount() {
         return this.myStrongholdList_.size();
      }

      public WarStrongholdData getMyStrongholdList(int index) {
         return (WarStrongholdData)this.myStrongholdList_.get(index);
      }

      public WarStrongholdDataOrBuilder getMyStrongholdListOrBuilder(int index) {
         return (WarStrongholdDataOrBuilder)this.myStrongholdList_.get(index);
      }

      public boolean hasBuffLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuffLv() {
         return this.buffLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasOurAgainstData() && !this.getOurAgainstData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getMyStrongholdListCount(); ++i) {
               if (!this.getMyStrongholdList(i).isInitialized()) {
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
            output.writeInt32(1, this.status_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getOurAgainstData());
         }

         for(int i = 0; i < this.myStrongholdList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.myStrongholdList_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.buffLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.status_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getOurAgainstData());
            }

            for(int i = 0; i < this.myStrongholdList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.myStrongholdList_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.buffLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarInfo_9704)) {
            return super.equals(obj);
         } else {
            S2C_WarInfo_9704 other = (S2C_WarInfo_9704)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.hasOurAgainstData() != other.hasOurAgainstData()) {
               return false;
            } else if (this.hasOurAgainstData() && !this.getOurAgainstData().equals(other.getOurAgainstData())) {
               return false;
            } else if (!this.getMyStrongholdListList().equals(other.getMyStrongholdListList())) {
               return false;
            } else if (this.hasBuffLv() != other.hasBuffLv()) {
               return false;
            } else if (this.hasBuffLv() && this.getBuffLv() != other.getBuffLv()) {
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
            if (this.hasStatus()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStatus();
            }

            if (this.hasOurAgainstData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOurAgainstData().hashCode();
            }

            if (this.getMyStrongholdListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMyStrongholdListList().hashCode();
            }

            if (this.hasBuffLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuffLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarInfo_9704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data);
      }

      public static S2C_WarInfo_9704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarInfo_9704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data);
      }

      public static S2C_WarInfo_9704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarInfo_9704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data);
      }

      public static S2C_WarInfo_9704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarInfo_9704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarInfo_9704 parseFrom(InputStream input) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarInfo_9704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarInfo_9704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarInfo_9704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarInfo_9704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarInfo_9704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarInfo_9704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarInfo_9704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarInfo_9704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarInfo_9704> parser() {
         return PARSER;
      }

      public Parser<S2C_WarInfo_9704> getParserForType() {
         return PARSER;
      }

      public S2C_WarInfo_9704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarInfo_9704OrBuilder {
         private int bitField0_;
         private int status_;
         private WarAgainstData ourAgainstData_;
         private SingleFieldBuilderV3<WarAgainstData, WarAgainstData.Builder, WarAgainstDataOrBuilder> ourAgainstDataBuilder_;
         private List<WarStrongholdData> myStrongholdList_;
         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> myStrongholdListBuilder_;
         private int buffLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarInfo_9704.class, Builder.class);
         }

         private Builder() {
            this.myStrongholdList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myStrongholdList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarInfo_9704.alwaysUseFieldBuilders) {
               this.getOurAgainstDataFieldBuilder();
               this.getMyStrongholdListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = 0;
            this.bitField0_ &= -2;
            if (this.ourAgainstDataBuilder_ == null) {
               this.ourAgainstData_ = null;
            } else {
               this.ourAgainstDataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.myStrongholdListBuilder_ == null) {
               this.myStrongholdList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.myStrongholdListBuilder_.clear();
            }

            this.buffLv_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarInfo_9704_descriptor;
         }

         public S2C_WarInfo_9704 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarInfo_9704.getDefaultInstance();
         }

         public S2C_WarInfo_9704 build() {
            S2C_WarInfo_9704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarInfo_9704 buildPartial() {
            S2C_WarInfo_9704 result = new S2C_WarInfo_9704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.ourAgainstDataBuilder_ == null) {
                  result.ourAgainstData_ = this.ourAgainstData_;
               } else {
                  result.ourAgainstData_ = (WarAgainstData)this.ourAgainstDataBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.myStrongholdListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.myStrongholdList_ = Collections.unmodifiableList(this.myStrongholdList_);
                  this.bitField0_ &= -5;
               }

               result.myStrongholdList_ = this.myStrongholdList_;
            } else {
               result.myStrongholdList_ = this.myStrongholdListBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.buffLv_ = this.buffLv_;
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
            if (other instanceof S2C_WarInfo_9704) {
               return this.mergeFrom((S2C_WarInfo_9704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarInfo_9704 other) {
            if (other == UnionWarMsg.S2C_WarInfo_9704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               if (other.hasOurAgainstData()) {
                  this.mergeOurAgainstData(other.getOurAgainstData());
               }

               if (this.myStrongholdListBuilder_ == null) {
                  if (!other.myStrongholdList_.isEmpty()) {
                     if (this.myStrongholdList_.isEmpty()) {
                        this.myStrongholdList_ = other.myStrongholdList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureMyStrongholdListIsMutable();
                        this.myStrongholdList_.addAll(other.myStrongholdList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myStrongholdList_.isEmpty()) {
                  if (this.myStrongholdListBuilder_.isEmpty()) {
                     this.myStrongholdListBuilder_.dispose();
                     this.myStrongholdListBuilder_ = null;
                     this.myStrongholdList_ = other.myStrongholdList_;
                     this.bitField0_ &= -5;
                     this.myStrongholdListBuilder_ = UnionWarMsg.S2C_WarInfo_9704.alwaysUseFieldBuilders ? this.getMyStrongholdListFieldBuilder() : null;
                  } else {
                     this.myStrongholdListBuilder_.addAllMessages(other.myStrongholdList_);
                  }
               }

               if (other.hasBuffLv()) {
                  this.setBuffLv(other.getBuffLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStatus()) {
               return false;
            } else if (this.hasOurAgainstData() && !this.getOurAgainstData().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getMyStrongholdListCount(); ++i) {
                  if (!this.getMyStrongholdList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarInfo_9704 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarInfo_9704)UnionWarMsg.S2C_WarInfo_9704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarInfo_9704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOurAgainstData() {
            return (this.bitField0_ & 2) != 0;
         }

         public WarAgainstData getOurAgainstData() {
            if (this.ourAgainstDataBuilder_ == null) {
               return this.ourAgainstData_ == null ? UnionWarMsg.WarAgainstData.getDefaultInstance() : this.ourAgainstData_;
            } else {
               return (WarAgainstData)this.ourAgainstDataBuilder_.getMessage();
            }
         }

         public Builder setOurAgainstData(WarAgainstData value) {
            if (this.ourAgainstDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ourAgainstData_ = value;
               this.onChanged();
            } else {
               this.ourAgainstDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setOurAgainstData(WarAgainstData.Builder builderForValue) {
            if (this.ourAgainstDataBuilder_ == null) {
               this.ourAgainstData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.ourAgainstDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeOurAgainstData(WarAgainstData value) {
            if (this.ourAgainstDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.ourAgainstData_ != null && this.ourAgainstData_ != UnionWarMsg.WarAgainstData.getDefaultInstance()) {
                  this.ourAgainstData_ = UnionWarMsg.WarAgainstData.newBuilder(this.ourAgainstData_).mergeFrom(value).buildPartial();
               } else {
                  this.ourAgainstData_ = value;
               }

               this.onChanged();
            } else {
               this.ourAgainstDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearOurAgainstData() {
            if (this.ourAgainstDataBuilder_ == null) {
               this.ourAgainstData_ = null;
               this.onChanged();
            } else {
               this.ourAgainstDataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public WarAgainstData.Builder getOurAgainstDataBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (WarAgainstData.Builder)this.getOurAgainstDataFieldBuilder().getBuilder();
         }

         public WarAgainstDataOrBuilder getOurAgainstDataOrBuilder() {
            if (this.ourAgainstDataBuilder_ != null) {
               return (WarAgainstDataOrBuilder)this.ourAgainstDataBuilder_.getMessageOrBuilder();
            } else {
               return this.ourAgainstData_ == null ? UnionWarMsg.WarAgainstData.getDefaultInstance() : this.ourAgainstData_;
            }
         }

         private SingleFieldBuilderV3<WarAgainstData, WarAgainstData.Builder, WarAgainstDataOrBuilder> getOurAgainstDataFieldBuilder() {
            if (this.ourAgainstDataBuilder_ == null) {
               this.ourAgainstDataBuilder_ = new SingleFieldBuilderV3(this.getOurAgainstData(), this.getParentForChildren(), this.isClean());
               this.ourAgainstData_ = null;
            }

            return this.ourAgainstDataBuilder_;
         }

         private void ensureMyStrongholdListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.myStrongholdList_ = new ArrayList(this.myStrongholdList_);
               this.bitField0_ |= 4;
            }

         }

         public List<WarStrongholdData> getMyStrongholdListList() {
            return this.myStrongholdListBuilder_ == null ? Collections.unmodifiableList(this.myStrongholdList_) : this.myStrongholdListBuilder_.getMessageList();
         }

         public int getMyStrongholdListCount() {
            return this.myStrongholdListBuilder_ == null ? this.myStrongholdList_.size() : this.myStrongholdListBuilder_.getCount();
         }

         public WarStrongholdData getMyStrongholdList(int index) {
            return this.myStrongholdListBuilder_ == null ? (WarStrongholdData)this.myStrongholdList_.get(index) : (WarStrongholdData)this.myStrongholdListBuilder_.getMessage(index);
         }

         public Builder setMyStrongholdList(int index, WarStrongholdData value) {
            if (this.myStrongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.set(index, value);
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyStrongholdList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.myStrongholdListBuilder_ == null) {
               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyStrongholdList(WarStrongholdData value) {
            if (this.myStrongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.add(value);
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyStrongholdList(int index, WarStrongholdData value) {
            if (this.myStrongholdListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.add(index, value);
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyStrongholdList(WarStrongholdData.Builder builderForValue) {
            if (this.myStrongholdListBuilder_ == null) {
               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyStrongholdList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.myStrongholdListBuilder_ == null) {
               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyStrongholdList(Iterable<? extends WarStrongholdData> values) {
            if (this.myStrongholdListBuilder_ == null) {
               this.ensureMyStrongholdListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myStrongholdList_);
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyStrongholdList() {
            if (this.myStrongholdListBuilder_ == null) {
               this.myStrongholdList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyStrongholdList(int index) {
            if (this.myStrongholdListBuilder_ == null) {
               this.ensureMyStrongholdListIsMutable();
               this.myStrongholdList_.remove(index);
               this.onChanged();
            } else {
               this.myStrongholdListBuilder_.remove(index);
            }

            return this;
         }

         public WarStrongholdData.Builder getMyStrongholdListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getMyStrongholdListFieldBuilder().getBuilder(index);
         }

         public WarStrongholdDataOrBuilder getMyStrongholdListOrBuilder(int index) {
            return this.myStrongholdListBuilder_ == null ? (WarStrongholdDataOrBuilder)this.myStrongholdList_.get(index) : (WarStrongholdDataOrBuilder)this.myStrongholdListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarStrongholdDataOrBuilder> getMyStrongholdListOrBuilderList() {
            return this.myStrongholdListBuilder_ != null ? this.myStrongholdListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myStrongholdList_);
         }

         public WarStrongholdData.Builder addMyStrongholdListBuilder() {
            return (WarStrongholdData.Builder)this.getMyStrongholdListFieldBuilder().addBuilder(UnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public WarStrongholdData.Builder addMyStrongholdListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getMyStrongholdListFieldBuilder().addBuilder(index, UnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public List<WarStrongholdData.Builder> getMyStrongholdListBuilderList() {
            return this.getMyStrongholdListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> getMyStrongholdListFieldBuilder() {
            if (this.myStrongholdListBuilder_ == null) {
               this.myStrongholdListBuilder_ = new RepeatedFieldBuilderV3(this.myStrongholdList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.myStrongholdList_ = null;
            }

            return this.myStrongholdListBuilder_;
         }

         public boolean hasBuffLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getBuffLv() {
            return this.buffLv_;
         }

         public Builder setBuffLv(int value) {
            this.bitField0_ |= 8;
            this.buffLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffLv() {
            this.bitField0_ &= -9;
            this.buffLv_ = 0;
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

   public static final class C2S_WarStrongholdList_9705 extends GeneratedMessageV3 implements C2S_WarStrongholdList_9705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SIZE_FIELD_NUMBER = 1;
      private int size_;
      private byte memoizedIsInitialized;
      private static final C2S_WarStrongholdList_9705 DEFAULT_INSTANCE = new C2S_WarStrongholdList_9705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarStrongholdList_9705> PARSER = new AbstractParser<C2S_WarStrongholdList_9705>() {
         public C2S_WarStrongholdList_9705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarStrongholdList_9705(input, extensionRegistry);
         }
      };

      private C2S_WarStrongholdList_9705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarStrongholdList_9705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarStrongholdList_9705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarStrongholdList_9705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.size_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarStrongholdList_9705.class, Builder.class);
      }

      public boolean hasSize() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSize() {
         return this.size_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.size_);
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
               size += CodedOutputStream.computeInt32Size(1, this.size_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarStrongholdList_9705)) {
            return super.equals(obj);
         } else {
            C2S_WarStrongholdList_9705 other = (C2S_WarStrongholdList_9705)obj;
            if (this.hasSize() != other.hasSize()) {
               return false;
            } else if (this.hasSize() && this.getSize() != other.getSize()) {
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
            if (this.hasSize()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSize();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarStrongholdList_9705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarStrongholdList_9705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(InputStream input) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarStrongholdList_9705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarStrongholdList_9705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarStrongholdList_9705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarStrongholdList_9705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarStrongholdList_9705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarStrongholdList_9705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarStrongholdList_9705> parser() {
         return PARSER;
      }

      public Parser<C2S_WarStrongholdList_9705> getParserForType() {
         return PARSER;
      }

      public C2S_WarStrongholdList_9705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarStrongholdList_9705OrBuilder {
         private int bitField0_;
         private int size_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarStrongholdList_9705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarStrongholdList_9705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.size_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarStrongholdList_9705_descriptor;
         }

         public C2S_WarStrongholdList_9705 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarStrongholdList_9705.getDefaultInstance();
         }

         public C2S_WarStrongholdList_9705 build() {
            C2S_WarStrongholdList_9705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarStrongholdList_9705 buildPartial() {
            C2S_WarStrongholdList_9705 result = new C2S_WarStrongholdList_9705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.size_ = this.size_;
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
            if (other instanceof C2S_WarStrongholdList_9705) {
               return this.mergeFrom((C2S_WarStrongholdList_9705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarStrongholdList_9705 other) {
            if (other == UnionWarMsg.C2S_WarStrongholdList_9705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSize()) {
                  this.setSize(other.getSize());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSize();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarStrongholdList_9705 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarStrongholdList_9705)UnionWarMsg.C2S_WarStrongholdList_9705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarStrongholdList_9705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSize() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSize() {
            return this.size_;
         }

         public Builder setSize(int value) {
            this.bitField0_ |= 1;
            this.size_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSize() {
            this.bitField0_ &= -2;
            this.size_ = 0;
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

   public static final class S2C_WarStrongholdList_9706 extends GeneratedMessageV3 implements S2C_WarStrongholdList_9706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SIZE_FIELD_NUMBER = 1;
      private int size_;
      public static final int INFOLIST_FIELD_NUMBER = 2;
      private List<WarStrongholdData> infoList_;
      private byte memoizedIsInitialized;
      private static final S2C_WarStrongholdList_9706 DEFAULT_INSTANCE = new S2C_WarStrongholdList_9706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarStrongholdList_9706> PARSER = new AbstractParser<S2C_WarStrongholdList_9706>() {
         public S2C_WarStrongholdList_9706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarStrongholdList_9706(input, extensionRegistry);
         }
      };

      private S2C_WarStrongholdList_9706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarStrongholdList_9706() {
         this.memoizedIsInitialized = -1;
         this.infoList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarStrongholdList_9706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarStrongholdList_9706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.size_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infoList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infoList_.add(input.readMessage(UnionWarMsg.WarStrongholdData.PARSER, extensionRegistry));
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
                  this.infoList_ = Collections.unmodifiableList(this.infoList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarStrongholdList_9706.class, Builder.class);
      }

      public boolean hasSize() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSize() {
         return this.size_;
      }

      public List<WarStrongholdData> getInfoListList() {
         return this.infoList_;
      }

      public List<? extends WarStrongholdDataOrBuilder> getInfoListOrBuilderList() {
         return this.infoList_;
      }

      public int getInfoListCount() {
         return this.infoList_.size();
      }

      public WarStrongholdData getInfoList(int index) {
         return (WarStrongholdData)this.infoList_.get(index);
      }

      public WarStrongholdDataOrBuilder getInfoListOrBuilder(int index) {
         return (WarStrongholdDataOrBuilder)this.infoList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfoListCount(); ++i) {
               if (!this.getInfoList(i).isInitialized()) {
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
            output.writeInt32(1, this.size_);
         }

         for(int i = 0; i < this.infoList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infoList_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.size_);
            }

            for(int i = 0; i < this.infoList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infoList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarStrongholdList_9706)) {
            return super.equals(obj);
         } else {
            S2C_WarStrongholdList_9706 other = (S2C_WarStrongholdList_9706)obj;
            if (this.hasSize() != other.hasSize()) {
               return false;
            } else if (this.hasSize() && this.getSize() != other.getSize()) {
               return false;
            } else if (!this.getInfoListList().equals(other.getInfoListList())) {
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
            if (this.hasSize()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSize();
            }

            if (this.getInfoListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarStrongholdList_9706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdList_9706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(InputStream input) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarStrongholdList_9706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdList_9706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdList_9706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdList_9706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarStrongholdList_9706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarStrongholdList_9706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarStrongholdList_9706> parser() {
         return PARSER;
      }

      public Parser<S2C_WarStrongholdList_9706> getParserForType() {
         return PARSER;
      }

      public S2C_WarStrongholdList_9706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarStrongholdList_9706OrBuilder {
         private int bitField0_;
         private int size_;
         private List<WarStrongholdData> infoList_;
         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> infoListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarStrongholdList_9706.class, Builder.class);
         }

         private Builder() {
            this.infoList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infoList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarStrongholdList_9706.alwaysUseFieldBuilders) {
               this.getInfoListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.size_ = 0;
            this.bitField0_ &= -2;
            if (this.infoListBuilder_ == null) {
               this.infoList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infoListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdList_9706_descriptor;
         }

         public S2C_WarStrongholdList_9706 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarStrongholdList_9706.getDefaultInstance();
         }

         public S2C_WarStrongholdList_9706 build() {
            S2C_WarStrongholdList_9706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarStrongholdList_9706 buildPartial() {
            S2C_WarStrongholdList_9706 result = new S2C_WarStrongholdList_9706(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.size_ = this.size_;
               to_bitField0_ |= 1;
            }

            if (this.infoListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infoList_ = Collections.unmodifiableList(this.infoList_);
                  this.bitField0_ &= -3;
               }

               result.infoList_ = this.infoList_;
            } else {
               result.infoList_ = this.infoListBuilder_.build();
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
            if (other instanceof S2C_WarStrongholdList_9706) {
               return this.mergeFrom((S2C_WarStrongholdList_9706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarStrongholdList_9706 other) {
            if (other == UnionWarMsg.S2C_WarStrongholdList_9706.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSize()) {
                  this.setSize(other.getSize());
               }

               if (this.infoListBuilder_ == null) {
                  if (!other.infoList_.isEmpty()) {
                     if (this.infoList_.isEmpty()) {
                        this.infoList_ = other.infoList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureInfoListIsMutable();
                        this.infoList_.addAll(other.infoList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infoList_.isEmpty()) {
                  if (this.infoListBuilder_.isEmpty()) {
                     this.infoListBuilder_.dispose();
                     this.infoListBuilder_ = null;
                     this.infoList_ = other.infoList_;
                     this.bitField0_ &= -3;
                     this.infoListBuilder_ = UnionWarMsg.S2C_WarStrongholdList_9706.alwaysUseFieldBuilders ? this.getInfoListFieldBuilder() : null;
                  } else {
                     this.infoListBuilder_.addAllMessages(other.infoList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSize()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoListCount(); ++i) {
                  if (!this.getInfoList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarStrongholdList_9706 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarStrongholdList_9706)UnionWarMsg.S2C_WarStrongholdList_9706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarStrongholdList_9706)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSize() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSize() {
            return this.size_;
         }

         public Builder setSize(int value) {
            this.bitField0_ |= 1;
            this.size_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSize() {
            this.bitField0_ &= -2;
            this.size_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infoList_ = new ArrayList(this.infoList_);
               this.bitField0_ |= 2;
            }

         }

         public List<WarStrongholdData> getInfoListList() {
            return this.infoListBuilder_ == null ? Collections.unmodifiableList(this.infoList_) : this.infoListBuilder_.getMessageList();
         }

         public int getInfoListCount() {
            return this.infoListBuilder_ == null ? this.infoList_.size() : this.infoListBuilder_.getCount();
         }

         public WarStrongholdData getInfoList(int index) {
            return this.infoListBuilder_ == null ? (WarStrongholdData)this.infoList_.get(index) : (WarStrongholdData)this.infoListBuilder_.getMessage(index);
         }

         public Builder setInfoList(int index, WarStrongholdData value) {
            if (this.infoListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoListIsMutable();
               this.infoList_.set(index, value);
               this.onChanged();
            } else {
               this.infoListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfoList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.infoListBuilder_ == null) {
               this.ensureInfoListIsMutable();
               this.infoList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfoList(WarStrongholdData value) {
            if (this.infoListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoListIsMutable();
               this.infoList_.add(value);
               this.onChanged();
            } else {
               this.infoListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfoList(int index, WarStrongholdData value) {
            if (this.infoListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoListIsMutable();
               this.infoList_.add(index, value);
               this.onChanged();
            } else {
               this.infoListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfoList(WarStrongholdData.Builder builderForValue) {
            if (this.infoListBuilder_ == null) {
               this.ensureInfoListIsMutable();
               this.infoList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfoList(int index, WarStrongholdData.Builder builderForValue) {
            if (this.infoListBuilder_ == null) {
               this.ensureInfoListIsMutable();
               this.infoList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfoList(Iterable<? extends WarStrongholdData> values) {
            if (this.infoListBuilder_ == null) {
               this.ensureInfoListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infoList_);
               this.onChanged();
            } else {
               this.infoListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfoList() {
            if (this.infoListBuilder_ == null) {
               this.infoList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.infoListBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfoList(int index) {
            if (this.infoListBuilder_ == null) {
               this.ensureInfoListIsMutable();
               this.infoList_.remove(index);
               this.onChanged();
            } else {
               this.infoListBuilder_.remove(index);
            }

            return this;
         }

         public WarStrongholdData.Builder getInfoListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getInfoListFieldBuilder().getBuilder(index);
         }

         public WarStrongholdDataOrBuilder getInfoListOrBuilder(int index) {
            return this.infoListBuilder_ == null ? (WarStrongholdDataOrBuilder)this.infoList_.get(index) : (WarStrongholdDataOrBuilder)this.infoListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarStrongholdDataOrBuilder> getInfoListOrBuilderList() {
            return this.infoListBuilder_ != null ? this.infoListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infoList_);
         }

         public WarStrongholdData.Builder addInfoListBuilder() {
            return (WarStrongholdData.Builder)this.getInfoListFieldBuilder().addBuilder(UnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public WarStrongholdData.Builder addInfoListBuilder(int index) {
            return (WarStrongholdData.Builder)this.getInfoListFieldBuilder().addBuilder(index, UnionWarMsg.WarStrongholdData.getDefaultInstance());
         }

         public List<WarStrongholdData.Builder> getInfoListBuilderList() {
            return this.getInfoListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> getInfoListFieldBuilder() {
            if (this.infoListBuilder_ == null) {
               this.infoListBuilder_ = new RepeatedFieldBuilderV3(this.infoList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.infoList_ = null;
            }

            return this.infoListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarAttackLogs_9707 extends GeneratedMessageV3 implements C2S_WarAttackLogs_9707OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarAttackLogs_9707 DEFAULT_INSTANCE = new C2S_WarAttackLogs_9707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarAttackLogs_9707> PARSER = new AbstractParser<C2S_WarAttackLogs_9707>() {
         public C2S_WarAttackLogs_9707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarAttackLogs_9707(input, extensionRegistry);
         }
      };

      private C2S_WarAttackLogs_9707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarAttackLogs_9707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarAttackLogs_9707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarAttackLogs_9707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarAttackLogs_9707.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarAttackLogs_9707)) {
            return super.equals(obj);
         } else {
            C2S_WarAttackLogs_9707 other = (C2S_WarAttackLogs_9707)obj;
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

      public static C2S_WarAttackLogs_9707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarAttackLogs_9707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(InputStream input) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarAttackLogs_9707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarAttackLogs_9707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarAttackLogs_9707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarAttackLogs_9707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarAttackLogs_9707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarAttackLogs_9707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarAttackLogs_9707> parser() {
         return PARSER;
      }

      public Parser<C2S_WarAttackLogs_9707> getParserForType() {
         return PARSER;
      }

      public C2S_WarAttackLogs_9707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarAttackLogs_9707OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarAttackLogs_9707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarAttackLogs_9707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarAttackLogs_9707_descriptor;
         }

         public C2S_WarAttackLogs_9707 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarAttackLogs_9707.getDefaultInstance();
         }

         public C2S_WarAttackLogs_9707 build() {
            C2S_WarAttackLogs_9707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarAttackLogs_9707 buildPartial() {
            C2S_WarAttackLogs_9707 result = new C2S_WarAttackLogs_9707(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarAttackLogs_9707) {
               return this.mergeFrom((C2S_WarAttackLogs_9707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarAttackLogs_9707 other) {
            if (other == UnionWarMsg.C2S_WarAttackLogs_9707.getDefaultInstance()) {
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
            C2S_WarAttackLogs_9707 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarAttackLogs_9707)UnionWarMsg.C2S_WarAttackLogs_9707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarAttackLogs_9707)e.getUnfinishedMessage();
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

   public static final class S2C_WarAttackLogs_9708 extends GeneratedMessageV3 implements S2C_WarAttackLogs_9708OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int LOGS_FIELD_NUMBER = 1;
      private List<WarAttackLogData> logs_;
      private byte memoizedIsInitialized;
      private static final S2C_WarAttackLogs_9708 DEFAULT_INSTANCE = new S2C_WarAttackLogs_9708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarAttackLogs_9708> PARSER = new AbstractParser<S2C_WarAttackLogs_9708>() {
         public S2C_WarAttackLogs_9708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarAttackLogs_9708(input, extensionRegistry);
         }
      };

      private S2C_WarAttackLogs_9708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarAttackLogs_9708() {
         this.memoizedIsInitialized = -1;
         this.logs_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarAttackLogs_9708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarAttackLogs_9708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.logs_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.logs_.add(input.readMessage(UnionWarMsg.WarAttackLogData.PARSER, extensionRegistry));
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
                  this.logs_ = Collections.unmodifiableList(this.logs_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarAttackLogs_9708.class, Builder.class);
      }

      public List<WarAttackLogData> getLogsList() {
         return this.logs_;
      }

      public List<? extends WarAttackLogDataOrBuilder> getLogsOrBuilderList() {
         return this.logs_;
      }

      public int getLogsCount() {
         return this.logs_.size();
      }

      public WarAttackLogData getLogs(int index) {
         return (WarAttackLogData)this.logs_.get(index);
      }

      public WarAttackLogDataOrBuilder getLogsOrBuilder(int index) {
         return (WarAttackLogDataOrBuilder)this.logs_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getLogsCount(); ++i) {
               if (!this.getLogs(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.logs_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.logs_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.logs_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.logs_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarAttackLogs_9708)) {
            return super.equals(obj);
         } else {
            S2C_WarAttackLogs_9708 other = (S2C_WarAttackLogs_9708)obj;
            if (!this.getLogsList().equals(other.getLogsList())) {
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
            if (this.getLogsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLogsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarAttackLogs_9708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarAttackLogs_9708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(InputStream input) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarAttackLogs_9708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarAttackLogs_9708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarAttackLogs_9708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarAttackLogs_9708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarAttackLogs_9708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarAttackLogs_9708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarAttackLogs_9708> parser() {
         return PARSER;
      }

      public Parser<S2C_WarAttackLogs_9708> getParserForType() {
         return PARSER;
      }

      public S2C_WarAttackLogs_9708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarAttackLogs_9708OrBuilder {
         private int bitField0_;
         private List<WarAttackLogData> logs_;
         private RepeatedFieldBuilderV3<WarAttackLogData, WarAttackLogData.Builder, WarAttackLogDataOrBuilder> logsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarAttackLogs_9708.class, Builder.class);
         }

         private Builder() {
            this.logs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.logs_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarAttackLogs_9708.alwaysUseFieldBuilders) {
               this.getLogsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.logsBuilder_ == null) {
               this.logs_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.logsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarAttackLogs_9708_descriptor;
         }

         public S2C_WarAttackLogs_9708 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarAttackLogs_9708.getDefaultInstance();
         }

         public S2C_WarAttackLogs_9708 build() {
            S2C_WarAttackLogs_9708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarAttackLogs_9708 buildPartial() {
            S2C_WarAttackLogs_9708 result = new S2C_WarAttackLogs_9708(this);
            int from_bitField0_ = this.bitField0_;
            if (this.logsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.logs_ = Collections.unmodifiableList(this.logs_);
                  this.bitField0_ &= -2;
               }

               result.logs_ = this.logs_;
            } else {
               result.logs_ = this.logsBuilder_.build();
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
            if (other instanceof S2C_WarAttackLogs_9708) {
               return this.mergeFrom((S2C_WarAttackLogs_9708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarAttackLogs_9708 other) {
            if (other == UnionWarMsg.S2C_WarAttackLogs_9708.getDefaultInstance()) {
               return this;
            } else {
               if (this.logsBuilder_ == null) {
                  if (!other.logs_.isEmpty()) {
                     if (this.logs_.isEmpty()) {
                        this.logs_ = other.logs_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureLogsIsMutable();
                        this.logs_.addAll(other.logs_);
                     }

                     this.onChanged();
                  }
               } else if (!other.logs_.isEmpty()) {
                  if (this.logsBuilder_.isEmpty()) {
                     this.logsBuilder_.dispose();
                     this.logsBuilder_ = null;
                     this.logs_ = other.logs_;
                     this.bitField0_ &= -2;
                     this.logsBuilder_ = UnionWarMsg.S2C_WarAttackLogs_9708.alwaysUseFieldBuilders ? this.getLogsFieldBuilder() : null;
                  } else {
                     this.logsBuilder_.addAllMessages(other.logs_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getLogsCount(); ++i) {
               if (!this.getLogs(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarAttackLogs_9708 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarAttackLogs_9708)UnionWarMsg.S2C_WarAttackLogs_9708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarAttackLogs_9708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureLogsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.logs_ = new ArrayList(this.logs_);
               this.bitField0_ |= 1;
            }

         }

         public List<WarAttackLogData> getLogsList() {
            return this.logsBuilder_ == null ? Collections.unmodifiableList(this.logs_) : this.logsBuilder_.getMessageList();
         }

         public int getLogsCount() {
            return this.logsBuilder_ == null ? this.logs_.size() : this.logsBuilder_.getCount();
         }

         public WarAttackLogData getLogs(int index) {
            return this.logsBuilder_ == null ? (WarAttackLogData)this.logs_.get(index) : (WarAttackLogData)this.logsBuilder_.getMessage(index);
         }

         public Builder setLogs(int index, WarAttackLogData value) {
            if (this.logsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogsIsMutable();
               this.logs_.set(index, value);
               this.onChanged();
            } else {
               this.logsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLogs(int index, WarAttackLogData.Builder builderForValue) {
            if (this.logsBuilder_ == null) {
               this.ensureLogsIsMutable();
               this.logs_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.logsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLogs(WarAttackLogData value) {
            if (this.logsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogsIsMutable();
               this.logs_.add(value);
               this.onChanged();
            } else {
               this.logsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLogs(int index, WarAttackLogData value) {
            if (this.logsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogsIsMutable();
               this.logs_.add(index, value);
               this.onChanged();
            } else {
               this.logsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLogs(WarAttackLogData.Builder builderForValue) {
            if (this.logsBuilder_ == null) {
               this.ensureLogsIsMutable();
               this.logs_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.logsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLogs(int index, WarAttackLogData.Builder builderForValue) {
            if (this.logsBuilder_ == null) {
               this.ensureLogsIsMutable();
               this.logs_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.logsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLogs(Iterable<? extends WarAttackLogData> values) {
            if (this.logsBuilder_ == null) {
               this.ensureLogsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.logs_);
               this.onChanged();
            } else {
               this.logsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLogs() {
            if (this.logsBuilder_ == null) {
               this.logs_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.logsBuilder_.clear();
            }

            return this;
         }

         public Builder removeLogs(int index) {
            if (this.logsBuilder_ == null) {
               this.ensureLogsIsMutable();
               this.logs_.remove(index);
               this.onChanged();
            } else {
               this.logsBuilder_.remove(index);
            }

            return this;
         }

         public WarAttackLogData.Builder getLogsBuilder(int index) {
            return (WarAttackLogData.Builder)this.getLogsFieldBuilder().getBuilder(index);
         }

         public WarAttackLogDataOrBuilder getLogsOrBuilder(int index) {
            return this.logsBuilder_ == null ? (WarAttackLogDataOrBuilder)this.logs_.get(index) : (WarAttackLogDataOrBuilder)this.logsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarAttackLogDataOrBuilder> getLogsOrBuilderList() {
            return this.logsBuilder_ != null ? this.logsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.logs_);
         }

         public WarAttackLogData.Builder addLogsBuilder() {
            return (WarAttackLogData.Builder)this.getLogsFieldBuilder().addBuilder(UnionWarMsg.WarAttackLogData.getDefaultInstance());
         }

         public WarAttackLogData.Builder addLogsBuilder(int index) {
            return (WarAttackLogData.Builder)this.getLogsFieldBuilder().addBuilder(index, UnionWarMsg.WarAttackLogData.getDefaultInstance());
         }

         public List<WarAttackLogData.Builder> getLogsBuilderList() {
            return this.getLogsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarAttackLogData, WarAttackLogData.Builder, WarAttackLogDataOrBuilder> getLogsFieldBuilder() {
            if (this.logsBuilder_ == null) {
               this.logsBuilder_ = new RepeatedFieldBuilderV3(this.logs_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.logs_ = null;
            }

            return this.logsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarBox_9709 extends GeneratedMessageV3 implements C2S_WarBox_9709OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarBox_9709 DEFAULT_INSTANCE = new C2S_WarBox_9709();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBox_9709> PARSER = new AbstractParser<C2S_WarBox_9709>() {
         public C2S_WarBox_9709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBox_9709(input, extensionRegistry);
         }
      };

      private C2S_WarBox_9709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBox_9709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBox_9709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBox_9709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBox_9709.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarBox_9709)) {
            return super.equals(obj);
         } else {
            C2S_WarBox_9709 other = (C2S_WarBox_9709)obj;
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

      public static C2S_WarBox_9709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data);
      }

      public static C2S_WarBox_9709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBox_9709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data);
      }

      public static C2S_WarBox_9709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBox_9709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data);
      }

      public static C2S_WarBox_9709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBox_9709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBox_9709 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBox_9709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBox_9709 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBox_9709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBox_9709 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBox_9709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBox_9709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBox_9709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBox_9709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBox_9709> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBox_9709> getParserForType() {
         return PARSER;
      }

      public C2S_WarBox_9709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBox_9709OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBox_9709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBox_9709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBox_9709_descriptor;
         }

         public C2S_WarBox_9709 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBox_9709.getDefaultInstance();
         }

         public C2S_WarBox_9709 build() {
            C2S_WarBox_9709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBox_9709 buildPartial() {
            C2S_WarBox_9709 result = new C2S_WarBox_9709(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarBox_9709) {
               return this.mergeFrom((C2S_WarBox_9709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBox_9709 other) {
            if (other == UnionWarMsg.C2S_WarBox_9709.getDefaultInstance()) {
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
            C2S_WarBox_9709 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBox_9709)UnionWarMsg.C2S_WarBox_9709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBox_9709)e.getUnfinishedMessage();
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

   public static final class S2C_WarBox_9710 extends GeneratedMessageV3 implements S2C_WarBox_9710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXSIZE_FIELD_NUMBER = 1;
      private int boxSize_;
      public static final int BOXID_FIELD_NUMBER = 2;
      private int boxId_;
      public static final int BOXES_FIELD_NUMBER = 3;
      private List<WarBoxData> boxes_;
      public static final int ENDTIME_FIELD_NUMBER = 4;
      private int endTime_;
      public static final int ACTIVEMEMBER_FIELD_NUMBER = 5;
      private Internal.IntList activeMember_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBox_9710 DEFAULT_INSTANCE = new S2C_WarBox_9710();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBox_9710> PARSER = new AbstractParser<S2C_WarBox_9710>() {
         public S2C_WarBox_9710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBox_9710(input, extensionRegistry);
         }
      };

      private S2C_WarBox_9710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBox_9710() {
         this.memoizedIsInitialized = -1;
         this.boxes_ = Collections.emptyList();
         this.activeMember_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBox_9710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBox_9710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.boxSize_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxId_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.boxes_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.boxes_.add(input.readMessage(UnionWarMsg.WarBoxData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.activeMember_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.activeMember_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.activeMember_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.activeMember_.addInt(input.readInt32());
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
                  this.boxes_ = Collections.unmodifiableList(this.boxes_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.activeMember_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBox_9710.class, Builder.class);
      }

      public boolean hasBoxSize() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBoxSize() {
         return this.boxSize_;
      }

      public boolean hasBoxId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxId() {
         return this.boxId_;
      }

      public List<WarBoxData> getBoxesList() {
         return this.boxes_;
      }

      public List<? extends WarBoxDataOrBuilder> getBoxesOrBuilderList() {
         return this.boxes_;
      }

      public int getBoxesCount() {
         return this.boxes_.size();
      }

      public WarBoxData getBoxes(int index) {
         return (WarBoxData)this.boxes_.get(index);
      }

      public WarBoxDataOrBuilder getBoxesOrBuilder(int index) {
         return (WarBoxDataOrBuilder)this.boxes_.get(index);
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<Integer> getActiveMemberList() {
         return this.activeMember_;
      }

      public int getActiveMemberCount() {
         return this.activeMember_.size();
      }

      public int getActiveMember(int index) {
         return this.activeMember_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBoxSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getBoxesCount(); ++i) {
               if (!this.getBoxes(i).isInitialized()) {
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
            output.writeInt32(1, this.boxSize_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxId_);
         }

         for(int i = 0; i < this.boxes_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.boxes_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.endTime_);
         }

         for(int i = 0; i < this.activeMember_.size(); ++i) {
            output.writeInt32(5, this.activeMember_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.boxSize_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxId_);
            }

            for(int i = 0; i < this.boxes_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.boxes_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.endTime_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.activeMember_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.activeMember_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getActiveMemberList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBox_9710)) {
            return super.equals(obj);
         } else {
            S2C_WarBox_9710 other = (S2C_WarBox_9710)obj;
            if (this.hasBoxSize() != other.hasBoxSize()) {
               return false;
            } else if (this.hasBoxSize() && this.getBoxSize() != other.getBoxSize()) {
               return false;
            } else if (this.hasBoxId() != other.hasBoxId()) {
               return false;
            } else if (this.hasBoxId() && this.getBoxId() != other.getBoxId()) {
               return false;
            } else if (!this.getBoxesList().equals(other.getBoxesList())) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getActiveMemberList().equals(other.getActiveMemberList())) {
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
            if (this.hasBoxSize()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxSize();
            }

            if (this.hasBoxId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxId();
            }

            if (this.getBoxesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBoxesList().hashCode();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getActiveMemberCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getActiveMemberList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBox_9710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data);
      }

      public static S2C_WarBox_9710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBox_9710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data);
      }

      public static S2C_WarBox_9710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBox_9710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data);
      }

      public static S2C_WarBox_9710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBox_9710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBox_9710 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBox_9710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBox_9710 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBox_9710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBox_9710 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBox_9710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBox_9710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBox_9710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBox_9710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBox_9710> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBox_9710> getParserForType() {
         return PARSER;
      }

      public S2C_WarBox_9710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBox_9710OrBuilder {
         private int bitField0_;
         private int boxSize_;
         private int boxId_;
         private List<WarBoxData> boxes_;
         private RepeatedFieldBuilderV3<WarBoxData, WarBoxData.Builder, WarBoxDataOrBuilder> boxesBuilder_;
         private int endTime_;
         private Internal.IntList activeMember_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBox_9710.class, Builder.class);
         }

         private Builder() {
            this.boxes_ = Collections.emptyList();
            this.activeMember_ = UnionWarMsg.S2C_WarBox_9710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.boxes_ = Collections.emptyList();
            this.activeMember_ = UnionWarMsg.S2C_WarBox_9710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBox_9710.alwaysUseFieldBuilders) {
               this.getBoxesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.boxSize_ = 0;
            this.bitField0_ &= -2;
            this.boxId_ = 0;
            this.bitField0_ &= -3;
            if (this.boxesBuilder_ == null) {
               this.boxes_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.boxesBuilder_.clear();
            }

            this.endTime_ = 0;
            this.bitField0_ &= -9;
            this.activeMember_ = UnionWarMsg.S2C_WarBox_9710.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBox_9710_descriptor;
         }

         public S2C_WarBox_9710 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBox_9710.getDefaultInstance();
         }

         public S2C_WarBox_9710 build() {
            S2C_WarBox_9710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBox_9710 buildPartial() {
            S2C_WarBox_9710 result = new S2C_WarBox_9710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.boxSize_ = this.boxSize_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxId_ = this.boxId_;
               to_bitField0_ |= 2;
            }

            if (this.boxesBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.boxes_ = Collections.unmodifiableList(this.boxes_);
                  this.bitField0_ &= -5;
               }

               result.boxes_ = this.boxes_;
            } else {
               result.boxes_ = this.boxesBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.activeMember_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.activeMember_ = this.activeMember_;
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
            if (other instanceof S2C_WarBox_9710) {
               return this.mergeFrom((S2C_WarBox_9710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBox_9710 other) {
            if (other == UnionWarMsg.S2C_WarBox_9710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBoxSize()) {
                  this.setBoxSize(other.getBoxSize());
               }

               if (other.hasBoxId()) {
                  this.setBoxId(other.getBoxId());
               }

               if (this.boxesBuilder_ == null) {
                  if (!other.boxes_.isEmpty()) {
                     if (this.boxes_.isEmpty()) {
                        this.boxes_ = other.boxes_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureBoxesIsMutable();
                        this.boxes_.addAll(other.boxes_);
                     }

                     this.onChanged();
                  }
               } else if (!other.boxes_.isEmpty()) {
                  if (this.boxesBuilder_.isEmpty()) {
                     this.boxesBuilder_.dispose();
                     this.boxesBuilder_ = null;
                     this.boxes_ = other.boxes_;
                     this.bitField0_ &= -5;
                     this.boxesBuilder_ = UnionWarMsg.S2C_WarBox_9710.alwaysUseFieldBuilders ? this.getBoxesFieldBuilder() : null;
                  } else {
                     this.boxesBuilder_.addAllMessages(other.boxes_);
                  }
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (!other.activeMember_.isEmpty()) {
                  if (this.activeMember_.isEmpty()) {
                     this.activeMember_ = other.activeMember_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureActiveMemberIsMutable();
                     this.activeMember_.addAll(other.activeMember_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBoxSize()) {
               return false;
            } else if (!this.hasBoxId()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getBoxesCount(); ++i) {
                  if (!this.getBoxes(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBox_9710 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBox_9710)UnionWarMsg.S2C_WarBox_9710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBox_9710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBoxSize() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBoxSize() {
            return this.boxSize_;
         }

         public Builder setBoxSize(int value) {
            this.bitField0_ |= 1;
            this.boxSize_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxSize() {
            this.bitField0_ &= -2;
            this.boxSize_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxId() {
            return this.boxId_;
         }

         public Builder setBoxId(int value) {
            this.bitField0_ |= 2;
            this.boxId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.bitField0_ &= -3;
            this.boxId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBoxesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.boxes_ = new ArrayList(this.boxes_);
               this.bitField0_ |= 4;
            }

         }

         public List<WarBoxData> getBoxesList() {
            return this.boxesBuilder_ == null ? Collections.unmodifiableList(this.boxes_) : this.boxesBuilder_.getMessageList();
         }

         public int getBoxesCount() {
            return this.boxesBuilder_ == null ? this.boxes_.size() : this.boxesBuilder_.getCount();
         }

         public WarBoxData getBoxes(int index) {
            return this.boxesBuilder_ == null ? (WarBoxData)this.boxes_.get(index) : (WarBoxData)this.boxesBuilder_.getMessage(index);
         }

         public Builder setBoxes(int index, WarBoxData value) {
            if (this.boxesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxesIsMutable();
               this.boxes_.set(index, value);
               this.onChanged();
            } else {
               this.boxesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBoxes(int index, WarBoxData.Builder builderForValue) {
            if (this.boxesBuilder_ == null) {
               this.ensureBoxesIsMutable();
               this.boxes_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBoxes(WarBoxData value) {
            if (this.boxesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxesIsMutable();
               this.boxes_.add(value);
               this.onChanged();
            } else {
               this.boxesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBoxes(int index, WarBoxData value) {
            if (this.boxesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBoxesIsMutable();
               this.boxes_.add(index, value);
               this.onChanged();
            } else {
               this.boxesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBoxes(WarBoxData.Builder builderForValue) {
            if (this.boxesBuilder_ == null) {
               this.ensureBoxesIsMutable();
               this.boxes_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.boxesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBoxes(int index, WarBoxData.Builder builderForValue) {
            if (this.boxesBuilder_ == null) {
               this.ensureBoxesIsMutable();
               this.boxes_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.boxesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBoxes(Iterable<? extends WarBoxData> values) {
            if (this.boxesBuilder_ == null) {
               this.ensureBoxesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.boxes_);
               this.onChanged();
            } else {
               this.boxesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBoxes() {
            if (this.boxesBuilder_ == null) {
               this.boxes_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.boxesBuilder_.clear();
            }

            return this;
         }

         public Builder removeBoxes(int index) {
            if (this.boxesBuilder_ == null) {
               this.ensureBoxesIsMutable();
               this.boxes_.remove(index);
               this.onChanged();
            } else {
               this.boxesBuilder_.remove(index);
            }

            return this;
         }

         public WarBoxData.Builder getBoxesBuilder(int index) {
            return (WarBoxData.Builder)this.getBoxesFieldBuilder().getBuilder(index);
         }

         public WarBoxDataOrBuilder getBoxesOrBuilder(int index) {
            return this.boxesBuilder_ == null ? (WarBoxDataOrBuilder)this.boxes_.get(index) : (WarBoxDataOrBuilder)this.boxesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarBoxDataOrBuilder> getBoxesOrBuilderList() {
            return this.boxesBuilder_ != null ? this.boxesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.boxes_);
         }

         public WarBoxData.Builder addBoxesBuilder() {
            return (WarBoxData.Builder)this.getBoxesFieldBuilder().addBuilder(UnionWarMsg.WarBoxData.getDefaultInstance());
         }

         public WarBoxData.Builder addBoxesBuilder(int index) {
            return (WarBoxData.Builder)this.getBoxesFieldBuilder().addBuilder(index, UnionWarMsg.WarBoxData.getDefaultInstance());
         }

         public List<WarBoxData.Builder> getBoxesBuilderList() {
            return this.getBoxesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarBoxData, WarBoxData.Builder, WarBoxDataOrBuilder> getBoxesFieldBuilder() {
            if (this.boxesBuilder_ == null) {
               this.boxesBuilder_ = new RepeatedFieldBuilderV3(this.boxes_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.boxes_ = null;
            }

            return this.boxesBuilder_;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 8;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -9;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureActiveMemberIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.activeMember_ = UnionWarMsg.S2C_WarBox_9710.mutableCopy(this.activeMember_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getActiveMemberList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.activeMember_) : this.activeMember_);
         }

         public int getActiveMemberCount() {
            return this.activeMember_.size();
         }

         public int getActiveMember(int index) {
            return this.activeMember_.getInt(index);
         }

         public Builder setActiveMember(int index, int value) {
            this.ensureActiveMemberIsMutable();
            this.activeMember_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addActiveMember(int value) {
            this.ensureActiveMemberIsMutable();
            this.activeMember_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllActiveMember(Iterable<? extends Integer> values) {
            this.ensureActiveMemberIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activeMember_);
            this.onChanged();
            return this;
         }

         public Builder clearActiveMember() {
            this.activeMember_ = UnionWarMsg.S2C_WarBox_9710.emptyIntList();
            this.bitField0_ &= -17;
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

   public static final class C2S_WarGetBox_9711 extends GeneratedMessageV3 implements C2S_WarGetBox_9711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXPOSITION_FIELD_NUMBER = 1;
      private int boxPosition_;
      private byte memoizedIsInitialized;
      private static final C2S_WarGetBox_9711 DEFAULT_INSTANCE = new C2S_WarGetBox_9711();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarGetBox_9711> PARSER = new AbstractParser<C2S_WarGetBox_9711>() {
         public C2S_WarGetBox_9711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarGetBox_9711(input, extensionRegistry);
         }
      };

      private C2S_WarGetBox_9711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarGetBox_9711() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarGetBox_9711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarGetBox_9711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.boxPosition_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarGetBox_9711.class, Builder.class);
      }

      public boolean hasBoxPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBoxPosition() {
         return this.boxPosition_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBoxPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.boxPosition_);
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
               size += CodedOutputStream.computeInt32Size(1, this.boxPosition_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarGetBox_9711)) {
            return super.equals(obj);
         } else {
            C2S_WarGetBox_9711 other = (C2S_WarGetBox_9711)obj;
            if (this.hasBoxPosition() != other.hasBoxPosition()) {
               return false;
            } else if (this.hasBoxPosition() && this.getBoxPosition() != other.getBoxPosition()) {
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
            if (this.hasBoxPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarGetBox_9711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data);
      }

      public static C2S_WarGetBox_9711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarGetBox_9711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data);
      }

      public static C2S_WarGetBox_9711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarGetBox_9711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data);
      }

      public static C2S_WarGetBox_9711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarGetBox_9711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarGetBox_9711 parseFrom(InputStream input) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarGetBox_9711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarGetBox_9711 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarGetBox_9711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarGetBox_9711 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarGetBox_9711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarGetBox_9711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarGetBox_9711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarGetBox_9711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarGetBox_9711> parser() {
         return PARSER;
      }

      public Parser<C2S_WarGetBox_9711> getParserForType() {
         return PARSER;
      }

      public C2S_WarGetBox_9711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarGetBox_9711OrBuilder {
         private int bitField0_;
         private int boxPosition_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarGetBox_9711.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarGetBox_9711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxPosition_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarGetBox_9711_descriptor;
         }

         public C2S_WarGetBox_9711 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarGetBox_9711.getDefaultInstance();
         }

         public C2S_WarGetBox_9711 build() {
            C2S_WarGetBox_9711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarGetBox_9711 buildPartial() {
            C2S_WarGetBox_9711 result = new C2S_WarGetBox_9711(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.boxPosition_ = this.boxPosition_;
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
            if (other instanceof C2S_WarGetBox_9711) {
               return this.mergeFrom((C2S_WarGetBox_9711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarGetBox_9711 other) {
            if (other == UnionWarMsg.C2S_WarGetBox_9711.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBoxPosition()) {
                  this.setBoxPosition(other.getBoxPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBoxPosition();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarGetBox_9711 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarGetBox_9711)UnionWarMsg.C2S_WarGetBox_9711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarGetBox_9711)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBoxPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBoxPosition() {
            return this.boxPosition_;
         }

         public Builder setBoxPosition(int value) {
            this.bitField0_ |= 1;
            this.boxPosition_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxPosition() {
            this.bitField0_ &= -2;
            this.boxPosition_ = 0;
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

   public static final class S2C_WarGetBox_9712 extends GeneratedMessageV3 implements S2C_WarGetBox_9712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOX_FIELD_NUMBER = 1;
      private WarBoxData box_;
      private byte memoizedIsInitialized;
      private static final S2C_WarGetBox_9712 DEFAULT_INSTANCE = new S2C_WarGetBox_9712();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarGetBox_9712> PARSER = new AbstractParser<S2C_WarGetBox_9712>() {
         public S2C_WarGetBox_9712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarGetBox_9712(input, extensionRegistry);
         }
      };

      private S2C_WarGetBox_9712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarGetBox_9712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarGetBox_9712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarGetBox_9712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WarBoxData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.box_.toBuilder();
                        }

                        this.box_ = (WarBoxData)input.readMessage(UnionWarMsg.WarBoxData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.box_);
                           this.box_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarGetBox_9712.class, Builder.class);
      }

      public boolean hasBox() {
         return (this.bitField0_ & 1) != 0;
      }

      public WarBoxData getBox() {
         return this.box_ == null ? UnionWarMsg.WarBoxData.getDefaultInstance() : this.box_;
      }

      public WarBoxDataOrBuilder getBoxOrBuilder() {
         return this.box_ == null ? UnionWarMsg.WarBoxData.getDefaultInstance() : this.box_;
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
         } else if (!this.getBox().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBox());
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
               size += CodedOutputStream.computeMessageSize(1, this.getBox());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarGetBox_9712)) {
            return super.equals(obj);
         } else {
            S2C_WarGetBox_9712 other = (S2C_WarGetBox_9712)obj;
            if (this.hasBox() != other.hasBox()) {
               return false;
            } else if (this.hasBox() && !this.getBox().equals(other.getBox())) {
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
               hash = 53 * hash + this.getBox().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarGetBox_9712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data);
      }

      public static S2C_WarGetBox_9712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarGetBox_9712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data);
      }

      public static S2C_WarGetBox_9712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarGetBox_9712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data);
      }

      public static S2C_WarGetBox_9712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarGetBox_9712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarGetBox_9712 parseFrom(InputStream input) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarGetBox_9712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarGetBox_9712 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarGetBox_9712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarGetBox_9712 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarGetBox_9712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarGetBox_9712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarGetBox_9712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarGetBox_9712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarGetBox_9712> parser() {
         return PARSER;
      }

      public Parser<S2C_WarGetBox_9712> getParserForType() {
         return PARSER;
      }

      public S2C_WarGetBox_9712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarGetBox_9712OrBuilder {
         private int bitField0_;
         private WarBoxData box_;
         private SingleFieldBuilderV3<WarBoxData, WarBoxData.Builder, WarBoxDataOrBuilder> boxBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarGetBox_9712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarGetBox_9712.alwaysUseFieldBuilders) {
               this.getBoxFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.boxBuilder_ == null) {
               this.box_ = null;
            } else {
               this.boxBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarGetBox_9712_descriptor;
         }

         public S2C_WarGetBox_9712 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarGetBox_9712.getDefaultInstance();
         }

         public S2C_WarGetBox_9712 build() {
            S2C_WarGetBox_9712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarGetBox_9712 buildPartial() {
            S2C_WarGetBox_9712 result = new S2C_WarGetBox_9712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.boxBuilder_ == null) {
                  result.box_ = this.box_;
               } else {
                  result.box_ = (WarBoxData)this.boxBuilder_.build();
               }

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
            if (other instanceof S2C_WarGetBox_9712) {
               return this.mergeFrom((S2C_WarGetBox_9712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarGetBox_9712 other) {
            if (other == UnionWarMsg.S2C_WarGetBox_9712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBox()) {
                  this.mergeBox(other.getBox());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBox()) {
               return false;
            } else {
               return this.getBox().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarGetBox_9712 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarGetBox_9712)UnionWarMsg.S2C_WarGetBox_9712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarGetBox_9712)e.getUnfinishedMessage();
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

         public WarBoxData getBox() {
            if (this.boxBuilder_ == null) {
               return this.box_ == null ? UnionWarMsg.WarBoxData.getDefaultInstance() : this.box_;
            } else {
               return (WarBoxData)this.boxBuilder_.getMessage();
            }
         }

         public Builder setBox(WarBoxData value) {
            if (this.boxBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.box_ = value;
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBox(WarBoxData.Builder builderForValue) {
            if (this.boxBuilder_ == null) {
               this.box_ = builderForValue.build();
               this.onChanged();
            } else {
               this.boxBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBox(WarBoxData value) {
            if (this.boxBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.box_ != null && this.box_ != UnionWarMsg.WarBoxData.getDefaultInstance()) {
                  this.box_ = UnionWarMsg.WarBoxData.newBuilder(this.box_).mergeFrom(value).buildPartial();
               } else {
                  this.box_ = value;
               }

               this.onChanged();
            } else {
               this.boxBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBox() {
            if (this.boxBuilder_ == null) {
               this.box_ = null;
               this.onChanged();
            } else {
               this.boxBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WarBoxData.Builder getBoxBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WarBoxData.Builder)this.getBoxFieldBuilder().getBuilder();
         }

         public WarBoxDataOrBuilder getBoxOrBuilder() {
            if (this.boxBuilder_ != null) {
               return (WarBoxDataOrBuilder)this.boxBuilder_.getMessageOrBuilder();
            } else {
               return this.box_ == null ? UnionWarMsg.WarBoxData.getDefaultInstance() : this.box_;
            }
         }

         private SingleFieldBuilderV3<WarBoxData, WarBoxData.Builder, WarBoxDataOrBuilder> getBoxFieldBuilder() {
            if (this.boxBuilder_ == null) {
               this.boxBuilder_ = new SingleFieldBuilderV3(this.getBox(), this.getParentForChildren(), this.isClean());
               this.box_ = null;
            }

            return this.boxBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarRankList_9713 extends GeneratedMessageV3 implements C2S_WarRankList_9713OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarRankList_9713 DEFAULT_INSTANCE = new C2S_WarRankList_9713();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarRankList_9713> PARSER = new AbstractParser<C2S_WarRankList_9713>() {
         public C2S_WarRankList_9713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarRankList_9713(input, extensionRegistry);
         }
      };

      private C2S_WarRankList_9713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarRankList_9713() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarRankList_9713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarRankList_9713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarRankList_9713.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarRankList_9713)) {
            return super.equals(obj);
         } else {
            C2S_WarRankList_9713 other = (C2S_WarRankList_9713)obj;
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

      public static C2S_WarRankList_9713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data);
      }

      public static C2S_WarRankList_9713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarRankList_9713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data);
      }

      public static C2S_WarRankList_9713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarRankList_9713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data);
      }

      public static C2S_WarRankList_9713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarRankList_9713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarRankList_9713 parseFrom(InputStream input) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarRankList_9713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarRankList_9713 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarRankList_9713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarRankList_9713 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarRankList_9713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarRankList_9713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarRankList_9713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarRankList_9713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarRankList_9713> parser() {
         return PARSER;
      }

      public Parser<C2S_WarRankList_9713> getParserForType() {
         return PARSER;
      }

      public C2S_WarRankList_9713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarRankList_9713OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarRankList_9713.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarRankList_9713.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarRankList_9713_descriptor;
         }

         public C2S_WarRankList_9713 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarRankList_9713.getDefaultInstance();
         }

         public C2S_WarRankList_9713 build() {
            C2S_WarRankList_9713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarRankList_9713 buildPartial() {
            C2S_WarRankList_9713 result = new C2S_WarRankList_9713(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarRankList_9713) {
               return this.mergeFrom((C2S_WarRankList_9713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarRankList_9713 other) {
            if (other == UnionWarMsg.C2S_WarRankList_9713.getDefaultInstance()) {
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
            C2S_WarRankList_9713 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarRankList_9713)UnionWarMsg.C2S_WarRankList_9713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarRankList_9713)e.getUnfinishedMessage();
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

   public static final class S2C_WarRankList_9714 extends GeneratedMessageV3 implements S2C_WarRankList_9714OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<WarRankData> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_WarRankList_9714 DEFAULT_INSTANCE = new S2C_WarRankList_9714();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarRankList_9714> PARSER = new AbstractParser<S2C_WarRankList_9714>() {
         public S2C_WarRankList_9714 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarRankList_9714(input, extensionRegistry);
         }
      };

      private S2C_WarRankList_9714(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarRankList_9714() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarRankList_9714();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarRankList_9714(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ranks_.add(input.readMessage(UnionWarMsg.WarRankData.PARSER, extensionRegistry));
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarRankList_9714.class, Builder.class);
      }

      public List<WarRankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends WarRankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public WarRankData getRanks(int index) {
         return (WarRankData)this.ranks_.get(index);
      }

      public WarRankDataOrBuilder getRanksOrBuilder(int index) {
         return (WarRankDataOrBuilder)this.ranks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarRankList_9714)) {
            return super.equals(obj);
         } else {
            S2C_WarRankList_9714 other = (S2C_WarRankList_9714)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarRankList_9714 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data);
      }

      public static S2C_WarRankList_9714 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarRankList_9714 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data);
      }

      public static S2C_WarRankList_9714 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarRankList_9714 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data);
      }

      public static S2C_WarRankList_9714 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarRankList_9714)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarRankList_9714 parseFrom(InputStream input) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarRankList_9714 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarRankList_9714 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarRankList_9714 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarRankList_9714 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarRankList_9714 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarRankList_9714)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarRankList_9714 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarRankList_9714 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarRankList_9714> parser() {
         return PARSER;
      }

      public Parser<S2C_WarRankList_9714> getParserForType() {
         return PARSER;
      }

      public S2C_WarRankList_9714 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarRankList_9714OrBuilder {
         private int bitField0_;
         private List<WarRankData> ranks_;
         private RepeatedFieldBuilderV3<WarRankData, WarRankData.Builder, WarRankDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarRankList_9714.class, Builder.class);
         }

         private Builder() {
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarRankList_9714.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarRankList_9714_descriptor;
         }

         public S2C_WarRankList_9714 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarRankList_9714.getDefaultInstance();
         }

         public S2C_WarRankList_9714 build() {
            S2C_WarRankList_9714 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarRankList_9714 buildPartial() {
            S2C_WarRankList_9714 result = new S2C_WarRankList_9714(this);
            int from_bitField0_ = this.bitField0_;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
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
            if (other instanceof S2C_WarRankList_9714) {
               return this.mergeFrom((S2C_WarRankList_9714)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarRankList_9714 other) {
            if (other == UnionWarMsg.S2C_WarRankList_9714.getDefaultInstance()) {
               return this;
            } else {
               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRanksIsMutable();
                        this.ranks_.addAll(other.ranks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ranks_.isEmpty()) {
                  if (this.ranksBuilder_.isEmpty()) {
                     this.ranksBuilder_.dispose();
                     this.ranksBuilder_ = null;
                     this.ranks_ = other.ranks_;
                     this.bitField0_ &= -2;
                     this.ranksBuilder_ = UnionWarMsg.S2C_WarRankList_9714.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarRankList_9714 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarRankList_9714)UnionWarMsg.S2C_WarRankList_9714.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarRankList_9714)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 1;
            }

         }

         public List<WarRankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public WarRankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (WarRankData)this.ranks_.get(index) : (WarRankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, WarRankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.set(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRanks(int index, WarRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(WarRankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRanks(int index, WarRankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRanks(WarRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, WarRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends WarRankData> values) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ranks_);
               this.onChanged();
            } else {
               this.ranksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRanks() {
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Builder removeRanks(int index) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.remove(index);
               this.onChanged();
            } else {
               this.ranksBuilder_.remove(index);
            }

            return this;
         }

         public WarRankData.Builder getRanksBuilder(int index) {
            return (WarRankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public WarRankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (WarRankDataOrBuilder)this.ranks_.get(index) : (WarRankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarRankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public WarRankData.Builder addRanksBuilder() {
            return (WarRankData.Builder)this.getRanksFieldBuilder().addBuilder(UnionWarMsg.WarRankData.getDefaultInstance());
         }

         public WarRankData.Builder addRanksBuilder(int index) {
            return (WarRankData.Builder)this.getRanksFieldBuilder().addBuilder(index, UnionWarMsg.WarRankData.getDefaultInstance());
         }

         public List<WarRankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarRankData, WarRankData.Builder, WarRankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarBattle_9715 extends GeneratedMessageV3 implements C2S_WarBattle_9715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int STAR_FIELD_NUMBER = 2;
      private int star_;
      private byte memoizedIsInitialized;
      private static final C2S_WarBattle_9715 DEFAULT_INSTANCE = new C2S_WarBattle_9715();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBattle_9715> PARSER = new AbstractParser<C2S_WarBattle_9715>() {
         public C2S_WarBattle_9715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBattle_9715(input, extensionRegistry);
         }
      };

      private C2S_WarBattle_9715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBattle_9715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBattle_9715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBattle_9715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.star_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattle_9715.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.star_);
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.star_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarBattle_9715)) {
            return super.equals(obj);
         } else {
            C2S_WarBattle_9715 other = (C2S_WarBattle_9715)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarBattle_9715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data);
      }

      public static C2S_WarBattle_9715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattle_9715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data);
      }

      public static C2S_WarBattle_9715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattle_9715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data);
      }

      public static C2S_WarBattle_9715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattle_9715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattle_9715 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattle_9715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattle_9715 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBattle_9715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattle_9715 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattle_9715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattle_9715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBattle_9715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBattle_9715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBattle_9715> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBattle_9715> getParserForType() {
         return PARSER;
      }

      public C2S_WarBattle_9715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBattle_9715OrBuilder {
         private int bitField0_;
         private int position_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattle_9715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBattle_9715.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.star_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattle_9715_descriptor;
         }

         public C2S_WarBattle_9715 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBattle_9715.getDefaultInstance();
         }

         public C2S_WarBattle_9715 build() {
            C2S_WarBattle_9715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBattle_9715 buildPartial() {
            C2S_WarBattle_9715 result = new C2S_WarBattle_9715(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.star_ = this.star_;
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
            if (other instanceof C2S_WarBattle_9715) {
               return this.mergeFrom((C2S_WarBattle_9715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBattle_9715 other) {
            if (other == UnionWarMsg.C2S_WarBattle_9715.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarBattle_9715 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBattle_9715)UnionWarMsg.C2S_WarBattle_9715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBattle_9715)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 2;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -3;
            this.star_ = 0;
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

   public static final class S2C_WarBattle_9716 extends GeneratedMessageV3 implements S2C_WarBattle_9716OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int STAR_FIELD_NUMBER = 2;
      private int star_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattle_9716 DEFAULT_INSTANCE = new S2C_WarBattle_9716();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattle_9716> PARSER = new AbstractParser<S2C_WarBattle_9716>() {
         public S2C_WarBattle_9716 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattle_9716(input, extensionRegistry);
         }
      };

      private S2C_WarBattle_9716(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattle_9716() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattle_9716();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattle_9716(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.star_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattle_9716.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.star_);
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.star_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattle_9716)) {
            return super.equals(obj);
         } else {
            S2C_WarBattle_9716 other = (S2C_WarBattle_9716)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattle_9716 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data);
      }

      public static S2C_WarBattle_9716 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattle_9716 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data);
      }

      public static S2C_WarBattle_9716 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattle_9716 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data);
      }

      public static S2C_WarBattle_9716 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattle_9716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattle_9716 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattle_9716 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattle_9716 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattle_9716 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattle_9716 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattle_9716 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattle_9716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattle_9716 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattle_9716 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattle_9716> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattle_9716> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattle_9716 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattle_9716OrBuilder {
         private int bitField0_;
         private int position_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattle_9716.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattle_9716.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.star_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattle_9716_descriptor;
         }

         public S2C_WarBattle_9716 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattle_9716.getDefaultInstance();
         }

         public S2C_WarBattle_9716 build() {
            S2C_WarBattle_9716 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattle_9716 buildPartial() {
            S2C_WarBattle_9716 result = new S2C_WarBattle_9716(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.star_ = this.star_;
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
            if (other instanceof S2C_WarBattle_9716) {
               return this.mergeFrom((S2C_WarBattle_9716)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattle_9716 other) {
            if (other == UnionWarMsg.S2C_WarBattle_9716.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattle_9716 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattle_9716)UnionWarMsg.S2C_WarBattle_9716.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattle_9716)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStar() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStar() {
            return this.star_;
         }

         public Builder setStar(int value) {
            this.bitField0_ |= 2;
            this.star_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStar() {
            this.bitField0_ &= -3;
            this.star_ = 0;
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

   public static final class S2C_WarStrongholdData_9718 extends GeneratedMessageV3 implements S2C_WarStrongholdData_9718OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int WARSTRONGHOLDDATA_FIELD_NUMBER = 2;
      private WarStrongholdData warStrongholdData_;
      private byte memoizedIsInitialized;
      private static final S2C_WarStrongholdData_9718 DEFAULT_INSTANCE = new S2C_WarStrongholdData_9718();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarStrongholdData_9718> PARSER = new AbstractParser<S2C_WarStrongholdData_9718>() {
         public S2C_WarStrongholdData_9718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarStrongholdData_9718(input, extensionRegistry);
         }
      };

      private S2C_WarStrongholdData_9718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarStrongholdData_9718() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarStrongholdData_9718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarStrongholdData_9718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        WarStrongholdData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.warStrongholdData_.toBuilder();
                        }

                        this.warStrongholdData_ = (WarStrongholdData)input.readMessage(UnionWarMsg.WarStrongholdData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.warStrongholdData_);
                           this.warStrongholdData_ = subBuilder.buildPartial();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarStrongholdData_9718.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasWarStrongholdData() {
         return (this.bitField0_ & 2) != 0;
      }

      public WarStrongholdData getWarStrongholdData() {
         return this.warStrongholdData_ == null ? UnionWarMsg.WarStrongholdData.getDefaultInstance() : this.warStrongholdData_;
      }

      public WarStrongholdDataOrBuilder getWarStrongholdDataOrBuilder() {
         return this.warStrongholdData_ == null ? UnionWarMsg.WarStrongholdData.getDefaultInstance() : this.warStrongholdData_;
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
         } else if (!this.hasWarStrongholdData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWarStrongholdData().isInitialized()) {
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
            output.writeMessage(2, this.getWarStrongholdData());
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
               size += CodedOutputStream.computeMessageSize(2, this.getWarStrongholdData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarStrongholdData_9718)) {
            return super.equals(obj);
         } else {
            S2C_WarStrongholdData_9718 other = (S2C_WarStrongholdData_9718)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasWarStrongholdData() != other.hasWarStrongholdData()) {
               return false;
            } else if (this.hasWarStrongholdData() && !this.getWarStrongholdData().equals(other.getWarStrongholdData())) {
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

            if (this.hasWarStrongholdData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWarStrongholdData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarStrongholdData_9718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarStrongholdData_9718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(InputStream input) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarStrongholdData_9718 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdData_9718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarStrongholdData_9718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarStrongholdData_9718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarStrongholdData_9718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarStrongholdData_9718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarStrongholdData_9718> parser() {
         return PARSER;
      }

      public Parser<S2C_WarStrongholdData_9718> getParserForType() {
         return PARSER;
      }

      public S2C_WarStrongholdData_9718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarStrongholdData_9718OrBuilder {
         private int bitField0_;
         private int playerId_;
         private WarStrongholdData warStrongholdData_;
         private SingleFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> warStrongholdDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarStrongholdData_9718.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarStrongholdData_9718.alwaysUseFieldBuilders) {
               this.getWarStrongholdDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.warStrongholdDataBuilder_ == null) {
               this.warStrongholdData_ = null;
            } else {
               this.warStrongholdDataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarStrongholdData_9718_descriptor;
         }

         public S2C_WarStrongholdData_9718 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarStrongholdData_9718.getDefaultInstance();
         }

         public S2C_WarStrongholdData_9718 build() {
            S2C_WarStrongholdData_9718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarStrongholdData_9718 buildPartial() {
            S2C_WarStrongholdData_9718 result = new S2C_WarStrongholdData_9718(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.warStrongholdDataBuilder_ == null) {
                  result.warStrongholdData_ = this.warStrongholdData_;
               } else {
                  result.warStrongholdData_ = (WarStrongholdData)this.warStrongholdDataBuilder_.build();
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
            if (other instanceof S2C_WarStrongholdData_9718) {
               return this.mergeFrom((S2C_WarStrongholdData_9718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarStrongholdData_9718 other) {
            if (other == UnionWarMsg.S2C_WarStrongholdData_9718.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasWarStrongholdData()) {
                  this.mergeWarStrongholdData(other.getWarStrongholdData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasWarStrongholdData()) {
               return false;
            } else {
               return this.getWarStrongholdData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarStrongholdData_9718 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarStrongholdData_9718)UnionWarMsg.S2C_WarStrongholdData_9718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarStrongholdData_9718)e.getUnfinishedMessage();
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

         public boolean hasWarStrongholdData() {
            return (this.bitField0_ & 2) != 0;
         }

         public WarStrongholdData getWarStrongholdData() {
            if (this.warStrongholdDataBuilder_ == null) {
               return this.warStrongholdData_ == null ? UnionWarMsg.WarStrongholdData.getDefaultInstance() : this.warStrongholdData_;
            } else {
               return (WarStrongholdData)this.warStrongholdDataBuilder_.getMessage();
            }
         }

         public Builder setWarStrongholdData(WarStrongholdData value) {
            if (this.warStrongholdDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.warStrongholdData_ = value;
               this.onChanged();
            } else {
               this.warStrongholdDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setWarStrongholdData(WarStrongholdData.Builder builderForValue) {
            if (this.warStrongholdDataBuilder_ == null) {
               this.warStrongholdData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.warStrongholdDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeWarStrongholdData(WarStrongholdData value) {
            if (this.warStrongholdDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.warStrongholdData_ != null && this.warStrongholdData_ != UnionWarMsg.WarStrongholdData.getDefaultInstance()) {
                  this.warStrongholdData_ = UnionWarMsg.WarStrongholdData.newBuilder(this.warStrongholdData_).mergeFrom(value).buildPartial();
               } else {
                  this.warStrongholdData_ = value;
               }

               this.onChanged();
            } else {
               this.warStrongholdDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearWarStrongholdData() {
            if (this.warStrongholdDataBuilder_ == null) {
               this.warStrongholdData_ = null;
               this.onChanged();
            } else {
               this.warStrongholdDataBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public WarStrongholdData.Builder getWarStrongholdDataBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (WarStrongholdData.Builder)this.getWarStrongholdDataFieldBuilder().getBuilder();
         }

         public WarStrongholdDataOrBuilder getWarStrongholdDataOrBuilder() {
            if (this.warStrongholdDataBuilder_ != null) {
               return (WarStrongholdDataOrBuilder)this.warStrongholdDataBuilder_.getMessageOrBuilder();
            } else {
               return this.warStrongholdData_ == null ? UnionWarMsg.WarStrongholdData.getDefaultInstance() : this.warStrongholdData_;
            }
         }

         private SingleFieldBuilderV3<WarStrongholdData, WarStrongholdData.Builder, WarStrongholdDataOrBuilder> getWarStrongholdDataFieldBuilder() {
            if (this.warStrongholdDataBuilder_ == null) {
               this.warStrongholdDataBuilder_ = new SingleFieldBuilderV3(this.getWarStrongholdData(), this.getParentForChildren(), this.isClean());
               this.warStrongholdData_ = null;
            }

            return this.warStrongholdDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarBattleRecordList_9719 extends GeneratedMessageV3 implements C2S_WarBattleRecordList_9719OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SIZE_FIELD_NUMBER = 1;
      private int size_;
      private byte memoizedIsInitialized;
      private static final C2S_WarBattleRecordList_9719 DEFAULT_INSTANCE = new C2S_WarBattleRecordList_9719();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBattleRecordList_9719> PARSER = new AbstractParser<C2S_WarBattleRecordList_9719>() {
         public C2S_WarBattleRecordList_9719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBattleRecordList_9719(input, extensionRegistry);
         }
      };

      private C2S_WarBattleRecordList_9719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBattleRecordList_9719() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBattleRecordList_9719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBattleRecordList_9719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.size_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleRecordList_9719.class, Builder.class);
      }

      public boolean hasSize() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSize() {
         return this.size_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.size_);
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
               size += CodedOutputStream.computeInt32Size(1, this.size_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarBattleRecordList_9719)) {
            return super.equals(obj);
         } else {
            C2S_WarBattleRecordList_9719 other = (C2S_WarBattleRecordList_9719)obj;
            if (this.hasSize() != other.hasSize()) {
               return false;
            } else if (this.hasSize() && this.getSize() != other.getSize()) {
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
            if (this.hasSize()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSize();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleRecordList_9719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleRecordList_9719 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBattleRecordList_9719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleRecordList_9719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleRecordList_9719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBattleRecordList_9719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBattleRecordList_9719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBattleRecordList_9719> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBattleRecordList_9719> getParserForType() {
         return PARSER;
      }

      public C2S_WarBattleRecordList_9719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBattleRecordList_9719OrBuilder {
         private int bitField0_;
         private int size_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleRecordList_9719.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBattleRecordList_9719.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.size_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleRecordList_9719_descriptor;
         }

         public C2S_WarBattleRecordList_9719 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBattleRecordList_9719.getDefaultInstance();
         }

         public C2S_WarBattleRecordList_9719 build() {
            C2S_WarBattleRecordList_9719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBattleRecordList_9719 buildPartial() {
            C2S_WarBattleRecordList_9719 result = new C2S_WarBattleRecordList_9719(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.size_ = this.size_;
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
            if (other instanceof C2S_WarBattleRecordList_9719) {
               return this.mergeFrom((C2S_WarBattleRecordList_9719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBattleRecordList_9719 other) {
            if (other == UnionWarMsg.C2S_WarBattleRecordList_9719.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSize()) {
                  this.setSize(other.getSize());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSize();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarBattleRecordList_9719 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBattleRecordList_9719)UnionWarMsg.C2S_WarBattleRecordList_9719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBattleRecordList_9719)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSize() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSize() {
            return this.size_;
         }

         public Builder setSize(int value) {
            this.bitField0_ |= 1;
            this.size_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSize() {
            this.bitField0_ &= -2;
            this.size_ = 0;
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

   public static final class S2C_WarBattleRecordList_9720 extends GeneratedMessageV3 implements S2C_WarBattleRecordList_9720OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SIZE_FIELD_NUMBER = 1;
      private int size_;
      public static final int STRONGHOLD_FIELD_NUMBER = 2;
      private List<WarStrongholdRecordData> stronghold_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattleRecordList_9720 DEFAULT_INSTANCE = new S2C_WarBattleRecordList_9720();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattleRecordList_9720> PARSER = new AbstractParser<S2C_WarBattleRecordList_9720>() {
         public S2C_WarBattleRecordList_9720 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattleRecordList_9720(input, extensionRegistry);
         }
      };

      private S2C_WarBattleRecordList_9720(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattleRecordList_9720() {
         this.memoizedIsInitialized = -1;
         this.stronghold_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattleRecordList_9720();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattleRecordList_9720(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.size_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.stronghold_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.stronghold_.add(input.readMessage(UnionWarMsg.WarStrongholdRecordData.PARSER, extensionRegistry));
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
                  this.stronghold_ = Collections.unmodifiableList(this.stronghold_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleRecordList_9720.class, Builder.class);
      }

      public boolean hasSize() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSize() {
         return this.size_;
      }

      public List<WarStrongholdRecordData> getStrongholdList() {
         return this.stronghold_;
      }

      public List<? extends WarStrongholdRecordDataOrBuilder> getStrongholdOrBuilderList() {
         return this.stronghold_;
      }

      public int getStrongholdCount() {
         return this.stronghold_.size();
      }

      public WarStrongholdRecordData getStronghold(int index) {
         return (WarStrongholdRecordData)this.stronghold_.get(index);
      }

      public WarStrongholdRecordDataOrBuilder getStrongholdOrBuilder(int index) {
         return (WarStrongholdRecordDataOrBuilder)this.stronghold_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSize()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStrongholdCount(); ++i) {
               if (!this.getStronghold(i).isInitialized()) {
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
            output.writeInt32(1, this.size_);
         }

         for(int i = 0; i < this.stronghold_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.stronghold_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.size_);
            }

            for(int i = 0; i < this.stronghold_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.stronghold_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattleRecordList_9720)) {
            return super.equals(obj);
         } else {
            S2C_WarBattleRecordList_9720 other = (S2C_WarBattleRecordList_9720)obj;
            if (this.hasSize() != other.hasSize()) {
               return false;
            } else if (this.hasSize() && this.getSize() != other.getSize()) {
               return false;
            } else if (!this.getStrongholdList().equals(other.getStrongholdList())) {
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
            if (this.hasSize()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSize();
            }

            if (this.getStrongholdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStrongholdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecordList_9720)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleRecordList_9720 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecordList_9720 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecordList_9720 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecordList_9720)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattleRecordList_9720 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattleRecordList_9720 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattleRecordList_9720> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattleRecordList_9720> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattleRecordList_9720 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattleRecordList_9720OrBuilder {
         private int bitField0_;
         private int size_;
         private List<WarStrongholdRecordData> stronghold_;
         private RepeatedFieldBuilderV3<WarStrongholdRecordData, WarStrongholdRecordData.Builder, WarStrongholdRecordDataOrBuilder> strongholdBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleRecordList_9720.class, Builder.class);
         }

         private Builder() {
            this.stronghold_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.stronghold_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattleRecordList_9720.alwaysUseFieldBuilders) {
               this.getStrongholdFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.size_ = 0;
            this.bitField0_ &= -2;
            if (this.strongholdBuilder_ == null) {
               this.stronghold_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.strongholdBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecordList_9720_descriptor;
         }

         public S2C_WarBattleRecordList_9720 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattleRecordList_9720.getDefaultInstance();
         }

         public S2C_WarBattleRecordList_9720 build() {
            S2C_WarBattleRecordList_9720 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattleRecordList_9720 buildPartial() {
            S2C_WarBattleRecordList_9720 result = new S2C_WarBattleRecordList_9720(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.size_ = this.size_;
               to_bitField0_ |= 1;
            }

            if (this.strongholdBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.stronghold_ = Collections.unmodifiableList(this.stronghold_);
                  this.bitField0_ &= -3;
               }

               result.stronghold_ = this.stronghold_;
            } else {
               result.stronghold_ = this.strongholdBuilder_.build();
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
            if (other instanceof S2C_WarBattleRecordList_9720) {
               return this.mergeFrom((S2C_WarBattleRecordList_9720)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattleRecordList_9720 other) {
            if (other == UnionWarMsg.S2C_WarBattleRecordList_9720.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSize()) {
                  this.setSize(other.getSize());
               }

               if (this.strongholdBuilder_ == null) {
                  if (!other.stronghold_.isEmpty()) {
                     if (this.stronghold_.isEmpty()) {
                        this.stronghold_ = other.stronghold_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureStrongholdIsMutable();
                        this.stronghold_.addAll(other.stronghold_);
                     }

                     this.onChanged();
                  }
               } else if (!other.stronghold_.isEmpty()) {
                  if (this.strongholdBuilder_.isEmpty()) {
                     this.strongholdBuilder_.dispose();
                     this.strongholdBuilder_ = null;
                     this.stronghold_ = other.stronghold_;
                     this.bitField0_ &= -3;
                     this.strongholdBuilder_ = UnionWarMsg.S2C_WarBattleRecordList_9720.alwaysUseFieldBuilders ? this.getStrongholdFieldBuilder() : null;
                  } else {
                     this.strongholdBuilder_.addAllMessages(other.stronghold_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSize()) {
               return false;
            } else {
               for(int i = 0; i < this.getStrongholdCount(); ++i) {
                  if (!this.getStronghold(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattleRecordList_9720 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattleRecordList_9720)UnionWarMsg.S2C_WarBattleRecordList_9720.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattleRecordList_9720)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSize() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSize() {
            return this.size_;
         }

         public Builder setSize(int value) {
            this.bitField0_ |= 1;
            this.size_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSize() {
            this.bitField0_ &= -2;
            this.size_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureStrongholdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.stronghold_ = new ArrayList(this.stronghold_);
               this.bitField0_ |= 2;
            }

         }

         public List<WarStrongholdRecordData> getStrongholdList() {
            return this.strongholdBuilder_ == null ? Collections.unmodifiableList(this.stronghold_) : this.strongholdBuilder_.getMessageList();
         }

         public int getStrongholdCount() {
            return this.strongholdBuilder_ == null ? this.stronghold_.size() : this.strongholdBuilder_.getCount();
         }

         public WarStrongholdRecordData getStronghold(int index) {
            return this.strongholdBuilder_ == null ? (WarStrongholdRecordData)this.stronghold_.get(index) : (WarStrongholdRecordData)this.strongholdBuilder_.getMessage(index);
         }

         public Builder setStronghold(int index, WarStrongholdRecordData value) {
            if (this.strongholdBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdIsMutable();
               this.stronghold_.set(index, value);
               this.onChanged();
            } else {
               this.strongholdBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStronghold(int index, WarStrongholdRecordData.Builder builderForValue) {
            if (this.strongholdBuilder_ == null) {
               this.ensureStrongholdIsMutable();
               this.stronghold_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStronghold(WarStrongholdRecordData value) {
            if (this.strongholdBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdIsMutable();
               this.stronghold_.add(value);
               this.onChanged();
            } else {
               this.strongholdBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStronghold(int index, WarStrongholdRecordData value) {
            if (this.strongholdBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStrongholdIsMutable();
               this.stronghold_.add(index, value);
               this.onChanged();
            } else {
               this.strongholdBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStronghold(WarStrongholdRecordData.Builder builderForValue) {
            if (this.strongholdBuilder_ == null) {
               this.ensureStrongholdIsMutable();
               this.stronghold_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStronghold(int index, WarStrongholdRecordData.Builder builderForValue) {
            if (this.strongholdBuilder_ == null) {
               this.ensureStrongholdIsMutable();
               this.stronghold_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.strongholdBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStronghold(Iterable<? extends WarStrongholdRecordData> values) {
            if (this.strongholdBuilder_ == null) {
               this.ensureStrongholdIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.stronghold_);
               this.onChanged();
            } else {
               this.strongholdBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStronghold() {
            if (this.strongholdBuilder_ == null) {
               this.stronghold_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.strongholdBuilder_.clear();
            }

            return this;
         }

         public Builder removeStronghold(int index) {
            if (this.strongholdBuilder_ == null) {
               this.ensureStrongholdIsMutable();
               this.stronghold_.remove(index);
               this.onChanged();
            } else {
               this.strongholdBuilder_.remove(index);
            }

            return this;
         }

         public WarStrongholdRecordData.Builder getStrongholdBuilder(int index) {
            return (WarStrongholdRecordData.Builder)this.getStrongholdFieldBuilder().getBuilder(index);
         }

         public WarStrongholdRecordDataOrBuilder getStrongholdOrBuilder(int index) {
            return this.strongholdBuilder_ == null ? (WarStrongholdRecordDataOrBuilder)this.stronghold_.get(index) : (WarStrongholdRecordDataOrBuilder)this.strongholdBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarStrongholdRecordDataOrBuilder> getStrongholdOrBuilderList() {
            return this.strongholdBuilder_ != null ? this.strongholdBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stronghold_);
         }

         public WarStrongholdRecordData.Builder addStrongholdBuilder() {
            return (WarStrongholdRecordData.Builder)this.getStrongholdFieldBuilder().addBuilder(UnionWarMsg.WarStrongholdRecordData.getDefaultInstance());
         }

         public WarStrongholdRecordData.Builder addStrongholdBuilder(int index) {
            return (WarStrongholdRecordData.Builder)this.getStrongholdFieldBuilder().addBuilder(index, UnionWarMsg.WarStrongholdRecordData.getDefaultInstance());
         }

         public List<WarStrongholdRecordData.Builder> getStrongholdBuilderList() {
            return this.getStrongholdFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarStrongholdRecordData, WarStrongholdRecordData.Builder, WarStrongholdRecordDataOrBuilder> getStrongholdFieldBuilder() {
            if (this.strongholdBuilder_ == null) {
               this.strongholdBuilder_ = new RepeatedFieldBuilderV3(this.stronghold_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.stronghold_ = null;
            }

            return this.strongholdBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WarBattleRecord_9722 extends GeneratedMessageV3 implements S2C_WarBattleRecord_9722OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RECORD_FIELD_NUMBER = 2;
      private WarBattleRecordData record_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattleRecord_9722 DEFAULT_INSTANCE = new S2C_WarBattleRecord_9722();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattleRecord_9722> PARSER = new AbstractParser<S2C_WarBattleRecord_9722>() {
         public S2C_WarBattleRecord_9722 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattleRecord_9722(input, extensionRegistry);
         }
      };

      private S2C_WarBattleRecord_9722(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattleRecord_9722() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattleRecord_9722();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattleRecord_9722(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        WarBattleRecordData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (WarBattleRecordData)input.readMessage(UnionWarMsg.WarBattleRecordData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleRecord_9722.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 2) != 0;
      }

      public WarBattleRecordData getRecord() {
         return this.record_ == null ? UnionWarMsg.WarBattleRecordData.getDefaultInstance() : this.record_;
      }

      public WarBattleRecordDataOrBuilder getRecordOrBuilder() {
         return this.record_ == null ? UnionWarMsg.WarBattleRecordData.getDefaultInstance() : this.record_;
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
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecord().isInitialized()) {
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
            output.writeMessage(2, this.getRecord());
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
               size += CodedOutputStream.computeMessageSize(2, this.getRecord());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattleRecord_9722)) {
            return super.equals(obj);
         } else {
            S2C_WarBattleRecord_9722 other = (S2C_WarBattleRecord_9722)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
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

            if (this.hasRecord()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattleRecord_9722 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleRecord_9722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleRecord_9722 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecord_9722 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleRecord_9722 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleRecord_9722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattleRecord_9722 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattleRecord_9722 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattleRecord_9722> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattleRecord_9722> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattleRecord_9722 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattleRecord_9722OrBuilder {
         private int bitField0_;
         private int playerId_;
         private WarBattleRecordData record_;
         private SingleFieldBuilderV3<WarBattleRecordData, WarBattleRecordData.Builder, WarBattleRecordDataOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleRecord_9722.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattleRecord_9722.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleRecord_9722_descriptor;
         }

         public S2C_WarBattleRecord_9722 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattleRecord_9722.getDefaultInstance();
         }

         public S2C_WarBattleRecord_9722 build() {
            S2C_WarBattleRecord_9722 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattleRecord_9722 buildPartial() {
            S2C_WarBattleRecord_9722 result = new S2C_WarBattleRecord_9722(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (WarBattleRecordData)this.recordBuilder_.build();
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
            if (other instanceof S2C_WarBattleRecord_9722) {
               return this.mergeFrom((S2C_WarBattleRecord_9722)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattleRecord_9722 other) {
            if (other == UnionWarMsg.S2C_WarBattleRecord_9722.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasRecord()) {
               return false;
            } else {
               return this.getRecord().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattleRecord_9722 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattleRecord_9722)UnionWarMsg.S2C_WarBattleRecord_9722.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattleRecord_9722)e.getUnfinishedMessage();
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

         public boolean hasRecord() {
            return (this.bitField0_ & 2) != 0;
         }

         public WarBattleRecordData getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? UnionWarMsg.WarBattleRecordData.getDefaultInstance() : this.record_;
            } else {
               return (WarBattleRecordData)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(WarBattleRecordData value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRecord(WarBattleRecordData.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRecord(WarBattleRecordData value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.record_ != null && this.record_ != UnionWarMsg.WarBattleRecordData.getDefaultInstance()) {
                  this.record_ = UnionWarMsg.WarBattleRecordData.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public WarBattleRecordData.Builder getRecordBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (WarBattleRecordData.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public WarBattleRecordDataOrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (WarBattleRecordDataOrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? UnionWarMsg.WarBattleRecordData.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<WarBattleRecordData, WarBattleRecordData.Builder, WarBattleRecordDataOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
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

   public static final class C2S_WarBattleAchievementList_9723 extends GeneratedMessageV3 implements C2S_WarBattleAchievementList_9723OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarBattleAchievementList_9723 DEFAULT_INSTANCE = new C2S_WarBattleAchievementList_9723();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBattleAchievementList_9723> PARSER = new AbstractParser<C2S_WarBattleAchievementList_9723>() {
         public C2S_WarBattleAchievementList_9723 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBattleAchievementList_9723(input, extensionRegistry);
         }
      };

      private C2S_WarBattleAchievementList_9723(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBattleAchievementList_9723() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBattleAchievementList_9723();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBattleAchievementList_9723(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleAchievementList_9723.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarBattleAchievementList_9723)) {
            return super.equals(obj);
         } else {
            C2S_WarBattleAchievementList_9723 other = (C2S_WarBattleAchievementList_9723)obj;
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

      public static C2S_WarBattleAchievementList_9723 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleAchievementList_9723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleAchievementList_9723 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBattleAchievementList_9723 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleAchievementList_9723 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleAchievementList_9723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBattleAchievementList_9723 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBattleAchievementList_9723 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBattleAchievementList_9723> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBattleAchievementList_9723> getParserForType() {
         return PARSER;
      }

      public C2S_WarBattleAchievementList_9723 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBattleAchievementList_9723OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleAchievementList_9723.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBattleAchievementList_9723.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleAchievementList_9723_descriptor;
         }

         public C2S_WarBattleAchievementList_9723 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBattleAchievementList_9723.getDefaultInstance();
         }

         public C2S_WarBattleAchievementList_9723 build() {
            C2S_WarBattleAchievementList_9723 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBattleAchievementList_9723 buildPartial() {
            C2S_WarBattleAchievementList_9723 result = new C2S_WarBattleAchievementList_9723(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarBattleAchievementList_9723) {
               return this.mergeFrom((C2S_WarBattleAchievementList_9723)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBattleAchievementList_9723 other) {
            if (other == UnionWarMsg.C2S_WarBattleAchievementList_9723.getDefaultInstance()) {
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
            C2S_WarBattleAchievementList_9723 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBattleAchievementList_9723)UnionWarMsg.C2S_WarBattleAchievementList_9723.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBattleAchievementList_9723)e.getUnfinishedMessage();
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

   public static final class S2C_WarBattleAchievementList_9724 extends GeneratedMessageV3 implements S2C_WarBattleAchievementList_9724OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ACHIEVEMENTS_FIELD_NUMBER = 1;
      private List<WarBattleAchievementData> achievements_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattleAchievementList_9724 DEFAULT_INSTANCE = new S2C_WarBattleAchievementList_9724();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattleAchievementList_9724> PARSER = new AbstractParser<S2C_WarBattleAchievementList_9724>() {
         public S2C_WarBattleAchievementList_9724 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattleAchievementList_9724(input, extensionRegistry);
         }
      };

      private S2C_WarBattleAchievementList_9724(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattleAchievementList_9724() {
         this.memoizedIsInitialized = -1;
         this.achievements_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattleAchievementList_9724();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattleAchievementList_9724(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.achievements_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.achievements_.add(input.readMessage(UnionWarMsg.WarBattleAchievementData.PARSER, extensionRegistry));
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
                  this.achievements_ = Collections.unmodifiableList(this.achievements_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleAchievementList_9724.class, Builder.class);
      }

      public List<WarBattleAchievementData> getAchievementsList() {
         return this.achievements_;
      }

      public List<? extends WarBattleAchievementDataOrBuilder> getAchievementsOrBuilderList() {
         return this.achievements_;
      }

      public int getAchievementsCount() {
         return this.achievements_.size();
      }

      public WarBattleAchievementData getAchievements(int index) {
         return (WarBattleAchievementData)this.achievements_.get(index);
      }

      public WarBattleAchievementDataOrBuilder getAchievementsOrBuilder(int index) {
         return (WarBattleAchievementDataOrBuilder)this.achievements_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAchievementsCount(); ++i) {
               if (!this.getAchievements(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.achievements_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.achievements_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.achievements_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.achievements_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattleAchievementList_9724)) {
            return super.equals(obj);
         } else {
            S2C_WarBattleAchievementList_9724 other = (S2C_WarBattleAchievementList_9724)obj;
            if (!this.getAchievementsList().equals(other.getAchievementsList())) {
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
            if (this.getAchievementsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAchievementsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleAchievementList_9724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleAchievementList_9724 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattleAchievementList_9724 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleAchievementList_9724 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleAchievementList_9724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattleAchievementList_9724 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattleAchievementList_9724 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattleAchievementList_9724> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattleAchievementList_9724> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattleAchievementList_9724 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattleAchievementList_9724OrBuilder {
         private int bitField0_;
         private List<WarBattleAchievementData> achievements_;
         private RepeatedFieldBuilderV3<WarBattleAchievementData, WarBattleAchievementData.Builder, WarBattleAchievementDataOrBuilder> achievementsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleAchievementList_9724.class, Builder.class);
         }

         private Builder() {
            this.achievements_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.achievements_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattleAchievementList_9724.alwaysUseFieldBuilders) {
               this.getAchievementsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.achievementsBuilder_ == null) {
               this.achievements_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.achievementsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleAchievementList_9724_descriptor;
         }

         public S2C_WarBattleAchievementList_9724 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattleAchievementList_9724.getDefaultInstance();
         }

         public S2C_WarBattleAchievementList_9724 build() {
            S2C_WarBattleAchievementList_9724 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattleAchievementList_9724 buildPartial() {
            S2C_WarBattleAchievementList_9724 result = new S2C_WarBattleAchievementList_9724(this);
            int from_bitField0_ = this.bitField0_;
            if (this.achievementsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.achievements_ = Collections.unmodifiableList(this.achievements_);
                  this.bitField0_ &= -2;
               }

               result.achievements_ = this.achievements_;
            } else {
               result.achievements_ = this.achievementsBuilder_.build();
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
            if (other instanceof S2C_WarBattleAchievementList_9724) {
               return this.mergeFrom((S2C_WarBattleAchievementList_9724)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattleAchievementList_9724 other) {
            if (other == UnionWarMsg.S2C_WarBattleAchievementList_9724.getDefaultInstance()) {
               return this;
            } else {
               if (this.achievementsBuilder_ == null) {
                  if (!other.achievements_.isEmpty()) {
                     if (this.achievements_.isEmpty()) {
                        this.achievements_ = other.achievements_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAchievementsIsMutable();
                        this.achievements_.addAll(other.achievements_);
                     }

                     this.onChanged();
                  }
               } else if (!other.achievements_.isEmpty()) {
                  if (this.achievementsBuilder_.isEmpty()) {
                     this.achievementsBuilder_.dispose();
                     this.achievementsBuilder_ = null;
                     this.achievements_ = other.achievements_;
                     this.bitField0_ &= -2;
                     this.achievementsBuilder_ = UnionWarMsg.S2C_WarBattleAchievementList_9724.alwaysUseFieldBuilders ? this.getAchievementsFieldBuilder() : null;
                  } else {
                     this.achievementsBuilder_.addAllMessages(other.achievements_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAchievementsCount(); ++i) {
               if (!this.getAchievements(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattleAchievementList_9724 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattleAchievementList_9724)UnionWarMsg.S2C_WarBattleAchievementList_9724.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattleAchievementList_9724)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAchievementsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.achievements_ = new ArrayList(this.achievements_);
               this.bitField0_ |= 1;
            }

         }

         public List<WarBattleAchievementData> getAchievementsList() {
            return this.achievementsBuilder_ == null ? Collections.unmodifiableList(this.achievements_) : this.achievementsBuilder_.getMessageList();
         }

         public int getAchievementsCount() {
            return this.achievementsBuilder_ == null ? this.achievements_.size() : this.achievementsBuilder_.getCount();
         }

         public WarBattleAchievementData getAchievements(int index) {
            return this.achievementsBuilder_ == null ? (WarBattleAchievementData)this.achievements_.get(index) : (WarBattleAchievementData)this.achievementsBuilder_.getMessage(index);
         }

         public Builder setAchievements(int index, WarBattleAchievementData value) {
            if (this.achievementsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAchievementsIsMutable();
               this.achievements_.set(index, value);
               this.onChanged();
            } else {
               this.achievementsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAchievements(int index, WarBattleAchievementData.Builder builderForValue) {
            if (this.achievementsBuilder_ == null) {
               this.ensureAchievementsIsMutable();
               this.achievements_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.achievementsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAchievements(WarBattleAchievementData value) {
            if (this.achievementsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAchievementsIsMutable();
               this.achievements_.add(value);
               this.onChanged();
            } else {
               this.achievementsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAchievements(int index, WarBattleAchievementData value) {
            if (this.achievementsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAchievementsIsMutable();
               this.achievements_.add(index, value);
               this.onChanged();
            } else {
               this.achievementsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAchievements(WarBattleAchievementData.Builder builderForValue) {
            if (this.achievementsBuilder_ == null) {
               this.ensureAchievementsIsMutable();
               this.achievements_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.achievementsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAchievements(int index, WarBattleAchievementData.Builder builderForValue) {
            if (this.achievementsBuilder_ == null) {
               this.ensureAchievementsIsMutable();
               this.achievements_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.achievementsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAchievements(Iterable<? extends WarBattleAchievementData> values) {
            if (this.achievementsBuilder_ == null) {
               this.ensureAchievementsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.achievements_);
               this.onChanged();
            } else {
               this.achievementsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAchievements() {
            if (this.achievementsBuilder_ == null) {
               this.achievements_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.achievementsBuilder_.clear();
            }

            return this;
         }

         public Builder removeAchievements(int index) {
            if (this.achievementsBuilder_ == null) {
               this.ensureAchievementsIsMutable();
               this.achievements_.remove(index);
               this.onChanged();
            } else {
               this.achievementsBuilder_.remove(index);
            }

            return this;
         }

         public WarBattleAchievementData.Builder getAchievementsBuilder(int index) {
            return (WarBattleAchievementData.Builder)this.getAchievementsFieldBuilder().getBuilder(index);
         }

         public WarBattleAchievementDataOrBuilder getAchievementsOrBuilder(int index) {
            return this.achievementsBuilder_ == null ? (WarBattleAchievementDataOrBuilder)this.achievements_.get(index) : (WarBattleAchievementDataOrBuilder)this.achievementsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarBattleAchievementDataOrBuilder> getAchievementsOrBuilderList() {
            return this.achievementsBuilder_ != null ? this.achievementsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.achievements_);
         }

         public WarBattleAchievementData.Builder addAchievementsBuilder() {
            return (WarBattleAchievementData.Builder)this.getAchievementsFieldBuilder().addBuilder(UnionWarMsg.WarBattleAchievementData.getDefaultInstance());
         }

         public WarBattleAchievementData.Builder addAchievementsBuilder(int index) {
            return (WarBattleAchievementData.Builder)this.getAchievementsFieldBuilder().addBuilder(index, UnionWarMsg.WarBattleAchievementData.getDefaultInstance());
         }

         public List<WarBattleAchievementData.Builder> getAchievementsBuilderList() {
            return this.getAchievementsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarBattleAchievementData, WarBattleAchievementData.Builder, WarBattleAchievementDataOrBuilder> getAchievementsFieldBuilder() {
            if (this.achievementsBuilder_ == null) {
               this.achievementsBuilder_ = new RepeatedFieldBuilderV3(this.achievements_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.achievements_ = null;
            }

            return this.achievementsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarBattleCommitAchievementList_9725 extends GeneratedMessageV3 implements C2S_WarBattleCommitAchievementList_9725OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACHIEVEMENTID_FIELD_NUMBER = 1;
      private int achievementId_;
      private byte memoizedIsInitialized;
      private static final C2S_WarBattleCommitAchievementList_9725 DEFAULT_INSTANCE = new C2S_WarBattleCommitAchievementList_9725();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBattleCommitAchievementList_9725> PARSER = new AbstractParser<C2S_WarBattleCommitAchievementList_9725>() {
         public C2S_WarBattleCommitAchievementList_9725 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBattleCommitAchievementList_9725(input, extensionRegistry);
         }
      };

      private C2S_WarBattleCommitAchievementList_9725(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBattleCommitAchievementList_9725() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBattleCommitAchievementList_9725();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBattleCommitAchievementList_9725(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.achievementId_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleCommitAchievementList_9725.class, Builder.class);
      }

      public boolean hasAchievementId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAchievementId() {
         return this.achievementId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAchievementId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.achievementId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.achievementId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarBattleCommitAchievementList_9725)) {
            return super.equals(obj);
         } else {
            C2S_WarBattleCommitAchievementList_9725 other = (C2S_WarBattleCommitAchievementList_9725)obj;
            if (this.hasAchievementId() != other.hasAchievementId()) {
               return false;
            } else if (this.hasAchievementId() && this.getAchievementId() != other.getAchievementId()) {
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
            if (this.hasAchievementId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAchievementId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleCommitAchievementList_9725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleCommitAchievementList_9725 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleCommitAchievementList_9725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBattleCommitAchievementList_9725 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBattleCommitAchievementList_9725 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBattleCommitAchievementList_9725> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBattleCommitAchievementList_9725> getParserForType() {
         return PARSER;
      }

      public C2S_WarBattleCommitAchievementList_9725 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBattleCommitAchievementList_9725OrBuilder {
         private int bitField0_;
         private int achievementId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleCommitAchievementList_9725.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBattleCommitAchievementList_9725.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.achievementId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleCommitAchievementList_9725_descriptor;
         }

         public C2S_WarBattleCommitAchievementList_9725 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBattleCommitAchievementList_9725.getDefaultInstance();
         }

         public C2S_WarBattleCommitAchievementList_9725 build() {
            C2S_WarBattleCommitAchievementList_9725 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBattleCommitAchievementList_9725 buildPartial() {
            C2S_WarBattleCommitAchievementList_9725 result = new C2S_WarBattleCommitAchievementList_9725(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.achievementId_ = this.achievementId_;
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
            if (other instanceof C2S_WarBattleCommitAchievementList_9725) {
               return this.mergeFrom((C2S_WarBattleCommitAchievementList_9725)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBattleCommitAchievementList_9725 other) {
            if (other == UnionWarMsg.C2S_WarBattleCommitAchievementList_9725.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAchievementId()) {
                  this.setAchievementId(other.getAchievementId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAchievementId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarBattleCommitAchievementList_9725 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBattleCommitAchievementList_9725)UnionWarMsg.C2S_WarBattleCommitAchievementList_9725.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBattleCommitAchievementList_9725)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAchievementId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAchievementId() {
            return this.achievementId_;
         }

         public Builder setAchievementId(int value) {
            this.bitField0_ |= 1;
            this.achievementId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAchievementId() {
            this.bitField0_ &= -2;
            this.achievementId_ = 0;
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

   public static final class S2C_WarBattleCommitAchievementList_9726 extends GeneratedMessageV3 implements S2C_WarBattleCommitAchievementList_9726OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACHIEVEMENTID_FIELD_NUMBER = 1;
      private int achievementId_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattleCommitAchievementList_9726 DEFAULT_INSTANCE = new S2C_WarBattleCommitAchievementList_9726();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattleCommitAchievementList_9726> PARSER = new AbstractParser<S2C_WarBattleCommitAchievementList_9726>() {
         public S2C_WarBattleCommitAchievementList_9726 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattleCommitAchievementList_9726(input, extensionRegistry);
         }
      };

      private S2C_WarBattleCommitAchievementList_9726(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattleCommitAchievementList_9726() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattleCommitAchievementList_9726();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattleCommitAchievementList_9726(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.achievementId_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleCommitAchievementList_9726.class, Builder.class);
      }

      public boolean hasAchievementId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAchievementId() {
         return this.achievementId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAchievementId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.achievementId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.achievementId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattleCommitAchievementList_9726)) {
            return super.equals(obj);
         } else {
            S2C_WarBattleCommitAchievementList_9726 other = (S2C_WarBattleCommitAchievementList_9726)obj;
            if (this.hasAchievementId() != other.hasAchievementId()) {
               return false;
            } else if (this.hasAchievementId() && this.getAchievementId() != other.getAchievementId()) {
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
            if (this.hasAchievementId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAchievementId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleCommitAchievementList_9726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleCommitAchievementList_9726 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleCommitAchievementList_9726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattleCommitAchievementList_9726 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattleCommitAchievementList_9726 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattleCommitAchievementList_9726> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattleCommitAchievementList_9726> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattleCommitAchievementList_9726 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattleCommitAchievementList_9726OrBuilder {
         private int bitField0_;
         private int achievementId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleCommitAchievementList_9726.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.achievementId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleCommitAchievementList_9726_descriptor;
         }

         public S2C_WarBattleCommitAchievementList_9726 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.getDefaultInstance();
         }

         public S2C_WarBattleCommitAchievementList_9726 build() {
            S2C_WarBattleCommitAchievementList_9726 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattleCommitAchievementList_9726 buildPartial() {
            S2C_WarBattleCommitAchievementList_9726 result = new S2C_WarBattleCommitAchievementList_9726(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.achievementId_ = this.achievementId_;
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
            if (other instanceof S2C_WarBattleCommitAchievementList_9726) {
               return this.mergeFrom((S2C_WarBattleCommitAchievementList_9726)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattleCommitAchievementList_9726 other) {
            if (other == UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAchievementId()) {
                  this.setAchievementId(other.getAchievementId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAchievementId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattleCommitAchievementList_9726 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattleCommitAchievementList_9726)UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattleCommitAchievementList_9726)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAchievementId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAchievementId() {
            return this.achievementId_;
         }

         public Builder setAchievementId(int value) {
            this.bitField0_ |= 1;
            this.achievementId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAchievementId() {
            this.bitField0_ &= -2;
            this.achievementId_ = 0;
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

   public static final class S2C_AchievementNotify_9728 extends GeneratedMessageV3 implements S2C_AchievementNotify_9728OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACHIEVEMENTS_FIELD_NUMBER = 1;
      private WarBattleAchievementData achievements_;
      private byte memoizedIsInitialized;
      private static final S2C_AchievementNotify_9728 DEFAULT_INSTANCE = new S2C_AchievementNotify_9728();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AchievementNotify_9728> PARSER = new AbstractParser<S2C_AchievementNotify_9728>() {
         public S2C_AchievementNotify_9728 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AchievementNotify_9728(input, extensionRegistry);
         }
      };

      private S2C_AchievementNotify_9728(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AchievementNotify_9728() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AchievementNotify_9728();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AchievementNotify_9728(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WarBattleAchievementData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.achievements_.toBuilder();
                        }

                        this.achievements_ = (WarBattleAchievementData)input.readMessage(UnionWarMsg.WarBattleAchievementData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.achievements_);
                           this.achievements_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AchievementNotify_9728.class, Builder.class);
      }

      public boolean hasAchievements() {
         return (this.bitField0_ & 1) != 0;
      }

      public WarBattleAchievementData getAchievements() {
         return this.achievements_ == null ? UnionWarMsg.WarBattleAchievementData.getDefaultInstance() : this.achievements_;
      }

      public WarBattleAchievementDataOrBuilder getAchievementsOrBuilder() {
         return this.achievements_ == null ? UnionWarMsg.WarBattleAchievementData.getDefaultInstance() : this.achievements_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAchievements()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAchievements().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getAchievements());
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
               size += CodedOutputStream.computeMessageSize(1, this.getAchievements());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AchievementNotify_9728)) {
            return super.equals(obj);
         } else {
            S2C_AchievementNotify_9728 other = (S2C_AchievementNotify_9728)obj;
            if (this.hasAchievements() != other.hasAchievements()) {
               return false;
            } else if (this.hasAchievements() && !this.getAchievements().equals(other.getAchievements())) {
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
            if (this.hasAchievements()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAchievements().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AchievementNotify_9728 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data);
      }

      public static S2C_AchievementNotify_9728 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AchievementNotify_9728 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data);
      }

      public static S2C_AchievementNotify_9728 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AchievementNotify_9728 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data);
      }

      public static S2C_AchievementNotify_9728 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AchievementNotify_9728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AchievementNotify_9728 parseFrom(InputStream input) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AchievementNotify_9728 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AchievementNotify_9728 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AchievementNotify_9728 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AchievementNotify_9728 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AchievementNotify_9728 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AchievementNotify_9728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AchievementNotify_9728 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AchievementNotify_9728 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AchievementNotify_9728> parser() {
         return PARSER;
      }

      public Parser<S2C_AchievementNotify_9728> getParserForType() {
         return PARSER;
      }

      public S2C_AchievementNotify_9728 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AchievementNotify_9728OrBuilder {
         private int bitField0_;
         private WarBattleAchievementData achievements_;
         private SingleFieldBuilderV3<WarBattleAchievementData, WarBattleAchievementData.Builder, WarBattleAchievementDataOrBuilder> achievementsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AchievementNotify_9728.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_AchievementNotify_9728.alwaysUseFieldBuilders) {
               this.getAchievementsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.achievementsBuilder_ == null) {
               this.achievements_ = null;
            } else {
               this.achievementsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_AchievementNotify_9728_descriptor;
         }

         public S2C_AchievementNotify_9728 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_AchievementNotify_9728.getDefaultInstance();
         }

         public S2C_AchievementNotify_9728 build() {
            S2C_AchievementNotify_9728 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AchievementNotify_9728 buildPartial() {
            S2C_AchievementNotify_9728 result = new S2C_AchievementNotify_9728(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.achievementsBuilder_ == null) {
                  result.achievements_ = this.achievements_;
               } else {
                  result.achievements_ = (WarBattleAchievementData)this.achievementsBuilder_.build();
               }

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
            if (other instanceof S2C_AchievementNotify_9728) {
               return this.mergeFrom((S2C_AchievementNotify_9728)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AchievementNotify_9728 other) {
            if (other == UnionWarMsg.S2C_AchievementNotify_9728.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAchievements()) {
                  this.mergeAchievements(other.getAchievements());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAchievements()) {
               return false;
            } else {
               return this.getAchievements().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AchievementNotify_9728 parsedMessage = null;

            try {
               parsedMessage = (S2C_AchievementNotify_9728)UnionWarMsg.S2C_AchievementNotify_9728.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AchievementNotify_9728)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAchievements() {
            return (this.bitField0_ & 1) != 0;
         }

         public WarBattleAchievementData getAchievements() {
            if (this.achievementsBuilder_ == null) {
               return this.achievements_ == null ? UnionWarMsg.WarBattleAchievementData.getDefaultInstance() : this.achievements_;
            } else {
               return (WarBattleAchievementData)this.achievementsBuilder_.getMessage();
            }
         }

         public Builder setAchievements(WarBattleAchievementData value) {
            if (this.achievementsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.achievements_ = value;
               this.onChanged();
            } else {
               this.achievementsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setAchievements(WarBattleAchievementData.Builder builderForValue) {
            if (this.achievementsBuilder_ == null) {
               this.achievements_ = builderForValue.build();
               this.onChanged();
            } else {
               this.achievementsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeAchievements(WarBattleAchievementData value) {
            if (this.achievementsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.achievements_ != null && this.achievements_ != UnionWarMsg.WarBattleAchievementData.getDefaultInstance()) {
                  this.achievements_ = UnionWarMsg.WarBattleAchievementData.newBuilder(this.achievements_).mergeFrom(value).buildPartial();
               } else {
                  this.achievements_ = value;
               }

               this.onChanged();
            } else {
               this.achievementsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearAchievements() {
            if (this.achievementsBuilder_ == null) {
               this.achievements_ = null;
               this.onChanged();
            } else {
               this.achievementsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WarBattleAchievementData.Builder getAchievementsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WarBattleAchievementData.Builder)this.getAchievementsFieldBuilder().getBuilder();
         }

         public WarBattleAchievementDataOrBuilder getAchievementsOrBuilder() {
            if (this.achievementsBuilder_ != null) {
               return (WarBattleAchievementDataOrBuilder)this.achievementsBuilder_.getMessageOrBuilder();
            } else {
               return this.achievements_ == null ? UnionWarMsg.WarBattleAchievementData.getDefaultInstance() : this.achievements_;
            }
         }

         private SingleFieldBuilderV3<WarBattleAchievementData, WarBattleAchievementData.Builder, WarBattleAchievementDataOrBuilder> getAchievementsFieldBuilder() {
            if (this.achievementsBuilder_ == null) {
               this.achievementsBuilder_ = new SingleFieldBuilderV3(this.getAchievements(), this.getParentForChildren(), this.isClean());
               this.achievements_ = null;
            }

            return this.achievementsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarBattleShopLv_9729 extends GeneratedMessageV3 implements C2S_WarBattleShopLv_9729OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarBattleShopLv_9729 DEFAULT_INSTANCE = new C2S_WarBattleShopLv_9729();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarBattleShopLv_9729> PARSER = new AbstractParser<C2S_WarBattleShopLv_9729>() {
         public C2S_WarBattleShopLv_9729 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarBattleShopLv_9729(input, extensionRegistry);
         }
      };

      private C2S_WarBattleShopLv_9729(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarBattleShopLv_9729() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarBattleShopLv_9729();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarBattleShopLv_9729(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleShopLv_9729.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarBattleShopLv_9729)) {
            return super.equals(obj);
         } else {
            C2S_WarBattleShopLv_9729 other = (C2S_WarBattleShopLv_9729)obj;
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

      public static C2S_WarBattleShopLv_9729 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarBattleShopLv_9729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(InputStream input) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleShopLv_9729 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarBattleShopLv_9729 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarBattleShopLv_9729 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarBattleShopLv_9729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarBattleShopLv_9729 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarBattleShopLv_9729 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarBattleShopLv_9729> parser() {
         return PARSER;
      }

      public Parser<C2S_WarBattleShopLv_9729> getParserForType() {
         return PARSER;
      }

      public C2S_WarBattleShopLv_9729 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarBattleShopLv_9729OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarBattleShopLv_9729.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.C2S_WarBattleShopLv_9729.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_C2S_WarBattleShopLv_9729_descriptor;
         }

         public C2S_WarBattleShopLv_9729 getDefaultInstanceForType() {
            return UnionWarMsg.C2S_WarBattleShopLv_9729.getDefaultInstance();
         }

         public C2S_WarBattleShopLv_9729 build() {
            C2S_WarBattleShopLv_9729 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarBattleShopLv_9729 buildPartial() {
            C2S_WarBattleShopLv_9729 result = new C2S_WarBattleShopLv_9729(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarBattleShopLv_9729) {
               return this.mergeFrom((C2S_WarBattleShopLv_9729)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarBattleShopLv_9729 other) {
            if (other == UnionWarMsg.C2S_WarBattleShopLv_9729.getDefaultInstance()) {
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
            C2S_WarBattleShopLv_9729 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarBattleShopLv_9729)UnionWarMsg.C2S_WarBattleShopLv_9729.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarBattleShopLv_9729)e.getUnfinishedMessage();
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

   public static final class S2C_WarBattleShopLv_9730 extends GeneratedMessageV3 implements S2C_WarBattleShopLv_9730OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LV_FIELD_NUMBER = 1;
      private int lv_;
      public static final int EXP_FIELD_NUMBER = 2;
      private int exp_;
      private byte memoizedIsInitialized;
      private static final S2C_WarBattleShopLv_9730 DEFAULT_INSTANCE = new S2C_WarBattleShopLv_9730();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarBattleShopLv_9730> PARSER = new AbstractParser<S2C_WarBattleShopLv_9730>() {
         public S2C_WarBattleShopLv_9730 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarBattleShopLv_9730(input, extensionRegistry);
         }
      };

      private S2C_WarBattleShopLv_9730(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarBattleShopLv_9730() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarBattleShopLv_9730();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarBattleShopLv_9730(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.exp_ = input.readInt32();
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
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleShopLv_9730.class, Builder.class);
      }

      public boolean hasLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.lv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.exp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.lv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.exp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarBattleShopLv_9730)) {
            return super.equals(obj);
         } else {
            S2C_WarBattleShopLv_9730 other = (S2C_WarBattleShopLv_9730)obj;
            if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.hasLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarBattleShopLv_9730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(InputStream input) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleShopLv_9730 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarBattleShopLv_9730 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarBattleShopLv_9730 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarBattleShopLv_9730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarBattleShopLv_9730 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarBattleShopLv_9730 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarBattleShopLv_9730> parser() {
         return PARSER;
      }

      public Parser<S2C_WarBattleShopLv_9730> getParserForType() {
         return PARSER;
      }

      public S2C_WarBattleShopLv_9730 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarBattleShopLv_9730OrBuilder {
         private int bitField0_;
         private int lv_;
         private int exp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarBattleShopLv_9730.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionWarMsg.S2C_WarBattleShopLv_9730.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.lv_ = 0;
            this.bitField0_ &= -2;
            this.exp_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionWarMsg.internal_static_unionWar_com_gzbz_protobuf_S2C_WarBattleShopLv_9730_descriptor;
         }

         public S2C_WarBattleShopLv_9730 getDefaultInstanceForType() {
            return UnionWarMsg.S2C_WarBattleShopLv_9730.getDefaultInstance();
         }

         public S2C_WarBattleShopLv_9730 build() {
            S2C_WarBattleShopLv_9730 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarBattleShopLv_9730 buildPartial() {
            S2C_WarBattleShopLv_9730 result = new S2C_WarBattleShopLv_9730(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.exp_ = this.exp_;
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
            if (other instanceof S2C_WarBattleShopLv_9730) {
               return this.mergeFrom((S2C_WarBattleShopLv_9730)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarBattleShopLv_9730 other) {
            if (other == UnionWarMsg.S2C_WarBattleShopLv_9730.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLv()) {
               return false;
            } else {
               return this.hasExp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarBattleShopLv_9730 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarBattleShopLv_9730)UnionWarMsg.S2C_WarBattleShopLv_9730.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarBattleShopLv_9730)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 1;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 2;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -3;
            this.exp_ = 0;
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

   public interface C2S_WarAgainstList_9701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarAttackLogs_9707OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarBattleAchievementList_9723OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarBattleCommitAchievementList_9725OrBuilder extends MessageOrBuilder {
      boolean hasAchievementId();

      int getAchievementId();
   }

   public interface C2S_WarBattleRecordList_9719OrBuilder extends MessageOrBuilder {
      boolean hasSize();

      int getSize();
   }

   public interface C2S_WarBattleShopLv_9729OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarBattle_9715OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasStar();

      int getStar();
   }

   public interface C2S_WarBox_9709OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarGetBox_9711OrBuilder extends MessageOrBuilder {
      boolean hasBoxPosition();

      int getBoxPosition();
   }

   public interface C2S_WarInfo_9703OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarRankList_9713OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarStrongholdList_9705OrBuilder extends MessageOrBuilder {
      boolean hasSize();

      int getSize();
   }

   public interface S2C_AchievementNotify_9728OrBuilder extends MessageOrBuilder {
      boolean hasAchievements();

      WarBattleAchievementData getAchievements();

      WarBattleAchievementDataOrBuilder getAchievementsOrBuilder();
   }

   public interface S2C_WarAgainstList_9702OrBuilder extends MessageOrBuilder {
      List<WarAgainstData> getAgainstListList();

      WarAgainstData getAgainstList(int index);

      int getAgainstListCount();

      List<? extends WarAgainstDataOrBuilder> getAgainstListOrBuilderList();

      WarAgainstDataOrBuilder getAgainstListOrBuilder(int index);
   }

   public interface S2C_WarAttackLogs_9708OrBuilder extends MessageOrBuilder {
      List<WarAttackLogData> getLogsList();

      WarAttackLogData getLogs(int index);

      int getLogsCount();

      List<? extends WarAttackLogDataOrBuilder> getLogsOrBuilderList();

      WarAttackLogDataOrBuilder getLogsOrBuilder(int index);
   }

   public interface S2C_WarBattleAchievementList_9724OrBuilder extends MessageOrBuilder {
      List<WarBattleAchievementData> getAchievementsList();

      WarBattleAchievementData getAchievements(int index);

      int getAchievementsCount();

      List<? extends WarBattleAchievementDataOrBuilder> getAchievementsOrBuilderList();

      WarBattleAchievementDataOrBuilder getAchievementsOrBuilder(int index);
   }

   public interface S2C_WarBattleCommitAchievementList_9726OrBuilder extends MessageOrBuilder {
      boolean hasAchievementId();

      int getAchievementId();
   }

   public interface S2C_WarBattleRecordList_9720OrBuilder extends MessageOrBuilder {
      boolean hasSize();

      int getSize();

      List<WarStrongholdRecordData> getStrongholdList();

      WarStrongholdRecordData getStronghold(int index);

      int getStrongholdCount();

      List<? extends WarStrongholdRecordDataOrBuilder> getStrongholdOrBuilderList();

      WarStrongholdRecordDataOrBuilder getStrongholdOrBuilder(int index);
   }

   public interface S2C_WarBattleRecord_9722OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasRecord();

      WarBattleRecordData getRecord();

      WarBattleRecordDataOrBuilder getRecordOrBuilder();
   }

   public interface S2C_WarBattleShopLv_9730OrBuilder extends MessageOrBuilder {
      boolean hasLv();

      int getLv();

      boolean hasExp();

      int getExp();
   }

   public interface S2C_WarBattle_9716OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasStar();

      int getStar();
   }

   public interface S2C_WarBox_9710OrBuilder extends MessageOrBuilder {
      boolean hasBoxSize();

      int getBoxSize();

      boolean hasBoxId();

      int getBoxId();

      List<WarBoxData> getBoxesList();

      WarBoxData getBoxes(int index);

      int getBoxesCount();

      List<? extends WarBoxDataOrBuilder> getBoxesOrBuilderList();

      WarBoxDataOrBuilder getBoxesOrBuilder(int index);

      boolean hasEndTime();

      int getEndTime();

      List<Integer> getActiveMemberList();

      int getActiveMemberCount();

      int getActiveMember(int index);
   }

   public interface S2C_WarGetBox_9712OrBuilder extends MessageOrBuilder {
      boolean hasBox();

      WarBoxData getBox();

      WarBoxDataOrBuilder getBoxOrBuilder();
   }

   public interface S2C_WarInfo_9704OrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      int getStatus();

      boolean hasOurAgainstData();

      WarAgainstData getOurAgainstData();

      WarAgainstDataOrBuilder getOurAgainstDataOrBuilder();

      List<WarStrongholdData> getMyStrongholdListList();

      WarStrongholdData getMyStrongholdList(int index);

      int getMyStrongholdListCount();

      List<? extends WarStrongholdDataOrBuilder> getMyStrongholdListOrBuilderList();

      WarStrongholdDataOrBuilder getMyStrongholdListOrBuilder(int index);

      boolean hasBuffLv();

      int getBuffLv();
   }

   public interface S2C_WarRankList_9714OrBuilder extends MessageOrBuilder {
      List<WarRankData> getRanksList();

      WarRankData getRanks(int index);

      int getRanksCount();

      List<? extends WarRankDataOrBuilder> getRanksOrBuilderList();

      WarRankDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_WarStrongholdData_9718OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasWarStrongholdData();

      WarStrongholdData getWarStrongholdData();

      WarStrongholdDataOrBuilder getWarStrongholdDataOrBuilder();
   }

   public interface S2C_WarStrongholdList_9706OrBuilder extends MessageOrBuilder {
      boolean hasSize();

      int getSize();

      List<WarStrongholdData> getInfoListList();

      WarStrongholdData getInfoList(int index);

      int getInfoListCount();

      List<? extends WarStrongholdDataOrBuilder> getInfoListOrBuilderList();

      WarStrongholdDataOrBuilder getInfoListOrBuilder(int index);
   }

   public interface WarAgainstDataOrBuilder extends MessageOrBuilder {
      boolean hasLeft();

      WarAgainstUnionData getLeft();

      WarAgainstUnionDataOrBuilder getLeftOrBuilder();

      boolean hasRight();

      WarAgainstUnionData getRight();

      WarAgainstUnionDataOrBuilder getRightOrBuilder();
   }

   public interface WarAgainstUnionDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasServer();

      int getServer();

      boolean hasRank();

      int getRank();

      boolean hasStar();

      int getStar();
   }

   public interface WarAttackLogDataOrBuilder extends MessageOrBuilder {
      boolean hasTime();

      int getTime();

      boolean hasContent();

      String getContent();

      ByteString getContentBytes();

      boolean hasAttackPlayerId();

      int getAttackPlayerId();

      boolean hasHoldPlayerId();

      int getHoldPlayerId();
   }

   public interface WarBattleAchievementDataOrBuilder extends MessageOrBuilder {
      boolean hasAchievementId();

      int getAchievementId();

      boolean hasState();

      int getState();

      boolean hasProgress();

      int getProgress();
   }

   public interface WarBattleRecordDataOrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasPower();

      long getPower();

      boolean hasStar();

      int getStar();

      boolean hasTime();

      int getTime();

      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);

      boolean hasIsWin();

      boolean getIsWin();

      boolean hasServerId();

      int getServerId();
   }

   public interface WarBoxDataOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      List<CommonMsg.ItemInfo> getItemList();

      CommonMsg.ItemInfo getItem(int index);

      int getItemCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder(int index);
   }

   public interface WarRankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasStar();

      int getStar();

      boolean hasRecord();

      int getRecord();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasLevel();

      int getLevel();

      boolean hasServerId();

      int getServerId();
   }

   public interface WarStrongholdDataOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasPower();

      long getPower();

      boolean hasStar();

      int getStar();

      boolean hasChallengeCount();

      int getChallengeCount();

      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);

      boolean hasFighting();

      boolean getFighting();
   }

   public interface WarStrongholdRecordDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      List<WarBattleRecordData> getRecordsList();

      WarBattleRecordData getRecords(int index);

      int getRecordsCount();

      List<? extends WarBattleRecordDataOrBuilder> getRecordsOrBuilderList();

      WarBattleRecordDataOrBuilder getRecordsOrBuilder(int index);
   }
}
