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

public final class StonehengeMsg {
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private StonehengeMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010StoneHenge.proto\u0012\u001fstonehengeMsg.com.gzbz.protobuf\u001a\fcommon.proto\"\u001a\n\u0018C2S_StonehengeMain_22901\"ä\u0002\n\u0018S2C_StonehengeMain_22902\u0012\f\n\u0004hard\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007maxHard\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006passId\u0018\u0003 \u0003(\u0005\u0012\u001f\n\u0005items\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u000e\n\u0006isPass\u0018\u0005 \u0002(\b\u0012=\n\u0004hero\u0018\u0006 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012\f\n\u0004buff\u0018\u0007 \u0003(\u0005\u0012\f\n\u0004time\u0018\b \u0002(\u0005\u0012\u000e\n\u0006deBuff\u0018\t \u0003(\u0005\u0012\u000e\n\u0006waitId\u0018\n \u0002(\u0005\u0012\u0012\n\nreviveTime\u0018\u000b \u0002(\u0005\u0012\f\n\u0004type\u0018\f \u0002(\u0005\u0012\u000e\n\u0006moveId\u0018\r \u0003(\u0005\u0012\u0010\n\bcanSweep\u0018\u000e \u0002(\b\u0012\u0014\n\fisPassNormal\u0018\u000f \u0002(\b\u0012\u0013\n\u000bmaxPassHard\u0018\u0010 \u0002(\u0005\"Q\n\u000eStonehengeHero\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0011\n\thpPercent\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005power\u0018\u0003 \u0001(\u0003\u0012\u000b\n\u0003pos\u0018\u0004 \u0001(\u0005\"N\n\u001dC2S_StonehengeChallenge_22903\u0012\u000f\n\u0007levelId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006status\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005\"-\n\u001fC2S_StonehengeTriggerRoom_22905\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"¯\u0001\n\u001fS2C_StonehengeTriggerRoom_22906\u0012I\n\nbattleData\u0018\u0001 \u0001(\u000b25.stonehengeMsg.com.gzbz.protobuf.StonehengeBattleData\u0012\u001f\n\u0005items\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u000e\n\u0006buffId\u0018\u0003 \u0003(\u0005\u0012\u0010\n\bresumeId\u0018\u0004 \u0003(\u0005\"\u00ad\u0002\n\u0014StonehengeBattleData\u0012\u000f\n\u0007fightId\u0018\u0001 \u0001(\u0005\u0012@\n\u0007myHero1\u0018\u0002 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012@\n\u0007myHero2\u0018\u0003 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012?\n\u0006enemy1\u0018\u0004 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012?\n\u0006enemy2\u0018\u0005 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\"o\n\u001aS2C_StonehengeResume_22908\u0012=\n\u0004hero\u0018\u0001 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012\u0012\n\nreviveTime\u0018\u0002 \u0002(\u0005\",\n\u001aS2C_StonehengeDeBuff_22909\u0012\u000e\n\u0006buffId\u0018\u0001 \u0003(\u0005\"*\n\u0018C2S_StonehengePass_22910\u0012\u000e\n\u0006status\u0018\u0001 \u0001(\b\",\n\u0018C2S_StonehengeHero_22911\u0012\u0010\n\bheroCode\u0018\u0001 \u0003(\u0005\"Y\n\u0018S2C_StonehengeHero_22912\u0012=\n\u0004hero\u0018\u0001 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\"-\n\u0019C2S_StonehengeQuery_22913\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\";\n\u0019S2C_StonehengeQuery_22914\u0012\u001e\n\u0004info\u0018\u0001 \u0002(\u000b2\u0010.common.HeroInfo\".\n\u001aC2S_StonehengeRevive_22915\u0012\u0010\n\bheroCode\u0018\u0001 \u0003(\u0005\"\u001a\n\u0018C2S_StonehengeRank_22916\"\u008e\u0001\n\u0018S2C_StonehengeRank_22917\u00127\n\u0004info\u0018\u0002 \u0003(\u000b2).stonehengeMsg.com.gzbz.protobuf.RankInfo\u00129\n\u0006myRank\u0018\u0003 \u0002(\u000b2).stonehengeMsg.com.gzbz.protobuf.RankInfo\"¤\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0006 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0007 \u0002(\u0005\u0012\f\n\u0004hard\u0018\b \u0002(\u0005\u0012\u000f\n\u0007explore\u0018\t \u0002(\u0005\u0012\f\n\u0004time\u0018\n \u0002(\u0005\"N\n\u001fS2CR_StonehengeUpdateRank_22918\u0012\f\n\u0004hard\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007explore\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0002(\u0005\"6\n\u0019C2S_StonehengeEvent_22919\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005param\u0018\u0002 \u0003(\u0005\"\u0098\u0001\n\u0019S2C_StonehengeEvent_22920\u0012\u000e\n\u0006passId\u0018\u0001 \u0003(\u0005\u0012\u000e\n\u0006moveId\u0018\u0002 \u0003(\u0005\u0012\f\n\u0004buff\u0018\u0003 \u0003(\u0005\u0012=\n\u0004hero\u0018\u0004 \u0003(\u000b2/.stonehengeMsg.com.gzbz.protobuf.StonehengeHero\u0012\u000e\n\u0006isPass\u0018\u0005 \u0001(\b\"(\n\u001aC2S_StonehengeInRoom_22921\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005B$\n\u0011com.gzbz.protobufB\rStonehengeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor, new String[0]);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor, new String[]{"Hard", "MaxHard", "PassId", "Items", "IsPass", "Hero", "Buff", "Time", "DeBuff", "WaitId", "ReviveTime", "Type", "MoveId", "CanSweep", "IsPassNormal", "MaxPassHard"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor, new String[]{"HeroCode", "HpPercent", "Power", "Pos"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor, new String[]{"LevelId", "Status", "Type"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor, new String[]{"Id"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor, new String[]{"BattleData", "Items", "BuffId", "ResumeId"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor, new String[]{"FightId", "MyHero1", "MyHero2", "Enemy1", "Enemy2"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor, new String[]{"Hero", "ReviveTime"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor, new String[]{"BuffId"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor, new String[]{"Status"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor, new String[]{"HeroCode"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor, new String[]{"Hero"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor, new String[]{"HeroCode"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor, new String[]{"Info"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor, new String[]{"HeroCode"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor, new String[0]);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor, new String[]{"Info", "MyRank"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "PlayerId", "Lv", "Head", "Name", "ServerId", "HeadFrame", "Hard", "Explore", "Time"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor, new String[]{"Hard", "Explore", "Time"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor, new String[]{"Id", "Param"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor, new String[]{"PassId", "MoveId", "Buff", "Hero", "IsPass"});
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor, new String[]{"Id"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_StonehengeMain_22901 extends GeneratedMessageV3 implements C2S_StonehengeMain_22901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeMain_22901 DEFAULT_INSTANCE = new C2S_StonehengeMain_22901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeMain_22901> PARSER = new AbstractParser<C2S_StonehengeMain_22901>() {
         public C2S_StonehengeMain_22901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeMain_22901(input, extensionRegistry);
         }
      };

      private C2S_StonehengeMain_22901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeMain_22901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeMain_22901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeMain_22901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeMain_22901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StonehengeMain_22901)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeMain_22901 other = (C2S_StonehengeMain_22901)obj;
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

      public static C2S_StonehengeMain_22901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeMain_22901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeMain_22901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeMain_22901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeMain_22901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeMain_22901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeMain_22901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeMain_22901 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeMain_22901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeMain_22901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeMain_22901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeMain_22901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeMain_22901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeMain_22901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeMain_22901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeMain_22901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeMain_22901> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeMain_22901> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeMain_22901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeMain_22901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeMain_22901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeMain_22901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeMain_22901_descriptor;
         }

         public C2S_StonehengeMain_22901 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeMain_22901.getDefaultInstance();
         }

         public C2S_StonehengeMain_22901 build() {
            C2S_StonehengeMain_22901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeMain_22901 buildPartial() {
            C2S_StonehengeMain_22901 result = new C2S_StonehengeMain_22901(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StonehengeMain_22901) {
               return this.mergeFrom((C2S_StonehengeMain_22901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeMain_22901 other) {
            if (other == StonehengeMsg.C2S_StonehengeMain_22901.getDefaultInstance()) {
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
            C2S_StonehengeMain_22901 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeMain_22901)StonehengeMsg.C2S_StonehengeMain_22901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeMain_22901)e.getUnfinishedMessage();
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

   public static final class S2C_StonehengeMain_22902 extends GeneratedMessageV3 implements S2C_StonehengeMain_22902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HARD_FIELD_NUMBER = 1;
      private int hard_;
      public static final int MAXHARD_FIELD_NUMBER = 2;
      private int maxHard_;
      public static final int PASSID_FIELD_NUMBER = 3;
      private Internal.IntList passId_;
      public static final int ITEMS_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> items_;
      public static final int ISPASS_FIELD_NUMBER = 5;
      private boolean isPass_;
      public static final int HERO_FIELD_NUMBER = 6;
      private List<StonehengeHero> hero_;
      public static final int BUFF_FIELD_NUMBER = 7;
      private Internal.IntList buff_;
      public static final int TIME_FIELD_NUMBER = 8;
      private int time_;
      public static final int DEBUFF_FIELD_NUMBER = 9;
      private Internal.IntList deBuff_;
      public static final int WAITID_FIELD_NUMBER = 10;
      private int waitId_;
      public static final int REVIVETIME_FIELD_NUMBER = 11;
      private int reviveTime_;
      public static final int TYPE_FIELD_NUMBER = 12;
      private int type_;
      public static final int MOVEID_FIELD_NUMBER = 13;
      private Internal.IntList moveId_;
      public static final int CANSWEEP_FIELD_NUMBER = 14;
      private boolean canSweep_;
      public static final int ISPASSNORMAL_FIELD_NUMBER = 15;
      private boolean isPassNormal_;
      public static final int MAXPASSHARD_FIELD_NUMBER = 16;
      private int maxPassHard_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeMain_22902 DEFAULT_INSTANCE = new S2C_StonehengeMain_22902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeMain_22902> PARSER = new AbstractParser<S2C_StonehengeMain_22902>() {
         public S2C_StonehengeMain_22902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeMain_22902(input, extensionRegistry);
         }
      };

      private S2C_StonehengeMain_22902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeMain_22902() {
         this.memoizedIsInitialized = -1;
         this.passId_ = emptyIntList();
         this.items_ = Collections.emptyList();
         this.hero_ = Collections.emptyList();
         this.buff_ = emptyIntList();
         this.deBuff_ = emptyIntList();
         this.moveId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeMain_22902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeMain_22902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hard_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.maxHard_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.passId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.passId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.isPass_ = input.readBool();
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.hero_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.buff_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.buff_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buff_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buff_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 64:
                        this.bitField0_ |= 8;
                        this.time_ = input.readInt32();
                        continue;
                     case 72:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.deBuff_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        this.deBuff_.addInt(input.readInt32());
                        continue;
                     case 74:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 256) == 0 && input.getBytesUntilLimit() > 0) {
                           this.deBuff_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.deBuff_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 80:
                        this.bitField0_ |= 16;
                        this.waitId_ = input.readInt32();
                        continue;
                     case 88:
                        this.bitField0_ |= 32;
                        this.reviveTime_ = input.readInt32();
                        continue;
                     case 96:
                        this.bitField0_ |= 64;
                        this.type_ = input.readInt32();
                        continue;
                     case 104:
                        if ((mutable_bitField0_ & 4096) == 0) {
                           this.moveId_ = newIntList();
                           mutable_bitField0_ |= 4096;
                        }

                        this.moveId_.addInt(input.readInt32());
                        continue;
                     case 106:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4096) == 0 && input.getBytesUntilLimit() > 0) {
                           this.moveId_ = newIntList();
                           mutable_bitField0_ |= 4096;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.moveId_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 112:
                        this.bitField0_ |= 128;
                        this.canSweep_ = input.readBool();
                        continue;
                     case 120:
                        this.bitField0_ |= 256;
                        this.isPassNormal_ = input.readBool();
                        continue;
                     case 128:
                        this.bitField0_ |= 512;
                        this.maxPassHard_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.passId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.passId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.buff_.makeImmutable();
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.deBuff_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4096) != 0) {
                  this.moveId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeMain_22902.class, Builder.class);
      }

      public boolean hasHard() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHard() {
         return this.hard_;
      }

      public boolean hasMaxHard() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMaxHard() {
         return this.maxHard_;
      }

      public List<Integer> getPassIdList() {
         return this.passId_;
      }

      public int getPassIdCount() {
         return this.passId_.size();
      }

      public int getPassId(int index) {
         return this.passId_.getInt(index);
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public boolean hasIsPass() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsPass() {
         return this.isPass_;
      }

      public List<StonehengeHero> getHeroList() {
         return this.hero_;
      }

      public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public StonehengeHero getHero(int index) {
         return (StonehengeHero)this.hero_.get(index);
      }

      public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.hero_.get(index);
      }

      public List<Integer> getBuffList() {
         return this.buff_;
      }

      public int getBuffCount() {
         return this.buff_.size();
      }

      public int getBuff(int index) {
         return this.buff_.getInt(index);
      }

      public boolean hasTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public List<Integer> getDeBuffList() {
         return this.deBuff_;
      }

      public int getDeBuffCount() {
         return this.deBuff_.size();
      }

      public int getDeBuff(int index) {
         return this.deBuff_.getInt(index);
      }

      public boolean hasWaitId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getWaitId() {
         return this.waitId_;
      }

      public boolean hasReviveTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getReviveTime() {
         return this.reviveTime_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<Integer> getMoveIdList() {
         return this.moveId_;
      }

      public int getMoveIdCount() {
         return this.moveId_.size();
      }

      public int getMoveId(int index) {
         return this.moveId_.getInt(index);
      }

      public boolean hasCanSweep() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getCanSweep() {
         return this.canSweep_;
      }

      public boolean hasIsPassNormal() {
         return (this.bitField0_ & 256) != 0;
      }

      public boolean getIsPassNormal() {
         return this.isPassNormal_;
      }

      public boolean hasMaxPassHard() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getMaxPassHard() {
         return this.maxPassHard_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxHard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsPass()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWaitId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReviveTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCanSweep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsPassNormal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxPassHard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(1, this.hard_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.maxHard_);
         }

         for(int i = 0; i < this.passId_.size(); ++i) {
            output.writeInt32(3, this.passId_.getInt(i));
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.items_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(5, this.isPass_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.hero_.get(i));
         }

         for(int i = 0; i < this.buff_.size(); ++i) {
            output.writeInt32(7, this.buff_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(8, this.time_);
         }

         for(int i = 0; i < this.deBuff_.size(); ++i) {
            output.writeInt32(9, this.deBuff_.getInt(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(10, this.waitId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(11, this.reviveTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(12, this.type_);
         }

         for(int i = 0; i < this.moveId_.size(); ++i) {
            output.writeInt32(13, this.moveId_.getInt(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(14, this.canSweep_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeBool(15, this.isPassNormal_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(16, this.maxPassHard_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hard_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.maxHard_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.passId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassIdList().size();

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.items_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isPass_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.hero_.get(i));
            }

            dataSize = 0;

            for(int i = 0; i < this.buff_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buff_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.time_);
            }

            dataSize = 0;

            for(int i = 0; i < this.deBuff_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.deBuff_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDeBuffList().size();
            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.waitId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.reviveTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.type_);
            }

            dataSize = 0;

            for(int i = 0; i < this.moveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.moveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMoveIdList().size();
            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(14, this.canSweep_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeBoolSize(15, this.isPassNormal_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.maxPassHard_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeMain_22902)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeMain_22902 other = (S2C_StonehengeMain_22902)obj;
            if (this.hasHard() != other.hasHard()) {
               return false;
            } else if (this.hasHard() && this.getHard() != other.getHard()) {
               return false;
            } else if (this.hasMaxHard() != other.hasMaxHard()) {
               return false;
            } else if (this.hasMaxHard() && this.getMaxHard() != other.getMaxHard()) {
               return false;
            } else if (!this.getPassIdList().equals(other.getPassIdList())) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
               return false;
            } else if (this.hasIsPass() != other.hasIsPass()) {
               return false;
            } else if (this.hasIsPass() && this.getIsPass() != other.getIsPass()) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (!this.getBuffList().equals(other.getBuffList())) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (!this.getDeBuffList().equals(other.getDeBuffList())) {
               return false;
            } else if (this.hasWaitId() != other.hasWaitId()) {
               return false;
            } else if (this.hasWaitId() && this.getWaitId() != other.getWaitId()) {
               return false;
            } else if (this.hasReviveTime() != other.hasReviveTime()) {
               return false;
            } else if (this.hasReviveTime() && this.getReviveTime() != other.getReviveTime()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getMoveIdList().equals(other.getMoveIdList())) {
               return false;
            } else if (this.hasCanSweep() != other.hasCanSweep()) {
               return false;
            } else if (this.hasCanSweep() && this.getCanSweep() != other.getCanSweep()) {
               return false;
            } else if (this.hasIsPassNormal() != other.hasIsPassNormal()) {
               return false;
            } else if (this.hasIsPassNormal() && this.getIsPassNormal() != other.getIsPassNormal()) {
               return false;
            } else if (this.hasMaxPassHard() != other.hasMaxPassHard()) {
               return false;
            } else if (this.hasMaxPassHard() && this.getMaxPassHard() != other.getMaxPassHard()) {
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
            if (this.hasHard()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHard();
            }

            if (this.hasMaxHard()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMaxHard();
            }

            if (this.getPassIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPassIdList().hashCode();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            if (this.hasIsPass()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPass());
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.getBuffCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getBuffList().hashCode();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTime();
            }

            if (this.getDeBuffCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getDeBuffList().hashCode();
            }

            if (this.hasWaitId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getWaitId();
            }

            if (this.hasReviveTime()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getReviveTime();
            }

            if (this.hasType()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getType();
            }

            if (this.getMoveIdCount() > 0) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getMoveIdList().hashCode();
            }

            if (this.hasCanSweep()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + Internal.hashBoolean(this.getCanSweep());
            }

            if (this.hasIsPassNormal()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPassNormal());
            }

            if (this.hasMaxPassHard()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getMaxPassHard();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeMain_22902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeMain_22902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeMain_22902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeMain_22902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeMain_22902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeMain_22902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeMain_22902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeMain_22902 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeMain_22902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeMain_22902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeMain_22902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeMain_22902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeMain_22902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeMain_22902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeMain_22902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeMain_22902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeMain_22902> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeMain_22902> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeMain_22902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeMain_22902OrBuilder {
         private int bitField0_;
         private int hard_;
         private int maxHard_;
         private Internal.IntList passId_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;
         private boolean isPass_;
         private List<StonehengeHero> hero_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> heroBuilder_;
         private Internal.IntList buff_;
         private int time_;
         private Internal.IntList deBuff_;
         private int waitId_;
         private int reviveTime_;
         private int type_;
         private Internal.IntList moveId_;
         private boolean canSweep_;
         private boolean isPassNormal_;
         private int maxPassHard_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeMain_22902.class, Builder.class);
         }

         private Builder() {
            this.passId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.items_ = Collections.emptyList();
            this.hero_ = Collections.emptyList();
            this.buff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.deBuff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.moveId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.items_ = Collections.emptyList();
            this.hero_ = Collections.emptyList();
            this.buff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.deBuff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.moveId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeMain_22902.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hard_ = 0;
            this.bitField0_ &= -2;
            this.maxHard_ = 0;
            this.bitField0_ &= -3;
            this.passId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -5;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemsBuilder_.clear();
            }

            this.isPass_ = false;
            this.bitField0_ &= -17;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.heroBuilder_.clear();
            }

            this.buff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -65;
            this.time_ = 0;
            this.bitField0_ &= -129;
            this.deBuff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -257;
            this.waitId_ = 0;
            this.bitField0_ &= -513;
            this.reviveTime_ = 0;
            this.bitField0_ &= -1025;
            this.type_ = 0;
            this.bitField0_ &= -2049;
            this.moveId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -4097;
            this.canSweep_ = false;
            this.bitField0_ &= -8193;
            this.isPassNormal_ = false;
            this.bitField0_ &= -16385;
            this.maxPassHard_ = 0;
            this.bitField0_ &= -32769;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeMain_22902_descriptor;
         }

         public S2C_StonehengeMain_22902 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeMain_22902.getDefaultInstance();
         }

         public S2C_StonehengeMain_22902 build() {
            S2C_StonehengeMain_22902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeMain_22902 buildPartial() {
            S2C_StonehengeMain_22902 result = new S2C_StonehengeMain_22902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hard_ = this.hard_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.maxHard_ = this.maxHard_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.passId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.passId_ = this.passId_;
            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -9;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isPass_ = this.isPass_;
               to_bitField0_ |= 4;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -33;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((this.bitField0_ & 64) != 0) {
               this.buff_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.buff_ = this.buff_;
            if ((from_bitField0_ & 128) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 256) != 0) {
               this.deBuff_.makeImmutable();
               this.bitField0_ &= -257;
            }

            result.deBuff_ = this.deBuff_;
            if ((from_bitField0_ & 512) != 0) {
               result.waitId_ = this.waitId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.reviveTime_ = this.reviveTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 64;
            }

            if ((this.bitField0_ & 4096) != 0) {
               this.moveId_.makeImmutable();
               this.bitField0_ &= -4097;
            }

            result.moveId_ = this.moveId_;
            if ((from_bitField0_ & 8192) != 0) {
               result.canSweep_ = this.canSweep_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.isPassNormal_ = this.isPassNormal_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.maxPassHard_ = this.maxPassHard_;
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
            if (other instanceof S2C_StonehengeMain_22902) {
               return this.mergeFrom((S2C_StonehengeMain_22902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeMain_22902 other) {
            if (other == StonehengeMsg.S2C_StonehengeMain_22902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHard()) {
                  this.setHard(other.getHard());
               }

               if (other.hasMaxHard()) {
                  this.setMaxHard(other.getMaxHard());
               }

               if (!other.passId_.isEmpty()) {
                  if (this.passId_.isEmpty()) {
                     this.passId_ = other.passId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensurePassIdIsMutable();
                     this.passId_.addAll(other.passId_);
                  }

                  this.onChanged();
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -9;
                     this.itemsBuilder_ = StonehengeMsg.S2C_StonehengeMain_22902.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               if (other.hasIsPass()) {
                  this.setIsPass(other.getIsPass());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -33;
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
                     this.bitField0_ &= -33;
                     this.heroBuilder_ = StonehengeMsg.S2C_StonehengeMain_22902.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (!other.buff_.isEmpty()) {
                  if (this.buff_.isEmpty()) {
                     this.buff_ = other.buff_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureBuffIsMutable();
                     this.buff_.addAll(other.buff_);
                  }

                  this.onChanged();
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (!other.deBuff_.isEmpty()) {
                  if (this.deBuff_.isEmpty()) {
                     this.deBuff_ = other.deBuff_;
                     this.bitField0_ &= -257;
                  } else {
                     this.ensureDeBuffIsMutable();
                     this.deBuff_.addAll(other.deBuff_);
                  }

                  this.onChanged();
               }

               if (other.hasWaitId()) {
                  this.setWaitId(other.getWaitId());
               }

               if (other.hasReviveTime()) {
                  this.setReviveTime(other.getReviveTime());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.moveId_.isEmpty()) {
                  if (this.moveId_.isEmpty()) {
                     this.moveId_ = other.moveId_;
                     this.bitField0_ &= -4097;
                  } else {
                     this.ensureMoveIdIsMutable();
                     this.moveId_.addAll(other.moveId_);
                  }

                  this.onChanged();
               }

               if (other.hasCanSweep()) {
                  this.setCanSweep(other.getCanSweep());
               }

               if (other.hasIsPassNormal()) {
                  this.setIsPassNormal(other.getIsPassNormal());
               }

               if (other.hasMaxPassHard()) {
                  this.setMaxPassHard(other.getMaxPassHard());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHard()) {
               return false;
            } else if (!this.hasMaxHard()) {
               return false;
            } else if (!this.hasIsPass()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else if (!this.hasWaitId()) {
               return false;
            } else if (!this.hasReviveTime()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasCanSweep()) {
               return false;
            } else if (!this.hasIsPassNormal()) {
               return false;
            } else if (!this.hasMaxPassHard()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StonehengeMain_22902 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeMain_22902)StonehengeMsg.S2C_StonehengeMain_22902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeMain_22902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHard() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHard() {
            return this.hard_;
         }

         public Builder setHard(int value) {
            this.bitField0_ |= 1;
            this.hard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHard() {
            this.bitField0_ &= -2;
            this.hard_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxHard() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMaxHard() {
            return this.maxHard_;
         }

         public Builder setMaxHard(int value) {
            this.bitField0_ |= 2;
            this.maxHard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxHard() {
            this.bitField0_ &= -3;
            this.maxHard_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePassIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.passId_ = StonehengeMsg.S2C_StonehengeMain_22902.mutableCopy(this.passId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getPassIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.passId_) : this.passId_);
         }

         public int getPassIdCount() {
            return this.passId_.size();
         }

         public int getPassId(int index) {
            return this.passId_.getInt(index);
         }

         public Builder setPassId(int index, int value) {
            this.ensurePassIdIsMutable();
            this.passId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassId(int value) {
            this.ensurePassIdIsMutable();
            this.passId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassId(Iterable<? extends Integer> values) {
            this.ensurePassIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passId_);
            this.onChanged();
            return this;
         }

         public Builder clearPassId() {
            this.passId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public boolean hasIsPass() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsPass() {
            return this.isPass_;
         }

         public Builder setIsPass(boolean value) {
            this.bitField0_ |= 16;
            this.isPass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPass() {
            this.bitField0_ &= -17;
            this.isPass_ = false;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 32;
            }

         }

         public List<StonehengeHero> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public StonehengeHero getHero(int index) {
            return this.heroBuilder_ == null ? (StonehengeHero)this.hero_.get(index) : (StonehengeHero)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, StonehengeHero value) {
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

         public Builder setHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(StonehengeHero value) {
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

         public Builder addHero(int index, StonehengeHero value) {
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

         public Builder addHero(StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends StonehengeHero> values) {
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
               this.bitField0_ &= -33;
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

         public StonehengeHero.Builder getHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (StonehengeHeroOrBuilder)this.hero_.get(index) : (StonehengeHeroOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public StonehengeHero.Builder addHeroBuilder() {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         private void ensureBuffIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.buff_ = StonehengeMsg.S2C_StonehengeMain_22902.mutableCopy(this.buff_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getBuffList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.buff_) : this.buff_);
         }

         public int getBuffCount() {
            return this.buff_.size();
         }

         public int getBuff(int index) {
            return this.buff_.getInt(index);
         }

         public Builder setBuff(int index, int value) {
            this.ensureBuffIsMutable();
            this.buff_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuff(int value) {
            this.ensureBuffIsMutable();
            this.buff_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuff(Iterable<? extends Integer> values) {
            this.ensureBuffIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buff_);
            this.onChanged();
            return this;
         }

         public Builder clearBuff() {
            this.buff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 128;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -129;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDeBuffIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.deBuff_ = StonehengeMsg.S2C_StonehengeMain_22902.mutableCopy(this.deBuff_);
               this.bitField0_ |= 256;
            }

         }

         public List<Integer> getDeBuffList() {
            return (List<Integer>)((this.bitField0_ & 256) != 0 ? Collections.unmodifiableList(this.deBuff_) : this.deBuff_);
         }

         public int getDeBuffCount() {
            return this.deBuff_.size();
         }

         public int getDeBuff(int index) {
            return this.deBuff_.getInt(index);
         }

         public Builder setDeBuff(int index, int value) {
            this.ensureDeBuffIsMutable();
            this.deBuff_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDeBuff(int value) {
            this.ensureDeBuffIsMutable();
            this.deBuff_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDeBuff(Iterable<? extends Integer> values) {
            this.ensureDeBuffIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.deBuff_);
            this.onChanged();
            return this;
         }

         public Builder clearDeBuff() {
            this.deBuff_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -257;
            this.onChanged();
            return this;
         }

         public boolean hasWaitId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getWaitId() {
            return this.waitId_;
         }

         public Builder setWaitId(int value) {
            this.bitField0_ |= 512;
            this.waitId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWaitId() {
            this.bitField0_ &= -513;
            this.waitId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReviveTime() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getReviveTime() {
            return this.reviveTime_;
         }

         public Builder setReviveTime(int value) {
            this.bitField0_ |= 1024;
            this.reviveTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReviveTime() {
            this.bitField0_ &= -1025;
            this.reviveTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2048;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2049;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMoveIdIsMutable() {
            if ((this.bitField0_ & 4096) == 0) {
               this.moveId_ = StonehengeMsg.S2C_StonehengeMain_22902.mutableCopy(this.moveId_);
               this.bitField0_ |= 4096;
            }

         }

         public List<Integer> getMoveIdList() {
            return (List<Integer>)((this.bitField0_ & 4096) != 0 ? Collections.unmodifiableList(this.moveId_) : this.moveId_);
         }

         public int getMoveIdCount() {
            return this.moveId_.size();
         }

         public int getMoveId(int index) {
            return this.moveId_.getInt(index);
         }

         public Builder setMoveId(int index, int value) {
            this.ensureMoveIdIsMutable();
            this.moveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMoveId(int value) {
            this.ensureMoveIdIsMutable();
            this.moveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMoveId(Iterable<? extends Integer> values) {
            this.ensureMoveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.moveId_);
            this.onChanged();
            return this;
         }

         public Builder clearMoveId() {
            this.moveId_ = StonehengeMsg.S2C_StonehengeMain_22902.emptyIntList();
            this.bitField0_ &= -4097;
            this.onChanged();
            return this;
         }

         public boolean hasCanSweep() {
            return (this.bitField0_ & 8192) != 0;
         }

         public boolean getCanSweep() {
            return this.canSweep_;
         }

         public Builder setCanSweep(boolean value) {
            this.bitField0_ |= 8192;
            this.canSweep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCanSweep() {
            this.bitField0_ &= -8193;
            this.canSweep_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsPassNormal() {
            return (this.bitField0_ & 16384) != 0;
         }

         public boolean getIsPassNormal() {
            return this.isPassNormal_;
         }

         public Builder setIsPassNormal(boolean value) {
            this.bitField0_ |= 16384;
            this.isPassNormal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPassNormal() {
            this.bitField0_ &= -16385;
            this.isPassNormal_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasMaxPassHard() {
            return (this.bitField0_ & '耀') != 0;
         }

         public int getMaxPassHard() {
            return this.maxPassHard_;
         }

         public Builder setMaxPassHard(int value) {
            this.bitField0_ |= 32768;
            this.maxPassHard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPassHard() {
            this.bitField0_ &= -32769;
            this.maxPassHard_ = 0;
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

   public static final class StonehengeHero extends GeneratedMessageV3 implements StonehengeHeroOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int HPPERCENT_FIELD_NUMBER = 2;
      private int hpPercent_;
      public static final int POWER_FIELD_NUMBER = 3;
      private long power_;
      public static final int POS_FIELD_NUMBER = 4;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final StonehengeHero DEFAULT_INSTANCE = new StonehengeHero();
      /** @deprecated */
      @Deprecated
      public static final Parser<StonehengeHero> PARSER = new AbstractParser<StonehengeHero>() {
         public StonehengeHero parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new StonehengeHero(input, extensionRegistry);
         }
      };

      private StonehengeHero(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private StonehengeHero() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new StonehengeHero();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private StonehengeHero(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.hpPercent_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.power_ = input.readInt64();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_fieldAccessorTable.ensureFieldAccessorsInitialized(StonehengeHero.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasHpPercent() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHpPercent() {
         return this.hpPercent_;
      }

      public boolean hasPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 8) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hpPercent_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.power_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.pos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hpPercent_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.power_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof StonehengeHero)) {
            return super.equals(obj);
         } else {
            StonehengeHero other = (StonehengeHero)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasHpPercent() != other.hasHpPercent()) {
               return false;
            } else if (this.hasHpPercent() && this.getHpPercent() != other.getHpPercent()) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasHpPercent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHpPercent();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasPos()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static StonehengeHero parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data);
      }

      public static StonehengeHero parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeHero parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data);
      }

      public static StonehengeHero parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeHero parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data);
      }

      public static StonehengeHero parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeHero parseFrom(InputStream input) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StonehengeHero parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static StonehengeHero parseDelimitedFrom(InputStream input) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static StonehengeHero parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static StonehengeHero parseFrom(CodedInputStream input) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StonehengeHero parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(StonehengeHero prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static StonehengeHero getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StonehengeHero> parser() {
         return PARSER;
      }

      public Parser<StonehengeHero> getParserForType() {
         return PARSER;
      }

      public StonehengeHero getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StonehengeHeroOrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int hpPercent_;
         private long power_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_fieldAccessorTable.ensureFieldAccessorsInitialized(StonehengeHero.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.StonehengeHero.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.hpPercent_ = 0;
            this.bitField0_ &= -3;
            this.power_ = 0L;
            this.bitField0_ &= -5;
            this.pos_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeHero_descriptor;
         }

         public StonehengeHero getDefaultInstanceForType() {
            return StonehengeMsg.StonehengeHero.getDefaultInstance();
         }

         public StonehengeHero build() {
            StonehengeHero result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public StonehengeHero buildPartial() {
            StonehengeHero result = new StonehengeHero(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hpPercent_ = this.hpPercent_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof StonehengeHero) {
               return this.mergeFrom((StonehengeHero)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(StonehengeHero other) {
            if (other == StonehengeMsg.StonehengeHero.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasHpPercent()) {
                  this.setHpPercent(other.getHpPercent());
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
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
            StonehengeHero parsedMessage = null;

            try {
               parsedMessage = (StonehengeHero)StonehengeMsg.StonehengeHero.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (StonehengeHero)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHpPercent() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHpPercent() {
            return this.hpPercent_;
         }

         public Builder setHpPercent(int value) {
            this.bitField0_ |= 2;
            this.hpPercent_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpPercent() {
            this.bitField0_ &= -3;
            this.hpPercent_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 4;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -5;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 8;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -9;
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

   public static final class C2S_StonehengeChallenge_22903 extends GeneratedMessageV3 implements C2S_StonehengeChallenge_22903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVELID_FIELD_NUMBER = 1;
      private int levelId_;
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeChallenge_22903 DEFAULT_INSTANCE = new C2S_StonehengeChallenge_22903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeChallenge_22903> PARSER = new AbstractParser<C2S_StonehengeChallenge_22903>() {
         public C2S_StonehengeChallenge_22903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeChallenge_22903(input, extensionRegistry);
         }
      };

      private C2S_StonehengeChallenge_22903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeChallenge_22903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeChallenge_22903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeChallenge_22903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.levelId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.status_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeChallenge_22903.class, Builder.class);
      }

      public boolean hasLevelId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevelId() {
         return this.levelId_;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasLevelId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.levelId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.status_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.levelId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.status_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengeChallenge_22903)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeChallenge_22903 other = (C2S_StonehengeChallenge_22903)obj;
            if (this.hasLevelId() != other.hasLevelId()) {
               return false;
            } else if (this.hasLevelId() && this.getLevelId() != other.getLevelId()) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
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
            if (this.hasLevelId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLevelId();
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStatus();
            }

            if (this.hasType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeChallenge_22903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeChallenge_22903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeChallenge_22903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeChallenge_22903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeChallenge_22903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeChallenge_22903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeChallenge_22903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeChallenge_22903> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeChallenge_22903> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeChallenge_22903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeChallenge_22903OrBuilder {
         private int bitField0_;
         private int levelId_;
         private int status_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeChallenge_22903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeChallenge_22903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.levelId_ = 0;
            this.bitField0_ &= -2;
            this.status_ = 0;
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeChallenge_22903_descriptor;
         }

         public C2S_StonehengeChallenge_22903 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeChallenge_22903.getDefaultInstance();
         }

         public C2S_StonehengeChallenge_22903 build() {
            C2S_StonehengeChallenge_22903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeChallenge_22903 buildPartial() {
            C2S_StonehengeChallenge_22903 result = new C2S_StonehengeChallenge_22903(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.levelId_ = this.levelId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.status_ = this.status_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_StonehengeChallenge_22903) {
               return this.mergeFrom((C2S_StonehengeChallenge_22903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeChallenge_22903 other) {
            if (other == StonehengeMsg.C2S_StonehengeChallenge_22903.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLevelId()) {
                  this.setLevelId(other.getLevelId());
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
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
            if (!this.hasLevelId()) {
               return false;
            } else if (!this.hasStatus()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StonehengeChallenge_22903 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeChallenge_22903)StonehengeMsg.C2S_StonehengeChallenge_22903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeChallenge_22903)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLevelId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLevelId() {
            return this.levelId_;
         }

         public Builder setLevelId(int value) {
            this.bitField0_ |= 1;
            this.levelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevelId() {
            this.bitField0_ &= -2;
            this.levelId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 2;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -3;
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 4;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -5;
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

   public static final class C2S_StonehengeTriggerRoom_22905 extends GeneratedMessageV3 implements C2S_StonehengeTriggerRoom_22905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeTriggerRoom_22905 DEFAULT_INSTANCE = new C2S_StonehengeTriggerRoom_22905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeTriggerRoom_22905> PARSER = new AbstractParser<C2S_StonehengeTriggerRoom_22905>() {
         public C2S_StonehengeTriggerRoom_22905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeTriggerRoom_22905(input, extensionRegistry);
         }
      };

      private C2S_StonehengeTriggerRoom_22905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeTriggerRoom_22905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeTriggerRoom_22905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeTriggerRoom_22905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeTriggerRoom_22905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StonehengeTriggerRoom_22905)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeTriggerRoom_22905 other = (C2S_StonehengeTriggerRoom_22905)obj;
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

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeTriggerRoom_22905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeTriggerRoom_22905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeTriggerRoom_22905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeTriggerRoom_22905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeTriggerRoom_22905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeTriggerRoom_22905> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeTriggerRoom_22905> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeTriggerRoom_22905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeTriggerRoom_22905OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeTriggerRoom_22905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeTriggerRoom_22905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeTriggerRoom_22905_descriptor;
         }

         public C2S_StonehengeTriggerRoom_22905 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeTriggerRoom_22905.getDefaultInstance();
         }

         public C2S_StonehengeTriggerRoom_22905 build() {
            C2S_StonehengeTriggerRoom_22905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeTriggerRoom_22905 buildPartial() {
            C2S_StonehengeTriggerRoom_22905 result = new C2S_StonehengeTriggerRoom_22905(this);
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
            if (other instanceof C2S_StonehengeTriggerRoom_22905) {
               return this.mergeFrom((C2S_StonehengeTriggerRoom_22905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeTriggerRoom_22905 other) {
            if (other == StonehengeMsg.C2S_StonehengeTriggerRoom_22905.getDefaultInstance()) {
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
            C2S_StonehengeTriggerRoom_22905 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeTriggerRoom_22905)StonehengeMsg.C2S_StonehengeTriggerRoom_22905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeTriggerRoom_22905)e.getUnfinishedMessage();
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

   public static final class S2C_StonehengeTriggerRoom_22906 extends GeneratedMessageV3 implements S2C_StonehengeTriggerRoom_22906OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEDATA_FIELD_NUMBER = 1;
      private StonehengeBattleData battleData_;
      public static final int ITEMS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> items_;
      public static final int BUFFID_FIELD_NUMBER = 3;
      private Internal.IntList buffId_;
      public static final int RESUMEID_FIELD_NUMBER = 4;
      private Internal.IntList resumeId_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeTriggerRoom_22906 DEFAULT_INSTANCE = new S2C_StonehengeTriggerRoom_22906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeTriggerRoom_22906> PARSER = new AbstractParser<S2C_StonehengeTriggerRoom_22906>() {
         public S2C_StonehengeTriggerRoom_22906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeTriggerRoom_22906(input, extensionRegistry);
         }
      };

      private S2C_StonehengeTriggerRoom_22906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeTriggerRoom_22906() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
         this.buffId_ = emptyIntList();
         this.resumeId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeTriggerRoom_22906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeTriggerRoom_22906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        StonehengeBattleData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.battleData_.toBuilder();
                        }

                        this.battleData_ = (StonehengeBattleData)input.readMessage(StonehengeMsg.StonehengeBattleData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleData_);
                           this.battleData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.buffId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.resumeId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.resumeId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.resumeId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.resumeId_.addInt(input.readInt32());
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
                     this.buffId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.buffId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.resumeId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeTriggerRoom_22906.class, Builder.class);
      }

      public boolean hasBattleData() {
         return (this.bitField0_ & 1) != 0;
      }

      public StonehengeBattleData getBattleData() {
         return this.battleData_ == null ? StonehengeMsg.StonehengeBattleData.getDefaultInstance() : this.battleData_;
      }

      public StonehengeBattleDataOrBuilder getBattleDataOrBuilder() {
         return this.battleData_ == null ? StonehengeMsg.StonehengeBattleData.getDefaultInstance() : this.battleData_;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public List<Integer> getBuffIdList() {
         return this.buffId_;
      }

      public int getBuffIdCount() {
         return this.buffId_.size();
      }

      public int getBuffId(int index) {
         return this.buffId_.getInt(index);
      }

      public List<Integer> getResumeIdList() {
         return this.resumeId_;
      }

      public int getResumeIdCount() {
         return this.resumeId_.size();
      }

      public int getResumeId(int index) {
         return this.resumeId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeMessage(1, this.getBattleData());
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.items_.get(i));
         }

         for(int i = 0; i < this.buffId_.size(); ++i) {
            output.writeInt32(3, this.buffId_.getInt(i));
         }

         for(int i = 0; i < this.resumeId_.size(); ++i) {
            output.writeInt32(4, this.resumeId_.getInt(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattleData());
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.items_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.resumeId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.resumeId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getResumeIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeTriggerRoom_22906)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeTriggerRoom_22906 other = (S2C_StonehengeTriggerRoom_22906)obj;
            if (this.hasBattleData() != other.hasBattleData()) {
               return false;
            } else if (this.hasBattleData() && !this.getBattleData().equals(other.getBattleData())) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
               return false;
            } else if (!this.getBuffIdList().equals(other.getBuffIdList())) {
               return false;
            } else if (!this.getResumeIdList().equals(other.getResumeIdList())) {
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
            if (this.hasBattleData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleData().hashCode();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            if (this.getBuffIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuffIdList().hashCode();
            }

            if (this.getResumeIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResumeIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeTriggerRoom_22906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeTriggerRoom_22906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeTriggerRoom_22906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeTriggerRoom_22906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeTriggerRoom_22906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeTriggerRoom_22906> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeTriggerRoom_22906> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeTriggerRoom_22906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeTriggerRoom_22906OrBuilder {
         private int bitField0_;
         private StonehengeBattleData battleData_;
         private SingleFieldBuilderV3<StonehengeBattleData, StonehengeBattleData.Builder, StonehengeBattleDataOrBuilder> battleDataBuilder_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;
         private Internal.IntList buffId_;
         private Internal.IntList resumeId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeTriggerRoom_22906.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.buffId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.resumeId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.buffId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.resumeId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeTriggerRoom_22906.alwaysUseFieldBuilders) {
               this.getBattleDataFieldBuilder();
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleDataBuilder_ == null) {
               this.battleData_ = null;
            } else {
               this.battleDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemsBuilder_.clear();
            }

            this.buffId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.bitField0_ &= -5;
            this.resumeId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeTriggerRoom_22906_descriptor;
         }

         public S2C_StonehengeTriggerRoom_22906 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeTriggerRoom_22906.getDefaultInstance();
         }

         public S2C_StonehengeTriggerRoom_22906 build() {
            S2C_StonehengeTriggerRoom_22906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeTriggerRoom_22906 buildPartial() {
            S2C_StonehengeTriggerRoom_22906 result = new S2C_StonehengeTriggerRoom_22906(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleDataBuilder_ == null) {
                  result.battleData_ = this.battleData_;
               } else {
                  result.battleData_ = (StonehengeBattleData)this.battleDataBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -3;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
            }

            if ((this.bitField0_ & 4) != 0) {
               this.buffId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.buffId_ = this.buffId_;
            if ((this.bitField0_ & 8) != 0) {
               this.resumeId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.resumeId_ = this.resumeId_;
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
            if (other instanceof S2C_StonehengeTriggerRoom_22906) {
               return this.mergeFrom((S2C_StonehengeTriggerRoom_22906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeTriggerRoom_22906 other) {
            if (other == StonehengeMsg.S2C_StonehengeTriggerRoom_22906.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleData()) {
                  this.mergeBattleData(other.getBattleData());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -3;
                     this.itemsBuilder_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               if (!other.buffId_.isEmpty()) {
                  if (this.buffId_.isEmpty()) {
                     this.buffId_ = other.buffId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBuffIdIsMutable();
                     this.buffId_.addAll(other.buffId_);
                  }

                  this.onChanged();
               }

               if (!other.resumeId_.isEmpty()) {
                  if (this.resumeId_.isEmpty()) {
                     this.resumeId_ = other.resumeId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureResumeIdIsMutable();
                     this.resumeId_.addAll(other.resumeId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StonehengeTriggerRoom_22906 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeTriggerRoom_22906)StonehengeMsg.S2C_StonehengeTriggerRoom_22906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeTriggerRoom_22906)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleData() {
            return (this.bitField0_ & 1) != 0;
         }

         public StonehengeBattleData getBattleData() {
            if (this.battleDataBuilder_ == null) {
               return this.battleData_ == null ? StonehengeMsg.StonehengeBattleData.getDefaultInstance() : this.battleData_;
            } else {
               return (StonehengeBattleData)this.battleDataBuilder_.getMessage();
            }
         }

         public Builder setBattleData(StonehengeBattleData value) {
            if (this.battleDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleData_ = value;
               this.onChanged();
            } else {
               this.battleDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattleData(StonehengeBattleData.Builder builderForValue) {
            if (this.battleDataBuilder_ == null) {
               this.battleData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattleData(StonehengeBattleData value) {
            if (this.battleDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battleData_ != null && this.battleData_ != StonehengeMsg.StonehengeBattleData.getDefaultInstance()) {
                  this.battleData_ = StonehengeMsg.StonehengeBattleData.newBuilder(this.battleData_).mergeFrom(value).buildPartial();
               } else {
                  this.battleData_ = value;
               }

               this.onChanged();
            } else {
               this.battleDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattleData() {
            if (this.battleDataBuilder_ == null) {
               this.battleData_ = null;
               this.onChanged();
            } else {
               this.battleDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public StonehengeBattleData.Builder getBattleDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (StonehengeBattleData.Builder)this.getBattleDataFieldBuilder().getBuilder();
         }

         public StonehengeBattleDataOrBuilder getBattleDataOrBuilder() {
            if (this.battleDataBuilder_ != null) {
               return (StonehengeBattleDataOrBuilder)this.battleDataBuilder_.getMessageOrBuilder();
            } else {
               return this.battleData_ == null ? StonehengeMsg.StonehengeBattleData.getDefaultInstance() : this.battleData_;
            }
         }

         private SingleFieldBuilderV3<StonehengeBattleData, StonehengeBattleData.Builder, StonehengeBattleDataOrBuilder> getBattleDataFieldBuilder() {
            if (this.battleDataBuilder_ == null) {
               this.battleDataBuilder_ = new SingleFieldBuilderV3(this.getBattleData(), this.getParentForChildren(), this.isClean());
               this.battleData_ = null;
            }

            return this.battleDataBuilder_;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         private void ensureBuffIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.buffId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.mutableCopy(this.buffId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBuffIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.buffId_) : this.buffId_);
         }

         public int getBuffIdCount() {
            return this.buffId_.size();
         }

         public int getBuffId(int index) {
            return this.buffId_.getInt(index);
         }

         public Builder setBuffId(int index, int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffId(int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffId(Iterable<? extends Integer> values) {
            this.ensureBuffIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffId_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.buffId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureResumeIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.resumeId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.mutableCopy(this.resumeId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getResumeIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.resumeId_) : this.resumeId_);
         }

         public int getResumeIdCount() {
            return this.resumeId_.size();
         }

         public int getResumeId(int index) {
            return this.resumeId_.getInt(index);
         }

         public Builder setResumeId(int index, int value) {
            this.ensureResumeIdIsMutable();
            this.resumeId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addResumeId(int value) {
            this.ensureResumeIdIsMutable();
            this.resumeId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllResumeId(Iterable<? extends Integer> values) {
            this.ensureResumeIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.resumeId_);
            this.onChanged();
            return this;
         }

         public Builder clearResumeId() {
            this.resumeId_ = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.emptyIntList();
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

   public static final class StonehengeBattleData extends GeneratedMessageV3 implements StonehengeBattleDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTID_FIELD_NUMBER = 1;
      private int fightId_;
      public static final int MYHERO1_FIELD_NUMBER = 2;
      private List<StonehengeHero> myHero1_;
      public static final int MYHERO2_FIELD_NUMBER = 3;
      private List<StonehengeHero> myHero2_;
      public static final int ENEMY1_FIELD_NUMBER = 4;
      private List<StonehengeHero> enemy1_;
      public static final int ENEMY2_FIELD_NUMBER = 5;
      private List<StonehengeHero> enemy2_;
      private byte memoizedIsInitialized;
      private static final StonehengeBattleData DEFAULT_INSTANCE = new StonehengeBattleData();
      /** @deprecated */
      @Deprecated
      public static final Parser<StonehengeBattleData> PARSER = new AbstractParser<StonehengeBattleData>() {
         public StonehengeBattleData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new StonehengeBattleData(input, extensionRegistry);
         }
      };

      private StonehengeBattleData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private StonehengeBattleData() {
         this.memoizedIsInitialized = -1;
         this.myHero1_ = Collections.emptyList();
         this.myHero2_ = Collections.emptyList();
         this.enemy1_ = Collections.emptyList();
         this.enemy2_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new StonehengeBattleData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private StonehengeBattleData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fightId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.myHero1_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.myHero1_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.myHero2_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.myHero2_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.enemy1_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.enemy1_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.enemy2_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.enemy2_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
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
                  this.myHero1_ = Collections.unmodifiableList(this.myHero1_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.myHero2_ = Collections.unmodifiableList(this.myHero2_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.enemy1_ = Collections.unmodifiableList(this.enemy1_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.enemy2_ = Collections.unmodifiableList(this.enemy2_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_fieldAccessorTable.ensureFieldAccessorsInitialized(StonehengeBattleData.class, Builder.class);
      }

      public boolean hasFightId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightId() {
         return this.fightId_;
      }

      public List<StonehengeHero> getMyHero1List() {
         return this.myHero1_;
      }

      public List<? extends StonehengeHeroOrBuilder> getMyHero1OrBuilderList() {
         return this.myHero1_;
      }

      public int getMyHero1Count() {
         return this.myHero1_.size();
      }

      public StonehengeHero getMyHero1(int index) {
         return (StonehengeHero)this.myHero1_.get(index);
      }

      public StonehengeHeroOrBuilder getMyHero1OrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.myHero1_.get(index);
      }

      public List<StonehengeHero> getMyHero2List() {
         return this.myHero2_;
      }

      public List<? extends StonehengeHeroOrBuilder> getMyHero2OrBuilderList() {
         return this.myHero2_;
      }

      public int getMyHero2Count() {
         return this.myHero2_.size();
      }

      public StonehengeHero getMyHero2(int index) {
         return (StonehengeHero)this.myHero2_.get(index);
      }

      public StonehengeHeroOrBuilder getMyHero2OrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.myHero2_.get(index);
      }

      public List<StonehengeHero> getEnemy1List() {
         return this.enemy1_;
      }

      public List<? extends StonehengeHeroOrBuilder> getEnemy1OrBuilderList() {
         return this.enemy1_;
      }

      public int getEnemy1Count() {
         return this.enemy1_.size();
      }

      public StonehengeHero getEnemy1(int index) {
         return (StonehengeHero)this.enemy1_.get(index);
      }

      public StonehengeHeroOrBuilder getEnemy1OrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.enemy1_.get(index);
      }

      public List<StonehengeHero> getEnemy2List() {
         return this.enemy2_;
      }

      public List<? extends StonehengeHeroOrBuilder> getEnemy2OrBuilderList() {
         return this.enemy2_;
      }

      public int getEnemy2Count() {
         return this.enemy2_.size();
      }

      public StonehengeHero getEnemy2(int index) {
         return (StonehengeHero)this.enemy2_.get(index);
      }

      public StonehengeHeroOrBuilder getEnemy2OrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.enemy2_.get(index);
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
            output.writeInt32(1, this.fightId_);
         }

         for(int i = 0; i < this.myHero1_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.myHero1_.get(i));
         }

         for(int i = 0; i < this.myHero2_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.myHero2_.get(i));
         }

         for(int i = 0; i < this.enemy1_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.enemy1_.get(i));
         }

         for(int i = 0; i < this.enemy2_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.enemy2_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.fightId_);
            }

            for(int i = 0; i < this.myHero1_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.myHero1_.get(i));
            }

            for(int i = 0; i < this.myHero2_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.myHero2_.get(i));
            }

            for(int i = 0; i < this.enemy1_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.enemy1_.get(i));
            }

            for(int i = 0; i < this.enemy2_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.enemy2_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof StonehengeBattleData)) {
            return super.equals(obj);
         } else {
            StonehengeBattleData other = (StonehengeBattleData)obj;
            if (this.hasFightId() != other.hasFightId()) {
               return false;
            } else if (this.hasFightId() && this.getFightId() != other.getFightId()) {
               return false;
            } else if (!this.getMyHero1List().equals(other.getMyHero1List())) {
               return false;
            } else if (!this.getMyHero2List().equals(other.getMyHero2List())) {
               return false;
            } else if (!this.getEnemy1List().equals(other.getEnemy1List())) {
               return false;
            } else if (!this.getEnemy2List().equals(other.getEnemy2List())) {
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
            if (this.hasFightId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightId();
            }

            if (this.getMyHero1Count() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyHero1List().hashCode();
            }

            if (this.getMyHero2Count() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMyHero2List().hashCode();
            }

            if (this.getEnemy1Count() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEnemy1List().hashCode();
            }

            if (this.getEnemy2Count() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEnemy2List().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static StonehengeBattleData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data);
      }

      public static StonehengeBattleData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeBattleData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data);
      }

      public static StonehengeBattleData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeBattleData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data);
      }

      public static StonehengeBattleData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (StonehengeBattleData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static StonehengeBattleData parseFrom(InputStream input) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StonehengeBattleData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static StonehengeBattleData parseDelimitedFrom(InputStream input) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static StonehengeBattleData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static StonehengeBattleData parseFrom(CodedInputStream input) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static StonehengeBattleData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (StonehengeBattleData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(StonehengeBattleData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static StonehengeBattleData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<StonehengeBattleData> parser() {
         return PARSER;
      }

      public Parser<StonehengeBattleData> getParserForType() {
         return PARSER;
      }

      public StonehengeBattleData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StonehengeBattleDataOrBuilder {
         private int bitField0_;
         private int fightId_;
         private List<StonehengeHero> myHero1_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> myHero1Builder_;
         private List<StonehengeHero> myHero2_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> myHero2Builder_;
         private List<StonehengeHero> enemy1_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> enemy1Builder_;
         private List<StonehengeHero> enemy2_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> enemy2Builder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_fieldAccessorTable.ensureFieldAccessorsInitialized(StonehengeBattleData.class, Builder.class);
         }

         private Builder() {
            this.myHero1_ = Collections.emptyList();
            this.myHero2_ = Collections.emptyList();
            this.enemy1_ = Collections.emptyList();
            this.enemy2_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myHero1_ = Collections.emptyList();
            this.myHero2_ = Collections.emptyList();
            this.enemy1_ = Collections.emptyList();
            this.enemy2_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.StonehengeBattleData.alwaysUseFieldBuilders) {
               this.getMyHero1FieldBuilder();
               this.getMyHero2FieldBuilder();
               this.getEnemy1FieldBuilder();
               this.getEnemy2FieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fightId_ = 0;
            this.bitField0_ &= -2;
            if (this.myHero1Builder_ == null) {
               this.myHero1_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.myHero1Builder_.clear();
            }

            if (this.myHero2Builder_ == null) {
               this.myHero2_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.myHero2Builder_.clear();
            }

            if (this.enemy1Builder_ == null) {
               this.enemy1_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.enemy1Builder_.clear();
            }

            if (this.enemy2Builder_ == null) {
               this.enemy2_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.enemy2Builder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_StonehengeBattleData_descriptor;
         }

         public StonehengeBattleData getDefaultInstanceForType() {
            return StonehengeMsg.StonehengeBattleData.getDefaultInstance();
         }

         public StonehengeBattleData build() {
            StonehengeBattleData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public StonehengeBattleData buildPartial() {
            StonehengeBattleData result = new StonehengeBattleData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightId_ = this.fightId_;
               to_bitField0_ |= 1;
            }

            if (this.myHero1Builder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.myHero1_ = Collections.unmodifiableList(this.myHero1_);
                  this.bitField0_ &= -3;
               }

               result.myHero1_ = this.myHero1_;
            } else {
               result.myHero1_ = this.myHero1Builder_.build();
            }

            if (this.myHero2Builder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.myHero2_ = Collections.unmodifiableList(this.myHero2_);
                  this.bitField0_ &= -5;
               }

               result.myHero2_ = this.myHero2_;
            } else {
               result.myHero2_ = this.myHero2Builder_.build();
            }

            if (this.enemy1Builder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.enemy1_ = Collections.unmodifiableList(this.enemy1_);
                  this.bitField0_ &= -9;
               }

               result.enemy1_ = this.enemy1_;
            } else {
               result.enemy1_ = this.enemy1Builder_.build();
            }

            if (this.enemy2Builder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.enemy2_ = Collections.unmodifiableList(this.enemy2_);
                  this.bitField0_ &= -17;
               }

               result.enemy2_ = this.enemy2_;
            } else {
               result.enemy2_ = this.enemy2Builder_.build();
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
            if (other instanceof StonehengeBattleData) {
               return this.mergeFrom((StonehengeBattleData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(StonehengeBattleData other) {
            if (other == StonehengeMsg.StonehengeBattleData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightId()) {
                  this.setFightId(other.getFightId());
               }

               if (this.myHero1Builder_ == null) {
                  if (!other.myHero1_.isEmpty()) {
                     if (this.myHero1_.isEmpty()) {
                        this.myHero1_ = other.myHero1_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureMyHero1IsMutable();
                        this.myHero1_.addAll(other.myHero1_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myHero1_.isEmpty()) {
                  if (this.myHero1Builder_.isEmpty()) {
                     this.myHero1Builder_.dispose();
                     this.myHero1Builder_ = null;
                     this.myHero1_ = other.myHero1_;
                     this.bitField0_ &= -3;
                     this.myHero1Builder_ = StonehengeMsg.StonehengeBattleData.alwaysUseFieldBuilders ? this.getMyHero1FieldBuilder() : null;
                  } else {
                     this.myHero1Builder_.addAllMessages(other.myHero1_);
                  }
               }

               if (this.myHero2Builder_ == null) {
                  if (!other.myHero2_.isEmpty()) {
                     if (this.myHero2_.isEmpty()) {
                        this.myHero2_ = other.myHero2_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureMyHero2IsMutable();
                        this.myHero2_.addAll(other.myHero2_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myHero2_.isEmpty()) {
                  if (this.myHero2Builder_.isEmpty()) {
                     this.myHero2Builder_.dispose();
                     this.myHero2Builder_ = null;
                     this.myHero2_ = other.myHero2_;
                     this.bitField0_ &= -5;
                     this.myHero2Builder_ = StonehengeMsg.StonehengeBattleData.alwaysUseFieldBuilders ? this.getMyHero2FieldBuilder() : null;
                  } else {
                     this.myHero2Builder_.addAllMessages(other.myHero2_);
                  }
               }

               if (this.enemy1Builder_ == null) {
                  if (!other.enemy1_.isEmpty()) {
                     if (this.enemy1_.isEmpty()) {
                        this.enemy1_ = other.enemy1_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureEnemy1IsMutable();
                        this.enemy1_.addAll(other.enemy1_);
                     }

                     this.onChanged();
                  }
               } else if (!other.enemy1_.isEmpty()) {
                  if (this.enemy1Builder_.isEmpty()) {
                     this.enemy1Builder_.dispose();
                     this.enemy1Builder_ = null;
                     this.enemy1_ = other.enemy1_;
                     this.bitField0_ &= -9;
                     this.enemy1Builder_ = StonehengeMsg.StonehengeBattleData.alwaysUseFieldBuilders ? this.getEnemy1FieldBuilder() : null;
                  } else {
                     this.enemy1Builder_.addAllMessages(other.enemy1_);
                  }
               }

               if (this.enemy2Builder_ == null) {
                  if (!other.enemy2_.isEmpty()) {
                     if (this.enemy2_.isEmpty()) {
                        this.enemy2_ = other.enemy2_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEnemy2IsMutable();
                        this.enemy2_.addAll(other.enemy2_);
                     }

                     this.onChanged();
                  }
               } else if (!other.enemy2_.isEmpty()) {
                  if (this.enemy2Builder_.isEmpty()) {
                     this.enemy2Builder_.dispose();
                     this.enemy2Builder_ = null;
                     this.enemy2_ = other.enemy2_;
                     this.bitField0_ &= -17;
                     this.enemy2Builder_ = StonehengeMsg.StonehengeBattleData.alwaysUseFieldBuilders ? this.getEnemy2FieldBuilder() : null;
                  } else {
                     this.enemy2Builder_.addAllMessages(other.enemy2_);
                  }
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
            StonehengeBattleData parsedMessage = null;

            try {
               parsedMessage = (StonehengeBattleData)StonehengeMsg.StonehengeBattleData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (StonehengeBattleData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightId() {
            return this.fightId_;
         }

         public Builder setFightId(int value) {
            this.bitField0_ |= 1;
            this.fightId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightId() {
            this.bitField0_ &= -2;
            this.fightId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMyHero1IsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.myHero1_ = new ArrayList(this.myHero1_);
               this.bitField0_ |= 2;
            }

         }

         public List<StonehengeHero> getMyHero1List() {
            return this.myHero1Builder_ == null ? Collections.unmodifiableList(this.myHero1_) : this.myHero1Builder_.getMessageList();
         }

         public int getMyHero1Count() {
            return this.myHero1Builder_ == null ? this.myHero1_.size() : this.myHero1Builder_.getCount();
         }

         public StonehengeHero getMyHero1(int index) {
            return this.myHero1Builder_ == null ? (StonehengeHero)this.myHero1_.get(index) : (StonehengeHero)this.myHero1Builder_.getMessage(index);
         }

         public Builder setMyHero1(int index, StonehengeHero value) {
            if (this.myHero1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero1IsMutable();
               this.myHero1_.set(index, value);
               this.onChanged();
            } else {
               this.myHero1Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyHero1(int index, StonehengeHero.Builder builderForValue) {
            if (this.myHero1Builder_ == null) {
               this.ensureMyHero1IsMutable();
               this.myHero1_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myHero1Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyHero1(StonehengeHero value) {
            if (this.myHero1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero1IsMutable();
               this.myHero1_.add(value);
               this.onChanged();
            } else {
               this.myHero1Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyHero1(int index, StonehengeHero value) {
            if (this.myHero1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero1IsMutable();
               this.myHero1_.add(index, value);
               this.onChanged();
            } else {
               this.myHero1Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyHero1(StonehengeHero.Builder builderForValue) {
            if (this.myHero1Builder_ == null) {
               this.ensureMyHero1IsMutable();
               this.myHero1_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myHero1Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyHero1(int index, StonehengeHero.Builder builderForValue) {
            if (this.myHero1Builder_ == null) {
               this.ensureMyHero1IsMutable();
               this.myHero1_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myHero1Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyHero1(Iterable<? extends StonehengeHero> values) {
            if (this.myHero1Builder_ == null) {
               this.ensureMyHero1IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myHero1_);
               this.onChanged();
            } else {
               this.myHero1Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyHero1() {
            if (this.myHero1Builder_ == null) {
               this.myHero1_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.myHero1Builder_.clear();
            }

            return this;
         }

         public Builder removeMyHero1(int index) {
            if (this.myHero1Builder_ == null) {
               this.ensureMyHero1IsMutable();
               this.myHero1_.remove(index);
               this.onChanged();
            } else {
               this.myHero1Builder_.remove(index);
            }

            return this;
         }

         public StonehengeHero.Builder getMyHero1Builder(int index) {
            return (StonehengeHero.Builder)this.getMyHero1FieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getMyHero1OrBuilder(int index) {
            return this.myHero1Builder_ == null ? (StonehengeHeroOrBuilder)this.myHero1_.get(index) : (StonehengeHeroOrBuilder)this.myHero1Builder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getMyHero1OrBuilderList() {
            return this.myHero1Builder_ != null ? this.myHero1Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myHero1_);
         }

         public StonehengeHero.Builder addMyHero1Builder() {
            return (StonehengeHero.Builder)this.getMyHero1FieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addMyHero1Builder(int index) {
            return (StonehengeHero.Builder)this.getMyHero1FieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getMyHero1BuilderList() {
            return this.getMyHero1FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getMyHero1FieldBuilder() {
            if (this.myHero1Builder_ == null) {
               this.myHero1Builder_ = new RepeatedFieldBuilderV3(this.myHero1_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.myHero1_ = null;
            }

            return this.myHero1Builder_;
         }

         private void ensureMyHero2IsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.myHero2_ = new ArrayList(this.myHero2_);
               this.bitField0_ |= 4;
            }

         }

         public List<StonehengeHero> getMyHero2List() {
            return this.myHero2Builder_ == null ? Collections.unmodifiableList(this.myHero2_) : this.myHero2Builder_.getMessageList();
         }

         public int getMyHero2Count() {
            return this.myHero2Builder_ == null ? this.myHero2_.size() : this.myHero2Builder_.getCount();
         }

         public StonehengeHero getMyHero2(int index) {
            return this.myHero2Builder_ == null ? (StonehengeHero)this.myHero2_.get(index) : (StonehengeHero)this.myHero2Builder_.getMessage(index);
         }

         public Builder setMyHero2(int index, StonehengeHero value) {
            if (this.myHero2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero2IsMutable();
               this.myHero2_.set(index, value);
               this.onChanged();
            } else {
               this.myHero2Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyHero2(int index, StonehengeHero.Builder builderForValue) {
            if (this.myHero2Builder_ == null) {
               this.ensureMyHero2IsMutable();
               this.myHero2_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myHero2Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyHero2(StonehengeHero value) {
            if (this.myHero2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero2IsMutable();
               this.myHero2_.add(value);
               this.onChanged();
            } else {
               this.myHero2Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyHero2(int index, StonehengeHero value) {
            if (this.myHero2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyHero2IsMutable();
               this.myHero2_.add(index, value);
               this.onChanged();
            } else {
               this.myHero2Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyHero2(StonehengeHero.Builder builderForValue) {
            if (this.myHero2Builder_ == null) {
               this.ensureMyHero2IsMutable();
               this.myHero2_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myHero2Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyHero2(int index, StonehengeHero.Builder builderForValue) {
            if (this.myHero2Builder_ == null) {
               this.ensureMyHero2IsMutable();
               this.myHero2_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myHero2Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyHero2(Iterable<? extends StonehengeHero> values) {
            if (this.myHero2Builder_ == null) {
               this.ensureMyHero2IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myHero2_);
               this.onChanged();
            } else {
               this.myHero2Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyHero2() {
            if (this.myHero2Builder_ == null) {
               this.myHero2_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.myHero2Builder_.clear();
            }

            return this;
         }

         public Builder removeMyHero2(int index) {
            if (this.myHero2Builder_ == null) {
               this.ensureMyHero2IsMutable();
               this.myHero2_.remove(index);
               this.onChanged();
            } else {
               this.myHero2Builder_.remove(index);
            }

            return this;
         }

         public StonehengeHero.Builder getMyHero2Builder(int index) {
            return (StonehengeHero.Builder)this.getMyHero2FieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getMyHero2OrBuilder(int index) {
            return this.myHero2Builder_ == null ? (StonehengeHeroOrBuilder)this.myHero2_.get(index) : (StonehengeHeroOrBuilder)this.myHero2Builder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getMyHero2OrBuilderList() {
            return this.myHero2Builder_ != null ? this.myHero2Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myHero2_);
         }

         public StonehengeHero.Builder addMyHero2Builder() {
            return (StonehengeHero.Builder)this.getMyHero2FieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addMyHero2Builder(int index) {
            return (StonehengeHero.Builder)this.getMyHero2FieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getMyHero2BuilderList() {
            return this.getMyHero2FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getMyHero2FieldBuilder() {
            if (this.myHero2Builder_ == null) {
               this.myHero2Builder_ = new RepeatedFieldBuilderV3(this.myHero2_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.myHero2_ = null;
            }

            return this.myHero2Builder_;
         }

         private void ensureEnemy1IsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.enemy1_ = new ArrayList(this.enemy1_);
               this.bitField0_ |= 8;
            }

         }

         public List<StonehengeHero> getEnemy1List() {
            return this.enemy1Builder_ == null ? Collections.unmodifiableList(this.enemy1_) : this.enemy1Builder_.getMessageList();
         }

         public int getEnemy1Count() {
            return this.enemy1Builder_ == null ? this.enemy1_.size() : this.enemy1Builder_.getCount();
         }

         public StonehengeHero getEnemy1(int index) {
            return this.enemy1Builder_ == null ? (StonehengeHero)this.enemy1_.get(index) : (StonehengeHero)this.enemy1Builder_.getMessage(index);
         }

         public Builder setEnemy1(int index, StonehengeHero value) {
            if (this.enemy1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy1IsMutable();
               this.enemy1_.set(index, value);
               this.onChanged();
            } else {
               this.enemy1Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEnemy1(int index, StonehengeHero.Builder builderForValue) {
            if (this.enemy1Builder_ == null) {
               this.ensureEnemy1IsMutable();
               this.enemy1_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemy1Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEnemy1(StonehengeHero value) {
            if (this.enemy1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy1IsMutable();
               this.enemy1_.add(value);
               this.onChanged();
            } else {
               this.enemy1Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addEnemy1(int index, StonehengeHero value) {
            if (this.enemy1Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy1IsMutable();
               this.enemy1_.add(index, value);
               this.onChanged();
            } else {
               this.enemy1Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEnemy1(StonehengeHero.Builder builderForValue) {
            if (this.enemy1Builder_ == null) {
               this.ensureEnemy1IsMutable();
               this.enemy1_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.enemy1Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEnemy1(int index, StonehengeHero.Builder builderForValue) {
            if (this.enemy1Builder_ == null) {
               this.ensureEnemy1IsMutable();
               this.enemy1_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemy1Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEnemy1(Iterable<? extends StonehengeHero> values) {
            if (this.enemy1Builder_ == null) {
               this.ensureEnemy1IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.enemy1_);
               this.onChanged();
            } else {
               this.enemy1Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEnemy1() {
            if (this.enemy1Builder_ == null) {
               this.enemy1_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.enemy1Builder_.clear();
            }

            return this;
         }

         public Builder removeEnemy1(int index) {
            if (this.enemy1Builder_ == null) {
               this.ensureEnemy1IsMutable();
               this.enemy1_.remove(index);
               this.onChanged();
            } else {
               this.enemy1Builder_.remove(index);
            }

            return this;
         }

         public StonehengeHero.Builder getEnemy1Builder(int index) {
            return (StonehengeHero.Builder)this.getEnemy1FieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getEnemy1OrBuilder(int index) {
            return this.enemy1Builder_ == null ? (StonehengeHeroOrBuilder)this.enemy1_.get(index) : (StonehengeHeroOrBuilder)this.enemy1Builder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getEnemy1OrBuilderList() {
            return this.enemy1Builder_ != null ? this.enemy1Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.enemy1_);
         }

         public StonehengeHero.Builder addEnemy1Builder() {
            return (StonehengeHero.Builder)this.getEnemy1FieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addEnemy1Builder(int index) {
            return (StonehengeHero.Builder)this.getEnemy1FieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getEnemy1BuilderList() {
            return this.getEnemy1FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getEnemy1FieldBuilder() {
            if (this.enemy1Builder_ == null) {
               this.enemy1Builder_ = new RepeatedFieldBuilderV3(this.enemy1_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.enemy1_ = null;
            }

            return this.enemy1Builder_;
         }

         private void ensureEnemy2IsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.enemy2_ = new ArrayList(this.enemy2_);
               this.bitField0_ |= 16;
            }

         }

         public List<StonehengeHero> getEnemy2List() {
            return this.enemy2Builder_ == null ? Collections.unmodifiableList(this.enemy2_) : this.enemy2Builder_.getMessageList();
         }

         public int getEnemy2Count() {
            return this.enemy2Builder_ == null ? this.enemy2_.size() : this.enemy2Builder_.getCount();
         }

         public StonehengeHero getEnemy2(int index) {
            return this.enemy2Builder_ == null ? (StonehengeHero)this.enemy2_.get(index) : (StonehengeHero)this.enemy2Builder_.getMessage(index);
         }

         public Builder setEnemy2(int index, StonehengeHero value) {
            if (this.enemy2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy2IsMutable();
               this.enemy2_.set(index, value);
               this.onChanged();
            } else {
               this.enemy2Builder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEnemy2(int index, StonehengeHero.Builder builderForValue) {
            if (this.enemy2Builder_ == null) {
               this.ensureEnemy2IsMutable();
               this.enemy2_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemy2Builder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEnemy2(StonehengeHero value) {
            if (this.enemy2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy2IsMutable();
               this.enemy2_.add(value);
               this.onChanged();
            } else {
               this.enemy2Builder_.addMessage(value);
            }

            return this;
         }

         public Builder addEnemy2(int index, StonehengeHero value) {
            if (this.enemy2Builder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemy2IsMutable();
               this.enemy2_.add(index, value);
               this.onChanged();
            } else {
               this.enemy2Builder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEnemy2(StonehengeHero.Builder builderForValue) {
            if (this.enemy2Builder_ == null) {
               this.ensureEnemy2IsMutable();
               this.enemy2_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.enemy2Builder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEnemy2(int index, StonehengeHero.Builder builderForValue) {
            if (this.enemy2Builder_ == null) {
               this.ensureEnemy2IsMutable();
               this.enemy2_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemy2Builder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEnemy2(Iterable<? extends StonehengeHero> values) {
            if (this.enemy2Builder_ == null) {
               this.ensureEnemy2IsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.enemy2_);
               this.onChanged();
            } else {
               this.enemy2Builder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEnemy2() {
            if (this.enemy2Builder_ == null) {
               this.enemy2_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.enemy2Builder_.clear();
            }

            return this;
         }

         public Builder removeEnemy2(int index) {
            if (this.enemy2Builder_ == null) {
               this.ensureEnemy2IsMutable();
               this.enemy2_.remove(index);
               this.onChanged();
            } else {
               this.enemy2Builder_.remove(index);
            }

            return this;
         }

         public StonehengeHero.Builder getEnemy2Builder(int index) {
            return (StonehengeHero.Builder)this.getEnemy2FieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getEnemy2OrBuilder(int index) {
            return this.enemy2Builder_ == null ? (StonehengeHeroOrBuilder)this.enemy2_.get(index) : (StonehengeHeroOrBuilder)this.enemy2Builder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getEnemy2OrBuilderList() {
            return this.enemy2Builder_ != null ? this.enemy2Builder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.enemy2_);
         }

         public StonehengeHero.Builder addEnemy2Builder() {
            return (StonehengeHero.Builder)this.getEnemy2FieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addEnemy2Builder(int index) {
            return (StonehengeHero.Builder)this.getEnemy2FieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getEnemy2BuilderList() {
            return this.getEnemy2FieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getEnemy2FieldBuilder() {
            if (this.enemy2Builder_ == null) {
               this.enemy2Builder_ = new RepeatedFieldBuilderV3(this.enemy2_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.enemy2_ = null;
            }

            return this.enemy2Builder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_StonehengeResume_22908 extends GeneratedMessageV3 implements S2C_StonehengeResume_22908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private List<StonehengeHero> hero_;
      public static final int REVIVETIME_FIELD_NUMBER = 2;
      private int reviveTime_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeResume_22908 DEFAULT_INSTANCE = new S2C_StonehengeResume_22908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeResume_22908> PARSER = new AbstractParser<S2C_StonehengeResume_22908>() {
         public S2C_StonehengeResume_22908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeResume_22908(input, extensionRegistry);
         }
      };

      private S2C_StonehengeResume_22908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeResume_22908() {
         this.memoizedIsInitialized = -1;
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeResume_22908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeResume_22908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.hero_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.reviveTime_ = input.readInt32();
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
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeResume_22908.class, Builder.class);
      }

      public List<StonehengeHero> getHeroList() {
         return this.hero_;
      }

      public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public StonehengeHero getHero(int index) {
         return (StonehengeHero)this.hero_.get(index);
      }

      public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.hero_.get(index);
      }

      public boolean hasReviveTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReviveTime() {
         return this.reviveTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReviveTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.hero_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.reviveTime_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.hero_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.reviveTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeResume_22908)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeResume_22908 other = (S2C_StonehengeResume_22908)obj;
            if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (this.hasReviveTime() != other.hasReviveTime()) {
               return false;
            } else if (this.hasReviveTime() && this.getReviveTime() != other.getReviveTime()) {
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
            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.hasReviveTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReviveTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeResume_22908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeResume_22908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeResume_22908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeResume_22908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeResume_22908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeResume_22908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeResume_22908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeResume_22908 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeResume_22908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeResume_22908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeResume_22908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeResume_22908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeResume_22908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeResume_22908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeResume_22908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeResume_22908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeResume_22908> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeResume_22908> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeResume_22908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeResume_22908OrBuilder {
         private int bitField0_;
         private List<StonehengeHero> hero_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> heroBuilder_;
         private int reviveTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeResume_22908.class, Builder.class);
         }

         private Builder() {
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeResume_22908.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroBuilder_.clear();
            }

            this.reviveTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeResume_22908_descriptor;
         }

         public S2C_StonehengeResume_22908 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeResume_22908.getDefaultInstance();
         }

         public S2C_StonehengeResume_22908 build() {
            S2C_StonehengeResume_22908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeResume_22908 buildPartial() {
            S2C_StonehengeResume_22908 result = new S2C_StonehengeResume_22908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -2;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.reviveTime_ = this.reviveTime_;
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
            if (other instanceof S2C_StonehengeResume_22908) {
               return this.mergeFrom((S2C_StonehengeResume_22908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeResume_22908 other) {
            if (other == StonehengeMsg.S2C_StonehengeResume_22908.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.heroBuilder_ = StonehengeMsg.S2C_StonehengeResume_22908.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (other.hasReviveTime()) {
                  this.setReviveTime(other.getReviveTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReviveTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StonehengeResume_22908 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeResume_22908)StonehengeMsg.S2C_StonehengeResume_22908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeResume_22908)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 1;
            }

         }

         public List<StonehengeHero> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public StonehengeHero getHero(int index) {
            return this.heroBuilder_ == null ? (StonehengeHero)this.hero_.get(index) : (StonehengeHero)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, StonehengeHero value) {
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

         public Builder setHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(StonehengeHero value) {
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

         public Builder addHero(int index, StonehengeHero value) {
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

         public Builder addHero(StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends StonehengeHero> values) {
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
               this.bitField0_ &= -2;
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

         public StonehengeHero.Builder getHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (StonehengeHeroOrBuilder)this.hero_.get(index) : (StonehengeHeroOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public StonehengeHero.Builder addHeroBuilder() {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public boolean hasReviveTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getReviveTime() {
            return this.reviveTime_;
         }

         public Builder setReviveTime(int value) {
            this.bitField0_ |= 2;
            this.reviveTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReviveTime() {
            this.bitField0_ &= -3;
            this.reviveTime_ = 0;
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

   public static final class S2C_StonehengeDeBuff_22909 extends GeneratedMessageV3 implements S2C_StonehengeDeBuff_22909OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUFFID_FIELD_NUMBER = 1;
      private Internal.IntList buffId_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeDeBuff_22909 DEFAULT_INSTANCE = new S2C_StonehengeDeBuff_22909();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeDeBuff_22909> PARSER = new AbstractParser<S2C_StonehengeDeBuff_22909>() {
         public S2C_StonehengeDeBuff_22909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeDeBuff_22909(input, extensionRegistry);
         }
      };

      private S2C_StonehengeDeBuff_22909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeDeBuff_22909() {
         this.memoizedIsInitialized = -1;
         this.buffId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeDeBuff_22909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeDeBuff_22909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buffId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buffId_.addInt(input.readInt32());
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
                  this.buffId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeDeBuff_22909.class, Builder.class);
      }

      public List<Integer> getBuffIdList() {
         return this.buffId_;
      }

      public int getBuffIdCount() {
         return this.buffId_.size();
      }

      public int getBuffId(int index) {
         return this.buffId_.getInt(index);
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
         for(int i = 0; i < this.buffId_.size(); ++i) {
            output.writeInt32(1, this.buffId_.getInt(i));
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

            for(int i = 0; i < this.buffId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeDeBuff_22909)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeDeBuff_22909 other = (S2C_StonehengeDeBuff_22909)obj;
            if (!this.getBuffIdList().equals(other.getBuffIdList())) {
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
            if (this.getBuffIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuffIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeDeBuff_22909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeDeBuff_22909 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeDeBuff_22909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeDeBuff_22909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeDeBuff_22909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeDeBuff_22909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeDeBuff_22909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeDeBuff_22909> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeDeBuff_22909> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeDeBuff_22909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeDeBuff_22909OrBuilder {
         private int bitField0_;
         private Internal.IntList buffId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeDeBuff_22909.class, Builder.class);
         }

         private Builder() {
            this.buffId_ = StonehengeMsg.S2C_StonehengeDeBuff_22909.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buffId_ = StonehengeMsg.S2C_StonehengeDeBuff_22909.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeDeBuff_22909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buffId_ = StonehengeMsg.S2C_StonehengeDeBuff_22909.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeDeBuff_22909_descriptor;
         }

         public S2C_StonehengeDeBuff_22909 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeDeBuff_22909.getDefaultInstance();
         }

         public S2C_StonehengeDeBuff_22909 build() {
            S2C_StonehengeDeBuff_22909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeDeBuff_22909 buildPartial() {
            S2C_StonehengeDeBuff_22909 result = new S2C_StonehengeDeBuff_22909(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.buffId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.buffId_ = this.buffId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_StonehengeDeBuff_22909) {
               return this.mergeFrom((S2C_StonehengeDeBuff_22909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeDeBuff_22909 other) {
            if (other == StonehengeMsg.S2C_StonehengeDeBuff_22909.getDefaultInstance()) {
               return this;
            } else {
               if (!other.buffId_.isEmpty()) {
                  if (this.buffId_.isEmpty()) {
                     this.buffId_ = other.buffId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureBuffIdIsMutable();
                     this.buffId_.addAll(other.buffId_);
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
            S2C_StonehengeDeBuff_22909 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeDeBuff_22909)StonehengeMsg.S2C_StonehengeDeBuff_22909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeDeBuff_22909)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuffIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buffId_ = StonehengeMsg.S2C_StonehengeDeBuff_22909.mutableCopy(this.buffId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getBuffIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.buffId_) : this.buffId_);
         }

         public int getBuffIdCount() {
            return this.buffId_.size();
         }

         public int getBuffId(int index) {
            return this.buffId_.getInt(index);
         }

         public Builder setBuffId(int index, int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffId(int value) {
            this.ensureBuffIdIsMutable();
            this.buffId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffId(Iterable<? extends Integer> values) {
            this.ensureBuffIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffId_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.buffId_ = StonehengeMsg.S2C_StonehengeDeBuff_22909.emptyIntList();
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

   public static final class C2S_StonehengePass_22910 extends GeneratedMessageV3 implements C2S_StonehengePass_22910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATUS_FIELD_NUMBER = 1;
      private boolean status_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengePass_22910 DEFAULT_INSTANCE = new C2S_StonehengePass_22910();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengePass_22910> PARSER = new AbstractParser<C2S_StonehengePass_22910>() {
         public C2S_StonehengePass_22910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengePass_22910(input, extensionRegistry);
         }
      };

      private C2S_StonehengePass_22910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengePass_22910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengePass_22910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengePass_22910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.status_ = input.readBool();
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengePass_22910.class, Builder.class);
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getStatus() {
         return this.status_;
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
            output.writeBool(1, this.status_);
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
               size += CodedOutputStream.computeBoolSize(1, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengePass_22910)) {
            return super.equals(obj);
         } else {
            C2S_StonehengePass_22910 other = (C2S_StonehengePass_22910)obj;
            if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
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
               hash = 53 * hash + Internal.hashBoolean(this.getStatus());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengePass_22910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data);
      }

      public static C2S_StonehengePass_22910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengePass_22910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data);
      }

      public static C2S_StonehengePass_22910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengePass_22910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data);
      }

      public static C2S_StonehengePass_22910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengePass_22910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengePass_22910 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengePass_22910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengePass_22910 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengePass_22910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengePass_22910 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengePass_22910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengePass_22910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengePass_22910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengePass_22910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengePass_22910> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengePass_22910> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengePass_22910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengePass_22910OrBuilder {
         private int bitField0_;
         private boolean status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengePass_22910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengePass_22910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.status_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengePass_22910_descriptor;
         }

         public C2S_StonehengePass_22910 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengePass_22910.getDefaultInstance();
         }

         public C2S_StonehengePass_22910 build() {
            C2S_StonehengePass_22910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengePass_22910 buildPartial() {
            C2S_StonehengePass_22910 result = new C2S_StonehengePass_22910(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.status_ = this.status_;
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
            if (other instanceof C2S_StonehengePass_22910) {
               return this.mergeFrom((C2S_StonehengePass_22910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengePass_22910 other) {
            if (other == StonehengeMsg.C2S_StonehengePass_22910.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
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
            C2S_StonehengePass_22910 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengePass_22910)StonehengeMsg.C2S_StonehengePass_22910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengePass_22910)e.getUnfinishedMessage();
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

         public boolean getStatus() {
            return this.status_;
         }

         public Builder setStatus(boolean value) {
            this.bitField0_ |= 1;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = false;
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

   public static final class C2S_StonehengeHero_22911 extends GeneratedMessageV3 implements C2S_StonehengeHero_22911OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private Internal.IntList heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeHero_22911 DEFAULT_INSTANCE = new C2S_StonehengeHero_22911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeHero_22911> PARSER = new AbstractParser<C2S_StonehengeHero_22911>() {
         public C2S_StonehengeHero_22911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeHero_22911(input, extensionRegistry);
         }
      };

      private C2S_StonehengeHero_22911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeHero_22911() {
         this.memoizedIsInitialized = -1;
         this.heroCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeHero_22911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeHero_22911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroCode_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCode_.addInt(input.readInt32());
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
                  this.heroCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeHero_22911.class, Builder.class);
      }

      public List<Integer> getHeroCodeList() {
         return this.heroCode_;
      }

      public int getHeroCodeCount() {
         return this.heroCode_.size();
      }

      public int getHeroCode(int index) {
         return this.heroCode_.getInt(index);
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
         for(int i = 0; i < this.heroCode_.size(); ++i) {
            output.writeInt32(1, this.heroCode_.getInt(i));
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

            for(int i = 0; i < this.heroCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengeHero_22911)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeHero_22911 other = (C2S_StonehengeHero_22911)obj;
            if (!this.getHeroCodeList().equals(other.getHeroCodeList())) {
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
            if (this.getHeroCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengeHero_22911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeHero_22911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeHero_22911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeHero_22911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeHero_22911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeHero_22911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeHero_22911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeHero_22911 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeHero_22911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeHero_22911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeHero_22911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeHero_22911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeHero_22911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeHero_22911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeHero_22911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeHero_22911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeHero_22911> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeHero_22911> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeHero_22911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeHero_22911OrBuilder {
         private int bitField0_;
         private Internal.IntList heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeHero_22911.class, Builder.class);
         }

         private Builder() {
            this.heroCode_ = StonehengeMsg.C2S_StonehengeHero_22911.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCode_ = StonehengeMsg.C2S_StonehengeHero_22911.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeHero_22911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = StonehengeMsg.C2S_StonehengeHero_22911.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeHero_22911_descriptor;
         }

         public C2S_StonehengeHero_22911 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeHero_22911.getDefaultInstance();
         }

         public C2S_StonehengeHero_22911 build() {
            C2S_StonehengeHero_22911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeHero_22911 buildPartial() {
            C2S_StonehengeHero_22911 result = new C2S_StonehengeHero_22911(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.heroCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.heroCode_ = this.heroCode_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StonehengeHero_22911) {
               return this.mergeFrom((C2S_StonehengeHero_22911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeHero_22911 other) {
            if (other == StonehengeMsg.C2S_StonehengeHero_22911.getDefaultInstance()) {
               return this;
            } else {
               if (!other.heroCode_.isEmpty()) {
                  if (this.heroCode_.isEmpty()) {
                     this.heroCode_ = other.heroCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHeroCodeIsMutable();
                     this.heroCode_.addAll(other.heroCode_);
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
            C2S_StonehengeHero_22911 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeHero_22911)StonehengeMsg.C2S_StonehengeHero_22911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeHero_22911)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroCode_ = StonehengeMsg.C2S_StonehengeHero_22911.mutableCopy(this.heroCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHeroCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.heroCode_) : this.heroCode_);
         }

         public int getHeroCodeCount() {
            return this.heroCode_.size();
         }

         public int getHeroCode(int index) {
            return this.heroCode_.getInt(index);
         }

         public Builder setHeroCode(int index, int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCode(int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCode(Iterable<? extends Integer> values) {
            this.ensureHeroCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCode_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.heroCode_ = StonehengeMsg.C2S_StonehengeHero_22911.emptyIntList();
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

   public static final class S2C_StonehengeHero_22912 extends GeneratedMessageV3 implements S2C_StonehengeHero_22912OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HERO_FIELD_NUMBER = 1;
      private List<StonehengeHero> hero_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeHero_22912 DEFAULT_INSTANCE = new S2C_StonehengeHero_22912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeHero_22912> PARSER = new AbstractParser<S2C_StonehengeHero_22912>() {
         public S2C_StonehengeHero_22912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeHero_22912(input, extensionRegistry);
         }
      };

      private S2C_StonehengeHero_22912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeHero_22912() {
         this.memoizedIsInitialized = -1;
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeHero_22912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeHero_22912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.hero_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
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
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeHero_22912.class, Builder.class);
      }

      public List<StonehengeHero> getHeroList() {
         return this.hero_;
      }

      public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public StonehengeHero getHero(int index) {
         return (StonehengeHero)this.hero_.get(index);
      }

      public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.hero_.get(index);
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
         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.hero_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.hero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeHero_22912)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeHero_22912 other = (S2C_StonehengeHero_22912)obj;
            if (!this.getHeroList().equals(other.getHeroList())) {
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
            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeHero_22912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeHero_22912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeHero_22912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeHero_22912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeHero_22912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeHero_22912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeHero_22912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeHero_22912 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeHero_22912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeHero_22912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeHero_22912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeHero_22912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeHero_22912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeHero_22912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeHero_22912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeHero_22912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeHero_22912> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeHero_22912> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeHero_22912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeHero_22912OrBuilder {
         private int bitField0_;
         private List<StonehengeHero> hero_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> heroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeHero_22912.class, Builder.class);
         }

         private Builder() {
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeHero_22912.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeHero_22912_descriptor;
         }

         public S2C_StonehengeHero_22912 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeHero_22912.getDefaultInstance();
         }

         public S2C_StonehengeHero_22912 build() {
            S2C_StonehengeHero_22912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeHero_22912 buildPartial() {
            S2C_StonehengeHero_22912 result = new S2C_StonehengeHero_22912(this);
            int from_bitField0_ = this.bitField0_;
            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -2;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
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
            if (other instanceof S2C_StonehengeHero_22912) {
               return this.mergeFrom((S2C_StonehengeHero_22912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeHero_22912 other) {
            if (other == StonehengeMsg.S2C_StonehengeHero_22912.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -2;
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
                     this.bitField0_ &= -2;
                     this.heroBuilder_ = StonehengeMsg.S2C_StonehengeHero_22912.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
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
            S2C_StonehengeHero_22912 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeHero_22912)StonehengeMsg.S2C_StonehengeHero_22912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeHero_22912)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 1;
            }

         }

         public List<StonehengeHero> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public StonehengeHero getHero(int index) {
            return this.heroBuilder_ == null ? (StonehengeHero)this.hero_.get(index) : (StonehengeHero)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, StonehengeHero value) {
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

         public Builder setHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(StonehengeHero value) {
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

         public Builder addHero(int index, StonehengeHero value) {
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

         public Builder addHero(StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends StonehengeHero> values) {
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
               this.bitField0_ &= -2;
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

         public StonehengeHero.Builder getHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (StonehengeHeroOrBuilder)this.hero_.get(index) : (StonehengeHeroOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public StonehengeHero.Builder addHeroBuilder() {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_StonehengeQuery_22913 extends GeneratedMessageV3 implements C2S_StonehengeQuery_22913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeQuery_22913 DEFAULT_INSTANCE = new C2S_StonehengeQuery_22913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeQuery_22913> PARSER = new AbstractParser<C2S_StonehengeQuery_22913>() {
         public C2S_StonehengeQuery_22913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeQuery_22913(input, extensionRegistry);
         }
      };

      private C2S_StonehengeQuery_22913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeQuery_22913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeQuery_22913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeQuery_22913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeQuery_22913.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengeQuery_22913)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeQuery_22913 other = (C2S_StonehengeQuery_22913)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengeQuery_22913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeQuery_22913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeQuery_22913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeQuery_22913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeQuery_22913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeQuery_22913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeQuery_22913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeQuery_22913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeQuery_22913> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeQuery_22913> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeQuery_22913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeQuery_22913OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeQuery_22913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeQuery_22913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeQuery_22913_descriptor;
         }

         public C2S_StonehengeQuery_22913 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeQuery_22913.getDefaultInstance();
         }

         public C2S_StonehengeQuery_22913 build() {
            C2S_StonehengeQuery_22913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeQuery_22913 buildPartial() {
            C2S_StonehengeQuery_22913 result = new C2S_StonehengeQuery_22913(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_StonehengeQuery_22913) {
               return this.mergeFrom((C2S_StonehengeQuery_22913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeQuery_22913 other) {
            if (other == StonehengeMsg.C2S_StonehengeQuery_22913.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StonehengeQuery_22913 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeQuery_22913)StonehengeMsg.C2S_StonehengeQuery_22913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeQuery_22913)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
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

   public static final class S2C_StonehengeQuery_22914 extends GeneratedMessageV3 implements S2C_StonehengeQuery_22914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private CommonMsg.HeroInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeQuery_22914 DEFAULT_INSTANCE = new S2C_StonehengeQuery_22914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeQuery_22914> PARSER = new AbstractParser<S2C_StonehengeQuery_22914>() {
         public S2C_StonehengeQuery_22914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeQuery_22914(input, extensionRegistry);
         }
      };

      private S2C_StonehengeQuery_22914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeQuery_22914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeQuery_22914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeQuery_22914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeQuery_22914.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroInfo getInfo() {
         return this.info_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.info_;
      }

      public CommonMsg.HeroInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeQuery_22914)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeQuery_22914 other = (S2C_StonehengeQuery_22914)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeQuery_22914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeQuery_22914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeQuery_22914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeQuery_22914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeQuery_22914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeQuery_22914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeQuery_22914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeQuery_22914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeQuery_22914> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeQuery_22914> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeQuery_22914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeQuery_22914OrBuilder {
         private int bitField0_;
         private CommonMsg.HeroInfo info_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeQuery_22914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeQuery_22914.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeQuery_22914_descriptor;
         }

         public S2C_StonehengeQuery_22914 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeQuery_22914.getDefaultInstance();
         }

         public S2C_StonehengeQuery_22914 build() {
            S2C_StonehengeQuery_22914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeQuery_22914 buildPartial() {
            S2C_StonehengeQuery_22914 result = new S2C_StonehengeQuery_22914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CommonMsg.HeroInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_StonehengeQuery_22914) {
               return this.mergeFrom((S2C_StonehengeQuery_22914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeQuery_22914 other) {
            if (other == StonehengeMsg.S2C_StonehengeQuery_22914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StonehengeQuery_22914 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeQuery_22914)StonehengeMsg.S2C_StonehengeQuery_22914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeQuery_22914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.info_;
            } else {
               return (CommonMsg.HeroInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CommonMsg.HeroInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(CommonMsg.HeroInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.info_ = CommonMsg.HeroInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
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

   public static final class C2S_StonehengeRevive_22915 extends GeneratedMessageV3 implements C2S_StonehengeRevive_22915OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private Internal.IntList heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeRevive_22915 DEFAULT_INSTANCE = new C2S_StonehengeRevive_22915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeRevive_22915> PARSER = new AbstractParser<C2S_StonehengeRevive_22915>() {
         public C2S_StonehengeRevive_22915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeRevive_22915(input, extensionRegistry);
         }
      };

      private C2S_StonehengeRevive_22915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeRevive_22915() {
         this.memoizedIsInitialized = -1;
         this.heroCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeRevive_22915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeRevive_22915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroCode_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCode_.addInt(input.readInt32());
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
                  this.heroCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeRevive_22915.class, Builder.class);
      }

      public List<Integer> getHeroCodeList() {
         return this.heroCode_;
      }

      public int getHeroCodeCount() {
         return this.heroCode_.size();
      }

      public int getHeroCode(int index) {
         return this.heroCode_.getInt(index);
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
         for(int i = 0; i < this.heroCode_.size(); ++i) {
            output.writeInt32(1, this.heroCode_.getInt(i));
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

            for(int i = 0; i < this.heroCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengeRevive_22915)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeRevive_22915 other = (C2S_StonehengeRevive_22915)obj;
            if (!this.getHeroCodeList().equals(other.getHeroCodeList())) {
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
            if (this.getHeroCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengeRevive_22915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRevive_22915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeRevive_22915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRevive_22915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRevive_22915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRevive_22915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeRevive_22915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeRevive_22915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeRevive_22915> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeRevive_22915> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeRevive_22915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeRevive_22915OrBuilder {
         private int bitField0_;
         private Internal.IntList heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeRevive_22915.class, Builder.class);
         }

         private Builder() {
            this.heroCode_ = StonehengeMsg.C2S_StonehengeRevive_22915.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCode_ = StonehengeMsg.C2S_StonehengeRevive_22915.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeRevive_22915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = StonehengeMsg.C2S_StonehengeRevive_22915.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRevive_22915_descriptor;
         }

         public C2S_StonehengeRevive_22915 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeRevive_22915.getDefaultInstance();
         }

         public C2S_StonehengeRevive_22915 build() {
            C2S_StonehengeRevive_22915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeRevive_22915 buildPartial() {
            C2S_StonehengeRevive_22915 result = new C2S_StonehengeRevive_22915(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.heroCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.heroCode_ = this.heroCode_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StonehengeRevive_22915) {
               return this.mergeFrom((C2S_StonehengeRevive_22915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeRevive_22915 other) {
            if (other == StonehengeMsg.C2S_StonehengeRevive_22915.getDefaultInstance()) {
               return this;
            } else {
               if (!other.heroCode_.isEmpty()) {
                  if (this.heroCode_.isEmpty()) {
                     this.heroCode_ = other.heroCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHeroCodeIsMutable();
                     this.heroCode_.addAll(other.heroCode_);
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
            C2S_StonehengeRevive_22915 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeRevive_22915)StonehengeMsg.C2S_StonehengeRevive_22915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeRevive_22915)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroCode_ = StonehengeMsg.C2S_StonehengeRevive_22915.mutableCopy(this.heroCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHeroCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.heroCode_) : this.heroCode_);
         }

         public int getHeroCodeCount() {
            return this.heroCode_.size();
         }

         public int getHeroCode(int index) {
            return this.heroCode_.getInt(index);
         }

         public Builder setHeroCode(int index, int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCode(int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCode(Iterable<? extends Integer> values) {
            this.ensureHeroCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCode_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.heroCode_ = StonehengeMsg.C2S_StonehengeRevive_22915.emptyIntList();
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

   public static final class C2S_StonehengeRank_22916 extends GeneratedMessageV3 implements C2S_StonehengeRank_22916OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeRank_22916 DEFAULT_INSTANCE = new C2S_StonehengeRank_22916();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeRank_22916> PARSER = new AbstractParser<C2S_StonehengeRank_22916>() {
         public C2S_StonehengeRank_22916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeRank_22916(input, extensionRegistry);
         }
      };

      private C2S_StonehengeRank_22916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeRank_22916() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeRank_22916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeRank_22916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeRank_22916.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StonehengeRank_22916)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeRank_22916 other = (C2S_StonehengeRank_22916)obj;
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

      public static C2S_StonehengeRank_22916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRank_22916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRank_22916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRank_22916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRank_22916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeRank_22916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeRank_22916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeRank_22916 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRank_22916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeRank_22916 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRank_22916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeRank_22916 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeRank_22916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeRank_22916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeRank_22916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeRank_22916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeRank_22916> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeRank_22916> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeRank_22916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeRank_22916OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeRank_22916.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeRank_22916.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeRank_22916_descriptor;
         }

         public C2S_StonehengeRank_22916 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeRank_22916.getDefaultInstance();
         }

         public C2S_StonehengeRank_22916 build() {
            C2S_StonehengeRank_22916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeRank_22916 buildPartial() {
            C2S_StonehengeRank_22916 result = new C2S_StonehengeRank_22916(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StonehengeRank_22916) {
               return this.mergeFrom((C2S_StonehengeRank_22916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeRank_22916 other) {
            if (other == StonehengeMsg.C2S_StonehengeRank_22916.getDefaultInstance()) {
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
            C2S_StonehengeRank_22916 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeRank_22916)StonehengeMsg.C2S_StonehengeRank_22916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeRank_22916)e.getUnfinishedMessage();
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

   public static final class S2C_StonehengeRank_22917 extends GeneratedMessageV3 implements S2C_StonehengeRank_22917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 2;
      private List<RankInfo> info_;
      public static final int MYRANK_FIELD_NUMBER = 3;
      private RankInfo myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeRank_22917 DEFAULT_INSTANCE = new S2C_StonehengeRank_22917();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeRank_22917> PARSER = new AbstractParser<S2C_StonehengeRank_22917>() {
         public S2C_StonehengeRank_22917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeRank_22917(input, extensionRegistry);
         }
      };

      private S2C_StonehengeRank_22917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeRank_22917() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeRank_22917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeRank_22917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(StonehengeMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     case 26:
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankInfo)input.readMessage(StonehengeMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeRank_22917.class, Builder.class);
      }

      public List<RankInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends RankInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public RankInfo getInfo(int index) {
         return (RankInfo)this.info_.get(index);
      }

      public RankInfoOrBuilder getInfoOrBuilder(int index) {
         return (RankInfoOrBuilder)this.info_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankInfo getMyRank() {
         return this.myRank_ == null ? StonehengeMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public RankInfoOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? StonehengeMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMyRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getMyRank().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.info_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(3, this.getMyRank());
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
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.info_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getMyRank());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeRank_22917)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeRank_22917 other = (S2C_StonehengeRank_22917)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeRank_22917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeRank_22917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeRank_22917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeRank_22917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeRank_22917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeRank_22917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeRank_22917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeRank_22917 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeRank_22917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeRank_22917 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeRank_22917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeRank_22917 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeRank_22917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeRank_22917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeRank_22917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeRank_22917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeRank_22917> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeRank_22917> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeRank_22917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeRank_22917OrBuilder {
         private int bitField0_;
         private List<RankInfo> info_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infoBuilder_;
         private RankInfo myRank_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeRank_22917.class, Builder.class);
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
            if (StonehengeMsg.S2C_StonehengeRank_22917.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getMyRankFieldBuilder();
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

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeRank_22917_descriptor;
         }

         public S2C_StonehengeRank_22917 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeRank_22917.getDefaultInstance();
         }

         public S2C_StonehengeRank_22917 build() {
            S2C_StonehengeRank_22917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeRank_22917 buildPartial() {
            S2C_StonehengeRank_22917 result = new S2C_StonehengeRank_22917(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankInfo)this.myRankBuilder_.build();
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
            if (other instanceof S2C_StonehengeRank_22917) {
               return this.mergeFrom((S2C_StonehengeRank_22917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeRank_22917 other) {
            if (other == StonehengeMsg.S2C_StonehengeRank_22917.getDefaultInstance()) {
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
                     this.infoBuilder_ = StonehengeMsg.S2C_StonehengeRank_22917.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMyRank()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getMyRank().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StonehengeRank_22917 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeRank_22917)StonehengeMsg.S2C_StonehengeRank_22917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeRank_22917)e.getUnfinishedMessage();
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

         public List<RankInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public RankInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (RankInfo)this.info_.get(index) : (RankInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, RankInfo value) {
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

         public Builder setInfo(int index, RankInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(RankInfo value) {
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

         public Builder addInfo(int index, RankInfo value) {
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

         public Builder addInfo(RankInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, RankInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends RankInfo> values) {
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

         public RankInfo.Builder getInfoBuilder(int index) {
            return (RankInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (RankInfoOrBuilder)this.info_.get(index) : (RankInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public RankInfo.Builder addInfoBuilder() {
            return (RankInfo.Builder)this.getInfoFieldBuilder().addBuilder(StonehengeMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfoBuilder(int index) {
            return (RankInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, StonehengeMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankInfo getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? StonehengeMsg.RankInfo.getDefaultInstance() : this.myRank_;
            } else {
               return (RankInfo)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankInfo value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMyRank(RankInfo.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankInfo value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != StonehengeMsg.RankInfo.getDefaultInstance()) {
                  this.myRank_ = StonehengeMsg.RankInfo.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public RankInfo.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankInfo.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankInfoOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? StonehengeMsg.RankInfo.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int SERVERID_FIELD_NUMBER = 6;
      private int serverId_;
      public static final int HEADFRAME_FIELD_NUMBER = 7;
      private int headFrame_;
      public static final int HARD_FIELD_NUMBER = 8;
      private int hard_;
      public static final int EXPLORE_FIELD_NUMBER = 9;
      private int explore_;
      public static final int TIME_FIELD_NUMBER = 10;
      private int time_;
      private byte memoizedIsInitialized;
      private static final RankInfo DEFAULT_INSTANCE = new RankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankInfo> PARSER = new AbstractParser<RankInfo>() {
         public RankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankInfo(input, extensionRegistry);
         }
      };

      private RankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.name_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.serverId_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.hard_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.explore_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.time_ = input.readInt32();
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 16) != 0;
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

      public boolean hasServerId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasHard() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHard() {
         return this.hard_;
      }

      public boolean hasExplore() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getExplore() {
         return this.explore_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getTime() {
         return this.time_;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExplore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
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
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.serverId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headFrame_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.hard_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.explore_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.time_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.serverId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headFrame_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.hard_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.explore_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankInfo)) {
            return super.equals(obj);
         } else {
            RankInfo other = (RankInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasHard() != other.hasHard()) {
               return false;
            } else if (this.hasHard() && this.getHard() != other.getHard()) {
               return false;
            } else if (this.hasExplore() != other.hasExplore()) {
               return false;
            } else if (this.hasExplore() && this.getExplore() != other.getExplore()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasHard()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHard();
            }

            if (this.hasExplore()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getExplore();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseFrom(CodedInputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankInfo> parser() {
         return PARSER;
      }

      public Parser<RankInfo> getParserForType() {
         return PARSER;
      }

      public RankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int playerId_;
         private int lv_;
         private int head_;
         private Object name_;
         private int serverId_;
         private int headFrame_;
         private int hard_;
         private int explore_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (StonehengeMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.name_ = "";
            this.bitField0_ &= -17;
            this.serverId_ = 0;
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.bitField0_ &= -65;
            this.hard_ = 0;
            this.bitField0_ &= -129;
            this.explore_ = 0;
            this.bitField0_ &= -257;
            this.time_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return StonehengeMsg.RankInfo.getDefaultInstance();
         }

         public RankInfo build() {
            RankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankInfo buildPartial() {
            RankInfo result = new RankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 32) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.hard_ = this.hard_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.explore_ = this.explore_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == StonehengeMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 16;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasHard()) {
                  this.setHard(other.getHard());
               }

               if (other.hasExplore()) {
                  this.setExplore(other.getExplore());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasHard()) {
               return false;
            } else if (!this.hasExplore()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)StonehengeMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankInfo)e.getUnfinishedMessage();
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

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 8;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 16) != 0;
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
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -17;
            this.name_ = StonehengeMsg.RankInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 32;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -33;
            this.serverId_ = 0;
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

         public boolean hasHard() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHard() {
            return this.hard_;
         }

         public Builder setHard(int value) {
            this.bitField0_ |= 128;
            this.hard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHard() {
            this.bitField0_ &= -129;
            this.hard_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExplore() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getExplore() {
            return this.explore_;
         }

         public Builder setExplore(int value) {
            this.bitField0_ |= 256;
            this.explore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExplore() {
            this.bitField0_ &= -257;
            this.explore_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 512;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -513;
            this.time_ = 0;
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

   public static final class S2CR_StonehengeUpdateRank_22918 extends GeneratedMessageV3 implements S2CR_StonehengeUpdateRank_22918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HARD_FIELD_NUMBER = 1;
      private int hard_;
      public static final int EXPLORE_FIELD_NUMBER = 2;
      private int explore_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2CR_StonehengeUpdateRank_22918 DEFAULT_INSTANCE = new S2CR_StonehengeUpdateRank_22918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_StonehengeUpdateRank_22918> PARSER = new AbstractParser<S2CR_StonehengeUpdateRank_22918>() {
         public S2CR_StonehengeUpdateRank_22918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_StonehengeUpdateRank_22918(input, extensionRegistry);
         }
      };

      private S2CR_StonehengeUpdateRank_22918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_StonehengeUpdateRank_22918() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_StonehengeUpdateRank_22918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_StonehengeUpdateRank_22918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hard_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.explore_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.time_ = input.readInt32();
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_StonehengeUpdateRank_22918.class, Builder.class);
      }

      public boolean hasHard() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHard() {
         return this.hard_;
      }

      public boolean hasExplore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getExplore() {
         return this.explore_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHard()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExplore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hard_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.explore_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.time_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hard_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.explore_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_StonehengeUpdateRank_22918)) {
            return super.equals(obj);
         } else {
            S2CR_StonehengeUpdateRank_22918 other = (S2CR_StonehengeUpdateRank_22918)obj;
            if (this.hasHard() != other.hasHard()) {
               return false;
            } else if (this.hasHard() && this.getHard() != other.getHard()) {
               return false;
            } else if (this.hasExplore() != other.hasExplore()) {
               return false;
            } else if (this.hasExplore() && this.getExplore() != other.getExplore()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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
            if (this.hasHard()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHard();
            }

            if (this.hasExplore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExplore();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_StonehengeUpdateRank_22918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(InputStream input) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_StonehengeUpdateRank_22918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_StonehengeUpdateRank_22918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_StonehengeUpdateRank_22918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_StonehengeUpdateRank_22918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_StonehengeUpdateRank_22918> parser() {
         return PARSER;
      }

      public Parser<S2CR_StonehengeUpdateRank_22918> getParserForType() {
         return PARSER;
      }

      public S2CR_StonehengeUpdateRank_22918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_StonehengeUpdateRank_22918OrBuilder {
         private int bitField0_;
         private int hard_;
         private int explore_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_StonehengeUpdateRank_22918.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2CR_StonehengeUpdateRank_22918.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hard_ = 0;
            this.bitField0_ &= -2;
            this.explore_ = 0;
            this.bitField0_ &= -3;
            this.time_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2CR_StonehengeUpdateRank_22918_descriptor;
         }

         public S2CR_StonehengeUpdateRank_22918 getDefaultInstanceForType() {
            return StonehengeMsg.S2CR_StonehengeUpdateRank_22918.getDefaultInstance();
         }

         public S2CR_StonehengeUpdateRank_22918 build() {
            S2CR_StonehengeUpdateRank_22918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_StonehengeUpdateRank_22918 buildPartial() {
            S2CR_StonehengeUpdateRank_22918 result = new S2CR_StonehengeUpdateRank_22918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hard_ = this.hard_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.explore_ = this.explore_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2CR_StonehengeUpdateRank_22918) {
               return this.mergeFrom((S2CR_StonehengeUpdateRank_22918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_StonehengeUpdateRank_22918 other) {
            if (other == StonehengeMsg.S2CR_StonehengeUpdateRank_22918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHard()) {
                  this.setHard(other.getHard());
               }

               if (other.hasExplore()) {
                  this.setExplore(other.getExplore());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHard()) {
               return false;
            } else if (!this.hasExplore()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_StonehengeUpdateRank_22918 parsedMessage = null;

            try {
               parsedMessage = (S2CR_StonehengeUpdateRank_22918)StonehengeMsg.S2CR_StonehengeUpdateRank_22918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_StonehengeUpdateRank_22918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHard() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHard() {
            return this.hard_;
         }

         public Builder setHard(int value) {
            this.bitField0_ |= 1;
            this.hard_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHard() {
            this.bitField0_ &= -2;
            this.hard_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExplore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getExplore() {
            return this.explore_;
         }

         public Builder setExplore(int value) {
            this.bitField0_ |= 2;
            this.explore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExplore() {
            this.bitField0_ &= -3;
            this.explore_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 4;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -5;
            this.time_ = 0;
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

   public static final class C2S_StonehengeEvent_22919 extends GeneratedMessageV3 implements C2S_StonehengeEvent_22919OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int PARAM_FIELD_NUMBER = 2;
      private Internal.IntList param_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeEvent_22919 DEFAULT_INSTANCE = new C2S_StonehengeEvent_22919();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeEvent_22919> PARSER = new AbstractParser<C2S_StonehengeEvent_22919>() {
         public C2S_StonehengeEvent_22919 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeEvent_22919(input, extensionRegistry);
         }
      };

      private C2S_StonehengeEvent_22919(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeEvent_22919() {
         this.memoizedIsInitialized = -1;
         this.param_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeEvent_22919();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeEvent_22919(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.param_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.param_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.param_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.param_.addInt(input.readInt32());
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
                  this.param_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeEvent_22919.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getParamList() {
         return this.param_;
      }

      public int getParamCount() {
         return this.param_.size();
      }

      public int getParam(int index) {
         return this.param_.getInt(index);
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

         for(int i = 0; i < this.param_.size(); ++i) {
            output.writeInt32(2, this.param_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.param_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.param_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getParamList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StonehengeEvent_22919)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeEvent_22919 other = (C2S_StonehengeEvent_22919)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getParamList().equals(other.getParamList())) {
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

            if (this.getParamCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParamList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StonehengeEvent_22919 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeEvent_22919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeEvent_22919 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeEvent_22919 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeEvent_22919 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeEvent_22919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeEvent_22919 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeEvent_22919 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeEvent_22919> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeEvent_22919> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeEvent_22919 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeEvent_22919OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList param_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeEvent_22919.class, Builder.class);
         }

         private Builder() {
            this.param_ = StonehengeMsg.C2S_StonehengeEvent_22919.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.param_ = StonehengeMsg.C2S_StonehengeEvent_22919.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeEvent_22919.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.param_ = StonehengeMsg.C2S_StonehengeEvent_22919.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeEvent_22919_descriptor;
         }

         public C2S_StonehengeEvent_22919 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeEvent_22919.getDefaultInstance();
         }

         public C2S_StonehengeEvent_22919 build() {
            C2S_StonehengeEvent_22919 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeEvent_22919 buildPartial() {
            C2S_StonehengeEvent_22919 result = new C2S_StonehengeEvent_22919(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.param_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.param_ = this.param_;
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
            if (other instanceof C2S_StonehengeEvent_22919) {
               return this.mergeFrom((C2S_StonehengeEvent_22919)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeEvent_22919 other) {
            if (other == StonehengeMsg.C2S_StonehengeEvent_22919.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.param_.isEmpty()) {
                  if (this.param_.isEmpty()) {
                     this.param_ = other.param_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureParamIsMutable();
                     this.param_.addAll(other.param_);
                  }

                  this.onChanged();
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
            C2S_StonehengeEvent_22919 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeEvent_22919)StonehengeMsg.C2S_StonehengeEvent_22919.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeEvent_22919)e.getUnfinishedMessage();
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

         private void ensureParamIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.param_ = StonehengeMsg.C2S_StonehengeEvent_22919.mutableCopy(this.param_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getParamList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.param_) : this.param_);
         }

         public int getParamCount() {
            return this.param_.size();
         }

         public int getParam(int index) {
            return this.param_.getInt(index);
         }

         public Builder setParam(int index, int value) {
            this.ensureParamIsMutable();
            this.param_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addParam(int value) {
            this.ensureParamIsMutable();
            this.param_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllParam(Iterable<? extends Integer> values) {
            this.ensureParamIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.param_);
            this.onChanged();
            return this;
         }

         public Builder clearParam() {
            this.param_ = StonehengeMsg.C2S_StonehengeEvent_22919.emptyIntList();
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

   public static final class S2C_StonehengeEvent_22920 extends GeneratedMessageV3 implements S2C_StonehengeEvent_22920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PASSID_FIELD_NUMBER = 1;
      private Internal.IntList passId_;
      public static final int MOVEID_FIELD_NUMBER = 2;
      private Internal.IntList moveId_;
      public static final int BUFF_FIELD_NUMBER = 3;
      private Internal.IntList buff_;
      public static final int HERO_FIELD_NUMBER = 4;
      private List<StonehengeHero> hero_;
      public static final int ISPASS_FIELD_NUMBER = 5;
      private boolean isPass_;
      private byte memoizedIsInitialized;
      private static final S2C_StonehengeEvent_22920 DEFAULT_INSTANCE = new S2C_StonehengeEvent_22920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StonehengeEvent_22920> PARSER = new AbstractParser<S2C_StonehengeEvent_22920>() {
         public S2C_StonehengeEvent_22920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StonehengeEvent_22920(input, extensionRegistry);
         }
      };

      private S2C_StonehengeEvent_22920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StonehengeEvent_22920() {
         this.memoizedIsInitialized = -1;
         this.passId_ = emptyIntList();
         this.moveId_ = emptyIntList();
         this.buff_ = emptyIntList();
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StonehengeEvent_22920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StonehengeEvent_22920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.passId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.passId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.moveId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.moveId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.moveId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.moveId_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.buff_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.buff_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buff_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buff_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.hero_.add(input.readMessage(StonehengeMsg.StonehengeHero.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        this.bitField0_ |= 1;
                        this.isPass_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.passId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.passId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.moveId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.buff_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeEvent_22920.class, Builder.class);
      }

      public List<Integer> getPassIdList() {
         return this.passId_;
      }

      public int getPassIdCount() {
         return this.passId_.size();
      }

      public int getPassId(int index) {
         return this.passId_.getInt(index);
      }

      public List<Integer> getMoveIdList() {
         return this.moveId_;
      }

      public int getMoveIdCount() {
         return this.moveId_.size();
      }

      public int getMoveId(int index) {
         return this.moveId_.getInt(index);
      }

      public List<Integer> getBuffList() {
         return this.buff_;
      }

      public int getBuffCount() {
         return this.buff_.size();
      }

      public int getBuff(int index) {
         return this.buff_.getInt(index);
      }

      public List<StonehengeHero> getHeroList() {
         return this.hero_;
      }

      public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public StonehengeHero getHero(int index) {
         return (StonehengeHero)this.hero_.get(index);
      }

      public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
         return (StonehengeHeroOrBuilder)this.hero_.get(index);
      }

      public boolean hasIsPass() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsPass() {
         return this.isPass_;
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
         for(int i = 0; i < this.passId_.size(); ++i) {
            output.writeInt32(1, this.passId_.getInt(i));
         }

         for(int i = 0; i < this.moveId_.size(); ++i) {
            output.writeInt32(2, this.moveId_.getInt(i));
         }

         for(int i = 0; i < this.buff_.size(); ++i) {
            output.writeInt32(3, this.buff_.getInt(i));
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.hero_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(5, this.isPass_);
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

            for(int i = 0; i < this.passId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.moveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.moveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMoveIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.buff_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buff_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffList().size();

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.hero_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isPass_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StonehengeEvent_22920)) {
            return super.equals(obj);
         } else {
            S2C_StonehengeEvent_22920 other = (S2C_StonehengeEvent_22920)obj;
            if (!this.getPassIdList().equals(other.getPassIdList())) {
               return false;
            } else if (!this.getMoveIdList().equals(other.getMoveIdList())) {
               return false;
            } else if (!this.getBuffList().equals(other.getBuffList())) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (this.hasIsPass() != other.hasIsPass()) {
               return false;
            } else if (this.hasIsPass() && this.getIsPass() != other.getIsPass()) {
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
            if (this.getPassIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPassIdList().hashCode();
            }

            if (this.getMoveIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveIdList().hashCode();
            }

            if (this.getBuffCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuffList().hashCode();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.hasIsPass()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPass());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StonehengeEvent_22920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StonehengeEvent_22920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(InputStream input) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeEvent_22920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StonehengeEvent_22920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StonehengeEvent_22920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StonehengeEvent_22920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StonehengeEvent_22920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StonehengeEvent_22920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StonehengeEvent_22920> parser() {
         return PARSER;
      }

      public Parser<S2C_StonehengeEvent_22920> getParserForType() {
         return PARSER;
      }

      public S2C_StonehengeEvent_22920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StonehengeEvent_22920OrBuilder {
         private int bitField0_;
         private Internal.IntList passId_;
         private Internal.IntList moveId_;
         private Internal.IntList buff_;
         private List<StonehengeHero> hero_;
         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> heroBuilder_;
         private boolean isPass_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StonehengeEvent_22920.class, Builder.class);
         }

         private Builder() {
            this.passId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.moveId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.buff_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.moveId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.buff_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.S2C_StonehengeEvent_22920.alwaysUseFieldBuilders) {
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.passId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -2;
            this.moveId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -3;
            this.buff_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -5;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.heroBuilder_.clear();
            }

            this.isPass_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_S2C_StonehengeEvent_22920_descriptor;
         }

         public S2C_StonehengeEvent_22920 getDefaultInstanceForType() {
            return StonehengeMsg.S2C_StonehengeEvent_22920.getDefaultInstance();
         }

         public S2C_StonehengeEvent_22920 build() {
            S2C_StonehengeEvent_22920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StonehengeEvent_22920 buildPartial() {
            S2C_StonehengeEvent_22920 result = new S2C_StonehengeEvent_22920(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.passId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.passId_ = this.passId_;
            if ((this.bitField0_ & 2) != 0) {
               this.moveId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.moveId_ = this.moveId_;
            if ((this.bitField0_ & 4) != 0) {
               this.buff_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.buff_ = this.buff_;
            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -9;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isPass_ = this.isPass_;
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
            if (other instanceof S2C_StonehengeEvent_22920) {
               return this.mergeFrom((S2C_StonehengeEvent_22920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StonehengeEvent_22920 other) {
            if (other == StonehengeMsg.S2C_StonehengeEvent_22920.getDefaultInstance()) {
               return this;
            } else {
               if (!other.passId_.isEmpty()) {
                  if (this.passId_.isEmpty()) {
                     this.passId_ = other.passId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePassIdIsMutable();
                     this.passId_.addAll(other.passId_);
                  }

                  this.onChanged();
               }

               if (!other.moveId_.isEmpty()) {
                  if (this.moveId_.isEmpty()) {
                     this.moveId_ = other.moveId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureMoveIdIsMutable();
                     this.moveId_.addAll(other.moveId_);
                  }

                  this.onChanged();
               }

               if (!other.buff_.isEmpty()) {
                  if (this.buff_.isEmpty()) {
                     this.buff_ = other.buff_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBuffIsMutable();
                     this.buff_.addAll(other.buff_);
                  }

                  this.onChanged();
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.heroBuilder_ = StonehengeMsg.S2C_StonehengeEvent_22920.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (other.hasIsPass()) {
                  this.setIsPass(other.getIsPass());
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
            S2C_StonehengeEvent_22920 parsedMessage = null;

            try {
               parsedMessage = (S2C_StonehengeEvent_22920)StonehengeMsg.S2C_StonehengeEvent_22920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StonehengeEvent_22920)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePassIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.passId_ = StonehengeMsg.S2C_StonehengeEvent_22920.mutableCopy(this.passId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPassIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.passId_) : this.passId_);
         }

         public int getPassIdCount() {
            return this.passId_.size();
         }

         public int getPassId(int index) {
            return this.passId_.getInt(index);
         }

         public Builder setPassId(int index, int value) {
            this.ensurePassIdIsMutable();
            this.passId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassId(int value) {
            this.ensurePassIdIsMutable();
            this.passId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassId(Iterable<? extends Integer> values) {
            this.ensurePassIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passId_);
            this.onChanged();
            return this;
         }

         public Builder clearPassId() {
            this.passId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureMoveIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.moveId_ = StonehengeMsg.S2C_StonehengeEvent_22920.mutableCopy(this.moveId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getMoveIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.moveId_) : this.moveId_);
         }

         public int getMoveIdCount() {
            return this.moveId_.size();
         }

         public int getMoveId(int index) {
            return this.moveId_.getInt(index);
         }

         public Builder setMoveId(int index, int value) {
            this.ensureMoveIdIsMutable();
            this.moveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMoveId(int value) {
            this.ensureMoveIdIsMutable();
            this.moveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMoveId(Iterable<? extends Integer> values) {
            this.ensureMoveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.moveId_);
            this.onChanged();
            return this;
         }

         public Builder clearMoveId() {
            this.moveId_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureBuffIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.buff_ = StonehengeMsg.S2C_StonehengeEvent_22920.mutableCopy(this.buff_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBuffList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.buff_) : this.buff_);
         }

         public int getBuffCount() {
            return this.buff_.size();
         }

         public int getBuff(int index) {
            return this.buff_.getInt(index);
         }

         public Builder setBuff(int index, int value) {
            this.ensureBuffIsMutable();
            this.buff_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuff(int value) {
            this.ensureBuffIsMutable();
            this.buff_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuff(Iterable<? extends Integer> values) {
            this.ensureBuffIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buff_);
            this.onChanged();
            return this;
         }

         public Builder clearBuff() {
            this.buff_ = StonehengeMsg.S2C_StonehengeEvent_22920.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 8;
            }

         }

         public List<StonehengeHero> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public StonehengeHero getHero(int index) {
            return this.heroBuilder_ == null ? (StonehengeHero)this.hero_.get(index) : (StonehengeHero)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, StonehengeHero value) {
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

         public Builder setHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(StonehengeHero value) {
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

         public Builder addHero(int index, StonehengeHero value) {
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

         public Builder addHero(StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, StonehengeHero.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends StonehengeHero> values) {
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
               this.bitField0_ &= -9;
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

         public StonehengeHero.Builder getHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public StonehengeHeroOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (StonehengeHeroOrBuilder)this.hero_.get(index) : (StonehengeHeroOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public StonehengeHero.Builder addHeroBuilder() {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public StonehengeHero.Builder addHeroBuilder(int index) {
            return (StonehengeHero.Builder)this.getHeroFieldBuilder().addBuilder(index, StonehengeMsg.StonehengeHero.getDefaultInstance());
         }

         public List<StonehengeHero.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<StonehengeHero, StonehengeHero.Builder, StonehengeHeroOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public boolean hasIsPass() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsPass() {
            return this.isPass_;
         }

         public Builder setIsPass(boolean value) {
            this.bitField0_ |= 16;
            this.isPass_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPass() {
            this.bitField0_ &= -17;
            this.isPass_ = false;
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

   public static final class C2S_StonehengeInRoom_22921 extends GeneratedMessageV3 implements C2S_StonehengeInRoom_22921OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_StonehengeInRoom_22921 DEFAULT_INSTANCE = new C2S_StonehengeInRoom_22921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StonehengeInRoom_22921> PARSER = new AbstractParser<C2S_StonehengeInRoom_22921>() {
         public C2S_StonehengeInRoom_22921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StonehengeInRoom_22921(input, extensionRegistry);
         }
      };

      private C2S_StonehengeInRoom_22921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StonehengeInRoom_22921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StonehengeInRoom_22921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StonehengeInRoom_22921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeInRoom_22921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StonehengeInRoom_22921)) {
            return super.equals(obj);
         } else {
            C2S_StonehengeInRoom_22921 other = (C2S_StonehengeInRoom_22921)obj;
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

      public static C2S_StonehengeInRoom_22921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StonehengeInRoom_22921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(InputStream input) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeInRoom_22921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StonehengeInRoom_22921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StonehengeInRoom_22921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StonehengeInRoom_22921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StonehengeInRoom_22921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StonehengeInRoom_22921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StonehengeInRoom_22921> parser() {
         return PARSER;
      }

      public Parser<C2S_StonehengeInRoom_22921> getParserForType() {
         return PARSER;
      }

      public C2S_StonehengeInRoom_22921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StonehengeInRoom_22921OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StonehengeInRoom_22921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StonehengeMsg.C2S_StonehengeInRoom_22921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StonehengeMsg.internal_static_stonehengeMsg_com_gzbz_protobuf_C2S_StonehengeInRoom_22921_descriptor;
         }

         public C2S_StonehengeInRoom_22921 getDefaultInstanceForType() {
            return StonehengeMsg.C2S_StonehengeInRoom_22921.getDefaultInstance();
         }

         public C2S_StonehengeInRoom_22921 build() {
            C2S_StonehengeInRoom_22921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StonehengeInRoom_22921 buildPartial() {
            C2S_StonehengeInRoom_22921 result = new C2S_StonehengeInRoom_22921(this);
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
            if (other instanceof C2S_StonehengeInRoom_22921) {
               return this.mergeFrom((C2S_StonehengeInRoom_22921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StonehengeInRoom_22921 other) {
            if (other == StonehengeMsg.C2S_StonehengeInRoom_22921.getDefaultInstance()) {
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
            C2S_StonehengeInRoom_22921 parsedMessage = null;

            try {
               parsedMessage = (C2S_StonehengeInRoom_22921)StonehengeMsg.C2S_StonehengeInRoom_22921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StonehengeInRoom_22921)e.getUnfinishedMessage();
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

   public interface C2S_StonehengeChallenge_22903OrBuilder extends MessageOrBuilder {
      boolean hasLevelId();

      int getLevelId();

      boolean hasStatus();

      int getStatus();

      boolean hasType();

      int getType();
   }

   public interface C2S_StonehengeEvent_22919OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getParamList();

      int getParamCount();

      int getParam(int index);
   }

   public interface C2S_StonehengeHero_22911OrBuilder extends MessageOrBuilder {
      List<Integer> getHeroCodeList();

      int getHeroCodeCount();

      int getHeroCode(int index);
   }

   public interface C2S_StonehengeInRoom_22921OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_StonehengeMain_22901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_StonehengePass_22910OrBuilder extends MessageOrBuilder {
      boolean hasStatus();

      boolean getStatus();
   }

   public interface C2S_StonehengeQuery_22913OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_StonehengeRank_22916OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_StonehengeRevive_22915OrBuilder extends MessageOrBuilder {
      List<Integer> getHeroCodeList();

      int getHeroCodeCount();

      int getHeroCode(int index);
   }

   public interface C2S_StonehengeTriggerRoom_22905OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasLv();

      int getLv();

      boolean hasHead();

      int getHead();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasServerId();

      int getServerId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasHard();

      int getHard();

      boolean hasExplore();

      int getExplore();

      boolean hasTime();

      int getTime();
   }

   public interface S2CR_StonehengeUpdateRank_22918OrBuilder extends MessageOrBuilder {
      boolean hasHard();

      int getHard();

      boolean hasExplore();

      int getExplore();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_StonehengeDeBuff_22909OrBuilder extends MessageOrBuilder {
      List<Integer> getBuffIdList();

      int getBuffIdCount();

      int getBuffId(int index);
   }

   public interface S2C_StonehengeEvent_22920OrBuilder extends MessageOrBuilder {
      List<Integer> getPassIdList();

      int getPassIdCount();

      int getPassId(int index);

      List<Integer> getMoveIdList();

      int getMoveIdCount();

      int getMoveId(int index);

      List<Integer> getBuffList();

      int getBuffCount();

      int getBuff(int index);

      List<StonehengeHero> getHeroList();

      StonehengeHero getHero(int index);

      int getHeroCount();

      List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList();

      StonehengeHeroOrBuilder getHeroOrBuilder(int index);

      boolean hasIsPass();

      boolean getIsPass();
   }

   public interface S2C_StonehengeHero_22912OrBuilder extends MessageOrBuilder {
      List<StonehengeHero> getHeroList();

      StonehengeHero getHero(int index);

      int getHeroCount();

      List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList();

      StonehengeHeroOrBuilder getHeroOrBuilder(int index);
   }

   public interface S2C_StonehengeMain_22902OrBuilder extends MessageOrBuilder {
      boolean hasHard();

      int getHard();

      boolean hasMaxHard();

      int getMaxHard();

      List<Integer> getPassIdList();

      int getPassIdCount();

      int getPassId(int index);

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);

      boolean hasIsPass();

      boolean getIsPass();

      List<StonehengeHero> getHeroList();

      StonehengeHero getHero(int index);

      int getHeroCount();

      List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList();

      StonehengeHeroOrBuilder getHeroOrBuilder(int index);

      List<Integer> getBuffList();

      int getBuffCount();

      int getBuff(int index);

      boolean hasTime();

      int getTime();

      List<Integer> getDeBuffList();

      int getDeBuffCount();

      int getDeBuff(int index);

      boolean hasWaitId();

      int getWaitId();

      boolean hasReviveTime();

      int getReviveTime();

      boolean hasType();

      int getType();

      List<Integer> getMoveIdList();

      int getMoveIdCount();

      int getMoveId(int index);

      boolean hasCanSweep();

      boolean getCanSweep();

      boolean hasIsPassNormal();

      boolean getIsPassNormal();

      boolean hasMaxPassHard();

      int getMaxPassHard();
   }

   public interface S2C_StonehengeQuery_22914OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      CommonMsg.HeroInfo getInfo();

      CommonMsg.HeroInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_StonehengeRank_22917OrBuilder extends MessageOrBuilder {
      List<RankInfo> getInfoList();

      RankInfo getInfo(int index);

      int getInfoCount();

      List<? extends RankInfoOrBuilder> getInfoOrBuilderList();

      RankInfoOrBuilder getInfoOrBuilder(int index);

      boolean hasMyRank();

      RankInfo getMyRank();

      RankInfoOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_StonehengeResume_22908OrBuilder extends MessageOrBuilder {
      List<StonehengeHero> getHeroList();

      StonehengeHero getHero(int index);

      int getHeroCount();

      List<? extends StonehengeHeroOrBuilder> getHeroOrBuilderList();

      StonehengeHeroOrBuilder getHeroOrBuilder(int index);

      boolean hasReviveTime();

      int getReviveTime();
   }

   public interface S2C_StonehengeTriggerRoom_22906OrBuilder extends MessageOrBuilder {
      boolean hasBattleData();

      StonehengeBattleData getBattleData();

      StonehengeBattleDataOrBuilder getBattleDataOrBuilder();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);

      List<Integer> getBuffIdList();

      int getBuffIdCount();

      int getBuffId(int index);

      List<Integer> getResumeIdList();

      int getResumeIdCount();

      int getResumeId(int index);
   }

   public interface StonehengeBattleDataOrBuilder extends MessageOrBuilder {
      boolean hasFightId();

      int getFightId();

      List<StonehengeHero> getMyHero1List();

      StonehengeHero getMyHero1(int index);

      int getMyHero1Count();

      List<? extends StonehengeHeroOrBuilder> getMyHero1OrBuilderList();

      StonehengeHeroOrBuilder getMyHero1OrBuilder(int index);

      List<StonehengeHero> getMyHero2List();

      StonehengeHero getMyHero2(int index);

      int getMyHero2Count();

      List<? extends StonehengeHeroOrBuilder> getMyHero2OrBuilderList();

      StonehengeHeroOrBuilder getMyHero2OrBuilder(int index);

      List<StonehengeHero> getEnemy1List();

      StonehengeHero getEnemy1(int index);

      int getEnemy1Count();

      List<? extends StonehengeHeroOrBuilder> getEnemy1OrBuilderList();

      StonehengeHeroOrBuilder getEnemy1OrBuilder(int index);

      List<StonehengeHero> getEnemy2List();

      StonehengeHero getEnemy2(int index);

      int getEnemy2Count();

      List<? extends StonehengeHeroOrBuilder> getEnemy2OrBuilderList();

      StonehengeHeroOrBuilder getEnemy2OrBuilder(int index);
   }

   public interface StonehengeHeroOrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasHpPercent();

      int getHpPercent();

      boolean hasPower();

      long getPower();

      boolean hasPos();

      int getPos();
   }
}
